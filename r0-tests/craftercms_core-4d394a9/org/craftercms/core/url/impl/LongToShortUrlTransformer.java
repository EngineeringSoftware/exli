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
package org.craftercms.core.url.impl;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.craftercms.core.service.CachingOptions;
import org.craftercms.core.service.Context;
import org.craftercms.core.url.UrlTransformer;
import org.craftercms.core.util.UrlUtils;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Class description goes HERE
 *
 * @author Sumer Jabri
 * @author Alfonso Vásquez
 */
public class LongToShortUrlTransformer implements UrlTransformer {

    private static final Log logger = LogFactory.getLog(LongToShortUrlTransformer.class);

    public static final String URL_NUMBERED_NAME_REGEX = "\\b\\d*_(.+)\\b";

    public static final int URL_NUMBERED_NAME_REGEX_SHORT_NAME_GROUP = 1;

    private String containsShortNameRegex;

    private int shortNameRegexGroup;

    public LongToShortUrlTransformer() {
        containsShortNameRegex = URL_NUMBERED_NAME_REGEX;
        shortNameRegexGroup = URL_NUMBERED_NAME_REGEX_SHORT_NAME_GROUP;
    }

    public void setContainsShortNameRegex(String containsShortNameRegex) {
        this.containsShortNameRegex = containsShortNameRegex;
    }

    public void setShortNameRegexGroup(int shortNameRegexGroup) {
        this.shortNameRegexGroup = shortNameRegexGroup;
    }

    protected String getShortUrl(String longUrl) {
        String[] levels = StringUtils.strip(longUrl, "/").split("/");
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371837689944385").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371837689944385" });
        itest("evosuite", 57).given(longUrl, "").checkEq(levels, new String[] { "" });
        itest("evosuite", 57).given(longUrl, "Q,0").checkEq(levels, new String[] { "Q,0" });
        itest("evosuite", 57).given(longUrl, "/The magic number cannot be null").checkEq(levels, new String[] { "The magic number cannot be null" });
        itest("evosuite", 57).given(longUrl, "=y*-@Tv^<ZBM-uU").checkEq(levels, new String[] { "=y*-@Tv^<ZBM-uU" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19373227520712384").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19373227520712384" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371555165832454").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371555165832454" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371668772887376").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371668772887376" });
        itest("evosuite", 57).given(longUrl, "/G-C}V").checkEq(levels, new String[] { "G-C}V" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371343602391436").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371343602391436" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371720495682730").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371720495682730" });
        itest("randoop", 57).given(longUrl, "92662962-b903-4130-bb2a-93e8f6fd9e0d").checkEq(levels, new String[] { "92662962-b903-4130-bb2a-93e8f6fd9e0d" });
        itest("evosuite", 57).given(longUrl, "/contentStoreAdapter.content").checkEq(levels, new String[] { "contentStoreAdapter.content" });
        itest("evosuite", 57).given(longUrl, ".Q,0").checkEq(levels, new String[] { ".Q,0" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19375329145933164").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19375329145933164" });
        itest("evosuite", 57).given(longUrl, "contentStoreAdapter.content").checkEq(levels, new String[] { "contentStoreAdapter.content" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371633402958202").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371633402958202" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19372281565602612").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19372281565602612" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371445846059408").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371445846059408" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371659382849139").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371659382849139" });
        itest("evosuite", 57).given(longUrl, "/.57~h,/").checkEq(levels, new String[] { ".57~h," });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19374667680559784").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19374667680559784" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371356143902022").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371356143902022" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19373935634704852").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19373935634704852" });
        itest("dev", 57).given(longUrl, "/001_folder/002_subfolder/003_index.html/").checkEq(levels, new String[] { "001_folder", "002_subfolder", "003_index.html" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19374483360446332").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19374483360446332" });
        itest("evosuite", 57).given(longUrl, "G-C}V").checkEq(levels, new String[] { "G-C}V" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19380733394774390").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19380733394774390" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19373195525154671").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19373195525154671" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19380582621011778").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19380582621011778" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371648583571965").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371648583571965" });
        itest("randoop", 57).given(longUrl, "bac94272-48e8-4586-8219-c39976bdcbad").checkEq(levels, new String[] { "bac94272-48e8-4586-8219-c39976bdcbad" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371936183917781").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371936183917781" });
        itest("evosuite", 57).given(longUrl, "\bd*_(.+)\b").checkEq(levels, new String[] { "\bd*_(.+)\b" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19374199372170055").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19374199372170055" });
        itest("evosuite", 57).given(longUrl, "The magic number cannot be null").checkEq(levels, new String[] { "The magic number cannot be null" });
        itest("randoop", 57).given(longUrl, "").checkEq(levels, new String[] { "" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19372419384109107").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19372419384109107" });
        itest("evosuite", 57).given(longUrl, "KTH%VO''ZjMIP$3/").checkEq(levels, new String[] { "KTH%VO''ZjMIP$3" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371636044440805").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371636044440805" });
        itest("randoop", 57).given(longUrl, "org.craftercms.core.exception.InvalidScopeException-v19371552907366510").checkEq(levels, new String[] { "org.craftercms.core.exception.InvalidScopeException-v19371552907366510" });
        itest("evosuite", 57).given(longUrl, "~c7Q&").checkEq(levels, new String[] { "~c7Q&" });
        StringBuilder result = new StringBuilder();
        if (ArrayUtils.isNotEmpty(levels)) {
            for (String level : levels) {
                result.append("/").append(UrlUtils.getShortName(level, containsShortNameRegex, shortNameRegexGroup));
            }
        }
        if (longUrl.endsWith("/")) {
            result.append("/");
        }
        return result.toString();
    }

    public String transformUrl(Context context, CachingOptions cachingOptions, String url) {
        String result = getShortUrl(url);
        if (logger.isDebugEnabled()) {
            logger.debug("Transformation in: " + url + ", Transformation out: " + result);
        }
        return result;
    }
}
