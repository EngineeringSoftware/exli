// --------------------------------------------------------------------------
// Copyright (c) 1998-2004, Drew Davidson and Luke Blanshard
// All rights reserved.
// 
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
// 
// Redistributions of source code must retain the above copyright notice,
// this list of conditions and the following disclaimer.
// Redistributions in binary form must reproduce the above copyright
// notice, this list of conditions and the following disclaimer in the
// documentation and/or other materials provided with the distribution.
// Neither the name of the Drew Davidson nor the names of its contributors
// may be used to endorse or promote products derived from this software
// without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
// FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
// COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
// BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
// OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
// AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
// OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
// THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
// --------------------------------------------------------------------------
package ognl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Default class resolution.  Uses Class.forName() to look up classes by name.
 * It also looks in the "java.lang" package if the class named does not give
 * a package specifier, allowing easier usage of these classes.
 * @author Luke Blanshard (blanshlu@netscape.net)
 * @author Drew Davidson (drew@ognl.org)
 */
public class DefaultClassResolver extends Object implements ClassResolver {

    private final ConcurrentHashMap<String, Class> classes = new ConcurrentHashMap<>(101);

    public DefaultClassResolver() {
        super();
    }

    public Class classForName(String className, Map context) throws ClassNotFoundException {
        Class result = classes.get(className);
        if (result != null) {
            return result;
        }
        try {
            result = toClassForName(className);
        } catch (ClassNotFoundException e) {
            if (className.indexOf('.') > -1) {
                new Here("Unit", 61).given(className, "BogusClass").checkFalse(group());
                new Here("Randoop", 61).given(className, "hi!").checkFalse(group());
                new Here("Unit", 61).given(className, "Double").checkFalse(group());
                new Here("Unit", 61).given(className, "made.up.Name").checkTrue(group());
                new Here("Unit", 61).given(className, "String").checkFalse(group());
                new Here("Randoop", 61).given(className, "java.lang").checkTrue(group());
                new Here("Unit", 61).given(className, "Class").checkFalse(group());
                new Here("Randoop", 61).given(className, "-ognl-root-type").checkFalse(group());
                new Here("Unit", 61).given(className, "System").checkFalse(group());
                new Here("Randoop", 61).given(className, "<ognl.ASTUnsignedShiftRight: [set] source = java.lang.Long, result = null [null]>").checkTrue(group());
                new Here("Randoop", 61).given(className, "06010d62").checkFalse(group());
                new Here("Unit", 61).given(className, "Boolean").checkFalse(group());
                new Here("Unit", 61).given(className, "no.such.Class").checkTrue(group());
                new Here("Unit", 61).given(className, "Runtime").checkFalse(group());
                new Here("Randoop", 61).given(className, "/").checkFalse(group());
                new Here("Randoop", 61).given(className, "!ognl.OgnlOps.equal").checkTrue(group());
                new Here("Unit", 61).given(className, "Integer").checkFalse(group());
                new Here("Randoop", 61).given(className, "-1double").checkFalse(group());
                new Here("Randoop", 61).given(className, "").checkFalse(group());
                new Here("Randoop", 61).given(className, "ognl.NoConversionPossible").checkTrue(group());
                new Here("Unit", 61).given(className, "Object").checkFalse(group());
                throw e;
            }
            // The class was not in the default package.
            // Try prepending 'java.lang.'.
            try {
                result = toClassForName("java.lang." + className);
            } catch (ClassNotFoundException e2) {
                // Report the specified class name as-is.
                throw e;
            }
        }
        classes.putIfAbsent(className, result);
        return result;
    }

    protected Class toClassForName(String className) throws ClassNotFoundException {
        return Class.forName(className);
    }
}
