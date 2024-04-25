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
import org.craftercms.core.exception.UrlTransformationException;
import org.craftercms.core.service.CachingOptions;
import org.craftercms.core.service.Context;
import org.craftercms.core.url.UrlTransformer;
import org.springframework.beans.factory.annotation.Required;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Class description goes HERE
 *
 * @author Alfonso Vásquez
 */
public class ReplaceSubstringUrlTransformer implements UrlTransformer {

    private static final Log logger = LogFactory.getLog(ReplacePatternAllUrlTransformer.class);

    protected String substringToReplace;

    protected String replacement;

    @Required
    public void setSubstringToReplace(String substringToReplace) {
        this.substringToReplace = substringToReplace;
    }

    @Required
    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    @Override
    public String transformUrl(Context context, CachingOptions cachingOptions, String url) throws UrlTransformationException {
        String result = url.replace(substringToReplace, replacement);
        itest("randoop", 51).given(substringToReplace, "Cache-Control").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371222568944854").given(url, "org.craftercms.core.exception.InvalidScopeException-v19371253845257058").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19371253845257058");
        itest("evosuite", 51).given(substringToReplace, "OlG5|5").given(replacement, "OlG5|5").given(url, "OlG5|5").checkEq(result, "OlG5|5");
        if (logger.isDebugEnabled()) {
            logger.debug("Transformation in: " + url + ", Transformation out: " + result);
        }
        return result;
    }
}
