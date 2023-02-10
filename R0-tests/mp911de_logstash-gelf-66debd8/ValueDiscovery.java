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
            new Here("Unit", 46).given(c, '8').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, '3').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '7').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, '.').given(numbersOnly, true).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'p').given(numbersOnly, true).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '-').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '0').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'd').given(numbersOnly, true).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'N').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '9').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, '5').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, 'd').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'a').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '7').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '6').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, 'P').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '3').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, 'f').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '2').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '4').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, '+').given(numbersOnly, true).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '2').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, '5').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'e').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '8').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '1').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, '0').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, '4').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'p').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '-').given(numbersOnly, true).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'x').given(numbersOnly, true).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '+').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '1').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '.').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Randoop", 46).given(c, '1').given(numbersOnly, true).checkEq(numbersOnly, true);
            new Here("Unit", 46).given(c, ' ').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '9').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, '6').given(numbersOnly, false).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'e').given(numbersOnly, true).checkEq(numbersOnly, false);
            new Here("Unit", 46).given(c, 'b').given(numbersOnly, false).checkEq(numbersOnly, false);
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
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "19.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "27.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "15.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "39.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "17.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "0x").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "29.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "81.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "11.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "9.156013e-002").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "80.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "47.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "0x1.fffffffffffffP+1023").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "59.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "93.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "0x0.0000000000001P-1022").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "38.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "34.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "22.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "92.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "+0").checkTrue(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "35.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "10.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "23.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "72.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "14.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "60.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "26.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "79.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "1.2.3").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "67.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "18.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "55.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "43.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "31.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "84.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "96.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "77.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "40.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "65.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "52.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "78.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "41.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "53.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "66.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "75.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "50.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "87.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "62.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "88.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "51.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "64.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "63.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "89.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "-0").checkTrue(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "76.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "85.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "44.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "97.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "32.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "61.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "20.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "0deadbeef").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "73.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "46.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "42.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "83.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "71.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "54.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "58.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "95.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "68.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "30.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "56.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "48.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "24.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "12.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "2e5.1").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "94.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "13.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "2e5").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "91.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "25.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "0p").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "37.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "90.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "49.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "36.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "28.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "98.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "57.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "45.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "74.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "21.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "86.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "33.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "82.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "70.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "69.0").checkFalse(group());
            new Here("Unit", 70).given(longPattern, "3.xml").given(value, "16.0").checkFalse(group());
            return Result.LONG;
        } else if (doublePattern.matcher(value).matches()) {
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "13.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "69.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "18.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "59.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "84.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "74.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "33.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "89.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "94.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "79.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "23.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "29.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "53.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "24.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "49.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "12.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "73.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "64.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "58.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "38.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "44.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "32.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "88.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "0p").checkFalse(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "0x").checkFalse(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "65.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "55.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "78.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "90.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "47.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "14.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "0x0.0000000000001P-1022").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "37.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "42.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "48.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "72.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "1.2.3").checkFalse(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "95.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "1.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "43.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "0xp").checkFalse(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "20.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "31.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "77.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "19.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "60.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "25.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "83.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "54.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "0deadbeef").checkFalse(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "46.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "36.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "97.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "61.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "41.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "0x1.fffffffffffffP+1023").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "26.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "51.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "71.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "2e5.1").checkFalse(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "66.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "10.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "81.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "56.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "91.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "67.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "30.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "15.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "9.156013e-002").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "76.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "82.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "87.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "2e5").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "35.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "96.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "0.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "50.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "21.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "70.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "27.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "93.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "22.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "45.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "80.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "85.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "62.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "98.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "17.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "75.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "52.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "86.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "34.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "63.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "11.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "39.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "57.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "16.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "28.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "68.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "92.0").checkTrue(group());
            new Here("Unit", 72).given(doublePattern, "4.xml").given(value, "40.0").checkTrue(group());
            return Result.DOUBLE;
        }
        return Result.STRING;
    }

    enum Result {

        STRING, LONG, DOUBLE
    }
}
