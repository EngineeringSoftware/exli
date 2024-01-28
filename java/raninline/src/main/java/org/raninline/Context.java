package org.raninline;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class is used to store the context of the visitor.
 */
public class Context {
    public String className;
    public String logPath;
    public String inlineTestPath;
    public int lineNumber;
    public String srcPath;
    public String classesDirectory;
    public Set<String> logVariablesBefore = new HashSet<>();
    public Set<String> logMethodsBefore = new HashSet<>();
    public Set<String> logVariablesAfter = new HashSet<>();
    public Map<Integer, Set<String>> inlineTests = new HashMap<>();
    public ArrayDeque<Set<String>> locals = new ArrayDeque();
    public boolean lineNumberKnown = false;
    public boolean isTargetStmt = false;
    public boolean isCondition = false;
    public boolean throwExceptionForMalformedInlineTest = false;
}
