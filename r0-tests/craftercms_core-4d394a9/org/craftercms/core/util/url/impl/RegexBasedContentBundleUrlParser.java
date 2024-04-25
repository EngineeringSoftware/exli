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
package org.craftercms.core.util.url.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.craftercms.core.util.url.ContentBundleUrl;
import org.craftercms.core.util.url.ContentBundleUrlParser;
import org.springframework.beans.factory.annotation.Required;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * @author Alfonso Vásquez
 */
public class RegexBasedContentBundleUrlParser implements ContentBundleUrlParser {

    private int prefixGroup;

    private int baseNameAndExtensionTokenGroup;

    private int suffixGroup;

    private Pattern pattern;

    @Required
    public void setPrefixGroup(int prefixGroup) {
        this.prefixGroup = prefixGroup;
    }

    @Required
    public void setBaseNameAndExtensionTokenGroup(int baseNameAndExtensionTokenGroup) {
        this.baseNameAndExtensionTokenGroup = baseNameAndExtensionTokenGroup;
    }

    @Required
    public void setSuffixGroup(int suffixGroup) {
        this.suffixGroup = suffixGroup;
    }

    @Required
    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public ContentBundleUrl getContentBundleUrl(String rawUrl) {
        ContentBundleUrlImpl parsedUrl = new ContentBundleUrlImpl();
        Matcher matcher = pattern.matcher(rawUrl);
        if (matcher.matches()) {
            itest("evosuite", 61).given(matcher, "77.xml").checkFalse(group());
            itest("dev", 61).given(matcher, "12.xml").checkTrue(group());
            itest("dev", 61).given(matcher, "21.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "74.xml").checkFalse(group());
            itest("evosuite", 61).given(matcher, "87.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "85.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "83.xml").checkFalse(group());
            itest("evosuite", 61).given(matcher, "88.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "76.xml").checkFalse(group());
            itest("dev", 61).given(matcher, "22.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "84.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "64.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "75.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "86.xml").checkTrue(group());
            itest("evosuite", 61).given(matcher, "82.xml").checkFalse(group());
            try {
                parsedUrl.setPrefix(matcher.group(prefixGroup));
            } catch (IndexOutOfBoundsException e) {
            }
            try {
                parsedUrl.setBaseNameAndExtensionToken(matcher.group(baseNameAndExtensionTokenGroup));
            } catch (IndexOutOfBoundsException e) {
            }
            try {
                parsedUrl.setSuffix(matcher.group(suffixGroup));
            } catch (IndexOutOfBoundsException e) {
            }
        }
        return parsedUrl;
    }
}
