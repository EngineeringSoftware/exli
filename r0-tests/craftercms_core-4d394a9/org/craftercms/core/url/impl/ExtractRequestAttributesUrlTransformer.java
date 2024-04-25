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

import java.util.Map;
import org.craftercms.commons.http.RequestContext;
import org.craftercms.core.exception.UrlTransformationException;
import org.craftercms.core.service.CachingOptions;
import org.craftercms.core.service.Context;
import org.craftercms.core.url.UrlTransformer;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.util.UriTemplate;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Extracts a request attribute from the URL, and finally removes it from the URL. E.g.: with a URI template like
 * /site/website/{event}/details/index.xml and a url like /site/website/1/details/index.xml, the resulting url will be
 * /site/website/details/index.xml, with request attribute event = 1.
 *
 * @author Praveen Elineni
 * @author Alfonso Vásquez
 */
public class ExtractRequestAttributesUrlTransformer implements UrlTransformer {

    private UriTemplate uriTemplate;

    @Required
    public void setUriTemplate(String uriTemplate) {
        this.uriTemplate = new UriTemplate(uriTemplate);
    }

    @Override
    public String transformUrl(Context context, CachingOptions cachingOptions, String url) throws UrlTransformationException {
        if (uriTemplate.matches(url)) {
            itest("evosuite", 48).given(uriTemplate, "72.xml").given(url, "DLz`@${42eC`").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "71.xml").given(url, ",m6+nvW").checkFalse(group());
            itest("dev", 48).given(uriTemplate, "20.xml").given(url, "/site/website/hotels/1/bookings/42/index.xml").checkTrue(group());
            itest("evosuite", 48).given(uriTemplate, "70.xml").given(url, "").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "185.xml").given(url, "org.craftercms.core.exception.InvalidScopeException-v19371832908705083").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "71.xml").given(url, "NodeCoherent").checkTrue(group());
            itest("randoop", 48).given(uriTemplate, "127.xml").given(url, "org.craftercms.core.exception.InvalidScopeException-v19372427606650628").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "66.xml").given(url, "=y*-@Tv^<ZBM-uU").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "133.xml").given(url, "org.craftercms.core.exception.InvalidScopeException-v19371947650231722").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "71.xml").given(url, "UTF-8").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "172.xml").given(url, "org.craftercms.core.exception.InvalidScopeException-v19372038107241196").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "73.xml").given(url, "The CacheManager shutdown hook is enabled because {} is set to true.").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "184.xml").given(url, "org.craftercms.core.exception.InvalidScopeException-v19374143520459135").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "73.xml").given(url, null).checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "133.xml").given(url, "TaggingByFieldValueProcessor{sourceField='null', newField='null', defaultValue='org.craftercms.core.exception.InvalidScopeException-v19371242295644522', valueMapping=null}").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "65.xml").given(url, ";}(2K\"y0").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "65.xml").given(url, "=y*-@Tv^<ZBM-uU").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "206.xml").given(url, "org.craftercms.core.exception.InvalidScopeException-v19374548285386154").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "150.xml").given(url, "[/hi!, /urlTransformationEngine.transformedUrl, /contentStoreService.children]").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "73.xml").given(url, "UTF-8").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "68.xml").given(url, "?6V@sU").checkTrue(group());
            itest("evosuite", 48).given(uriTemplate, "71.xml").given(url, "/").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "127.xml").given(url, "message").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "69.xml").given(url, "/").checkTrue(group());
            itest("randoop", 48).given(uriTemplate, "187.xml").given(url, "org.craftercms.core.exception.InvalidScopeException-v19372003198563564").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "67.xml").given(url, "9>oA").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "202.xml").given(url, "org.craftercms.core.exception.InvalidScopeException-v19374636915232151").checkFalse(group());
            itest("randoop", 48).given(uriTemplate, "151.xml").given(url, "").checkFalse(group());
            itest("evosuite", 48).given(uriTemplate, "69.xml").given(url, "{[^{}]+}").checkTrue(group());
            Map<String, String> variables = uriTemplate.match(url);
            for (Map.Entry<String, String> entry : variables.entrySet()) {
                RequestContext.getCurrent().getRequest().setAttribute(entry.getKey(), entry.getValue());
            }
            url = uriTemplate.toString().replaceAll("\\{[^{}]+\\}", "");
            url = url.replace("//", "/");
            itest("evosuite", 55).given(url, "?6V@sU").checkEq(url, "?6V@sU");
            itest("evosuite", 55).given(url, "NodeCoherent").checkEq(url, "NodeCoherent");
            itest("dev", 55).given(url, "/site/website/hotels//bookings//index.xml").checkEq(url, "/site/website/hotels/bookings/index.xml");
        }
        return url;
    }
}
