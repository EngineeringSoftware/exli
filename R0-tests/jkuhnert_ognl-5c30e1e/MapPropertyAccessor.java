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

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Implementation of PropertyAccessor that sets and gets properties by storing and looking up values
 * in Maps.
 *
 * @author Luke Blanshard (blanshlu@netscape.net)
 * @author Drew Davidson (drew@ognl.org)
 */
public class MapPropertyAccessor implements PropertyAccessor {

    public Object getProperty(Map context, Object target, Object name) throws OgnlException {
        Object result;
        Map map = (Map) target;
        Node currentNode = ((OgnlContext) context).getCurrentNode().jjtGetParent();
        boolean indexedAccess = false;
        if (currentNode == null) {
            throw new OgnlException("node is null for '" + name + "'");
        }
        if (!(currentNode instanceof ASTProperty)) {
            currentNode = currentNode.jjtGetParent();
        }
        if (currentNode instanceof ASTProperty) {
            indexedAccess = ((ASTProperty) currentNode).isIndexedAccess();
        }
        if ((name instanceof String) && !indexedAccess) {
            if (name.equals("size")) {
                result = new Integer(map.size());
            } else {
                if (name.equals("keys") || name.equals("keySet")) {
                    result = map.keySet();
                } else {
                    if (name.equals("values")) {
                        result = map.values();
                    } else {
                        if (name.equals("isEmpty")) {
                            result = map.isEmpty() ? Boolean.TRUE : Boolean.FALSE;
                        } else {
                            result = map.get(name);
                        }
                    }
                }
            }
        } else {
            result = map.get(name);
        }
        return result;
    }

    public void setProperty(Map context, Object target, Object name, Object value) throws OgnlException {
        Map map = (Map) target;
        map.put(name, value);
    }

    public String getSourceAccessor(OgnlContext context, Object target, Object index) {
        Node currentNode = ((OgnlContext) context).getCurrentNode().jjtGetParent();
        boolean indexedAccess = false;
        if (currentNode == null) {
            throw new RuntimeException("node is null for '" + index + "'");
        }
        if (!(currentNode instanceof ASTProperty)) {
            currentNode = currentNode.jjtGetParent();
        }
        if (currentNode instanceof ASTProperty) {
            indexedAccess = ((ASTProperty) currentNode).isIndexedAccess();
        }
        String indexStr = index.toString();
        context.setCurrentAccessor(Map.class);
        context.setCurrentType(Object.class);
        if (String.class.isInstance(index) && !indexedAccess) {
            String key = (indexStr.indexOf('"') >= 0 ? indexStr.replaceAll("\"", "") : indexStr);
            new Here("Unit", 116).given(indexStr, "\"values\"").checkEq(key, "values");
            new Here("Unit", 116).given(indexStr, "\"deep\"").checkEq(key, "deep");
            new Here("Unit", 116).given(indexStr, "\"list\"").checkEq(key, "list");
            new Here("Unit", 116).given(indexStr, "\"last\"").checkEq(key, "last");
            new Here("Unit", 116).given(indexStr, "\"newValue\"").checkEq(key, "newValue");
            new Here("Unit", 116).given(indexStr, "\"bean\"").checkEq(key, "bean");
            new Here("Unit", 116).given(indexStr, "\"customList\"").checkEq(key, "customList");
            new Here("Unit", 116).given(indexStr, "\"newValue2\"").checkEq(key, "newValue2");
            new Here("Unit", 116).given(indexStr, "\"aKey\"").checkEq(key, "aKey");
            new Here("Unit", 116).given(indexStr, "\"array\"").checkEq(key, "array");
            new Here("Unit", 116).given(indexStr, "\"isEmpty\"").checkEq(key, "isEmpty");
            new Here("Unit", 116).given(indexStr, "\"value\"").checkEq(key, "value");
            new Here("Unit", 116).given(indexStr, "\"someMissingKey\"").checkEq(key, "someMissingKey");
            new Here("Unit", 116).given(indexStr, "\"test\"").checkEq(key, "test");
            new Here("Unit", 116).given(indexStr, "\"keySet\"").checkEq(key, "keySet");
            new Here("Unit", 116).given(indexStr, "\"size\"").checkEq(key, "size");
            new Here("Unit", 116).given(indexStr, "\"disableWarning\"").checkEq(key, "disableWarning");
            new Here("Unit", 116).given(indexStr, "\"keys\"").checkEq(key, "keys");
            new Here("Unit", 116).given(indexStr, "\"comp\"").checkEq(key, "comp");
            new Here("Unit", 116).given(indexStr, "((org.ognl.test.objects.Root)$2)..getMapKey()").checkEq(key, "((org.ognl.test.objects.Root)$2)..getMapKey()");
            new Here("Unit", 116).given(indexStr, "\"nested\"").checkEq(key, "nested");
            if (key.equals("size")) {
                context.setCurrentType(int.class);
                return ".size()";
            } else if (key.equals("keys") || key.equals("keySet")) {
                context.setCurrentType(Set.class);
                return ".keySet()";
            } else if (key.equals("values")) {
                context.setCurrentType(Collection.class);
                return ".values()";
            } else if (key.equals("isEmpty")) {
                context.setCurrentType(boolean.class);
                return ".isEmpty()";
            }
        }
        return ".get(" + indexStr + ")";
    }

    public String getSourceSetter(OgnlContext context, Object target, Object index) {
        context.setCurrentAccessor(Map.class);
        context.setCurrentType(Object.class);
        String indexStr = index.toString();
        if (String.class.isInstance(index)) {
            String key = (indexStr.indexOf('"') >= 0 ? indexStr.replaceAll("\"", "") : indexStr);
            new Here("Unit", 145).given(indexStr, "((java.lang.String)$1.get(\"key\"))").checkEq(key, "((java.lang.String)$1.get(key))");
            new Here("Unit", 145).given(indexStr, "\"key\"").checkEq(key, "key");
            new Here("Unit", 145).given(indexStr, "org.ognl.test.objects.Root.SIZE_STRING").checkEq(key, "org.ognl.test.objects.Root.SIZE_STRING");
            new Here("Unit", 145).given(indexStr, "\"list\"").checkEq(key, "list");
            new Here("Unit", 145).given(indexStr, "\"last\"").checkEq(key, "last");
            new Here("Unit", 145).given(indexStr, "\"size\"").checkEq(key, "size");
            new Here("Unit", 145).given(indexStr, "\"s\" + \"i\" + \"ze\"").checkEq(key, "s + i + ze");
            new Here("Unit", 145).given(indexStr, "\"te\" + \"st\"").checkEq(key, "te + st");
            new Here("Unit", 145).given(indexStr, "\"values\"").checkEq(key, "values");
            new Here("Unit", 145).given(indexStr, "\"isEmpty\"").checkEq(key, "isEmpty");
            new Here("Unit", 145).given(indexStr, "\"test\"").checkEq(key, "test");
            new Here("Unit", 145).given(indexStr, "\"bar\"").checkEq(key, "bar");
            new Here("Unit", 145).given(indexStr, "\"newValue\"").checkEq(key, "newValue");
            new Here("Unit", 145).given(indexStr, "\"keySet\"").checkEq(key, "keySet");
            new Here("Unit", 145).given(indexStr, "\"aKey\"").checkEq(key, "aKey");
            new Here("Unit", 145).given(indexStr, "\"nested\"").checkEq(key, "nested");
            if (key.equals("size")) {
                return "";
            } else if (key.equals("keys") || key.equals("keySet")) {
                return "";
            } else if (key.equals("values")) {
                return "";
            } else if (key.equals("isEmpty")) {
                return "";
            }
        }
        return ".put(" + indexStr + ", $3)";
    }
}
