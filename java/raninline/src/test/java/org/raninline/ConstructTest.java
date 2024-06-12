package org.raninline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConstructTest {

    @BeforeAll
    public static void setUp() {
        try {
            List<Path> tempFiles = Files.walk(Paths.get("src/test/resources/construct"))
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());

            for (Path tempFile : tempFiles) {
                Files.delete(tempFile);
            }

            List<Path> javaFiles = Files.walk(Paths.get("src/test/resources/construct"))
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
    public void testParseLogWithDuplicate() throws IOException {
        String logFileName = "src/test/resources/construct/raninline-log-1.txt";
        Context ctx = new Context();
        ctx.lineNumberKnown = true;
        ctx.lineNumber = 139;
        ctx.srcPath = "src/test/resources/construct/EmailRecipientUtils.java";
        Parser.parseLog(logFileName, ctx);
        assertEquals(1, ctx.inlineTests.get(ctx.lineNumber).size());
    }

    @Test
    public void testParseLogInOneTest() throws IOException {
        String logFileName = "src/test/resources/construct/raninline-log-2.txt";
        Context ctx = new Context();
        ctx.lineNumberKnown = true;
        ctx.lineNumber = 139;
        ctx.srcPath = "src/test/resources/construct/EmailRecipientUtils.java";
        Parser.parseLog(logFileName, ctx);
        assertEquals(2, ctx.inlineTests.get(ctx.lineNumber).size());
    }

    @Test
    public void testInsertOneInlineTest() {
        String srcPath = "src/test/resources/construct/EmailRecipientUtils.java";
        String inlineNumber = "139";
        String logFileName = "src/test/resources/construct/raninline-log-1.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertOneInlineTestIfStmt() {
        String srcPath = "src/test/resources/construct/A.java";
        String inlineNumber = "9";
        String logFileName = "src/test/resources/construct/raninline-log-3.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertOneInlineTestArray() {
        String srcPath = "src/test/resources/construct/B.java";
        String inlineNumber = "7";
        String logFileName = "src/test/resources/construct/raninline-log-4.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNotAssignStmt() {
        String srcPath = "src/test/resources/construct/GUID.java";
        String inlineNumber = "13";
        String logFileName = "src/test/resources/construct/raninline-log-5.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertOneInlineTestWithArgument() {
        String srcPath = "src/test/resources/construct/InstantDeserializer.java";
        String inlineNumber = "48";
        String logFileName = "src/test/resources/construct/raninline-log-6.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertOneInlineTestForBooleanArray() {
        String srcPath = "src/test/resources/construct/NumberFacility.java";
        String inlineNumber = "115";
        String logFileName = "src/test/resources/construct/raninline-log-7.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLargeNumberOfInlineTests() {
        String srcPath = "src/test/resources/construct/N.java";
        String inlineNumber = "186";
        String logFileName = "src/test/resources/construct/raninline-log-9.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseCorrectly() {
        String srcPath = "src/test/resources/construct/JulMessage.java";
        String inlineNumber = "-1";
        String logFileName = "src/test/resources/construct/raninline-log-10.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseWithMethodCall() {
        String srcPath = "src/test/resources/construct/MM.java";
        String inlineNumber = "-1";
        String logFileName = "src/test/resources/construct/raninline-log-11.txt";
        try {
            Parser.constructInlineTest(srcPath, inlineNumber, logFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDuplicate() {
        String srcPath = "src/test/resources/construct/VersionInformation.java";
        String inlineNumber = "-1";
        String logFileName = "src/test/resources/construct/inlinetest-log1.txt";
        try {
            Parser.addInlineTest(logFileName, inlineNumber, srcPath, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLocation() {
        String srcPath = "src/test/resources/construct/Style.java";
        String inlineNumber = "-1";
        String logFileName = "src/test/resources/construct/inlinetest-log2.txt";
        try {
            Parser.addInlineTest(logFileName, inlineNumber, srcPath, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCanBeAdded() {
        String srcPath = "src/test/resources/construct/DefaultFacebookClient.java";
        String inlineNumber = "-1";
        String logFileName = "src/test/resources/construct/inlinetest-log3.txt";
        try {
            Parser.addInlineTest(logFileName, inlineNumber, srcPath, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCanBeAdded2() {
        String srcPath = "src/test/resources/construct/Element.java";
        String inlineNumber = "-1";
        String logFileName = "src/test/resources/construct/inlinetest-log4.txt";
        try {
            Parser.addInlineTest(logFileName, inlineNumber, srcPath, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testKeepComment() throws IOException {
        String srcPath = "src/test/resources/construct/F.java";
        String inlineNumber = "5";
        String logFileName = "src/test/resources/construct/inlinetest-log5.txt";
        try {
            Parser.addInlineTest(logFileName, inlineNumber, srcPath, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // load srcPath
        String content = String.join("\n", Files.readAllLines(Paths.get(srcPath)));
        assertTrue(content.contains("a = a + 1; // increment a by 1"));
    }

    @Test
    public void testAddToSwitch() {
        String srcPath = "src/test/resources/construct/EntityDelimiterProcessor.java";
        String inlineNumber = "-1";
        String logFileName = "src/test/resources/construct/inlinetest-log6.txt";
        try {
            Parser.addInlineTest(logFileName, inlineNumber, srcPath, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
