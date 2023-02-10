package org.raninline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;

public class Parser {

    /**
     * Instrument the Java source file so that when tests execute, the
     * added instrumentations can generate inline tests with variable
     * values in target statements.
     *
     * @param srcPath
     * @param lineNumberStr
     * @param logFilePath
     * @param inlineTestFilePath
     * @throws IOException
     */
    public static void instrument(String srcPath, String lineNumberStr, String logFilePath, String inlineTestFilePath, String classesDirectory)
            throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Paths.get(srcPath));
        Context ctx = new Context();
        int lineNumber = Utils.parseLineNumber(lineNumberStr);
        // if line number is <= 0, then instrument the whole file
        if (lineNumber > 0) {
            ctx.lineNumberKnown = true;
        }
        // make the folder for the log file
        new File(logFilePath).getParentFile().mkdirs();
        ctx.logPath = logFilePath;
        ctx.inlineTestPath = inlineTestFilePath;
        ctx.lineNumber = lineNumber;
        ctx.srcPath = srcPath;
        ctx.classesDirectory = classesDirectory;
        LogLocalVariable visitor = new LogLocalVariable();
        cu = (CompilationUnit) cu.accept(visitor, ctx);
        FileWriter writer;
        writer = new FileWriter(srcPath);
        writer.write(cu.toString());
        writer.close();
    }

    public static void changeModifier(String srcPath, String lineNumberStr) throws IOException {
        int lineNumber = Utils.parseLineNumber(lineNumberStr);
        if (lineNumber <= 0) {
            System.err.println("Invalid line number: " + lineNumberStr);
            return;
        }
        CompilationUnit cu = StaticJavaParser.parse(Paths.get(srcPath));
        Context ctx = new Context();
        ctx.lineNumber = lineNumber;
        ctx.srcPath = srcPath;
        ChangeModifier visitor = new ChangeModifier();
        cu = (CompilationUnit) cu.accept(visitor, ctx);
        FileWriter writer;
        writer = new FileWriter(srcPath);
        writer.write(cu.toString());
        writer.close();
    }

    /**
     * Add parsed inline tests (from log file) to the Java source file
     * 
     * @param logFilePath
     * @param lineNumberStr
     * @param filePathFromInput
     * @throws IOException
     */
    public static void addInlineTest(String logFilePath, String lineNumberStr, String filePathFromInput) throws IOException {
        boolean lineNumberKnown = false;
        int lineNumberFromInput = Utils.parseLineNumber(lineNumberStr);
        if (lineNumberFromInput > 0) {
            lineNumberKnown = true;
        }
        FileReader reader = new FileReader(logFilePath);
        Map<String, Map<Integer, Set<String>>> inlineTestMap = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(";");
                if (tokens.length < 3) {
                    Log.debug("cannot be splitted" + line);
                    continue;
                }
                String srcPath = tokens[0];
                int lineNumber;
                try {
                lineNumber = Integer.parseInt(tokens[1]);
                } catch (NumberFormatException e) {
                    System.out.println("cannot be parsed: " + line);
                    continue;
                }
                StringBuilder inlineTestSB = new StringBuilder();
                for (int i = 2; i < tokens.length; i++) {
                    inlineTestSB.append(tokens[i]);
                    inlineTestSB.append(";");
                }
                String inlineTestStr = inlineTestSB.toString();
                if (!inlineTestMap.containsKey(srcPath)) {
                    inlineTestMap.put(srcPath, new HashMap<>());
                }
                Map<Integer, Set<String>> lineMap = inlineTestMap.get(srcPath);
                if (!lineMap.containsKey(lineNumber)) {
                    lineMap.put(lineNumber, new HashSet<>());
                }
                lineMap.get(lineNumber).add(inlineTestStr);
            }
        }
        Context ctx = new Context();
        for (String srcPath : inlineTestMap.keySet()) {
            if (lineNumberKnown && !srcPath.equals(filePathFromInput)) {
                continue;
            }
            Map<Integer, Set<String>> lineMap = inlineTestMap.get(srcPath);
            if (lineNumberKnown) {
                Set<String> inlineTests = lineMap.get(lineNumberFromInput);
                if (inlineTests == null) {
                    continue;
                }
                ctx.inlineTests = new HashMap<>();
                ctx.inlineTests.put(lineNumberFromInput, inlineTests);
            } else {
                ctx.inlineTests = lineMap;
            }
            constructInlineTestHelper(srcPath, ctx);
        }
    }

    /**
     * Parse the raninline log file and insert the set of inline tests into Java
     * file.
     * 
     * @param srcPath
     * @param lineNumberStr
     * @param logFilePath
     * @throws IOException
     */
    public static void constructInlineTest(String srcPath, String lineNumberStr, String logFilePath)
            throws IOException {
        // add inline tests to source code
        Context ctx = new Context();
        int lineNumber = Utils.parseLineNumber(lineNumberStr);
        if (lineNumber > 0) {
            ctx.lineNumberKnown = true;
        }
        ctx.lineNumber = lineNumber;
        ctx.srcPath = srcPath;
        parseLog(logFilePath, ctx);
        constructInlineTestHelper(srcPath, ctx);
    }

    public static void constructInlineTestHelper(String srcPath, Context ctx) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Paths.get(srcPath));
        InlineTestConstructor visitor = new InlineTestConstructor();
        cu = (CompilationUnit) cu.accept(visitor, ctx);
        if (ctx.inlineTests.size() > 0) {
            // check if there is import of Here
            boolean importHere = false;
            NodeList<ImportDeclaration> importDeclarations = cu.getImports();
            for (ImportDeclaration importDeclaration : importDeclarations) {
                if (importDeclaration.getNameAsString().equals("import org.inlinetest.Here")) {
                    importHere = true;
                    break;
                }
            }
            if (!importHere) {
                cu.addImport("org.inlinetest.Here");
                cu.addImport("org.inlinetest.Here.group", true, false);
            }
        }
        FileWriter writer;
        writer = new FileWriter(srcPath);
        writer.write(cu.toString());
        writer.close();
    }

    /**
     * parse log File to get inline tests
     * 
     * @param logFilePath
     * @return
     * @throws IOException
     */
    public static void parseLog(String logFilePath, Context ctx) throws IOException {
        FileReader reader = new FileReader(logFilePath);
        final String RANDOOP = "Randoop";
        final String JUNIT = "Unit";
        String source = RANDOOP;
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.equals(JUNIT)) {
                    source = JUNIT;
                } else if (line.equals(RANDOOP)) {
                    source = RANDOOP;
                }

                if (line.startsWith(Constant.TARGET_STMT_START)
                        || line.startsWith(Constant.TARGET_STMT_IF_START)) {
                    if (!line.split(Constant.LOG_SEPARATOR)[1].equals(ctx.srcPath)) {
                        line = bufferedReader.readLine();
                        continue;
                    }
                    if (!ctx.lineNumberKnown) {
                        ctx.lineNumber = Utils.parseLineNumber(line.split(Constant.LOG_SEPARATOR)[2]);
                    }
                    if (ctx.inlineTests.containsKey(ctx.lineNumber)
                            && ctx.inlineTests.get(ctx.lineNumber).size() >= 10) {
                        break;
                    }
                    List<String> given = new ArrayList<>();
                    List<String> checkEq = new ArrayList<>();
                    List<String> checkTrue = new ArrayList<>();
                    boolean ifCondition = false;
                    if (line.startsWith(Constant.TARGET_STMT_IF_START)) {
                        ifCondition = true;
                    }
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.startsWith(Constant.TARGET_METHOD_BEFORE)) {
                            continue;
                        }
                        if (line.startsWith(Constant.TARGET_STMT_BEFORE)
                                || line.startsWith(Constant.TARGET_STMT_AFTER)) {
                            String type = line.split(Constant.LOG_SEPARATOR, 6)[3];
                            String name = line.split(Constant.LOG_SEPARATOR, 6)[4];
                            String value = line.split(Constant.LOG_SEPARATOR, 6)[5];
                            if (Constant.PRIMITIVE_TYPES.contains(type)) {
                                if (type.equals("String")) {
                                    value = "\"" + value + "\"";
                                } else if (type.equals("char")) {
                                    value = "'" + value + "'";
                                } else if (type.equals("long")) {
                                    value = value + "L";
                                } else if (type.contains("[]")) {
                                    value = parseSerializedValue(type, value);
                                }
                            } else {
                                // TODO: handle non-primitive types in the future
                                break;
                            }
                            if (line.startsWith(Constant.TARGET_STMT_BEFORE)) {
                                given.add("given(" + name + ", " + value + ")");
                            } else {
                                checkEq.add("checkEq(" + name + ", " + value + ")");
                            }
                        } else if (line.startsWith(Constant.TARGET_STMT_EXECUTED)) {
                            checkTrue.add("checkTrue(" + "group(" + ")" + ")");
                        } else {
                            break;
                        }
                    }
                    if (checkEq.size() > 0 || checkTrue.size() > 0) {
                        String inlineTestStr = "new Here(\"" + source + "\")";
                        for (String g : given) {
                            inlineTestStr += "." + g;
                        }
                        for (String c : checkEq) {
                            inlineTestStr += "." + c;
                        }
                        for (String c : checkTrue) {
                            inlineTestStr += "." + c;
                        }
                        if (ifCondition && checkTrue.isEmpty()) {
                            inlineTestStr += ".checkFalse(" + "group(" + ")" + ")";
                        }
                        inlineTestStr += ";";
                        Set<String> inlineTestSet = ctx.inlineTests.getOrDefault(ctx.lineNumber, new HashSet<String>());
                        inlineTestSet.add(inlineTestStr);
                        ctx.inlineTests.put(ctx.lineNumber, inlineTestSet);
                    }
                } else {
                    line = bufferedReader.readLine();
                }
            }
        }
    }

    /**
     * Parse the serialized value of array to a string.
     * e.g. [1, 2, 3] -> new int[]{1, 2, 3}
     * 
     * @param value
     * @return
     */
    public static String parseSerializedValue(String type, String value) {
        String[] array = value.substring(1, value.length() - 1).split(",");
        String res = "new " + type + " {";
        for (int i = 0; i < array.length; i++) {
            if (type.equals("String[]")) {
                res += "\"" + array[i].replaceAll("^\\s+|\\s+$", "") + "\"";
            } else if (type.equals("char[]")) {
                res += "'" + array[i].replaceAll("^\\s+|\\s+$", "") + "'";
            } else {
                res += array[i].replaceAll("^\\s+|\\s+$", "");
            }
            if (i != array.length - 1) {
                res += ",";
            }
        }
        res += "}";
        return res;
    }
}