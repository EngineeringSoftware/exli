package instrument;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;


public class MyMatcher{
    Matcher matcherClazz;

    public MyMatcher(Matcher matcher) {
        this.matcherClazz = matcher;
    }

    public Matcher getMatcherClazz() {
        return matcherClazz;
    }

    public String replaceAll(String replacement) {
        matcherClazz.reset();
        boolean result = matcherClazz.find();
        if (result) {
            StringBuffer sb = new StringBuffer();
            do {
                matcherClazz.appendReplacement(sb, replacement);
                result = matcherClazz.find();
            } while (result);
            matcherClazz.appendTail(sb);
            return sb.toString();
        }
        try {
            Field textField = Matcher.class.getDeclaredField("text");
            textField.setAccessible(true);
            return textField.get(matcherClazz).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}