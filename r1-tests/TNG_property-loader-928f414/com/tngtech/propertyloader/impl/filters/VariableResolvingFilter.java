package com.tngtech.propertyloader.impl.filters;

import java.util.Properties;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Resolves variables.
 */
public class VariableResolvingFilter extends ValueModifyingFilter {

    private static final String VARIABLE_PREFIX = "${";

    private static final String VARIABLE_SUFFIX = "}";

    @Override
    protected String filterValue(String key, String value, Properties properties) {
        if (!value.contains(VARIABLE_PREFIX)) {
            return value;
        }
        int startIndex = value.lastIndexOf(VARIABLE_PREFIX);
        int endIndex = value.indexOf(VARIABLE_SUFFIX, startIndex + VARIABLE_PREFIX.length());
        itest("evosuite", 20).given(startIndex, 0).given(VARIABLE_PREFIX, "${").given(VARIABLE_SUFFIX, "}").given(value, "${").checkEq(endIndex, -1);
        itest("evosuite", 20).given(startIndex, 1).given(VARIABLE_PREFIX, "${").given(VARIABLE_SUFFIX, "}").given(value, "M${u;bf!-}ZJ`Gqwe").checkEq(endIndex, 9);
        itest("dev", 20).given(startIndex, 0).given(VARIABLE_PREFIX, "${").given(VARIABLE_SUFFIX, "}").given(value, "${value}").checkEq(endIndex, 7);
        String prefix = value.substring(0, startIndex);
        itest("evosuite", 22).given(startIndex, 0).given(value, "${").checkEq(prefix, "");
        itest("dev", 22).given(startIndex, 0).given(value, "${value}").checkEq(prefix, "");
        itest("evosuite", 22).given(startIndex, 1).given(value, "M${u;bf!-}ZJ`Gqwe").checkEq(prefix, "M");
        String variableName = value.substring(startIndex + VARIABLE_PREFIX.length(), endIndex);
        itest("dev", 23).given(startIndex, 0).given(VARIABLE_PREFIX, "${").given(endIndex, 7).given(value, "${value}").checkEq(variableName, "value");
        itest("evosuite", 23).given(startIndex, 1).given(VARIABLE_PREFIX, "${").given(endIndex, 9).given(value, "M${u;bf!-}ZJ`Gqwe").checkEq(variableName, "u;bf!-");
        String suffix = value.substring(endIndex + VARIABLE_SUFFIX.length());
        itest("evosuite", 24).given(endIndex, 9).given(VARIABLE_SUFFIX, "}").given(value, "M${u;bf!-}ZJ`Gqwe").checkEq(suffix, "ZJ`Gqwe");
        itest("dev", 24).given(endIndex, 7).given(VARIABLE_SUFFIX, "}").given(value, "${value}").checkEq(suffix, "");
        String replacement = findReplacement(variableName, properties);
        if (replacement == null) {
            throw new VariableResolvingFilterException("Error during variable resolution: No value found for variable " + variableName);
        }
        String replacedValue = prefix + replacement + suffix;
        // In case this is a "${deeply${nested}}${variable}", look for something to resolve again
        return filterValue(key, replacedValue, properties);
    }

    private String findReplacement(String variableName, Properties properties) {
        String result = properties.getProperty(variableName);
        if (result != null) {
            return result;
        }
        return System.getProperty(variableName);
    }
}
