public class A {

    /**
     * Read a string from a data input stream Credit to:
     * https://github.com/NLPchina/Word2VEC_java/blob/master/src/com/ansj/vec/Word2VEC.java
     *
     * @param b
     * @return
     * @throws IOException
     */
    private static float getFloat(byte[] b) {
        try {
            int accum = 0;
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/A.java", 13, null, null, A.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/A.java", 13, b, "b", A.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/A.java", 13, accum, "accum", A.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            accum = accum | (b[0] & 0xff) << 0;
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/A.java", 13, accum, "accum", A.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/A.java", 13, null, null, A.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            accum = accum | (b[1] & 0xff) << 8;
            accum = accum | (b[2] & 0xff) << 16;
            accum = accum | (b[3] & 0xff) << 24;
            return Float.intBitsToFloat(accum);
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/A.java", 13, null, null, A.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }

    public static void main(String[] args) {
        byte[] b = new byte[4];
        b[0] = 0x40;
        b[1] = 0x48;
        b[2] = 0x05;
        b[3] = 0x03;
        getFloat(b);
        b[0] = 0x40;
        getFloat(b);
    }
}
