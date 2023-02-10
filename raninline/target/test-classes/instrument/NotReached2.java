class NotReached2 {

    private static int determinePseudoPhase(final int lgK, final long numCoupons) {
        // This midrange logic produces pseudo-phases. They are used to select encoding tables.
        try {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 3, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 3, lgK, "lgK", NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            final long k = 1L << lgK;
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 3, k, "k", NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 3, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            final long c = numCoupons;
            // The thresholds were chosen by hand after looking at plots of measured compression.
            if ((1000 * c) < (2375 * k)) {
                if (// midrange table
                (4 * c) < (3 * k)) // midrange table
                {
                    return (16 + 0);
                } else {
                    if (// midrange table
                    (10 * c) < (11 * k)) // midrange table
                    {
                        return (16 + 1);
                    } else {
                        if (// midrange table
                        (100 * c) < (132 * k)) // midrange table
                        {
                            return (16 + 2);
                        } else {
                            if (// midrange table
                            (3 * c) < (5 * k)) // midrange table
                            {
                                return (16 + 3);
                            } else {
                                if (// midrange table
                                (1000 * c) < (1965 * k)) // midrange table
                                {
                                    return (16 + 4);
                                } else {
                                    if (// midrange table
                                    (1000 * c) < (2275 * k)) // midrange table
                                    {
                                        return (16 + 5);
                                    } else // steady-state table employed before its actual phase
                                    {
                                        return 6;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                // This steady-state logic produces true phases. They are used to select
                try {
                    try {
                        // encoding tables, and also column permutations for the "Sliding" flavor.
                        assert lgK >= 4;
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 20, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 20, lgK, "lgK", NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 20, c, "c", NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        final long tmp = c >>> (lgK - 4);
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 20, tmp, "tmp", NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 20, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 21, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 21, tmp, "tmp", NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        final int phase = (int) (tmp & 15L);
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 21, phase, "phase", NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 21, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        assert (phase >= 0) && (phase < 16);
                        return phase;
                    } finally {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 21, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    }
                } finally {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 20, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                }
            }
        } finally {
            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/NotReached2.java", 3, null, null, NotReached2.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
        }
    }
}
