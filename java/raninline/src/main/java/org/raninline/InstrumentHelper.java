package org.raninline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jacoco.agent.rt.IAgent;
import org.jacoco.agent.rt.RT;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.tools.ExecFileLoader;

import com.thoughtworks.xstream.XStream;

public class InstrumentHelper {
    static boolean init = false; // init only once
    static Map<String, Integer> srcLineNoCounter = new HashMap<String, Integer>(); // srcPath + lineNo -> counter
    static List<InlineTest> inlineTests = new ArrayList<InlineTest>();
    static Map<String, Integer> allSrcLineNoCounter = new HashMap<String, Integer>();
    static List<InlineTest> allInlineTests = new ArrayList<InlineTest>();
    static Map<String, CoverageBuilder> classLineNoToCoverageBefore = new HashMap<String, CoverageBuilder>();
    static Map<String, CoverageBuilder> classLineNoToCoverageAfter = new HashMap<String, CoverageBuilder>();
    static Map<String, Set<String>> classLineNoToCovered = new HashMap<String, Set<String>>(); // class + lineNo ->
                                                                                               // covered lineNos
    static String inlineGenDir;
    static String serializedDataDir;
    static Map<String, String> serializedDataToFilePathMap = new HashMap<String, String>(); // serialized data hash code
                                                                                            // -> file path
    static Map<Integer, InlineTest> targetStmtLineNoToCurInlineTestMap = new HashMap<Integer, InlineTest>();
    // static InlineTest curInlineTest;
    static int totalInlineTests = 0;
    static {
        Runtime.getRuntime().addShutdownHook(new TearDown());
    }

    // cd src/test/resources
    // javac -cp
    // /home/liuyu/projects/inlinegen-research/java/raninline/target/classes A.java
    // java -cp
    // /home/liuyu/projects/inlinegen-research/java/raninline/target/classes:. A
    public static String parseVarType(Object variable) {
        String varType = "";
        Class<?> clz = null;
        if (variable == null) {
            varType = "null";
        } else {
            clz = variable.getClass();
            switch (clz.getName()) {
                case "java.lang.Boolean":
                    varType = "boolean";
                    break;
                case "java.lang.Byte":
                    varType = "byte";
                    break;
                case "java.lang.Character":
                    varType = "char";
                    break;
                case "java.lang.Short":
                    varType = "short";
                    break;
                case "java.lang.Integer":
                    varType = "int";
                    break;
                case "java.lang.Long":
                    varType = "long";
                    break;
                case "java.lang.Float":
                    varType = "float";
                    break;
                case "java.lang.Double":
                    varType = "double";
                    break;
                case "java.lang.String":
                    varType = "String";
                    variable = Utils.escapeString((String) variable);
                    break;
                default:
                    varType = variable.getClass().getSimpleName();
                    break;
            }
        }
        return varType;
    }

    public static String parseValue(String varType, Object variable) {
        if (variable == null) {
            return "null";
        }
        String value = "";
        if (Constant.PRIMITIVE_TYPES.contains(varType)) {
            if (varType.endsWith("[]")) {
                value += "new " + varType + " {";
                String arrayVal = parseArrayValue(varType, variable);
                value += arrayVal.substring(1, arrayVal.length() - 1);
                value += "}";
            } else {
                if (varType.equals("String")) {
                    value = "\"" + Utils.escapeString((String) variable) + "\"";
                } else if (varType.equals("char")) {
                    value = "'" + variable + "'";
                } else if (varType.equals("long")) {
                    value = variable + "L";
                } else {
                    value = variable.toString();
                }
            }
        } else {
            try {
                // It is possbile that some xml files are saved but not used in any inline tests
                // because the unit tests throw exceptions. The target statement is not fully
                // executed. We choose to save all xml files and delete the unused ones later
                // (in another script).
                XStream xstream = new XStream();
                String serializedString = xstream.toXML(variable);
                String serializedStringHashCode = Integer.toString(serializedString.hashCode());
                // check if the serialized data has been seen before
                if (serializedDataToFilePathMap.containsKey(serializedStringHashCode)) {
                    return serializedDataToFilePathMap.get(serializedStringHashCode);
                }
                // String xmlFileName = varType + serializedDataToFilePathMap.size() + ".xml";
                String xmlFileName = serializedDataToFilePathMap.size() + ".xml";
                String filePath = serializedDataDir + "/" + xmlFileName;
                String escapedFilePath = "\"" + Utils.escapeString(xmlFileName) + "\"";
                serializedDataToFilePathMap.put(serializedStringHashCode, escapedFilePath);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(serializedString);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                // return the file path
                return escapedFilePath;
            } catch (Exception e) {
                throw new RuntimeException("Failed to serialize variable: " + variable, e);
            }
        }
        return value;
    }

    public static String parseArrayValue(String varType, Object variable) {
        String arrayVal = "";
        if (varType.equals("boolean[]")) {
            arrayVal = java.util.Arrays.toString((boolean[]) variable);
        } else if (varType.equals("byte[]")) {
            arrayVal = java.util.Arrays.toString((byte[]) variable);
        } else if (varType.equals("char[]")) {
            arrayVal += "[";
            for (int i = 0; i < ((char[]) variable).length; i++) {
                arrayVal += parseValue("char", ((char[]) variable)[i]);
                if (i < ((char[]) variable).length - 1) {
                    arrayVal += ", ";
                }
            }
            arrayVal += "]";
        } else if (varType.equals("short[]")) {
            arrayVal = java.util.Arrays.toString((short[]) variable);
        } else if (varType.equals("int[]")) {
            arrayVal = java.util.Arrays.toString((int[]) variable);
        } else if (varType.equals("long[]")) {
            arrayVal += "[";
            for (int i = 0; i < ((long[]) variable).length; i++) {
                arrayVal += parseValue("long", ((long[]) variable)[i]);
                if (i < ((long[]) variable).length - 1) {
                    arrayVal += ", ";
                }
            }
            arrayVal += "]";
        } else if (varType.equals("float[]")) {
            arrayVal = java.util.Arrays.toString((float[]) variable);
        } else if (varType.equals("double[]")) {
            arrayVal = java.util.Arrays.toString((double[]) variable);
        } else if (varType.equals("String[]")) {
            arrayVal += "[";
            for (int i = 0; i < ((String[]) variable).length; i++) {
                arrayVal += parseValue("String", ((String[]) variable)[i]);
                if (i < ((String[]) variable).length - 1) {
                    arrayVal += ", ";
                }
            }
            arrayVal += "]";
        } else {
            arrayVal += "[";
            for (int i = 0; i < ((Object[]) variable).length; i++) {
                arrayVal += parseValue(varType.substring(0, varType.length() - 2), ((Object[]) variable)[i]);
                if (i < ((Object[]) variable).length - 1) {
                    arrayVal += ", ";
                }
            }
            arrayVal += "]";
        }
        return arrayVal;
    }

    /**
     * Log variable value, replaced by
     * {@link #logVariableAndGenerateTest(String, String, String, int, Object, String, Class, String)}
     * 
     * @param info
     * @param logPath
     * @param srcPath
     * @param targetStmtNum
     * @param variable
     * @param variableName
     */
    @Deprecated
    public static void logVariable(String info, String logPath, String srcPath, int targetStmtNum, Object variable,
            String variableName) {
        try {
            FileWriter writer = new FileWriter(logPath, true);
            String varType = parseVarType(variable);
            // TODO: recurvisely to String
            if (varType.equals("null")) {
                variable = "null";
            } else if (varType.endsWith("[]")) {
                variable = parseArrayValue(varType, variable);
            }
            writer.write(info + Constant.LOG_SEPARATOR + srcPath + Constant.LOG_SEPARATOR + targetStmtNum
                    + Constant.LOG_SEPARATOR + varType + Constant.LOG_SEPARATOR + variableName + Constant.LOG_SEPARATOR
                    + variable + "\n");
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Log variable value, replaced by
     * {@link #logVariableAndGenerateTest(String, String, String, int, Object, String, Class, String)}
     * 
     * @param info
     * @param logPath
     * @param srcPath
     * @param targetStmtNum
     */
    @Deprecated
    public static void logVariable(String info, String logPath, String srcPath, int targetStmtNum) {
        try {
            FileWriter writer = new FileWriter(logPath, true);
            writer.write(info + Constant.LOG_SEPARATOR + srcPath + Constant.LOG_SEPARATOR + targetStmtNum + "\n");
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * A helper method used by {@link #canAddInlineTest(int, String, String)} to
     * check if the coverage rate increases
     * 
     * @param oldCC
     * @param newCC
     * @param key
     * @return
     */
    public static boolean isCovered(IClassCoverage oldCC, IClassCoverage newCC, String key) {
        boolean changed = false;
        for (int i = newCC.getFirstLine(); i <= newCC.getLastLine(); i++) {
            int status = newCC.getLine(i).getStatus();
            // Log.debug(key + ", class: " + newCC.getName() + ", line: " + i + ", status: "
            // + status);
            if ((status == ICounter.FULLY_COVERED
                    && (oldCC == null || oldCC.getLine(i).getStatus() == ICounter.NOT_COVERED
                            || oldCC.getLine(i).getStatus() == ICounter.PARTLY_COVERED))
                    || (status == ICounter.PARTLY_COVERED
                            && (oldCC == null || oldCC.getLine(i).getStatus() == ICounter.NOT_COVERED))) {
                if (classLineNoToCovered.get(key).contains(newCC.getName() + i)) {
                    continue;
                } else {
                    classLineNoToCovered.get(key).add(newCC.getName() + i);
                    changed = true;
                }
            }
        }
        return changed;
    }

    public static boolean coverageChanged(CoverageBuilder oldCoverageBuilder, CoverageBuilder newCoverageBuilder,
            String key) {
        boolean changed = false;
        for (final IClassCoverage cc : newCoverageBuilder.getClasses()) {
            // Log.debug("class coverage: " + cc.getName() + ", " +
            // cc.getInstructionCounter().getCoveredCount());
            if (cc.getInstructionCounter().getCoveredCount() == 0) {
                continue;
            } else {
                IClassCoverage oldCC = oldCoverageBuilder.getClasses().stream()
                        .filter(i -> i.getName().equals(cc.getName()))
                        .findFirst().orElse(null);
                changed = isCovered(oldCC, cc, key) || changed;
            }
        }
        return changed;
    }

    /**
     * Check if the inline test can be added
     * 
     * @param lineNumber
     * @param clazzName,       string should be like "com.example.Example"
     * @param classesDirectory
     * @return
     */
    public static boolean canAddInlineTest(int lineNumber, String clazzName, String classesDirectory) {
        // This is the increased coverage rate after executing the target statement
        String key = clazzName + lineNumber;
        CoverageBuilder oldCoverageBuilder = classLineNoToCoverageBefore.get(key);
        CoverageBuilder newCoverageBuilder = classLineNoToCoverageAfter.get(key);
        if (newCoverageBuilder == null || oldCoverageBuilder == null) {
            return false;
        }

        if (!classLineNoToCovered.containsKey(key)) {
            classLineNoToCovered.put(key, new HashSet<String>());
        }

        // coverage rate of target statment itself
        boolean stmtChanged = coverageChanged(oldCoverageBuilder, newCoverageBuilder, key);

        // coverage rate of context
        CoverageBuilder currentCoverageBuilder = getCoverageRateFromAllClasses(lineNumber, classesDirectory);
        boolean contextChanged = coverageChanged(newCoverageBuilder, currentCoverageBuilder, key);
        return stmtChanged || contextChanged;
    }

    /**
     * Get the coverage rate of all classes before executing the target statement
     * 
     * @param lineNumber
     * @param clazzName
     * @param clazzDirectory
     */
    public static void addCoverageRateBefore(int lineNumber, String clazzName, String clazzDirectory) {
        CoverageBuilder coverageBuilder = getCoverageRateFromAllClasses(lineNumber, clazzDirectory);
        if (coverageBuilder == null) {
            return;
        }
        classLineNoToCoverageBefore.put(clazzName + lineNumber, coverageBuilder);
    }

    /**
     * Get the coverage rate of all classes after executing the target statement
     * 
     * @param lineNumber
     * @param clazzName
     * @param clazzDirectory
     */
    public static void addCoverageRateAfter(int lineNumber, String clazzName, String clazzDirectory) {
        CoverageBuilder coverageBuilder = getCoverageRateFromAllClasses(lineNumber, clazzDirectory);
        if (coverageBuilder == null) {
            return;
        }
        classLineNoToCoverageAfter.put(clazzName + lineNumber, coverageBuilder);
    }

    /**
     * Get the coverage rate of all classes
     * 
     * @param lineNumber
     * @param classesDirectory
     * @return
     */
    public static CoverageBuilder getCoverageRateFromAllClasses(int lineNumber, String classesDirectory) {
        try {
            IAgent agent = RT.getAgent();
            byte[] executionData = agent.getExecutionData(false);
            ExecFileLoader execFileLoader = new ExecFileLoader();
            execFileLoader.load(new ByteArrayInputStream(executionData));
            CoverageBuilder coverageBuilder = new CoverageBuilder();
            Analyzer analyzer = new Analyzer(execFileLoader.getExecutionDataStore(), coverageBuilder);
            File classesDirectoryFile = new File(classesDirectory);
            if (!classesDirectoryFile.exists()) {
                throw new RuntimeException("Classes directory does not exist: " + classesDirectory);
            }
            analyzer.analyzeAll(classesDirectoryFile);
            // analyze org.raninline.IT_String
            analyzer.analyzeAll(
                    InstrumentHelper.class.getClassLoader().getResourceAsStream("org/raninline/IT_String.class"),
                    "org.raninline.IT_String");
            analyzer.analyzeAll(
                    InstrumentHelper.class.getClassLoader().getResourceAsStream("org/raninline/IT_Matcher.class"),
                    "org.raninline.IT_Matcher");
            // String jdkPath = System.getProperty("java.home") + File.separator + "lib" +
            // File.separator + "rt.jar";
            // analyzer.analyzeAll(new FileInputStream(jdkPath), jdkPath);
            return coverageBuilder;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the coverage rate of a specific class
     * 
     * @param lineNumber
     * @param clazzName
     * @return
     */
    @Deprecated
    public static CoverageBuilder getCoverageRateFromClass(int lineNumber, String clazzName) {
        try {
            IAgent agent = RT.getAgent();
            byte[] executionData = agent.getExecutionData(false);
            ExecFileLoader execFileLoader = new ExecFileLoader();
            execFileLoader.load(new ByteArrayInputStream(executionData));
            CoverageBuilder coverageBuilder = new CoverageBuilder();
            Analyzer analyzer = new Analyzer(execFileLoader.getExecutionDataStore(), coverageBuilder);
            InputStream original = getTargetClass(clazzName);
            if (original != null) {
                analyzer.analyzeClass(original, clazzName);
                return coverageBuilder;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static InputStream getTargetClass(String clazzName) {
        Class clazz;
        try {
            clazz = Class.forName(clazzName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        final String resource = '/' + clazzName.replace('.', '/') + ".class";
        return clazz.getResourceAsStream(resource);
    }

    /**
     * Add an inline test to the list of inline tests.
     * 
     * @param targetStmtLineNo
     * @param clazzName
     * @param classesDirectory
     */
    public static void addInlineTest(int targetStmtLineNo, String clazzName, String classesDirectory) {
        if (!targetStmtLineNoToCurInlineTestMap.containsKey(targetStmtLineNo)) {
            return;
        }
        InlineTest curInlineTest = targetStmtLineNoToCurInlineTestMap.get(targetStmtLineNo);
        if (curInlineTest == null) {
            return;
        }
        // skip the inline test if it does not have an assertion
        if (curInlineTest.assertions.size() == 0) {
            Log.info("Skip inline test because it does not have an assertion: " + curInlineTest);
            return;
        }
        if (curInlineTest.toString().length() > Constant.MAX_INLINE_TEST_LENGTH) {
            Log.info("Skip inline test because it is too long: " + curInlineTest);
            return;
        }
        String key = curInlineTest.srcPath + ":" + curInlineTest.targetStmtLineNo;

        totalInlineTests++;

        if (!inlineTests.contains(curInlineTest)) {
            if (canAddInlineTest(targetStmtLineNo, clazzName, classesDirectory)) {
                saveReducedInlineTest(curInlineTest);
                int counter = srcLineNoCounter.getOrDefault(key, 0);
                srcLineNoCounter.put(key, counter + 1);
            }
        }

        if (!allInlineTests.contains(curInlineTest)) {
            int allCounter = allSrcLineNoCounter.getOrDefault(key, 0);
            saveAllInlineTest(curInlineTest);
            allSrcLineNoCounter.put(key, allCounter + 1);
        }
    }

    public static void saveReducedInlineTest(InlineTest curInlineTest) {
        inlineTests.add(curInlineTest);
        // save inline tests to file
        saveInlineTestToFile(curInlineTest, Constant.inlineTestFilePath);
    }

    public static void saveAllInlineTest(InlineTest curInlineTest) {
        allInlineTests.add(curInlineTest);
        // save all inline tests to file
        saveInlineTestToFile(curInlineTest, Constant.allInlineTestFilePath);
    }

    /**
     * Invoked by the instrumented code to log a variable.
     * 
     * @param info
     * @param logPath
     * @param srcPath
     * @param targetStmtNum
     * @param variable
     * @param variableName
     * @param clazz
     * @param classesDirectory
     */
    public static void logVariableAndGenerateTest(String info, String logPath, String inlineTestPath, String srcPath,
            int targetStmtNum,
            Object variable, String variableName, Class clazz, String classesDirectory) {
        if (!init) {
            init = true;
            Constant.logFilePath = logPath;
            Constant.inlineTestFilePath = inlineTestPath;
            Constant.allInlineTestFilePath = inlineTestPath.replace(".txt", "-all.txt");
            init();
        }
        String key = srcPath + ":" + targetStmtNum;
        int counter = srcLineNoCounter.getOrDefault(key, 0);
        int allCounter = allSrcLineNoCounter.getOrDefault(key, 0);
        if (counter > Constant.MAX_INLINE_TESTS_PER_STMT || allCounter > Constant.MAX_INLINE_TESTS_PER_STMT) {
            return;
        }
        if (info.equals(Constant.TARGET_STMT_START) || info.equals(Constant.TARGET_STMT_IF_START)) {
            // initialize a new inline test
            InlineTest curInlineTest = new InlineTest();
            curInlineTest.targetStmtLineNo = targetStmtNum;
            curInlineTest.testName = Constant.inlineTestName;
            curInlineTest.srcPath = srcPath;
            curInlineTest.clazzName = clazz.getName();
            targetStmtLineNoToCurInlineTestMap.put(targetStmtNum, curInlineTest);
            addCoverageRateBefore(targetStmtNum, clazz.getName(), classesDirectory);
        } else if (info.equals(Constant.TARGET_STMT_BEFORE)) {
            // add given statement
            String varType = parseVarType(variable);
            String varValue = parseValue(varType, variable);
            String givenStmt = Constant.GIVEN + "(" + variableName + "," + varValue + ")";
            if (targetStmtLineNoToCurInlineTestMap.containsKey(targetStmtNum)) {
                InlineTest curInlineTest = targetStmtLineNoToCurInlineTestMap.get(targetStmtNum);
                curInlineTest.givens.add(givenStmt);
            }
        } else if (info.equals(Constant.TARGET_STMT_AFTER)) {
            // add assertion statement for statement
            String varType = parseVarType(variable);
            String varValue = parseValue(varType, variable);
            String checkStmt = Constant.CHECK_EQ + "(" + variableName + "," + varValue + ")";
            if (targetStmtLineNoToCurInlineTestMap.containsKey(targetStmtNum)) {
                InlineTest curInlineTest = targetStmtLineNoToCurInlineTestMap.get(targetStmtNum);
                curInlineTest.assertions.add(checkStmt);
            }
        } else if (info.equals(Constant.TARGET_STMT_EXECUTED) || info.equals(Constant.TARGET_STMT_NOT_EXECUTED)) {
            // add assertion statement for if condition
            String checkStmt;
            if (info.equals(Constant.TARGET_STMT_EXECUTED)) {
                checkStmt = Constant.CHECK_TRUE + "(" + Constant.GROUP + "())";
            } else {
                checkStmt = Constant.CHECK_FALSE + "(" + Constant.GROUP + "())";
            }
            if (targetStmtLineNoToCurInlineTestMap.containsKey(targetStmtNum)) {
                InlineTest curInlineTest = targetStmtLineNoToCurInlineTestMap.get(targetStmtNum);
                curInlineTest.assertions.add(checkStmt);
            }
            // update coverage information
            addCoverageRateAfter(targetStmtNum, clazz.getName(), classesDirectory);
        } else if (info.equals(Constant.TARGET_STMT_END)) {
            // update coverage information
            addCoverageRateAfter(targetStmtNum, clazz.getName(), classesDirectory);
        } else if (info.equals(Constant.CHECK_COVERAGE)) {
            // check if the coverage rate is different from existing inline tests
            addInlineTest(targetStmtNum, clazz.getName(), classesDirectory);
            targetStmtLineNoToCurInlineTestMap.remove(targetStmtNum);
        }
    }

    /**
     * read coverage information from file
     */
    public static void init() {
        // read configure file in user home directory
        String homeDir = System.getProperty("user.home");
        String configureFile = homeDir + "/" + Constant.CONFIGURE_FILE_NAME;
        Path configureFilePath = Paths.get(configureFile);
        if (Files.exists(configureFilePath)) {
            // read configure file
            try {
                BufferedReader reader = new BufferedReader(new FileReader(configureFile));
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("=")) {
                        String[] tokens = line.split("=");
                        if (tokens.length == 2) {
                            switch (tokens[0].trim()) {
                                case "inlinetestname":
                                    Constant.inlineTestName = tokens[1].trim();
                                    break;
                            }
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        inlineGenDir = Utils.createDir(Constant.INLINE_GEN_DIR_NAME);
        serializedDataDir = Utils.createDir(Constant.INLINE_GEN_DIR_NAME + "/" + Constant.SERIALIZED_DATA_DIR_NAME);

        // read number of inline tests for each target statement
        String inlineTestsCounterFile = inlineGenDir + "/" + Constant.INLINE_TESTS_COUNTER_FILE_NAME;
        Path inlineTestsCounterFilePath = Paths.get(inlineTestsCounterFile);
        if (Files.exists(inlineTestsCounterFilePath)) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(inlineTestsCounterFile));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] tokens = line.split(";");
                    if (tokens.length <= 1) {
                        continue;
                    }
                    String srcLineNo = tokens[0];
                    int count = Integer.parseInt(tokens[1]);
                    srcLineNoCounter.put(srcLineNo, count);
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // read coverage information for each target statement
        String coverageFile = inlineGenDir + "/" + Constant.COVERAGE_FILE_NAME;
        Path coverageFilePath = Paths.get(coverageFile);
        if (Files.exists(coverageFilePath)) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(coverageFile));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] tokens = line.split(";");
                    String classLineNo = tokens[0];

                    for (int i = 1; i < tokens.length; i++) {
                        String lineNo = tokens[i];
                        if (!classLineNoToCovered.containsKey(classLineNo)) {
                            classLineNoToCovered.put(classLineNo, new HashSet<String>());
                        }
                        classLineNoToCovered.get(classLineNo).add(lineNo);
                    }
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // read serialized data to path
        String serializedDataToPath = inlineGenDir + "/" + Constant.SERIALIZED_DATA_TO_PATH_FILE_NAME;
        File serializedDataDirFile = new File(serializedDataToPath);
        if (serializedDataDirFile.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(serializedDataToPath));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] tokens = line.split(";");
                    String serialzedData = tokens[0];
                    String path = tokens[1];
                    serializedDataToFilePathMap.put(serialzedData, path);
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void saveInlineTestToFile(InlineTest inlineTest, String destPath) {
        // save inline test
        try {
            FileWriter writer = new FileWriter(destPath, true);
            writer.write(inlineTest.srcPath + ";" + inlineTest.targetStmtLineNo + ";" + inlineTest.toString()
                    + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Save all inline tests before JVM exits.
     */
    static class TearDown extends Thread {
        public void run() {
            // write log information
            // Log.debug("Total inline tests: " + totalInlineTests);
            // write coverage information
            inlineGenDir = Utils.createDir(Constant.INLINE_GEN_DIR_NAME);

            // write number of inline tests for each target statement
            String inlineTestsCounterFile = inlineGenDir + "/" + Constant.INLINE_TESTS_COUNTER_FILE_NAME;
            try {
                FileWriter writer = new FileWriter(inlineTestsCounterFile);
                for (String srcLineNo : srcLineNoCounter.keySet()) {
                    writer.write(srcLineNo + ";" + srcLineNoCounter.get(srcLineNo) + "\n");
                }
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // write coverage information for each target statement
            String coverageFile = inlineGenDir + "/" + Constant.COVERAGE_FILE_NAME;
            try {
                FileWriter writer = new FileWriter(coverageFile);
                for (String classLineNo : classLineNoToCovered.keySet()) {
                    writer.write(classLineNo);
                    for (String lineNo : classLineNoToCovered.get(classLineNo)) {
                        writer.write(";" + lineNo);
                    }
                    writer.write("\n");
                }
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // write serialized data to path
            String serializedDataToPath = inlineGenDir + "/" + Constant.SERIALIZED_DATA_TO_PATH_FILE_NAME;
            try {
                FileWriter writer = new FileWriter(serializedDataToPath);
                for (String serializedData : serializedDataToFilePathMap.keySet()) {
                    writer.write(serializedData + ";" + serializedDataToFilePathMap.get(serializedData) + "\n");
                }
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
