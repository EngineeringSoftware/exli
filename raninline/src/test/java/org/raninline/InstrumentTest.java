package org.raninline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * javac -cp
 * ~/projects/inlinegen-research/java/raninline/target/raninline-1.0-SNAPSHOT.jar:.
 * A.java
 * java
 * -javaagent:/home/user/projects/inlinegen-research/jars/org.jacoco.agent-0.8.8-runtime.jar
 * -cp
 * ~/projects/inlinegen-research/java/raninline/target/raninline-1.0-SNAPSHOT.jar:.
 * A
 */
public class InstrumentTest {
    String logFilePath = System.getProperty("user.home") + "/projects/inlinegen-research/java/raninline/target/"
            + "raninline.txt";
    String classesDirectory = System.getProperty("user.home")
            + "/projects/inlinegen-research/java/raninline/target/test-classes/instrument";

    @BeforeAll
    public static void setUp() {
        try {
            List<Path> tempFiles = Files.walk(Paths.get("src/test/resources/instrument"))
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());
            for (Path tempFile : tempFiles) {
                Files.delete(tempFile);
            }

            List<Path> javaFiles = Files.walk(Paths.get("src/test/resources/instrument"))
                    .filter(p -> p.toString().endsWith(".java1"))
                    .collect(Collectors.toList());
            System.out.println("Found " + javaFiles.size() + " java files");
            for (Path javaFile : javaFiles) {
                String srcPath = javaFile.toString();
                String tempPath = srcPath.substring(0, srcPath.length() - 1);
                Files.copy(javaFile, Paths.get(tempPath));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseA() {
        String srcPath = "src/test/resources/instrument/A.java";
        String lineNumberStr = "13";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseB() {
        String srcPath = "src/test/resources/instrument/B.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseC() {
        // contains variable declaration in target statement
        String srcPath = "src/test/resources/instrument/C.java";
        String lineNumberStr = "3";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseD() {
        // local variables declared in block will not be in scope
        String srcPath = "src/test/resources/instrument/D.java";
        String lineNumberStr = "-1";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseE() {
        // local variables declared in block will not be in scope
        String srcPath = "src/test/resources/instrument/E.java";
        String lineNumberStr = "6";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseF() {
        // local variables declared in block will not be in scope
        String srcPath = "src/test/resources/instrument/F.java";
        String lineNumberStr = "8";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseG() {
        // static field
        String srcPath = "src/test/resources/instrument/G.java";
        String lineNumberStr = "5";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseI() {
        // function call without parameters
        String srcPath = "src/test/resources/instrument/I.java";
        String lineNumberStr = "3";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseJ() {
        // not an assignment statement
        String srcPath = "src/test/resources/instrument/J.java";
        String lineNumberStr = "4";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseM() {
        // function call with parameters
        String srcPath = "src/test/resources/instrument/M.java";
        String lineNumberStr = "5";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseN() {
        // target statement contains multiple lines
        String srcPath = "src/test/resources/instrument/N.java";
        String lineNumberStr = "4";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseO() {
        // target statement is if statement
        String srcPath = "src/test/resources/instrument/O.java";
        String lineNumberStr = "4";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseP() {
        // target statement is if statement
        String srcPath = "src/test/resources/instrument/P.java";
        String lineNumberStr = "5";
        try {
            Parser.instrument(srcPath, lineNumberStr, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertOneInlineTestWithArgument() {
        String srcPath = "src/test/resources/instrument/InstantDeserializer.java";
        String inlineNumber = "48";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testVariableNotInitialized() {
        String srcPath = "src/test/resources/instrument/AbstractInheritFromHierarchyMergeStrategy.java";
        String inlineNumber = "64";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInstrumentMultipleStmts() {
        String srcPath = "src/test/resources/instrument/NumberFacility.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInstrumentIf() {
        String srcPath = "src/test/resources/instrument/AceRights.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIfLocalVar() {
        String srcPath = "src/test/resources/instrument/VersionJsonAnnotationIntrospector.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testThenNotBlockStmt() {
        String srcPath = "src/test/resources/instrument/S.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testModifierNotChanged() {
        String srcPath = "src/test/resources/instrument/Z.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLocalVariableLambda() {
        String srcPath = "src/test/resources/instrument/Element.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertNode() {
        String srcPath = "src/test/resources/instrument/OgnlParserTokenManager.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddReturnToLambdaExpression() {
        String srcPath = "src/test/resources/instrument/LambdaExpression.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO: check the correctness of casting, from project
    // jenkinsci_email-ext-plugin/src/main/java/hudson/plugins/emailext/plugins/content/FailedTestsContent.java
    @Test
    public void testCastClass() {
        String srcPath = "src/test/resources/instrument/CastClass.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNestedTargetStmt() {
        String srcPath = "src/test/resources/instrument/LL.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLocalVariableLambda2() {
        String srcPath = "src/test/resources/instrument/LLL.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLocalVariableLambda3() {
        String srcPath = "src/test/resources/instrument/LLLL.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNotReached() {
        String srcPath = "src/test/resources/instrument/NotReached.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNotReached2() {
        String srcPath = "src/test/resources/instrument/NotReached2.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNotReached3() {
        String srcPath = "src/test/resources/instrument/NotReached3.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIfThenStmtNotBlock() {
        String srcPath = "src/test/resources/instrument/IfThenStmtNotBlock.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHandleSuper() {
        String srcPath = "src/test/resources/instrument/HandleSuper.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testVariableInLambda() {
        String srcPath = "src/test/resources/instrument/VariableInLambda.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testClassDeclarator() {
        String srcPath = "src/test/resources/instrument/ClassDeclarator.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testArrayAccessExpr() {
        String srcPath = "src/test/resources/instrument/PP.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLambdaExpr() {
        String srcPath = "src/test/resources/instrument/PPP.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCondition() {
        String srcPath = "src/test/resources/instrument/MM.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testStringWrapper() {
        String srcPath = "src/test/resources/instrument/WWW.java";
        String inlineNumber = "-1";
        try {
            Parser.instrument(srcPath, inlineNumber, logFilePath, logFilePath, classesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
