package instrument;

public class NotReached3 {

    public CompiledTemplate compile(IdentifiableStringTemplateSource templateSource) throws TemplateException {
        try {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached3.java", 6, null, null, NotReached3.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached3.java", 6, templateSource, "templateSource", NotReached3.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            // Replace '/' with any other char because Freemarker messes up IDs with '/' because it thinks they're paths.
            String id = new org.raninline.IT_String(templateSource.getId()).replace('/', ';');
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached3.java", 6, id, "id", NotReached3.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached3.java", 6, null, null, NotReached3.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            String source = templateSource.getSource();
            StringTemplateSource currentTemplateSource = (StringTemplateSource) templateLoader.findTemplateSource(id);
            if (currentTemplateSource == null || !currentTemplateSource.getSource().equals(source)) {
                templateLoader.putTemplateSource(id, source);
            } else {
            }
            try {
                return new FreeMarkerCompiledTemplate(templateConfiguration.getTemplate(id));
            } catch (Exception e) {
                throw new TemplateException("Unable to compile Freemarker template:\n" + source, e);
            }
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached3.java", 6, null, null, NotReached3.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}
