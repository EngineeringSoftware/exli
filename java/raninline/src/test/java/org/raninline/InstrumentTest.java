package org.raninline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.nio.file.StandardCopyOption;

/**
 * javac -cp
 * ~/exli/java/raninline/target/raninline-1.0-SNAPSHOT.jar:.
 * A.java
 * java
 * -javaagent:/home/user/exli/jars/org.jacoco.agent-0.8.8-runtime.jar
 * -cp
 * ~/exli/java/raninline/target/raninline-1.0-SNAPSHOT.jar:.
 * A
 */

/**
 * Instrumented files are generated in target/test-classes/instrument
 */
public class InstrumentTest {
    String logFilePath = System.getProperty("user.home") + "/exli/java/raninline/target/"
            + "raninline.txt";
    String classesDirectory = System.getProperty("user.home")
            + "/exli/java/raninline/target/test-classes/instrument";

    @BeforeAll
    public static void setUp() {
        try {
            List<Path> javaFiles = Files.walk(Paths.get("src/test/resources/instrument"))
                    .filter(p -> p.toString().endsWith(".java1"))
                    .collect(Collectors.toList());
            System.out.println("Found " + javaFiles.size() + " java files");
            for (Path javaFile : javaFiles) {
                String tempPath = "target/test-classes/instrument/" + javaFile.getFileName().toString().replace(".java1", ".java");
                Files.copy(javaFile, Paths.get(tempPath), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseA() {
        String srcPath = "target/test-classes/instrument/A.java";
        String lineNumberStr = "13";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseB() {
        String srcPath = "target/test-classes/instrument/B.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseC() {
        // contains variable declaration in target statement
        String srcPath = "target/test-classes/instrument/C.java";
        String lineNumberStr = "3";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseD() {
        // local variables declared in block will not be in scope
        String srcPath = "target/test-classes/instrument/D.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseE() {
        // local variables declared in block will not be in scope
        String srcPath = "target/test-classes/instrument/E.java";
        String lineNumberStr = "6";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseF() {
        // local variables declared in block will not be in scope
        String srcPath = "target/test-classes/instrument/F.java";
        String lineNumberStr = "8";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseG() {
        // static field
        String srcPath = "target/test-classes/instrument/G.java";
        String lineNumberStr = "5";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseI() {
        // function call without parameters
        String srcPath = "target/test-classes/instrument/I.java";
        String lineNumberStr = "3";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseJ() {
        // not an assignment statement
        String srcPath = "target/test-classes/instrument/J.java";
        String lineNumberStr = "4";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseM() {
        // function call with parameters
        String srcPath = "target/test-classes/instrument/M.java";
        String lineNumberStr = "5";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseN() {
        // target statement contains multiple lines
        String srcPath = "target/test-classes/instrument/N.java";
        String lineNumberStr = "4";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseO() {
        // target statement is if statement
        String srcPath = "target/test-classes/instrument/O.java";
        String lineNumberStr = "4";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseP() {
        // target statement is if statement
        String srcPath = "target/test-classes/instrument/P.java";
        String lineNumberStr = "5";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertOneInlineTestWithArgument() {
        String srcPath = "target/test-classes/instrument/InstantDeserializer.java";
        String lineNumberStr = "48";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testVariableNotInitialized() {
        String srcPath = "target/test-classes/instrument/AbstractInheritFromHierarchyMergeStrategy.java";
        String lineNumberStr = "64";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInstrumentMultipleStmts() {
        String srcPath = "target/test-classes/instrument/NumberFacility.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInstrumentIf() {
        String srcPath = "target/test-classes/instrument/AceRights.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIfLocalVar() {
        String srcPath = "target/test-classes/instrument/VersionJsonAnnotationIntrospector.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testThenNotBlockStmt() {
        String srcPath = "target/test-classes/instrument/S.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testModifierNotChanged() {
        String srcPath = "target/test-classes/instrument/Z.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLocalVariableLambda() {
        String srcPath = "target/test-classes/instrument/Element.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertNode() {
        String srcPath = "target/test-classes/instrument/OgnlParserTokenManager.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddReturnToLambdaExpression() {
        String srcPath = "target/test-classes/instrument/LambdaExpression.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO: check the correctness of casting, from project
    // jenkinsci_email-ext-plugin/src/main/java/hudson/plugins/emailext/plugins/content/FailedTestsContent.java
    @Test
    public void testCastClass() {
        String srcPath = "target/test-classes/instrument/CastClass.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNestedTargetStmt() {
        String srcPath = "target/test-classes/instrument/LL.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLocalVariableLambda2() {
        String srcPath = "target/test-classes/instrument/LLL.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLocalVariableLambda3() {
        String srcPath = "target/test-classes/instrument/LLLL.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNotReached() {
        String srcPath = "target/test-classes/instrument/NotReached.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNotReached2() {
        String srcPath = "target/test-classes/instrument/NotReached2.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNotReached3() {
        String srcPath = "target/test-classes/instrument/NotReached3.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIfThenStmtNotBlock() {
        String srcPath = "target/test-classes/instrument/IfThenStmtNotBlock.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHandleSuper() {
        String srcPath = "target/test-classes/instrument/HandleSuper.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testVariableInLambda() {
        String srcPath = "target/test-classes/instrument/VariableInLambda.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testClassDeclarator() {
        String srcPath = "target/test-classes/instrument/ClassDeclarator.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testArrayAccessExpr() {
        String srcPath = "target/test-classes/instrument/PP.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLambdaExpr() {
        String srcPath = "target/test-classes/instrument/PPP.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCondition() {
        String srcPath = "target/test-classes/instrument/MM.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testStringWrapper() {
        String srcPath = "target/test-classes/instrument/WWW.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, null, null, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
