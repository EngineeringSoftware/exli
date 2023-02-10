class Castclass {

    void m(TestResult failedTest) {
        try {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/CastClass.java", 3, null, null, Castclass.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/CastClass.java", 3, failedTest, "failedTest", Castclass.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            String name = String.format("%s.%s", (failedTest instanceof CaseResult) ? ((CaseResult) failedTest).getClassName() : failedTest.getFullName(), failedTest.getDisplayName());
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/CastClass.java", 3, name, "name", Castclass.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/CastClass.java", 3, null, null, Castclass.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/CastClass.java", 3, null, null, Castclass.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}
