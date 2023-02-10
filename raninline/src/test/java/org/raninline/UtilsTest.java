package org.raninline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class UtilsTest {
    @Test
    public void testParseLineNumber() {
        assertEquals(1, Utils.parseLineNumber("1"));
        assertEquals(-1, Utils.parseLineNumber("a"));
        assertEquals(-1, Utils.parseLineNumber(null));
        assertEquals(0, Utils.parseLineNumber("0"));
    }
}
