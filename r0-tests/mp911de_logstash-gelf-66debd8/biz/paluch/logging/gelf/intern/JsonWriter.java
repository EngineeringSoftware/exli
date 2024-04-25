package biz.paluch.logging.gelf.intern;

import java.util.Map;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Writer to write an object in JSON representation. Strings are UTF-8 encoded with a fast-path implementation. UTF-8 characters
 * are escaped with using control sequences {@code \t, \b, ...} or UTF-8 escape sequences {@code \u0aD5}.
 *
 * @author Mark Paluch
 */
class JsonWriter {

    private static final byte[] NULL = "null".getBytes();

    private static final byte[] TRUE = "true".getBytes();

    private static final byte[] FALSE = "false".getBytes();

    private static final byte[] B = "\\b".getBytes();

    private static final byte[] T = "\\t".getBytes();

    private static final byte[] N = "\\n".getBytes();

    private static final byte[] F = "\\f".getBytes();

    private static final byte[] R = "\\r".getBytes();

    private static final byte[] QUOT = "\\\"".getBytes();

    private static final byte[] BSLASH = "\\\\".getBytes();

    private static final byte[] Q_AND_C = "\":".getBytes();

    private static final byte[] NaN = "NaN".getBytes();

    private static final byte[] Infinite = "Infinite".getBytes();

    private static final byte WRITE_UTF_UNKNOWN = (byte) '?';

    private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();

    private static final byte[] HEX_BYTES;

    static {
        int len = HEX_CHARS.length;
        HEX_BYTES = new byte[len];
        for (int i = 0; i < len; ++i) {
            HEX_BYTES[i] = (byte) HEX_CHARS[i];
        }
    }

    private JsonWriter() {
        // no instance allowed
    }

    /**
     * Start JSON object.
     *
     * @param out
     */
    public static void writeObjectStart(OutputAccessor out) {
        out.write('{');
    }

    /**
     * End JSON object.
     *
     * @param out
     */
    public static void writeObjectEnd(OutputAccessor out) {
        out.write('}');
    }

    /**
     * Write key-value separator
     *
     * @param out
     */
    public static void writeKeyValueSeparator(OutputAccessor out) {
        out.write(',');
    }

    /**
     * Utility method to write a {@link Map} into a JSON representation.
     *
     * @param out
     * @param map
     */
    public static void toJSONString(OutputAccessor out, Map<String, ? extends Object> map) {
        writeObjectStart(out);
        boolean first = true;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (first) {
                first = false;
            } else {
                writeKeyValueSeparator(out);
            }
            writeMapEntry(out, entry.getKey(), entry.getValue());
        }
        writeObjectEnd(out);
    }

    /**
     * Write a map entry.
     *
     * @param out
     * @param key
     * @param value
     */
    public static void writeMapEntry(OutputAccessor out, String key, Object value) {
        out.write((byte) '\"');
        if (key == null) {
            out.write(NULL);
        } else {
            writeUtf8(out, key);
        }
        out.write(Q_AND_C);
        toJSONString(out, value);
    }

    /**
     * Convert an object to JSON text. Encode the value as UTF-8 text, or "null" if value is null or it's an NaN or an INF
     * number.
     */
    private static void toJSONString(OutputAccessor out, Object value) {
        if (value == null) {
            out.write(NULL);
            return;
        }
        if (value instanceof String) {
            out.write((byte) '\"');
            writeUtf8(out, (String) value);
            out.write((byte) '\"');
            return;
        }
        if (value instanceof Double) {
            Double d = (Double) value;
            if (d.isNaN()) {
                out.write((byte) '\"');
                out.write(NaN);
                out.write((byte) '\"');
            } else if (d.isInfinite()) {
                out.write((byte) '\"');
                if (d == Double.NEGATIVE_INFINITY) {
                    out.write('-');
                }
                out.write(Infinite);
                out.write((byte) '\"');
            } else {
                writeAscii(out, value.toString());
            }
            return;
        }
        if (value instanceof Float) {
            Float f = (Float) value;
            if (f.isNaN()) {
                out.write((byte) '\"');
                out.write(NaN);
                out.write((byte) '\"');
            } else if (f.isInfinite()) {
                out.write((byte) '\"');
                if (f == Float.NEGATIVE_INFINITY) {
                    out.write('-');
                }
                out.write(Infinite);
                out.write((byte) '\"');
            } else {
                writeAscii(out, value.toString());
            }
            return;
        }
        if (value instanceof Number) {
            writeAscii(out, value.toString());
        }
        if (value instanceof Boolean) {
            if ((boolean) value) {
                out.write(TRUE);
            } else {
                out.write(FALSE);
            }
        }
    }

    private static void writeUtf8(OutputAccessor out, String string) {
        writeUtf8(out, string, string.length());
    }

    /**
     * Fast-Path ASCII implementation.
     */
    private static void writeAscii(OutputAccessor out, CharSequence seq) {
        // We can use the _set methods as these not need to do any index checks and reference checks.
        // This is possible as we called ensureWritable(...) before.
        for (int i = 0; i < seq.length(); i++) {
            out.write((byte) seq.charAt(i));
        }
    }

    /**
     * Fast-Path UTF-8 implementation.
     */
    private static void writeUtf8(OutputAccessor out, CharSequence seq, int len) {
        // We can use the _set methods as these not need to do any index checks and reference checks.
        // This is possible as we called ensureWritable(...) before.
        for (int i = 0; i < len; i++) {
            char c = seq.charAt(i);
            switch(c) {
                case '\b':
                    out.write(B);
                    continue;
                case '\t':
                    out.write(T);
                    continue;
                case '\n':
                    out.write(N);
                    continue;
                case '\f':
                    out.write(F);
                    continue;
                case '\r':
                    out.write(R);
                    continue;
                case '\"':
                    out.write(QUOT);
                    continue;
                case '\\':
                    out.write(BSLASH);
                    continue;
            }
            if (c < 0x20) {
                escape(out, c);
            } else if (c < 0x80) {
                out.write((byte) c);
            } else if (c < 0x800) {
                out.write((byte) (0xc0 | (c >> 6)));
                out.write((byte) (0x80 | (c & 0x3f)));
            } else if (isSurrogate(c)) {
                if (!Character.isHighSurrogate(c)) {
                    out.write(WRITE_UTF_UNKNOWN);
                    continue;
                }
                final char c2;
                try {
                    // Surrogate Pair consumes 2 characters. Optimistically try to get the next character to avoid
                    // duplicate bounds checking with charAt. If an IndexOutOfBoundsException is thrown we will
                    // re-throw a more informative exception describing the problem.
                    c2 = seq.charAt(++i);
                } catch (IndexOutOfBoundsException e) {
                    out.write(WRITE_UTF_UNKNOWN);
                    break;
                }
                if (!Character.isLowSurrogate(c2)) {
                    out.write(WRITE_UTF_UNKNOWN);
                    out.write((byte) (Character.isHighSurrogate(c2) ? WRITE_UTF_UNKNOWN : c2));
                    continue;
                }
                int codePoint = Character.toCodePoint(c, c2);
                // See http://www.unicode.org/versions/Unicode7.0.0/ch03.pdf#G2630.
                escape(out, c);
                escape(out, codePoint);
            } else {
                out.write((byte) (0xe0 | (c >> 12)));
                out.write((byte) (0x80 | ((c >> 6) & 0x3f)));
                out.write((byte) (0x80 | (c & 0x3f)));
            }
        }
    }

    /**
     * Write a UTF escape sequence using either an one or two-byte seqience.
     *
     * @param out the output
     * @param charToEscape the character to escape.
     */
    private static void escape(OutputAccessor out, int charToEscape) {
        out.write('\\');
        out.write('u');
        if (charToEscape > 0xFF) {
            int hi = (charToEscape >> 8) & 0xFF;
            itest("dev", 295).given(charToEscape, 56078).checkEq(hi, 219);
            itest("dev", 295).given(charToEscape, 765015).checkEq(hi, 172);
            itest("dev", 295).given(charToEscape, 55408).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55391).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55296).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 67932).checkEq(hi, 9);
            itest("dev", 295).given(charToEscape, 55351).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55396).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 851028).checkEq(hi, 252);
            itest("dev", 295).given(charToEscape, 379005).checkEq(hi, 200);
            itest("dev", 295).given(charToEscape, 691296).checkEq(hi, 140);
            itest("dev", 295).given(charToEscape, 802861).checkEq(hi, 64);
            itest("dev", 295).given(charToEscape, 114491).checkEq(hi, 191);
            itest("dev", 295).given(charToEscape, 265296).checkEq(hi, 12);
            itest("dev", 295).given(charToEscape, 188271).checkEq(hi, 223);
            itest("dev", 295).given(charToEscape, 55304).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 622714).checkEq(hi, 128);
            itest("dev", 295).given(charToEscape, 55445).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 107538).checkEq(hi, 164);
            itest("dev", 295).given(charToEscape, 95651).checkEq(hi, 117);
            itest("dev", 295).given(charToEscape, 277571).checkEq(hi, 60);
            itest("dev", 295).given(charToEscape, 55313).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 74246).checkEq(hi, 34);
            itest("dev", 295).given(charToEscape, 906366).checkEq(hi, 212);
            itest("dev", 295).given(charToEscape, 55369).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55853).checkEq(hi, 218);
            itest("dev", 295).given(charToEscape, 121952).checkEq(hi, 220);
            itest("dev", 295).given(charToEscape, 55343).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 675882).checkEq(hi, 80);
            itest("dev", 295).given(charToEscape, 55900).checkEq(hi, 218);
            itest("dev", 295).given(charToEscape, 55764).checkEq(hi, 217);
            itest("dev", 295).given(charToEscape, 361569).checkEq(hi, 132);
            itest("dev", 295).given(charToEscape, 56016).checkEq(hi, 218);
            itest("dev", 295).given(charToEscape, 544802).checkEq(hi, 80);
            itest("dev", 295).given(charToEscape, 311343).checkEq(hi, 192);
            itest("dev", 295).given(charToEscape, 55368).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55662).checkEq(hi, 217);
            itest("dev", 295).given(charToEscape, 82961).checkEq(hi, 68);
            itest("dev", 295).given(charToEscape, 55415).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55395).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 913410).checkEq(hi, 240);
            itest("dev", 295).given(charToEscape, 55675).checkEq(hi, 217);
            itest("dev", 295).given(charToEscape, 55382).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55503).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 139777).checkEq(hi, 34);
            itest("dev", 295).given(charToEscape, 55377).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 168637).checkEq(hi, 146);
            itest("dev", 295).given(charToEscape, 55979).checkEq(hi, 218);
            itest("dev", 295).given(charToEscape, 136915).checkEq(hi, 22);
            itest("dev", 295).given(charToEscape, 525338).checkEq(hi, 4);
            itest("dev", 295).given(charToEscape, 55840).checkEq(hi, 218);
            itest("dev", 295).given(charToEscape, 55350).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 389126).checkEq(hi, 240);
            itest("dev", 295).given(charToEscape, 218207).checkEq(hi, 84);
            itest("dev", 295).given(charToEscape, 55409).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55325).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 636017).checkEq(hi, 180);
            itest("dev", 295).given(charToEscape, 55365).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55400).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55704).checkEq(hi, 217);
            itest("dev", 295).given(charToEscape, 55585).checkEq(hi, 217);
            itest("dev", 295).given(charToEscape, 483383).checkEq(hi, 96);
            itest("dev", 295).given(charToEscape, 684085).checkEq(hi, 112);
            itest("dev", 295).given(charToEscape, 56124).checkEq(hi, 219);
            itest("dev", 295).given(charToEscape, 55892).checkEq(hi, 218);
            itest("dev", 295).given(charToEscape, 181176).checkEq(hi, 195);
            itest("dev", 295).given(charToEscape, 742419).checkEq(hi, 84);
            itest("dev", 295).given(charToEscape, 55957).checkEq(hi, 218);
            itest("dev", 295).given(charToEscape, 56117).checkEq(hi, 219);
            itest("dev", 295).given(charToEscape, 106324).checkEq(hi, 159);
            itest("dev", 295).given(charToEscape, 55612).checkEq(hi, 217);
            itest("dev", 295).given(charToEscape, 185138).checkEq(hi, 211);
            itest("dev", 295).given(charToEscape, 453708).checkEq(hi, 236);
            itest("dev", 295).given(charToEscape, 120890).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55412).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55337).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 172619).checkEq(hi, 162);
            itest("dev", 295).given(charToEscape, 167652).checkEq(hi, 142);
            itest("dev", 295).given(charToEscape, 55536).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 181533).checkEq(hi, 197);
            itest("dev", 295).given(charToEscape, 866399).checkEq(hi, 56);
            itest("dev", 295).given(charToEscape, 55745).checkEq(hi, 217);
            itest("dev", 295).given(charToEscape, 163111).checkEq(hi, 125);
            itest("dev", 295).given(charToEscape, 146950).checkEq(hi, 62);
            itest("dev", 295).given(charToEscape, 77593).checkEq(hi, 47);
            itest("dev", 295).given(charToEscape, 65798).checkEq(hi, 1);
            itest("dev", 295).given(charToEscape, 55434).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 154407).checkEq(hi, 91);
            itest("dev", 295).given(charToEscape, 206910).checkEq(hi, 40);
            itest("dev", 295).given(charToEscape, 55298).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 440359).checkEq(hi, 184);
            itest("dev", 295).given(charToEscape, 55335).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55375).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 148970).checkEq(hi, 69);
            itest("dev", 295).given(charToEscape, 140557).checkEq(hi, 37);
            itest("dev", 295).given(charToEscape, 55602).checkEq(hi, 217);
            itest("dev", 295).given(charToEscape, 55491).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 55907).checkEq(hi, 218);
            itest("dev", 295).given(charToEscape, 55307).checkEq(hi, 216);
            itest("dev", 295).given(charToEscape, 163802).checkEq(hi, 127);
            itest("dev", 295).given(charToEscape, 56063).checkEq(hi, 218);
            out.write(HEX_BYTES[hi >> 4]);
            out.write(HEX_BYTES[hi & 0xF]);
            charToEscape &= 0xFF;
            itest("dev", 298).given(charToEscape, 55853).checkEq(charToEscape, 45);
            itest("dev", 298).given(charToEscape, 55764).checkEq(charToEscape, 212);
            itest("dev", 298).given(charToEscape, 440359).checkEq(charToEscape, 39);
            itest("dev", 298).given(charToEscape, 55585).checkEq(charToEscape, 33);
            itest("dev", 298).given(charToEscape, 55612).checkEq(charToEscape, 60);
            itest("dev", 298).given(charToEscape, 163802).checkEq(charToEscape, 218);
            itest("dev", 298).given(charToEscape, 866399).checkEq(charToEscape, 95);
            itest("dev", 298).given(charToEscape, 55409).checkEq(charToEscape, 113);
            itest("dev", 298).given(charToEscape, 172619).checkEq(charToEscape, 75);
            itest("dev", 298).given(charToEscape, 77593).checkEq(charToEscape, 25);
            itest("dev", 298).given(charToEscape, 765015).checkEq(charToEscape, 87);
            itest("dev", 298).given(charToEscape, 55395).checkEq(charToEscape, 99);
            itest("dev", 298).given(charToEscape, 185138).checkEq(charToEscape, 50);
            itest("dev", 298).given(charToEscape, 106324).checkEq(charToEscape, 84);
            itest("dev", 298).given(charToEscape, 55840).checkEq(charToEscape, 32);
            itest("dev", 298).given(charToEscape, 218207).checkEq(charToEscape, 95);
            itest("dev", 298).given(charToEscape, 56063).checkEq(charToEscape, 255);
            itest("dev", 298).given(charToEscape, 55382).checkEq(charToEscape, 86);
            itest("dev", 298).given(charToEscape, 277571).checkEq(charToEscape, 67);
            itest("dev", 298).given(charToEscape, 55296).checkEq(charToEscape, 0);
            itest("dev", 298).given(charToEscape, 55907).checkEq(charToEscape, 99);
            itest("dev", 298).given(charToEscape, 55368).checkEq(charToEscape, 72);
            itest("dev", 298).given(charToEscape, 56124).checkEq(charToEscape, 60);
            itest("dev", 298).given(charToEscape, 136915).checkEq(charToEscape, 211);
            itest("dev", 298).given(charToEscape, 311343).checkEq(charToEscape, 47);
            itest("dev", 298).given(charToEscape, 55335).checkEq(charToEscape, 39);
            itest("dev", 298).given(charToEscape, 55400).checkEq(charToEscape, 104);
            itest("dev", 298).given(charToEscape, 525338).checkEq(charToEscape, 26);
            itest("dev", 298).given(charToEscape, 154407).checkEq(charToEscape, 39);
            itest("dev", 298).given(charToEscape, 55900).checkEq(charToEscape, 92);
            itest("dev", 298).given(charToEscape, 181176).checkEq(charToEscape, 184);
            itest("dev", 298).given(charToEscape, 622714).checkEq(charToEscape, 122);
            itest("dev", 298).given(charToEscape, 483383).checkEq(charToEscape, 55);
            itest("dev", 298).given(charToEscape, 114491).checkEq(charToEscape, 59);
            itest("dev", 298).given(charToEscape, 206910).checkEq(charToEscape, 62);
            itest("dev", 298).given(charToEscape, 55325).checkEq(charToEscape, 29);
            itest("dev", 298).given(charToEscape, 55704).checkEq(charToEscape, 152);
            itest("dev", 298).given(charToEscape, 163111).checkEq(charToEscape, 39);
            itest("dev", 298).given(charToEscape, 379005).checkEq(charToEscape, 125);
            itest("dev", 298).given(charToEscape, 55662).checkEq(charToEscape, 110);
            itest("dev", 298).given(charToEscape, 55391).checkEq(charToEscape, 95);
            itest("dev", 298).given(charToEscape, 675882).checkEq(charToEscape, 42);
            itest("dev", 298).given(charToEscape, 107538).checkEq(charToEscape, 18);
            itest("dev", 298).given(charToEscape, 742419).checkEq(charToEscape, 19);
            itest("dev", 298).given(charToEscape, 55412).checkEq(charToEscape, 116);
            itest("dev", 298).given(charToEscape, 851028).checkEq(charToEscape, 84);
            itest("dev", 298).given(charToEscape, 120890).checkEq(charToEscape, 58);
            itest("dev", 298).given(charToEscape, 55892).checkEq(charToEscape, 84);
            itest("dev", 298).given(charToEscape, 55536).checkEq(charToEscape, 240);
            itest("dev", 298).given(charToEscape, 55675).checkEq(charToEscape, 123);
            itest("dev", 298).given(charToEscape, 544802).checkEq(charToEscape, 34);
            itest("dev", 298).given(charToEscape, 55304).checkEq(charToEscape, 8);
            itest("dev", 298).given(charToEscape, 55298).checkEq(charToEscape, 2);
            itest("dev", 298).given(charToEscape, 55375).checkEq(charToEscape, 79);
            itest("dev", 298).given(charToEscape, 55313).checkEq(charToEscape, 17);
            itest("dev", 298).given(charToEscape, 74246).checkEq(charToEscape, 6);
            itest("dev", 298).given(charToEscape, 56078).checkEq(charToEscape, 14);
            itest("dev", 298).given(charToEscape, 55503).checkEq(charToEscape, 207);
            itest("dev", 298).given(charToEscape, 55408).checkEq(charToEscape, 112);
            itest("dev", 298).given(charToEscape, 55365).checkEq(charToEscape, 69);
            itest("dev", 298).given(charToEscape, 67932).checkEq(charToEscape, 92);
            itest("dev", 298).given(charToEscape, 906366).checkEq(charToEscape, 126);
            itest("dev", 298).given(charToEscape, 55396).checkEq(charToEscape, 100);
            itest("dev", 298).given(charToEscape, 361569).checkEq(charToEscape, 97);
            itest("dev", 298).given(charToEscape, 55745).checkEq(charToEscape, 193);
            itest("dev", 298).given(charToEscape, 56117).checkEq(charToEscape, 53);
            itest("dev", 298).given(charToEscape, 55350).checkEq(charToEscape, 54);
            itest("dev", 298).given(charToEscape, 636017).checkEq(charToEscape, 113);
            itest("dev", 298).given(charToEscape, 55351).checkEq(charToEscape, 55);
            itest("dev", 298).given(charToEscape, 139777).checkEq(charToEscape, 1);
            itest("dev", 298).given(charToEscape, 55337).checkEq(charToEscape, 41);
            itest("dev", 298).given(charToEscape, 140557).checkEq(charToEscape, 13);
            itest("dev", 298).given(charToEscape, 55979).checkEq(charToEscape, 171);
            itest("dev", 298).given(charToEscape, 55957).checkEq(charToEscape, 149);
            itest("dev", 298).given(charToEscape, 55415).checkEq(charToEscape, 119);
            itest("dev", 298).given(charToEscape, 146950).checkEq(charToEscape, 6);
            itest("dev", 298).given(charToEscape, 181533).checkEq(charToEscape, 29);
            itest("dev", 298).given(charToEscape, 265296).checkEq(charToEscape, 80);
            itest("dev", 298).given(charToEscape, 802861).checkEq(charToEscape, 45);
            itest("dev", 298).given(charToEscape, 167652).checkEq(charToEscape, 228);
            itest("dev", 298).given(charToEscape, 55445).checkEq(charToEscape, 149);
            itest("dev", 298).given(charToEscape, 389126).checkEq(charToEscape, 6);
            itest("dev", 298).given(charToEscape, 55602).checkEq(charToEscape, 50);
            itest("dev", 298).given(charToEscape, 65798).checkEq(charToEscape, 6);
            itest("dev", 298).given(charToEscape, 55343).checkEq(charToEscape, 47);
            itest("dev", 298).given(charToEscape, 913410).checkEq(charToEscape, 2);
            itest("dev", 298).given(charToEscape, 56016).checkEq(charToEscape, 208);
            itest("dev", 298).given(charToEscape, 148970).checkEq(charToEscape, 234);
            itest("dev", 298).given(charToEscape, 188271).checkEq(charToEscape, 111);
            itest("dev", 298).given(charToEscape, 684085).checkEq(charToEscape, 53);
            itest("dev", 298).given(charToEscape, 55491).checkEq(charToEscape, 195);
            itest("dev", 298).given(charToEscape, 55377).checkEq(charToEscape, 81);
            itest("dev", 298).given(charToEscape, 82961).checkEq(charToEscape, 17);
            itest("dev", 298).given(charToEscape, 95651).checkEq(charToEscape, 163);
            itest("dev", 298).given(charToEscape, 55307).checkEq(charToEscape, 11);
            itest("dev", 298).given(charToEscape, 121952).checkEq(charToEscape, 96);
            itest("dev", 298).given(charToEscape, 168637).checkEq(charToEscape, 189);
            itest("dev", 298).given(charToEscape, 691296).checkEq(charToEscape, 96);
            itest("dev", 298).given(charToEscape, 55434).checkEq(charToEscape, 138);
            itest("dev", 298).given(charToEscape, 55369).checkEq(charToEscape, 73);
            itest("dev", 298).given(charToEscape, 453708).checkEq(charToEscape, 76);
        } else {
            out.write((byte) '0');
            out.write((byte) '0');
        }
        // We know it's a control char, so only the last 2 chars are non-0
        out.write(HEX_BYTES[charToEscape >> 4]);
        out.write(HEX_BYTES[charToEscape & 0xF]);
    }

    /**
     * Determine if {@code c} lies within the range of values defined for
     * <a href="http://unicode.org/glossary/#surrogate_code_point">Surrogate Code Point</a>.
     *
     * @param c the character to check.
     * @return {@code true} if {@code c} lies within the range of values defined for
     *         <a href="http://unicode.org/glossary/#surrogate_code_point">Surrogate Code Point</a>. {@code false} otherwise.
     */
    private static boolean isSurrogate(char c) {
        return c >= '\uD800' && c <= '\uDFFF';
    }
}
