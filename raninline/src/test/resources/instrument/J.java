public class J {

    public void m(int a, int b) {
        try {
            StringBuilder sb = new StringBuilder();
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/J.java", 4, null, null, J.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/J.java", 4, a, "a", J.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/J.java", 4, sb, "sb", J.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            sb.append("a = " + String.valueOf(a));
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/J.java", 4, null, null, J.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/J.java", 4, null, null, J.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}
