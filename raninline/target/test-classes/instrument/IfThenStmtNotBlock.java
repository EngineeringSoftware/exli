package instrument;

public class IfThenStmtNotBlock {

    public int abs(int x) {
        try {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/IfThenStmtNotBlock.java", 5, null, null, IfThenStmtNotBlock.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/IfThenStmtNotBlock.java", 5, x, "x", IfThenStmtNotBlock.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            x = x >> 1;
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/IfThenStmtNotBlock.java", 5, x, "x", IfThenStmtNotBlock.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/IfThenStmtNotBlock.java", 5, null, null, IfThenStmtNotBlock.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            if (x > 0) {
                return x;
            } else {
                return -x;
            }
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/IfThenStmtNotBlock.java", 5, null, null, IfThenStmtNotBlock.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}
