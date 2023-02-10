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
            new Here("Randoop", 88).given(b, 27).given(bitPosition, 67789835).checkEq(newByte, 27);
            new Here("Randoop", 88).given(b, 100).given(bitPosition, 6571019).checkEq(newByte, 100);
            new Here("Randoop", 88).given(b, 9).given(bitPosition, 188941567).checkEq(newByte, 9);
            new Here("Randoop", 88).given(b, 13).given(bitPosition, 7).checkEq(newByte, -115);
            new Here("Randoop", 88).given(b, 11).given(bitPosition, 100).checkEq(newByte, 27);
            new Here("Unit", 88).given(b, 0).given(bitPosition, 4).checkEq(newByte, 16);
            new Here("Randoop", 88).given(b, 12).given(bitPosition, 0).checkEq(newByte, 13);
            new Here("Randoop", 88).given(b, 3).given(bitPosition, 134).checkEq(newByte, 67);
            new Here("Unit", 88).given(b, 0).given(bitPosition, 6).checkEq(newByte, 64);
            new Here("Randoop", 88).given(b, 9).given(bitPosition, 53).checkEq(newByte, 9);
            new Here("Randoop", 88).given(b, 9).given(bitPosition, 238).checkEq(newByte, 9);
            new Here("Randoop", 88).given(b, -115).given(bitPosition, 74).checkEq(newByte, -115);
            new Here("Randoop", 88).given(b, 0).given(bitPosition, 128).checkEq(newByte, 1);
            new Here("Randoop", 88).given(b, 0).given(bitPosition, 7).checkEq(newByte, -128);
            new Here("Randoop", 88).given(b, 8).given(bitPosition, 48).checkEq(newByte, 8);
            new Here("Unit", 88).given(b, 0).given(bitPosition, 7).checkEq(newByte, -128);
            new Here("Randoop", 88).given(b, 7).given(bitPosition, 0).checkEq(newByte, 7);
            new Here("Randoop", 88).given(b, 4).given(bitPosition, 134).checkEq(newByte, 68);
            new Here("Randoop", 88).given(b, 1).given(bitPosition, 11).checkEq(newByte, 1);
            new Here("Unit", 88).given(b, -54).given(bitPosition, 4).checkEq(newByte, -38);
            new Here("Randoop", 88).given(b, 100).given(bitPosition, 27).checkEq(newByte, 100);
            new Here("Randoop", 88).given(b, 2).given(bitPosition, 100).checkEq(newByte, 18);
            new Here("Unit", 88).given(b, -54).given(bitPosition, 0).checkEq(newByte, -53);
            new Here("Randoop", 88).given(b, 1).given(bitPosition, 44).checkEq(newByte, 1);
            new Here("Randoop", 88).given(b, 12).given(bitPosition, 58).checkEq(newByte, 12);
            new Here("Randoop", 88).given(b, 8).given(bitPosition, 153).checkEq(newByte, 8);
            new Here("Unit", 88).given(b, -54).given(bitPosition, 7).checkEq(newByte, -54);
            new Here("Randoop", 88).given(b, 11).given(bitPosition, 2).checkEq(newByte, 15);
        } else {
            newByte = (byte) (b & (~((byte) 0x01 << bitPosition)));
            new Here("Unit", 90).given(b, 64).given(bitPosition, 5).checkEq(newByte, 64);
            new Here("Randoop", 90).given(b, 10).given(bitPosition, -1).checkEq(newByte, 10);
            new Here("Randoop", 90).given(b, 0).given(bitPosition, 3).checkEq(newByte, 0);
            new Here("Unit", 90).given(b, 0).given(bitPosition, 6).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, 0).given(bitPosition, 7).checkEq(newByte, 0);
            new Here("Unit", 90).given(b, 0).given(bitPosition, 2).checkEq(newByte, 0);
            new Here("Unit", 90).given(b, 0).given(bitPosition, 1).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, 0).given(bitPosition, 1).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, -128).given(bitPosition, 6).checkEq(newByte, -128);
            new Here("Unit", 90).given(b, 0).given(bitPosition, 4).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, -1).given(bitPosition, 29377796).checkEq(newByte, -17);
            new Here("Randoop", 90).given(b, 14).given(bitPosition, 14).checkEq(newByte, 14);
            new Here("Randoop", 90).given(b, 0).given(bitPosition, 4).checkEq(newByte, 0);
            new Here("Unit", 90).given(b, 0).given(bitPosition, 5).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, 6).given(bitPosition, 140).checkEq(newByte, 6);
            new Here("Unit", 90).given(b, -54).given(bitPosition, 3).checkEq(newByte, -62);
            new Here("Randoop", 90).given(b, 0).given(bitPosition, 6).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, -128).given(bitPosition, 5).checkEq(newByte, -128);
            new Here("Unit", 90).given(b, 0).given(bitPosition, 7).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, 0).given(bitPosition, 2).checkEq(newByte, 0);
            new Here("Unit", 90).given(b, -54).given(bitPosition, 7).checkEq(newByte, 74);
            new Here("Unit", 90).given(b, -54).given(bitPosition, 0).checkEq(newByte, -54);
            new Here("Randoop", 90).given(b, 6).given(bitPosition, 10).checkEq(newByte, 6);
            new Here("Unit", 90).given(b, 0).given(bitPosition, 3).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, 0).given(bitPosition, 5).checkEq(newByte, 0);
            new Here("Unit", 90).given(b, 0).given(bitPosition, 0).checkEq(newByte, 0);
            new Here("Randoop", 90).given(b, 0).given(bitPosition, 0).checkEq(newByte, 0);
            new Here("Unit", 90).given(b, 64).given(bitPosition, 4).checkEq(newByte, 64);
        }
        return newByte;
    }

    public static int shiftByte(byte c, int places) {
        int i = c & 0xff;
        new Here("Unit", 96).given(c, 14).checkEq(i, 14);
        new Here("Randoop", 96).given(c, 85).checkEq(i, 85);
        new Here("Unit", 96).given(c, 7).checkEq(i, 7);
        new Here("Randoop", 96).given(c, 20).checkEq(i, 20);
        new Here("Unit", 96).given(c, 2).checkEq(i, 2);
        new Here("Randoop", 96).given(c, 1).checkEq(i, 1);
        new Here("Randoop", 96).given(c, 16).checkEq(i, 16);
        new Here("Randoop", 96).given(c, -1).checkEq(i, 255);
        new Here("Randoop", 96).given(c, 27).checkEq(i, 27);
        new Here("Randoop", 96).given(c, 6).checkEq(i, 6);
        new Here("Unit", 96).given(c, 24).checkEq(i, 24);
        new Here("Unit", 96).given(c, 84).checkEq(i, 84);
        new Here("Randoop", 96).given(c, 11).checkEq(i, 11);
        new Here("Unit", 96).given(c, 0).checkEq(i, 0);
        new Here("Randoop", 96).given(c, 65).checkEq(i, 65);
        new Here("Unit", 96).given(c, 71).checkEq(i, 71);
        new Here("Unit", 96).given(c, -80).checkEq(i, 176);
        new Here("Randoop", 96).given(c, 3).checkEq(i, 3);
        new Here("Unit", 96).given(c, 9).checkEq(i, 9);
        new Here("Randoop", 96).given(c, 87).checkEq(i, 87);
        new Here("Unit", 96).given(c, -5).checkEq(i, 251);
        new Here("Randoop", 96).given(c, 80).checkEq(i, 80);
        new Here("Unit", 96).given(c, 18).checkEq(i, 18);
        new Here("Unit", 96).given(c, 8).checkEq(i, 8);
        new Here("Randoop", 96).given(c, 4).checkEq(i, 4);
        new Here("Randoop", 96).given(c, 15).checkEq(i, 15);
        new Here("Randoop", 96).given(c, 10).checkEq(i, 10);
        new Here("Unit", 96).given(c, 67).checkEq(i, 67);
        new Here("Unit", 96).given(c, -112).checkEq(i, 144);
        new Here("Randoop", 96).given(c, 111).checkEq(i, 111);
        new Here("Unit", 96).given(c, 83).checkEq(i, 83);
        new Here("Randoop", 96).given(c, 105).checkEq(i, 105);
        new Here("Randoop", 96).given(c, 5).checkEq(i, 5);
        new Here("Randoop", 96).given(c, 19).checkEq(i, 19);
        new Here("Randoop", 96).given(c, 127).checkEq(i, 127);
        new Here("Unit", 96).given(c, 65).checkEq(i, 65);
        new Here("Randoop", 96).given(c, 77).checkEq(i, 77);
        new Here("Unit", 96).given(c, 3).checkEq(i, 3);
        new Here("Randoop", 96).given(c, 12).checkEq(i, 12);
        new Here("Unit", 96).given(c, -64).checkEq(i, 192);
        new Here("Randoop", 96).given(c, 66).checkEq(i, 66);
        new Here("Unit", 96).given(c, 1).checkEq(i, 1);
        new Here("Randoop", 96).given(c, 2).checkEq(i, 2);
        new Here("Unit", 96).given(c, -1).checkEq(i, 255);
        new Here("Unit", 96).given(c, 11).checkEq(i, 11);
        new Here("Randoop", 96).given(c, 7).checkEq(i, 7);
        new Here("Unit", 96).given(c, 20).checkEq(i, 20);
        new Here("Randoop", 96).given(c, 79).checkEq(i, 79);
        new Here("Randoop", 96).given(c, 51).checkEq(i, 51);
        new Here("Randoop", 96).given(c, 14).checkEq(i, 14);
        new Here("Randoop", 96).given(c, 68).checkEq(i, 68);
        new Here("Randoop", 96).given(c, 73).checkEq(i, 73);
        new Here("Unit", 96).given(c, 16).checkEq(i, 16);
        new Here("Randoop", 96).given(c, 83).checkEq(i, 83);
        new Here("Randoop", 96).given(c, 84).checkEq(i, 84);
        new Here("Randoop", 96).given(c, 108).checkEq(i, 108);
        new Here("Randoop", 96).given(c, 8).checkEq(i, 8);
        new Here("Unit", 96).given(c, -100).checkEq(i, 156);
        new Here("Unit", 96).given(c, -128).checkEq(i, 128);
        new Here("Unit", 96).given(c, 85).checkEq(i, 85);
        new Here("Unit", 96).given(c, 5).checkEq(i, 5);
        new Here("Unit", 96).given(c, 112).checkEq(i, 112);
        new Here("Unit", 96).given(c, 10).checkEq(i, 10);
        new Here("Randoop", 96).given(c, 18).checkEq(i, 18);
        new Here("Randoop", 96).given(c, 9).checkEq(i, 9);
        new Here("Randoop", 96).given(c, 13).checkEq(i, 13);
        new Here("Randoop", 96).given(c, 0).checkEq(i, 0);
        new Here("Randoop", 96).given(c, 100).checkEq(i, 100);
        new Here("Unit", 96).given(c, 4).checkEq(i, 4);
        new Here("Randoop", 96).given(c, 67).checkEq(i, 67);
        new Here("Unit", 96).given(c, 15).checkEq(i, 15);
        if (places < 0) {
            return i << -places;
        } else if (places > 0) {
            return i >> places;
        }
        return i;
    }

    public static int unpackInteger(byte b1, byte b2, byte b3, byte b4) {
        int value = b4 & 0xff;
        new Here("Unit", 106).given(b4, 22).checkEq(value, 22);
        new Here("Unit", 106).given(b4, 7).checkEq(value, 7);
        new Here("Randoop", 106).given(b4, 27).checkEq(value, 27);
        new Here("Randoop", 106).given(b4, 20).checkEq(value, 20);
        new Here("Unit", 106).given(b4, 12).checkEq(value, 12);
        new Here("Unit", 106).given(b4, 5).checkEq(value, 5);
        new Here("Unit", 106).given(b4, 32).checkEq(value, 32);
        new Here("Unit", 106).given(b4, 66).checkEq(value, 66);
        new Here("Randoop", 106).given(b4, 84).checkEq(value, 84);
        new Here("Unit", 106).given(b4, 19).checkEq(value, 19);
        new Here("Unit", 106).given(b4, 9).checkEq(value, 9);
        new Here("Unit", 106).given(b4, 36).checkEq(value, 36);
        new Here("Randoop", 106).given(b4, 67).checkEq(value, 67);
        new Here("Randoop", 106).given(b4, 100).checkEq(value, 100);
        new Here("Unit", 106).given(b4, 46).checkEq(value, 46);
        new Here("Randoop", 106).given(b4, 13).checkEq(value, 13);
        new Here("Randoop", 106).given(b4, 80).checkEq(value, 80);
        new Here("Randoop", 106).given(b4, 10).checkEq(value, 10);
        new Here("Randoop", 106).given(b4, 16).checkEq(value, 16);
        new Here("Unit", 106).given(b4, 65).checkEq(value, 65);
        new Here("Unit", 106).given(b4, 33).checkEq(value, 33);
        new Here("Unit", 106).given(b4, 92).checkEq(value, 92);
        new Here("Unit", 106).given(b4, 21).checkEq(value, 21);
        new Here("Randoop", 106).given(b4, 73).checkEq(value, 73);
        new Here("Unit", 106).given(b4, 104).checkEq(value, 104);
        new Here("Unit", 106).given(b4, 31).checkEq(value, 31);
        new Here("Unit", 106).given(b4, 23).checkEq(value, 23);
        new Here("Unit", 106).given(b4, 13).checkEq(value, 13);
        new Here("Unit", 106).given(b4, -60).checkEq(value, 196);
        new Here("Randoop", 106).given(b4, 19).checkEq(value, 19);
        new Here("Unit", 106).given(b4, 41).checkEq(value, 41);
        new Here("Unit", 106).given(b4, 37).checkEq(value, 37);
        new Here("Unit", 106).given(b4, 47).checkEq(value, 47);
        new Here("Randoop", 106).given(b4, 42).checkEq(value, 42);
        new Here("Unit", 106).given(b4, 54).checkEq(value, 54);
        new Here("Unit", 106).given(b4, 6).checkEq(value, 6);
        new Here("Randoop", 106).given(b4, 110).checkEq(value, 110);
        new Here("Randoop", 106).given(b4, 49).checkEq(value, 49);
        new Here("Randoop", 106).given(b4, 15).checkEq(value, 15);
        new Here("Unit", 106).given(b4, 10).checkEq(value, 10);
        new Here("Unit", 106).given(b4, 17).checkEq(value, 17);
        new Here("Randoop", 106).given(b4, 12).checkEq(value, 12);
        new Here("Unit", 106).given(b4, 20).checkEq(value, 20);
        new Here("Unit", 106).given(b4, 8).checkEq(value, 8);
        new Here("Unit", 106).given(b4, 27).checkEq(value, 27);
        new Here("Randoop", 106).given(b4, 18).checkEq(value, 18);
        new Here("Unit", 106).given(b4, 48).checkEq(value, 48);
        new Here("Unit", 106).given(b4, 50).checkEq(value, 50);
        new Here("Unit", 106).given(b4, 40).checkEq(value, 40);
        new Here("Randoop", 106).given(b4, 7).checkEq(value, 7);
        new Here("Unit", 106).given(b4, 11).checkEq(value, 11);
        new Here("Randoop", 106).given(b4, 8).checkEq(value, 8);
        new Here("Unit", 106).given(b4, 43).checkEq(value, 43);
        new Here("Randoop", 106).given(b4, 9).checkEq(value, 9);
        new Here("Randoop", 106).given(b4, -1).checkEq(value, 255);
        new Here("Randoop", 106).given(b4, 3).checkEq(value, 3);
        new Here("Randoop", 106).given(b4, 4).checkEq(value, 4);
        new Here("Unit", 106).given(b4, 106).checkEq(value, 106);
        new Here("Randoop", 106).given(b4, 5).checkEq(value, 5);
        new Here("Randoop", 106).given(b4, 6).checkEq(value, 6);
        new Here("Randoop", 106).given(b4, 85).checkEq(value, 85);
        new Here("Randoop", 106).given(b4, 1).checkEq(value, 1);
        new Here("Unit", 106).given(b4, 63).checkEq(value, 63);
        new Here("Randoop", 106).given(b4, 0).checkEq(value, 0);
        new Here("Unit", 106).given(b4, 15).checkEq(value, 15);
        new Here("Randoop", 106).given(b4, 2).checkEq(value, 2);
        new Here("Randoop", 106).given(b4, 14).checkEq(value, 14);
        new Here("Randoop", 106).given(b4, 11).checkEq(value, 11);
        new Here("Unit", 106).given(b4, 3).checkEq(value, 3);
        new Here("Randoop", 106).given(b4, -17).checkEq(value, 239);
        new Here("Randoop", 106).given(b4, 68).checkEq(value, 68);
        new Here("Unit", 106).given(b4, 2).checkEq(value, 2);
        new Here("Unit", 106).given(b4, 69).checkEq(value, 69);
        new Here("Unit", 106).given(b4, 0).checkEq(value, 0);
        value += BufferTools.shiftByte(b3, -8);
        value += BufferTools.shiftByte(b2, -16);
        value += BufferTools.shiftByte(b1, -24);
        return value;
    }

    public static byte[] packInteger(int i) {
        byte[] bytes = new byte[4];
        bytes[3] = (byte) (i & 0xff);
        new Here("Unit", 115).given(i, -290748).checkEq(bytes[3], 68);
        new Here("Unit", 115).given(i, 8).checkEq(bytes[3], 8);
        new Here("Randoop", 115).given(i, 11).checkEq(bytes[3], 11);
        new Here("Unit", 115).given(i, 22).checkEq(bytes[3], 22);
        new Here("Randoop", 115).given(i, 2).checkEq(bytes[3], 2);
        new Here("Randoop", 115).given(i, -1).checkEq(bytes[3], -1);
        new Here("Randoop", 115).given(i, 105).checkEq(bytes[3], 105);
        new Here("Unit", 115).given(i, 20).checkEq(bytes[3], 20);
        new Here("Unit", 115).given(i, 26).checkEq(bytes[3], 26);
        new Here("Unit", 115).given(i, 1898).checkEq(bytes[3], 106);
        new Here("Unit", 115).given(i, 2).checkEq(bytes[3], 2);
        new Here("Unit", 115).given(i, 4).checkEq(bytes[3], 4);
        new Here("Unit", 115).given(i, 31).checkEq(bytes[3], 31);
        new Here("Unit", 115).given(i, 12).checkEq(bytes[3], 12);
        new Here("Unit", 115).given(i, 9).checkEq(bytes[3], 9);
        new Here("Randoop", 115).given(i, 3).checkEq(bytes[3], 3);
        new Here("Unit", 115).given(i, 10).checkEq(bytes[3], 10);
        new Here("Unit", 115).given(i, 33).checkEq(bytes[3], 33);
        new Here("Unit", 115).given(i, 5).checkEq(bytes[3], 5);
        new Here("Randoop", 115).given(i, 42).checkEq(bytes[3], 42);
        new Here("Unit", 115).given(i, 21).checkEq(bytes[3], 21);
        new Here("Randoop", 115).given(i, 10).checkEq(bytes[3], 10);
        new Here("Randoop", 115).given(i, 5).checkEq(bytes[3], 5);
        new Here("Randoop", 115).given(i, 4).checkEq(bytes[3], 4);
        new Here("Unit", 115).given(i, 6).checkEq(bytes[3], 6);
        new Here("Randoop", 115).given(i, 35).checkEq(bytes[3], 35);
        new Here("Unit", 115).given(i, 46).checkEq(bytes[3], 46);
        new Here("Unit", 115).given(i, 23).checkEq(bytes[3], 23);
        new Here("Randoop", 115).given(i, 14).checkEq(bytes[3], 14);
        new Here("Randoop", 115).given(i, 1).checkEq(bytes[3], 1);
        new Here("Unit", 115).given(i, 32).checkEq(bytes[3], 32);
        new Here("Unit", 115).given(i, 13).checkEq(bytes[3], 13);
        new Here("Randoop", 115).given(i, 9).checkEq(bytes[3], 9);
        new Here("Unit", 115).given(i, 12345).checkEq(bytes[3], 57);
        new Here("Randoop", 115).given(i, 18).checkEq(bytes[3], 18);
        new Here("Unit", 115).given(i, 17).checkEq(bytes[3], 17);
        new Here("Unit", 115).given(i, 7).checkEq(bytes[3], 7);
        new Here("Unit", 115).given(i, 15).checkEq(bytes[3], 15);
        bytes[2] = (byte) ((i >> 8) & 0xff);
        new Here("Unit", 116).given(i, 12).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 5).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 42).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 32).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 17).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 20).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 35).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 9).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 5).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 7).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 2).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 21).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 1).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 13).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 4).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 105).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 33).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 8).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 22).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 3).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 10).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 11).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, -290748).checkEq(bytes[2], -112);
        new Here("Unit", 116).given(i, 26).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 46).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 12345).checkEq(bytes[2], 48);
        new Here("Unit", 116).given(i, 9).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 4).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, -1).checkEq(bytes[2], -1);
        new Here("Unit", 116).given(i, 31).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 2).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 1898).checkEq(bytes[2], 7);
        new Here("Unit", 116).given(i, 23).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 15).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 10).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 18).checkEq(bytes[2], 0);
        new Here("Unit", 116).given(i, 6).checkEq(bytes[2], 0);
        new Here("Randoop", 116).given(i, 14).checkEq(bytes[2], 0);
        bytes[1] = (byte) ((i >> 16) & 0xff);
        new Here("Unit", 117).given(i, 9).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 20).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 17).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 42).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 35).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 12).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 4).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 105).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 32).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 1898).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 3).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 11).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 46).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 5).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 21).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 9).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 13).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 4).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 33).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 12345).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 1).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 15).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 7).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 2).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 10).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 6).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, -290748).checkEq(bytes[1], -5);
        new Here("Unit", 117).given(i, 22).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 26).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 18).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 8).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 5).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 23).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 2).checkEq(bytes[1], 0);
        new Here("Unit", 117).given(i, 31).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 10).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, 14).checkEq(bytes[1], 0);
        new Here("Randoop", 117).given(i, -1).checkEq(bytes[1], -1);
        bytes[0] = (byte) ((i >> 24) & 0xff);
        new Here("Unit", 118).given(i, 33).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 2).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 13).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 12345).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 35).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 46).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 8).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 2).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 20).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 11).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 26).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 32).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 1898).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 6).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 12).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, -290748).checkEq(bytes[0], -1);
        new Here("Unit", 118).given(i, 9).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 17).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 21).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 3).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, -1).checkEq(bytes[0], -1);
        new Here("Unit", 118).given(i, 23).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 9).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 5).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 10).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 22).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 4).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 4).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 42).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 105).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 18).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 7).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 15).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 14).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 1).checkEq(bytes[0], 0);
        new Here("Unit", 118).given(i, 31).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 5).checkEq(bytes[0], 0);
        new Here("Randoop", 118).given(i, 10).checkEq(bytes[0], 0);
        return bytes;
    }

    public static int unpackSynchsafeInteger(byte b1, byte b2, byte b3, byte b4) {
        int value = ((byte) (b4 & 0x7f));
        new Here("Unit", 123).given(b4, 5).checkEq(value, 5);
        new Here("Unit", 123).given(b4, 7).checkEq(value, 7);
        new Here("Unit", 123).given(b4, 15).checkEq(value, 15);
        new Here("Randoop", 123).given(b4, 67).checkEq(value, 67);
        new Here("Randoop", 123).given(b4, 13).checkEq(value, 13);
        new Here("Randoop", 123).given(b4, -17).checkEq(value, 111);
        new Here("Unit", 123).given(b4, 22).checkEq(value, 22);
        new Here("Unit", 123).given(b4, 9).checkEq(value, 9);
        new Here("Randoop", 123).given(b4, 125).checkEq(value, 125);
        new Here("Randoop", 123).given(b4, 10).checkEq(value, 10);
        new Here("Unit", 123).given(b4, 32).checkEq(value, 32);
        new Here("Randoop", 123).given(b4, 16).checkEq(value, 16);
        new Here("Unit", 123).given(b4, 46).checkEq(value, 46);
        new Here("Randoop", 123).given(b4, 126).checkEq(value, 126);
        new Here("Randoop", 123).given(b4, 71).checkEq(value, 71);
        new Here("Unit", 123).given(b4, 12).checkEq(value, 12);
        new Here("Randoop", 123).given(b4, 68).checkEq(value, 68);
        new Here("Randoop", 123).given(b4, 5).checkEq(value, 5);
        new Here("Unit", 123).given(b4, 31).checkEq(value, 31);
        new Here("Randoop", 123).given(b4, 6).checkEq(value, 6);
        new Here("Randoop", 123).given(b4, 7).checkEq(value, 7);
        new Here("Randoop", 123).given(b4, 3).checkEq(value, 3);
        new Here("Randoop", 123).given(b4, 4).checkEq(value, 4);
        new Here("Unit", 123).given(b4, 75).checkEq(value, 75);
        new Here("Randoop", 123).given(b4, 100).checkEq(value, 100);
        new Here("Unit", 123).given(b4, 122).checkEq(value, 122);
        new Here("Randoop", 123).given(b4, 9).checkEq(value, 9);
        new Here("Unit", 123).given(b4, 14).checkEq(value, 14);
        new Here("Unit", 123).given(b4, 65).checkEq(value, 65);
        new Here("Randoop", 123).given(b4, 27).checkEq(value, 27);
        new Here("Randoop", 123).given(b4, 1).checkEq(value, 1);
        new Here("Unit", 123).given(b4, 0).checkEq(value, 0);
        new Here("Randoop", 123).given(b4, 2).checkEq(value, 2);
        new Here("Unit", 123).given(b4, 2).checkEq(value, 2);
        new Here("Unit", 123).given(b4, 1).checkEq(value, 1);
        new Here("Randoop", 123).given(b4, 0).checkEq(value, 0);
        new Here("Unit", 123).given(b4, 4).checkEq(value, 4);
        new Here("Unit", 123).given(b4, 37).checkEq(value, 37);
        new Here("Unit", 123).given(b4, 107).checkEq(value, 107);
        new Here("Unit", 123).given(b4, 6).checkEq(value, 6);
        new Here("Unit", 123).given(b4, 20).checkEq(value, 20);
        new Here("Unit", 123).given(b4, 10).checkEq(value, 10);
        new Here("Randoop", 123).given(b4, 89).checkEq(value, 89);
        new Here("Unit", 123).given(b4, 64).checkEq(value, 64);
        new Here("Unit", 123).given(b4, 8).checkEq(value, 8);
        new Here("Unit", 123).given(b4, 17).checkEq(value, 17);
        new Here("Unit", 123).given(b4, 110).checkEq(value, 110);
        new Here("Randoop", 123).given(b4, 86).checkEq(value, 86);
        new Here("Randoop", 123).given(b4, 42).checkEq(value, 42);
        new Here("Randoop", 123).given(b4, 11).checkEq(value, 11);
        new Here("Unit", 123).given(b4, 24).checkEq(value, 24);
        new Here("Randoop", 123).given(b4, 99).checkEq(value, 99);
        new Here("Randoop", 123).given(b4, -1).checkEq(value, 127);
        new Here("Randoop", 123).given(b4, 19).checkEq(value, 19);
        new Here("Unit", 123).given(b4, 106).checkEq(value, 106);
        new Here("Randoop", 123).given(b4, 111).checkEq(value, 111);
        new Here("Unit", 123).given(b4, 16).checkEq(value, 16);
        new Here("Unit", 123).given(b4, 26).checkEq(value, 26);
        new Here("Unit", 123).given(b4, 36).checkEq(value, 36);
        new Here("Unit", 123).given(b4, 19).checkEq(value, 19);
        new Here("Randoop", 123).given(b4, 120).checkEq(value, 120);
        new Here("Unit", 123).given(b4, 57).checkEq(value, 57);
        new Here("Unit", 123).given(b4, 33).checkEq(value, 33);
        new Here("Unit", 123).given(b4, 13).checkEq(value, 13);
        new Here("Randoop", 123).given(b4, 18).checkEq(value, 18);
        new Here("Randoop", 123).given(b4, 15).checkEq(value, 15);
        new Here("Unit", 123).given(b4, 30).checkEq(value, 30);
        new Here("Randoop", 123).given(b4, 12).checkEq(value, 12);
        new Here("Unit", 123).given(b4, 23).checkEq(value, 23);
        value += shiftByte((byte) (b3 & 0x7f), -7);
        new Here("Randoop", 124).given(b3, 0).given(value, 86).checkEq(value, 86);
        new Here("Randoop", 124).given(b3, -1).given(value, 10).checkEq(value, 16266);
        new Here("Unit", 124).given(b3, 4).given(value, 7).checkEq(value, 519);
        new Here("Unit", 124).given(b3, 10).given(value, 122).checkEq(value, 1402);
        new Here("Unit", 124).given(b3, 20).given(value, 26).checkEq(value, 2586);
        new Here("Unit", 124).given(b3, 0).given(value, 22).checkEq(value, 22);
        new Here("Randoop", 124).given(b3, -1).given(value, 15).checkEq(value, 16271);
        new Here("Unit", 124).given(b3, 0).given(value, 15).checkEq(value, 15);
        new Here("Randoop", 124).given(b3, 65).given(value, 89).checkEq(value, 8409);
        new Here("Unit", 124).given(b3, 24).given(value, 65).checkEq(value, 3137);
        new Here("Randoop", 124).given(b3, 0).given(value, 19).checkEq(value, 19);
        new Here("Randoop", 124).given(b3, 7).given(value, 3).checkEq(value, 899);
        new Here("Unit", 124).given(b3, 2).given(value, 1).checkEq(value, 257);
        new Here("Unit", 124).given(b3, 7).given(value, 106).checkEq(value, 1002);
        new Here("Unit", 124).given(b3, 0).given(value, 0).checkEq(value, 0);
        new Here("Randoop", 124).given(b3, 67).given(value, 67).checkEq(value, 8643);
        new Here("Unit", 124).given(b3, 14).given(value, 106).checkEq(value, 1898);
        new Here("Unit", 124).given(b3, 0).given(value, 4).checkEq(value, 4);
        new Here("Unit", 124).given(b3, 0).given(value, 5).checkEq(value, 5);
        new Here("Randoop", 124).given(b3, 3).given(value, 0).checkEq(value, 384);
        new Here("Unit", 124).given(b3, 0).given(value, 9).checkEq(value, 9);
        new Here("Unit", 124).given(b3, 0).given(value, 8).checkEq(value, 8);
        new Here("Unit", 124).given(b3, 3).given(value, 110).checkEq(value, 494);
        new Here("Randoop", 124).given(b3, 10).given(value, 6).checkEq(value, 1286);
        new Here("Randoop", 124).given(b3, 67).given(value, 19).checkEq(value, 8595);
        new Here("Randoop", 124).given(b3, 6).given(value, 18).checkEq(value, 786);
        new Here("Unit", 124).given(b3, 0).given(value, 30).checkEq(value, 30);
        new Here("Randoop", 124).given(b3, 3).given(value, 7).checkEq(value, 391);
        new Here("Randoop", 124).given(b3, 27).given(value, 3).checkEq(value, 3459);
        new Here("Randoop", 124).given(b3, -115).given(value, 16).checkEq(value, 1680);
        new Here("Randoop", 124).given(b3, 6).given(value, 6).checkEq(value, 774);
        new Here("Randoop", 124).given(b3, 0).given(value, 111).checkEq(value, 111);
        new Here("Randoop", 124).given(b3, 0).given(value, 71).checkEq(value, 71);
        new Here("Unit", 124).given(b3, 18).given(value, 36).checkEq(value, 2340);
        new Here("Randoop", 124).given(b3, 1).given(value, 27).checkEq(value, 155);
        new Here("Randoop", 124).given(b3, 13).given(value, 5).checkEq(value, 1669);
        new Here("Randoop", 124).given(b3, 12).given(value, 3).checkEq(value, 1539);
        new Here("Randoop", 124).given(b3, 13).given(value, 12).checkEq(value, 1676);
        new Here("Unit", 124).given(b3, 0).given(value, 16).checkEq(value, 16);
        new Here("Randoop", 124).given(b3, 3).given(value, 111).checkEq(value, 495);
        new Here("Unit", 124).given(b3, 0).given(value, 33).checkEq(value, 33);
        new Here("Randoop", 124).given(b3, 0).given(value, 99).checkEq(value, 99);
        new Here("Unit", 124).given(b3, 11).given(value, 24).checkEq(value, 1432);
        new Here("Randoop", 124).given(b3, 19).given(value, 16).checkEq(value, 2448);
        new Here("Unit", 124).given(b3, 8).given(value, 65).checkEq(value, 1089);
        new Here("Unit", 124).given(b3, 0).given(value, 13).checkEq(value, 13);
        new Here("Unit", 124).given(b3, 0).given(value, 19).checkEq(value, 19);
        new Here("Unit", 124).given(b3, 0).given(value, 10).checkEq(value, 10);
        new Here("Unit", 124).given(b3, 9).given(value, 65).checkEq(value, 1217);
        new Here("Randoop", 124).given(b3, 0).given(value, 100).checkEq(value, 100);
        new Here("Randoop", 124).given(b3, 0).given(value, 126).checkEq(value, 126);
        new Here("Randoop", 124).given(b3, 0).given(value, 15).checkEq(value, 15);
        new Here("Randoop", 124).given(b3, 20).given(value, 2).checkEq(value, 2562);
        new Here("Unit", 124).given(b3, 18).given(value, 26).checkEq(value, 2330);
        new Here("Unit", 124).given(b3, 0).given(value, 12).checkEq(value, 12);
        new Here("Randoop", 124).given(b3, 12).given(value, 15).checkEq(value, 1551);
        new Here("Randoop", 124).given(b3, 19).given(value, 111).checkEq(value, 2543);
        new Here("Unit", 124).given(b3, 3).given(value, 107).checkEq(value, 491);
        new Here("Randoop", 124).given(b3, 0).given(value, 42).checkEq(value, 42);
        new Here("Unit", 124).given(b3, 0).given(value, 46).checkEq(value, 46);
        new Here("Randoop", 124).given(b3, 0).given(value, 125).checkEq(value, 125);
        new Here("Randoop", 124).given(b3, 0).given(value, 9).checkEq(value, 9);
        new Here("Randoop", 124).given(b3, 0).given(value, 16).checkEq(value, 16);
        new Here("Unit", 124).given(b3, 9).given(value, 75).checkEq(value, 1227);
        new Here("Randoop", 124).given(b3, 13).given(value, 13).checkEq(value, 1677);
        new Here("Randoop", 124).given(b3, 10).given(value, 4).checkEq(value, 1284);
        new Here("Randoop", 124).given(b3, 5).given(value, 18).checkEq(value, 658);
        new Here("Randoop", 124).given(b3, 0).given(value, 0).checkEq(value, 0);
        new Here("Unit", 124).given(b3, 0).given(value, 2).checkEq(value, 2);
        new Here("Randoop", 124).given(b3, 0).given(value, 5).checkEq(value, 5);
        new Here("Randoop", 124).given(b3, 3).given(value, 67).checkEq(value, 451);
        new Here("Randoop", 124).given(b3, 3).given(value, 16).checkEq(value, 400);
        new Here("Randoop", 124).given(b3, 0).given(value, 4).checkEq(value, 4);
        new Here("Unit", 124).given(b3, 0).given(value, 32).checkEq(value, 32);
        new Here("Randoop", 124).given(b3, 100).given(value, 68).checkEq(value, 12868);
        new Here("Unit", 124).given(b3, 0).given(value, 7).checkEq(value, 7);
        new Here("Randoop", 124).given(b3, 27).given(value, 19).checkEq(value, 3475);
        new Here("Unit", 124).given(b3, 0).given(value, 6).checkEq(value, 6);
        new Here("Unit", 124).given(b3, 0).given(value, 20).checkEq(value, 20);
        new Here("Unit", 124).given(b3, 96).given(value, 57).checkEq(value, 12345);
        new Here("Randoop", 124).given(b3, 9).given(value, 127).checkEq(value, 1279);
        new Here("Unit", 124).given(b3, 0).given(value, 37).checkEq(value, 37);
        new Here("Randoop", 124).given(b3, 9).given(value, 2).checkEq(value, 1154);
        new Here("Randoop", 124).given(b3, 3).given(value, 11).checkEq(value, 395);
        new Here("Randoop", 124).given(b3, -115).given(value, 127).checkEq(value, 1791);
        new Here("Randoop", 124).given(b3, 0).given(value, 67).checkEq(value, 67);
        new Here("Unit", 124).given(b3, 0).given(value, 14).checkEq(value, 14);
        new Here("Unit", 124).given(b3, 0).given(value, 17).checkEq(value, 17);
        new Here("Randoop", 124).given(b3, -115).given(value, 4).checkEq(value, 1668);
        new Here("Unit", 124).given(b3, 1).given(value, 64).checkEq(value, 192);
        new Here("Randoop", 124).given(b3, 0).given(value, 13).checkEq(value, 13);
        new Here("Unit", 124).given(b3, 0).given(value, 31).checkEq(value, 31);
        new Here("Randoop", 124).given(b3, -17).given(value, 18).checkEq(value, 14226);
        new Here("Randoop", 124).given(b3, 13).given(value, 7).checkEq(value, 1671);
        new Here("Randoop", 124).given(b3, 0).given(value, 120).checkEq(value, 120);
        new Here("Randoop", 124).given(b3, 20).given(value, 11).checkEq(value, 2571);
        new Here("Randoop", 124).given(b3, 3).given(value, 27).checkEq(value, 411);
        new Here("Randoop", 124).given(b3, 10).given(value, 2).checkEq(value, 1282);
        new Here("Unit", 124).given(b3, 0).given(value, 23).checkEq(value, 23);
        new Here("Randoop", 124).given(b3, 2).given(value, 5).checkEq(value, 261);
        new Here("Randoop", 124).given(b3, 68).given(value, 4).checkEq(value, 8708);
        new Here("Randoop", 124).given(b3, 100).given(value, 11).checkEq(value, 12811);
        new Here("Randoop", 124).given(b3, 100).given(value, 7).checkEq(value, 12807);
        new Here("Randoop", 124).given(b3, 9).given(value, 1).checkEq(value, 1153);
        value += shiftByte((byte) (b2 & 0x7f), -14);
        new Here("Randoop", 125).given(b2, 1).given(value, 1284).checkEq(value, 17668);
        new Here("Randoop", 125).given(b2, 4).given(value, 400).checkEq(value, 65936);
        new Here("Unit", 125).given(b2, 0).given(value, 10).checkEq(value, 10);
        new Here("Unit", 125).given(b2, 0).given(value, 17).checkEq(value, 17);
        new Here("Randoop", 125).given(b2, -1).given(value, 1677).checkEq(value, 2082445);
        new Here("Unit", 125).given(b2, 0).given(value, 7).checkEq(value, 7);
        new Here("Randoop", 125).given(b2, 19).given(value, 391).checkEq(value, 311687);
        new Here("Randoop", 125).given(b2, 68).given(value, 1154).checkEq(value, 1115266);
        new Here("Randoop", 125).given(b2, 2).given(value, 451).checkEq(value, 33219);
        new Here("Unit", 125).given(b2, 0).given(value, 30).checkEq(value, 30);
        new Here("Randoop", 125).given(b2, 0).given(value, 9).checkEq(value, 9);
        new Here("Randoop", 125).given(b2, 0).given(value, 12807).checkEq(value, 12807);
        new Here("Unit", 125).given(b2, 0).given(value, 3137).checkEq(value, 3137);
        new Here("Randoop", 125).given(b2, 0).given(value, 0).checkEq(value, 0);
        new Here("Randoop", 125).given(b2, 0).given(value, 111).checkEq(value, 111);
        new Here("Randoop", 125).given(b2, 12).given(value, 8643).checkEq(value, 205251);
        new Here("Randoop", 125).given(b2, 0).given(value, 4).checkEq(value, 4);
        new Here("Unit", 125).given(b2, 0).given(value, 31).checkEq(value, 31);
        new Here("Unit", 125).given(b2, 0).given(value, 494).checkEq(value, 494);
        new Here("Unit", 125).given(b2, 0).given(value, 23).checkEq(value, 23);
        new Here("Randoop", 125).given(b2, 19).given(value, 16271).checkEq(value, 327567);
        new Here("Randoop", 125).given(b2, 0).given(value, 5).checkEq(value, 5);
        new Here("Unit", 125).given(b2, 0).given(value, 16).checkEq(value, 16);
        new Here("Randoop", 125).given(b2, 1).given(value, 786).checkEq(value, 17170);
        new Here("Unit", 125).given(b2, 0).given(value, 37).checkEq(value, 37);
        new Here("Unit", 125).given(b2, 0).given(value, 491).checkEq(value, 491);
        new Here("Unit", 125).given(b2, 0).given(value, 2340).checkEq(value, 2340);
        new Here("Unit", 125).given(b2, 15).given(value, 1432).checkEq(value, 247192);
        new Here("Randoop", 125).given(b2, 0).given(value, 8708).checkEq(value, 8708);
        new Here("Unit", 125).given(b2, 0).given(value, 22).checkEq(value, 22);
        new Here("Randoop", 125).given(b2, -17).given(value, 1153).checkEq(value, 1819777);
        new Here("Randoop", 125).given(b2, 13).given(value, 3459).checkEq(value, 216451);
        new Here("Unit", 125).given(b2, 0).given(value, 1898).checkEq(value, 1898);
        new Here("Randoop", 125).given(b2, 14).given(value, 12811).checkEq(value, 242187);
        new Here("Unit", 125).given(b2, 0).given(value, 519).checkEq(value, 519);
        new Here("Unit", 125).given(b2, 0).given(value, 12345).checkEq(value, 12345);
        new Here("Randoop", 125).given(b2, 0).given(value, 15).checkEq(value, 15);
        new Here("Randoop", 125).given(b2, 0).given(value, 384).checkEq(value, 384);
        new Here("Unit", 125).given(b2, 0).given(value, 192).checkEq(value, 192);
        new Here("Randoop", 125).given(b2, 27).given(value, 2562).checkEq(value, 444930);
        new Here("Randoop", 125).given(b2, 0).given(value, 86).checkEq(value, 86);
        new Here("Randoop", 125).given(b2, 4).given(value, 1279).checkEq(value, 66815);
        new Here("Unit", 125).given(b2, 4).given(value, 257).checkEq(value, 65793);
        new Here("Randoop", 125).given(b2, 105).given(value, 12868).checkEq(value, 1733188);
        new Here("Randoop", 125).given(b2, 14).given(value, 395).checkEq(value, 229771);
        new Here("Unit", 125).given(b2, 0).given(value, 1002).checkEq(value, 1002);
        new Here("Randoop", 125).given(b2, 19).given(value, 1669).checkEq(value, 312965);
        new Here("Unit", 125).given(b2, 0).given(value, 1402).checkEq(value, 1402);
        new Here("Unit", 125).given(b2, 0).given(value, 1227).checkEq(value, 1227);
        new Here("Unit", 125).given(b2, 0).given(value, 2330).checkEq(value, 2330);
        new Here("Unit", 125).given(b2, 0).given(value, 257).checkEq(value, 257);
        new Here("Randoop", 125).given(b2, -17).given(value, 14226).checkEq(value, 1832850);
        new Here("Randoop", 125).given(b2, 16).given(value, 1671).checkEq(value, 263815);
        new Here("Randoop", 125).given(b2, -1).given(value, 1791).checkEq(value, 2082559);
        new Here("Randoop", 125).given(b2, 0).given(value, 71).checkEq(value, 71);
        new Here("Randoop", 125).given(b2, 14).given(value, 2448).checkEq(value, 231824);
        new Here("Unit", 125).given(b2, 0).given(value, 20).checkEq(value, 20);
        new Here("Randoop", 125).given(b2, 15).given(value, 1286).checkEq(value, 247046);
        new Here("Unit", 125).given(b2, 0).given(value, 5).checkEq(value, 5);
        new Here("Randoop", 125).given(b2, 27).given(value, 411).checkEq(value, 442779);
        new Here("Unit", 125).given(b2, 0).given(value, 14).checkEq(value, 14);
        new Here("Randoop", 125).given(b2, 100).given(value, 16266).checkEq(value, 1654666);
        new Here("Unit", 125).given(b2, 0).given(value, 9).checkEq(value, 9);
        new Here("Randoop", 125).given(b2, 0).given(value, 99).checkEq(value, 99);
        new Here("Randoop", 125).given(b2, 6).given(value, 2571).checkEq(value, 100875);
        new Here("Unit", 125).given(b2, 0).given(value, 33).checkEq(value, 33);
        new Here("Unit", 125).given(b2, 0).given(value, 13).checkEq(value, 13);
        new Here("Randoop", 125).given(b2, 27).given(value, 155).checkEq(value, 442523);
        new Here("Randoop", 125).given(b2, 16).given(value, 1551).checkEq(value, 263695);
        new Here("Randoop", 125).given(b2, 2).given(value, 495).checkEq(value, 33263);
        new Here("Randoop", 125).given(b2, 2).given(value, 2543).checkEq(value, 35311);
        new Here("Randoop", 125).given(b2, 11).given(value, 1680).checkEq(value, 181904);
        new Here("Unit", 125).given(b2, 0).given(value, 1217).checkEq(value, 1217);
        new Here("Randoop", 125).given(b2, 8).given(value, 261).checkEq(value, 131333);
        new Here("Unit", 125).given(b2, 0).given(value, 2).checkEq(value, 2);
        new Here("Randoop", 125).given(b2, 1).given(value, 1539).checkEq(value, 17923);
        new Here("Randoop", 125).given(b2, 1).given(value, 1282).checkEq(value, 17666);
        new Here("Unit", 125).given(b2, 0).given(value, 32).checkEq(value, 32);
        new Here("Randoop", 125).given(b2, 80).given(value, 8409).checkEq(value, 1319129);
        new Here("Randoop", 125).given(b2, 13).given(value, 774).checkEq(value, 213766);
        new Here("Unit", 125).given(b2, 0).given(value, 0).checkEq(value, 0);
        new Here("Unit", 125).given(b2, 0).given(value, 8).checkEq(value, 8);
        new Here("Unit", 125).given(b2, 0).given(value, 1089).checkEq(value, 1089);
        new Here("Unit", 125).given(b2, 0).given(value, 6).checkEq(value, 6);
        new Here("Randoop", 125).given(b2, 0).given(value, 1676).checkEq(value, 1676);
        new Here("Unit", 125).given(b2, 0).given(value, 12).checkEq(value, 12);
        new Here("Randoop", 125).given(b2, 0).given(value, 19).checkEq(value, 19);
        new Here("Randoop", 125).given(b2, 0).given(value, 120).checkEq(value, 120);
        new Here("Randoop", 125).given(b2, 68).given(value, 899).checkEq(value, 1115011);
        new Here("Unit", 125).given(b2, 0).given(value, 4).checkEq(value, 4);
        new Here("Randoop", 125).given(b2, 0).given(value, 125).checkEq(value, 125);
        new Here("Randoop", 125).given(b2, 0).given(value, 126).checkEq(value, 126);
        new Here("Randoop", 125).given(b2, -1).given(value, 1668).checkEq(value, 2082436);
        new Here("Randoop", 125).given(b2, 0).given(value, 42).checkEq(value, 42);
        new Here("Unit", 125).given(b2, 0).given(value, 46).checkEq(value, 46);
        new Here("Unit", 125).given(b2, 0).given(value, 2586).checkEq(value, 2586);
        new Here("Randoop", 125).given(b2, 0).given(value, 13).checkEq(value, 13);
        new Here("Randoop", 125).given(b2, 0).given(value, 100).checkEq(value, 100);
        new Here("Randoop", 125).given(b2, 0).given(value, 16).checkEq(value, 16);
        new Here("Randoop", 125).given(b2, 0).given(value, 67).checkEq(value, 67);
        new Here("Unit", 125).given(b2, 0).given(value, 15).checkEq(value, 15);
        new Here("Randoop", 125).given(b2, 27).given(value, 8595).checkEq(value, 450963);
        new Here("Randoop", 125).given(b2, 19).given(value, 3475).checkEq(value, 314771);
        new Here("Randoop", 125).given(b2, 14).given(value, 658).checkEq(value, 230034);
        value += shiftByte((byte) (b1 & 0x7f), -21);
        new Here("Randoop", 126).given(value, 450963).given(b1, 19).checkEq(value, 40296851);
        new Here("Randoop", 126).given(value, 247046).given(b1, 8).checkEq(value, 17024262);
        new Here("Randoop", 126).given(value, 444930).given(b1, 3).checkEq(value, 6736386);
        new Here("Randoop", 126).given(value, 1115011).given(b1, 9).checkEq(value, 19989379);
        new Here("Randoop", 126).given(value, 16).given(b1, 0).checkEq(value, 16);
        new Here("Randoop", 126).given(value, 263695).given(b1, 7).checkEq(value, 14943759);
        new Here("Unit", 126).given(value, 33).given(b1, 0).checkEq(value, 33);
        new Here("Unit", 126).given(value, 2).given(b1, 0).checkEq(value, 2);
        new Here("Unit", 126).given(value, 2340).given(b1, 0).checkEq(value, 2340);
        new Here("Unit", 126).given(value, 15).given(b1, 0).checkEq(value, 15);
        new Here("Unit", 126).given(value, 257).given(b1, 0).checkEq(value, 257);
        new Here("Randoop", 126).given(value, 5).given(b1, 0).checkEq(value, 5);
        new Here("Unit", 126).given(value, 2330).given(b1, 0).checkEq(value, 2330);
        new Here("Unit", 126).given(value, 17).given(b1, 0).checkEq(value, 17);
        new Here("Unit", 126).given(value, 7).given(b1, 0).checkEq(value, 7);
        new Here("Unit", 126).given(value, 12).given(b1, 0).checkEq(value, 12);
        new Here("Unit", 126).given(value, 10).given(b1, 0).checkEq(value, 10);
        new Here("Randoop", 126).given(value, 33263).given(b1, 6).checkEq(value, 12616175);
        new Here("Unit", 126).given(value, 8).given(b1, 0).checkEq(value, 8);
        new Here("Randoop", 126).given(value, 327567).given(b1, 6).checkEq(value, 12910479);
        new Here("Randoop", 126).given(value, 0).given(b1, 0).checkEq(value, 0);
        new Here("Randoop", 126).given(value, 66815).given(b1, 3).checkEq(value, 6358271);
        new Here("Randoop", 126).given(value, 229771).given(b1, 2).checkEq(value, 4424075);
        new Here("Randoop", 126).given(value, 131333).given(b1, 15).checkEq(value, 31588613);
        new Here("Unit", 126).given(value, 192).given(b1, 0).checkEq(value, 192);
        new Here("Unit", 126).given(value, 9).given(b1, 0).checkEq(value, 9);
        new Here("Randoop", 126).given(value, 1319129).given(b1, 87).checkEq(value, 183771353);
        new Here("Unit", 126).given(value, 22).given(b1, 0).checkEq(value, 22);
        new Here("Randoop", 126).given(value, 13).given(b1, 0).checkEq(value, 13);
        new Here("Unit", 126).given(value, 1898).given(b1, 0).checkEq(value, 1898);
        new Here("Unit", 126).given(value, 6).given(b1, 0).checkEq(value, 6);
        new Here("Randoop", 126).given(value, 1832850).given(b1, 13).checkEq(value, 29095826);
        new Here("Randoop", 126).given(value, 9).given(b1, 0).checkEq(value, 9);
        new Here("Unit", 126).given(value, 494).given(b1, 0).checkEq(value, 494);
        new Here("Unit", 126).given(value, 491).given(b1, 0).checkEq(value, 491);
        new Here("Randoop", 126).given(value, 0).given(b1, 10).checkEq(value, 20971520);
        new Here("Randoop", 126).given(value, 1676).given(b1, 10).checkEq(value, 20973196);
        new Here("Randoop", 126).given(value, 384).given(b1, 0).checkEq(value, 384);
        new Here("Randoop", 126).given(value, 1654666).given(b1, 0).checkEq(value, 1654666);
        new Here("Randoop", 126).given(value, 1819777).given(b1, 8).checkEq(value, 18596993);
        new Here("Unit", 126).given(value, 37).given(b1, 0).checkEq(value, 37);
        new Here("Randoop", 126).given(value, 4).given(b1, 0).checkEq(value, 4);
        new Here("Unit", 126).given(value, 23).given(b1, 0).checkEq(value, 23);
        new Here("Randoop", 126).given(value, 205251).given(b1, 6).checkEq(value, 12788163);
        new Here("Unit", 126).given(value, 4).given(b1, 0).checkEq(value, 4);
        new Here("Unit", 126).given(value, 1089).given(b1, 0).checkEq(value, 1089);
        new Here("Randoop", 126).given(value, 231824).given(b1, 100).checkEq(value, 209947024);
        new Here("Randoop", 126).given(value, 8708).given(b1, 12).checkEq(value, 25174532);
        new Here("Randoop", 126).given(value, 311687).given(b1, 2).checkEq(value, 4505991);
        new Here("Randoop", 126).given(value, 33219).given(b1, 100).checkEq(value, 209748419);
        new Here("Randoop", 126).given(value, 111).given(b1, 0).checkEq(value, 111);
        new Here("Unit", 126).given(value, 5).given(b1, 0).checkEq(value, 5);
        new Here("Randoop", 126).given(value, 442779).given(b1, 0).checkEq(value, 442779);
        new Here("Randoop", 126).given(value, 42).given(b1, 0).checkEq(value, 42);
        new Here("Randoop", 126).given(value, 213766).given(b1, 14).checkEq(value, 29573894);
        new Here("Randoop", 126).given(value, 17170).given(b1, 10).checkEq(value, 20988690);
        new Here("Randoop", 126).given(value, 100).given(b1, 0).checkEq(value, 100);
        new Here("Randoop", 126).given(value, 120).given(b1, 0).checkEq(value, 120);
        new Here("Unit", 126).given(value, 20).given(b1, 0).checkEq(value, 20);
        new Here("Randoop", 126).given(value, 2082436).given(b1, 100).checkEq(value, 211797636);
        new Here("Randoop", 126).given(value, 125).given(b1, 0).checkEq(value, 125);
        new Here("Randoop", 126).given(value, 1115266).given(b1, 1).checkEq(value, 3212418);
        new Here("Randoop", 126).given(value, 126).given(b1, 0).checkEq(value, 126);
        new Here("Unit", 126).given(value, 16).given(b1, 0).checkEq(value, 16);
        new Here("Randoop", 126).given(value, 242187).given(b1, 0).checkEq(value, 242187);
        new Here("Randoop", 126).given(value, 17666).given(b1, 16).checkEq(value, 33572098);
        new Here("Unit", 126).given(value, 3137).given(b1, 0).checkEq(value, 3137);
        new Here("Randoop", 126).given(value, 2082559).given(b1, 11).checkEq(value, 25151231);
        new Here("Unit", 126).given(value, 1002).given(b1, 0).checkEq(value, 1002);
        new Here("Randoop", 126).given(value, 2082445).given(b1, 9).checkEq(value, 20956813);
        new Here("Randoop", 126).given(value, 86).given(b1, 0).checkEq(value, 86);
        new Here("Unit", 126).given(value, 247192).given(b1, 0).checkEq(value, 247192);
        new Here("Unit", 126).given(value, 2586).given(b1, 0).checkEq(value, 2586);
        new Here("Unit", 126).given(value, 0).given(b1, 0).checkEq(value, 0);
        new Here("Randoop", 126).given(value, 15).given(b1, 0).checkEq(value, 15);
        new Here("Randoop", 126).given(value, 1733188).given(b1, 108).checkEq(value, 228225604);
        new Here("Unit", 126).given(value, 65793).given(b1, 8).checkEq(value, 16843009);
        new Here("Randoop", 126).given(value, 263815).given(b1, 6).checkEq(value, 12846727);
        new Here("Unit", 126).given(value, 1217).given(b1, 0).checkEq(value, 1217);
        new Here("Unit", 126).given(value, 1227).given(b1, 0).checkEq(value, 1227);
        new Here("Randoop", 126).given(value, 442523).given(b1, 8).checkEq(value, 17219739);
        new Here("Unit", 126).given(value, 519).given(b1, 0).checkEq(value, 519);
        new Here("Randoop", 126).given(value, 314771).given(b1, -17).checkEq(value, 233098643);
        new Here("Randoop", 126).given(value, 181904).given(b1, 5).checkEq(value, 10667664);
        new Here("Randoop", 126).given(value, 67).given(b1, 11).checkEq(value, 23068739);
        new Here("Unit", 126).given(value, 31).given(b1, 0).checkEq(value, 31);
        new Here("Randoop", 126).given(value, 71).given(b1, 0).checkEq(value, 71);
        new Here("Unit", 126).given(value, 13).given(b1, 0).checkEq(value, 13);
        new Here("Unit", 126).given(value, 1402).given(b1, 0).checkEq(value, 1402);
        new Here("Randoop", 126).given(value, 99).given(b1, 0).checkEq(value, 99);
        new Here("Unit", 126).given(value, 32).given(b1, 0).checkEq(value, 32);
        new Here("Randoop", 126).given(value, 216451).given(b1, 9).checkEq(value, 19090819);
        new Here("Randoop", 126).given(value, 12807).given(b1, 0).checkEq(value, 12807);
        new Here("Randoop", 126).given(value, 35311).given(b1, 11).checkEq(value, 23103983);
        new Here("Unit", 126).given(value, 46).given(b1, 0).checkEq(value, 46);
        new Here("Randoop", 126).given(value, 230034).given(b1, 19).checkEq(value, 40075922);
        new Here("Randoop", 126).given(value, 19).given(b1, 0).checkEq(value, 19);
        new Here("Randoop", 126).given(value, 17923).given(b1, -17).checkEq(value, 232801795);
        new Here("Randoop", 126).given(value, 100875).given(b1, 11).checkEq(value, 23169547);
        new Here("Randoop", 126).given(value, 0).given(b1, 77).checkEq(value, 161480704);
        new Here("Randoop", 126).given(value, 65936).given(b1, 10).checkEq(value, 21037456);
        new Here("Unit", 126).given(value, 30).given(b1, 0).checkEq(value, 30);
        new Here("Unit", 126).given(value, 12345).given(b1, 0).checkEq(value, 12345);
        new Here("Unit", 126).given(value, 14).given(b1, 0).checkEq(value, 14);
        new Here("Randoop", 126).given(value, 312965).given(b1, -1).checkEq(value, 266651269);
        new Here("Randoop", 126).given(value, 17668).given(b1, 14).checkEq(value, 29377796);
        return value;
    }

    public static byte[] packSynchsafeInteger(int i) {
        byte[] bytes = new byte[4];
        packSynchsafeInteger(i, bytes, 0);
        return bytes;
    }

    public static void packSynchsafeInteger(int i, byte[] bytes, int offset) {
        bytes[offset + 3] = (byte) (i & 0x7f);
        new Here("Randoop", 137).given(i, 232801795).checkEq(bytes[offset + 3], 3);
        new Here("Randoop", 137).given(i, 32).checkEq(bytes[offset + 3], 32);
        new Here("Unit", 137).given(i, 8).checkEq(bytes[offset + 3], 8);
        new Here("Unit", 137).given(i, 16843009).checkEq(bytes[offset + 3], 1);
        new Here("Randoop", 137).given(i, 0).checkEq(bytes[offset + 3], 0);
        new Here("Unit", 137).given(i, 12).checkEq(bytes[offset + 3], 12);
        new Here("Randoop", 137).given(i, 15).checkEq(bytes[offset + 3], 15);
        new Here("Unit", 137).given(i, 30).checkEq(bytes[offset + 3], 30);
        new Here("Unit", 137).given(i, 16).checkEq(bytes[offset + 3], 16);
        new Here("Randoop", 137).given(i, 120).checkEq(bytes[offset + 3], 120);
        new Here("Randoop", 137).given(i, 126).checkEq(bytes[offset + 3], 126);
        new Here("Randoop", 137).given(i, 125).checkEq(bytes[offset + 3], 125);
        new Here("Randoop", 137).given(i, 127).checkEq(bytes[offset + 3], 127);
        new Here("Randoop", 137).given(i, 76).checkEq(bytes[offset + 3], 76);
        new Here("Randoop", 137).given(i, 71).checkEq(bytes[offset + 3], 71);
        new Here("Unit", 137).given(i, 1227).checkEq(bytes[offset + 3], 75);
        new Here("Randoop", 137).given(i, 67).checkEq(bytes[offset + 3], 67);
        new Here("Randoop", 137).given(i, 111).checkEq(bytes[offset + 3], 111);
        new Here("Randoop", 137).given(i, 100).checkEq(bytes[offset + 3], 100);
        new Here("Unit", 137).given(i, 192).checkEq(bytes[offset + 3], 64);
        new Here("Randoop", 137).given(i, 137).checkEq(bytes[offset + 3], 9);
        new Here("Randoop", 137).given(i, 99).checkEq(bytes[offset + 3], 99);
        new Here("Unit", 137).given(i, 2).checkEq(bytes[offset + 3], 2);
        new Here("Randoop", 137).given(i, 45).checkEq(bytes[offset + 3], 45);
        new Here("Unit", 137).given(i, 20).checkEq(bytes[offset + 3], 20);
        new Here("Randoop", 137).given(i, 19).checkEq(bytes[offset + 3], 19);
        new Here("Unit", 137).given(i, 17).checkEq(bytes[offset + 3], 17);
        new Here("Unit", 137).given(i, 9).checkEq(bytes[offset + 3], 9);
        new Here("Randoop", 137).given(i, 53).checkEq(bytes[offset + 3], 53);
        new Here("Unit", 137).given(i, 14).checkEq(bytes[offset + 3], 14);
        new Here("Randoop", 137).given(i, 52).checkEq(bytes[offset + 3], 52);
        new Here("Unit", 137).given(i, 19).checkEq(bytes[offset + 3], 19);
        new Here("Unit", 137).given(i, 257).checkEq(bytes[offset + 3], 1);
        new Here("Unit", 137).given(i, 23).checkEq(bytes[offset + 3], 23);
        new Here("Randoop", 137).given(i, 48).checkEq(bytes[offset + 3], 48);
        new Here("Randoop", 137).given(i, 4).checkEq(bytes[offset + 3], 4);
        new Here("Unit", 137).given(i, 2330).checkEq(bytes[offset + 3], 26);
        new Here("Unit", 137).given(i, 10).checkEq(bytes[offset + 3], 10);
        new Here("Unit", 137).given(i, 7).checkEq(bytes[offset + 3], 7);
        new Here("Randoop", 137).given(i, 12).checkEq(bytes[offset + 3], 12);
        new Here("Randoop", 137).given(i, 1).checkEq(bytes[offset + 3], 1);
        new Here("Unit", 137).given(i, 1002).checkEq(bytes[offset + 3], 106);
        new Here("Unit", 137).given(i, 12345).checkEq(bytes[offset + 3], 57);
        new Here("Randoop", 137).given(i, 118).checkEq(bytes[offset + 3], 118);
        new Here("Randoop", 137).given(i, 156).checkEq(bytes[offset + 3], 28);
        new Here("Randoop", 137).given(i, 51).checkEq(bytes[offset + 3], 51);
        new Here("Unit", 137).given(i, 13).checkEq(bytes[offset + 3], 13);
        new Here("Randoop", 137).given(i, 38).checkEq(bytes[offset + 3], 38);
        new Here("Unit", 137).given(i, 15).checkEq(bytes[offset + 3], 15);
        new Here("Unit", 137).given(i, 22).checkEq(bytes[offset + 3], 22);
        new Here("Randoop", 137).given(i, 11).checkEq(bytes[offset + 3], 11);
        new Here("Unit", 137).given(i, 6).checkEq(bytes[offset + 3], 6);
        new Here("Unit", 137).given(i, 2586).checkEq(bytes[offset + 3], 26);
        new Here("Randoop", 137).given(i, 10).checkEq(bytes[offset + 3], 10);
        new Here("Unit", 137).given(i, 1898).checkEq(bytes[offset + 3], 106);
        new Here("Randoop", 137).given(i, 16).checkEq(bytes[offset + 3], 16);
        new Here("Unit", 137).given(i, 2340).checkEq(bytes[offset + 3], 36);
        new Here("Unit", 137).given(i, 1089).checkEq(bytes[offset + 3], 65);
        new Here("Unit", 137).given(i, 1217).checkEq(bytes[offset + 3], 65);
        new Here("Randoop", 137).given(i, 3).checkEq(bytes[offset + 3], 3);
        new Here("Unit", 137).given(i, 5).checkEq(bytes[offset + 3], 5);
        bytes[offset + 2] = (byte) ((i >> 7) & 0x7f);
        new Here("Unit", 138).given(i, 23).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 52).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 19).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 118).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 111).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 10).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 5).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 232801795).checkEq(bytes[offset + 2], 12);
        new Here("Randoop", 138).given(i, 51).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 12).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 19).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 76).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 2586).checkEq(bytes[offset + 2], 20);
        new Here("Randoop", 138).given(i, 125).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 71).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 16).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 13).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 16).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 7).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 3).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 53).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 22).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 2).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 2330).checkEq(bytes[offset + 2], 18);
        new Here("Randoop", 138).given(i, 0).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 10).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 156).checkEq(bytes[offset + 2], 1);
        new Here("Unit", 138).given(i, 16843009).checkEq(bytes[offset + 2], 2);
        new Here("Randoop", 138).given(i, 11).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 32).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 1227).checkEq(bytes[offset + 2], 9);
        new Here("Unit", 138).given(i, 1002).checkEq(bytes[offset + 2], 7);
        new Here("Unit", 138).given(i, 2340).checkEq(bytes[offset + 2], 18);
        new Here("Unit", 138).given(i, 15).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 1).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 9).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 1089).checkEq(bytes[offset + 2], 8);
        new Here("Randoop", 138).given(i, 127).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 20).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 120).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 38).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 67).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 8).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 12).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 12345).checkEq(bytes[offset + 2], 96);
        new Here("Randoop", 138).given(i, 137).checkEq(bytes[offset + 2], 1);
        new Here("Randoop", 138).given(i, 100).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 1898).checkEq(bytes[offset + 2], 14);
        new Here("Randoop", 138).given(i, 45).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 30).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 1217).checkEq(bytes[offset + 2], 9);
        new Here("Randoop", 138).given(i, 15).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 14).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 192).checkEq(bytes[offset + 2], 1);
        new Here("Unit", 138).given(i, 257).checkEq(bytes[offset + 2], 2);
        new Here("Unit", 138).given(i, 17).checkEq(bytes[offset + 2], 0);
        new Here("Unit", 138).given(i, 6).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 48).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 126).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 99).checkEq(bytes[offset + 2], 0);
        new Here("Randoop", 138).given(i, 4).checkEq(bytes[offset + 2], 0);
        bytes[offset + 1] = (byte) ((i >> 14) & 0x7f);
        new Here("Randoop", 139).given(i, 126).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 19).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 48).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 11).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 19).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 2).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 2330).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 53).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 156).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 192).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 127).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 12).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 3).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 10).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 52).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 0).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 12345).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 9).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 2586).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 232801795).checkEq(bytes[offset + 1], 1);
        new Here("Unit", 139).given(i, 16843009).checkEq(bytes[offset + 1], 4);
        new Here("Randoop", 139).given(i, 76).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 137).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 22).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 67).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 16).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 13).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 125).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 10).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 7).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 71).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 1002).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 99).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 32).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 1227).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 20).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 118).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 6).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 15).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 5).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 2340).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 111).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 120).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 16).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 38).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 1217).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 257).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 17).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 30).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 8).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 51).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 4).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 1089).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 100).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 12).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 1898).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 1).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 23).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 45).checkEq(bytes[offset + 1], 0);
        new Here("Randoop", 139).given(i, 15).checkEq(bytes[offset + 1], 0);
        new Here("Unit", 139).given(i, 14).checkEq(bytes[offset + 1], 0);
        bytes[offset + 0] = (byte) ((i >> 21) & 0x7f);
        new Here("Randoop", 140).given(i, 125).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 17).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 100).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 3).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 137).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 192).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 45).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 5).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 232801795).checkEq(bytes[offset + 0], 111);
        new Here("Randoop", 140).given(i, 51).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 126).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 20).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 2340).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 76).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 15).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 6).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 4).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 16).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 19).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 10).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 19).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 7).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 156).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 22).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 16).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 11).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 53).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 120).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 111).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 13).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 71).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 12).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 12345).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 1898).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 9).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 257).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 12).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 38).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 2586).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 1227).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 0).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 67).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 52).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 2).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 48).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 10).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 23).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 1002).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 1).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 2330).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 14).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 15).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 16843009).checkEq(bytes[offset + 0], 8);
        new Here("Randoop", 140).given(i, 99).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 118).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 30).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 1217).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 1089).checkEq(bytes[offset + 0], 0);
        new Here("Unit", 140).given(i, 8).checkEq(bytes[offset + 0], 0);
        new Here("Randoop", 140).given(i, 127).checkEq(bytes[offset + 0], 0);
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
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 29).checkTrue(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 18, 2, 16, 16 }).given(i, 0).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5 }).given(i, 0).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 6).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 6).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, -1, -5, 0 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 20).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 12).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 1 }).given(i, 0).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 13).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 10).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 0).checkTrue(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 6).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 11).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 5).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 18, 2, 16, 16 }).given(i, 2).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 10 }).given(i, 1).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 28).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 14).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 13).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 8).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 22).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 10).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 4).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 26).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 7).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 8).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 3).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 19).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 16).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 30).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, -1, -5, 0 }).given(i, 1).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 10).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 23).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 1, -5 }).given(i, 0).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 3).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 1).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 24).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 11).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 9).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 1, -5 }).given(i, 1).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 32).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 20).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 4).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 5).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 33).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 14).checkTrue(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 13).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 12).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, -1 }).given(i, 0).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 21).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 5).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 4).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 13).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 12).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 31).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 22).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 1).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 6).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 4).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 5).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 18, 2, 16, 16 }).given(i, 1).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 10).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 19).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 11).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 10 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 21).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 3).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 7).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 7).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 13).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 1 }).given(i, 1).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 3).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 7).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 9).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 8).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 12).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 10 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 25).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 11).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 15).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 23).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 9).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 14).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 17).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 0).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 0, -1, -5 }).given(i, 0).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 15).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 9).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 0 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 24).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 16).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 17).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 100, 7, 100 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 26).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 18).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 16).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 18).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 10).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 25).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 5).checkTrue(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 100, 7, 100 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 27).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 12).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 17).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 4).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 0 }).given(i, 0).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 3).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 6).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 14).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 1 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 8).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 120, 84, 73, 84, 49, 0, 0, 0, 10, 0, 0, 0, 68, 117, 97, 108, 32, 109, 111, 110, 111, 84, 80, 79, 83, 0, 0, 0, 5, 0, 0, 0, 84, 80, 85, 66, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 19).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 0, 0, 0, 0 }).given(i, 1).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 14).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, -1, -5, 0 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 9).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 11).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 8).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 2).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 7).checkFalse(group());
                new Here("Unit", 160).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 0).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 27).checkTrue(group());
                new Here("Unit", 160).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 18).checkFalse(group());
                new Here("Randoop", 160).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 19, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77 }).given(i, 15).checkFalse(group());
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
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 18).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 15).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 13).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 2).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 33).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 26).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 9).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 16).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 4).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 14).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 4).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 3).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 24).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 19).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 12).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 32).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 0).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 14).checkTrue(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 3).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 29).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 0).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 4).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 10).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 6).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -1, -1, -1 }).given(i, 1).checkTrue(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 18).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 5).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 7).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -1, -1, -1 }).given(i, 2).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 30).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 5).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 7).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 11).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 17).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 25).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 6).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 4).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 10).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 21).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 13).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 9).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 5).checkTrue(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 10).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 5).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -1, -1, -1 }).given(i, 0).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 1).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 20).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 14).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 6).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 0).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 9).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 3).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 8).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 11).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 12).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 31).checkTrue(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 11).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 7).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 15).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 6).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 11).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 2).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 19).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 8).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 28).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 9).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 3).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 13).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 23).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 27).checkTrue(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 7).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 1).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 16).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 12).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 8).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 12).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 10).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 2).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 22).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 17).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 1).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, -5, -1, -5, -1, 0, 4, 5 }).given(i, 0).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 8).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 2).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, -5, 2, 3, 4, -1, -32, 7, 8, 9, 10, 11, 12, 13, -1, -16 }).given(i, 13).checkFalse(group());
                new Here("Randoop", 178).given(bytes, new byte[] { 87, 79, 65, 83, 0, -1, -1, -1, -1, 0, 0, 0, 97, 0, 0, 0, 7, 0, 0, 0, 10 }).given(i, 1).checkFalse(group());
                new Here("Unit", 178).given(bytes, new byte[] { -1, 0, 2, 3, 4, -1, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0 }).given(i, 14).checkTrue(group());
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
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 10).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 2).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 24).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 16).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 22).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 3).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 32).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, -1, 0, -5, 0 }).given(i, 2).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 7).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, -1, 0, -5, 0 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 1, -5 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 10 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 7).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 14).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 30).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 4).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 39).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 26).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 5).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 3).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 20).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 8).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 3).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 14).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 10).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 3).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, -1, 0, -5, 0 }).given(i, 1).checkTrue(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 4).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 5).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 2).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 16).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 2).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 16).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 5).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 32).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 12).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 0).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 0, -1, 0, -5 }).given(i, 4).checkTrue(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 37).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 28).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 13).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 6).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 29).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 2).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 3).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 14).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 19).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 27).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 10).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 4).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 18).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 18).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 10, 0 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 9).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 0, -1, 0, -5 }).given(i, 1).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 11).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 17).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 27).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 19).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 5).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 16).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 8).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 29).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 10, 0 }).given(i, 1).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 12).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 0, -1, 0, -5 }).given(i, 2).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 15).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 23).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 3).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 0, -1, 0, -5 }).given(i, 3).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 10, 0 }).given(i, 2).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 23).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 7).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 15).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 5).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 2).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 31).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 21).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 9).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 13).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 6).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 18, 2, 16, 16 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5 }).given(i, 0).checkTrue(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 10 }).given(i, 1).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 0).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 17).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 2).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 38).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 9).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0 }).given(i, 2).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 15).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 25).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0, -1, 0 }).given(i, 0).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 4).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 10).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 13).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 1 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 4).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 31).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 28).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 3).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 6).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 4).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 1 }).given(i, 1).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 10).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 5).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 35).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 11).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 8).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 1).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 11).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 30).checkTrue(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 100, 7, 100 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 100, 7, -1 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 6).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 0 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 36).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 7).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 10).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 11).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 35).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 34).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 10).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 6).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 4).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 33).checkTrue(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 9).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 13).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 26).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 12).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 0, -1, 0, -5 }).given(i, 0).checkTrue(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 2).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0 }).given(i, 0).checkTrue(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 9).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 0, 0, 0, 0 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 5).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 8).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 34).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0 }).given(i, 3).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 7).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 6).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 14).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 21).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 25).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 22).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 13).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 12).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, -1, 0 }).given(i, 0).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 18, 2, 16, 16 }).given(i, 1).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 8).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0, -1, 0 }).given(i, 1).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 9).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 80, 50, 0, 0, 0, 0, 3, 0, 0, 100, 7, 100 }).given(i, 7).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 15).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 8).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 6).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 9).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 24).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 20).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 8).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 11).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 73, 68, 51, 3, 0, 0, 0, 0, 0, 127, 84, 80, 85, 66, 0, 0, 0, 4, 0, 0, 0, 80, 73, 67, 84, 89, 69, 82, 0, 0, 0, 5, 0, 0, 0, 87, 88, 88, 88, 85, 83, 76, 84, 0, 0, 0, 9, 0, 0, 0, 101, 110, 103, 0, 84, 67, 79, 77, 87, 79, 65, 82, 0, 0, 0, 4, 0, 0, 67, 79, 77, 77, 87, 80, 65, 89, 0, 0, 0, 3, 0, 0, 84, 67, 82, 87, 80, 85, 66, 0, 0, 0, 42, 0, 0, 91, 99, 111, 109, 46, 109, 112, 97, 116, 114, 105, 99, 46, 109, 112, 51, 97, 103, 105, 99, 46, 73, 110, 118, 97, 108, 105, 100, 68, 97, 116, 97, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }).given(i, 33).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 0).checkFalse(group());
                new Here("Unit", 192).given(bytes, new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }).given(i, 12).checkFalse(group());
                new Here("Randoop", 192).given(bytes, new byte[] { 84, 84, 50, 0, 0, 0, 0, 3, 0, 0, 11, 9, 9 }).given(i, 7).checkFalse(group());
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
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 3).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 4).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0, -1, 0 }).given(i, 4).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 2).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 26).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 18).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 32).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 4).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 2).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 10).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 5).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 19).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 4).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 3).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 0).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 5).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 16).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 35).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 15).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 10).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 5).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 15).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 10).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 30).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 16).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 6).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 6).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 16).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 21).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 17).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 7).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 29).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 6).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 13).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 8).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 14).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 20).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 13).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 13).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 27).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 8).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 14).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 15).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 9).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 22).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 8).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 0).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0, -1, 0 }).given(i, 2).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 14).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 0).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 1).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 9).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 23).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 11).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 36).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 11).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 9).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 2).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 11).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 24).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 33).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 12).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -1, 0, -1, 0, -1, 0 }).given(i, 0).checkTrue(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, 0, 2, 3, 4, -1, 0, 0, 7, 8, 9, 10, 11, 12, 13, -1, 0, 0 }).given(i, 12).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { -1, 0, -5, 2, 3, 4, -1, 0, -32, 7, 8, 9, 10, 11, 12, 13, -1, 0, -16 }).given(i, 12).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 3).checkFalse(group());
                new Here("Unit", 210).given(bytes, new byte[] { 0, 109, 105, 109, 101, 47, 116, 121, 112, 101, 0, 3, 68, 69, 83, 67, 82, 73, 80, 84, 73, 79, 78, 0, 1, 2, 3, -1, 0, -5, -1, 0, -5, -1, 0, 0, 4, 5 }).given(i, 25).checkFalse(group());
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
