public class E {

    public void m(int a) {
        boolean c;
        if (a > 1) {
            try {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/E.java", 6, null, null, E.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/E.java", 6, a, "a", E.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                int b = a + 1;
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/E.java", 6, b, "b", E.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/E.java", 6, null, null, E.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                c = true;
            } finally {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/E.java", 6, null, null, E.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            }
        } else {
            c = false;
        }
    }
}
