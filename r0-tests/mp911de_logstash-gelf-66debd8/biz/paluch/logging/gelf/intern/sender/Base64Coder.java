// Copyright 2003-2010 Christian d'Heureuse, Inventec Informatik AG, Zurich, Switzerland
// www.source-code.biz, www.inventec.ch/chdh
// 
// This module is multi-licensed and may be used under the terms
// of any of the following licenses:
// 
// EPL, Eclipse Public License, V1.0 or later, http://www.eclipse.org/legal
// LGPL, GNU Lesser General Public License, V2.1 or later, http://www.gnu.org/licenses/lgpl.html
// GPL, GNU General Public License, V2 or later, http://www.gnu.org/licenses/gpl.html
// AGPL, GNU Affero General Public License V3 or later, http://www.gnu.org/licenses/agpl.html
// AL, Apache License, V2.0 or later, http://www.apache.org/licenses
// BSD, BSD License, http://www.opensource.org/licenses/bsd-license.php
// MIT, MIT License, http://www.opensource.org/licenses/MIT
// 
// Please contact the author if you need another license.
// This module is provided "as is", without warranties of any kind.
// 
// Project home page: www.source-code.biz/base64coder/java
package biz.paluch.logging.gelf.intern.sender;

import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * A Base64 encoder/decoder.
 *
 * <p>
 * This class is used to encode and decode data in Base64 format as described in RFC 1521.
 *
 * @author Christian d'Heureuse, Inventec Informatik AG, Zurich, Switzerland, www.source-code.biz
 */
class Base64Coder {

    // Mapping table from 6-bit nibbles to Base64 characters.
    private static final char[] map1 = new char[64];

    static {
        int i = 0;
        for (char c = 'A'; c <= 'Z'; c++) map1[i++] = c;
        for (char c = 'a'; c <= 'z'; c++) map1[i++] = c;
        for (char c = '0'; c <= '9'; c++) map1[i++] = c;
        map1[i++] = '+';
        map1[i++] = '/';
    }

    /**
     * Encodes a string into Base64 format. No blanks or line breaks are inserted.
     *
     * @param s A String to be encoded.
     * @return A String containing the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }

    /**
     * Encodes a byte array into Base64 format. No blanks or line breaks are inserted in the output.
     *
     * @param in An array containing the data bytes to be encoded.
     * @return A character array containing the Base64 encoded data.
     */
    public static char[] encode(byte[] in) {
        return encode(in, 0, in.length);
    }

    /**
     * Encodes a byte array into Base64 format. No blanks or line breaks are inserted in the output.
     *
     * @param in An array containing the data bytes to be encoded.
     * @param iOff Offset of the first byte in <code>in</code> to be processed.
     * @param iLen Number of bytes to process in <code>in</code>, starting at <code>iOff</code>.
     * @return A character array containing the Base64 encoded data.
     */
    public static char[] encode(byte[] in, int iOff, int iLen) {
        // output length without padding
        int oDataLen = (iLen * 4 + 2) / 3;
        // output length including padding
        int oLen = ((iLen + 2) / 3) * 4;
        char[] out = new char[oLen];
        int ip = iOff;
        int iEnd = iOff + iLen;
        int op = 0;
        while (ip < iEnd) {
            int i0 = in[ip++] & 0xff;
            itest("evosuite", 81).given(in, new byte[] { 122, 90, 0, -128, 57, -127 }).given(ip, 0).checkEq(i0, 122);
            itest("evosuite", 81).given(in, new byte[] { 97, 109 }).given(ip, 0).checkEq(i0, 97);
            itest("evosuite", 81).given(in, new byte[] { 0, 0, 0, 0 }).given(ip, 3).checkEq(i0, 0);
            itest("evosuite", 81).given(in, new byte[] { 119, 0, -16, 0 }).given(ip, 3).checkEq(i0, 0);
            itest("evosuite", 81).given(in, new byte[] { -12, 1, 0, 0, 124, 48, 0 }).given(ip, 3).checkEq(i0, 0);
            itest("evosuite", 81).given(in, new byte[] { 122, 90, 0, -128, 57, -127 }).given(ip, 3).checkEq(i0, 128);
            itest("evosuite", 81).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 0).checkEq(i0, 0);
            itest("evosuite", 81).given(in, new byte[] { -12, 1, 0, 0, 124, 48, 0 }).given(ip, 0).checkEq(i0, 244);
            itest("evosuite", 81).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 6).checkEq(i0, 0);
            itest("evosuite", 81).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 0).checkEq(i0, 126);
            itest("evosuite", 81).given(in, new byte[] { 0, 0, 0, 0 }).given(ip, 0).checkEq(i0, 0);
            itest("evosuite", 81).given(in, new byte[] { -12, 1, 0, 0, 124, 48, 0 }).given(ip, 6).checkEq(i0, 0);
            itest("evosuite", 81).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 6).checkEq(i0, 154);
            itest("evosuite", 81).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 6).checkEq(i0, 40);
            itest("evosuite", 81).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 3).checkEq(i0, 0);
            itest("evosuite", 81).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 3).checkEq(i0, 93);
            itest("evosuite", 81).given(in, new byte[] { 119, 0, -16, 0 }).given(ip, 0).checkEq(i0, 119);
            itest("evosuite", 81).given(in, new byte[] { 122, 65 }).given(ip, 0).checkEq(i0, 122);
            itest("evosuite", 81).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 3).checkEq(i0, 95);
            itest("evosuite", 81).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 0).checkEq(i0, 1);
            itest("evosuite", 81).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 9).checkEq(i0, 98);
            itest("evosuite", 81).given(in, new byte[] { -80, 1 }).given(ip, 0).checkEq(i0, 176);
            itest("evosuite", 81).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 1).checkEq(i0, 0);
            int i1 = ip < iEnd ? in[ip++] & 0xff : 0;
            itest("evosuite", 82).given(iEnd, 3750).given(in, new byte[] { -12, 1, 0, 0, 124, 48, 0 }).given(ip, 1).checkEq(i1, 1);
            itest("evosuite", 82).given(iEnd, 11).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 10).checkEq(i1, 44);
            itest("evosuite", 82).given(iEnd, 7).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 1).checkEq(i1, 59);
            itest("evosuite", 82).given(iEnd, 6).given(in, new byte[] { 122, 90, 0, -128, 57, -127 }).given(ip, 1).checkEq(i1, 90);
            itest("evosuite", 82).given(iEnd, 7).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 7).checkEq(i1, 0);
            itest("evosuite", 82).given(iEnd, 6).given(in, new byte[] { 122, 90, 0, -128, 57, -127 }).given(ip, 4).checkEq(i1, 57);
            itest("evosuite", 82).given(iEnd, 4).given(in, new byte[] { 119, 0, -16, 0 }).given(ip, 4).checkEq(i1, 0);
            itest("evosuite", 82).given(iEnd, 11).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 1).checkEq(i1, 78);
            itest("evosuite", 82).given(iEnd, 2).given(in, new byte[] { -80, 1 }).given(ip, 1).checkEq(i1, 1);
            itest("evosuite", 82).given(iEnd, 7).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 1).checkEq(i1, 0);
            itest("evosuite", 82).given(iEnd, 11).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 4).checkEq(i1, 75);
            itest("evosuite", 82).given(iEnd, 7).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 4).checkEq(i1, 0);
            itest("evosuite", 82).given(iEnd, 4).given(in, new byte[] { 0, 0, 0, 0 }).given(ip, 1).checkEq(i1, 0);
            itest("evosuite", 82).given(iEnd, 4).given(in, new byte[] { 119, 0, -16, 0 }).given(ip, 1).checkEq(i1, 0);
            itest("evosuite", 82).given(iEnd, 11).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 7).checkEq(i1, 99);
            itest("evosuite", 82).given(iEnd, 7).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 7).checkEq(i1, 0);
            itest("evosuite", 82).given(iEnd, 2).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 2).checkEq(i1, 0);
            itest("evosuite", 82).given(iEnd, 2).given(in, new byte[] { 97, 109 }).given(ip, 1).checkEq(i1, 109);
            itest("evosuite", 82).given(iEnd, 2).given(in, new byte[] { 122, 65 }).given(ip, 1).checkEq(i1, 65);
            itest("evosuite", 82).given(iEnd, 3750).given(in, new byte[] { -12, 1, 0, 0, 124, 48, 0 }).given(ip, 4).checkEq(i1, 124);
            itest("evosuite", 82).given(iEnd, 7).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 4).checkEq(i1, 91);
            itest("evosuite", 82).given(iEnd, 4).given(in, new byte[] { 0, 0, 0, 0 }).given(ip, 4).checkEq(i1, 0);
            int i2 = ip < iEnd ? in[ip++] & 0xff : 0;
            itest("evosuite", 83).given(iEnd, 4).given(in, new byte[] { 119, 0, -16, 0 }).given(ip, 2).checkEq(i2, 240);
            itest("evosuite", 83).given(iEnd, 2).given(in, new byte[] { -80, 1 }).given(ip, 2).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 7).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 7).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 7).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 7).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 4).given(in, new byte[] { 119, 0, -16, 0 }).given(ip, 4).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 6).given(in, new byte[] { 122, 90, 0, -128, 57, -127 }).given(ip, 2).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 7).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 2).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 11).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 11).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 2).given(in, new byte[] { 97, 109 }).given(ip, 2).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 2).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 2).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 11).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 2).checkEq(i2, 83);
            itest("evosuite", 83).given(iEnd, 6).given(in, new byte[] { 122, 90, 0, -128, 57, -127 }).given(ip, 5).checkEq(i2, 129);
            itest("evosuite", 83).given(iEnd, 7).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 5).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 11).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 8).checkEq(i2, 70);
            itest("evosuite", 83).given(iEnd, 4).given(in, new byte[] { 0, 0, 0, 0 }).given(ip, 4).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 4).given(in, new byte[] { 0, 0, 0, 0 }).given(ip, 2).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 7).given(in, new byte[] { 1, 0, 0, 0, 0, 0, 0 }).given(ip, 5).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 3750).given(in, new byte[] { -12, 1, 0, 0, 124, 48, 0 }).given(ip, 2).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 11).given(in, new byte[] { 126, 78, 83, 95, 75, 76, 40, 99, 70, 98, 44 }).given(ip, 5).checkEq(i2, 76);
            itest("evosuite", 83).given(iEnd, 7).given(in, new byte[] { 0, 59, -1, 93, 91, 0, -102 }).given(ip, 2).checkEq(i2, 255);
            itest("evosuite", 83).given(iEnd, 2).given(in, new byte[] { 122, 65 }).given(ip, 2).checkEq(i2, 0);
            itest("evosuite", 83).given(iEnd, 3750).given(in, new byte[] { -12, 1, 0, 0, 124, 48, 0 }).given(ip, 5).checkEq(i2, 48);
            int o0 = i0 >>> 2;
            itest("evosuite", 84).given(i0, 98).checkEq(o0, 24);
            itest("evosuite", 84).given(i0, 176).checkEq(o0, 44);
            itest("evosuite", 84).given(i0, 93).checkEq(o0, 23);
            itest("evosuite", 84).given(i0, 126).checkEq(o0, 31);
            itest("evosuite", 84).given(i0, 0).checkEq(o0, 0);
            itest("evosuite", 84).given(i0, 119).checkEq(o0, 29);
            itest("evosuite", 84).given(i0, 128).checkEq(o0, 32);
            itest("evosuite", 84).given(i0, 40).checkEq(o0, 10);
            itest("evosuite", 84).given(i0, 154).checkEq(o0, 38);
            itest("evosuite", 84).given(i0, 1).checkEq(o0, 0);
            itest("evosuite", 84).given(i0, 95).checkEq(o0, 23);
            itest("evosuite", 84).given(i0, 122).checkEq(o0, 30);
            itest("evosuite", 84).given(i0, 97).checkEq(o0, 24);
            itest("evosuite", 84).given(i0, 244).checkEq(o0, 61);
            int o1 = ((i0 & 3) << 4) | (i1 >>> 4);
            itest("evosuite", 85).given(i0, 176).given(i1, 1).checkEq(o1, 0);
            itest("evosuite", 85).given(i0, 128).given(i1, 57).checkEq(o1, 3);
            itest("evosuite", 85).given(i0, 0).given(i1, 0).checkEq(o1, 0);
            itest("evosuite", 85).given(i0, 244).given(i1, 1).checkEq(o1, 0);
            itest("evosuite", 85).given(i0, 0).given(i1, 124).checkEq(o1, 7);
            itest("evosuite", 85).given(i0, 98).given(i1, 44).checkEq(o1, 34);
            itest("evosuite", 85).given(i0, 97).given(i1, 109).checkEq(o1, 22);
            itest("evosuite", 85).given(i0, 95).given(i1, 75).checkEq(o1, 52);
            itest("evosuite", 85).given(i0, 40).given(i1, 99).checkEq(o1, 6);
            itest("evosuite", 85).given(i0, 93).given(i1, 91).checkEq(o1, 21);
            itest("evosuite", 85).given(i0, 1).given(i1, 0).checkEq(o1, 16);
            itest("evosuite", 85).given(i0, 122).given(i1, 90).checkEq(o1, 37);
            itest("evosuite", 85).given(i0, 154).given(i1, 0).checkEq(o1, 32);
            itest("evosuite", 85).given(i0, 119).given(i1, 0).checkEq(o1, 48);
            itest("evosuite", 85).given(i0, 126).given(i1, 78).checkEq(o1, 36);
            itest("evosuite", 85).given(i0, 0).given(i1, 59).checkEq(o1, 3);
            itest("evosuite", 85).given(i0, 122).given(i1, 65).checkEq(o1, 36);
            int o2 = ((i1 & 0xf) << 2) | (i2 >>> 6);
            itest("evosuite", 86).given(i1, 124).given(i2, 48).checkEq(o2, 48);
            itest("evosuite", 86).given(i1, 91).given(i2, 0).checkEq(o2, 44);
            itest("evosuite", 86).given(i1, 57).given(i2, 129).checkEq(o2, 38);
            itest("evosuite", 86).given(i1, 0).given(i2, 240).checkEq(o2, 3);
            itest("evosuite", 86).given(i1, 1).given(i2, 0).checkEq(o2, 4);
            itest("evosuite", 86).given(i1, 59).given(i2, 255).checkEq(o2, 47);
            itest("evosuite", 86).given(i1, 65).given(i2, 0).checkEq(o2, 4);
            itest("evosuite", 86).given(i1, 109).given(i2, 0).checkEq(o2, 52);
            itest("evosuite", 86).given(i1, 90).given(i2, 0).checkEq(o2, 40);
            itest("evosuite", 86).given(i1, 99).given(i2, 70).checkEq(o2, 13);
            itest("evosuite", 86).given(i1, 75).given(i2, 76).checkEq(o2, 45);
            itest("evosuite", 86).given(i1, 44).given(i2, 0).checkEq(o2, 48);
            itest("evosuite", 86).given(i1, 78).given(i2, 83).checkEq(o2, 57);
            itest("evosuite", 86).given(i1, 0).given(i2, 0).checkEq(o2, 0);
            int o3 = i2 & 0x3F;
            itest("evosuite", 87).given(i2, 83).checkEq(o3, 19);
            itest("evosuite", 87).given(i2, 255).checkEq(o3, 63);
            itest("evosuite", 87).given(i2, 0).checkEq(o3, 0);
            itest("evosuite", 87).given(i2, 76).checkEq(o3, 12);
            itest("evosuite", 87).given(i2, 240).checkEq(o3, 48);
            itest("evosuite", 87).given(i2, 70).checkEq(o3, 6);
            itest("evosuite", 87).given(i2, 48).checkEq(o3, 48);
            itest("evosuite", 87).given(i2, 129).checkEq(o3, 1);
            out[op++] = map1[o0];
            out[op++] = map1[o1];
            out[op] = op < oDataLen ? map1[o2] : '=';
            op++;
            out[op] = op < oDataLen ? map1[o3] : '=';
            op++;
        }
        return out;
    }

    // Utility constructor.
    private Base64Coder() {
    }
}
// end class Base64Coder
