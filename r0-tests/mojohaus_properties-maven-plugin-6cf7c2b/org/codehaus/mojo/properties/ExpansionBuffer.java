package org.codehaus.mojo.properties;

import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

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
        itest("dev", 35).given(unresolved, "${p5}").checkEq(prefixPos, 0);
        itest("dev", 35).given(unresolved, "${unknown}").checkEq(prefixPos, 0);
        itest("evosuite", 35).given(unresolved, "S'R.F8a@>").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "http://${hostname}:${port}/").checkEq(prefixPos, 7);
        itest("evosuite", 35).given(unresolved, "").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "env.value").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "${p7}").checkEq(prefixPos, 0);
        itest("evosuite", 35).given(unresolved, "\"2\"2").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "\"2").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "value1").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "NByxTrZYruZy@6zIu").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "${3N?8}T+lLVG376").checkEq(prefixPos, 0);
        itest("dev", 35).given(unresolved, "localhost:${port}/").checkEq(prefixPos, 10);
        itest("dev", 35).given(unresolved, "${p6}").checkEq(prefixPos, 0);
        itest("evosuite", 35).given(unresolved, "/${env.").checkEq(prefixPos, 1);
        itest("evosuite", 35).given(unresolved, "0a${").checkEq(prefixPos, 2);
        itest("dev", 35).given(unresolved, "${env.PROPERTY}").checkEq(prefixPos, 0);
        itest("evosuite", 35).given(unresolved, "6KX").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "i C?vgi C?vg6KX").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "value").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "value3").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "J").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "eR%eTxSceQYo0fh4").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "system.value").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "${p2}").checkEq(prefixPos, 0);
        itest("evosuite", 35).given(unresolved, "${").checkEq(prefixPos, 0);
        itest("dev", 35).given(unresolved, "value2").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "x}2O").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "i C?vg6KX").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "8080/").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "${malformed").checkEq(prefixPos, 0);
        itest("evosuite", 35).given(unresolved, "oM3@,5Ri!_9`H^5^_").checkEq(prefixPos, -1);
        itest("dev", 35).given(unresolved, "").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "m_/tH\"NWM").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "org.codehaus.mojo.properties.ExpansionBuffer").checkEq(prefixPos, -1);
        itest("evosuite", 35).given(unresolved, "}${}${").checkEq(prefixPos, 1);
        itest("dev", 35).given(unresolved, "${system.property}").checkEq(prefixPos, 0);
        int suffixPos = unresolved.indexOf("}", prefixPos + 2);
        itest("evosuite", 36).given(unresolved, "/${env.").given(prefixPos, 1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "${").given(prefixPos, 0).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "value2").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "${p7}").given(prefixPos, 0).checkEq(suffixPos, 4);
        itest("evosuite", 36).given(unresolved, "NByxTrZYruZy@6zIu").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "0a${").given(prefixPos, 2).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "}${}${").given(prefixPos, 1).checkEq(suffixPos, 3);
        itest("dev", 36).given(unresolved, "value").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "i C?vgi C?vg6KX").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "value1").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "${env.PROPERTY}").given(prefixPos, 0).checkEq(suffixPos, 14);
        itest("evosuite", 36).given(unresolved, "6KX").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "${p2}").given(prefixPos, 0).checkEq(suffixPos, 4);
        itest("dev", 36).given(unresolved, "8080/").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "${p6}").given(prefixPos, 0).checkEq(suffixPos, 4);
        itest("evosuite", 36).given(unresolved, "\"2").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "eR%eTxSceQYo0fh4").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "value3").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "${3N?8}T+lLVG376").given(prefixPos, 0).checkEq(suffixPos, 6);
        itest("evosuite", 36).given(unresolved, "org.codehaus.mojo.properties.ExpansionBuffer").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "S'R.F8a@>").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "env.value").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "${system.property}").given(prefixPos, 0).checkEq(suffixPos, 17);
        itest("dev", 36).given(unresolved, "localhost:${port}/").given(prefixPos, 10).checkEq(suffixPos, 16);
        itest("evosuite", 36).given(unresolved, "J").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "system.value").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "oM3@,5Ri!_9`H^5^_").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "\"2\"2").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "i C?vg6KX").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("dev", 36).given(unresolved, "${p5}").given(prefixPos, 0).checkEq(suffixPos, 4);
        itest("dev", 36).given(unresolved, "${malformed").given(prefixPos, 0).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "m_/tH\"NWM").given(prefixPos, -1).checkEq(suffixPos, -1);
        itest("evosuite", 36).given(unresolved, "x}2O").given(prefixPos, -1).checkEq(suffixPos, 1);
        itest("dev", 36).given(unresolved, "${unknown}").given(prefixPos, 0).checkEq(suffixPos, 9);
        itest("dev", 36).given(unresolved, "http://${hostname}:${port}/").given(prefixPos, 7).checkEq(suffixPos, 17);
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
        itest("evosuite", 87).given(unresolved, "}xf43:7gsp${").checkEq(propertySuffixPos, 0);
        itest("dev", 87).given(unresolved, "p2}").checkEq(propertySuffixPos, 2);
        itest("evosuite", 87).given(unresolved, "MIKE8Q}0P>y52Ea`pS$${").checkEq(propertySuffixPos, 6);
        itest("dev", 87).given(unresolved, "unknown}").checkEq(propertySuffixPos, 7);
        itest("dev", 87).given(unresolved, "p7}").checkEq(propertySuffixPos, 2);
        itest("dev", 87).given(unresolved, "p6}").checkEq(propertySuffixPos, 2);
        itest("dev", 87).given(unresolved, "p5}").checkEq(propertySuffixPos, 2);
        itest("dev", 87).given(unresolved, "env.PROPERTY}").checkEq(propertySuffixPos, 12);
        itest("dev", 87).given(unresolved, "system.property}").checkEq(propertySuffixPos, 15);
        itest("dev", 87).given(unresolved, "port}/").checkEq(propertySuffixPos, 4);
        itest("evosuite", 87).given(unresolved, "+j}[px").checkEq(propertySuffixPos, 2);
        itest("dev", 87).given(unresolved, "hostname}:${port}/").checkEq(propertySuffixPos, 8);
        unresolved = unresolved.substring(propertySuffixPos + 1);
        itest("evosuite", 88).given(unresolved, "+j}[px").given(propertySuffixPos, 2).checkEq(unresolved, "[px");
        itest("evosuite", 88).given(unresolved, "MIKE8Q}0P>y52Ea`pS$${").given(propertySuffixPos, 6).checkEq(unresolved, "0P>y52Ea`pS$${");
        itest("dev", 88).given(unresolved, "env.PROPERTY}").given(propertySuffixPos, 12).checkEq(unresolved, "");
        itest("dev", 88).given(unresolved, "hostname}:${port}/").given(propertySuffixPos, 8).checkEq(unresolved, ":${port}/");
        itest("evosuite", 88).given(unresolved, "}xf43:7gsp${").given(propertySuffixPos, 0).checkEq(unresolved, "xf43:7gsp${");
        itest("dev", 88).given(unresolved, "p5}").given(propertySuffixPos, 2).checkEq(unresolved, "");
        itest("dev", 88).given(unresolved, "p7}").given(propertySuffixPos, 2).checkEq(unresolved, "");
        itest("dev", 88).given(unresolved, "p2}").given(propertySuffixPos, 2).checkEq(unresolved, "");
        itest("dev", 88).given(unresolved, "p6}").given(propertySuffixPos, 2).checkEq(unresolved, "");
        itest("dev", 88).given(unresolved, "port}/").given(propertySuffixPos, 4).checkEq(unresolved, "/");
        itest("dev", 88).given(unresolved, "unknown}").given(propertySuffixPos, 7).checkEq(unresolved, "");
        itest("dev", 88).given(unresolved, "system.property}").given(propertySuffixPos, 15).checkEq(unresolved, "");
    }

    private void advanceToNextPrefix() {
        resolved.append(beforePrefix());
    }

    private void discardPrefix() {
        int propertyPrefixPos = unresolved.indexOf("${");
        itest("evosuite", 98).given(unresolved, "${}xf43:7gsp${").checkEq(propertyPrefixPos, 0);
        itest("dev", 98).given(unresolved, "${p7}").checkEq(propertyPrefixPos, 0);
        itest("dev", 98).given(unresolved, "${p5}").checkEq(propertyPrefixPos, 0);
        itest("dev", 98).given(unresolved, "${env.PROPERTY}").checkEq(propertyPrefixPos, 0);
        itest("dev", 98).given(unresolved, "${p6}").checkEq(propertyPrefixPos, 0);
        itest("evosuite", 98).given(unresolved, "xf43:7gsp${").checkEq(propertyPrefixPos, 9);
        itest("dev", 98).given(unresolved, "${system.property}").checkEq(propertyPrefixPos, 0);
        itest("dev", 98).given(unresolved, "${p2}").checkEq(propertyPrefixPos, 0);
        itest("evosuite", 98).given(unresolved, "%K82${+j}[px").checkEq(propertyPrefixPos, 4);
        itest("evosuite", 98).given(unresolved, "${").checkEq(propertyPrefixPos, 0);
        itest("evosuite", 98).given(unresolved, "0P>y52Ea`pS$${").checkEq(propertyPrefixPos, 12);
        itest("evosuite", 98).given(unresolved, "${MIKE8Q}0P>y52Ea`pS$${").checkEq(propertyPrefixPos, 0);
        itest("dev", 98).given(unresolved, "localhost:${port}/").checkEq(propertyPrefixPos, 10);
        itest("dev", 98).given(unresolved, "http://${hostname}:${port}/").checkEq(propertyPrefixPos, 7);
        itest("dev", 98).given(unresolved, "${unknown}").checkEq(propertyPrefixPos, 0);
        unresolved = unresolved.substring(propertyPrefixPos + 2);
        itest("dev", 99).given(unresolved, "${p5}").given(propertyPrefixPos, 0).checkEq(unresolved, "p5}");
        itest("evosuite", 99).given(unresolved, "%K82${+j}[px").given(propertyPrefixPos, 4).checkEq(unresolved, "+j}[px");
        itest("dev", 99).given(unresolved, "http://${hostname}:${port}/").given(propertyPrefixPos, 7).checkEq(unresolved, "hostname}:${port}/");
        itest("dev", 99).given(unresolved, "${unknown}").given(propertyPrefixPos, 0).checkEq(unresolved, "unknown}");
        itest("evosuite", 99).given(unresolved, "${}xf43:7gsp${").given(propertyPrefixPos, 0).checkEq(unresolved, "}xf43:7gsp${");
        itest("dev", 99).given(unresolved, "${p2}").given(propertyPrefixPos, 0).checkEq(unresolved, "p2}");
        itest("evosuite", 99).given(unresolved, "${MIKE8Q}0P>y52Ea`pS$${").given(propertyPrefixPos, 0).checkEq(unresolved, "MIKE8Q}0P>y52Ea`pS$${");
        itest("evosuite", 99).given(unresolved, "0P>y52Ea`pS$${").given(propertyPrefixPos, 12).checkEq(unresolved, "");
        itest("evosuite", 99).given(unresolved, "xf43:7gsp${").given(propertyPrefixPos, 9).checkEq(unresolved, "");
        itest("dev", 99).given(unresolved, "${system.property}").given(propertyPrefixPos, 0).checkEq(unresolved, "system.property}");
        itest("evosuite", 99).given(unresolved, "${").given(propertyPrefixPos, 0).checkEq(unresolved, "");
        itest("dev", 99).given(unresolved, "${p7}").given(propertyPrefixPos, 0).checkEq(unresolved, "p7}");
        itest("dev", 99).given(unresolved, "${env.PROPERTY}").given(propertyPrefixPos, 0).checkEq(unresolved, "env.PROPERTY}");
        itest("dev", 99).given(unresolved, "localhost:${port}/").given(propertyPrefixPos, 10).checkEq(unresolved, "port}/");
        itest("dev", 99).given(unresolved, "${p6}").given(propertyPrefixPos, 0).checkEq(unresolved, "p6}");
    }

    private String beforePrefix() {
        int propertyPrefixPos = unresolved.indexOf("${");
        itest("dev", 104).given(unresolved, "localhost:${port}/").checkEq(propertyPrefixPos, 10);
        itest("dev", 104).given(unresolved, "${p2}").checkEq(propertyPrefixPos, 0);
        itest("dev", 104).given(unresolved, "${p7}").checkEq(propertyPrefixPos, 0);
        itest("dev", 104).given(unresolved, "${env.PROPERTY}").checkEq(propertyPrefixPos, 0);
        itest("dev", 104).given(unresolved, "${p6}").checkEq(propertyPrefixPos, 0);
        itest("dev", 104).given(unresolved, "${p5}").checkEq(propertyPrefixPos, 0);
        itest("dev", 104).given(unresolved, "http://${hostname}:${port}/").checkEq(propertyPrefixPos, 7);
        itest("evosuite", 104).given(unresolved, "i C?vgi C?vg6KX").checkEq(propertyPrefixPos, -1);
        itest("evosuite", 104).given(unresolved, "").checkEq(propertyPrefixPos, -1);
        itest("evosuite", 104).given(unresolved, "${}xf43:7gsp${").checkEq(propertyPrefixPos, 0);
        itest("evosuite", 104).given(unresolved, "0P>y52Ea`pS$${").checkEq(propertyPrefixPos, 12);
        itest("dev", 104).given(unresolved, "${unknown}").checkEq(propertyPrefixPos, 0);
        itest("evosuite", 104).given(unresolved, "xf43:7gsp${").checkEq(propertyPrefixPos, 9);
        itest("evosuite", 104).given(unresolved, "org.codehaus.mojo.properties.ExpansionBuffer").checkEq(propertyPrefixPos, -1);
        itest("dev", 104).given(unresolved, "${system.property}").checkEq(propertyPrefixPos, 0);
        itest("evosuite", 104).given(unresolved, "${").checkEq(propertyPrefixPos, 0);
        itest("evosuite", 104).given(unresolved, "%K82${+j}[px").checkEq(propertyPrefixPos, 4);
        itest("evosuite", 104).given(unresolved, "${MIKE8Q}0P>y52Ea`pS$${").checkEq(propertyPrefixPos, 0);
        return unresolved.substring(0, propertyPrefixPos);
    }

    private String beforeNextSuffix() {
        int propertySuffixPos = unresolved.indexOf("}");
        itest("dev", 110).given(unresolved, "p6}").checkEq(propertySuffixPos, 2);
        itest("dev", 110).given(unresolved, "system.property}").checkEq(propertySuffixPos, 15);
        itest("dev", 110).given(unresolved, "p7}").checkEq(propertySuffixPos, 2);
        itest("evosuite", 110).given(unresolved, "MIKE8Q}0P>y52Ea`pS$${").checkEq(propertySuffixPos, 6);
        itest("dev", 110).given(unresolved, "p5}").checkEq(propertySuffixPos, 2);
        itest("evosuite", 110).given(unresolved, "}xf43:7gsp${").checkEq(propertySuffixPos, 0);
        itest("dev", 110).given(unresolved, "p2}").checkEq(propertySuffixPos, 2);
        itest("dev", 110).given(unresolved, "port}/").checkEq(propertySuffixPos, 4);
        itest("evosuite", 110).given(unresolved, "").checkEq(propertySuffixPos, -1);
        itest("dev", 110).given(unresolved, "env.PROPERTY}").checkEq(propertySuffixPos, 12);
        itest("evosuite", 110).given(unresolved, "+j}[px").checkEq(propertySuffixPos, 2);
        itest("dev", 110).given(unresolved, "unknown}").checkEq(propertySuffixPos, 7);
        itest("dev", 110).given(unresolved, "hostname}:${port}/").checkEq(propertySuffixPos, 8);
        return unresolved.substring(0, propertySuffixPos);
    }
}
