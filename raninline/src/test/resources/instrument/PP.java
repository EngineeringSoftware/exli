package instrument;

import java.io.*;
import com.ctc.wstx.api.WriterConfig;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Specialized buffering UTF-8 writer used by
 * {@link com.ctc.wstx.sw.XmlWriter}.
 * The main reason for custom version is to allow for efficient
 * buffer recycling; the second benefit is that encoder has less
 * overhead for short content encoding (compared to JDK default
 * codecs).
 */
public final class PP extends Writer implements CompletelyCloseable {

    private final static int DEFAULT_BUF_LEN = 4000;

    final static int SURR1_FIRST = 0xD800;

    final static int SURR1_LAST = 0xDBFF;

    final static int SURR2_FIRST = 0xDC00;

    final static int SURR2_LAST = 0xDFFF;

    final WriterConfig mConfig;

    final boolean mAutoCloseOutput;

    final OutputStream mOut;

    byte[] mOutBuffer;

    final int mOutBufferLast;

    int mOutPtr;

    /**
     * When outputting chars from BMP, surrogate pairs need to be coalesced.
     * To do this, both pairs must be known first; and since it is possible
     * pairs may be split, we need temporary storage for the first half
     */
    int mSurrogate = 0;

    public UTF8Writer(WriterConfig cfg, OutputStream out, boolean autoclose) {
        mConfig = cfg;
        mAutoCloseOutput = autoclose;
        mOut = out;
        mOutBuffer = (mConfig == null) ? new byte[DEFAULT_BUF_LEN] : cfg.allocFullBBuffer(DEFAULT_BUF_LEN);
        /* Max. expansion for a single char (in unmodified UTF-8) is
         * 4 bytes (or 3 depending on how you view it -- 4 when recombining
         * surrogate pairs)
         */
        mOutBufferLast = mOutBuffer.length - 4;
        mOutPtr = 0;
    }

    /*
    ////////////////////////////////////////////////////////
    // CompletelyCloseable impl
    ////////////////////////////////////////////////////////
     */
    @Override
    public void closeCompletely() throws IOException {
        _close(true);
    }

    /*
    ////////////////////////////////////////////////////////
    // java.io.Writer implementation
    ////////////////////////////////////////////////////////
     */
    /* !!! 30-Nov-2006, TSa: Due to co-variance between Appendable and
     *    Writer, this would not compile with javac 1.5, in 1.4 mode
     *    (source and target set to "1.4". Not a huge deal, but since
     *    the base impl is just fine, no point in overriding it.
     */
    /*
    public Writer append(char c)
        throws IOException
               // note: this is a JDK 1.5 method
    {
        write(c);
        return this;
    }
    */
    @Override
    public void close() throws IOException {
        _close(mAutoCloseOutput);
    }

    @Override
    public void flush() throws IOException {
        if (mOutPtr > 0 && mOutBuffer != null) {
            mOut.write(mOutBuffer, 0, mOutPtr);
            mOutPtr = 0;
        } else {
        }
        mOut.flush();
    }

    @Override
    public void write(char[] cbuf) throws IOException {
        write(cbuf, 0, cbuf.length);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        if (len < 2) {
            if (len == 1) {
                write(cbuf[off]);
            } else {
            }
            return;
        } else {
        }
        // First: do we have a leftover surrogate to deal with?
        if (mSurrogate > 0) {
            char second = cbuf[off++];
            --len;
            write(_convertSurrogate(second));
            // will have at least one more char
        } else {
        }
        int outPtr = mOutPtr;
        byte[] outBuf = mOutBuffer;
        // has 4 'spare' bytes
        int outBufLast = mOutBufferLast;
        // All right; can just loop it nice and easy now:
        // len will now be the end of input buffer
        len += off;
        output_loop: for (; off < len; ) {
            /* First, let's ensure we can output at least 4 bytes
             * (longest UTF-8 encoded codepoint):
             */
            if (outPtr >= outBufLast) {
                mOut.write(outBuf, 0, outPtr);
                outPtr = 0;
            } else {
            }
            int c = cbuf[off++];
            // And then see if we have an Ascii char:
            if (c < 0x80) {
                // If so, can do a tight inner loop:
                outBuf[outPtr++] = (byte) c;
                // Let's calc how many ascii chars we can copy at most:
                int maxInCount = (len - off);
                int maxOutCount = (outBufLast - outPtr);
                if (maxInCount > maxOutCount) {
                    maxInCount = maxOutCount;
                } else {
                }
                maxInCount += off;
                ascii_loop: while (true) {
                    if (off >= maxInCount) {
                        // done with max. ascii seq
                        continue output_loop;
                    } else {
                    }
                    c = cbuf[off++];
                    if (c >= 0x80) {
                        break ascii_loop;
                    } else {
                    }
                    outBuf[outPtr++] = (byte) c;
                }
            } else {
            }
            // Nope, multi-byte:
            if (c < 0x800) {
                try {
                    try {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 165, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 165, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        // 2-byte
                        outBuf[outPtr++] = (byte) (0xc0 | (c >> 6));
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 165, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 165, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 166, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 166, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        outBuf[outPtr++] = (byte) (0x80 | (c & 0x3f));
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 166, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 166, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    } finally {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 166, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    }
                } finally {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 165, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                }
            } else {
                // 3 or 4 bytes
                try {
                    try {
                        try {
                            try {
                                // Surrogates?
                                if (c < SURR1_FIRST || c > SURR2_LAST) {
                                    try {
                                        try {
                                            try {
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 171, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 171, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                outBuf[outPtr++] = (byte) (0xe0 | (c >> 12));
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 171, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 171, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 172, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 172, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                outBuf[outPtr++] = (byte) (0x80 | ((c >> 6) & 0x3f));
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 172, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 172, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 173, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 173, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                outBuf[outPtr++] = (byte) (0x80 | (c & 0x3f));
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 173, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 173, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                continue;
                                            } finally {
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 173, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                            }
                                        } finally {
                                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 172, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                        }
                                    } finally {
                                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 171, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    }
                                } else {
                                }
                                // Yup, a surrogate:
                                if (c > SURR1_LAST) {
                                    // must be from first range
                                    mOutPtr = outPtr;
                                    throwIllegal(c);
                                } else {
                                }
                                mSurrogate = c;
                                // and if so, followed by another from next range
                                if (off >= len) {
                                    // unless we hit the end?
                                    break;
                                } else {
                                }
                                c = _convertSurrogate(cbuf[off++]);
                                if (c > 0x10FFFF) {
                                    // illegal, as per RFC 3629
                                    mOutPtr = outPtr;
                                    throwIllegal(c);
                                } else {
                                }
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 194, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 194, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                outBuf[outPtr++] = (byte) (0xf0 | (c >> 18));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 194, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 194, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 195, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 195, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                outBuf[outPtr++] = (byte) (0x80 | ((c >> 12) & 0x3f));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 195, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 195, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 196, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 196, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                outBuf[outPtr++] = (byte) (0x80 | ((c >> 6) & 0x3f));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 196, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 196, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 197, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 197, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                outBuf[outPtr++] = (byte) (0x80 | (c & 0x3f));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 197, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 197, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            } finally {
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 197, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            }
                        } finally {
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 196, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        }
                    } finally {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 195, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    }
                } finally {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 194, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                }
            }
        }
        mOutPtr = outPtr;
    }

    @Override
    public void write(int c) throws IOException {
        // First; do we have a left over surrogate?
        if (mSurrogate > 0) {
            c = _convertSurrogate(c);
            // If not, do we start with a surrogate?
        } else {
            if (c >= SURR1_FIRST && c <= SURR2_LAST) {
                // Illegal to get second part without first:
                if (c > SURR1_LAST) {
                    throwIllegal(c);
                } else {
                }
                // First part just needs to be held for now
                mSurrogate = c;
                return;
            } else {
            }
        }
        if (mOutPtr >= mOutBufferLast) {
            // let's require enough room, first
            mOut.write(mOutBuffer, 0, mOutPtr);
            mOutPtr = 0;
        } else {
        }
        if (c < 0x80) {
            // ascii
            mOutBuffer[mOutPtr++] = (byte) c;
        } else {
            int ptr = mOutPtr;
            if (c < 0x800) {
                try {
                    try {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 230, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 230, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        // 2-byte
                        mOutBuffer[ptr++] = (byte) (0xc0 | (c >> 6));
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 230, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 230, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        new Here("Randoop", 235).given(c, 133).checkEq(mOutBuffer[ptr++], 0);
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 232, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 232, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        mOutBuffer[ptr++] = (byte) (0x80 | (c & 0x3f));
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 232, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 232, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        new Here("Randoop", 236).given(c, 133).checkEq(mOutBuffer[ptr++], 0);
                    } finally {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 232, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    }
                } finally {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 230, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                }
            } else {
                if (c <= 0xFFFF) {
                    try {
                        try {
                            try {
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 236, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 236, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                // 3 bytes
                                mOutBuffer[ptr++] = (byte) (0xe0 | (c >> 12));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 236, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 236, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 237, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 237, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                mOutBuffer[ptr++] = (byte) (0x80 | ((c >> 6) & 0x3f));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 237, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 237, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 238, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 238, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                mOutBuffer[ptr++] = (byte) (0x80 | (c & 0x3f));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 238, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 238, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            } finally {
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 238, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            }
                        } finally {
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 237, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        }
                    } finally {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 236, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    }
                } else {
                    try {
                        try {
                            try {
                                try {
                                    // 4 bytes
                                    if (c > 0x10FFFF) {
                                        // illegal, as per RFC 3629
                                        throwIllegal(c);
                                    } else {
                                    }
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 245, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 245, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    mOutBuffer[ptr++] = (byte) (0xf0 | (c >> 18));
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 245, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 245, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 246, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 246, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    mOutBuffer[ptr++] = (byte) (0x80 | ((c >> 12) & 0x3f));
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 246, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 246, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 247, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 247, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    mOutBuffer[ptr++] = (byte) (0x80 | ((c >> 6) & 0x3f));
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 247, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 247, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 248, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 248, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    mOutBuffer[ptr++] = (byte) (0x80 | (c & 0x3f));
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 248, mOutBuffer[ptr], "mOutBuffer[ptr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 248, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                } finally {
                                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 248, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                }
                            } finally {
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 247, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            }
                        } finally {
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 246, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        }
                    } finally {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 245, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    }
                }
            }
            mOutPtr = ptr;
        }
    }

    @Override
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        if (len < 2) {
            if (len == 1) {
                write(str.charAt(off));
            } else {
            }
            return;
        } else {
        }
        // First: do we have a leftover surrogate to deal with?
        if (mSurrogate > 0) {
            char second = str.charAt(off++);
            --len;
            write(_convertSurrogate(second));
            // will have at least one more char (case of 1 char was checked earlier on)
        } else {
        }
        int outPtr = mOutPtr;
        byte[] outBuf = mOutBuffer;
        // has 4 'spare' bytes
        int outBufLast = mOutBufferLast;
        // All right; can just loop it nice and easy now:
        // len will now be the end of input buffer
        len += off;
        output_loop: for (; off < len; ) {
            /* First, let's ensure we can output at least 4 bytes
             * (longest UTF-8 encoded codepoint):
             */
            if (outPtr >= outBufLast) {
                mOut.write(outBuf, 0, outPtr);
                outPtr = 0;
            } else {
            }
            int c = str.charAt(off++);
            // And then see if we have an Ascii char:
            if (c < 0x80) {
                // If so, can do a tight inner loop:
                outBuf[outPtr++] = (byte) c;
                // Let's calc how many ascii chars we can copy at most:
                int maxInCount = (len - off);
                int maxOutCount = (outBufLast - outPtr);
                if (maxInCount > maxOutCount) {
                    maxInCount = maxOutCount;
                } else {
                }
                maxInCount += off;
                ascii_loop: while (true) {
                    if (off >= maxInCount) {
                        // done with max. ascii seq
                        continue output_loop;
                    } else {
                    }
                    c = str.charAt(off++);
                    if (c >= 0x80) {
                        break ascii_loop;
                    } else {
                    }
                    outBuf[outPtr++] = (byte) c;
                }
            } else {
            }
            // Nope, multi-byte:
            if (c < 0x800) {
                try {
                    try {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 316, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 316, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        // 2-byte
                        outBuf[outPtr++] = (byte) (0xc0 | (c >> 6));
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 316, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 316, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 317, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 317, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        outBuf[outPtr++] = (byte) (0x80 | (c & 0x3f));
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 317, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 317, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    } finally {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 317, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    }
                } finally {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 316, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                }
            } else {
                // 3 or 4 bytes
                try {
                    try {
                        try {
                            try {
                                // Surrogates?
                                if (c < SURR1_FIRST || c > SURR2_LAST) {
                                    try {
                                        try {
                                            try {
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 322, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 322, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                outBuf[outPtr++] = (byte) (0xe0 | (c >> 12));
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 322, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 322, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 323, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 323, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                outBuf[outPtr++] = (byte) (0x80 | ((c >> 6) & 0x3f));
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 323, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 323, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 324, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 324, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                outBuf[outPtr++] = (byte) (0x80 | (c & 0x3f));
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 324, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 324, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                                continue;
                                            } finally {
                                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 324, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                            }
                                        } finally {
                                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 323, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                        }
                                    } finally {
                                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 322, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                    }
                                } else {
                                }
                                // Yup, a surrogate:
                                if (c > SURR1_LAST) {
                                    // must be from first range
                                    mOutPtr = outPtr;
                                    throwIllegal(c);
                                } else {
                                }
                                mSurrogate = c;
                                // and if so, followed by another from next range
                                if (off >= len) {
                                    // unless we hit the end?
                                    break;
                                } else {
                                }
                                c = _convertSurrogate(str.charAt(off++));
                                if (c > 0x10FFFF) {
                                    // illegal, as per RFC 3629
                                    mOutPtr = outPtr;
                                    throwIllegal(c);
                                } else {
                                }
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 345, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 345, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                outBuf[outPtr++] = (byte) (0xf0 | (c >> 18));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 345, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 345, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 346, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 346, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                outBuf[outPtr++] = (byte) (0x80 | ((c >> 12) & 0x3f));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 346, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 346, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 347, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 347, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                outBuf[outPtr++] = (byte) (0x80 | ((c >> 6) & 0x3f));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 347, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 347, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 348, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 348, c, "c", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                outBuf[outPtr++] = (byte) (0x80 | (c & 0x3f));
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-after", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 348, outBuf[outPtr], "outBuf[outPtr]", PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-end", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 348, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            } finally {
                                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 348, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                            }
                        } finally {
                            org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 347, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                        }
                    } finally {
                        org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 346, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    }
                } finally {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/PP.java", 345, null, null, PP.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                }
            }
        }
        mOutPtr = outPtr;
    }

    /*
    ////////////////////////////////////////////////////////////
    // Internal methods
    ////////////////////////////////////////////////////////////
     */
    private final void _close(boolean forceClosing) throws IOException {
        byte[] buf = mOutBuffer;
        if (buf != null) {
            mOutBuffer = null;
            if (mOutPtr > 0) {
                mOut.write(buf, 0, mOutPtr);
                mOutPtr = 0;
            } else {
            }
            if (mConfig != null) {
                mConfig.freeFullBBuffer(buf);
            } else {
            }
        } else {
        }
        if (forceClosing) {
            mOut.close();
        } else {
        }
        /* Let's 'flush' orphan surrogate, no matter what; but only
         * after cleanly closing everything else.
         */
        int code = mSurrogate;
        if (code > 0) {
            mSurrogate = 0;
            throwIllegal(code);
        } else {
        }
    }

    /**
     * Method called to calculate UTF codepoint, from a surrogate pair.
     */
    private final int _convertSurrogate(int secondPart) throws IOException {
        int firstPart = mSurrogate;
        mSurrogate = 0;
        // Ok, then, is the second part valid?
        if (secondPart < SURR2_FIRST || secondPart > SURR2_LAST) {
            throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(firstPart) + ", second 0x" + Integer.toHexString(secondPart) + "; illegal combination");
        } else {
        }
        return 0x10000 + ((firstPart - SURR1_FIRST) << 10) + (secondPart - SURR2_FIRST);
    }

    private void throwIllegal(int code) throws IOException {
        if (code > 0x10FFFF) {
            // over max?
            throw new IOException("Illegal character point (0x" + Integer.toHexString(code) + ") to output; max is 0x10FFFF as per RFC 3629");
        } else {
        }
        if (code >= SURR1_FIRST) {
            if (code <= SURR1_LAST) {
                // Unmatched first part (closing without second part?)
                throw new IOException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(code) + ")");
            } else {
            }
            throw new IOException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(code) + ")");
        } else {
        }
        // should we ever get this?
        throw new IOException("Illegal character point (0x" + Integer.toHexString(code) + ") to output");
    }
}
