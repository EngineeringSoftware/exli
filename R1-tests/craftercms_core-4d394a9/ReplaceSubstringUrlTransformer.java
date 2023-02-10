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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 51).given(substringToReplace, "/item").given(replacement, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>").given(url, "depth").checkEq(result, "depth");
        if (logger.isDebugEnabled()) {
            logger.debug("Transformation in: " + url + ", Transformation out: " + result);
        }
        return result;
    }
}
