package biz.paluch.logging.gelf.wildfly;

import static biz.paluch.logging.gelf.LogMessageField.NamedLogField.*;
import java.util.*;
import org.jboss.logmanager.ExtFormatter;
import org.jboss.logmanager.ExtLogRecord;
import biz.paluch.logging.gelf.LogMessageField;
import biz.paluch.logging.gelf.MdcGelfMessageAssembler;
import biz.paluch.logging.gelf.intern.ConfigurationSupport;
import biz.paluch.logging.gelf.intern.GelfMessage;
import biz.paluch.logging.gelf.jboss7.JBoss7JulLogEvent;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 *  Log-Formatter for JSON using fields specified within GELF. This formatter will produce a JSON object for each log event.
 *  Example:
 *
 *  <code>
 *  {
 *     "NDC": "ndc message",
 *     "timestamp": "1439319236.722",
 *     "SourceClassName": "biz.paluch.logging.gelf.wildfly.WildFlyGelfLogFormatterTest",
 *     "SourceMethodName": "testDefaults",
 *     "level": "6",
 *     "SourceSimpleClassName": "WildFlyGelfLogFormatterTest",
 *     "facility": "logstash-gelf",
 *     "full_message": "foo bar test log message",
 *     "short_message": "foo bar test log message",
 *     "MySeverity": "INFO",
 *     "LoggerName": "biz.paluch.logging.gelf.wildfly.WildFlyGelfLogFormatterTest",
 *     "Thread": "main",
 *     "MyTime": "2015-08-11 20:53:56,0722"
 * }
 *  </code>
 *
 *  Following parameters are supported/needed:
 *  <ul>
 *  <li>lineBreak (Optional): End of line, defaults to {@code \n}</li>
 *  <li>fields (Optional): Comma-separated list of log event fields that should be included in the JSON. Defaults to
 *  {@code Time, Severity, ThreadName, SourceClassName, SourceMethodName, SourceSimpleClassName, LoggerName, NDC}</li>
 *  <li>originHost (Optional): Originating Hostname, default FQDN Hostname</li>
 *  <li>extractStackTrace (Optional): Post Stack-Trace to StackTrace field (true/false/throwable reference [0 = throwable, 1 =
 *  throwable.cause, -1 = root cause]), default false</li>
 *  <li>filterStackTrace (Optional): Perform Stack-Trace filtering (true/false), default false</li>
 *  <li>includeLogMessageParameters (Optional): Include message parameters from the log event (see
 *  {@link ExtLogRecord#getParameters()}, default true</li>
 *  <li>includeLocation (Optional): Include source code location, default true</li>
 *  <li>mdcProfiling (Optional): Perform Profiling (Call-Duration) based on MDC Data. See <a href="#mdcProfiling">MDC
 *  Profiling</a>, default false</li>
 *  <li>facility (Optional): Name of the Facility, default gelf-java</li>
 *  <li>additionalFields(number) (Optional): Post additional fields. Eg. fieldName=Value,field2=value2</li>
 *  <li>additionalFieldTypes (Optional): Type specification for additional and MDC fields. Supported types: String, long, Long,
 *  double, Double and discover (default if not specified, discover field type on parseability). Eg. field=String,field2=double</li>
 *  <li>mdcFields (Optional): Post additional fields, pull Values from MDC. Name of the Fields are comma-separated
 *  Application,Version,SomeOtherFieldName</li>
 *  <li>dynamicMdcFields (Optional): Dynamic MDC Fields allows you to extract MDC values based on one or more regular
 *  expressions. Multiple regex are comma-separated. The name of the MDC entry is used as GELF field name. mdc.*,[mdc|MDC]fields</li>
 *  <li>dynamicMdcFieldTypes (Optional): Pattern-based type specification for additional and MDC fields. Key-value pairs are
 *  comma-separated. Supported types: String, long, Long, double, Double. Eg. my_field.*=String,business\..*\.field=double</li>
 *  <li>includeFullMdc (Optional): Include all fields from the MDC, default false</li>
 *  </ul>
 *  <a name="mdcProfiling"></a> <h2>MDC Profiling</h2>
 *  <p>
 *  MDC Profiling allows to calculate the runtime from request start up to the time until the log message was generated. You must
 *  set one value in the MDC:
 *  <ul>
 *  <li>profiling.requestStart.millis: Time Millis of the Request-Start (Long or String)</li>
 *  </ul>
 *  <p>
 *  Two values are set by the formatter:
 *  </p>
 *  <ul>
 *  <li>profiling.requestEnd: End-Time of the Request-End in Date.toString-representation</li>
 *  <li>profiling.requestDuration: Duration of the request (e.g. 205ms, 16sec)</li>
 *  </ul>
 *
 *  @author Mark Paluch
 *  @author André Krüger
 */
public class WildFlyJsonFormatter extends ExtFormatter {

    public static final String MULTI_VALUE_DELIMITTER = ",";

    private MdcGelfMessageAssembler gelfMessageAssembler = new MdcGelfMessageAssembler();

    private String lineBreak = "\n";

    private boolean wasSetFieldsCalled = false;

    public static final Set<LogMessageField.NamedLogField> SUPPORTED_FIELDS;

    static {
        Set<LogMessageField.NamedLogField> supportedFields = new LinkedHashSet<>();
        supportedFields.add(Time);
        supportedFields.add(Severity);
        supportedFields.add(ThreadName);
        supportedFields.add(SourceClassName);
        supportedFields.add(SourceMethodName);
        supportedFields.add(SourceSimpleClassName);
        supportedFields.add(LoggerName);
        supportedFields.add(NDC);
        supportedFields.add(Server);
        SUPPORTED_FIELDS = Collections.unmodifiableSet(supportedFields);
    }

    @Override
    public String format(ExtLogRecord extLogRecord) {
        if (!wasSetFieldsCalled) {
            addFields(SUPPORTED_FIELDS);
        }
        GelfMessage gelfMessage = gelfMessageAssembler.createGelfMessage(new JBoss7JulLogEvent(extLogRecord));
        return gelfMessage.toJson("") + getLineBreak();
    }

    public void setFields(String fieldSpec) {
        String[] properties = fieldSpec.split(MULTI_VALUE_DELIMITTER);
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='', namedLogField=NDC]").checkEq(properties, new String[] { "PatternLogMessageField [name=''", " namedLogField=NDC]" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.resolutionOrder").checkEq(properties, new String[] { "logstash-gelf.resolutionOrder" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "1}").checkEq(properties, new String[] { "1}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='a2VlcEFsaXZl', value='ZnVsbF9tZXNzYWdl']").checkEq(properties, new String[] { "StaticMessageField [name='a2VlcEFsaXZl'", " value='ZnVsbF9tZXNzYWdl']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "aW5jbHVkZUxvZ01lc3NhZ2VQYXJhbWV0ZXJz").checkEq(properties, new String[] { "aW5jbHVkZUxvZ01lc3NhZ2VQYXJhbWV0ZXJz" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "mdcProfiling").checkEq(properties, new String[] { "mdcProfiling" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Double").checkEq(properties, new String[] { "Double" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Ykc5bmMzUmhjMmd0WjJWc1ppNVRkR0ZqYTFSeVlXTmxSbWxzZEdWeUxuWmxjbUp2YzJVPQ==").checkEq(properties, new String[] { "Ykc5bmMzUmhjMmd0WjJWc1ppNVRkR0ZqYTFSeVlXTmxSbWxzZEdWeUxuWmxjbUp2YzJVPQ==" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TkRD").checkEq(properties, new String[] { "TkRD" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='', namedLogField=SourceMethodName]").checkEq(properties, new String[] { "PatternLogMessageField [name=''", " namedLogField=SourceMethodName]" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "035\",\"level\":\"keepAlive\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "035\"", "\"level\":\"keepAlive\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TWRjTWVzc2FnZUZpZWxkIFtuYW1lPScnLCBtZGNOYW1lPSdmYWxzZSdd").checkEq(properties, new String[] { "TWRjTWVzc2FnZUZpZWxkIFtuYW1lPScnLCBtZGNOYW1lPSdmYWxzZSdd" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='af98d36bacae', mdcName='logstash-gelf.buffer.size']").checkEq(properties, new String[] { "MdcMessageField [name='af98d36bacae'", " mdcName='logstash-gelf.buffer.size']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "kafka").checkEq(properties, new String[] { "kafka" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.skipHostnameResolution").checkEq(properties, new String[] { "logstash-gelf.skipHostnameResolution" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.hostname").checkEq(properties, new String[] { "logstash-gelf.hostname" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "yyyy-MM-dd HH:mm:ss,SSS").checkEq(properties, new String[] { "yyyy-MM-dd HH:mm:ss", "SSS" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSd5eXl5LU1NLWRkIEhIOm1tOnNzLFNTUycsIG5hbWVkTG9nRmllbGQ9U291cmNlU2ltcGxlQ2xhc3NOYW1lXQ==").checkEq(properties, new String[] { "TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSd5eXl5LU1NLWRkIEhIOm1tOnNzLFNTUycsIG5hbWVkTG9nRmllbGQ9U291cmNlU2ltcGxlQ2xhc3NOYW1lXQ==" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdhcHBlbmRlcicsIHZhbHVlPSdNZXNzYWdlUGFyYW0nXQ==").checkEq(properties, new String[] { "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdhcHBlbmRlcicsIHZhbHVlPSdNZXNzYWdlUGFyYW0nXQ==" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"level\":\"logstash-gelf.fqdn.hostname\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"level\":\"logstash-gelf.fqdn.hostname\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "size").checkEq(properties, new String[] { "size" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='', value='hi!']").checkEq(properties, new String[] { "StaticMessageField [name=''", " value='hi!']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "timestamp").checkEq(properties, new String[] { "timestamp" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "readTimeout").checkEq(properties, new String[] { "readTimeout" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "aGkh").checkEq(properties, new String[] { "aGkh" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TWRjTWVzc2FnZUZpZWxkIFtuYW1lPSdyZWRpcycsIG1kY05hbWU9Jydd").checkEq(properties, new String[] { "TWRjTWVzc2FnZUZpZWxkIFtuYW1lPSdyZWRpcycsIG1kY05hbWU9Jydd" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='includeFullMdc', mdcName='extractStackTrace']").checkEq(properties, new String[] { "MdcMessageField [name='includeFullMdc'", " mdcName='extractStackTrace']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TVM0dw==").checkEq(properties, new String[] { "TVM0dw==" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.buffer.size").checkEq(properties, new String[] { "logstash-gelf.buffer.size" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='af98d36bacae', namedLogField=SourceClassName]").checkEq(properties, new String[] { "LogMessageField [name='af98d36bacae'", " namedLogField=SourceClassName]" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='yyyy-MM-dd HH:mm:ss,SSS', namedLogField=SourceSimpleClassName]").checkEq(properties, new String[] { "LogMessageField [name='yyyy-MM-dd HH:mm:ss", "SSS'", " namedLogField=SourceSimpleClassName]" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"0.007\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"timestamp\":\"0.007\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='NDC', value='eyJ0aW1lc3RhbXAiOiIwLjAwNyIsImZhY2lsaXR5IjoibG9nc3Rhc2gtZ2VsZiJ9']").checkEq(properties, new String[] { "StaticMessageField [name='NDC'", " value='eyJ0aW1lc3RhbXAiOiIwLjAwNyIsImZhY2lsaXR5IjoibG9nc3Rhc2gtZ2VsZiJ9']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJ0aW1lc3RhbXAiOiIwLjAwNyIsImZhY2lsaXR5IjoibG9nc3Rhc2gtZ2VsZiJ9").checkEq(properties, new String[] { "eyJ0aW1lc3RhbXAiOiIwLjAwNyIsImZhY2lsaXR5IjoibG9nc3Rhc2gtZ2VsZiJ9" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "filterStackTrace").checkEq(properties, new String[] { "filterStackTrace" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"logstash-gelf\",\"_resolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"facility\":\"logstash-gelf\"", "\"_resolutionOrder\":1.1}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "GelfLogbackAppender[null]").checkEq(properties, new String[] { "GelfLogbackAppender[null]" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"logstash-gelf\",\"TimeresolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"facility\":\"logstash-gelf\"", "\"TimeresolutionOrder\":1.1}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "localhost,network").checkEq(properties, new String[] { "localhost", "network" });
        itest("dev", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Marker").checkEq(properties, new String[] { "Marker" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"logstash-gelf\",\"logstash-gelf.StackTraceFilter.verboseresolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"facility\":\"logstash-gelf\"", "\"logstash-gelf.StackTraceFilter.verboseresolutionOrder\":1.1}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "YXBwZW5kZXI=").checkEq(properties, new String[] { "YXBwZW5kZXI=" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "extractStackTrace").checkEq(properties, new String[] { "extractStackTrace" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"level\":\"additionalFieldTypes\",\"facility\":\"-0.001\",\"_graylogPort\":\"double\",\"_resolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"level\":\"additionalFieldTypes\"", "\"facility\":\"-0.001\"", "\"_graylogPort\":\"double\"", "\"_resolutionOrder\":1.1}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='', namedLogField=Time]").checkEq(properties, new String[] { "PatternLogMessageField [name=''", " namedLogField=Time]" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dynamicMdcFields.").checkEq(properties, new String[] { "dynamicMdcFields." });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='ZGVsaXZlcnlBdHRlbXB0cw==', mdcName='logstash-gelf.hostname']").checkEq(properties, new String[] { "MdcMessageField [name='ZGVsaXZlcnlBdHRlbXB0cw=='", " mdcName='logstash-gelf.hostname']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "a2VlcEFsaXZl").checkEq(properties, new String[] { "a2VlcEFsaXZl" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "short_message").checkEq(properties, new String[] { "short_message" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "full_message").checkEq(properties, new String[] { "full_message" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "hi!").checkEq(properties, new String[] { "hi!" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='timestamp', mdcName='{\"level\":\"additionalFieldTypes\",\"facility\":\"logstash-gelf\",\"kafkaresolutionOrder\":1.1}']").checkEq(properties, new String[] { "MdcMessageField [name='timestamp'", " mdcName='{\"level\":\"additionalFieldTypes\"", "\"facility\":\"logstash-gelf\"", "\"kafkaresolutionOrder\":1.1}']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "biz.paluch.logging.gelf.logback.GelfLogbackAppender[null]").checkEq(properties, new String[] { "biz.paluch.logging.gelf.logback.GelfLogbackAppender[null]" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "ZnVsbF9tZXNzYWdl").checkEq(properties, new String[] { "ZnVsbF9tZXNzYWdl" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJsb2dzdGFzaC1nZWxmLkxvZ01lc3NhZ2VGaWVsZC52ZXJib3NlcmVzb2x1dGlvbk9yZGVyIjoxLjF9").checkEq(properties, new String[] { "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJsb2dzdGFzaC1nZWxmLkxvZ01lc3NhZ2VGaWVsZC52ZXJib3NlcmVzb2x1dGlvbk9yZGVyIjoxLjF9" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "c2hvcnRfbWVzc2FnZQ==").checkEq(properties, new String[] { "c2hvcnRfbWVzc2FnZQ==" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='deliveryAttempts', mdcName='profiling.requestDuration']").checkEq(properties, new String[] { "MdcMessageField [name='deliveryAttempts'", " mdcName='profiling.requestDuration']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "pooling").checkEq(properties, new String[] { "pooling" });
        itest("dev", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Time,Severity,ThreadName,SourceSimpleClassName,NDC").checkEq(properties, new String[] { "Time", "Severity", "ThreadName", "SourceSimpleClassName", "NDC" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "double").checkEq(properties, new String[] { "double" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "connectionTimeout").checkEq(properties, new String[] { "connectionTimeout" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJ2ZXJzaW9uIjoicmVkaXMtc2VudGluZWwiLCJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYifQ==").checkEq(properties, new String[] { "eyJ2ZXJzaW9uIjoicmVkaXMtc2VudGluZWwiLCJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYifQ==" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "long").checkEq(properties, new String[] { "long" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name=',', value='logstash-gelf.buffer.size']").checkEq(properties, new String[] { "StaticMessageField [name='", "'", " value='logstash-gelf.buffer.size']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "graylogHost").checkEq(properties, new String[] { "graylogHost" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='Server']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='Server']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='redis', mdcName='resolutionOrder']").checkEq(properties, new String[] { "MdcMessageField [name='redis'", " mdcName='resolutionOrder']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "bGV2ZWw=").checkEq(properties, new String[] { "bGV2ZWw=" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "additionalFieldType.").checkEq(properties, new String[] { "additionalFieldType." });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "SourceSimpleClassName").checkEq(properties, new String[] { "SourceSimpleClassName" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "redis-sentinel").checkEq(properties, new String[] { "redis-sentinel" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MS4w").checkEq(properties, new String[] { "MS4w" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"level\":\"NDC\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"level\":\"NDC\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"originHost\",\"TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSdsb2dzdGFzaC1nZWxmLkxvZ01lc3NhZ2VGaWVsZC52ZXJib3NlJywgbmFtZWRMb2dGaWVsZD1Tb3VyY2VDbGFzc05hbWVdresolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"facility\":\"originHost\"", "\"TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSdsb2dzdGFzaC1nZWxmLkxvZ01lc3NhZ2VGaWVsZC52ZXJib3NlJywgbmFtZWRMb2dGaWVsZD1Tb3VyY2VDbGFzc05hbWVdresolutionOrder\":1.1}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='profiling.requestStart.millis', namedLogField=SourceClassName]").checkEq(properties, new String[] { "PatternLogMessageField [name='profiling.requestStart.millis'", " namedLogField=SourceClassName]" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "0").checkEq(properties, new String[] { "0" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "keepAlive").checkEq(properties, new String[] { "keepAlive" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "writeBackoffTime").checkEq(properties, new String[] { "writeBackoffTime" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJ2ZXJzaW9uIjoie1wiZmFjaWxpdHlcIjpcImRpc2NvdmVyXCJ9IiwibGV2ZWwiOiJwcm9maWxpbmcucmVxdWVzdER1cmF0aW9uIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIn0=").checkEq(properties, new String[] { "eyJ2ZXJzaW9uIjoie1wiZmFjaWxpdHlcIjpcImRpc2NvdmVyXCJ9IiwibGV2ZWwiOiJwcm9maWxpbmcucmVxdWVzdER1cmF0aW9uIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIn0=" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "327.68").checkEq(properties, new String[] { "327.68" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"level\":\"additionalFieldTypes\",\"facility\":\"logstash-gelf\",\"_resolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"short_message\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"level\":\"additionalFieldTypes\"", "\"facility\":\"logstash-gelf\"", "\"_resolutionOrder\":1.1}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='keepAlive']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='keepAlive']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "VkVjNWJsUlhWbnBqTWtadVdsVmFjRnBYZUd0SlJuUjFXVmN4YkZCVFpITmlNbVI2WkVkR2VtRkRNVzVhVjNodFRHMW9kbU16VW5WWlZ6RnNTbmwzWjJKdFJuUmFWMUpOWWpKa1IyRlhWbk5hUkRGUFVrVk9aQT09").checkEq(properties, new String[] { "VkVjNWJsUlhWbnBqTWtadVdsVmFjRnBYZUd0SlJuUjFXVmN4YkZCVFpITmlNbVI2WkVkR2VtRkRNVzVhVjNodFRHMW9kbU16VW5WWlZ6RnNTbmwzWjJKdFJuUmFWMUpOWWpKa1IyRlhWbk5hUkRGUFVrVk9aQT09" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eXl5eS1NTS1kZCBISDptbTpzcyxTU1M=").checkEq(properties, new String[] { "eXl5eS1NTS1kZCBISDptbTpzcyxTU1M=" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"logstash-gelf\",\"includeFullMdc\":\"graylogPort\"}").checkEq(properties, new String[] { "{\"facility\":\"logstash-gelf\"", "\"includeFullMdc\":\"graylogPort\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "filter").checkEq(properties, new String[] { "filter" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "id").checkEq(properties, new String[] { "id" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdOREMnLCB2YWx1ZT0nZXlKMGFXMWxjM1JoYlhBaU9pSXdMakF3TnlJc0ltWmhZMmxzYVhSNUlqb2liRzluYzNSaGMyZ3RaMlZzWmlKOSdd").checkEq(properties, new String[] { "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdOREMnLCB2YWx1ZT0nZXlKMGFXMWxjM1JoYlhBaU9pSXdMakF3TnlJc0ltWmhZMmxzYVhSNUlqb2liRzluYzNSaGMyZ3RaMlZzWmlKOSdd" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"version\":\"facility\",\"level\":\"additionalFieldTypes\",\"facility\":\"logstash-gelf\",\"_graylogPort\":\"double\",\"_resolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"version\":\"facility\"", "\"level\":\"additionalFieldTypes\"", "\"facility\":\"logstash-gelf\"", "\"_graylogPort\":\"double\"", "\"_resolutionOrder\":1.1}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"8.192\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"timestamp\":\"8.192\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "version").checkEq(properties, new String[] { "version" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "1.0").checkEq(properties, new String[] { "1.0" });
        itest("dev", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dummy").checkEq(properties, new String[] { "dummy" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "1}', mdcName='level']").checkEq(properties, new String[] { "1}'", " mdcName='level']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"readTimeout\",\"facility\":\"logstash-gelf\",\"{\\\"facility\\\":\\\"logstash-gelf\\\",\\\"includeFullMdc\\\":\\\"graylogPort\\\"}mdcField.\":\"writeBackoffTime\"}").checkEq(properties, new String[] { "{\"short_message\":\"readTimeout\"", "\"facility\":\"logstash-gelf\"", "\"{\\\"facility\\\":\\\"logstash-gelf\\\"", "\\\"includeFullMdc\\\":\\\"graylogPort\\\"}mdcField.\":\"writeBackoffTime\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0naW5jbHVkZUZ1bGxNZGMnLCBuYW1lZExvZ0ZpZWxkPVNvdXJjZU1ldGhvZE5hbWVd").checkEq(properties, new String[] { "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0naW5jbHVkZUZ1bGxNZGMnLCBuYW1lZExvZ0ZpZWxkPVNvdXJjZU1ldGhvZE5hbWVd" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MessageParam").checkEq(properties, new String[] { "MessageParam" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='', mdcName='false']").checkEq(properties, new String[] { "MdcMessageField [name=''", " mdcName='false']" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"0.001\",\"facility\":\"additionalField.\"}").checkEq(properties, new String[] { "{\"timestamp\":\"0.001\"", "\"facility\":\"additionalField.\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "007\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "007\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "timestampPattern").checkEq(properties, new String[] { "timestampPattern" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "").checkEq(properties, new String[] { "" });
        itest("randoop", 119).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"level\":\"MdcMessageField [name='logstash-gelf.hostname', mdcName='']\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"level\":\"MdcMessageField [name='logstash-gelf.hostname'", " mdcName='']\"", "\"facility\":\"logstash-gelf\"}" });
        List<LogMessageField.NamedLogField> fields = new ArrayList<>();
        for (String field : properties) {
            LogMessageField.NamedLogField namedLogField = LogMessageField.NamedLogField.byName(field.trim());
            if (namedLogField == null) {
                throw new IllegalArgumentException("Cannot resolve field name '" + field + "' to a field. Supported field names are: " + SUPPORTED_FIELDS);
            }
            if (!SUPPORTED_FIELDS.contains(namedLogField)) {
                throw new IllegalArgumentException("Field '" + field + "' is not supported. Supported field names are: " + SUPPORTED_FIELDS);
            }
            fields.add(namedLogField);
        }
        addFields(fields);
    }

    private void addFields(Collection<LogMessageField.NamedLogField> fields) {
        gelfMessageAssembler.addFields(LogMessageField.getDefaultMapping(fields.toArray(new LogMessageField.NamedLogField[fields.size()])));
        wasSetFieldsCalled = true;
    }

    public void setAdditionalFields(String spec) {
        ConfigurationSupport.setAdditionalFields(spec, gelfMessageAssembler);
    }

    public void setAdditionalFieldTypes(String spec) {
        ConfigurationSupport.setAdditionalFieldTypes(spec, gelfMessageAssembler);
    }

    public void setMdcFields(String spec) {
        ConfigurationSupport.setMdcFields(spec, gelfMessageAssembler);
    }

    public void setDynamicMdcFields(String spec) {
        ConfigurationSupport.setDynamicMdcFields(spec, gelfMessageAssembler);
    }

    public void setDynamicMdcFieldTypes(String spec) {
        ConfigurationSupport.setDynamicMdcFieldTypes(spec, gelfMessageAssembler);
    }

    public boolean isIncludeLocation() {
        return gelfMessageAssembler.isIncludeLocation();
    }

    public void setIncludeLocation(boolean includeLocation) {
        gelfMessageAssembler.setIncludeLocation(includeLocation);
    }

    public boolean isMdcProfiling() {
        return gelfMessageAssembler.isMdcProfiling();
    }

    public void setMdcProfiling(boolean mdcProfiling) {
        gelfMessageAssembler.setMdcProfiling(mdcProfiling);
    }

    public boolean isIncludeFullMdc() {
        return gelfMessageAssembler.isIncludeFullMdc();
    }

    public void setIncludeFullMdc(boolean includeFullMdc) {
        gelfMessageAssembler.setIncludeFullMdc(includeFullMdc);
    }

    public String getOriginHost() {
        return gelfMessageAssembler.getOriginHost();
    }

    public void setOriginHost(String originHost) {
        gelfMessageAssembler.setOriginHost(originHost);
    }

    public String getFacility() {
        return gelfMessageAssembler.getFacility();
    }

    public void setFacility(String facility) {
        gelfMessageAssembler.setFacility(facility);
    }

    public String getExtractStackTrace() {
        return gelfMessageAssembler.getExtractStackTrace();
    }

    public void setExtractStackTrace(String extractStacktrace) {
        gelfMessageAssembler.setExtractStackTrace(extractStacktrace);
    }

    public boolean isFilterStackTrace() {
        return gelfMessageAssembler.isFilterStackTrace();
    }

    public void setFilterStackTrace(boolean filterStackTrace) {
        gelfMessageAssembler.setFilterStackTrace(filterStackTrace);
    }

    public String getTimestampPattern() {
        return gelfMessageAssembler.getTimestampPattern();
    }

    public void setTimestampPattern(String timestampPattern) {
        gelfMessageAssembler.setTimestampPattern(timestampPattern);
    }

    public String getVersion() {
        return gelfMessageAssembler.getVersion();
    }

    public void setVersion(String version) {
        gelfMessageAssembler.setVersion(version);
    }

    public String getLineBreak() {
        return lineBreak;
    }

    public void setLineBreak(String lineBreak) {
        this.lineBreak = lineBreak;
    }

    public boolean isIncludeLogMessageParameters() {
        return gelfMessageAssembler.isIncludeLogMessageParameters();
    }

    public void setIncludeLogMessageParameters(boolean includeLogMessageParameters) {
        gelfMessageAssembler.setIncludeLogMessageParameters(includeLogMessageParameters);
    }
}
