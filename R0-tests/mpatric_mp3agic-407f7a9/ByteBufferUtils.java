package com.mpatric.mp3agic;

import java.nio.ByteBuffer;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public final class ByteBufferUtils {

    private ByteBufferUtils() {
    }

    public static String extractNullTerminatedString(ByteBuffer bb) {
        int start = bb.position();
        byte[] buffer = new byte[bb.remaining()];
        bb.get(buffer);
        String s = new String(buffer);
        int nullPos = s.indexOf(0);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u0000C").checkEq(nullPos, 0);
        new Here("Randoop", 17).given(s, "\u0000").checkEq(nullPos, 0);
        new Here("Randoop", 17).given(s, "d\u0007d").checkEq(nullPos, -1);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u0000\n").checkEq(nullPos, 0);
        new Here("Randoop", 17).given(s, "d\u0002\u001B").checkEq(nullPos, -1);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u0000\n\u0000").checkEq(nullPos, 0);
        new Here("Unit", 17).given(s, "ch3\u0000").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "").checkEq(nullPos, -1);
        new Here("Unit", 17).given(s, "ch2\u0000TIT2\u0000\u0000\u0000\f\u0000\u0000\u0000Hello there").checkEq(nullPos, 3);
        new Here("Unit", 17).given(s, "toc1\u0000\u0003\u0002ch1\u0000ch2\u0000TIT2\u0000\u0000\u0000\f\u0000\u0000\u0000Hello there").checkEq(nullPos, 4);
        new Here("Randoop", 17).given(s, "\u0006\r\u000B\f\u000E").checkEq(nullPos, -1);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u0000\f\u0000").checkEq(nullPos, 0);
        new Here("Randoop", 17).given(s, "ID3\u0003\u0000\u0000\u0000\u0000\u0000pTCMP\u0000\u0000\u0000\u0002\u0000\u0000\u00001TPOS\u0000\u0000\u0000\u0005\u0000\u0000\u0000TPUBTPUB\u0000\u0000\u0000\u0004\u0000\u0000\u0000PICUSLT\u0000\u0000\u0000\t\u0000\u0000\u0000eng\u0000TCOMWPUB\u0000\u0000\u0000*\u0000\u0000[com.mpatric.mp3agic.InvalidDataException]").checkEq(nullPos, 4);
        new Here("Randoop", 17).given(s, "ID3\u0003\u0000\u0000\u0000\u0000\u0000xTIT1\u0000\u0000\u0000\n\u0000\u0000\u0000Dual monoTPOS\u0000\u0000\u0000\u0005\u0000\u0000\u0000TPUBTPUB\u0000\u0000\u0000\u0004\u0000\u0000\u0000PICUSLT\u0000\u0000\u0000\t\u0000\u0000\u0000eng\u0000TCOMWPUB\u0000\u0000\u0000*\u0000\u0000[com.mpatric.mp3agic.InvalidDataException]").checkEq(nullPos, 4);
        new Here("Randoop", 17).given(s, "\u0012\u0002\u0010\u0010").checkEq(nullPos, -1);
        new Here("Unit", 17).given(s, "ch2\u0000\u0000\u0000\u0013\uFFFD\u0000\u0000'\u0010\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFDTIT2\u0000\u0000\u0000\n\u0000\u0000\u00005 seconds").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "TAGTCOM\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000COMM\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD").checkEq(nullPos, 7);
        new Here("Randoop", 17).given(s, "TAG\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000UTF-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 ").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "ID3\u0003\u0000\u0000\u0000\u0000\u0000dTPOS\u0000\u0000\u0000\u0005\u0000\u0000\u0000TPUBTPUB\u0000\u0000\u0000\u0004\u0000\u0000\u0000PICUSLT\u0000\u0000\u0000\t\u0000\u0000\u0000eng\u0000TCOMWPUB\u0000\u0000\u0000*\u0000\u0000[com.mpatric.mp3agic.InvalidDataException]").checkEq(nullPos, 4);
        new Here("Unit", 17).given(s, "toc1\u0000\u0003\u0003ch1\u0000ch2\u0000ch3\u0000").checkEq(nullPos, 4);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u00004").checkEq(nullPos, 0);
        new Here("Randoop", 17).given(s, "TP2\u0003\u0000\u0000\u0000\u0003\u0000\u0000TPUB\u0000\u0000\u0000\u0004\u0000\u0000\u0000PICTYER\u0000d\u0007d\u0000\u0000\u0000WXXXUSLT\u0000\u0000\u0000\t\u0000\u0000\u0000eng\u0000TCOMWOAR\u0000\u0000\u0000\u0004\u0000\u0000COMMWPAY\u0000\u0000\u0000\u0003\u0000\u0000TCRWPUB\u0000\u0000\u0000*\u0000\u0000[com.mpatric.mp3agic.InvalidDataException]").checkEq(nullPos, 4);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u0000\u0000").checkEq(nullPos, 0);
        new Here("Unit", 17).given(s, "ch1\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001|\u0000\u0000\u0000\u0003\u0000\u0000\u0001\uFFFDTIT2\u0000\u0000\u0000\f\u0000\u0000\u0000Hello there").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "d\u0007d\u0000").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "TP2\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0001").checkEq(nullPos, 3);
        new Here("Unit", 17).given(s, "ch1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0013\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFDTIT2\u0000\u0000\u0000\u0006\u0000\u0000\u0000start").checkEq(nullPos, 3);
        new Here("Unit", 17).given(s, "ch1\u0000ch2\u0000TIT2\u0000\u0000\u0000\f\u0000\u0000\u0000Hello there").checkEq(nullPos, 3);
        new Here("Unit", 17).given(s, "ch3\u0000\u0000\u0000'\u0010\u0000\u0000:\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFDTIT2\u0000\u0000\u0000\u000B\u0000\u0000\u000010 seconds").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "o\u0001\f\u0003").checkEq(nullPos, -1);
        new Here("Randoop", 17).given(s, "TT2\u0000\u0000\u0000\u0000\u0003\u0000\u0000\u000B\t\t").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "ID3\u0003\u0000\u0000\u0000\u0000\u0000\rWOAR\u0000\u0000\u0000\u0003\u0000\u0000TRK").checkEq(nullPos, 4);
        new Here("Randoop", 17).given(s, "ID3\u0004\u0000\u0000\u0000\u0000\u0000\u0000").checkEq(nullPos, 4);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u0000\u0001").checkEq(nullPos, 0);
        new Here("Unit", 17).given(s, "ch1\u0000ch2\u0000ch3\u0000").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "\u0001\uFFFDC\u0006").checkEq(nullPos, -1);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u0000\u000F").checkEq(nullPos, 0);
        new Here("Randoop", 17).given(s, "ID3\u0003\u0000\u0000\u0000\u0000\u0000cTPUB\u0000\u0000\u0000\u0004\u0000\u0000\u0000PICUSLT\u0000\u0000\u0000\t\u0000\u0000\u0000eng\u0000TCOMWOAR\u0000\u0000\u0000\u0004\u0000\u0000TKEYWPUB\u0000\u0000\u0000*\u0000\u0000[com.mpatric.mp3agic.InvalidDataException]").checkEq(nullPos, 4);
        new Here("Unit", 17).given(s, "ch2\u0000ch3\u0000").checkEq(nullPos, 3);
        new Here("Randoop", 17).given(s, "ID3\u0004\u0000\u0000\u0000\u0000\u0000\rTBPM\u0000\u0000\u0000\u0003\u0000\u0000\u000012").checkEq(nullPos, 4);
        new Here("Randoop", 17).given(s, "\u0000\u0000\u0000d").checkEq(nullPos, 0);
        s = s.substring(0, nullPos);
        bb.position(start + s.length() + 1);
        return s;
    }
}
