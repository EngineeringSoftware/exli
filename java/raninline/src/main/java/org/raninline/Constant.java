package org.raninline;

import java.util.Arrays;
import java.util.List;

import com.github.javaparser.ast.expr.AssignExpr;

public class Constant {
        final static String TARGET_STMT_BEFORE = "target-statement-before";
        final static String TARGET_STMT_AFTER = "target-statement-after";
        final static String TARGET_STMT_START = "target-statement-start";
        final static String TARGET_STMT_END = "target-statement-end";
        final static String TARGET_METHOD_BEFORE = "target-method-before";
        final static String TARGET_STMT_EXECUTED = "target-statement-executed";
        final static String TARGET_STMT_NOT_EXECUTED = "target-statement-not-executed";
        final static String TARGET_STMT_IF_START = "target-statement-if-start";
        final static String CHECK_COVERAGE = "check-coverage"; // check coverage rate at the end of the block
        final static String LOG_CLASS_NAME = "org.raninline.InstrumentHelper";
        final static String COUNTER_CLASS_NAME = "org.raninline.CounterHelper";
        final static String LOG_SEPARATOR = ";";
        final static List<String> STRING_MANIPULATION = Arrays.asList("split", "substring", "indexOf", "format",
                        "replace");
        final static List<String> REGEX = Arrays.asList("matches", "find", "group");
        final static List<String> STREAM = Arrays.asList("stream");
        final static List<String> PRIMITIVE_TYPES = Arrays.asList("int", "long", "double", "float", "boolean", "char",
                        "byte", "short",
                        "String", "int[]", "long[]", "double[]", "float[]", "boolean[]", "char[]", "byte[]", "short[]",
                        "String[]");
        final static List<AssignExpr.Operator> COMPOUND_ASSIGN_OPERATORS = Arrays.asList(AssignExpr.Operator.PLUS,
                        AssignExpr.Operator.MINUS,
                        AssignExpr.Operator.MULTIPLY, AssignExpr.Operator.DIVIDE, AssignExpr.Operator.BINARY_AND,
                        AssignExpr.Operator.BINARY_OR, AssignExpr.Operator.XOR, AssignExpr.Operator.REMAINDER,
                        AssignExpr.Operator.LEFT_SHIFT, AssignExpr.Operator.SIGNED_RIGHT_SHIFT,
                        AssignExpr.Operator.UNSIGNED_RIGHT_SHIFT);
        static String logFilePath;
        static String inlineTestFilePath;
        static String allInlineTestFilePath;
        static String inlineTestName = ""; // default inline test name
        final static String CONFIGURE_FILE_NAME = ".inlinegenrc";
        final static String INLINE_GEN_DIR_NAME = ".inlinegen";
        final static String SERIALIZED_DATA_DIR_NAME = "serialized-data";
        final static String INLINE_TESTS_COUNTER_FILE_NAME = "inline-tests-counter.txt";
        final static String UNIQUE_INLINE_TESTS_COUNTER_FILE_NAME = "unique-inline-tests-counter.txt";
        final static String TARGET_STMTS_HIT_COUNTER_FILE_NAME = "all-target-stmts-hit-counter.txt";
        final static String COVERAGE_FILE_NAME = "coverage.txt";
        final static String SERIALIZED_DATA_TO_PATH_FILE_NAME = "serialized-data-to-path.txt";
        final static int MAX_INLINE_TESTS_PER_STMT = 100;
        final static int MAX_INLINE_TEST_LENGTH = 500;

        final static String DECLARE_NAME = "itest";
        final static String GIVEN = "given";
        final static String GROUP = "group";
        final static String CHECK_EQ = "checkEq";
        final static String CHECK_TRUE = "checkTrue";
        final static String CHECK_FALSE = "checkFalse";
}
