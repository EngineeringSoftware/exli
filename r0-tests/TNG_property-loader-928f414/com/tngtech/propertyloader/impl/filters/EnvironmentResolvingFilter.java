package com.tngtech.propertyloader.impl.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Resolves Environment variables.
 */
public class EnvironmentResolvingFilter extends ValueModifyingFilter {

    private static final Logger log = LoggerFactory.getLogger(EnvironmentResolvingFilter.class);

    private static final Pattern PATTERN = Pattern.compile("\\$ENV\\{(.*)\\}");

    @Override
    protected String filterValue(String key, String value, Properties properties) {
        Matcher matcher = PATTERN.matcher(value);
        if (matcher.matches()) {
            itest("evosuite", 22).given(matcher, "106.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "27.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "38.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "93.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "49.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "111.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "50.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "66.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "88.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "44.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "13.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "11.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "112.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "107.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "37.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "72.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "71.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "65.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "59.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "94.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "43.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "2.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "53.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "42.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "105.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "97.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "19.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "28.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "92.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "89.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "40.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "78.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "45.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "39.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "34.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "21.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "47.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "55.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "99.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "90.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "17.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "9.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "26.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "101.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "61.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "76.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "32.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "30.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "79.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "68.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "57.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "46.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "35.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "20.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "15.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "114.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "103.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "109.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "63.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "74.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "91.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "41.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "80.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "52.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "104.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "96.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "115.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "14.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "10.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "36.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "108.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "58.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "73.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "51.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "95.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "29.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "16.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "102.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "113.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "70.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "64.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "81.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "31.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "75.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "110.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "67.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "56.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "18.xml").checkFalse(group());
            itest("dev", 22).given(matcher, "8.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "100.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "69.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "62.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "77.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "33.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "48.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "60.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "98.xml").checkFalse(group());
            itest("evosuite", 22).given(matcher, "54.xml").checkFalse(group());
            value = getenv(matcher.group(1));
            if (value == null) {
                log.warn("There is no system property called '{}'.", matcher.group(1));
            }
        }
        return value;
    }

    protected String getenv(String key) {
        return System.getenv(key);
    }
}
