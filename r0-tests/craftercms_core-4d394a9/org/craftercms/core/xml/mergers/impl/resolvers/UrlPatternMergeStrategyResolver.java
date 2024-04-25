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
package org.craftercms.core.xml.mergers.impl.resolvers;

import java.util.Map;
import org.craftercms.core.xml.mergers.DescriptorMergeStrategy;
import org.craftercms.core.xml.mergers.DescriptorMergeStrategyResolver;
import org.dom4j.Document;
import org.springframework.beans.factory.annotation.Required;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Resolves the {@link DescriptorMergeStrategy} to use for a given descriptor by matching the descriptor URL
 * to a pattern.
 *
 * @author Sumer Jabri
 * @author Alfonso Vásquez
 */
public class UrlPatternMergeStrategyResolver implements DescriptorMergeStrategyResolver {

    private Map<String, DescriptorMergeStrategy> urlPatternToStrategyMappings;

    @Required
    public void setUrlPatternToStrategyMappings(Map<String, DescriptorMergeStrategy> urlPatternToStrategyMappings) {
        this.urlPatternToStrategyMappings = urlPatternToStrategyMappings;
    }

    /**
     * Returns a {@link DescriptorMergeStrategy} for a given descriptor, picked by matching the descriptor URL to a
     * pattern associated to the strategy.
     *
     * @param descriptorUrl the URL that identifies the descriptor
     * @param descriptorDom the XML DOM of the descriptor
     * @return the {@link DescriptorMergeStrategy} for the descriptor, or null if the descriptor URL doesn't
     *         match any pattern.
     */
    public DescriptorMergeStrategy getStrategy(String descriptorUrl, Document descriptorDom) {
        for (Map.Entry<String, DescriptorMergeStrategy> entry : urlPatternToStrategyMappings.entrySet()) {
            if (descriptorUrl.matches(entry.getKey())) {
                itest("evosuite", 52).given(entry, "92.xml").given(descriptorUrl, "").checkTrue(group());
                itest("evosuite", 52).given(entry, "91.xml").given(descriptorUrl, "M \"mNp5d?M*#v'0aJ").checkFalse(group());
                itest("evosuite", 52).given(entry, "90.xml").given(descriptorUrl, "B`Fj\u0000a$;>T41WQ/").checkFalse(group());
                itest("dev", 52).given(entry, "10.xml").given(descriptorUrl, "/descriptor.strategy1.xml").checkTrue(group());
                itest("evosuite", 52).given(entry, "94.xml").given(descriptorUrl, " for ").checkFalse(group());
                itest("evosuite", 52).given(entry, "93.xml").given(descriptorUrl, "1\"JuV").checkTrue(group());
                itest("dev", 52).given(entry, "9.xml").given(descriptorUrl, "/descriptor.strategy2.xml").checkTrue(group());
                itest("evosuite", 52).given(entry, "89.xml").given(descriptorUrl, "pj?/yp/|1").checkFalse(group());
                itest("dev", 52).given(entry, "9.xml").given(descriptorUrl, "/descriptor.strategy1.xml").checkFalse(group());
                return entry.getValue();
            }
        }
        return null;
    }
}
