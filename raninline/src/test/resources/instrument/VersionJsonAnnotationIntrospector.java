/*
 * This file is part of CycloneDX Core (Java).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) OWASP Foundation. All Rights Reserved.
 */
package org.cyclonedx.util;

import java.util.Arrays;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import org.cyclonedx.model.VersionFilter;
import org.cyclonedx.model.XmlOnly;

public class VersionJsonAnnotationIntrospector extends JacksonAnnotationIntrospector {

    private final String version;

    public VersionJsonAnnotationIntrospector(final String version) {
        this.version = version;
    }

    @Override
    public boolean hasIgnoreMarker(final AnnotatedMember m) {
        if (m.hasAnnotation(VersionFilter.class)) {
            try {
                VersionFilter filter = m.getAnnotation(VersionFilter.class);
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-if-start", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/VersionJsonAnnotationIntrospector.java", 39, null, null, VersionJsonAnnotationIntrospector.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/VersionJsonAnnotationIntrospector.java", 39, filter, "filter", VersionJsonAnnotationIntrospector.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-before", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/VersionJsonAnnotationIntrospector.java", 39, version, "version", VersionJsonAnnotationIntrospector.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                if (Arrays.stream(filter.versions()).noneMatch(v -> v.equals(version))) {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/VersionJsonAnnotationIntrospector.java", 39, null, null, VersionJsonAnnotationIntrospector.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                    return true;
                } else {
                    org.raninline.InstrumentHelper.logVariableAndGenerateTest("target-statement-not-executed", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/VersionJsonAnnotationIntrospector.java", 39, null, null, VersionJsonAnnotationIntrospector.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
                }
            } finally {
                org.raninline.InstrumentHelper.logVariableAndGenerateTest("check-coverage", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "/home/user/projects/inlinegen-research/java/raninline/target/raninline.txt", "src/test/resources/instrument/VersionJsonAnnotationIntrospector.java", 39, null, null, VersionJsonAnnotationIntrospector.class, "/home/user/projects/inlinegen-research/java/raninline/target/test-classes/instrument");
            }
        } else {
        }
        if (m.hasAnnotation(XmlOnly.class)) {
            return true;
        } else {
        }
        return super.hasIgnoreMarker(m);
    }
}
