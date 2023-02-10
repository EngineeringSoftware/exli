package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public final class BufferTools {

    protected static final String defaultCharsetName = "ISO-8859-1";

    private BufferTools() {
    }

    public static String byteBufferToStringIgnoringEncodingIssues(byte[] bytes, int offset, int length) {
        try {
            return byteBufferToString(bytes, offset, length, defaultCharsetName);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String byteBufferToString(byte[] bytes, int offset, int length) throws UnsupportedEncodingException {
        return byteBufferToString(bytes, offset, length, defaultCharsetName);
    }

    public static String byteBufferToString(byte[] bytes, int offset, int length, String charsetName) throws UnsupportedEncodingException {
        if (length < 1)
            return "";
        return new String(bytes, offset, length, charsetName);
    }

    public static byte[] stringToByteBufferIgnoringEncodingIssues(String s, int offset, int length) {
        try {
            return stringToByteBuffer(s, offset, length);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static byte[] stringToByteBuffer(String s, int offset, int length) throws UnsupportedEncodingException {
        return stringToByteBuffer(s, offset, length, defaultCharsetName);
    }

    public static byte[] stringToByteBuffer(String s, int offset, int length, String charsetName) throws UnsupportedEncodingException {
        String stringToCopy = s.substring(offset, offset + length);
        return stringToCopy.getBytes(charsetName);
    }

    public static void stringIntoByteBuffer(String s, int offset, int length, byte[] bytes, int destOffset) throws UnsupportedEncodingException {
        stringIntoByteBuffer(s, offset, length, bytes, destOffset, defaultCharsetName);
    }

    public static void stringIntoByteBuffer(String s, int offset, int length, byte[] bytes, int destOffset, String charsetName) throws UnsupportedEncodingException {
        String stringToCopy = s.substring(offset, offset + length);
        byte[] srcBytes = stringToCopy.getBytes(charsetName);
        if (srcBytes.length > 0) {
            System.arraycopy(srcBytes, 0, bytes, destOffset, srcBytes.length);
        }
    }

    public static String trimStringRight(String s) {
        int endPosition = s.length() - 1;
        char endChar;
        while (endPosition >= 0) {
            endChar = s.charAt(endPosition);
            if (endChar > 32) {
                break;
            }
            endPosition--;
        }
        if (endPosition == s.length() - 1)
            return s;
        else if (endPosition < 0)
            return "";
        return s.substring(0, endPosition + 1);
    }

    public static String padStringRight(String s, int length, char padWith) {
        if (s.length() >= length)
            return s;
        StringBuilder stringBuffer = new StringBuilder(s);
        while (stringBuffer.length() < length) {
            stringBuffer.append(padWith);
        }
        return stringBuffer.toString();
    }

    public static boolean checkBit(byte b, int bitPosition) {
        return ((b & (0x01 << bitPosition)) != 0);
    }

    public static byte setBit(byte b, int bitPosition, boolean value) {
        byte newByte;
        if (value) {
            newByte = (byte) (b | ((byte) 0x01 << bitPosition));
            new Here("Unit", 88).given(b, 0).given(bitPosition, 4).checkEq(newByte, 16);
        } else {
            newByte = (byte) (b & (~((byte) 0x01 << bitPosition)));
            new Here("Unit", 90).given(b, 0).given(bitPosition, 7).checkEq(newByte, 0);
        }
        return newByte;
    }

    public static int shiftByte(byte c, int places) {
        int i = c & 0xff;
        new Here("Randoop", 96).given(c, 10).checkEq(i, 10);
        new Here("Randoop", 96).given(c, 100).checkEq(i, 100);
        new Here("Unit", 96).given(c, 3).checkEq(i, 3);
        if (places < 0) {
            return i << -places;
        } else if (places > 0) {
            return i >> places;
        }
        return i;
    }

    public static int unpackInteger(byte b1, byte b2, byte b3, byte b4) {
        int value = b4 & 0xff;
        new Here("Unit", 106).given(b4, 33).checkEq(value, 33);
        value += BufferTools.shiftByte(b3, -8);
        value += BufferTools.shiftByte(b2, -16);
        value += BufferTools.shiftByte(b1, -24);
        return value;
    }

    public static byte[] packInteger(int i) {
        byte[] bytes = new byte[4];
        bytes[3] = (byte) (i & 0xff);
        new Here("Unit", 115).given(i, 12).checkEq(bytes[3], 12);
        bytes[2] = (byte) ((i >> 8) & 0xff);
        new Here("Unit", 116).given(i, 12).checkEq(bytes[2], 0);
        bytes[1] = (byte) ((i >> 16) & 0xff);
        new Here("Unit", 117).given(i, 12).checkEq(bytes[1], 0);
        bytes[0] = (byte) ((i >> 24) & 0xff);
        new Here("Unit", 118).given(i, 12).checkEq(bytes[0], 0);
        return bytes;
    }

    public static int unpackSynchsafeInteger(byte b1, byte b2, byte b3, byte b4) {
        int value = ((byte) (b4 & 0x7f));
        new Here("Unit", 123).given(b4, 110).checkEq(value, 110);
        value += shiftByte((byte) (b3 & 0x7f), -7);
        new Here("Unit", 124).given(b3, 3).given(value, 110).checkEq(value, 494);
        value += shiftByte((byte) (b2 & 0x7f), -14);
        new Here("Unit", 125).given(b2, 0).given(value, 494).checkEq(value, 494);
        value += shiftByte((byte) (b1 & 0x7f), -21);
        new Here("Unit", 126).given(value, 494).given(b1, 0).checkEq(value, 494);
        return value;
    }

    public static byte[] packSynchsafeInteger(int i) {
        byte[] bytes = new byte[4];
        packSynchsafeInteger(i, bytes, 0);
        return bytes;
    }

    public static void packSynchsafeInteger(int i, byte[] bytes, int offset) {
        bytes[offset + 3] = (byte) (i & 0x7f);
        new Here("Unit", 137).given(i, 2586).checkEq(bytes[offset + 3], 26);
        bytes[offset + 2] = (byte) ((i >> 7) & 0x7f);
        new Here("Unit", 138).given(i, 2586).checkEq(bytes[offset + 2], 20);
        bytes[offset + 1] = (byte) ((i >> 14) & 0x7f);
        new Here("Unit", 139).given(i, 2586).checkEq(bytes[offset + 1], 0);
        bytes[offset + 0] = (byte) ((i >> 21) & 0x7f);
        new Here("Unit", 140).given(i, 2586).checkEq(bytes[offset + 0], 0);
    }

    public static byte[] copyBuffer(byte[] bytes, int offset, int length) {
        byte[] copy = new byte[length];
        if (length > 0) {
            System.arraycopy(bytes, offset, copy, 0, length);
        }
        return copy;
    }

    public static void copyIntoByteBuffer(byte[] bytes, int offset, int length, byte[] destBuffer, int destOffset) {
        if (length > 0) {
            System.arraycopy(bytes, offset, destBuffer, destOffset, length);
        }
    }

    public static int sizeUnsynchronisationWouldAdd(byte[] bytes) {
        int count = 0;
        for (int i = 0; i < bytes.length - 1; i++) {
            if (bytes[i] == (byte) 0xff && ((bytes[i + 1] & (byte) 0xe0) == (byte) 0xe0 || bytes[i + 1] == 0)) {
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 27).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 0).checkFalse(group());
                count++;
            }
        }
        if (bytes.length > 0 && bytes[bytes.length - 1] == (byte) 0xff)
            count++;
        return count;
    }

    public static byte[] unsynchroniseBuffer(byte[] bytes) {
        // unsynchronisation is replacing instances of:
        // 11111111 111xxxxx with 11111111 00000000 111xxxxx and
        // 11111111 00000000 with 11111111 00000000 00000000
        int count = sizeUnsynchronisationWouldAdd(bytes);
        if (count == 0)
            return bytes;
        byte[] newBuffer = new byte[bytes.length + count];
        int j = 0;
        for (int i = 0; i < bytes.length - 1; i++) {
            newBuffer[j++] = bytes[i];
            if (bytes[i] == (byte) 0xff && ((bytes[i + 1] & (byte) 0xe0) == (byte) 0xe0 || bytes[i + 1] == 0)) {
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 0).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 27).checkTrue(group());
                newBuffer[j++] = 0;
            }
        }
        newBuffer[j++] = bytes[bytes.length - 1];
        if (bytes[bytes.length - 1] == (byte) 0xff) {
            newBuffer[j++] = 0;
        }
        return newBuffer;
    }

    public static int sizeSynchronisationWouldSubtract(byte[] bytes) {
        int count = 0;
        for (int i = 0; i < bytes.length - 2; i++) {
            if (bytes[i] == (byte) 0xff && bytes[i + 1] == 0 && ((bytes[i + 2] & (byte) 0xe0) == (byte) 0xe0 || bytes[i + 2] == 0)) {
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 27).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 0).checkFalse(group());
                count++;
            }
        }
        if (bytes.length > 1 && bytes[bytes.length - 2] == (byte) 0xff && bytes[bytes.length - 1] == 0)
            count++;
        return count;
    }

    public static byte[] synchroniseBuffer(byte[] bytes) {
        // synchronisation is replacing instances of:
        // 11111111 00000000 111xxxxx with 11111111 111xxxxx and
        // 11111111 00000000 00000000 with 11111111 00000000
        int count = sizeSynchronisationWouldSubtract(bytes);
        if (count == 0)
            return bytes;
        byte[] newBuffer = new byte[bytes.length - count];
        int i = 0;
        for (int j = 0; j < newBuffer.length - 1; j++) {
            newBuffer[j] = bytes[i];
            if (bytes[i] == (byte) 0xff && bytes[i + 1] == 0 && ((bytes[i + 2] & (byte) 0xe0) == (byte) 0xe0 || bytes[i + 2] == 0)) {
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 0).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 27).checkTrue(group());
                i++;
            }
            i++;
        }
        newBuffer[newBuffer.length - 1] = bytes[i];
        return newBuffer;
    }

    public static String substitute(String s, String replaceThis, String withThis) {
        if (replaceThis.length() < 1 || !s.contains(replaceThis)) {
            return s;
        }
        StringBuilder newString = new StringBuilder();
        int lastPosition = 0;
        int position = 0;
        while ((position = s.indexOf(replaceThis, position)) >= 0) {
            if (position > lastPosition) {
                newString.append(s.substring(lastPosition, position));
            }
            if (withThis != null) {
                newString.append(withThis);
            }
            lastPosition = position + replaceThis.length();
            position++;
        }
        if (lastPosition < s.length()) {
            newString.append(s.substring(lastPosition));
        }
        return newString.toString();
    }

    public static String asciiOnly(String s) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < 32 || ch > 126) {
                newString.append('?');
            } else {
                newString.append(ch);
            }
        }
        return newString.toString();
    }

    public static int indexOfTerminator(byte[] bytes) {
        return indexOfTerminator(bytes, 0);
    }

    public static int indexOfTerminator(byte[] bytes, int fromIndex) {
        return indexOfTerminator(bytes, 0, 1);
    }

    public static int indexOfTerminator(byte[] bytes, int fromIndex, int terminatorLength) {
        int marker = -1;
        for (int i = fromIndex; i <= bytes.length - terminatorLength; i++) {
            if ((i - fromIndex) % terminatorLength == 0) {
                int matched;
                for (matched = 0; matched < terminatorLength; matched++) {
                    if (bytes[i + matched] != 0)
                        break;
                }
                if (matched == terminatorLength) {
                    marker = i;
                    break;
                }
            }
        }
        return marker;
    }

    public static int indexOfTerminatorForEncoding(byte[] bytes, int fromIndex, int encoding) {
        int terminatorLength = (encoding == EncodedText.TEXT_ENCODING_UTF_16 || encoding == EncodedText.TEXT_ENCODING_UTF_16BE) ? 2 : 1;
        return indexOfTerminator(bytes, fromIndex, terminatorLength);
    }
}
