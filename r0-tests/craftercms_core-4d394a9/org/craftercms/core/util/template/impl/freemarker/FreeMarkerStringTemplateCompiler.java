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
package org.craftercms.core.util.template.impl.freemarker;

import freemarker.template.Configuration;
import org.craftercms.core.exception.TemplateException;
import org.craftercms.core.util.template.CompiledTemplate;
import org.craftercms.core.util.template.TemplateCompiler;
import org.craftercms.core.util.template.impl.IdentifiableStringTemplateSource;
import org.craftercms.core.util.template.impl.freemarker.ConcurrentStringTemplateLoader.StringTemplateSource;
import org.springframework.beans.factory.annotation.Required;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Class description goes HERE
 *
 * @author Alfonso Vásquez
 */
public class FreeMarkerStringTemplateCompiler implements TemplateCompiler<IdentifiableStringTemplateSource> {

    private Configuration templateConfiguration;

    private ConcurrentStringTemplateLoader templateLoader;

    public FreeMarkerStringTemplateCompiler() {
        templateLoader = new ConcurrentStringTemplateLoader();
        templateConfiguration = new Configuration(Configuration.VERSION_2_3_23);
        templateConfiguration.setTemplateLoader(templateLoader);
        // Don't wait to check whether a template was updated
        templateConfiguration.setTemplateUpdateDelayMilliseconds(0);
    }

    @Required
    public void setTemplateConfiguration(Configuration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    @Required
    public void setTemplateLoader(ConcurrentStringTemplateLoader templateLoader) {
        this.templateLoader = templateLoader;
    }

    public CompiledTemplate compile(IdentifiableStringTemplateSource templateSource) throws TemplateException {
        // Replace '/' with any other char because Freemarker messes up IDs with '/' because it thinks they're paths.
        String id = templateSource.getId().replace('/', ';');
        itest("randoop", 57).given(templateSource, "173.xml").checkEq(id, "text");
        itest("randoop", 57).given(templateSource, "157.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371304582952486");
        itest("evosuite", 57).given(templateSource, "52.xml").checkEq(id, "ZIF-wNf6");
        itest("evosuite", 57).given(templateSource, "48.xml").checkEq(id, "RdDiHJfD6 96&!");
        itest("randoop", 57).given(templateSource, "182.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371350787322095");
        itest("randoop", 57).given(templateSource, "144.xml").checkEq(id, "text");
        itest("randoop", 57).given(templateSource, "123.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371498613331010");
        itest("evosuite", 57).given(templateSource, "49.xml").checkEq(id, "ZIF-wNf6");
        itest("randoop", 57).given(templateSource, "208.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371516879257348");
        itest("evosuite", 57).given(templateSource, "46.xml").checkEq(id, "_lqTr:J>te4~&eZ'CS");
        itest("randoop", 57).given(templateSource, "112.xml").checkEq(id, "text");
        itest("evosuite", 57).given(templateSource, "51.xml").checkEq(id, "ZIF-wNf6");
        itest("evosuite", 57).given(templateSource, "47.xml").checkEq(id, "p");
        itest("randoop", 57).given(templateSource, "176.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19374717368726493");
        itest("randoop", 57).given(templateSource, "120.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371364448548501");
        itest("dev", 57).given(templateSource, "0.xml").checkEq(id, ";root;body@;folder;descriptor.xml");
        itest("randoop", 57).given(templateSource, "203.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19375020932015626");
        itest("evosuite", 57).given(templateSource, "53.xml").checkEq(id, "<ITEMS>");
        itest("randoop", 57).given(templateSource, "140.xml").checkEq(id, "hi_.0021");
        itest("randoop", 57).given(templateSource, "148.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371522840809477");
        itest("randoop", 57).given(templateSource, "113.xml").checkEq(id, "text");
        itest("randoop", 57).given(templateSource, "115.xml").checkEq(id, "");
        itest("randoop", 57).given(templateSource, "189.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371235381525157");
        itest("dev", 57).given(templateSource, "11.xml").checkEq(id, "template");
        itest("randoop", 57).given(templateSource, "201.xml").checkEq(id, "4cf386c6-46f8-423e-aa3f-0eae35fadb34");
        itest("randoop", 57).given(templateSource, "118.xml").checkEq(id, "contentStoreService.exists");
        itest("randoop", 57).given(templateSource, "188.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371283557176572");
        itest("randoop", 57).given(templateSource, "139.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371813662917550");
        itest("randoop", 57).given(templateSource, "180.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19371302598800142");
        itest("randoop", 57).given(templateSource, "199.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19372444775105584");
        itest("randoop", 57).given(templateSource, "122.xml").checkEq(id, "4cf386c6-46f8-423e-aa3f-0eae35fadb34");
        itest("randoop", 57).given(templateSource, "119.xml").checkEq(id, "4cf386c6-46f8-423e-aa3f-0eae35fadb34");
        itest("evosuite", 57).given(templateSource, "50.xml").checkEq(id, "ZIF-wNf6");
        itest("evosuite", 57).given(templateSource, "45.xml").checkEq(id, "\"$Z${");
        itest("randoop", 57).given(templateSource, "174.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19373726560815197");
        itest("randoop", 57).given(templateSource, "135.xml").checkEq(id, "org.craftercms.core.exception.InvalidScopeException-v19372042692759064");
        String source = templateSource.getSource();
        StringTemplateSource currentTemplateSource = (StringTemplateSource) templateLoader.findTemplateSource(id);
        if (currentTemplateSource == null || !currentTemplateSource.getSource().equals(source)) {
            templateLoader.putTemplateSource(id, source);
        }
        try {
            return new FreeMarkerCompiledTemplate(templateConfiguration.getTemplate(id));
        } catch (Exception e) {
            throw new TemplateException("Unable to compile Freemarker template:\n" + source, e);
        }
    }
}
