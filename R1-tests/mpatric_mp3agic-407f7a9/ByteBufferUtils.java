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
        new Here("Unit", 17).given(s, "ch1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0013\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFDTIT2\u0000\u0000\u0000\u0006\u0000\u0000\u0000start").checkEq(nullPos, 3);
        s = s.substring(0, nullPos);
        bb.position(start + s.length() + 1);
        return s;
    }
}
