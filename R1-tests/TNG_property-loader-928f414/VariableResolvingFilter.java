package com.tngtech.propertyloader.impl.filters;

import java.util.Properties;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Unit", 20).given(startIndex, 0).given(VARIABLE_PREFIX, "${").given(VARIABLE_SUFFIX, "}").given(value, "${value}").checkEq(endIndex, 7);
        String prefix = value.substring(0, startIndex);
        String variableName = value.substring(startIndex + VARIABLE_PREFIX.length(), endIndex);
        String suffix = value.substring(endIndex + VARIABLE_SUFFIX.length());
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
