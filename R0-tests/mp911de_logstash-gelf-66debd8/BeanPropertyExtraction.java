package biz.paluch.logging.gelf.standalone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * @author Mark Paluch
 * @since 31.07.14 08:56
 */
class BeanPropertyExtraction {

    public static final String IS_REGEX = "is([^ ]+)";

    public static final String GET_REGEX = "get([^ ]+)";

    public static final Pattern IS_PATTERN = Pattern.compile(IS_REGEX);

    public static final Pattern GET_PATTERN = Pattern.compile(GET_REGEX);

    private BeanPropertyExtraction() {
        // no instance allowed
    }

    static Map<String, Object> extractProperties(Object object) {
        Map<String, Method> methodMap = createPropertyToMethodMap(object);
        return retrieveValues(object, methodMap);
    }

    private static Map<String, Method> createPropertyToMethodMap(Object object) {
        Class<?> beanClass = object.getClass();
        Map<String, Method> methodMap = new HashMap<>();
        Method[] methods = beanClass.getMethods();
        for (Method method : methods) {
            if (method.getParameterTypes().length != 0) {
                continue;
            }
            if (method.getReturnType().equals(Void.class) || method.getReturnType().equals(Void.TYPE)) {
                continue;
            }
            if (method.getDeclaringClass().equals(Object.class)) {
                continue;
            }
            String name = method.getName();
            String propertyName = getPropertyName(name, GET_PATTERN);
            if (propertyName == null) {
                propertyName = getPropertyName(name, IS_PATTERN);
            }
            if (propertyName == null) {
                continue;
            }
            propertyName = decapitalizePropertyName(propertyName);
            methodMap.put(propertyName, method);
        }
        return methodMap;
    }

    private static String decapitalizePropertyName(String propertyName) {
        String first = propertyName.substring(0, 1);
        String last = propertyName.substring(1);
        return first.toLowerCase() + last;
    }

    private static Map<String, Object> retrieveValues(Object object, Map<String, Method> methodMap) {
        Map<String, Object> fields = new HashMap<>();
        for (Map.Entry<String, Method> entry : methodMap.entrySet()) {
            try {
                Object value = entry.getValue().invoke(object);
                if (value != null) {
                    fields.put(entry.getKey(), value);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                // ignore
            }
        }
        return fields;
    }

    private static String getPropertyName(String name, Pattern pattern) {
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            new Here("Randoop", 97).given(matcher, "93.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "88.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "49.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "38.xml").checkFalse(group());
            new Here("Unit", 97).given(matcher, "26.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "107.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "82.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "71.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "94.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "44.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "66.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "108.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "55.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "90.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "77.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "99.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "35.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "102.xml").checkTrue(group());
            new Here("Unit", 97).given(matcher, "27.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "43.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "40.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "36.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "58.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "65.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "62.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "87.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "60.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "57.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "56.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "80.xml").checkTrue(group());
            new Here("Unit", 97).given(matcher, "28.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "91.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "63.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "92.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "41.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "89.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "78.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "79.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "70.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "104.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "97.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "84.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "64.xml").checkFalse(group());
            new Here("Unit", 97).given(matcher, "29.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "53.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "45.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "42.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "33.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "34.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "103.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "67.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "105.xml").checkTrue(group());
            new Here("Unit", 97).given(matcher, "23.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "48.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "37.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "32.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "50.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "83.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "61.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "72.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "59.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "86.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "75.xml").checkTrue(group());
            new Here("Unit", 97).given(matcher, "24.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "73.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "95.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "47.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "54.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "69.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "31.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "76.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "51.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "101.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "98.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "96.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "85.xml").checkTrue(group());
            new Here("Unit", 97).given(matcher, "25.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "74.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "46.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "39.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "52.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "106.xml").checkTrue(group());
            new Here("Randoop", 97).given(matcher, "100.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "30.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "81.xml").checkFalse(group());
            new Here("Randoop", 97).given(matcher, "68.xml").checkFalse(group());
            return matcher.toMatchResult().group(1);
        }
        return null;
    }
}
