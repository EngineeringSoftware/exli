package com.mpatric.mp3agic;

import java.nio.ByteBuffer;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public final class ByteBufferUtils {

    private ByteBufferUtils() {
    }

    public static String extractNullTerminatedString(ByteBuffer bb) {
        int start = bb.position();
        byte[] buffer = new byte[bb.remaining()];
        bb.get(buffer);
        String s = new String(buffer);
        int nullPos = s.indexOf(0);
        itest("dev", 17).given(s, "ch1\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001|\u0000\u0000\u0000\u0003\u0000\u0000\u0001\uFFFDTIT2\u0000\u0000\u0000\f\u0000\u0000\u0000Hello there").checkEq(nullPos, 3);
        s = s.substring(0, nullPos);
        itest("dev", 19).given(s, "ch1\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001|\u0000\u0000\u0000\u0003\u0000\u0000\u0001\uFFFDTIT2\u0000\u0000\u0000\f\u0000\u0000\u0000Hello there").given(nullPos, 3).checkEq(s, "ch1");
        bb.position(start + s.length() + 1);
        return s;
    }
}
