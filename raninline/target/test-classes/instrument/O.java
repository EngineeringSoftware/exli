public class O {

    void m(int a, int b) {
        try {
            a = a + b;
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-if-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/O.java", 4, null, null, O.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/O.java", 4, a, "a", O.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/O.java", 4, b, "b", O.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            if (a > 1 && b < 1) {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/O.java", 4, null, null, O.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                a = a + b;
            } else {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-not-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/O.java", 4, null, null, O.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                a = a - b;
            }
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/O.java", 4, null, null, O.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}
