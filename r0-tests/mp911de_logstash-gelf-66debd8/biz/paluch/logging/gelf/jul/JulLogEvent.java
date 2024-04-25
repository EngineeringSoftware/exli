package biz.paluch.logging.gelf.jul;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import biz.paluch.logging.gelf.*;
import biz.paluch.logging.gelf.intern.GelfMessage;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * {@link LogEvent} implementation for a Java Util Logging {@link LogRecord}.
 *
 * @author Mark Paluch
 * @author Loïc Mathieu
 * @author Ralf Thaenert
 * @since 26.09.13 15:22
 */
public class JulLogEvent implements LogEvent {

    private static Map<String, String> threadNameCache = new ConcurrentHashMap<>();

    private LogRecord logRecord;

    public JulLogEvent(LogRecord logRecord) {
        this.logRecord = logRecord;
    }

    @Override
    public String getMessage() {
        return createMessage(logRecord);
    }

    @Override
    public Object[] getParameters() {
        return logRecord.getParameters();
    }

    @Override
    public Throwable getThrowable() {
        return logRecord.getThrown();
    }

    @Override
    public long getLogTimestamp() {
        return logRecord.getMillis();
    }

    @Override
    public String getSyslogLevel() {
        return "" + levelToSyslogLevel(logRecord.getLevel());
    }

    private String createMessage(LogRecord record) {
        String message = record.getMessage();
        Object[] parameters = record.getParameters();
        if (message == null) {
            message = "";
        }
        if (record.getResourceBundle() != null && record.getResourceBundle().containsKey(message)) {
            message = record.getResourceBundle().getString(message);
        }
        if (parameters != null && parameters.length > 0) {
            String originalMessage = message;
            // by default, using {0}, {1}, etc. -> MessageFormat
            if (message.indexOf('{') != -1) {
                itest("dev", 74).given(message, "foo bar test log message {0}").checkTrue(group());
                itest("dev", 74).given(message, "params %d").checkFalse(group());
                itest("dev", 74).given(message, "foo bar test log message %s").checkFalse(group());
                itest("dev", 74).given(message, "params %s and %d").checkFalse(group());
                itest("dev", 74).given(message, "foo bar %s").checkFalse(group());
                itest("dev", 74).given(message, "foo bar ''%s''").checkFalse(group());
                itest("dev", 74).given(message, "Foo {0}").checkTrue(group());
                itest("dev", 74).given(message, "message1").checkFalse(group());
                itest("dev", 74).given(message, "foo bar {0}").checkTrue(group());
                itest("dev", 74).given(message, "foo bar '%s'").checkFalse(group());
                itest("dev", 74).given(message, "params {a}").checkTrue(group());
                itest("dev", 74).given(message, "%sdfsdfk#! {0}").checkTrue(group());
                itest("dev", 74).given(message, "params {0} and {1}").checkTrue(group());
                try {
                    message = MessageFormat.format(message, parameters);
                    itest("dev", 76).given(message, "params {0} and {1}").given(parameters, "9.xml").checkEq(message, "params a and b");
                    itest("dev", 76).given(message, "foo bar test log message {0}").given(parameters, new String[] { "aaa" }).checkEq(message, "foo bar test log message aaa");
                    itest("dev", 76).given(message, "%sdfsdfk#! {0}").given(parameters, new String[] { "aaa" }).checkEq(message, "%sdfsdfk#! aaa");
                    itest("dev", 76).given(message, "Foo {0}").given(parameters, "2.xml").checkEq(message, "Foo bar");
                    itest("dev", 76).given(message, "foo bar {0}").given(parameters, new String[] { "aaa" }).checkEq(message, "foo bar aaa");
                    itest("dev", 76).given(message, "Foo {0}").given(parameters, "4.xml").checkEq(message, "Foo baz");
                } catch (IllegalArgumentException e) {
                    // leaving message as it is to avoid compatibility problems
                    message = record.getMessage();
                } catch (NullPointerException e) {
                    // ignore
                }
            }
            if (message.equals(originalMessage)) {
                // if the text is the same, assuming this is String.format type log (%s, %d, etc.)
                try {
                    message = String.format(message, parameters);
                    itest("dev", 88).given(message, "foo bar test log message %s").given(parameters, new String[] { "aaa" }).checkEq(message, "foo bar test log message aaa");
                    itest("dev", 88).given(message, "foo bar %s").given(parameters, new String[] { "aaa" }).checkEq(message, "foo bar aaa");
                    itest("dev", 88).given(message, "params %s and %d").given(parameters, "10.xml").checkEq(message, "params a and 1");
                    itest("dev", 88).given(message, "message1").given(parameters, "9.xml").checkEq(message, "message1");
                    itest("dev", 88).given(message, "foo bar ''%s''").given(parameters, new String[] { "aaa" }).checkEq(message, "foo bar ''aaa''");
                    itest("dev", 88).given(message, "foo bar '%s'").given(parameters, new String[] { "aaa" }).checkEq(message, "foo bar 'aaa'");
                } catch (IllegalFormatException e) {
                    // leaving message as it is to avoid compatibility problems
                    message = record.getMessage();
                } catch (NullPointerException e) {
                    // ignore
                }
            }
        }
        return message;
    }

    private String getThreadName(LogRecord record) {
        String cacheKey = "" + record.getThreadID();
        if (threadNameCache.containsKey(cacheKey)) {
            return threadNameCache.get(cacheKey);
        }
        long threadId = record.getThreadID();
        String threadName = cacheKey;
        Thread currentThread = Thread.currentThread();
        if (record.getThreadID() == currentThread.getId()) {
            threadName = currentThread.getName();
        } else {
            Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
            for (Thread thread : threadSet) {
                if (thread.getId() == threadId) {
                    threadName = thread.getName();
                    break;
                }
            }
        }
        threadNameCache.put(cacheKey, threadName);
        return threadName;
    }

    private int levelToSyslogLevel(final Level level) {
        if (level.intValue() <= Level.CONFIG.intValue()) {
            return GelfMessage.DEFAUL_LEVEL;
        }
        if (level.intValue() <= Level.INFO.intValue()) {
            return 6;
        }
        if (level.intValue() <= Level.WARNING.intValue()) {
            return 4;
        }
        if (level.intValue() <= Level.SEVERE.intValue()) {
            return 3;
        }
        if (level.intValue() > Level.SEVERE.intValue()) {
            return 2;
        }
        return GelfMessage.DEFAUL_LEVEL;
    }

    public Values getValues(MessageField field) {
        if (field instanceof LogMessageField) {
            return new Values(field.getName(), getValue((LogMessageField) field));
        }
        throw new UnsupportedOperationException("Cannot provide value for " + field);
    }

    public String getValue(LogMessageField field) {
        switch(field.getNamedLogField()) {
            case Severity:
                return logRecord.getLevel().getName();
            case ThreadName:
                return getThreadName(logRecord);
            case SourceClassName:
                return getSourceClassName();
            case SourceMethodName:
                return getSourceMethodName();
            case SourceSimpleClassName:
                return GelfUtil.getSimpleClassName(logRecord.getSourceClassName());
            case LoggerName:
                return logRecord.getLoggerName();
        }
        throw new UnsupportedOperationException("Cannot provide value for " + field);
    }

    private String getSourceMethodName() {
        String sourceMethodName = logRecord.getSourceMethodName();
        if (sourceMethodName == null || "<unknown>".equals(sourceMethodName)) {
            return null;
        }
        return sourceMethodName;
    }

    private String getSourceClassName() {
        String sourceClassName = logRecord.getSourceClassName();
        if (sourceClassName == null || "<unknown>".equals(sourceClassName)) {
            return null;
        }
        return sourceClassName;
    }

    @Override
    public String getMdcValue(String mdcName) {
        return null;
    }

    @Override
    public Set<String> getMdcNames() {
        return Collections.emptySet();
    }
}
