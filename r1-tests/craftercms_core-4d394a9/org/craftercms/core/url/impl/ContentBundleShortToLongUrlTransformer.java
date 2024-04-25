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

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.craftercms.core.exception.UrlTransformationException;
import org.craftercms.core.service.CachingOptions;
import org.craftercms.core.service.Context;
import org.craftercms.core.util.url.ContentBundleUrl;
import org.craftercms.core.util.url.ContentBundleUrlParser;
import org.springframework.beans.factory.annotation.Required;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * This transformer is similar to {@link ShortToLongUrlTransformer}, but also looks in a content bundle for an
 * item name (long name) that can be mapped to the short name.
 * <p/>
 * See {@link org.craftercms.core.xml.mergers.impl.strategies.ContentBundleMergeStrategy} for more information
 * about content bundles.
 * <p/>
 * E.g., from the request <code>/main/website/groups/sport/base_fr_nhl/sport_page_one.xml</code> it looks in folders
 * in the following order <code>base_fr_nhl</code>, <code>base_fr</code> and <code>base</code>. Then suppose that
 * <code>sport_page_one.xml</code> exists only in <code>base</code> folder with name
 * <code>013_sport_page_one.xml</code>. So the transformation result will be
 * <code>/main/website/groups/007_sport/<b>base_fr_nhl</b>/013_sport_page_one.xml</code> (the original base is kept).
 *
 * @author Sumer Jabri
 * @author Alfonso Vásquez
 * @see org.craftercms.core.xml.mergers.impl.strategies.ContentBundleMergeStrategy
 */
public class ContentBundleShortToLongUrlTransformer extends ShortToLongUrlTransformer {

    private static final Log logger = LogFactory.getLog(ContentBundleShortToLongUrlTransformer.class);

    private ContentBundleUrlParser urlParser;

    private String baseDelimiter;

    @Required
    public void setUrlParser(ContentBundleUrlParser urlParser) {
        this.urlParser = urlParser;
    }

    @Required
    public void setBaseDelimiter(String baseDelimiter) {
        this.baseDelimiter = baseDelimiter;
    }

    @Override
    public String transformUrl(Context context, CachingOptions cachingOptions, String url) throws UrlTransformationException {
        String result = getLongUrlLookingInBundle(context, cachingOptions, url);
        if (logger.isDebugEnabled()) {
            logger.debug("Transformation in: " + url + ", Transformation out: " + result);
        }
        return result;
    }

    private String getLongUrlLookingInBundle(Context context, CachingOptions cachingOptions, String shortUrl) throws UrlTransformationException {
        ContentBundleUrl parsedUrl = urlParser.getContentBundleUrl(shortUrl);
        String prefix = parsedUrl.getPrefix();
        String originalBase = parsedUrl.getBaseNameAndExtensionToken();
        String suffix = parsedUrl.getSuffix();
        if (originalBase == null) {
            originalBase = "";
        }
        if (suffix == null) {
            suffix = "";
        }
        String base = originalBase;
        int delimiterIdx;
        do {
            String currentShortUrl = prefix + base + suffix;
            String longUrl = getLongUrl(context, cachingOptions, currentShortUrl, false);
            if (StringUtils.isNotEmpty(longUrl)) {
                if (!originalBase.equals(base)) {
                    // Put original base back in long URL.
                    longUrl = longUrl.replace(base, originalBase);
                    itest("dev", 97).given(originalBase, "base_fr_es").given(longUrl, "/001_folder/base/002_index.html/").given(base, "base").checkEq(longUrl, "/001_folder/base_fr_es/002_index.html/");
                }
                return longUrl;
            }
            delimiterIdx = base.lastIndexOf(baseDelimiter);
            if (delimiterIdx > 0) {
                base = base.substring(0, delimiterIdx);
                itest("dev", 105).given(delimiterIdx, 7).given(base, "base_fr_es").checkEq(base, "base_fr");
            }
        } while (delimiterIdx >= 0);
        // come here if URL is not found in content store
        throw new UrlTransformationException("Unable to map the short url '" + shortUrl + "' to a long url");
    }
}
