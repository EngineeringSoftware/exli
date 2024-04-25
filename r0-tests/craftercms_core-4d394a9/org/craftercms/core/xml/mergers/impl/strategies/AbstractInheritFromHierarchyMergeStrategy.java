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
package org.craftercms.core.xml.mergers.impl.strategies;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.craftercms.core.exception.XmlMergeException;
import org.craftercms.core.service.CachingOptions;
import org.craftercms.core.service.Context;
import org.craftercms.core.util.ContentStoreUtils;
import org.craftercms.core.xml.mergers.DescriptorMergeStrategy;
import org.craftercms.core.xml.mergers.MergeableDescriptor;
import org.dom4j.Document;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Abstract {@link org.craftercms.core.xml.mergers.DescriptorMergeStrategy} that defines the base code for strategies
 * that decide which descriptors to "inherit" from upper levels in the folder hierarchy.
 *
 * @author Sumer Jabri
 * @author Alfonso Vásquez
 */
public abstract class AbstractInheritFromHierarchyMergeStrategy implements DescriptorMergeStrategy {

    protected String[] baseFolders;

    public void setBaseFolders(String[] baseFolders) {
        for (int i = 0; i < baseFolders.length; i++) {
            baseFolders[i] = ContentStoreUtils.normalizePath(baseFolders[i]);
        }
        this.baseFolders = baseFolders;
    }

    @Override
    public List<MergeableDescriptor> getDescriptors(Context context, CachingOptions cachingOptions, String mainDescriptorUrl, Document mainDescriptorDom) throws XmlMergeException {
        return getDescriptors(context, cachingOptions, mainDescriptorUrl, mainDescriptorDom, false);
    }

    @Override
    public List<MergeableDescriptor> getDescriptors(Context context, CachingOptions cachingOptions, String mainDescriptorUrl, Document mainDescriptorDom, boolean mainDescriptorOptional) throws XmlMergeException {
        List<MergeableDescriptor> descriptors = new ArrayList<>();
        int k;
        if (ArrayUtils.isNotEmpty(baseFolders)) {
            // If base folders are specified, start looking for descriptors after the base folders.
            k = getIndexAfterBaseFolder(mainDescriptorUrl);
        } else {
            // If the url is absolute (starts with '/'), the descriptors included will start from root (i.e. if url is
            // /folder/file.xml, first ones will start at '/'). If it's relative (doesn't start with '/), the descriptors
            // included start from the first folder in the url (i.e., if url is folder/file.xml, first ones will start at
            // folder/).
            k = mainDescriptorUrl.indexOf('/');
            itest("evosuite", 72).given(mainDescriptorUrl, "Svq2/x1w eNg").checkEq(k, 4);
            itest("evosuite", 72).given(mainDescriptorUrl, "//#!hs<r-|Eb5`1Uy>J\"").checkEq(k, 0);
            itest("evosuite", 72).given(mainDescriptorUrl, "-G:5/%.").checkEq(k, 4);
            itest("dev", 72).given(mainDescriptorUrl, "/bundle.meta.xml").checkEq(k, 0);
            itest("evosuite", 72).given(mainDescriptorUrl, "=2T#%J9K").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19371915061456075").checkEq(k, -1);
            itest("evosuite", 72).given(mainDescriptorUrl, "_(1W\"wo!9W~Q9").checkEq(k, -1);
            itest("evosuite", 72).given(mainDescriptorUrl, "contentStoreAdapter.item").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19371223741328480").checkEq(k, -1);
            itest("evosuite", 72).given(mainDescriptorUrl, ";z!1]az").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "_.002fcache").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19371719244840771").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "debug").checkEq(k, -1);
            itest("dev", 72).given(mainDescriptorUrl, "/folder/sub-folder/descriptor.xml").checkEq(k, 0);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19372915750877577").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19371222910843311").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19371275176327285").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "").checkEq(k, -1);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19371222568944854").checkEq(k, -1);
            itest("dev", 72).given(mainDescriptorUrl, "content_fr/descriptor.xml").checkEq(k, 10);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19371217492978170").checkEq(k, -1);
            itest("evosuite", 72).given(mainDescriptorUrl, "").checkEq(k, -1);
            itest("dev", 72).given(mainDescriptorUrl, "content_fr_es/descriptor.xml").checkEq(k, 13);
            itest("dev", 72).given(mainDescriptorUrl, "/bundle/content/descriptor.xml").checkEq(k, 0);
            itest("randoop", 72).given(mainDescriptorUrl, "org.craftercms.core.exception.InvalidScopeException-v19371282134494767").checkEq(k, -1);
            itest("evosuite", 72).given(mainDescriptorUrl, "/0q,Bk(KB").checkEq(k, 0);
            itest("dev", 72).given(mainDescriptorUrl, "/craftercms_logo.meta.xml").checkEq(k, 0);
            itest("evosuite", 72).given(mainDescriptorUrl, "Z/IR^eF8}E;[GiM").checkEq(k, 1);
        }
        while (k >= 0) {
            String folder = mainDescriptorUrl.substring(0, k);
            itest("dev", 76).given(mainDescriptorUrl, "content_fr_es/descriptor.xml").given(k, 13).checkEq(folder, "content_fr_es");
            itest("evosuite", 76).given(mainDescriptorUrl, "//#!hs<r-|Eb5`1Uy>J\"").given(k, 0).checkEq(folder, "");
            itest("dev", 76).given(mainDescriptorUrl, "/bundle/content/descriptor.xml").given(k, 15).checkEq(folder, "/bundle/content");
            itest("evosuite", 76).given(mainDescriptorUrl, "Svq2/x1w eNg").given(k, 4).checkEq(folder, "Svq2");
            itest("dev", 76).given(mainDescriptorUrl, "/folder/sub-folder/descriptor.xml").given(k, 18).checkEq(folder, "/folder/sub-folder");
            itest("dev", 76).given(mainDescriptorUrl, "/folder/sub-folder/descriptor.xml").given(k, 0).checkEq(folder, "");
            itest("evosuite", 76).given(mainDescriptorUrl, "Z/IR^eF8}E;[GiM").given(k, 1).checkEq(folder, "Z");
            itest("evosuite", 76).given(mainDescriptorUrl, "/").given(k, 1).checkEq(folder, "/");
            itest("dev", 76).given(mainDescriptorUrl, "content_fr/descriptor.xml").given(k, 10).checkEq(folder, "content_fr");
            itest("evosuite", 76).given(mainDescriptorUrl, "/0q,Bk(KB").given(k, 0).checkEq(folder, "");
            itest("dev", 76).given(mainDescriptorUrl, "/bundle.meta.xml").given(k, 0).checkEq(folder, "");
            itest("evosuite", 76).given(mainDescriptorUrl, "/bU7").given(k, 1).checkEq(folder, "/");
            itest("dev", 76).given(mainDescriptorUrl, "/bundle/content/descriptor.xml").given(k, 0).checkEq(folder, "");
            itest("dev", 76).given(mainDescriptorUrl, "/craftercms_logo.meta.xml").given(k, 0).checkEq(folder, "");
            itest("dev", 76).given(mainDescriptorUrl, "/bundle/content/descriptor.xml").given(k, 7).checkEq(folder, "/bundle");
            itest("dev", 76).given(mainDescriptorUrl, "/folder/sub-folder/descriptor.xml").given(k, 7).checkEq(folder, "/folder");
            itest("evosuite", 76).given(mainDescriptorUrl, "-G:5/%.").given(k, 4).checkEq(folder, "-G:5");
            addInheritedDescriptorsInFolder(context, cachingOptions, descriptors, folder, mainDescriptorUrl, mainDescriptorDom);
            k = mainDescriptorUrl.indexOf('/', ++k);
            itest("evosuite", 81).given(mainDescriptorUrl, "/").given(k, 1).checkEq(k, -1);
            itest("dev", 81).given(mainDescriptorUrl, "/craftercms_logo.meta.xml").given(k, 0).checkEq(k, -1);
            itest("dev", 81).given(mainDescriptorUrl, "content_fr_es/descriptor.xml").given(k, 13).checkEq(k, -1);
            itest("dev", 81).given(mainDescriptorUrl, "content_fr/descriptor.xml").given(k, 10).checkEq(k, -1);
            itest("evosuite", 81).given(mainDescriptorUrl, "/0q,Bk(KB").given(k, 0).checkEq(k, -1);
            itest("evosuite", 81).given(mainDescriptorUrl, "Svq2/x1w eNg").given(k, 4).checkEq(k, -1);
            itest("dev", 81).given(mainDescriptorUrl, "/folder/sub-folder/descriptor.xml").given(k, 7).checkEq(k, 18);
            itest("dev", 81).given(mainDescriptorUrl, "/folder/sub-folder/descriptor.xml").given(k, 18).checkEq(k, -1);
            itest("dev", 81).given(mainDescriptorUrl, "/bundle.meta.xml").given(k, 0).checkEq(k, -1);
            itest("evosuite", 81).given(mainDescriptorUrl, "Z/IR^eF8}E;[GiM").given(k, 1).checkEq(k, -1);
            itest("dev", 81).given(mainDescriptorUrl, "/folder/sub-folder/descriptor.xml").given(k, 0).checkEq(k, 7);
            itest("dev", 81).given(mainDescriptorUrl, "/bundle/content/descriptor.xml").given(k, 0).checkEq(k, 7);
            itest("dev", 81).given(mainDescriptorUrl, "/bundle/content/descriptor.xml").given(k, 15).checkEq(k, -1);
            itest("dev", 81).given(mainDescriptorUrl, "/bundle/content/descriptor.xml").given(k, 7).checkEq(k, 15);
            itest("evosuite", 81).given(mainDescriptorUrl, "/bU7").given(k, 1).checkEq(k, -1);
        }
        descriptors.add(new MergeableDescriptor(mainDescriptorUrl, mainDescriptorOptional));
        return descriptors;
    }

    protected int getIndexAfterBaseFolder(String url) {
        for (String baseFolder : baseFolders) {
            if (url.startsWith(baseFolder)) {
                return baseFolder.length();
            }
        }
        return -1;
    }

    protected abstract void addInheritedDescriptorsInFolder(Context context, CachingOptions cachingOptions, List<MergeableDescriptor> inheritedDescriptors, String folder, String mainDescriptorUrl, Document mainDescriptorDom);
}
