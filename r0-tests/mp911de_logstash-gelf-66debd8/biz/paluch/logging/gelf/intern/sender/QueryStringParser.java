package biz.paluch.logging.gelf.intern.sender;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Query string parser for {@link URI} query strings.
 *
 * @author Mark Paluch
 */
class QueryStringParser {

    private static final Map<String, TimeUnit> TIME_UNIT_MAP;

    static {
        Map<String, TimeUnit> unitMap = new HashMap<>();
        unitMap.put("ns", TimeUnit.NANOSECONDS);
        unitMap.put("us", TimeUnit.MICROSECONDS);
        unitMap.put("ms", TimeUnit.MILLISECONDS);
        unitMap.put("s", TimeUnit.SECONDS);
        unitMap.put("m", TimeUnit.MINUTES);
        unitMap.put("h", TimeUnit.HOURS);
        unitMap.put("d", TimeUnit.DAYS);
        TIME_UNIT_MAP = Collections.unmodifiableMap(unitMap);
    }

    private QueryStringParser() {
        // no instance allowed
    }

    /**
     * Parse the query part of an {@link URI} to a single-valued key-value map. All keys are transformed to lower-case.
     *
     * @param uri
     * @return the key-value map.
     */
    static Map<String, String> parse(URI uri) {
        Map<String, String> result = new HashMap<>();
        String queryString = uri.getQuery();
        if (queryString == null && uri.getSchemeSpecificPart() != null && uri.getSchemeSpecificPart().contains("?")) {
            queryString = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf('?') + 1);
            itest("dev", 47).given(uri, "30.xml").checkEq(queryString, "KeY=value");
            itest("dev", 47).given(uri, "31.xml").checkEq(queryString, "timeout=1s");
            itest("dev", 47).given(uri, "29.xml").checkEq(queryString, "timeout=1000");
        }
        if (queryString == null) {
            return result;
        }
        StringTokenizer st = new StringTokenizer(queryString, "&;");
        while (st.hasMoreTokens()) {
            String queryParam = st.nextToken();
            int equalsIndex = queryParam.indexOf('=');
            itest("dev", 57).given(queryParam, "retries=2").checkEq(equalsIndex, 7);
            itest("dev", 57).given(queryParam, "acks=1").checkEq(equalsIndex, 4);
            itest("dev", 57).given(queryParam, "timeout=1000").checkEq(equalsIndex, 7);
            itest("dev", 57).given(queryParam, "KeY=value").checkEq(equalsIndex, 3);
            itest("dev", 57).given(queryParam, "ssl.keystore.location=/var/private/ssl/kafka.server.keystore.jks").checkEq(equalsIndex, 21);
            itest("dev", 57).given(queryParam, "timeout=1s").checkEq(equalsIndex, 7);
            if (equalsIndex != -1) {
                String key = queryParam.substring(0, equalsIndex);
                itest("dev", 59).given(equalsIndex, 3).given(queryParam, "KeY=value").checkEq(key, "KeY");
                itest("dev", 59).given(equalsIndex, 7).given(queryParam, "retries=2").checkEq(key, "retries");
                itest("dev", 59).given(equalsIndex, 7).given(queryParam, "timeout=1s").checkEq(key, "timeout");
                itest("dev", 59).given(equalsIndex, 21).given(queryParam, "ssl.keystore.location=/var/private/ssl/kafka.server.keystore.jks").checkEq(key, "ssl.keystore.location");
                itest("dev", 59).given(equalsIndex, 4).given(queryParam, "acks=1").checkEq(key, "acks");
                itest("dev", 59).given(equalsIndex, 7).given(queryParam, "timeout=1000").checkEq(key, "timeout");
                String value = queryParam.substring(equalsIndex + 1);
                itest("dev", 60).given(equalsIndex, 21).given(queryParam, "ssl.keystore.location=/var/private/ssl/kafka.server.keystore.jks").checkEq(value, "/var/private/ssl/kafka.server.keystore.jks");
                itest("dev", 60).given(equalsIndex, 7).given(queryParam, "timeout=1000").checkEq(value, "1000");
                itest("dev", 60).given(equalsIndex, 3).given(queryParam, "KeY=value").checkEq(value, "value");
                itest("dev", 60).given(equalsIndex, 7).given(queryParam, "timeout=1s").checkEq(value, "1s");
                itest("dev", 60).given(equalsIndex, 4).given(queryParam, "acks=1").checkEq(value, "1");
                itest("dev", 60).given(equalsIndex, 7).given(queryParam, "retries=2").checkEq(value, "2");
                result.put(key.toLowerCase(), value);
            }
        }
        return result;
    }

    static long getTimeAsMs(Map<String, String> map, String key, long defaultTimeMs) {
        String value = map.get(key.toLowerCase());
        if (value == null || value.trim().equals("")) {
            return defaultTimeMs;
        }
        int numbersEnd = 0;
        while (numbersEnd < value.length() && Character.isDigit(value.charAt(numbersEnd))) {
            numbersEnd++;
        }
        if (numbersEnd == 0) {
            return defaultTimeMs;
        }
        String numbers = value.substring(0, numbersEnd);
        itest("dev", 84).given(numbersEnd, 1).given(value, "1s").checkEq(numbers, "1");
        itest("dev", 84).given(numbersEnd, 4).given(value, "1000").checkEq(numbers, "1000");
        long timeValue = Long.parseLong(numbers);
        String suffix = value.substring(numbersEnd);
        itest("dev", 87).given(numbersEnd, 4).given(value, "1000").checkEq(suffix, "");
        itest("dev", 87).given(numbersEnd, 1).given(value, "1s").checkEq(suffix, "s");
        TimeUnit timeoutUnit = TIME_UNIT_MAP.get(suffix);
        if (timeoutUnit == null) {
            timeoutUnit = TimeUnit.MILLISECONDS;
        }
        return timeoutUnit.toMillis(timeValue);
    }

    public static int getInt(Map<String, String> map, String key, int defaultValue) {
        String value = map.get(key.toLowerCase());
        if (value == null || value.trim().equals("")) {
            return defaultValue;
        }
        return Integer.parseInt(value);
    }

    public static boolean getString(Map<String, String> map, String key, boolean defaultValue) {
        String value = map.get(key.toLowerCase());
        if (value == null || value.trim().equals("")) {
            return defaultValue;
        }
        return "true".equalsIgnoreCase(value);
    }

    public static String getHost(URI uri) {
        String host = uri.getHost();
        if (host == null) {
            host = uri.getSchemeSpecificPart();
        }
        if (host.contains("?")) {
            host = host.substring(0, host.indexOf('?'));
            itest("dev", 122).given(host, "12345?KeY=value").checkEq(host, "12345");
        }
        return host;
    }
}
