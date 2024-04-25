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
        itest("randoop", 51).given(substringToReplace, "org.craftercms.core.exception.InvalidScopeException").given(replacement, "").given(url, "org.craftercms.core.exception.InvalidScopeException-v19376783867544267").checkEq(result, "-v19376783867544267");
        itest("randoop", 51).given(substringToReplace, "org.craftercms.core.exception.InvalidScopeException-v19372138147302388").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371222568944854").given(url, "org.craftercms.core.exception.InvalidScopeException-v19374735646099817").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19374735646099817");
        itest("randoop", 51).given(substringToReplace, "TaggingByPathProcessor{newField='org.craftercms.core.exception.InvalidScopeException-v19371217087872652', pathMapping=null}").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371292659738453").given(url, "org.craftercms.core.exception.InvalidScopeException-v19371331705282407").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19371331705282407");
        itest("randoop", 51).given(substringToReplace, "org.craftercms.core.exception.InvalidScopeException-v19371253842241454").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19373730509928060").given(url, "").checkEq(result, "");
        itest("evosuite", 51).given(substringToReplace, "").given(replacement, "").given(url, "").checkEq(result, "");
        itest("randoop", 51).given(substringToReplace, "Cache-Control").given(replacement, "").given(url, "org.craftercms.core.exception.InvalidScopeException-v19371975407372913").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19371975407372913");
        itest("randoop", 51).given(substringToReplace, "Cache-Control").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371550470118790").given(url, "org.craftercms.core.exception.InvalidScopeException-v19372775862597035").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19372775862597035");
        itest("randoop", 51).given(substringToReplace, "org.craftercms.core.exception.InvalidScopeException-v19371407761316582").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19373663868805356").given(url, "org.craftercms.core.exception.InvalidScopeException-v19372450207378984").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19372450207378984");
        itest("randoop", 51).given(substringToReplace, "Cache-Control").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371222568944854").given(url, "org.craftercms.core.exception.InvalidScopeException-v19371276328085085").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19371276328085085");
        itest("randoop", 51).given(substringToReplace, "TaggingByPathProcessor{newField='org.craftercms.core.exception.InvalidScopeException-v19371217087872652', pathMapping=null}").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19372933570435479").given(url, "org.craftercms.core.exception.InvalidScopeException-v19372208289071892").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19372208289071892");
        itest("randoop", 51).given(substringToReplace, "org.craftercms.core.exception.InvalidScopeException-v19372165875807781").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371248461893426").given(url, "org.craftercms.core.exception.InvalidScopeException-v19372392914739632").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19372392914739632");
        itest("randoop", 51).given(substringToReplace, "org.craftercms.core.exception.InvalidScopeException-v19371422868816828").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371292659738453").given(url, "").checkEq(result, "");
        itest("evosuite", 51).given(substringToReplace, "").given(replacement, "").given(url, "gMP").checkEq(result, "gMP");
        itest("randoop", 51).given(substringToReplace, "Cache-Control").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371550470118790").given(url, "").checkEq(result, "");
        itest("randoop", 51).given(substringToReplace, "org.craftercms.core.exception.InvalidScopeException-v19371407761316582").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19373663868805356").given(url, "org.craftercms.core.exception.InvalidScopeException-v19376284605442932").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19376284605442932");
        itest("randoop", 51).given(substringToReplace, "Tree[name='null', url='null', descriptorUrl='org.craftercms.core.exception.InvalidScopeException-v19372165877512333', properties=null, children=null]").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371713071458139").given(url, "org.craftercms.core.exception.InvalidScopeException-v19375633977255213").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19375633977255213");
        itest("randoop", 51).given(substringToReplace, "org.craftercms.core.exception.InvalidScopeException-v19371253842241454").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371248461893426").given(url, "contentStoreService.tree").checkEq(result, "contentStoreService.tree");
        itest("randoop", 51).given(substringToReplace, "Cache-Control").given(replacement, "org.craftercms.core.exception.InvalidScopeException-v19371222568944854").given(url, "org.craftercms.core.exception.InvalidScopeException-v19371253845257058").checkEq(result, "org.craftercms.core.exception.InvalidScopeException-v19371253845257058");
        itest("evosuite", 51).given(substringToReplace, "$tM%Fs[7:_iZ").given(replacement, "contentStoreAdapter.item").given(url, "contentStoreAdapter.items").checkEq(result, "contentStoreAdapter.items");
        itest("evosuite", 51).given(substringToReplace, "OlG5|5").given(replacement, "OlG5|5").given(url, "OlG5|5").checkEq(result, "OlG5|5");
        if (logger.isDebugEnabled()) {
            logger.debug("Transformation in: " + url + ", Transformation out: " + result);
        }
        return result;
    }
}
