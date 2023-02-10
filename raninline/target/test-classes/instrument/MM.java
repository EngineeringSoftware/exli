package instrument;

public class MM {

    public String[] match(String value) {
        if (value == null) {
            return null;
        } else {
        }
        for (int i = 0; i < patterns.length; i++) {
            try {
                Matcher matcher = patterns[i].matcher(value);
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-if-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 11, null, null, MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 11, matcher, "matcher", MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                if (matcher.matches()) {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 11, null, null, MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    int count = matcher.groupCount();
                    String[] groups = new String[count];
                    for (int j = 0; j < count; j++) {
                        try {
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 15, null, null, MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 15, j, "j", MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 15, matcher, "matcher", MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            groups[j] = matcher.group(j + 1);
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 15, groups[j], "groups[j]", MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 15, null, null, MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        } finally {
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 15, null, null, MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        }
                    }
                    return groups;
                } else {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-not-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 11, null, null, MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                }
            } finally {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/MM.java", 11, null, null, MM.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            }
        }
        return null;
    }
}
