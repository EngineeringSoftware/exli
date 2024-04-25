package com.mpatric.mp3agic;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class EncodedText {

    public static final byte TEXT_ENCODING_ISO_8859_1 = 0;

    public static final byte TEXT_ENCODING_UTF_16 = 1;

    public static final byte TEXT_ENCODING_UTF_16BE = 2;

    public static final byte TEXT_ENCODING_UTF_8 = 3;

    public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";

    public static final String CHARSET_UTF_16 = "UTF-16LE";

    public static final String CHARSET_UTF_16BE = "UTF-16BE";

    public static final String CHARSET_UTF_8 = "UTF-8";

    private static final String[] characterSets = { CHARSET_ISO_8859_1, CHARSET_UTF_16, CHARSET_UTF_16BE, CHARSET_UTF_8 };

    private static final byte[] textEncodingFallback = { 0, 2, 1, 3 };

    private static final byte[][] boms = { {}, { (byte) 0xff, (byte) 0xfe }, { (byte) 0xfe, (byte) 0xff }, {} };

    private static final byte[][] terminators = { { 0 }, { 0, 0 }, { 0, 0 }, { 0 } };

    private byte[] value;

    private byte textEncoding;

    public EncodedText(byte textEncoding, byte[] value) {
        // if encoding type 1 and big endian BOM is present, switch to big endian
        if ((textEncoding == TEXT_ENCODING_UTF_16) && (textEncodingForBytesFromBOM(value) == TEXT_ENCODING_UTF_16BE)) {
            this.textEncoding = TEXT_ENCODING_UTF_16BE;
        } else {
            this.textEncoding = textEncoding;
        }
        this.value = value;
        this.stripBomAndTerminator();
    }

    public EncodedText(String string) throws IllegalArgumentException {
        for (byte textEncoding : textEncodingFallback) {
            this.textEncoding = textEncoding;
            value = stringToBytes(string, characterSetForTextEncoding(textEncoding));
            if (value != null && this.toString() != null) {
                this.stripBomAndTerminator();
                return;
            }
        }
        throw new IllegalArgumentException("Invalid string, could not find appropriate encoding");
    }

    public EncodedText(String string, byte transcodeToTextEncoding) throws IllegalArgumentException, CharacterCodingException {
        this(string);
        setTextEncoding(transcodeToTextEncoding, true);
    }

    public EncodedText(byte textEncoding, String string) {
        this.textEncoding = textEncoding;
        value = stringToBytes(string, characterSetForTextEncoding(textEncoding));
        this.stripBomAndTerminator();
    }

    public EncodedText(byte[] value) {
        this(textEncodingForBytesFromBOM(value), value);
    }

    private static byte textEncodingForBytesFromBOM(byte[] value) {
        if (value.length >= 2 && value[0] == (byte) 0xff && value[1] == (byte) 0xfe) {
            return TEXT_ENCODING_UTF_16;
        } else if (value.length >= 2 && value[0] == (byte) 0xfe && value[1] == (byte) 0xff) {
            return TEXT_ENCODING_UTF_16BE;
        } else if (value.length >= 3 && (value[0] == (byte) 0xef && value[1] == (byte) 0xbb && value[2] == (byte) 0xbf)) {
            return TEXT_ENCODING_UTF_8;
        } else {
            return TEXT_ENCODING_ISO_8859_1;
        }
    }

    private static String characterSetForTextEncoding(byte textEncoding) {
        try {
            return characterSets[textEncoding];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Invalid text encoding " + textEncoding);
        }
    }

    private void stripBomAndTerminator() {
        int leadingCharsToRemove = 0;
        if (value.length >= 2 && ((value[0] == (byte) 0xfe && value[1] == (byte) 0xff) || (value[0] == (byte) 0xff && value[1] == (byte) 0xfe))) {
            leadingCharsToRemove = 2;
        } else if (value.length >= 3 && (value[0] == (byte) 0xef && value[1] == (byte) 0xbb && value[2] == (byte) 0xbf)) {
            leadingCharsToRemove = 3;
        }
        int trailingCharsToRemove = 0;
        byte[] terminator = terminators[textEncoding];
        if (value.length - leadingCharsToRemove >= terminator.length) {
            boolean haveTerminator = true;
            for (int i = 0; i < terminator.length; i++) {
                if (value[value.length - terminator.length + i] != terminator[i]) {
                    haveTerminator = false;
                    break;
                }
            }
            if (haveTerminator) {
                trailingCharsToRemove = terminator.length;
            }
        }
        if (leadingCharsToRemove + trailingCharsToRemove > 0) {
            int newLength = value.length - leadingCharsToRemove - trailingCharsToRemove;
            byte[] newValue = new byte[newLength];
            if (newLength > 0) {
                System.arraycopy(value, leadingCharsToRemove, newValue, 0, newValue.length);
            }
            value = newValue;
        }
    }

    public byte getTextEncoding() {
        return textEncoding;
    }

    public void setTextEncoding(byte textEncoding) throws CharacterCodingException {
        setTextEncoding(textEncoding, true);
    }

    public void setTextEncoding(byte textEncoding, boolean transcode) throws CharacterCodingException {
        if (this.textEncoding != textEncoding) {
            CharBuffer charBuffer = bytesToCharBuffer(this.value, characterSetForTextEncoding(this.textEncoding));
            byte[] transcodedBytes = charBufferToBytes(charBuffer, characterSetForTextEncoding(textEncoding));
            this.textEncoding = textEncoding;
            this.value = transcodedBytes;
        }
    }

    public byte[] getTerminator() {
        return terminators[textEncoding];
    }

    public byte[] toBytes() {
        return toBytes(false, false);
    }

    public byte[] toBytes(boolean includeBom) {
        return toBytes(includeBom, false);
    }

    public byte[] toBytes(boolean includeBom, boolean includeTerminator) {
        // ensured textEncoding is valid
        characterSetForTextEncoding(textEncoding);
        int newLength = value.length + (includeBom ? boms[textEncoding].length : 0) + (includeTerminator ? getTerminator().length : 0);
        if (newLength == value.length) {
            return value;
        } else {
            byte[] bytes = new byte[newLength];
            int i = 0;
            if (includeBom) {
                byte[] bom = boms[textEncoding];
                if (bom.length > 0) {
                    System.arraycopy(boms[textEncoding], 0, bytes, i, boms[textEncoding].length);
                    i += boms[textEncoding].length;
                }
            }
            if (value.length > 0) {
                System.arraycopy(value, 0, bytes, i, value.length);
                i += value.length;
            }
            if (includeTerminator) {
                byte[] terminator = getTerminator();
                if (terminator.length > 0) {
                    System.arraycopy(terminator, 0, bytes, i, terminator.length);
                }
            }
            return bytes;
        }
    }

    @Override
    public String toString() {
        try {
            return bytesToString(value, characterSetForTextEncoding(textEncoding));
        } catch (CharacterCodingException e) {
            return null;
        }
    }

    public String getCharacterSet() {
        return characterSetForTextEncoding(textEncoding);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + textEncoding;
        result = prime * result + Arrays.hashCode(value);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        EncodedText other = (EncodedText) obj;
        if (textEncoding != other.textEncoding) {
            return false;
        }
        if (!Arrays.equals(value, other.value)) {
            return false;
        }
        return true;
    }

    private static String bytesToString(byte[] bytes, String characterSet) throws CharacterCodingException {
        CharBuffer cbuf = bytesToCharBuffer(bytes, characterSet);
        String s = cbuf.toString();
        int length = s.indexOf(0);
        itest("dev", 236).given(s, "ENCODER").checkEq(length, -1);
        itest("evosuite", 236).given(s, "ALBUM1234567890123456789012345").checkEq(length, -1);
        itest("dev", 236).given(s, "I`m").checkEq(length, -1);
        itest("evosuite", 236).given(s, "3").checkEq(length, -1);
        itest("evosuite", 236).given(s, "mbb!B").checkEq(length, -1);
        itest("randoop", 236).given(s, "[com.mpatric.mp3agic.BaseException: UTF-16BE]").checkEq(length, -1);
        itest("dev", 236).given(s, "start").checkEq(length, -1);
        itest("dev", 236).given(s, "\u03C3\u03BF\u03C5").checkEq(length, -1);
        itest("dev", 236).given(s, "NAME1234567890123456789012345678901234567890").checkEq(length, -1);
        itest("evosuite", 236).given(s, "POPM").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TCON").checkEq(length, -1);
        itest("randoop", 236).given(s, "TP1").checkEq(length, -1);
        itest("dev", 236).given(s, "COPYRIGHT").checkEq(length, -1);
        itest("evosuite", 236).given(s, "COM").checkEq(length, -1);
        itest("evosuite", 236).given(s, ",").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WPAY").checkEq(length, -1);
        itest("randoop", 236).given(s, "").checkEq(length, -1);
        itest("randoop", 236).given(s, "TYER").checkEq(length, -1);
        itest("dev", 236).given(s, "iTunNORM").checkEq(length, -1);
        itest("randoop", 236).given(s, "WORS").checkEq(length, -1);
        itest("evosuite", 236).given(s, "W").checkEq(length, -1);
        itest("dev", 236).given(s, "This is a string!").checkEq(length, -1);
        itest("evosuite", 236).given(s, "ID3").checkEq(length, -1);
        itest("evosuite", 236).given(s, "nwAEV`-oYyQ1lU-Bi%").checkEq(length, -1);
        itest("evosuite", 236).given(s, "APIC").checkEq(length, -1);
        itest("randoop", 236).given(s, "TCMP").checkEq(length, -1);
        itest("randoop", 236).given(s, "None").checkEq(length, -1);
        itest("evosuite", 236).given(s, "PIC").checkEq(length, -1);
        itest("dev", 236).given(s, "ABCDEFGHIJKLMNOPQ").checkEq(length, -1);
        itest("randoop", 236).given(s, "Stereo").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TRK").checkEq(length, -1);
        itest("dev", 236).given(s, "PARTOFSET").checkEq(length, -1);
        itest("dev", 236).given(s, "KEY").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TOPE").checkEq(length, -1);
        itest("dev", 236).given(s, "84,78").checkEq(length, -1);
        itest("evosuite", 236).given(s, "'62I:G").checkEq(length, -1);
        itest("randoop", 236).given(s, "\u0006\n").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Contemporary Chr").checkEq(length, -1);
        itest("dev", 236).given(s, "").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WOAS").checkEq(length, -1);
        itest("dev", 236).given(s, "ALBUM1234567890123456789012345678901234567890").checkEq(length, -1);
        itest("evosuite", 236).given(s, "(492)").checkEq(length, -1);
        itest("randoop", 236).given(s, "TPUB").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TPA").checkEq(length, -1);
        itest("randoop", 236).given(s, "(13)Pop").checkEq(length, -1);
        itest("dev", 236).given(s, "\u03B9\u03AC").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TBPM").checkEq(length, -1);
        itest("dev", 236).given(s, "COMPOSER1234567890123456789012345678901234567890").checkEq(length, -1);
        itest("randoop", 236).given(s, "WOAF").checkEq(length, -1);
        itest("evosuite", 236).given(s, "0").checkEq(length, -1);
        itest("evosuite", 236).given(s, "(5)Funk").checkEq(length, -1);
        itest("dev", 236).given(s, "84.78").checkEq(length, -1);
        itest("randoop", 236).given(s, "TEN").checkEq(length, -1);
        itest("randoop", 236).given(s, "M/S stereo").checkEq(length, -1);
        itest("randoop", 236).given(s, "(5)Funk").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WPUB").checkEq(length, -1);
        itest("dev", 236).given(s, "GROUPING").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WCOP").checkEq(length, -1);
        itest("dev", 236).given(s, "5 seconds").checkEq(length, -1);
        itest("dev", 236).given(s, "ARTIST").checkEq(length, -1);
        itest("randoop", 236).given(s, "Windows Media Player 9 Series").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Pranks").checkEq(length, -1);
        itest("evosuite", 236).given(s, "jeuPZGsa").checkEq(length, -1);
        itest("randoop", 236).given(s, "TOA").checkEq(length, -1);
        itest("randoop", 236).given(s, "TCOP").checkEq(length, -1);
        itest("dev", 236).given(s, "Hello there").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TP2").checkEq(length, -1);
        itest("randoop", 236).given(s, "http://github.com/mpatric/mp3agic").checkEq(length, -1);
        itest("dev", 236).given(s, "(8)Jazz").checkEq(length, -1);
        itest("dev", 236).given(s, "COPYRIGHT2345678901234567890123").checkEq(length, -1);
        itest("randoop", 236).given(s, "TKEY").checkEq(length, -1);
        itest("dev", 236).given(s, "ORIGINALARTIST").checkEq(length, -1);
        itest("randoop", 236).given(s, "TCP").checkEq(length, -1);
        itest("randoop", 236).given(s, "1").checkEq(length, -1);
        itest("randoop", 236).given(s, "WOAR").checkEq(length, -1);
        itest("randoop", 236).given(s, "TT1").checkEq(length, -1);
        itest("randoop", 236).given(s, "(15)Rap").checkEq(length, -1);
        itest("evosuite", 236).given(s, "JM^{#|E<-fbqXc5^Q").checkEq(length, -1);
        itest("dev", 236).given(s, "Classic Rock").checkEq(length, -1);
        itest("randoop", 236).given(s, "TRK").checkEq(length, -1);
        itest("dev", 236).given(s, "my text").checkEq(length, -1);
        itest("randoop", 236).given(s, "TCR").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Duet").checkEq(length, -1);
        itest("evosuite", 236).given(s, "G+qAvm2r]c").checkEq(length, -1);
        itest("randoop", 236).given(s, "50/15 ms").checkEq(length, -1);
        itest("randoop", 236).given(s, "n/a").checkEq(length, -1);
        itest("randoop", 236).given(s, "ID3v2ChapterTOCFrameData [isRoot=false, isOrdered=true, id=Mono, children=[null, I, II, III], subframes=[]]").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Showtunes").checkEq(length, -1);
        itest("dev", 236).given(s, "84").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TENC").checkEq(length, -1);
        itest("randoop", 236).given(s, "WCOP").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TDAT").checkEq(length, -1);
        itest("dev", 236).given(s, "\u03B3\u03B5\u03B9\u03AC").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WOAF").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TALB").checkEq(length, -1);
        itest("randoop", 236).given(s, "4.0").checkEq(length, -1);
        itest("randoop", 236).given(s, "68379659").checkEq(length, -1);
        itest("evosuite", 236).given(s, "3dI").checkEq(length, -1);
        itest("evosuite", 236).given(s, "$1kw^%mAYM@0IyP").checkEq(length, -1);
        itest("dev", 236).given(s, "(40)").checkEq(length, -1);
        itest("dev", 236).given(s, "COMMENT").checkEq(length, -1);
        itest("dev", 236).given(s, "1954").checkEq(length, -1);
        itest("dev", 236).given(s, "ARTIST1234567890123456789012345678901234567890").checkEq(length, -1);
        itest("dev", 236).given(s, " 00000A78 00000A74 00000C7C 00000C6C 00000000 00000000 000051F7 00005634 00000000 00000000").checkEq(length, -1);
        itest("dev", 236).given(s, "PUBLISHER").checkEq(length, -1);
        itest("randoop", 236).given(s, "2.0").checkEq(length, -1);
        itest("dev", 236).given(s, "2001").checkEq(length, -1);
        itest("randoop", 236).given(s, "Bands 16-31").checkEq(length, -1);
        itest("evosuite", 236).given(s, "QfW0EqY^(q}h3j").checkEq(length, -1);
        itest("evosuite", 236).given(s, "(148)").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TYER").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TKEY").checkEq(length, -1);
        itest("randoop", 236).given(s, "5").checkEq(length, -1);
        itest("evosuite", 236).given(s, "8(X^w)L3kGPi'tB'").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TPE1").checkEq(length, -1);
        itest("randoop", 236).given(s, "TDRC").checkEq(length, -1);
        itest("randoop", 236).given(s, "Joint stereo").checkEq(length, -1);
        itest("dev", 236).given(s, "ALBUM1234567890123456789012345").checkEq(length, -1);
        itest("randoop", 236).given(s, "UNKNOWN-SNAPSHOT - http://github.com/mpatric/mp3agic").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TT1").checkEq(length, -1);
        itest("randoop", 236).given(s, "\u0000\u0002").checkEq(length, 0);
        itest("evosuite", 236).given(s, "(12)Other").checkEq(length, -1);
        itest("evosuite", 236).given(s, "4.0").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WXXX").checkEq(length, -1);
        itest("evosuite", 236).given(s, "iTunNORM").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TCP").checkEq(length, -1);
        itest("randoop", 236).given(s, "ID3v2ChapterTOCFrameData [isRoot=false, isOrdered=false, id=1.0, children=[Intensity & M/S stereo, TKEY, TCR, WCOP, I], subframes=[]]").checkEq(length, -1);
        itest("evosuite", 236).given(s, "x  W>").checkEq(length, -1);
        itest("dev", 236).given(s, "Jazz").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TAL").checkEq(length, -1);
        itest("dev", 236).given(s, "Pop").checkEq(length, -1);
        itest("dev", 236).given(s, "\u4E2D\u6587").checkEq(length, -1);
        itest("evosuite", 236).given(s, "COMM").checkEq(length, -1);
        itest("evosuite", 236).given(s, "p_H9|t;LUNw").checkEq(length, -1);
        itest("randoop", 236).given(s, "TAL").checkEq(length, -1);
        itest("evosuite", 236).given(s, "(O.'krTegK").checkEq(length, -1);
        itest("randoop", 236).given(s, "(234885908)").checkEq(length, -1);
        itest("dev", 236).given(s, "ARTIST123456789012345678901234").checkEq(length, -1);
        itest("evosuite", 236).given(s, ":F#b0").checkEq(length, -1);
        itest("randoop", 236).given(s, "18").checkEq(length, -1);
        itest("dev", 236).given(s, "ORIGARTIST234567890123456789012").checkEq(length, -1);
        itest("evosuite", 236).given(s, ">H9").checkEq(length, -1);
        itest("evosuite", 236).given(s, "").checkEq(length, -1);
        itest("dev", 236).given(s, "1").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TIT2").checkEq(length, -1);
        itest("dev", 236).given(s, "01/01/2011 00:00:00").checkEq(length, -1);
        itest("randoop", 236).given(s, "[com.mpatric.mp3agic.NotSupportedException]").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TRCK").checkEq(length, -1);
        itest("evosuite", 236).given(s, "VU-?/u").checkEq(length, -1);
        itest("dev", 236).given(s, "ID3v1 Comment").checkEq(length, -1);
        itest("randoop", 236).given(s, "1.0").checkEq(length, -1);
        itest("dev", 236).given(s, "10 seconds").checkEq(length, -1);
        itest("randoop", 236).given(s, "WOAS").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Punk").checkEq(length, -1);
        itest("dev", 236).given(s, "?????").checkEq(length, -1);
        itest("randoop", 236).given(s, "11").checkEq(length, -1);
        itest("randoop", 236).given(s, "ID3v2ChapterTOCFrameData [isRoot=false, isOrdered=false, id=1.0, children=null, subframes=[]]").checkEq(length, -1);
        itest("randoop", 236).given(s, "TT2").checkEq(length, -1);
        itest("randoop", 236).given(s, "(11)Oldies").checkEq(length, -1);
        itest("randoop", 236).given(s, "WXXX").checkEq(length, -1);
        itest("dev", 236).given(s, "COMMENTS1234567890123456789012345678901234567890").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WORS").checkEq(length, -1);
        itest("randoop", 236).given(s, "TYE").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Os(\"(:]=VGq").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Oldies").checkEq(length, -1);
        itest("dev", 236).given(s, "\u03B3\u03B5\u03B9\u03AC \u03C3\u03BF\u03C5").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Hrk*xKui|U").checkEq(length, -1);
        itest("evosuite", 236).given(s, "(256)").checkEq(length, -1);
        itest("randoop", 236).given(s, "WPAY").checkEq(length, -1);
        itest("evosuite", 236).given(s, "c@Z!=W$LC~").checkEq(length, -1);
        itest("randoop", 236).given(s, "CHAP").checkEq(length, -1);
        itest("randoop", 236).given(s, "TCM").checkEq(length, -1);
        itest("dev", 236).given(s, "DATE").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TCOP").checkEq(length, -1);
        itest("dev", 236).given(s, "La-la-la").checkEq(length, -1);
        itest("randoop", 236).given(s, "0").checkEq(length, -1);
        itest("randoop", 236).given(s, "Dual mono").checkEq(length, -1);
        itest("randoop", 236).given(s, "WPUB").checkEq(length, -1);
        itest("dev", 236).given(s, "TITLE").checkEq(length, -1);
        itest("randoop", 236).given(s, "TCM: 0").checkEq(length, -1);
        itest("dev", 236).given(s, "my description").checkEq(length, -1);
        itest("dev", 236).given(s, "LYRICS1234567890123456789012345").checkEq(length, -1);
        itest("dev", 236).given(s, "Bebop").checkEq(length, -1);
        itest("randoop", 236).given(s, "II").checkEq(length, -1);
        itest("randoop", 236).given(s, "ID3v2ChapterFrameData [id=3.0, startTime=0, endTime=20, startOffset=0, endOffset=0, subframes=[]]").checkEq(length, -1);
        itest("randoop", 236).given(s, "TPA").checkEq(length, -1);
        itest("evosuite", 236).given(s, "M&qmD\"yjOAnj").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TKE").checkEq(length, -1);
        itest("dev", 236).given(s, "ALBUM").checkEq(length, -1);
        itest("randoop", 236).given(s, "TCON").checkEq(length, -1);
        itest("randoop", 236).given(s, "UTF-16LE").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WOAR").checkEq(length, -1);
        itest("dev", 236).given(s, "my comment").checkEq(length, -1);
        itest("evosuite", 236).given(s, "1").checkEq(length, -1);
        itest("evosuite", 236).given(s, "(152)").checkEq(length, -1);
        itest("randoop", 236).given(s, "Bands 8-31").checkEq(length, -1);
        itest("randoop", 236).given(s, "ID3v2ChapterFrameData [id=None, startTime=7, endTime=2, startOffset=-1, endOffset=10, subframes=[]]").checkEq(length, -1);
        itest("randoop", 236).given(s, "Unknown").checkEq(length, -1);
        itest("dev", 236).given(s, "352800").checkEq(length, -1);
        itest("randoop", 236).given(s, "2230535").checkEq(length, -1);
        itest("dev", 236).given(s, "\u3053\u3093\u306B\u3061\u306F").checkEq(length, -1);
        itest("randoop", 236).given(s, "14665619").checkEq(length, -1);
        itest("randoop", 236).given(s, "TOPE").checkEq(length, -1);
        itest("randoop", 236).given(s, "2.5").checkEq(length, -1);
        itest("randoop", 236).given(s, "Bands 4-31").checkEq(length, -1);
        itest("randoop", 236).given(s, "ID3v2ChapterTOCFrameData [isRoot=false, isOrdered=false, id=null, children=null, subframes=[]]").checkEq(length, -1);
        itest("evosuite", 236).given(s, "qSh").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TYE").checkEq(length, -1);
        itest("evosuite", 236).given(s, "--i&=+5TT;ON <Q|,B]").checkEq(length, -1);
        itest("dev", 236).given(s, "(13)Pop").checkEq(length, -1);
        itest("randoop", 236).given(s, "Intensity & M/S stereo").checkEq(length, -1);
        itest("randoop", 236).given(s, "TP2").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WCOM").checkEq(length, -1);
        itest("randoop", 236).given(s, "III").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Psychedelic Rock").checkEq(length, -1);
        itest("dev", 236).given(s, "COMPOSER").checkEq(length, -1);
        itest("evosuite", 236).given(s, "15").checkEq(length, -1);
        itest("randoop", 236).given(s, "TP1                                                                                                                             ").checkEq(length, -1);
        itest("randoop", 236).given(s, "TALB").checkEq(length, -1);
        itest("evosuite", 236).given(s, "h+W.9").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TIT1").checkEq(length, -1);
        itest("randoop", 236).given(s, "Mono").checkEq(length, -1);
        itest("randoop", 236).given(s, "Humour").checkEq(length, -1);
        itest("dev", 236).given(s, "2009").checkEq(length, -1);
        itest("evosuite", 236).given(s, "41").checkEq(length, -1);
        itest("randoop", 236).given(s, "hi!").checkEq(length, -1);
        itest("evosuite", 236).given(s, "(2)Country").checkEq(length, -1);
        itest("dev", 236).given(s, "TITLE1234567890123456789012345").checkEq(length, -1);
        itest("randoop", 236).given(s, "TCOM").checkEq(length, -1);
        itest("randoop", 236).given(s, "TIT1").checkEq(length, -1);
        itest("evosuite", 236).given(s, "4:").checkEq(length, -1);
        itest("randoop", 236).given(s, "UTF-8").checkEq(length, -1);
        itest("dev", 236).given(s, "\u0AB9\u0AC7\u0AB2\u0ACD\u0AB2\u0ACB").checkEq(length, -1);
        itest("evosuite", 236).given(s, "?)Wh").checkEq(length, -1);
        itest("dev", 236).given(s, "ENCODER234567890123456789012345").checkEq(length, -1);
        itest("randoop", 236).given(s, "com.mpatric.mp3agic.NotSupportedException: ").checkEq(length, -1);
        itest("dev", 236).given(s, "\u03B3\u03B5").checkEq(length, -1);
        itest("randoop", 236).given(s, "308").checkEq(length, -1);
        itest("randoop", 236).given(s, "WCOM").checkEq(length, -1);
        itest("randoop", 236).given(s, "ISO-8859-1").checkEq(length, -1);
        itest("dev", 236).given(s, "COMMENT123456789012345678901").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TBP").checkEq(length, -1);
        itest("evosuite", 236).given(s, "]").checkEq(length, -1);
        itest("dev", 236).given(s, "ALBUMARTIST").checkEq(length, -1);
        itest("dev", 236).given(s, "DESCRIPTION").checkEq(length, -1);
        itest("randoop", 236).given(s, "POPM").checkEq(length, -1);
        itest("evosuite", 236).given(s, "tA'vm<").checkEq(length, -1);
        itest("randoop", 236).given(s, "[com.mpatric.mp3agic.UnsupportedTagException: ISO-8859-1]").checkEq(length, -1);
        itest("evosuite", 236).given(s, "WXX").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TCM").checkEq(length, -1);
        itest("randoop", 236).given(s, "(10)New Age").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TT2").checkEq(length, -1);
        itest("evosuite", 236).given(s, "(745)").checkEq(length, -1);
        itest("randoop", 236).given(s, "ID3v2ChapterTOCFrameData [isRoot=false, isOrdered=true, id=Mono, children=[ISO-8859-1, Stereo, ISO-8859-1, TRK], subframes=[]]").checkEq(length, -1);
        itest("randoop", 236).given(s, "WXX").checkEq(length, -1);
        itest("evosuite", 236).given(s, "!3\"NRyB=`_-)^q .").checkEq(length, -1);
        itest("randoop", 236).given(s, "Intensity stereo").checkEq(length, -1);
        itest("randoop", 236).given(s, "TDA").checkEq(length, -1);
        itest("evosuite", 236).given(s, "Ia9j.").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TCO").checkEq(length, -1);
        itest("randoop", 236).given(s, "TRCK").checkEq(length, -1);
        itest("randoop", 236).given(s, "UTF-16BE").checkEq(length, -1);
        itest("evosuite", 236).given(s, "L#p1zj{0-`").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TCMP").checkEq(length, -1);
        itest("randoop", 236).given(s, "iTunNORM").checkEq(length, -1);
        itest("randoop", 236).given(s, "ID3v2ChapterFrameData [id=3.0, startTime=0, endTime=0, startOffset=5, endOffset=0, subframes=[]]").checkEq(length, -1);
        itest("randoop", 236).given(s, "3.0").checkEq(length, -1);
        itest("evosuite", 236).given(s, "TDA").checkEq(length, -1);
        itest("dev", 236).given(s, "4/15").checkEq(length, -1);
        itest("evosuite", 236).given(s, "!}<5c~XdzttfgZbn").checkEq(length, -1);
        itest("dev", 236).given(s, "COMPOSER23456789012345678901234").checkEq(length, -1);
        itest("evosuite", 236).given(s, "o;n=91Q(![@>/=").checkEq(length, -1);
        if (length == -1) {
            return s;
        }
        return s.substring(0, length);
    }

    protected static CharBuffer bytesToCharBuffer(byte[] bytes, String characterSet) throws CharacterCodingException {
        Charset charset = Charset.forName(characterSet);
        CharsetDecoder decoder = charset.newDecoder();
        return decoder.decode(ByteBuffer.wrap(bytes));
    }

    private static byte[] stringToBytes(String s, String characterSet) {
        try {
            return charBufferToBytes(CharBuffer.wrap(s), characterSet);
        } catch (CharacterCodingException e) {
            return null;
        }
    }

    protected static byte[] charBufferToBytes(CharBuffer charBuffer, String characterSet) throws CharacterCodingException {
        Charset charset = Charset.forName(characterSet);
        CharsetEncoder encoder = charset.newEncoder();
        ByteBuffer byteBuffer = encoder.encode(charBuffer);
        return BufferTools.copyBuffer(byteBuffer.array(), 0, byteBuffer.limit());
    }
}
