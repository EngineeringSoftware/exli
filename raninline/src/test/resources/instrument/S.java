package instrument;

public class S {

    public void m(int a, int b) {
        try {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-if-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/S.java", 6, null, null, S.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/S.java", 6, a, "a", S.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/S.java", 6, b, "b", S.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            if (a + b >> 2 >= 1) {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/S.java", 6, null, null, S.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                a = 1 + b;
            } else {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-not-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/S.java", 6, null, null, S.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                a = 2 + b;
            }
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/S.java", 6, null, null, S.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}
