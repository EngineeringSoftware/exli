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
public class AddDebugParamUrlTransformer implements UrlTransformer {

    private static final Log logger = LogFactory.getLog(AddDebugParamUrlTransformer.class);

    public static final String DEFAULT_DEBUG_URL_PARAM = "debug";

    private String debugParam;

    public AddDebugParamUrlTransformer() {
        this.debugParam = DEFAULT_DEBUG_URL_PARAM;
    }

    public void setDebugParam(String debugParam) {
        this.debugParam = debugParam;
    }

    @Override
    public String transformUrl(Context context, CachingOptions cachingOptions, String url) {
        String result;
        int indexOfParamDelim = url.indexOf(UrlUtils.URL_PARAM_DELIM);
        itest("evosuite", 50).given(url, "").checkEq(indexOfParamDelim, -1);
        itest("evosuite", 50).given(url, "K?!Sx$lyx#[e~_\"").checkEq(indexOfParamDelim, 1);
        itest("evosuite", 50).given(url, "contentStoreAdapter.content").checkEq(indexOfParamDelim, -1);
        itest("dev", 50).given(url, "/index.html?param=value").checkEq(indexOfParamDelim, 11);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19371936231557089").checkEq(indexOfParamDelim, -1);
        itest("evosuite", 50).given(url, "?debug=true").checkEq(indexOfParamDelim, 0);
        itest("dev", 50).given(url, "/index.html").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19373307388702311").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19374527254516411").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19372076305411878").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19371288784257155?debug=true").checkEq(indexOfParamDelim, 70);
        itest("randoop", 50).given(url, "6dba0634-89af-4584-86ec-7e768749734d").checkEq(indexOfParamDelim, -1);
        itest("evosuite", 50).given(url, "4{uxSe^A=\"$B$s//").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "555b600c-14cc-43b0-853d-59e8c1eed076").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "TextMetaDataExtractingProcessor[metaDataNodesXPathQueries=[getCause, getNextException, getTargetException, getException, getSourceException, getRootCause, getCausedByException, getNested, getLinkedException, getNestedException, getLinkedCause, getThrowable]]").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19373375007287452").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19372198707664118").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19371227428849278").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19372356812301715").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19373289676140886").checkEq(indexOfParamDelim, -1);
        itest("evosuite", 50).given(url, "debug").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19374939690283013").checkEq(indexOfParamDelim, -1);
        itest("evosuite", 50).given(url, ": MaxBytesLocalOffHeap equal or greater than MaxBytesLocalDisk. This will result in useless disk storage.").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19375540340815962").checkEq(indexOfParamDelim, -1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19371288784257155").checkEq(indexOfParamDelim, -1);
        itest("evosuite", 50).given(url, "contentStoreAdapter.content?contentStoreAdapter.items=true").checkEq(indexOfParamDelim, 27);
        itest("evosuite", 50).given(url, "E?FH#jH").checkEq(indexOfParamDelim, 1);
        itest("randoop", 50).given(url, "org.craftercms.core.exception.InvalidScopeException-v19371350862618940").checkEq(indexOfParamDelim, -1);
        if (indexOfParamDelim < 0) {
            // The URL doesn't have a param delim, add it and tack on the debug flag
            result = url + UrlUtils.URL_PARAM_DELIM + debugParam + "=true";
        } else {
            // The URL does have a param delim, add param separator and tack on the debug flag
            result = url + UrlUtils.URL_PARAM_SEPARATOR + debugParam + "=true";
        }
        if (logger.isDebugEnabled()) {
            logger.debug("Transformation in: " + url + ", Transformation out: " + result);
        }
        return result;
    }
}
