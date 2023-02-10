public class I {

    public void m() {
        try {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/I.java", 3, null, null, I.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            String x = String.valueOf(J.getK().getI()) + LocalDateTime.now();
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/I.java", 3, x, "x", I.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/I.java", 3, null, null, I.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            System.out.println(x);
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/I.java", 3, null, null, I.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}

class J {

    public static K getK() {
        return new K();
    }
}

class K {

    private int i = 5;

    public int getI() {
        return i;
    }
}
