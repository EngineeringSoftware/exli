package instrument;

public class HandleSuper {

    int i;

    public HandleSuper() {
        super(-1);
        try {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/HandleSuper.java", 8, null, null, HandleSuper.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/HandleSuper.java", 8, i, "i", HandleSuper.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            i = i >> 1;
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/HandleSuper.java", 8, i, "i", HandleSuper.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/HandleSuper.java", 8, null, null, HandleSuper.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/HandleSuper.java", 8, null, null, HandleSuper.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }

    public HandleSuper(int i) {
        this.i = i;
    }
}
