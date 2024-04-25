package org.codehaus.mojo.buildhelper.versioning;

/*
 * The MIT License
 *
 * Copyright (c) 2016, 2017 Karl Heinz Marbaise
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * This class will parse the version based on the given pattern in {@link org.codehaus.mojo.buildhelper.ParseVersionMojo}.
 *
 * @author Karl Heinz Marbaise <a href="mailto:khmarbaise@apache.org">khmarbaise@apache.org</a>
 */
public class VersionInformation {

    private static final String MAJOR_MINOR_PATCH_PATTERN = "^((\\d+)(\\.(\\d+)(\\.(\\d+))?)?)";

    private static final Pattern MAJOR_MINOR_PATCH = Pattern.compile(MAJOR_MINOR_PATCH_PATTERN);

    private static final Pattern DIGITS = Pattern.compile(MAJOR_MINOR_PATCH_PATTERN + "(.*)$");

    private static final Pattern BUILD_NUMBER = Pattern.compile("(((\\-)(\\d+)(.*))?)|(\\.(.*))|(\\-(.*))|(.*)$");

    private int major;

    private int minor;

    private int patch;

    private long buildNumber;

    private String qualifier;

    private void parseBuildNumber(String buildNumberPart) {
        Matcher matcher = BUILD_NUMBER.matcher(buildNumberPart);
        if (matcher.matches()) {
            itest("randoop", 60).given(matcher, "3.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "88.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "9.xml").checkTrue(group());
            itest("evosuite", 60).given(matcher, "148.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "73.xml").checkTrue(group());
            itest("randoop", 60).given(matcher, "161.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "102.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "91.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "120.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "23.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "117.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "76.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "40.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "65.xml").checkTrue(group());
            itest("randoop", 60).given(matcher, "173.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "94.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "123.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "26.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "97.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "57.xml").checkTrue(group());
            itest("randoop", 60).given(matcher, "167.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "46.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "79.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "68.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "14.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "82.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "43.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "32.xml").checkTrue(group());
            itest("randoop", 60).given(matcher, "170.xml").checkTrue(group());
            itest("randoop", 60).given(matcher, "164.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "3.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "85.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "114.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "35.xml").checkTrue(group());
            itest("evosuite", 60).given(matcher, "3.xml").checkTrue(group());
            itest("dev", 60).given(matcher, "20.xml").checkTrue(group());
            String buildNumber = matcher.group(4);
            itest("dev", 62).given(matcher, "10.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "44.xml").checkEq(buildNumber, "45");
            itest("dev", 62).given(matcher, "27.xml").checkEq(buildNumber, "4");
            itest("randoop", 62).given(matcher, "174.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "95.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "36.xml").checkEq(buildNumber, "23");
            itest("dev", 62).given(matcher, "15.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "98.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "118.xml").checkEq(buildNumber, "111");
            itest("dev", 62).given(matcher, "66.xml").checkEq(buildNumber, "22");
            itest("dev", 62).given(matcher, "77.xml").checkEq(buildNumber, "01");
            itest("dev", 62).given(matcher, "21.xml").checkEq(buildNumber, "4");
            itest("randoop", 62).given(matcher, "171.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "33.xml").checkEq(buildNumber, "23");
            itest("randoop", 62).given(matcher, "4.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "89.xml").checkEq(buildNumber, "23");
            itest("dev", 62).given(matcher, "74.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "41.xml").checkEq(buildNumber, "45");
            itest("dev", 62).given(matcher, "24.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "121.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "86.xml").checkEq(buildNumber, "23");
            itest("dev", 62).given(matcher, "47.xml").checkEq(buildNumber, "45");
            itest("evosuite", 62).given(matcher, "4.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "115.xml").checkEq(buildNumber, "111");
            itest("randoop", 62).given(matcher, "168.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "124.xml").checkEq(buildNumber, "20171002135756");
            itest("dev", 62).given(matcher, "103.xml").checkEq(buildNumber, "88");
            itest("dev", 62).given(matcher, "4.xml").checkEq(buildNumber, null);
            itest("evosuite", 62).given(matcher, "149.xml").checkEq(buildNumber, null);
            itest("randoop", 62).given(matcher, "165.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "69.xml").checkEq(buildNumber, "056");
            itest("dev", 62).given(matcher, "58.xml").checkEq(buildNumber, "0012");
            itest("randoop", 62).given(matcher, "162.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "83.xml").checkEq(buildNumber, null);
            itest("dev", 62).given(matcher, "80.xml").checkEq(buildNumber, "1");
            itest("dev", 62).given(matcher, "92.xml").checkEq(buildNumber, "111");
            String qualifier = matcher.group(5);
            itest("dev", 63).given(matcher, "69.xml").checkEq(qualifier, "");
            itest("dev", 63).given(matcher, "92.xml").checkEq(qualifier, ".anton");
            itest("dev", 63).given(matcher, "77.xml").checkEq(qualifier, "-SNAPSHOT");
            itest("dev", 63).given(matcher, "21.xml").checkEq(qualifier, "");
            itest("dev", 63).given(matcher, "33.xml").checkEq(qualifier, "");
            itest("dev", 63).given(matcher, "115.xml").checkEq(qualifier, "-34-anton");
            itest("dev", 63).given(matcher, "58.xml").checkEq(qualifier, "");
            itest("evosuite", 63).given(matcher, "4.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "86.xml").checkEq(qualifier, "-2016060708");
            itest("dev", 63).given(matcher, "44.xml").checkEq(qualifier, ".qual");
            itest("dev", 63).given(matcher, "80.xml").checkEq(qualifier, "-SNAPSHOT");
            itest("dev", 63).given(matcher, "27.xml").checkEq(qualifier, "-SNAPSHOT");
            itest("randoop", 63).given(matcher, "165.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "36.xml").checkEq(qualifier, ".heger");
            itest("dev", 63).given(matcher, "24.xml").checkEq(qualifier, null);
            itest("randoop", 63).given(matcher, "4.xml").checkEq(qualifier, null);
            itest("randoop", 63).given(matcher, "168.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "47.xml").checkEq(qualifier, "-qual");
            itest("randoop", 63).given(matcher, "174.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "15.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "74.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "95.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "66.xml").checkEq(qualifier, "");
            itest("dev", 63).given(matcher, "103.xml").checkEq(qualifier, ".03.5.XYZ.345");
            itest("randoop", 63).given(matcher, "162.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "121.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "83.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "41.xml").checkEq(qualifier, "");
            itest("dev", 63).given(matcher, "89.xml").checkEq(qualifier, ".2016060708");
            itest("dev", 63).given(matcher, "4.xml").checkEq(qualifier, null);
            itest("randoop", 63).given(matcher, "171.xml").checkEq(qualifier, null);
            itest("evosuite", 63).given(matcher, "149.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "124.xml").checkEq(qualifier, "");
            itest("dev", 63).given(matcher, "118.xml").checkEq(qualifier, "-34.anton");
            itest("dev", 63).given(matcher, "98.xml").checkEq(qualifier, null);
            itest("dev", 63).given(matcher, "10.xml").checkEq(qualifier, null);
            if (buildNumber != null) {
                setBuildNumber(Long.parseLong(buildNumber));
            }
            if (matcher.group(7) != null) {
                itest("randoop", 70).given(matcher, "4.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "74.xml").checkTrue(group());
                itest("dev", 70).given(matcher, "36.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "47.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "58.xml").checkFalse(group());
                itest("randoop", 70).given(matcher, "162.xml").checkTrue(group());
                itest("dev", 70).given(matcher, "69.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "86.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "80.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "115.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "24.xml").checkFalse(group());
                itest("evosuite", 70).given(matcher, "149.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "98.xml").checkTrue(group());
                itest("dev", 70).given(matcher, "95.xml").checkTrue(group());
                itest("randoop", 70).given(matcher, "174.xml").checkTrue(group());
                itest("dev", 70).given(matcher, "41.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "89.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "92.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "10.xml").checkTrue(group());
                itest("dev", 70).given(matcher, "83.xml").checkTrue(group());
                itest("dev", 70).given(matcher, "4.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "121.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "103.xml").checkFalse(group());
                itest("randoop", 70).given(matcher, "168.xml").checkTrue(group());
                itest("dev", 70).given(matcher, "27.xml").checkFalse(group());
                itest("randoop", 70).given(matcher, "171.xml").checkTrue(group());
                itest("evosuite", 70).given(matcher, "4.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "77.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "44.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "33.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "66.xml").checkFalse(group());
                itest("randoop", 70).given(matcher, "165.xml").checkTrue(group());
                itest("dev", 70).given(matcher, "124.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "21.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "15.xml").checkFalse(group());
                itest("dev", 70).given(matcher, "118.xml").checkFalse(group());
                qualifier = matcher.group(7);
                itest("randoop", 72).given(matcher, "171.xml").checkEq(qualifier, "");
                itest("dev", 72).given(matcher, "98.xml").checkEq(qualifier, "XYZ.345");
                itest("randoop", 72).given(matcher, "174.xml").checkEq(qualifier, "true");
                itest("randoop", 72).given(matcher, "168.xml").checkEq(qualifier, "jar");
                itest("dev", 72).given(matcher, "83.xml").checkEq(qualifier, "2016060708");
                itest("randoop", 72).given(matcher, "162.xml").checkEq(qualifier, "hi!");
                itest("dev", 72).given(matcher, "10.xml").checkEq(qualifier, "beta_5");
                itest("dev", 72).given(matcher, "95.xml").checkEq(qualifier, "22-SNAPSHOT");
                itest("randoop", 72).given(matcher, "165.xml").checkEq(qualifier, "org_apache_maven_plugin_Mojo");
                itest("dev", 72).given(matcher, "74.xml").checkEq(qualifier, "0-SNAPSHOT");
            }
            // Starting with "-"
            if (matcher.group(9) != null) {
                itest("evosuite", 75).given(matcher, "4.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "27.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "89.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "86.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "24.xml").checkTrue(group());
                itest("dev", 75).given(matcher, "103.xml").checkFalse(group());
                itest("randoop", 75).given(matcher, "168.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "33.xml").checkFalse(group());
                itest("randoop", 75).given(matcher, "165.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "44.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "118.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "66.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "98.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "77.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "83.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "124.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "4.xml").checkFalse(group());
                itest("randoop", 75).given(matcher, "4.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "21.xml").checkFalse(group());
                itest("randoop", 75).given(matcher, "171.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "10.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "47.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "36.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "121.xml").checkTrue(group());
                itest("dev", 75).given(matcher, "95.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "15.xml").checkTrue(group());
                itest("dev", 75).given(matcher, "69.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "58.xml").checkFalse(group());
                itest("randoop", 75).given(matcher, "174.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "80.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "92.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "74.xml").checkFalse(group());
                itest("randoop", 75).given(matcher, "162.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "41.xml").checkFalse(group());
                itest("evosuite", 75).given(matcher, "149.xml").checkFalse(group());
                itest("dev", 75).given(matcher, "115.xml").checkFalse(group());
                qualifier = matcher.group(9);
                itest("dev", 77).given(matcher, "121.xml").checkEq(qualifier, "beta_5");
                itest("dev", 77).given(matcher, "24.xml").checkEq(qualifier, "beta-5");
                itest("dev", 77).given(matcher, "15.xml").checkEq(qualifier, "SNAPSHOT");
            }
            if (qualifier != null) {
                if (qualifier.trim().length() == 0) {
                    setQualifier(null);
                } else {
                    setQualifier(qualifier);
                }
            } else {
                setQualifier(null);
            }
        }
    }

    private void parseMajorMinorPatchVersion(String version) {
        Matcher matcher = MAJOR_MINOR_PATCH.matcher(version);
        if (matcher.matches()) {
            itest("dev", 100).given(matcher, "108.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "52.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "12.xml").checkTrue(group());
            itest("randoop", 100).given(matcher, "159.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "126.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "63.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "105.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "17.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "100.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "1.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "111.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "71.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "49.xml").checkTrue(group());
            itest("evosuite", 100).given(matcher, "143.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "55.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "60.xml").checkTrue(group());
            itest("evosuite", 100).given(matcher, "146.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "38.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "7.xml").checkTrue(group());
            itest("dev", 100).given(matcher, "29.xml").checkTrue(group());
            String majorString = matcher.group(2);
            itest("dev", 102).given(matcher, "72.xml").checkEq(majorString, "20");
            itest("dev", 102).given(matcher, "2.xml").checkEq(majorString, "1");
            itest("dev", 102).given(matcher, "64.xml").checkEq(majorString, "20");
            itest("dev", 102).given(matcher, "50.xml").checkEq(majorString, "3");
            itest("randoop", 102).given(matcher, "160.xml").checkEq(majorString, "0");
            itest("dev", 102).given(matcher, "61.xml").checkEq(majorString, "01");
            itest("dev", 102).given(matcher, "109.xml").checkEq(majorString, "020");
            itest("dev", 102).given(matcher, "30.xml").checkEq(majorString, "1");
            itest("evosuite", 102).given(matcher, "147.xml").checkEq(majorString, "0");
            itest("dev", 102).given(matcher, "106.xml").checkEq(majorString, "20");
            itest("evosuite", 102).given(matcher, "144.xml").checkEq(majorString, "4");
            itest("dev", 102).given(matcher, "101.xml").checkEq(majorString, "20");
            itest("dev", 102).given(matcher, "18.xml").checkEq(majorString, "2");
            itest("dev", 102).given(matcher, "127.xml").checkEq(majorString, "999999999999");
            itest("dev", 102).given(matcher, "13.xml").checkEq(majorString, "1");
            itest("dev", 102).given(matcher, "8.xml").checkEq(majorString, "2");
            itest("dev", 102).given(matcher, "112.xml").checkEq(majorString, "20");
            itest("dev", 102).given(matcher, "56.xml").checkEq(majorString, "1");
            itest("dev", 102).given(matcher, "39.xml").checkEq(majorString, "1");
            itest("dev", 102).given(matcher, "53.xml").checkEq(majorString, "5");
            String minorString = matcher.group(4);
            itest("dev", 103).given(matcher, "18.xml").checkEq(minorString, "0");
            itest("dev", 103).given(matcher, "72.xml").checkEq(minorString, "4");
            itest("dev", 103).given(matcher, "112.xml").checkEq(minorString, "7");
            itest("dev", 103).given(matcher, "2.xml").checkEq(minorString, "0");
            itest("dev", 103).given(matcher, "61.xml").checkEq(minorString, "9");
            itest("dev", 103).given(matcher, "109.xml").checkEq(minorString, "04");
            itest("dev", 103).given(matcher, "101.xml").checkEq(minorString, null);
            itest("dev", 103).given(matcher, "50.xml").checkEq(minorString, "2");
            itest("dev", 103).given(matcher, "13.xml").checkEq(minorString, "2");
            itest("randoop", 103).given(matcher, "160.xml").checkEq(minorString, "0");
            itest("evosuite", 103).given(matcher, "144.xml").checkEq(minorString, null);
            itest("evosuite", 103).given(matcher, "147.xml").checkEq(minorString, null);
            itest("dev", 103).given(matcher, "8.xml").checkEq(minorString, "3");
            itest("dev", 103).given(matcher, "106.xml").checkEq(minorString, "4");
            itest("dev", 103).given(matcher, "64.xml").checkEq(minorString, "03");
            itest("dev", 103).given(matcher, "56.xml").checkEq(minorString, "9");
            itest("dev", 103).given(matcher, "39.xml").checkEq(minorString, "2");
            itest("dev", 103).given(matcher, "127.xml").checkEq(minorString, "12345678");
            itest("dev", 103).given(matcher, "53.xml").checkEq(minorString, "7");
            itest("dev", 103).given(matcher, "30.xml").checkEq(minorString, null);
            String patchString = matcher.group(6);
            itest("dev", 104).given(matcher, "61.xml").checkEq(patchString, "04");
            itest("dev", 104).given(matcher, "30.xml").checkEq(patchString, null);
            itest("dev", 104).given(matcher, "13.xml").checkEq(patchString, "3");
            itest("dev", 104).given(matcher, "109.xml").checkEq(patchString, null);
            itest("dev", 104).given(matcher, "53.xml").checkEq(patchString, "1");
            itest("dev", 104).given(matcher, "8.xml").checkEq(patchString, "4");
            itest("dev", 104).given(matcher, "127.xml").checkEq(patchString, "12");
            itest("dev", 104).given(matcher, "56.xml").checkEq(patchString, "04");
            itest("evosuite", 104).given(matcher, "147.xml").checkEq(patchString, null);
            itest("dev", 104).given(matcher, "39.xml").checkEq(patchString, null);
            itest("evosuite", 104).given(matcher, "144.xml").checkEq(patchString, null);
            itest("randoop", 104).given(matcher, "160.xml").checkEq(patchString, "0");
            itest("dev", 104).given(matcher, "64.xml").checkEq(patchString, "5");
            itest("dev", 104).given(matcher, "50.xml").checkEq(patchString, null);
            itest("dev", 104).given(matcher, "112.xml").checkEq(patchString, "12");
            itest("dev", 104).given(matcher, "106.xml").checkEq(patchString, null);
            itest("dev", 104).given(matcher, "18.xml").checkEq(patchString, "17");
            itest("dev", 104).given(matcher, "72.xml").checkEq(patchString, "06");
            itest("dev", 104).given(matcher, "2.xml").checkEq(patchString, "0");
            itest("dev", 104).given(matcher, "101.xml").checkEq(patchString, null);
            if (majorString != null) {
                setMajor(Integer.parseInt(majorString));
            }
            if (minorString != null) {
                setMinor(Integer.parseInt(minorString));
            }
            if (patchString != null) {
                setPatch(Integer.parseInt(patchString));
            }
        }
    }

    public VersionInformation(String version) {
        Matcher matcherDigits = DIGITS.matcher(version);
        if (matcherDigits.matches()) {
            itest("dev", 125).given(matcherDigits, "11.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "62.xml").checkTrue(group());
            itest("randoop", 125).given(matcherDigits, "156.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "122.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "150.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "84.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "25.xml").checkTrue(group());
            itest("randoop", 125).given(matcherDigits, "166.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "54.xml").checkTrue(group());
            itest("randoop", 125).given(matcherDigits, "172.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "70.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "75.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "152.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "116.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "6.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "139.xml").checkFalse(group());
            itest("randoop", 125).given(matcherDigits, "158.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "31.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "141.xml").checkFalse(group());
            itest("evosuite", 125).given(matcherDigits, "138.xml").checkFalse(group());
            itest("evosuite", 125).given(matcherDigits, "135.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "93.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "16.xml").checkTrue(group());
            itest("randoop", 125).given(matcherDigits, "163.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "48.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "59.xml").checkTrue(group());
            itest("randoop", 125).given(matcherDigits, "157.xml").checkFalse(group());
            itest("evosuite", 125).given(matcherDigits, "145.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "110.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "137.xml").checkFalse(group());
            itest("evosuite", 125).given(matcherDigits, "136.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "107.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "37.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "51.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "22.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "104.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "87.xml").checkTrue(group());
            itest("randoop", 125).given(matcherDigits, "155.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "81.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "28.xml").checkTrue(group());
            itest("randoop", 125).given(matcherDigits, "177.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "119.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "140.xml").checkFalse(group());
            itest("evosuite", 125).given(matcherDigits, "151.xml").checkFalse(group());
            itest("randoop", 125).given(matcherDigits, "176.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "96.xml").checkTrue(group());
            itest("randoop", 125).given(matcherDigits, "169.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "42.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "113.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "67.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "78.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "142.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "45.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "153.xml").checkFalse(group());
            itest("randoop", 125).given(matcherDigits, "175.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "34.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "90.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "99.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "19.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "125.xml").checkTrue(group());
            itest("evosuite", 125).given(matcherDigits, "154.xml").checkFalse(group());
            itest("randoop", 125).given(matcherDigits, "139.xml").checkFalse(group());
            itest("dev", 125).given(matcherDigits, "0.xml").checkTrue(group());
            itest("dev", 125).given(matcherDigits, "5.xml").checkFalse(group());
            parseMajorMinorPatchVersion(matcherDigits.group(1));
            parseBuildNumber(matcherDigits.group(7));
        } else {
            setQualifier(version);
        }
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public int getPatch() {
        return patch;
    }

    public void setPatch(int patch) {
        this.patch = patch;
    }

    public long getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(long buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
}
