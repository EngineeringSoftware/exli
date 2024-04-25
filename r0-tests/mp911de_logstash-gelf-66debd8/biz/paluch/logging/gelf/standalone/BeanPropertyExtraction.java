package biz.paluch.logging.gelf.standalone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

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
        itest("randoop", 69).given(propertyName, "Context").checkEq(first, "C");
        itest("randoop", 69).given(propertyName, "FilterStackTrace").checkEq(first, "F");
        itest("randoop", 69).given(propertyName, "Timestamp").checkEq(first, "T");
        itest("randoop", 69).given(propertyName, "ShortMessage").checkEq(first, "S");
        itest("randoop", 69).given(propertyName, "JavaTimestamp").checkEq(first, "J");
        itest("randoop", 69).given(propertyName, "Layout").checkEq(first, "L");
        itest("dev", 69).given(propertyName, "Amount").checkEq(first, "A");
        itest("randoop", 69).given(propertyName, "Starting").checkEq(first, "S");
        itest("dev", 69).given(propertyName, "Object").checkEq(first, "O");
        itest("randoop", 69).given(propertyName, "Formatter").checkEq(first, "F");
        itest("randoop", 69).given(propertyName, "MdcProfiling").checkEq(first, "M");
        itest("randoop", 69).given(propertyName, "Host").checkEq(first, "H");
        itest("randoop", 69).given(propertyName, "Filter").checkEq(first, "F");
        itest("randoop", 69).given(propertyName, "State").checkEq(first, "S");
        itest("randoop", 69).given(propertyName, "Handler").checkEq(first, "H");
        itest("randoop", 69).given(propertyName, "FullMessage").checkEq(first, "F");
        itest("randoop", 69).given(propertyName, "Empty").checkEq(first, "E");
        itest("dev", 69).given(propertyName, "Value").checkEq(first, "V");
        itest("randoop", 69).given(propertyName, "IncludeLogMessageParameters").checkEq(first, "I");
        itest("randoop", 69).given(propertyName, "Enabled").checkEq(first, "E");
        itest("randoop", 69).given(propertyName, "PropertyArray").checkEq(first, "P");
        itest("randoop", 69).given(propertyName, "MaximumMessageSize").checkEq(first, "M");
        itest("randoop", 69).given(propertyName, "Stopped").checkEq(first, "S");
        itest("randoop", 69).given(propertyName, "TimestampPattern").checkEq(first, "T");
        itest("randoop", 69).given(propertyName, "Encoding").checkEq(first, "E");
        itest("randoop", 69).given(propertyName, "ContentType").checkEq(first, "C");
        itest("randoop", 69).given(propertyName, "Regex").checkEq(first, "R");
        itest("randoop", 69).given(propertyName, "StatusManager").checkEq(first, "S");
        itest("randoop", 69).given(propertyName, "Valid").checkEq(first, "V");
        itest("randoop", 69).given(propertyName, "Version").checkEq(first, "V");
        itest("randoop", 69).given(propertyName, "GraylogPort").checkEq(first, "G");
        itest("randoop", 69).given(propertyName, "AdditonalFields").checkEq(first, "A");
        itest("randoop", 69).given(propertyName, "Initialized").checkEq(first, "I");
        itest("randoop", 69).given(propertyName, "GraylogHost").checkEq(first, "G");
        itest("randoop", 69).given(propertyName, "Header").checkEq(first, "H");
        itest("randoop", 69).given(propertyName, "Stopping").checkEq(first, "S");
        itest("dev", 69).given(propertyName, "CartId").checkEq(first, "C");
        itest("randoop", 69).given(propertyName, "Started").checkEq(first, "S");
        itest("randoop", 69).given(propertyName, "ExtractStackTrace").checkEq(first, "E");
        itest("randoop", 69).given(propertyName, "Pattern").checkEq(first, "P");
        itest("randoop", 69).given(propertyName, "Port").checkEq(first, "P");
        itest("randoop", 69).given(propertyName, "Facility").checkEq(first, "F");
        itest("randoop", 69).given(propertyName, "Bytes").checkEq(first, "B");
        itest("randoop", 69).given(propertyName, "AdditionalFieldTypes").checkEq(first, "A");
        itest("dev", 69).given(propertyName, "Boolean").checkEq(first, "B");
        itest("randoop", 69).given(propertyName, "Level").checkEq(first, "L");
        itest("randoop", 69).given(propertyName, "LineBreak").checkEq(first, "L");
        itest("randoop", 69).given(propertyName, "Name").checkEq(first, "N");
        itest("randoop", 69).given(propertyName, "CopyOfAttachedFiltersList").checkEq(first, "C");
        itest("randoop", 69).given(propertyName, "OriginHost").checkEq(first, "O");
        itest("randoop", 69).given(propertyName, "TimestampAsBigDecimal").checkEq(first, "T");
        itest("randoop", 69).given(propertyName, "Footer").checkEq(first, "F");
        itest("randoop", 69).given(propertyName, "IncludeFullMdc").checkEq(first, "I");
        itest("randoop", 69).given(propertyName, "ErrorManager").checkEq(first, "E");
        itest("randoop", 69).given(propertyName, "DeclaringClass").checkEq(first, "D");
        itest("evosuite", 69).given(propertyName, "Empty").checkEq(first, "E");
        itest("dev", 69).given(propertyName, "CustomerId").checkEq(first, "C");
        itest("randoop", 69).given(propertyName, "IncludeLocation").checkEq(first, "I");
        String last = propertyName.substring(1);
        itest("randoop", 70).given(propertyName, "MaximumMessageSize").checkEq(last, "aximumMessageSize");
        itest("randoop", 70).given(propertyName, "JavaTimestamp").checkEq(last, "avaTimestamp");
        itest("randoop", 70).given(propertyName, "Level").checkEq(last, "evel");
        itest("randoop", 70).given(propertyName, "IncludeLogMessageParameters").checkEq(last, "ncludeLogMessageParameters");
        itest("dev", 70).given(propertyName, "CustomerId").checkEq(last, "ustomerId");
        itest("randoop", 70).given(propertyName, "TimestampPattern").checkEq(last, "imestampPattern");
        itest("dev", 70).given(propertyName, "CartId").checkEq(last, "artId");
        itest("randoop", 70).given(propertyName, "GraylogHost").checkEq(last, "raylogHost");
        itest("dev", 70).given(propertyName, "Amount").checkEq(last, "mount");
        itest("dev", 70).given(propertyName, "Value").checkEq(last, "alue");
        itest("randoop", 70).given(propertyName, "State").checkEq(last, "tate");
        itest("randoop", 70).given(propertyName, "Stopping").checkEq(last, "topping");
        itest("randoop", 70).given(propertyName, "Filter").checkEq(last, "ilter");
        itest("randoop", 70).given(propertyName, "Valid").checkEq(last, "alid");
        itest("randoop", 70).given(propertyName, "Name").checkEq(last, "ame");
        itest("randoop", 70).given(propertyName, "Version").checkEq(last, "ersion");
        itest("randoop", 70).given(propertyName, "IncludeFullMdc").checkEq(last, "ncludeFullMdc");
        itest("randoop", 70).given(propertyName, "GraylogPort").checkEq(last, "raylogPort");
        itest("randoop", 70).given(propertyName, "Enabled").checkEq(last, "nabled");
        itest("randoop", 70).given(propertyName, "Starting").checkEq(last, "tarting");
        itest("randoop", 70).given(propertyName, "Host").checkEq(last, "ost");
        itest("randoop", 70).given(propertyName, "DeclaringClass").checkEq(last, "eclaringClass");
        itest("randoop", 70).given(propertyName, "Timestamp").checkEq(last, "imestamp");
        itest("randoop", 70).given(propertyName, "MdcProfiling").checkEq(last, "dcProfiling");
        itest("randoop", 70).given(propertyName, "Pattern").checkEq(last, "attern");
        itest("randoop", 70).given(propertyName, "AdditonalFields").checkEq(last, "dditonalFields");
        itest("evosuite", 70).given(propertyName, "Empty").checkEq(last, "mpty");
        itest("randoop", 70).given(propertyName, "AdditionalFieldTypes").checkEq(last, "dditionalFieldTypes");
        itest("randoop", 70).given(propertyName, "StatusManager").checkEq(last, "tatusManager");
        itest("randoop", 70).given(propertyName, "Started").checkEq(last, "tarted");
        itest("randoop", 70).given(propertyName, "ShortMessage").checkEq(last, "hortMessage");
        itest("randoop", 70).given(propertyName, "Empty").checkEq(last, "mpty");
        itest("dev", 70).given(propertyName, "Boolean").checkEq(last, "oolean");
        itest("randoop", 70).given(propertyName, "Context").checkEq(last, "ontext");
        itest("randoop", 70).given(propertyName, "FullMessage").checkEq(last, "ullMessage");
        itest("randoop", 70).given(propertyName, "CopyOfAttachedFiltersList").checkEq(last, "opyOfAttachedFiltersList");
        itest("randoop", 70).given(propertyName, "Formatter").checkEq(last, "ormatter");
        itest("randoop", 70).given(propertyName, "Regex").checkEq(last, "egex");
        itest("randoop", 70).given(propertyName, "Facility").checkEq(last, "acility");
        itest("randoop", 70).given(propertyName, "Bytes").checkEq(last, "ytes");
        itest("randoop", 70).given(propertyName, "Layout").checkEq(last, "ayout");
        itest("randoop", 70).given(propertyName, "OriginHost").checkEq(last, "riginHost");
        itest("randoop", 70).given(propertyName, "FilterStackTrace").checkEq(last, "ilterStackTrace");
        itest("dev", 70).given(propertyName, "Object").checkEq(last, "bject");
        itest("randoop", 70).given(propertyName, "ErrorManager").checkEq(last, "rrorManager");
        itest("randoop", 70).given(propertyName, "ExtractStackTrace").checkEq(last, "xtractStackTrace");
        itest("randoop", 70).given(propertyName, "IncludeLocation").checkEq(last, "ncludeLocation");
        itest("randoop", 70).given(propertyName, "Stopped").checkEq(last, "topped");
        itest("randoop", 70).given(propertyName, "LineBreak").checkEq(last, "ineBreak");
        itest("randoop", 70).given(propertyName, "Footer").checkEq(last, "ooter");
        itest("randoop", 70).given(propertyName, "ContentType").checkEq(last, "ontentType");
        itest("randoop", 70).given(propertyName, "Handler").checkEq(last, "andler");
        itest("randoop", 70).given(propertyName, "Initialized").checkEq(last, "nitialized");
        itest("randoop", 70).given(propertyName, "Port").checkEq(last, "ort");
        itest("randoop", 70).given(propertyName, "Header").checkEq(last, "eader");
        itest("randoop", 70).given(propertyName, "Encoding").checkEq(last, "ncoding");
        itest("randoop", 70).given(propertyName, "PropertyArray").checkEq(last, "ropertyArray");
        itest("randoop", 70).given(propertyName, "TimestampAsBigDecimal").checkEq(last, "imestampAsBigDecimal");
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
            itest("evosuite", 97).given(matcher, "33.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "59.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "42.xml").checkFalse(group());
            itest("dev", 97).given(matcher, "22.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "67.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "81.xml").checkTrue(group());
            itest("evosuite", 97).given(matcher, "36.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "47.xml").checkFalse(group());
            itest("dev", 97).given(matcher, "21.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "112.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "106.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "145.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "121.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "82.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "64.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "37.xml").checkFalse(group());
            itest("dev", 97).given(matcher, "20.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "42.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "102.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "118.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "69.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "72.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "83.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "73.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "58.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "43.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "43.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "123.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "84.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "66.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "35.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "138.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "131.xml").checkTrue(group());
            itest("evosuite", 97).given(matcher, "46.xml").checkFalse(group());
            itest("dev", 97).given(matcher, "25.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "111.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "105.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "100.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "70.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "92.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "99.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "49.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "41.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "146.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "57.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "79.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "80.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "129.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "86.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "68.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "140.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "113.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "107.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "90.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "33.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "76.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "55.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "32.xml").checkFalse(group());
            itest("dev", 97).given(matcher, "23.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "127.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "62.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "39.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "40.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "51.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "95.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "115.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "109.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "104.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "135.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "96.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "128.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "119.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "53.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "34.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "97.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "136.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "89.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "78.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "147.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "61.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "133.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "35.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "38.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "50.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "45.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "101.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "94.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "110.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "103.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "134.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "125.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "44.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "77.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "63.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "56.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "116.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "117.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "88.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "124.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "122.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "85.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "139.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "93.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "52.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "41.xml").checkFalse(group());
            itest("dev", 97).given(matcher, "24.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "130.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "132.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "91.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "60.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "75.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "54.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "65.xml").checkTrue(group());
            itest("evosuite", 97).given(matcher, "40.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "98.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "120.xml").checkFalse(group());
            itest("dev", 97).given(matcher, "19.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "137.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "126.xml").checkTrue(group());
            itest("randoop", 97).given(matcher, "87.xml").checkTrue(group());
            itest("evosuite", 97).given(matcher, "34.xml").checkFalse(group());
            itest("evosuite", 97).given(matcher, "32.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "114.xml").checkFalse(group());
            itest("randoop", 97).given(matcher, "108.xml").checkFalse(group());
            return matcher.toMatchResult().group(1);
        }
        return null;
    }
}
