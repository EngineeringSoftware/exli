package biz.paluch.logging.gelf.intern;

import java.util.regex.Pattern;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Data type discovery for {@link String} value types. Discovers an indicator whether a type is a {@link Result#LONG}, a
 * {@link Result#DOUBLE} or {@link Result#STRING} type.
 *
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @author Wolfgang Jung
 */
class ValueDiscovery {

    private static final Pattern longPattern = Pattern.compile("^(0x[0-9a-fA-F]+)|[+\\-]?0|[+\\-]?[1-9][0-9]{0,18}$");

    private static final Pattern doublePattern = Pattern.compile("^[+\\-]?(([0-9]*\\.[0-9]+([eE][+-]?[0-9]+)?)|([1-9][0-9]{0,18}([eE][+-]?[0-9]+)?)|(0x[0-9a-fA-F]+\\.[0-9a-fA-F]+[pP][+\\-]?[0-9]+))$");

    static Result discover(String value) {
        long len = value.length();
        if (len == 0 || len > 32) {
            return Result.STRING;
        }
        char firstChar = value.charAt(0);
        if (firstChar < '0' || firstChar > '9') {
            // Possible leading "+" or "-"
            if (firstChar == 'N' && len == 3 && value.equals("NaN")) {
                return Result.DOUBLE;
            } else if (firstChar == 'I' && len == 8 && value.equals("Infinity")) {
                return Result.DOUBLE;
            } else if (firstChar == '+' && len == 9 && value.equals("+Infinity")) {
                return Result.DOUBLE;
            } else if (firstChar == '-' && len == 9 && value.equals("-Infinity")) {
                return Result.DOUBLE;
            }
            if (firstChar != '-' && firstChar != '+') {
                return Result.STRING;
            }
        }
        boolean numbersOnly = true;
        for (int pos = 0; pos < Math.min(len, 20); pos++) {
            char c = value.charAt(pos);
            numbersOnly &= (c >= '0' && c <= '9');
            new Here("Unit", 46).given(c, 'p').given(numbersOnly, true).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'N').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '0').given(numbersOnly, true).checkEq(numbersOnly, true);
            if (numbersOnly) {
                continue;
            }
            if ((c != '+') && (c != '-') && (c < '0' || c > '9') && (c < 'a' || c > 'f') && (c < 'A' || c > 'F') && (c != '.') && (c != 'x' && c != 'X') && (c != 'p' && c != 'P')) {
                return Result.STRING;
            }
        }
        if (numbersOnly) {
            if (len == 1) {
                return Result.LONG;
            } else if (len <= 19 && firstChar != '0') {
                return Result.LONG;
            } else {
                return Result.STRING;
            }
        } else if (longPattern.matcher(value).matches()) {
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "0xdeadbeef").checkTrue(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "0p").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "2e5").checkFalse(group());
            return Result.LONG;
        } else if (doublePattern.matcher(value).matches()) {
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "0p").checkFalse(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "2e5").checkTrue(group());
            return Result.DOUBLE;
        }
        return Result.STRING;
    }

    enum Result {

        STRING, LONG, DOUBLE
    }
}
