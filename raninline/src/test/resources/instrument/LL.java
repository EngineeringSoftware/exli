package instrument;

public class LL {

    public void m() {
        doc.select("section").stream().filter(section -> !section.select(".fight_history").isEmpty()).forEach(section -> {
            try {
                Elements title = section.select(".slanted_title div:nth-child(1)");
                FightType type = FightType.fromString(title.html());
                Elements trs = section.select(".new_table.fighter tbody tr");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/LL.java", 9, null, null, LL.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/LL.java", 9, trs, "trs", LL.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/LL.java", 9, fighter, "fighter", LL.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/LL.java", 9, type, "type", LL.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                List<Fight> fights = this.getFights(trs, fighter).stream().map(f -> {
                    f.setType(type);
                    return f;
                }).collect(Collectors.toList());
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/LL.java", 9, fights, "fights", LL.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/LL.java", 9, null, null, LL.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                fighter.getFights().addAll(fights);
            } finally {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/LL.java", 9, null, null, LL.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            }
        });
    }
}
