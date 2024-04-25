package biz.paluch.logging;

import static biz.paluch.logging.RuntimeContainerProperties.getProperty;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import biz.paluch.logging.gelf.intern.Closer;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 *  Filtering Facility for stack traces. This is to shorten very long Traces. It creates a redacted trace containing only the
 *  interesting parts. Please provide an own Resource {@code /StackTraceFilter.packages} with the package prefixes if you want to
 *  use a custom filter (one package per line).
 *
 *  <code>
 *  # Packages to filter
 *  org.h2
 *  org.apache.catalina
 *  org.apache.coyote
 *  org.apache.tomcat
 *  com.arjuna
 *  org.apache.cxf
 *  </code>
 *
 *  Original stack trace: <code>java.lang.RuntimeException: entryMethod
 * 	at biz.paluch.logging.StackTraceFilterTest.entryMethod(StackTraceFilterTest.java:49)
 * 	at biz.paluch.logging.StackTraceFilterTest.printStackTrace(StackTraceFilterTest.java:35)
 * 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 * 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 * 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 * 	at java.lang.reflect.Method.invoke(Method.java:497)
 * 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
 * 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
 * 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
 * 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
 * 	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
 * 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
 * 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
 * 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
 * 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
 * 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
 * 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
 * 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
 * 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
 * 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
 * 	at org.junit.runner.JUnitCore.run(JUnitCore.java:160)
 * 	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
 * 	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:51)
 * 	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:237)
 * 	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
 * 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 * 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 * 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 * 	at java.lang.reflect.Method.invoke(Method.java:497)
 * 	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 * Caused by: biz.paluch.logging.StackTraceFilterTest$MyException: Intermediate 2
 * 	at biz.paluch.logging.StackTraceFilterTest.intermediate2(StackTraceFilterTest.java:58)
 * 	at biz.paluch.logging.StackTraceFilterTest.intermediate1(StackTraceFilterTest.java:53)
 * 	... 30 more
 * 	Suppressed: java.lang.RuntimeException: surpressed
 * 		at biz.paluch.logging.StackTraceFilterTest.intermediate2(StackTraceFilterTest.java:59)
 * 		... 31 more
 * 		Suppressed: java.lang.RuntimeException: surpressed
 * 			at biz.paluch.logging.StackTraceFilterTest.intermediate2(StackTraceFilterTest.java:60)
 * 			... 31 more
 * 		Suppressed: java.lang.IllegalArgumentException: Failed to parse byte.
 * 			at org.jboss.common.beans.property.ByteEditor.setAsText(ByteEditor.java:48)
 * 			at biz.paluch.logging.StackTraceFilterTest.intermediate2(StackTraceFilterTest.java:65)
 * 			... 31 more
 * 		Caused by: java.lang.NumberFormatException: For input string: "adsd"
 * 			at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 			at java.lang.Integer.parseInt(Integer.java:580)
 * 			at java.lang.Integer.valueOf(Integer.java:740)
 * 			at java.lang.Integer.decode(Integer.java:1197)
 * 			at java.lang.Byte.decode(Byte.java:277)
 * 			at org.jboss.common.beans.property.ByteEditor.setAsText(ByteEditor.java:45)
 * 			... 32 more
 * Caused by: biz.paluch.logging.StackTraceFilterTest$MyException: Message
 * 	at biz.paluch.logging.StackTraceFilterTest.intermediate3(StackTraceFilterTest.java:77)
 * 	... 32 more
 * 	Suppressed: java.lang.IllegalStateException: Some illegal state
 * 		at biz.paluch.logging.StackTraceFilterTest.cause(StackTraceFilterTest.java:84)
 * 		at biz.paluch.logging.StackTraceFilterTest.intermediate3(StackTraceFilterTest.java:78)
 * 		... 32 more
 * 	Suppressed: java.lang.IllegalStateException: Some illegal state
 * 		at biz.paluch.logging.StackTraceFilterTest.cause(StackTraceFilterTest.java:84)
 * 		at biz.paluch.logging.StackTraceFilterTest.intermediate3(StackTraceFilterTest.java:79)
 * 		... 32 more
 * Caused by: java.lang.IllegalStateException: Some illegal state
 * 	at biz.paluch.logging.StackTraceFilterTest.cause(StackTraceFilterTest.java:84)
 * 	... 33 more
 *     </code>
 *
 *  Filtered stack trace: <code>java.lang.RuntimeException: entryMethod
 * 	at biz.paluch.logging.StackTraceFilterTest.entryMethod(StackTraceFilterTest.java:49)
 * 	at biz.paluch.logging.StackTraceFilterTest.filterWholeStackTrace(StackTraceFilterTest.java:43)
 * 			19 lines skipped for [java.lang, sun., org.junit]
 * 	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
 * 	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:51)
 * 	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:237)
 * 	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
 * 			4 lines skipped for [java.lang, sun.]
 * 	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 * Caused by: biz.paluch.logging.StackTraceFilterTest$MyException: Intermediate 2
 * 	at biz.paluch.logging.StackTraceFilterTest.intermediate2(StackTraceFilterTest.java:58)
 * 	at biz.paluch.logging.StackTraceFilterTest.intermediate1(StackTraceFilterTest.java:53)
 * 	... 30 more
 * 	Suppressed: java.lang.RuntimeException: surpressed
 * 		at biz.paluch.logging.StackTraceFilterTest.intermediate2(StackTraceFilterTest.java:59)
 * 		... 31 more
 * 		Suppressed: java.lang.RuntimeException: surpressed
 * 			at biz.paluch.logging.StackTraceFilterTest.intermediate2(StackTraceFilterTest.java:60)
 * 			... 31 more
 * 		Suppressed: java.lang.IllegalArgumentException: Failed to parse byte.
 * 			at org.jboss.common.beans.property.ByteEditor.setAsText(ByteEditor.java:48)
 * 			at biz.paluch.logging.StackTraceFilterTest.intermediate2(StackTraceFilterTest.java:65)
 * 			... 31 more
 * 		Caused by: java.lang.NumberFormatException: For input string: "adsd"
 * 					6 lines skipped for [java.lang, org.jboss]
 * 			... 32 more
 * Caused by: biz.paluch.logging.StackTraceFilterTest$MyException: Message
 * 	at biz.paluch.logging.StackTraceFilterTest.intermediate3(StackTraceFilterTest.java:77)
 * 	... 32 more
 * 	Suppressed: java.lang.IllegalStateException: Some illegal state
 * 		at biz.paluch.logging.StackTraceFilterTest.cause(StackTraceFilterTest.java:84)
 * 		at biz.paluch.logging.StackTraceFilterTest.intermediate3(StackTraceFilterTest.java:78)
 * 		... 32 more
 * 	Suppressed: java.lang.IllegalStateException: Some illegal state
 * 		at biz.paluch.logging.StackTraceFilterTest.cause(StackTraceFilterTest.java:84)
 * 		at biz.paluch.logging.StackTraceFilterTest.intermediate3(StackTraceFilterTest.java:79)
 * 		... 32 more
 * Caused by: java.lang.IllegalStateException: Some illegal state
 * 	at biz.paluch.logging.StackTraceFilterTest.cause(StackTraceFilterTest.java:84)
 * 	... 33 more</code>
 *
 *  @author Mark Paluch
 */
public class StackTraceFilter {

    public static final String VERBOSE_LOGGING_PROPERTY = "logstash-gelf.StackTraceFilter.verbose";

    public static final String FILTER_SETTINGS = "/" + StackTraceFilter.class.getSimpleName() + ".packages";

    private static final String INDENT = "\t";

    private static final boolean VERBOSE_LOGGING = Boolean.parseBoolean(getProperty(VERBOSE_LOGGING_PROPERTY, "false"));

    private static final Pattern AT_PATTERN = Pattern.compile("(" + INDENT + ")+at");

    private static final Pattern SURPRESSED_PATTERN = Pattern.compile("(" + INDENT + ")+Suppressed\\:");

    /**
     * List of suppressed Packages.
     */
    private static Set<String> suppressedPackages;

    static {
        loadSetttings(FILTER_SETTINGS);
    }

    public static void loadSetttings(String resourceName) {
        InputStream is = null;
        try {
            is = getStream(resourceName);
            if (is == null) {
                verboseLog("No " + resourceName + " resource present, using defaults");
                suppressedPackages = new HashSet<>(getDefaults());
            } else {
                Properties p = new Properties();
                p.load(is);
                suppressedPackages = (Set) p.keySet();
            }
        } catch (IOException e) {
            verboseLog("Could not parse " + resourceName + " resource, using defaults");
            suppressedPackages = new HashSet<>(getDefaults());
        } finally {
            Closer.close(is);
        }
    }

    private static InputStream getStream(String resourceName) {
        Thread thread = Thread.currentThread();
        InputStream is = StackTraceFilter.class.getResourceAsStream(resourceName);
        if (is == null && thread.getContextClassLoader() != null) {
            is = thread.getContextClassLoader().getResourceAsStream(resourceName);
        }
        return is;
    }

    public static List<String> getDefaults() {
        return Arrays.asList("org.h2", "org.apache.catalina", "org.apache.coyote", "org.apache.tomcat", "com.arjuna", "org.apache.cxf", "org.hibernate", "org.junit", "org.jboss", "java.lang.reflect.Method", "sun.", "com.sun", "org.eclipse", "junit.framework", "com.sun.faces", "javax.faces", "org.richfaces", "org.apache.el", "javax.servlet");
    }

    /**
     * Utility-Constructor.
     */
    private StackTraceFilter() {
    }

    /**
     * Get a filterered stack trace.
     *
     * @param t the throwable
     * @return String containing the filtered stack trace.
     */
    public static String getFilteredStackTrace(Throwable t) {
        return getFilteredStackTrace(t, true);
    }

    /**
     * Get a filterered stack trace.
     *
     * @param t the throwable
     * @param shouldFilter true in case filtering should be performed. Else stack trace as string will be returned.
     * @return String containing the stack trace.
     * @deprecated since 1.11.1. Use {@link #getStackTrace(Throwable, int)} to get the stack trace without filtering or
     *             {@link #getFilteredStackTrace(Throwable)} to get the filtered the stack trace.
     */
    @Deprecated
    public static String getFilteredStackTrace(Throwable t, boolean shouldFilter) {
        if (shouldFilter) {
            return getFilteredStackTrace(t, 0);
        }
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        pw.close();
        return sw.getBuffer().toString();
    }

    /**
     * Filter stack trace by selecting the {@link Throwable} using a reference position. Intermediate throwables will be printed
     * with just their header.
     *
     * @param t the throwable
     * @param ref throwable reference position, see {@link #getThrowable(List, int)}.
     * @return String containing the stack trace.
     * @since 1.11.1
     */
    public static String getFilteredStackTrace(Throwable t, int ref) {
        StringWriter sw = new StringWriter();
        FilterWriter filterWriter = new StackTraceFilterWriter(sw);
        printStackTrace(t, filterWriter, ref);
        return sw.getBuffer().toString();
    }

    /**
     * Get the {@link Throwable}'s stack trace.
     *
     * @param t the throwable
     * @return String containing the stack trace.
     * @since 1.11.1
     */
    public static String getStackTrace(Throwable t) {
        return getStackTrace(t, 0);
    }

    /**
     * Get the stack trace by selecting the {@link Throwable} using a reference position. Intermediate throwables will be
     * printed with just their header.
     *
     * @param t the throwable
     * @param ref throwable reference position, see {@link #getThrowable(List, int)}.
     * @return String containing the stack trace.
     * @since 1.11.1
     */
    public static String getStackTrace(Throwable t, int ref) {
        StringWriter sw = new StringWriter();
        printStackTrace(t, sw, ref);
        return sw.getBuffer().toString();
    }

    private static void printStackTrace(Throwable t, Writer writer, int ref) {
        List<Throwable> throwables = getThrowables(t);
        PrintWriter exceptionWriter = new PrintWriter(writer);
        Throwable subject = ref == 0 ? throwables.get(ref) : getThrowable(throwables, ref);
        boolean first = true;
        for (Throwable throwable : throwables) {
            if (subject == throwable) {
                break;
            }
            if (!first) {
                exceptionWriter.print("Caused by: ");
            }
            first = false;
            exceptionWriter.print(throwable.toString());
            exceptionWriter.println();
        }
        if (ref != 0) {
            exceptionWriter.print("Caused by: ");
        }
        subject.printStackTrace(exceptionWriter);
    }

    /**
     * Return a {@link Throwable} by its reference position.
     * <p>
     * This method extracts a {@link Throwable} from the exception chain of {@link Throwable#getCause() causes}. A reference of
     * {@code 0} returns the original {@link Throwable}, values greater zero will walk the cause chain up so a reference
     * {@code 1} returns {@code t.getCause()}. Negative reference values will walk the causing exception from the root cause
     * side. A reference of {@code -1} returns the root cause, {@code -2} the exception that wraps the root cause and so on.
     *
     * @param throwable the caught {@link Throwable}.
     * @param ref reference position
     * @return the selected {@link Throwable}.
     */
    public static Throwable getThrowable(Throwable throwable, int ref) {
        return getThrowable(getThrowables(throwable), ref);
    }

    private static Throwable getThrowable(List<Throwable> throwables, int ref) {
        if (ref >= 0) {
            return throwables.get(Math.min(ref, throwables.size() - 1));
        }
        return throwables.get(Math.max(throwables.size() + ref, 0));
    }

    private static List<Throwable> getThrowables(Throwable t) {
        List<Throwable> throwables = new ArrayList<>();
        Throwable current = t;
        do {
            throwables.add(current);
            current = current.getCause();
        } while (current != null && !throwables.contains(current));
        return throwables;
    }

    private static int getIndentation(String traceElement) {
        int index = traceElement.indexOf(INDENT);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:500)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:191)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:197)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:202)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:124)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:104)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:77)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassTestDescriptor.instantiateTestClass(ClassTestDescriptor.java:77)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:105)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:43)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateTestClass(ClassBasedTestDescriptor.java:276)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:29)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat java.lang.reflect.Method.invoke(Method.java:498)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:74)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:107)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestClassConstructor(ClassBasedTestDescriptor.java:329)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:258)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:75)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$2(ClassBasedTestDescriptor.java:252)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:132)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:675)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.api.extension.InvocationInterceptor.interceptTestClassConstructor(InvocationInterceptor.java:69)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$3(ClassBasedTestDescriptor.java:251)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:125)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:35)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:198)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:62)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:106)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ConstructorInvocation.proceed(ConstructorInvocation.java:56)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:69)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:211)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:229)").checkEq(index, 0);
        itest("dev", 355).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$1(NodeTestTask.java:107)").checkEq(index, 0);
        int indentationLevel = 0;
        while (index != -1) {
            indentationLevel++;
            index = traceElement.indexOf(INDENT, index + 1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:75)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$2(ClassBasedTestDescriptor.java:252)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:197)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:191)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:35)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:106)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestClassConstructor(ClassBasedTestDescriptor.java:329)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:132)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$1(NodeTestTask.java:107)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:77)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:500)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:62)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:29)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ConstructorInvocation.proceed(ConstructorInvocation.java:56)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$3(ClassBasedTestDescriptor.java:251)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:211)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:105)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.api.extension.InvocationInterceptor.interceptTestClassConstructor(InvocationInterceptor.java:69)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:69)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:229)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:202)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:43)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:675)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:125)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:198)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:74)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat java.lang.reflect.Method.invoke(Method.java:498)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:258)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassTestDescriptor.instantiateTestClass(ClassTestDescriptor.java:77)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateTestClass(ClassBasedTestDescriptor.java:276)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:124)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:107)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)").given(index, 0).checkEq(index, -1);
            itest("dev", 360).given(INDENT, "\t").given(traceElement, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:104)").given(index, 0).checkEq(index, -1);
        }
        return indentationLevel;
    }

    // 37 lines skipped for [org.h2, org.hibernate, sun.,
    // java.lang.reflect.Method, $Proxy]
    private static String getSkippedPackagesMessage(Set<String> skippedPackages, int skippedLines, int indentationLevel) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2 + indentationLevel; i++) {
            stringBuilder.append(INDENT);
        }
        stringBuilder.append(skippedLines).append(" line").append((skippedLines == 1 ? "" : "s")).append(" skipped for ").append(skippedPackages);
        return stringBuilder.toString();
    }

    /**
     * Checks to see if the class is part of a forbidden package. If so, it returns the package name from the list of suppressed
     * packages that matches, otherwise it returns null.
     *
     * @param classAndMethod StackTraceElement
     * @return forbidden package name or null.
     */
    private static String tryGetForbiddenPackageName(String classAndMethod) {
        for (String pkg : suppressedPackages) {
            if (classAndMethod.startsWith(pkg)) {
                return pkg;
            }
        }
        return null;
    }

    private static void verboseLog(String message) {
        if (VERBOSE_LOGGING) {
            System.out.println(message);
        }
    }

    static class StackTraceFilterWriter extends FilterWriter {

        private static final String traceElementPrefix = INDENT + "at ";

        Set<String> skippedPackages = new HashSet<>();

        int skippedLines;

        boolean endsWithNewLine;

        boolean first = true;

        int indentationLevel;

        private final String lineSeparator = System.getProperty("line.separator");

        public StackTraceFilterWriter(Writer s) {
            super(s);
        }

        @Override
        public void write(String str, int off, int len) throws IOException {
            String toWrite = str.substring(off, len);
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:43)").given(len, 116).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:43)");
            itest("dev", 424).given(str, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)").given(len, 105).given(off, 0).checkEq(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)");
            itest("dev", 424).given(str, "\tat org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)").given(len, 76).given(off, 0).checkEq(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)");
            itest("dev", 424).given(str, "\tat org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:211)").given(len, 101).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:211)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:35)").given(len, 108).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:35)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:99)").given(len, 97).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:99)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.StackTraceFilterUnitTests.filterWholeStackTrace(StackTraceFilterUnitTests.java:43)").given(len, 105).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.filterWholeStackTrace(StackTraceFilterUnitTests.java:43)");
            itest("dev", 424).given(str, "java.lang.Exception: this is an exception").given(len, 41).given(off, 0).checkEq(toWrite, "java.lang.Exception: this is an exception");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:62)").given(len, 109).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:62)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)").given(len, 114).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)");
            itest("dev", 424).given(str, "\t... 71 more").given(len, 12).given(off, 0).checkEq(toWrite, "\t... 71 more");
            itest("dev", 424).given(str, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)").given(len, 104).given(off, 0).checkEq(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)");
            itest("dev", 424).given(str, "\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)").given(len, 91).given(off, 0).checkEq(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)").given(len, 153).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)");
            itest("dev", 424).given(str, "\t... 69 more").given(len, 12).given(off, 0).checkEq(toWrite, "\t... 69 more");
            itest("dev", 424).given(str, "\t\t... 70 more").given(len, 13).given(off, 0).checkEq(toWrite, "\t\t... 70 more");
            itest("dev", 424).given(str, "\tSuppressed: java.lang.RuntimeException: suppressed").given(len, 51).given(off, 0).checkEq(toWrite, "\tSuppressed: java.lang.RuntimeException: suppressed");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.intern.GelfMessageUnitTests$1.<init>(GelfMessageUnitTests.java:38)").given(len, 94).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.intern.GelfMessageUnitTests$1.<init>(GelfMessageUnitTests.java:38)");
            itest("dev", 424).given(str, "\t\t\t3 lines skipped for [sun.]").given(len, 29).given(off, 0).checkEq(toWrite, "\t\t\t3 lines skipped for [sun.]");
            itest("dev", 424).given(str, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:119)").given(len, 99).given(off, 0).checkEq(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:119)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)").given(len, 105).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)").given(len, 91).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.StackTraceFilterUnitTests.filterRootCause(StackTraceFilterUnitTests.java:78)").given(len, 99).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.filterRootCause(StackTraceFilterUnitTests.java:78)");
            itest("dev", 424).given(str, "\tSuppressed: java.lang.IllegalStateException: Some illegal state").given(len, 64).given(off, 0).checkEq(toWrite, "\tSuppressed: java.lang.IllegalStateException: Some illegal state");
            itest("dev", 424).given(str, "\tat org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:675)").given(len, 90).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:675)");
            itest("dev", 424).given(str, "\t\tSuppressed: java.lang.RuntimeException: suppressed").given(len, 52).given(off, 0).checkEq(toWrite, "\t\tSuppressed: java.lang.RuntimeException: suppressed");
            itest("dev", 424).given(str, "\t\t\t31 lines skipped for [sun., org.junit, java.lang.reflect.Method]").given(len, 67).given(off, 0).checkEq(toWrite, "\t\t\t31 lines skipped for [sun., org.junit, java.lang.reflect.Method]");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)").given(len, 132).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)");
            itest("dev", 424).given(str, "\t\t\t9 lines skipped for [org.junit]").given(len, 34).given(off, 0).checkEq(toWrite, "\t\t\t9 lines skipped for [org.junit]");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:132)").given(len, 92).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:132)");
            itest("dev", 424).given(str, "Caused by: java.lang.IllegalStateException: Some illegal state").given(len, 62).given(off, 0).checkEq(toWrite, "Caused by: java.lang.IllegalStateException: Some illegal state");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)").given(len, 90).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)");
            itest("dev", 424).given(str, "java.io.IOException: java.lang.Exception: java.lang.Exception").given(len, 61).given(off, 0).checkEq(toWrite, "java.io.IOException: java.lang.Exception: java.lang.Exception");
            itest("dev", 424).given(str, "\tat java.lang.reflect.Method.invoke(Method.java:498)").given(len, 52).given(off, 0).checkEq(toWrite, "\tat java.lang.reflect.Method.invoke(Method.java:498)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)").given(len, 105).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:125)").given(len, 131).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:125)");
            itest("dev", 424).given(str, "\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)").given(len, 89).given(off, 0).checkEq(toWrite, "\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)");
            itest("dev", 424).given(str, "\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)").given(len, 104).given(off, 0).checkEq(toWrite, "\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)");
            itest("dev", 424).given(str, "\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)").given(len, 77).given(off, 0).checkEq(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:202)").given(len, 125).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:202)");
            itest("dev", 424).given(str, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)").given(len, 73).given(off, 0).checkEq(toWrite, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
            itest("dev", 424).given(str, "\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)").given(len, 81).given(off, 0).checkEq(toWrite, "\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate1(StackTraceFilterUnitTests.java:94)").given(len, 97).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate1(StackTraceFilterUnitTests.java:94)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)").given(len, 77).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)").given(len, 114).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)");
            itest("dev", 424).given(str, "\t\t\t... 70 more").given(len, 14).given(off, 0).checkEq(toWrite, "\t\t\t... 70 more");
            itest("dev", 424).given(str, "\t\tSuppressed: java.lang.IllegalArgumentException: java.lang.NumberFormatException: For input string: \"text\"").given(len, 107).given(off, 0).checkEq(toWrite, "\t\tSuppressed: java.lang.IllegalArgumentException: java.lang.NumberFormatException: For input string: \"text\"");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)").given(len, 107).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)").given(len, 150).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)").given(len, 100).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)");
            itest("dev", 424).given(str, "java.lang.IllegalStateException: Help!").given(len, 38).given(off, 0).checkEq(toWrite, "java.lang.IllegalStateException: Help!");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:104)").given(len, 132).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:104)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)").given(len, 89).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.jul.GelfLogHandlerTests.testEmptyMessageAndExceptionFallback(GelfLogHandlerTests.java:220)").given(len, 118).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.jul.GelfLogHandlerTests.testEmptyMessageAndExceptionFallback(GelfLogHandlerTests.java:220)");
            itest("dev", 424).given(str, "Caused by: biz.paluch.logging.StackTraceFilterUnitTests$MyException: Message").given(len, 76).given(off, 0).checkEq(toWrite, "Caused by: biz.paluch.logging.StackTraceFilterUnitTests$MyException: Message");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)").given(len, 117).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)").given(len, 114).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)").given(len, 114).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)");
            itest("dev", 424).given(str, "\t\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:106)").given(len, 100).given(off, 0).checkEq(toWrite, "\t\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:106)");
            itest("dev", 424).given(str, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)").given(len, 96).given(off, 0).checkEq(toWrite, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testException(AbstractGelfLogAppenderTests.java:88)").given(len, 114).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testException(AbstractGelfLogAppenderTests.java:88)");
            itest("dev", 424).given(str, "Caused by: biz.paluch.logging.StackTraceFilterUnitTests$MyException: Intermediate 2").given(len, 83).given(off, 0).checkEq(toWrite, "Caused by: biz.paluch.logging.StackTraceFilterUnitTests$MyException: Intermediate 2");
            itest("dev", 424).given(str, "Caused by: ").given(len, 11).given(off, 0).checkEq(toWrite, "Caused by: ");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.intern.GelfMessageUnitTests.<clinit>(GelfMessageUnitTests.java:32)").given(len, 94).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.intern.GelfMessageUnitTests.<clinit>(GelfMessageUnitTests.java:32)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testNullMessageAndExceptionFallback(AbstractGelfLogAppenderTests.java:190)").given(len, 137).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testNullMessageAndExceptionFallback(AbstractGelfLogAppenderTests.java:190)");
            itest("dev", 424).given(str, "\t\t\t... 71 more").given(len, 14).given(off, 0).checkEq(toWrite, "\t\t\t... 71 more");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.StackTraceFilterUnitTests.cause(StackTraceFilterUnitTests.java:124)").given(len, 90).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.cause(StackTraceFilterUnitTests.java:124)");
            itest("dev", 424).given(str, "\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)").given(len, 80).given(off, 0).checkEq(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)");
            itest("dev", 424).given(str, "biz.paluch.logging.StackTraceFilterUnitTests$MyException: Intermediate 2").given(len, 72).given(off, 0).checkEq(toWrite, "biz.paluch.logging.StackTraceFilterUnitTests$MyException: Intermediate 2");
            itest("dev", 424).given(str, "\n").given(len, 1).given(off, 0).checkEq(toWrite, "\n");
            itest("dev", 424).given(str, "\tat org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:197)").given(len, 95).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:197)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:117)").given(len, 98).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:117)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.jul.GelfLogHandlerTests.testNullMessageAndExceptionFallback(GelfLogHandlerTests.java:206)").given(len, 117).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.jul.GelfLogHandlerTests.testNullMessageAndExceptionFallback(GelfLogHandlerTests.java:206)");
            itest("dev", 424).given(str, "\tat org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:500)").given(len, 89).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:500)");
            itest("dev", 424).given(str, "java.lang.IllegalStateException").given(len, 31).given(off, 0).checkEq(toWrite, "java.lang.IllegalStateException");
            itest("dev", 424).given(str, "java.lang.IllegalStateException: Some illegal state").given(len, 51).given(off, 0).checkEq(toWrite, "java.lang.IllegalStateException: Some illegal state");
            itest("dev", 424).given(str, "\t\t\t17 lines skipped for [org.junit]").given(len, 35).given(off, 0).checkEq(toWrite, "\t\t\t17 lines skipped for [org.junit]");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.StackTraceFilterUnitTests.entryMethod(StackTraceFilterUnitTests.java:90)").given(len, 95).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.entryMethod(StackTraceFilterUnitTests.java:90)");
            itest("dev", 424).given(str, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)").given(len, 112).given(off, 0).checkEq(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)");
            itest("dev", 424).given(str, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:229)").given(len, 86).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:229)");
            itest("dev", 424).given(str, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:118)").given(len, 99).given(off, 0).checkEq(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:118)");
            itest("dev", 424).given(str, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:100)").given(len, 99).given(off, 0).checkEq(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:100)");
            itest("dev", 424).given(str, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)").given(len, 86).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.log4j2.GelfLogAppenderTests.testEmptyMessageAndExceptionFallback(GelfLogAppenderTests.java:231)").given(len, 123).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.log4j2.GelfLogAppenderTests.testEmptyMessageAndExceptionFallback(GelfLogAppenderTests.java:231)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:124)").given(len, 106).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:124)");
            itest("dev", 424).given(str, "\t\t... 71 more").given(len, 13).given(off, 0).checkEq(toWrite, "\t\t... 71 more");
            itest("dev", 424).given(str, "\t\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:101)").given(len, 100).given(off, 0).checkEq(toWrite, "\t\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:101)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:198)").given(len, 116).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:198)");
            itest("dev", 424).given(str, "\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)").given(len, 63).given(off, 0).checkEq(toWrite, "\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)");
            itest("dev", 424).given(str, "\t\tCaused by: java.lang.NumberFormatException: For input string: \"text\"").given(len, 70).given(off, 0).checkEq(toWrite, "\t\tCaused by: java.lang.NumberFormatException: For input string: \"text\"");
            itest("dev", 424).given(str, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:191)").given(len, 86).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:191)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)").given(len, 93).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)").given(len, 106).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.log4j2.GelfLogAppenderTests.testNullMessageAndExceptionFallback(GelfLogAppenderTests.java:217)").given(len, 122).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.log4j2.GelfLogAppenderTests.testNullMessageAndExceptionFallback(GelfLogAppenderTests.java:217)");
            itest("dev", 424).given(str, "biz.paluch.logging.StackTraceFilterUnitTests$MyException: Message").given(len, 65).given(off, 0).checkEq(toWrite, "biz.paluch.logging.StackTraceFilterUnitTests$MyException: Message");
            itest("dev", 424).given(str, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.cause(StackTraceFilterUnitTests.java:124)").given(len, 91).given(off, 0).checkEq(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.cause(StackTraceFilterUnitTests.java:124)");
            itest("dev", 424).given(str, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)").given(len, 113).given(off, 0).checkEq(toWrite, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)");
            itest("dev", 424).given(str, "java.lang.RuntimeException: entryMethod").given(len, 39).given(off, 0).checkEq(toWrite, "java.lang.RuntimeException: entryMethod");
            itest("dev", 424).given(str, "\t... 72 more").given(len, 12).given(off, 0).checkEq(toWrite, "\t... 72 more");
            itest("dev", 424).given(str, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testEmptyMessageAndExceptionFallback(AbstractGelfLogAppenderTests.java:204)").given(len, 138).given(off, 0).checkEq(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testEmptyMessageAndExceptionFallback(AbstractGelfLogAppenderTests.java:204)");
            itest("dev", 424).given(str, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:74)").given(len, 101).given(off, 0).checkEq(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:74)");
            if (skippedLines > 0 && toWrite.equals(lineSeparator) && endsWithNewLine) {
                return;
            }
            if (toWrite.equals(lineSeparator)) {
                endsWithNewLine = true;
                super.write(str, off, len);
                return;
            }
            if (SURPRESSED_PATTERN.matcher(toWrite).find()) {
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:132)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\tSuppressed: java.lang.RuntimeException: suppressed").checkTrue(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:35)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "java.lang.IllegalStateException: Help!").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testException(AbstractGelfLogAppenderTests.java:88)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:43)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tSuppressed: java.lang.IllegalStateException: Some illegal state").checkTrue(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.intern.GelfMessageUnitTests.<clinit>(GelfMessageUnitTests.java:32)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:500)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t\t17 lines skipped for [org.junit]").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.jul.GelfLogHandlerTests.testNullMessageAndExceptionFallback(GelfLogHandlerTests.java:206)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:106)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "java.lang.RuntimeException: entryMethod").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:101)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:211)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.intern.GelfMessageUnitTests$1.<init>(GelfMessageUnitTests.java:38)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "Caused by: biz.paluch.logging.StackTraceFilterUnitTests$MyException: Message").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "Caused by: ").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.filterWholeStackTrace(StackTraceFilterUnitTests.java:43)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "java.lang.IllegalStateException: Some illegal state").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:125)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testNullMessageAndExceptionFallback(AbstractGelfLogAppenderTests.java:190)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:229)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:198)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:99)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testEmptyMessageAndExceptionFallback(AbstractGelfLogAppenderTests.java:204)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "java.io.IOException: java.lang.Exception: java.lang.Exception").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t\t31 lines skipped for [sun., org.junit, java.lang.reflect.Method]").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tSuppressed: java.lang.RuntimeException: suppressed").checkTrue(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "biz.paluch.logging.StackTraceFilterUnitTests$MyException: Intermediate 2").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:191)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "biz.paluch.logging.StackTraceFilterUnitTests$MyException: Message").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:100)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:197)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "Caused by: biz.paluch.logging.StackTraceFilterUnitTests$MyException: Intermediate 2").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:119)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t... 71 more").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:117)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.ConstructorInvocation.proceed(ConstructorInvocation.java:56)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\tCaused by: java.lang.NumberFormatException: For input string: \"text\"").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t... 71 more").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:675)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:118)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.log4j2.GelfLogAppenderTests.testEmptyMessageAndExceptionFallback(GelfLogAppenderTests.java:231)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t... 70 more").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate1(StackTraceFilterUnitTests.java:94)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:62)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:104)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:202)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t... 72 more").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.entryMethod(StackTraceFilterUnitTests.java:90)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "java.lang.Exception: this is an exception").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.log4j2.GelfLogAppenderTests.testNullMessageAndExceptionFallback(GelfLogAppenderTests.java:217)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.cause(StackTraceFilterUnitTests.java:124)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.cause(StackTraceFilterUnitTests.java:124)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat java.lang.reflect.Method.invoke(Method.java:498)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t... 69 more").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t\t... 70 more").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "Caused by: java.lang.IllegalStateException: Some illegal state").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:74)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\tSuppressed: java.lang.IllegalArgumentException: java.lang.NumberFormatException: For input string: \"text\"").checkTrue(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.gelf.jul.GelfLogHandlerTests.testEmptyMessageAndExceptionFallback(GelfLogHandlerTests.java:220)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t\t3 lines skipped for [sun.]").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:124)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t\t... 71 more").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\t\t\t9 lines skipped for [org.junit]").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "java.lang.IllegalStateException").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)").checkFalse(group());
                itest("dev", 436).given(SURPRESSED_PATTERN, "0.xml").given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.filterRootCause(StackTraceFilterUnitTests.java:78)").checkFalse(group());
                first = true;
            }
            if (endsWithNewLine && AT_PATTERN.matcher(toWrite).find()) {
                itest("dev", 440).given(endsWithNewLine, false).given(toWrite, "java.lang.Exception: this is an exception").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.jul.GelfLogHandlerTests.testEmptyMessageAndExceptionFallback(GelfLogHandlerTests.java:220)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t\t3 lines skipped for [sun.]").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:229)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "Caused by: biz.paluch.logging.StackTraceFilterUnitTests$MyException: Message").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testException(AbstractGelfLogAppenderTests.java:88)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.entryMethod(StackTraceFilterUnitTests.java:90)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:500)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t\t... 71 more").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.ConstructorInvocation.proceed(ConstructorInvocation.java:56)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:132)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:125)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:99)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:197)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, false).given(toWrite, "java.lang.IllegalStateException: Some illegal state").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t\t9 lines skipped for [org.junit]").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:106)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, false).given(toWrite, "java.lang.IllegalStateException: Help!").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t... 71 more").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "Caused by: ").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.cause(StackTraceFilterUnitTests.java:124)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t... 72 more").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:118)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.log4j2.GelfLogAppenderTests.testNullMessageAndExceptionFallback(GelfLogAppenderTests.java:217)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tSuppressed: java.lang.RuntimeException: suppressed").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t... 71 more").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, false).given(toWrite, "java.lang.IllegalStateException").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t... 70 more").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t\t31 lines skipped for [sun., org.junit, java.lang.reflect.Method]").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:675)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testEmptyMessageAndExceptionFallback(AbstractGelfLogAppenderTests.java:204)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.log4j2.GelfLogAppenderTests.testEmptyMessageAndExceptionFallback(GelfLogAppenderTests.java:231)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\tSuppressed: java.lang.IllegalArgumentException: java.lang.NumberFormatException: For input string: \"text\"").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:74)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:117)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:191)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, false).given(toWrite, "java.lang.RuntimeException: entryMethod").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:43)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:211)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:202)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat java.lang.reflect.Method.invoke(Method.java:498)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:101)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.intern.GelfMessageUnitTests.<clinit>(GelfMessageUnitTests.java:32)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:35)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.jul.GelfLogHandlerTests.testNullMessageAndExceptionFallback(GelfLogHandlerTests.java:206)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "Caused by: biz.paluch.logging.StackTraceFilterUnitTests$MyException: Intermediate 2").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, false).given(toWrite, "biz.paluch.logging.StackTraceFilterUnitTests$MyException: Intermediate 2").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t\t... 70 more").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t... 69 more").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:198)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:104)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, false).given(toWrite, "java.io.IOException: java.lang.Exception: java.lang.Exception").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\t\t17 lines skipped for [org.junit]").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.filterRootCause(StackTraceFilterUnitTests.java:78)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, false).given(toWrite, "biz.paluch.logging.StackTraceFilterUnitTests$MyException: Message").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.log4j.AbstractGelfLogAppenderTests.testNullMessageAndExceptionFallback(AbstractGelfLogAppenderTests.java:190)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.gelf.intern.GelfMessageUnitTests$1.<init>(GelfMessageUnitTests.java:38)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.cause(StackTraceFilterUnitTests.java:124)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate2(StackTraceFilterUnitTests.java:100)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\tSuppressed: java.lang.RuntimeException: suppressed").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\tCaused by: java.lang.NumberFormatException: For input string: \"text\"").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:62)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:124)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.filterWholeStackTrace(StackTraceFilterUnitTests.java:43)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "Caused by: java.lang.IllegalStateException: Some illegal state").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tSuppressed: java.lang.IllegalStateException: Some illegal state").given(AT_PATTERN, "1.xml").checkFalse(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\t\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate3(StackTraceFilterUnitTests.java:119)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat biz.paluch.logging.StackTraceFilterUnitTests.intermediate1(StackTraceFilterUnitTests.java:94)").given(AT_PATTERN, "1.xml").checkTrue(group());
                itest("dev", 440).given(endsWithNewLine, true).given(toWrite, "\tat org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)").given(AT_PATTERN, "1.xml").checkTrue(group());
                String traceElement = getTraceElement(toWrite);
                String forbiddenPackageName = null;
                if (!first) {
                    forbiddenPackageName = tryGetForbiddenPackageName(traceElement);
                }
                first = false;
                if (forbiddenPackageName == null) {
                    afterFiltering();
                    super.write(str, off, len);
                } else {
                    indentationLevel = getIndentation(toWrite);
                    skippedLines++;
                    skippedPackages.add(forbiddenPackageName);
                }
                return;
            }
            afterFiltering();
            super.write(str, off, len);
            endsWithNewLine = str.equals(lineSeparator);
        }

        private void afterFiltering() throws IOException {
            if (!skippedPackages.isEmpty()) {
                // 37 lines skipped for [org.h2, org.hibernate, sun.,
                // java.lang.reflect.Method, $Proxy]
                String skippedPackagesMessage = getSkippedPackagesMessage(skippedPackages, skippedLines, indentationLevel);
                skippedPackages.clear();
                skippedLines = 0;
                write(skippedPackagesMessage);
                write(lineSeparator);
                // at hib.HibExample.test(HibExample.java:18)
                indentationLevel = 0;
            }
        }

        private String getTraceElement(String toWrite) {
            return toWrite.substring(toWrite.indexOf(traceElementPrefix) + traceElementPrefix.length());
        }

        @Override
        public void close() throws IOException {
            if (skippedLines > 0) {
                write(getSkippedPackagesMessage(skippedPackages, skippedLines, indentationLevel));
            }
            super.close();
        }
    }
}
