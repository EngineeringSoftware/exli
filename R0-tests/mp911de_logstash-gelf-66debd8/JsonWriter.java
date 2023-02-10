package biz.paluch.logging.gelf.intern;

import java.util.Map;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
            new Here("Unit", 295).given(charToEscape, 90819).checkEq(hi, 98);
            new Here("Unit", 295).given(charToEscape, 55475).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 479233).checkEq(hi, 80);
            new Here("Unit", 295).given(charToEscape, 835690).checkEq(hi, 192);
            new Here("Unit", 295).given(charToEscape, 166434).checkEq(hi, 138);
            new Here("Unit", 295).given(charToEscape, 55573).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 56012).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 792632).checkEq(hi, 24);
            new Here("Unit", 295).given(charToEscape, 55665).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 55405).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 108109).checkEq(hi, 166);
            new Here("Unit", 295).given(charToEscape, 122163).checkEq(hi, 221);
            new Here("Unit", 295).given(charToEscape, 55375).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 117934).checkEq(hi, 204);
            new Here("Unit", 295).given(charToEscape, 341005).checkEq(hi, 52);
            new Here("Unit", 295).given(charToEscape, 78934).checkEq(hi, 52);
            new Here("Unit", 295).given(charToEscape, 895014).checkEq(hi, 168);
            new Here("Unit", 295).given(charToEscape, 653438).checkEq(hi, 248);
            new Here("Unit", 295).given(charToEscape, 55635).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 141215).checkEq(hi, 39);
            new Here("Unit", 295).given(charToEscape, 80671).checkEq(hi, 59);
            new Here("Unit", 295).given(charToEscape, 55391).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 89133).checkEq(hi, 92);
            new Here("Unit", 295).given(charToEscape, 55870).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 690261).checkEq(hi, 136);
            new Here("Unit", 295).given(charToEscape, 56190).checkEq(hi, 219);
            new Here("Unit", 295).given(charToEscape, 163197).checkEq(hi, 125);
            new Here("Unit", 295).given(charToEscape, 55320).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 147517).checkEq(hi, 64);
            new Here("Unit", 295).given(charToEscape, 661554).checkEq(hi, 24);
            new Here("Unit", 295).given(charToEscape, 55783).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 55296).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 141204).checkEq(hi, 39);
            new Here("Unit", 295).given(charToEscape, 65777).checkEq(hi, 0);
            new Here("Unit", 295).given(charToEscape, 55581).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 144681).checkEq(hi, 53);
            new Here("Unit", 295).given(charToEscape, 55347).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 311308).checkEq(hi, 192);
            new Here("Unit", 295).given(charToEscape, 349260).checkEq(hi, 84);
            new Here("Unit", 295).given(charToEscape, 55490).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55906).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 963695).checkEq(hi, 180);
            new Here("Unit", 295).given(charToEscape, 56006).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 55700).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 248935).checkEq(hi, 204);
            new Here("Unit", 295).given(charToEscape, 264238).checkEq(hi, 8);
            new Here("Unit", 295).given(charToEscape, 176702).checkEq(hi, 178);
            new Here("Unit", 295).given(charToEscape, 981075).checkEq(hi, 248);
            new Here("Unit", 295).given(charToEscape, 82943).checkEq(hi, 67);
            new Here("Unit", 295).given(charToEscape, 55373).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 443433).checkEq(hi, 196);
            new Here("Unit", 295).given(charToEscape, 55318).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55386).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 564309).checkEq(hi, 156);
            new Here("Unit", 295).given(charToEscape, 55565).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 357407).checkEq(hi, 116);
            new Here("Unit", 295).given(charToEscape, 185405).checkEq(hi, 212);
            new Here("Unit", 295).given(charToEscape, 146854).checkEq(hi, 61);
            new Here("Unit", 295).given(charToEscape, 55309).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 649228).checkEq(hi, 232);
            new Here("Unit", 295).given(charToEscape, 55404).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55319).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55394).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55664).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 114699).checkEq(hi, 192);
            new Here("Unit", 295).given(charToEscape, 55344).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 311369).checkEq(hi, 192);
            new Here("Unit", 295).given(charToEscape, 567356).checkEq(hi, 168);
            new Here("Unit", 295).given(charToEscape, 55354).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 56106).checkEq(hi, 219);
            new Here("Unit", 295).given(charToEscape, 55574).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 56048).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 55536).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55786).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 55882).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 124989).checkEq(hi, 232);
            new Here("Unit", 295).given(charToEscape, 361554).checkEq(hi, 132);
            new Here("Unit", 295).given(charToEscape, 442431).checkEq(hi, 192);
            new Here("Unit", 295).given(charToEscape, 665638).checkEq(hi, 40);
            new Here("Unit", 295).given(charToEscape, 55369).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 177165).checkEq(hi, 180);
            new Here("Unit", 295).given(charToEscape, 88076).checkEq(hi, 88);
            new Here("Unit", 295).given(charToEscape, 55376).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55310).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 56173).checkEq(hi, 219);
            new Here("Unit", 295).given(charToEscape, 71431).checkEq(hi, 23);
            new Here("Unit", 295).given(charToEscape, 350253).checkEq(hi, 88);
            new Here("Unit", 295).given(charToEscape, 608292).checkEq(hi, 72);
            new Here("Unit", 295).given(charToEscape, 55866).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 798723).checkEq(hi, 48);
            new Here("Unit", 295).given(charToEscape, 55351).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55337).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55826).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 412721).checkEq(hi, 76);
            new Here("Unit", 295).given(charToEscape, 55301).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55413).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55878).checkEq(hi, 218);
            new Here("Unit", 295).given(charToEscape, 55312).checkEq(hi, 216);
            new Here("Unit", 295).given(charToEscape, 55585).checkEq(hi, 217);
            new Here("Unit", 295).given(charToEscape, 158228).checkEq(hi, 106);
            out.write(HEX_BYTES[hi >> 4]);
            out.write(HEX_BYTES[hi & 0xF]);
            charToEscape &= 0xFF;
            new Here("Unit", 298).given(charToEscape, 981075).checkEq(charToEscape, 83);
            new Here("Unit", 298).given(charToEscape, 177165).checkEq(charToEscape, 13);
            new Here("Unit", 298).given(charToEscape, 56012).checkEq(charToEscape, 204);
            new Here("Unit", 298).given(charToEscape, 665638).checkEq(charToEscape, 38);
            new Here("Unit", 298).given(charToEscape, 55312).checkEq(charToEscape, 16);
            new Here("Unit", 298).given(charToEscape, 55405).checkEq(charToEscape, 109);
            new Here("Unit", 298).given(charToEscape, 56173).checkEq(charToEscape, 109);
            new Here("Unit", 298).given(charToEscape, 55565).checkEq(charToEscape, 13);
            new Here("Unit", 298).given(charToEscape, 55347).checkEq(charToEscape, 51);
            new Here("Unit", 298).given(charToEscape, 835690).checkEq(charToEscape, 106);
            new Here("Unit", 298).given(charToEscape, 146854).checkEq(charToEscape, 166);
            new Here("Unit", 298).given(charToEscape, 65777).checkEq(charToEscape, 241);
            new Here("Unit", 298).given(charToEscape, 55375).checkEq(charToEscape, 79);
            new Here("Unit", 298).given(charToEscape, 311369).checkEq(charToEscape, 73);
            new Here("Unit", 298).given(charToEscape, 311308).checkEq(charToEscape, 12);
            new Here("Unit", 298).given(charToEscape, 55882).checkEq(charToEscape, 74);
            new Here("Unit", 298).given(charToEscape, 82943).checkEq(charToEscape, 255);
            new Here("Unit", 298).given(charToEscape, 108109).checkEq(charToEscape, 77);
            new Here("Unit", 298).given(charToEscape, 141215).checkEq(charToEscape, 159);
            new Here("Unit", 298).given(charToEscape, 567356).checkEq(charToEscape, 60);
            new Here("Unit", 298).given(charToEscape, 55536).checkEq(charToEscape, 240);
            new Here("Unit", 298).given(charToEscape, 80671).checkEq(charToEscape, 31);
            new Here("Unit", 298).given(charToEscape, 350253).checkEq(charToEscape, 45);
            new Here("Unit", 298).given(charToEscape, 55296).checkEq(charToEscape, 0);
            new Here("Unit", 298).given(charToEscape, 78934).checkEq(charToEscape, 86);
            new Here("Unit", 298).given(charToEscape, 55373).checkEq(charToEscape, 77);
            new Here("Unit", 298).given(charToEscape, 264238).checkEq(charToEscape, 46);
            new Here("Unit", 298).given(charToEscape, 55906).checkEq(charToEscape, 98);
            new Here("Unit", 298).given(charToEscape, 55320).checkEq(charToEscape, 24);
            new Here("Unit", 298).given(charToEscape, 55866).checkEq(charToEscape, 58);
            new Here("Unit", 298).given(charToEscape, 158228).checkEq(charToEscape, 20);
            new Here("Unit", 298).given(charToEscape, 608292).checkEq(charToEscape, 36);
            new Here("Unit", 298).given(charToEscape, 357407).checkEq(charToEscape, 31);
            new Here("Unit", 298).given(charToEscape, 56048).checkEq(charToEscape, 240);
            new Here("Unit", 298).given(charToEscape, 163197).checkEq(charToEscape, 125);
            new Here("Unit", 298).given(charToEscape, 412721).checkEq(charToEscape, 49);
            new Here("Unit", 298).given(charToEscape, 147517).checkEq(charToEscape, 61);
            new Here("Unit", 298).given(charToEscape, 55369).checkEq(charToEscape, 73);
            new Here("Unit", 298).given(charToEscape, 90819).checkEq(charToEscape, 195);
            new Here("Unit", 298).given(charToEscape, 55386).checkEq(charToEscape, 90);
            new Here("Unit", 298).given(charToEscape, 56190).checkEq(charToEscape, 126);
            new Here("Unit", 298).given(charToEscape, 89133).checkEq(charToEscape, 45);
            new Here("Unit", 298).given(charToEscape, 55700).checkEq(charToEscape, 148);
            new Here("Unit", 298).given(charToEscape, 185405).checkEq(charToEscape, 61);
            new Here("Unit", 298).given(charToEscape, 55783).checkEq(charToEscape, 231);
            new Here("Unit", 298).given(charToEscape, 55319).checkEq(charToEscape, 23);
            new Here("Unit", 298).given(charToEscape, 55301).checkEq(charToEscape, 5);
            new Here("Unit", 298).given(charToEscape, 55354).checkEq(charToEscape, 58);
            new Here("Unit", 298).given(charToEscape, 55878).checkEq(charToEscape, 70);
            new Here("Unit", 298).given(charToEscape, 653438).checkEq(charToEscape, 126);
            new Here("Unit", 298).given(charToEscape, 124989).checkEq(charToEscape, 61);
            new Here("Unit", 298).given(charToEscape, 55351).checkEq(charToEscape, 55);
            new Here("Unit", 298).given(charToEscape, 341005).checkEq(charToEscape, 13);
            new Here("Unit", 298).given(charToEscape, 55826).checkEq(charToEscape, 18);
            new Here("Unit", 298).given(charToEscape, 55413).checkEq(charToEscape, 117);
            new Here("Unit", 298).given(charToEscape, 166434).checkEq(charToEscape, 34);
            new Here("Unit", 298).given(charToEscape, 55786).checkEq(charToEscape, 234);
            new Here("Unit", 298).given(charToEscape, 56106).checkEq(charToEscape, 42);
            new Here("Unit", 298).given(charToEscape, 55404).checkEq(charToEscape, 108);
            new Here("Unit", 298).given(charToEscape, 479233).checkEq(charToEscape, 1);
            new Here("Unit", 298).given(charToEscape, 564309).checkEq(charToEscape, 85);
            new Here("Unit", 298).given(charToEscape, 55344).checkEq(charToEscape, 48);
            new Here("Unit", 298).given(charToEscape, 122163).checkEq(charToEscape, 51);
            new Here("Unit", 298).given(charToEscape, 88076).checkEq(charToEscape, 12);
            new Here("Unit", 298).given(charToEscape, 661554).checkEq(charToEscape, 50);
            new Here("Unit", 298).given(charToEscape, 792632).checkEq(charToEscape, 56);
            new Here("Unit", 298).given(charToEscape, 55635).checkEq(charToEscape, 83);
            new Here("Unit", 298).given(charToEscape, 443433).checkEq(charToEscape, 41);
            new Here("Unit", 298).given(charToEscape, 114699).checkEq(charToEscape, 11);
            new Here("Unit", 298).given(charToEscape, 71431).checkEq(charToEscape, 7);
            new Here("Unit", 298).given(charToEscape, 963695).checkEq(charToEscape, 111);
            new Here("Unit", 298).given(charToEscape, 144681).checkEq(charToEscape, 41);
            new Here("Unit", 298).given(charToEscape, 55394).checkEq(charToEscape, 98);
            new Here("Unit", 298).given(charToEscape, 55318).checkEq(charToEscape, 22);
            new Here("Unit", 298).given(charToEscape, 55391).checkEq(charToEscape, 95);
            new Here("Unit", 298).given(charToEscape, 895014).checkEq(charToEscape, 38);
            new Here("Unit", 298).given(charToEscape, 55573).checkEq(charToEscape, 21);
            new Here("Unit", 298).given(charToEscape, 798723).checkEq(charToEscape, 3);
            new Here("Unit", 298).given(charToEscape, 649228).checkEq(charToEscape, 12);
            new Here("Unit", 298).given(charToEscape, 55870).checkEq(charToEscape, 62);
            new Here("Unit", 298).given(charToEscape, 55574).checkEq(charToEscape, 22);
            new Here("Unit", 298).given(charToEscape, 56006).checkEq(charToEscape, 198);
            new Here("Unit", 298).given(charToEscape, 361554).checkEq(charToEscape, 82);
            new Here("Unit", 298).given(charToEscape, 55581).checkEq(charToEscape, 29);
            new Here("Unit", 298).given(charToEscape, 55337).checkEq(charToEscape, 41);
            new Here("Unit", 298).given(charToEscape, 690261).checkEq(charToEscape, 85);
            new Here("Unit", 298).given(charToEscape, 55490).checkEq(charToEscape, 194);
            new Here("Unit", 298).given(charToEscape, 117934).checkEq(charToEscape, 174);
            new Here("Unit", 298).given(charToEscape, 248935).checkEq(charToEscape, 103);
            new Here("Unit", 298).given(charToEscape, 141204).checkEq(charToEscape, 148);
            new Here("Unit", 298).given(charToEscape, 55664).checkEq(charToEscape, 112);
            new Here("Unit", 298).given(charToEscape, 55585).checkEq(charToEscape, 33);
            new Here("Unit", 298).given(charToEscape, 55376).checkEq(charToEscape, 80);
            new Here("Unit", 298).given(charToEscape, 55665).checkEq(charToEscape, 113);
            new Here("Unit", 298).given(charToEscape, 55310).checkEq(charToEscape, 14);
            new Here("Unit", 298).given(charToEscape, 176702).checkEq(charToEscape, 62);
            new Here("Unit", 298).given(charToEscape, 55475).checkEq(charToEscape, 179);
            new Here("Unit", 298).given(charToEscape, 349260).checkEq(charToEscape, 76);
            new Here("Unit", 298).given(charToEscape, 55309).checkEq(charToEscape, 13);
            new Here("Unit", 298).given(charToEscape, 442431).checkEq(charToEscape, 63);
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
