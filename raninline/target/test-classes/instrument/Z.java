package instrument;

public class Z {

    private void m(int a, int b) {
        try {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-if-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/Z.java", 5, null, null, Z.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/Z.java", 5, a, "a", Z.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/Z.java", 5, b, "b", Z.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            if (a >> 1 > b) {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/Z.java", 5, null, null, Z.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                a = a + b;
            } else {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-not-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/Z.java", 5, null, null, Z.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            }
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/Z.java", 5, null, null, Z.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}
