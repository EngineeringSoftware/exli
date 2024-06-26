package org.raninline;

import java.io.IOException;
import java.nio.file.Paths;

public class App {
    /**
     * Add log statement
     * 
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String task = args[0];
        if (task.equals("instrument") || task.equals("i")) {
            // Instrument
            String filePath = args[1];
            String lineNumber = args[2];
            String logFilePath = args[3];
            String r0TestPath;
            if (args.length >= 5) {
                r0TestPath = args[4];
            } else {
                r0TestPath = Paths.get(logFilePath).getParent().toString() + "/inlinetest-r0.txt";
            }
            String r1TestPath;
            if (args.length >= 6) {
                r1TestPath = args[5];
            } else {
                r1TestPath = Paths.get(logFilePath).getParent().toString() + "/inlinetest-r1.txt";
            }
            String classesDirectory = null;
            if (args.length >= 7) {
                classesDirectory = args[6];
            }
            Parser.instrument(filePath, lineNumber, logFilePath, r0TestPath, r1TestPath, classesDirectory);
        } else if (task.equals("change-modifier") || task.equals("m")) {
            // Change modifier to public (help Randoop generate more tests).
            String filePath = args[1];
            String lineNumber = args[2];
            Parser.changeModifier(filePath, lineNumber);
        } else if (task.equals("add-inline-test") || task.equals("a")) {
            // Add inline tests from log file, the log file contains constructed inline
            // tests.
            // e.g. itest().given(...).checkEq(...);
            String logFilePath = args[1];
            String lineNumberFromInput;
            String filePathFromInput;
            if (args.length >= 4) {
                lineNumberFromInput = args[2];
                filePathFromInput = args[3];
            }else{
                lineNumberFromInput = "-1";
                filePathFromInput = null;
            }

            boolean throwException = false;
            if (args.length >= 5) {
                throwException = Boolean.parseBoolean(args[4]);
            }

            Parser.addInlineTest(logFilePath, lineNumberFromInput, filePathFromInput, throwException);
        } else if (task.equals("construct-inline-test") || task.equals("c")) {
            // Construct inline tests from log file, the log file contains variables and
            // their values. It is now deprecated because we generate inline tests in memory
            // (in instrument method).
            String filePath = args[1];
            String lineNumber = args[2];
            String logFilePath = args[3];
            Parser.constructInlineTest(filePath, lineNumber, logFilePath);
        } else if (task.equals("target-stmt")) {
            String srcPath = args[1];
            String logFilePath = args[2];
            Parser.findTargetStmt(srcPath, logFilePath);
        } else {
            System.out.println("Invalid task");
        }
    }
}
