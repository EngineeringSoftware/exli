package org.codehaus.mojo.properties;

import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
class ExpansionBuffer {

    private final StringBuilder resolved = new StringBuilder();

    private String unresolved;

    public ExpansionBuffer(String unresolved) {
        this.unresolved = unresolved != null ? unresolved : "";
    }

    public boolean hasMoreLegalPlaceholders() {
        int prefixPos = unresolved.indexOf("${");
        new Here("Unit", 35).given(unresolved, "${p7}").checkEq(prefixPos, 0);
        new Here("Unit", 35).given(unresolved, "value1").checkEq(prefixPos, -1);
        new Here("Unit", 35).given(unresolved, "value").checkEq(prefixPos, -1);
        new Here("Unit", 35).given(unresolved, "${malformed").checkEq(prefixPos, 0);
        new Here("Unit", 35).given(unresolved, "system.value").checkEq(prefixPos, -1);
        new Here("Unit", 35).given(unresolved, "http://${hostname}:${port}/").checkEq(prefixPos, 7);
        new Here("Unit", 35).given(unresolved, "8080/").checkEq(prefixPos, -1);
        new Here("Unit", 35).given(unresolved, "${unknown}").checkEq(prefixPos, 0);
        new Here("Unit", 35).given(unresolved, "${p6}").checkEq(prefixPos, 0);
        new Here("Unit", 35).given(unresolved, "env.value").checkEq(prefixPos, -1);
        new Here("Unit", 35).given(unresolved, "${system.property}").checkEq(prefixPos, 0);
        new Here("Unit", 35).given(unresolved, "${p5}").checkEq(prefixPos, 0);
        new Here("Unit", 35).given(unresolved, "value3").checkEq(prefixPos, -1);
        new Here("Unit", 35).given(unresolved, "${env.PROPERTY}").checkEq(prefixPos, 0);
        new Here("Unit", 35).given(unresolved, "").checkEq(prefixPos, -1);
        new Here("Unit", 35).given(unresolved, "${p2}").checkEq(prefixPos, 0);
        new Here("Unit", 35).given(unresolved, "localhost:${port}/").checkEq(prefixPos, 10);
        new Here("Unit", 35).given(unresolved, "value2").checkEq(prefixPos, -1);
        int suffixPos = unresolved.indexOf("}", prefixPos + 2);
        new Here("Unit", 36).given(unresolved, "value2").given(prefixPos, -1).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "${malformed").given(prefixPos, 0).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "${unknown}").given(prefixPos, 0).checkEq(suffixPos, 9);
        new Here("Unit", 36).given(unresolved, "${p5}").given(prefixPos, 0).checkEq(suffixPos, 4);
        new Here("Unit", 36).given(unresolved, "http://${hostname}:${port}/").given(prefixPos, 7).checkEq(suffixPos, 17);
        new Here("Unit", 36).given(unresolved, "${p6}").given(prefixPos, 0).checkEq(suffixPos, 4);
        new Here("Unit", 36).given(unresolved, "system.value").given(prefixPos, -1).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "${p7}").given(prefixPos, 0).checkEq(suffixPos, 4);
        new Here("Unit", 36).given(unresolved, "value3").given(prefixPos, -1).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "${system.property}").given(prefixPos, 0).checkEq(suffixPos, 17);
        new Here("Unit", 36).given(unresolved, "8080/").given(prefixPos, -1).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "").given(prefixPos, -1).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "env.value").given(prefixPos, -1).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "value").given(prefixPos, -1).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "${p2}").given(prefixPos, 0).checkEq(suffixPos, 4);
        new Here("Unit", 36).given(unresolved, "value1").given(prefixPos, -1).checkEq(suffixPos, -1);
        new Here("Unit", 36).given(unresolved, "${env.PROPERTY}").given(prefixPos, 0).checkEq(suffixPos, 14);
        new Here("Unit", 36).given(unresolved, "localhost:${port}/").given(prefixPos, 10).checkEq(suffixPos, 16);
        return prefixPos >= 0 && suffixPos >= 0;
    }

    public String extractPropertyKey() {
        advanceToNextPrefix();
        discardPrefix();
        String key = beforeNextSuffix();
        discardToAfterNextSuffix();
        return key;
    }

    public String toString() {
        return resolved.append(unresolved).toString();
    }

    public void add(String newKey, String newValue) {
        if (replaced(newValue)) {
            expandFurther(newValue);
        } else {
            skipUnresolvedPlaceholder(newKey);
        }
    }

    private boolean replaced(String value) {
        return value != null;
    }

    private void expandFurther(String value) {
        unresolved = value + unresolved;
    }

    private void skipUnresolvedPlaceholder(String newKey) {
        resolved.append("${").append(newKey).append("}");
    }

    private void discardToAfterNextSuffix() {
        int propertySuffixPos = unresolved.indexOf("}");
        new Here("Unit", 87).given(unresolved, "hostname}:${port}/").checkEq(propertySuffixPos, 8);
        new Here("Unit", 87).given(unresolved, "p2}").checkEq(propertySuffixPos, 2);
        new Here("Unit", 87).given(unresolved, "unknown}").checkEq(propertySuffixPos, 7);
        new Here("Unit", 87).given(unresolved, "p5}").checkEq(propertySuffixPos, 2);
        new Here("Unit", 87).given(unresolved, "env.PROPERTY}").checkEq(propertySuffixPos, 12);
        new Here("Unit", 87).given(unresolved, "system.property}").checkEq(propertySuffixPos, 15);
        new Here("Unit", 87).given(unresolved, "p6}").checkEq(propertySuffixPos, 2);
        new Here("Unit", 87).given(unresolved, "p7}").checkEq(propertySuffixPos, 2);
        new Here("Unit", 87).given(unresolved, "port}/").checkEq(propertySuffixPos, 4);
        unresolved = unresolved.substring(propertySuffixPos + 1);
    }

    private void advanceToNextPrefix() {
        resolved.append(beforePrefix());
    }

    private void discardPrefix() {
        int propertyPrefixPos = unresolved.indexOf("${");
        new Here("Unit", 98).given(unresolved, "${unknown}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 98).given(unresolved, "${p2}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 98).given(unresolved, "${p5}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 98).given(unresolved, "${env.PROPERTY}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 98).given(unresolved, "${system.property}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 98).given(unresolved, "${p7}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 98).given(unresolved, "${p6}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 98).given(unresolved, "http://${hostname}:${port}/").checkEq(propertyPrefixPos, 7);
        new Here("Unit", 98).given(unresolved, "localhost:${port}/").checkEq(propertyPrefixPos, 10);
        unresolved = unresolved.substring(propertyPrefixPos + 2);
    }

    private String beforePrefix() {
        int propertyPrefixPos = unresolved.indexOf("${");
        new Here("Unit", 104).given(unresolved, "${env.PROPERTY}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 104).given(unresolved, "${unknown}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 104).given(unresolved, "${p2}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 104).given(unresolved, "${system.property}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 104).given(unresolved, "${p6}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 104).given(unresolved, "${p5}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 104).given(unresolved, "${p7}").checkEq(propertyPrefixPos, 0);
        new Here("Unit", 104).given(unresolved, "localhost:${port}/").checkEq(propertyPrefixPos, 10);
        new Here("Unit", 104).given(unresolved, "http://${hostname}:${port}/").checkEq(propertyPrefixPos, 7);
        return unresolved.substring(0, propertyPrefixPos);
    }

    private String beforeNextSuffix() {
        int propertySuffixPos = unresolved.indexOf("}");
        new Here("Unit", 110).given(unresolved, "port}/").checkEq(propertySuffixPos, 4);
        new Here("Unit", 110).given(unresolved, "system.property}").checkEq(propertySuffixPos, 15);
        new Here("Unit", 110).given(unresolved, "hostname}:${port}/").checkEq(propertySuffixPos, 8);
        new Here("Unit", 110).given(unresolved, "p5}").checkEq(propertySuffixPos, 2);
        new Here("Unit", 110).given(unresolved, "unknown}").checkEq(propertySuffixPos, 7);
        new Here("Unit", 110).given(unresolved, "p2}").checkEq(propertySuffixPos, 2);
        new Here("Unit", 110).given(unresolved, "p7}").checkEq(propertySuffixPos, 2);
        new Here("Unit", 110).given(unresolved, "p6}").checkEq(propertySuffixPos, 2);
        new Here("Unit", 110).given(unresolved, "env.PROPERTY}").checkEq(propertySuffixPos, 12);
        return unresolved.substring(0, propertySuffixPos);
    }
}
