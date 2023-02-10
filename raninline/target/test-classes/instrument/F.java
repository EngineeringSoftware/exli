public class F {

    public int m(int a) {
        int b;
        int c;
        if (a > 1) {
            try {
                c = 1;
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/F.java", 8, null, null, F.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/F.java", 8, a, "a", F.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                b = a + 1;
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/F.java", 8, b, "b", F.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/F.java", 8, null, null, F.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            } finally {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/F.java", 8, null, null, F.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            }
        } else {
            c = 2;
            b = a - 1;
        }
        return c;
    }
}
