package instrument;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class MyString {
    String str;

    MyString(String str) {
        this.str = str;
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return new MyMatcher(Pattern.compile(target.toString(), Pattern.LITERAL).matcher(this.str))
                .replaceAll(Matcher.quoteReplacement(replacement.toString()));
    }

    public String replace(char oldChar, char newChar) {
        if (oldChar != newChar) {
            try {
                Field valueField = String.class.getDeclaredField("value");
                valueField.setAccessible(true);
                char[] value = (char[]) valueField.get(str);
                int len = value.length;
                int i = -1;
                char[] val = value; /* avoid getfield opcode */

                while (++i < len) {
                    if (val[i] == oldChar) {
                        break;
                    }
                }
                if (i < len) {
                    char buf[] = new char[len];
                    for (int j = 0; j < i; j++) {
                        buf[j] = val[j];
                    }
                    while (i < len) {
                        char c = val[i];
                        buf[i] = (c == oldChar) ? newChar : c;
                        i++;
                    }
                    Constructor constructor = String.class.getDeclaredConstructor(char[].class, boolean.class);
                    constructor.setAccessible(true);
                    return (String) constructor.newInstance(buf, true);
                    // return new String(buf, true);
                }
            }catch (Exception e) {
                return null;
            }
        }
        return str;
    }
}

