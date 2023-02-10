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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
            new Here("Unit", 60).given(matcher, "52.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "81.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "70.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "42.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "93.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "64.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "67.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "96.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "20.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "17.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "123.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "31.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "39.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "105.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "3.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "61.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "120.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "108.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "6.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "47.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "126.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "102.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "14.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "9.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "58.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "73.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "76.xml").checkTrue(group());
            new Here("Unit", 60).given(matcher, "55.xml").checkTrue(group());
            String buildNumber = matcher.group(4);
            new Here("Unit", 62).given(matcher, "82.xml").checkEq(buildNumber, "88");
            new Here("Unit", 62).given(matcher, "59.xml").checkEq(buildNumber, "1");
            new Here("Unit", 62).given(matcher, "48.xml").checkEq(buildNumber, null);
            new Here("Unit", 62).given(matcher, "106.xml").checkEq(buildNumber, null);
            new Here("Unit", 62).given(matcher, "124.xml").checkEq(buildNumber, null);
            new Here("Unit", 62).given(matcher, "62.xml").checkEq(buildNumber, null);
            new Here("Unit", 62).given(matcher, "43.xml").checkEq(buildNumber, "056");
            new Here("Unit", 62).given(matcher, "40.xml").checkEq(buildNumber, "22");
            new Here("Unit", 62).given(matcher, "77.xml").checkEq(buildNumber, null);
            new Here("Unit", 62).given(matcher, "97.xml").checkEq(buildNumber, "111");
            new Here("Unit", 62).given(matcher, "74.xml").checkEq(buildNumber, null);
            new Here("Unit", 62).given(matcher, "15.xml").checkEq(buildNumber, "45");
            new Here("Unit", 62).given(matcher, "32.xml").checkEq(buildNumber, "0012");
            new Here("Unit", 62).given(matcher, "121.xml").checkEq(buildNumber, "4");
            new Here("Unit", 62).given(matcher, "127.xml").checkEq(buildNumber, "4");
            new Here("Unit", 62).given(matcher, "7.xml").checkEq(buildNumber, "23");
            new Here("Unit", 62).given(matcher, "94.xml").checkEq(buildNumber, "111");
            new Here("Unit", 62).given(matcher, "56.xml").checkEq(buildNumber, "01");
            new Here("Unit", 62).given(matcher, "18.xml").checkEq(buildNumber, "45");
            new Here("Unit", 62).given(matcher, "10.xml").checkEq(buildNumber, "23");
            new Here("Unit", 62).given(matcher, "109.xml").checkEq(buildNumber, "20171002135756");
            new Here("Unit", 62).given(matcher, "65.xml").checkEq(buildNumber, "23");
            new Here("Unit", 62).given(matcher, "68.xml").checkEq(buildNumber, "23");
            new Here("Unit", 62).given(matcher, "103.xml").checkEq(buildNumber, null);
            new Here("Unit", 62).given(matcher, "4.xml").checkEq(buildNumber, null);
            new Here("Unit", 62).given(matcher, "21.xml").checkEq(buildNumber, "45");
            new Here("Unit", 62).given(matcher, "71.xml").checkEq(buildNumber, "111");
            new Here("Unit", 62).given(matcher, "53.xml").checkEq(buildNumber, null);
            String qualifier = matcher.group(5);
            new Here("Unit", 63).given(matcher, "68.xml").checkEq(qualifier, ".2016060708");
            new Here("Unit", 63).given(matcher, "109.xml").checkEq(qualifier, "");
            new Here("Unit", 63).given(matcher, "56.xml").checkEq(qualifier, "-SNAPSHOT");
            new Here("Unit", 63).given(matcher, "10.xml").checkEq(qualifier, ".heger");
            new Here("Unit", 63).given(matcher, "127.xml").checkEq(qualifier, "-SNAPSHOT");
            new Here("Unit", 63).given(matcher, "77.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "103.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "32.xml").checkEq(qualifier, "");
            new Here("Unit", 63).given(matcher, "124.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "121.xml").checkEq(qualifier, "");
            new Here("Unit", 63).given(matcher, "7.xml").checkEq(qualifier, "");
            new Here("Unit", 63).given(matcher, "43.xml").checkEq(qualifier, "");
            new Here("Unit", 63).given(matcher, "65.xml").checkEq(qualifier, "-2016060708");
            new Here("Unit", 63).given(matcher, "53.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "15.xml").checkEq(qualifier, "");
            new Here("Unit", 63).given(matcher, "74.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "94.xml").checkEq(qualifier, "-34-anton");
            new Here("Unit", 63).given(matcher, "21.xml").checkEq(qualifier, "-qual");
            new Here("Unit", 63).given(matcher, "4.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "40.xml").checkEq(qualifier, "");
            new Here("Unit", 63).given(matcher, "48.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "97.xml").checkEq(qualifier, "-34.anton");
            new Here("Unit", 63).given(matcher, "106.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "71.xml").checkEq(qualifier, ".anton");
            new Here("Unit", 63).given(matcher, "62.xml").checkEq(qualifier, null);
            new Here("Unit", 63).given(matcher, "18.xml").checkEq(qualifier, ".qual");
            new Here("Unit", 63).given(matcher, "59.xml").checkEq(qualifier, "-SNAPSHOT");
            new Here("Unit", 63).given(matcher, "82.xml").checkEq(qualifier, ".03.5.XYZ.345");
            if (buildNumber != null) {
                setBuildNumber(Long.parseLong(buildNumber));
            }
            if (matcher.group(7) != null) {
                new Here("Unit", 70).given(matcher, "74.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "127.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "56.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "109.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "71.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "82.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "53.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "97.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "7.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "68.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "124.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "32.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "121.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "43.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "10.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "21.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "18.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "106.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "65.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "103.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "40.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "15.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "4.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "48.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "94.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "77.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "59.xml").checkFalse(group());
                new Here("Unit", 70).given(matcher, "62.xml").checkTrue(group());
                qualifier = matcher.group(7);
                new Here("Unit", 72).given(matcher, "106.xml").checkEq(qualifier, "beta_5");
                new Here("Unit", 72).given(matcher, "48.xml").checkEq(qualifier, "0-SNAPSHOT");
                new Here("Unit", 72).given(matcher, "74.xml").checkEq(qualifier, "22-SNAPSHOT");
                new Here("Unit", 72).given(matcher, "77.xml").checkEq(qualifier, "XYZ.345");
                new Here("Unit", 72).given(matcher, "62.xml").checkEq(qualifier, "2016060708");
            }
            // Starting with "-"
            if (matcher.group(9) != null) {
                new Here("Unit", 75).given(matcher, "124.xml").checkTrue(group());
                new Here("Unit", 75).given(matcher, "77.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "53.xml").checkTrue(group());
                new Here("Unit", 75).given(matcher, "40.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "18.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "127.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "62.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "121.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "109.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "65.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "7.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "32.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "48.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "21.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "15.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "43.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "59.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "10.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "94.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "97.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "82.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "71.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "103.xml").checkTrue(group());
                new Here("Unit", 75).given(matcher, "56.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "68.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "74.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "4.xml").checkFalse(group());
                new Here("Unit", 75).given(matcher, "106.xml").checkFalse(group());
                qualifier = matcher.group(9);
                new Here("Unit", 77).given(matcher, "53.xml").checkEq(qualifier, "SNAPSHOT");
                new Here("Unit", 77).given(matcher, "124.xml").checkEq(qualifier, "beta-5");
                new Here("Unit", 77).given(matcher, "103.xml").checkEq(qualifier, "beta_5");
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
            new Here("Unit", 100).given(matcher, "90.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "50.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "114.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "79.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "37.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "26.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "87.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "45.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "117.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "84.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "34.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "12.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "111.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "29.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "23.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "1.xml").checkTrue(group());
            new Here("Unit", 100).given(matcher, "100.xml").checkTrue(group());
            String majorString = matcher.group(2);
            new Here("Unit", 102).given(matcher, "46.xml").checkEq(majorString, "20");
            new Here("Unit", 102).given(matcher, "30.xml").checkEq(majorString, "1");
            new Here("Unit", 102).given(matcher, "24.xml").checkEq(majorString, "3");
            new Here("Unit", 102).given(matcher, "88.xml").checkEq(majorString, "020");
            new Here("Unit", 102).given(matcher, "38.xml").checkEq(majorString, "20");
            new Here("Unit", 102).given(matcher, "85.xml").checkEq(majorString, "20");
            new Here("Unit", 102).given(matcher, "27.xml").checkEq(majorString, "5");
            new Here("Unit", 102).given(matcher, "112.xml").checkEq(majorString, "999999999999");
            new Here("Unit", 102).given(matcher, "80.xml").checkEq(majorString, "20");
            new Here("Unit", 102).given(matcher, "115.xml").checkEq(majorString, "1");
            new Here("Unit", 102).given(matcher, "101.xml").checkEq(majorString, "2");
            new Here("Unit", 102).given(matcher, "13.xml").checkEq(majorString, "1");
            new Here("Unit", 102).given(matcher, "91.xml").checkEq(majorString, "20");
            new Here("Unit", 102).given(matcher, "51.xml").checkEq(majorString, "1");
            new Here("Unit", 102).given(matcher, "118.xml").checkEq(majorString, "2");
            new Here("Unit", 102).given(matcher, "35.xml").checkEq(majorString, "01");
            new Here("Unit", 102).given(matcher, "2.xml").checkEq(majorString, "1");
            String minorString = matcher.group(4);
            new Here("Unit", 103).given(matcher, "88.xml").checkEq(minorString, "04");
            new Here("Unit", 103).given(matcher, "27.xml").checkEq(minorString, "7");
            new Here("Unit", 103).given(matcher, "115.xml").checkEq(minorString, "0");
            new Here("Unit", 103).given(matcher, "91.xml").checkEq(minorString, "7");
            new Here("Unit", 103).given(matcher, "13.xml").checkEq(minorString, "2");
            new Here("Unit", 103).given(matcher, "80.xml").checkEq(minorString, null);
            new Here("Unit", 103).given(matcher, "112.xml").checkEq(minorString, "12345678");
            new Here("Unit", 103).given(matcher, "30.xml").checkEq(minorString, "9");
            new Here("Unit", 103).given(matcher, "38.xml").checkEq(minorString, "03");
            new Here("Unit", 103).given(matcher, "46.xml").checkEq(minorString, "4");
            new Here("Unit", 103).given(matcher, "118.xml").checkEq(minorString, "0");
            new Here("Unit", 103).given(matcher, "35.xml").checkEq(minorString, "9");
            new Here("Unit", 103).given(matcher, "51.xml").checkEq(minorString, "2");
            new Here("Unit", 103).given(matcher, "2.xml").checkEq(minorString, null);
            new Here("Unit", 103).given(matcher, "24.xml").checkEq(minorString, "2");
            new Here("Unit", 103).given(matcher, "85.xml").checkEq(minorString, "4");
            new Here("Unit", 103).given(matcher, "101.xml").checkEq(minorString, "3");
            String patchString = matcher.group(6);
            new Here("Unit", 104).given(matcher, "101.xml").checkEq(patchString, "4");
            new Here("Unit", 104).given(matcher, "51.xml").checkEq(patchString, "3");
            new Here("Unit", 104).given(matcher, "46.xml").checkEq(patchString, "06");
            new Here("Unit", 104).given(matcher, "35.xml").checkEq(patchString, "04");
            new Here("Unit", 104).given(matcher, "27.xml").checkEq(patchString, "1");
            new Here("Unit", 104).given(matcher, "13.xml").checkEq(patchString, null);
            new Here("Unit", 104).given(matcher, "115.xml").checkEq(patchString, "0");
            new Here("Unit", 104).given(matcher, "91.xml").checkEq(patchString, "12");
            new Here("Unit", 104).given(matcher, "2.xml").checkEq(patchString, null);
            new Here("Unit", 104).given(matcher, "24.xml").checkEq(patchString, null);
            new Here("Unit", 104).given(matcher, "38.xml").checkEq(patchString, "5");
            new Here("Unit", 104).given(matcher, "30.xml").checkEq(patchString, "04");
            new Here("Unit", 104).given(matcher, "112.xml").checkEq(patchString, "12");
            new Here("Unit", 104).given(matcher, "80.xml").checkEq(patchString, null);
            new Here("Unit", 104).given(matcher, "85.xml").checkEq(patchString, null);
            new Here("Unit", 104).given(matcher, "118.xml").checkEq(patchString, "17");
            new Here("Unit", 104).given(matcher, "88.xml").checkEq(patchString, null);
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
            new Here("Unit", 125).given(matcherDigits, "44.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "119.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "33.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "66.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "69.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "104.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "92.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "22.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "19.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "11.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "122.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "63.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "107.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "41.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "5.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "16.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "99.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "95.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "125.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "110.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "75.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "57.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "49.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "78.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "28.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "8.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "0.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "72.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "113.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "89.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "83.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "54.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "25.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "36.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "60.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "86.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "116.xml").checkTrue(group());
            new Here("Unit", 125).given(matcherDigits, "98.xml").checkFalse(group());
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
