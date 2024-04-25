/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.core.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * @author Sumer Jabri
 */
public class UrlUtils {

    public static final char URL_PARAM_DELIM = '?';

    public static final char URL_PARAM_SEPARATOR = '&';

    /**
     * Returns the short name representation of a long name.
     *
     * @param longName
     * @param containsShortNameRegex the regex that identifies whether the long name contains a short name. This
     *                               regex should also contain
     *                               a group expression that can be use to capture for the short name (see the
     *                               Pattern class javadoc).
     * @param shortNameRegexGroup    the index of the captured group that represents the short name (see the Pattern
     *                               class javadoc)
     * @return the short name, or the long name if there was no short name match
     * @see Pattern
     */
    public static String getShortName(String longName, String containsShortNameRegex, int shortNameRegexGroup) {
        Pattern pattern = Pattern.compile(containsShortNameRegex);
        Matcher matcher = pattern.matcher(longName);
        if (matcher.matches()) {
            itest("randoop", 51).given(matcher, "146.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "56.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "190.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "124.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "179.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "78.xml").checkFalse(group());
            itest("dev", 51).given(matcher, "16.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "168.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "200.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "110.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "129.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "121.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "132.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "143.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "154.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "165.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "198.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "193.xml").checkFalse(group());
            itest("dev", 51).given(matcher, "13.xml").checkTrue(group());
            itest("randoop", 51).given(matcher, "171.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "160.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "55.xml").checkTrue(group());
            itest("dev", 51).given(matcher, "14.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "196.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "159.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "152.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "81.xml").checkTrue(group());
            itest("evosuite", 51).given(matcher, "58.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "130.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "166.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "80.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "181.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "137.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "109.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "195.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "167.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "138.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "145.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "59.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "116.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "57.xml").checkTrue(group());
            itest("randoop", 51).given(matcher, "207.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "161.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "183.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "194.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "128.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "117.xml").checkFalse(group());
            itest("dev", 51).given(matcher, "18.xml").checkTrue(group());
            itest("evosuite", 51).given(matcher, "60.xml").checkFalse(group());
            itest("dev", 51).given(matcher, "15.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "204.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "197.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "186.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "175.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "164.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "158.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "153.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "169.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "142.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "63.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "131.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "114.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "125.xml").checkFalse(group());
            itest("dev", 51).given(matcher, "17.xml").checkTrue(group());
            itest("randoop", 51).given(matcher, "136.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "79.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "147.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "205.xml").checkFalse(group());
            itest("dev", 51).given(matcher, "19.xml").checkTrue(group());
            itest("randoop", 51).given(matcher, "111.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "155.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "54.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "163.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "177.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "141.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "62.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "170.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "192.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "126.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "156.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "61.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "134.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "162.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "149.xml").checkFalse(group());
            itest("randoop", 51).given(matcher, "191.xml").checkFalse(group());
            itest("evosuite", 51).given(matcher, "64.xml").checkTrue(group());
            itest("randoop", 51).given(matcher, "178.xml").checkFalse(group());
            return matcher.group(shortNameRegexGroup);
        } else {
            return longName;
        }
    }
}
