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
            new Here("Unit", 60).given(matcher, "47.xml").checkTrue(group());
            String buildNumber = matcher.group(4);
            new Here("Unit", 62).given(matcher, "7.xml").checkEq(buildNumber, "23");
            String qualifier = matcher.group(5);
            new Here("Unit", 63).given(matcher, "10.xml").checkEq(qualifier, ".heger");
            if (buildNumber != null) {
                setBuildNumber(Long.parseLong(buildNumber));
            }
            if (matcher.group(7) != null) {
                new Here("Unit", 70).given(matcher, "48.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "4.xml").checkFalse(group());
                qualifier = matcher.group(7);
                new Here("Unit", 72).given(matcher, "48.xml").checkEq(qualifier, "0-SNAPSHOT");
            }
            // Starting with "-"
            if (matcher.group(9) != null) {
                new Here("Unit", 75).given(matcher, "53.xml").checkTrue(group());
                new Here("Unit", 75).given(matcher, "4.xml").checkFalse(group());
                qualifier = matcher.group(9);
                new Here("Unit", 77).given(matcher, "53.xml").checkEq(qualifier, "SNAPSHOT");
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
            new Here("Unit", 100).given(matcher, "12.xml").checkTrue(group());
            String majorString = matcher.group(2);
            new Here("Unit", 102).given(matcher, "13.xml").checkEq(majorString, "1");
            String minorString = matcher.group(4);
            new Here("Unit", 103).given(matcher, "13.xml").checkEq(minorString, "2");
            String patchString = matcher.group(6);
            new Here("Unit", 104).given(matcher, "27.xml").checkEq(patchString, "1");
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
            new Here("Unit", 125).given(matcherDigits, "8.xml").checkTrue(group());
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
