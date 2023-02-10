public class P {

    void m(int a, int b, int c) {
        if (a << b > 0) {
            b = a + c;
        } else {
            try {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-if-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/P.java", 5, null, null, P.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/P.java", 5, a, "a", P.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/P.java", 5, b, "b", P.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                if (a << b < 0) {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/P.java", 5, null, null, P.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    b = a - c;
                } else {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-not-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/P.java", 5, null, null, P.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    b = a * c;
                }
            } finally {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/P.java", 5, null, null, P.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            }
        }
    }
}
