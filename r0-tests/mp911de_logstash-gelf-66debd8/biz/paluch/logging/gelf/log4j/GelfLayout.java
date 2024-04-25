package biz.paluch.logging.gelf.log4j;

import static biz.paluch.logging.gelf.LogMessageField.NamedLogField.*;
import java.util.*;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;
import biz.paluch.logging.gelf.LogMessageField;
import biz.paluch.logging.gelf.MdcGelfMessageAssembler;
import biz.paluch.logging.gelf.intern.ConfigurationSupport;
import biz.paluch.logging.gelf.intern.GelfMessage;
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
 *  <li>lineBreak (Optional): End of line, platform dependent default value, see {@code System.getProperty("line.separator")}</li>
 *  <li>fields (Optional): Comma-separated list of log event fields that should be included in the JSON. Defaults to
 *  {@code Time, Severity, ThreadName, SourceClassName, SourceMethodName, SourceSimpleClassName, LoggerName, NDC}</li>
 *  <li>originHost (Optional): Originating Hostname, default FQDN Hostname</li>
 *  <li>extractStackTrace (Optional): Post Stack-Trace to StackTrace field (true/false/throwable reference [0 = throwable, 1 =
 *  throwable.cause, -1 = root cause]), default false</li>
 *  <li>filterStackTrace (Optional): Perform Stack-Trace filtering (true/false), default false</li>
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
 *  @author <a href="mailto:kai.geisselhardt@kaufland.com">Kai Geisselhardt</a>
 *  @author Mark Paluch
 */
public class GelfLayout extends Layout {

    public static final String MULTI_VALUE_DELIMITTER = ",";

    public static final Set<LogMessageField.NamedLogField> SUPPORTED_FIELDS;

    private final MdcGelfMessageAssembler gelfMessageAssembler = new MdcGelfMessageAssembler();

    private String lineBreak = Layout.LINE_SEP;

    private boolean wasSetFieldsCalled = false;

    static {
        Set<LogMessageField.NamedLogField> supportedFields = new LinkedHashSet<>();
        supportedFields.add(Time);
        supportedFields.add(Severity);
        supportedFields.add(ThreadName);
        supportedFields.add(SourceClassName);
        supportedFields.add(SourceMethodName);
        supportedFields.add(SourceLineNumber);
        supportedFields.add(SourceSimpleClassName);
        supportedFields.add(LoggerName);
        supportedFields.add(NDC);
        supportedFields.add(Server);
        SUPPORTED_FIELDS = Collections.unmodifiableSet(supportedFields);
    }

    public GelfLayout() {
        super();
    }

    @Override
    public String format(LoggingEvent loggingEvent) {
        if (!wasSetFieldsCalled) {
            addFields(SUPPORTED_FIELDS);
        }
        GelfMessage gelfMessage = gelfMessageAssembler.createGelfMessage(new Log4jLogEvent(loggingEvent));
        return gelfMessage.toJson("") + lineBreak;
    }

    @Override
    public boolean ignoresThrowable() {
        return false;
    }

    @Override
    public void activateOptions() {
        // nothing to do
    }

    public void setFields(String fieldSpec) {
        String[] properties = fieldSpec.split(MULTI_VALUE_DELIMITTER);
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "graylogPort").checkEq(properties, new String[] { "graylogPort" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"discover\"}").checkEq(properties, new String[] { "{\"facility\":\"discover\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "keepAlive").checkEq(properties, new String[] { "keepAlive" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Q29udmVydGVy").checkEq(properties, new String[] { "Q29udmVydGVy" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "network,localhost").checkEq(properties, new String[] { "network", "localhost" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJsZXZlbCI6ImFkZGl0aW9uYWxGaWVsZFR5cGVzIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIiwidGV4dC9wbGFpbnJlc29sdXRpb25PcmRlciI6MS4xfQ==").checkEq(properties, new String[] { "eyJsZXZlbCI6ImFkZGl0aW9uYWxGaWVsZFR5cGVzIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIiwidGV4dC9wbGFpbnJlc29sdXRpb25PcmRlciI6MS4xfQ==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "biz.paluch.logging.gelf.logback.GelfLogbackAppender[StaticMessageField [name=',', value='logstash-gelf.buffer.size']]").checkEq(properties, new String[] { "biz.paluch.logging.gelf.logback.GelfLogbackAppender[StaticMessageField [name='", "'", " value='logstash-gelf.buffer.size']]" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"host\":\"{\\\"level\\\":\\\"additionalFieldTypes\\\",\\\"facility\\\":\\\"logstash-gelf\\\",\\\"kafkaresolutionOrder\\\":1.1}\",\"level\":\"NDC\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"host\":\"{\\\"level\\\":\\\"additionalFieldTypes\\\"", "\\\"facility\\\":\\\"logstash-gelf\\\"", "\\\"kafkaresolutionOrder\\\":1.1}\"", "\"level\":\"NDC\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='StaticMessageField [name='', value='hi!']', mdcName='true']").checkEq(properties, new String[] { "MdcMessageField [name='StaticMessageField [name=''", " value='hi!']'", " mdcName='true']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "resolutionOrder\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "resolutionOrder\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"host\":\"{\\\"timestamp\\\":\\\"0.052\\\",\\\"facility\\\":\\\"logstash-gelf\\\",\\\"_resolutionOrder\\\":1.1}\",\"timestamp\":\"0.001\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"host\":\"{\\\"timestamp\\\":\\\"0.052\\\"", "\\\"facility\\\":\\\"logstash-gelf\\\"", "\\\"_resolutionOrder\\\":1.1}\"", "\"timestamp\":\"0.001\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "localhost,network").checkEq(properties, new String[] { "localhost", "network" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "extractStackTrace").checkEq(properties, new String[] { "extractStackTrace" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MessageParam").checkEq(properties, new String[] { "MessageParam" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='LoggerName']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='LoggerName']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='maximumMessageSize']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='maximumMessageSize']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "text/plain").checkEq(properties, new String[] { "text/plain" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "HostnameConverter").checkEq(properties, new String[] { "HostnameConverter" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"level\":\"additionalFieldTypes\",\"facility\":\"logstash-gelf\",\"kafkaresolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"level\":\"additionalFieldTypes\"", "\"facility\":\"logstash-gelf\"", "\"kafkaresolutionOrder\":1.1}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "-0.001").checkEq(properties, new String[] { "-0.001" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "U2VydmVy").checkEq(properties, new String[] { "U2VydmVy" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='redis', namedLogField=SourceClassName]").checkEq(properties, new String[] { "PatternLogMessageField [name='redis'", " namedLogField=SourceClassName]" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "YXBwZW5kZXI=").checkEq(properties, new String[] { "YXBwZW5kZXI=" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='', namedLogField=SourceMethodName]").checkEq(properties, new String[] { "PatternLogMessageField [name=''", " namedLogField=SourceMethodName]" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "resolutionOrder").checkEq(properties, new String[] { "resolutionOrder" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "mdcProfiling").checkEq(properties, new String[] { "mdcProfiling" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "SourceMethodName").checkEq(properties, new String[] { "SourceMethodName" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "bG9nc3Rhc2gtZ2VsZi5TdGFja1RyYWNlRmlsdGVyLnZlcmJvc2U=").checkEq(properties, new String[] { "bG9nc3Rhc2gtZ2VsZi5TdGFja1RyYWNlRmlsdGVyLnZlcmJvc2U=" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"0.007\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"timestamp\":\"0.007\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "d3JpdGVCYWNrb2ZmVGhyZXNob2xk").checkEq(properties, new String[] { "d3JpdGVCYWNrb2ZmVGhyZXNob2xk" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "facility").checkEq(properties, new String[] { "facility" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "aG9zdA==").checkEq(properties, new String[] { "aG9zdA==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"originHost\",\"TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSdsb2dzdGFzaC1nZWxmLkxvZ01lc3NhZ2VGaWVsZC52ZXJib3NlJywgbmFtZWRMb2dGaWVsZD1Tb3VyY2VDbGFzc05hbWVdresolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"facility\":\"originHost\"", "\"TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSdsb2dzdGFzaC1nZWxmLkxvZ01lc3NhZ2VGaWVsZC52ZXJib3NlJywgbmFtZWRMb2dGaWVsZD1Tb3VyY2VDbGFzc05hbWVdresolutionOrder\":1.1}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "size").checkEq(properties, new String[] { "size" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"8.192\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"timestamp\":\"8.192\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"level\":\"additionalFieldTypes\",\"facility\":\"logstash-gelf\",\"_graylogPort\":\"double\",\"_resolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"level\":\"additionalFieldTypes\"", "\"facility\":\"logstash-gelf\"", "\"_graylogPort\":\"double\"", "\"_resolutionOrder\":1.1}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "skipHostnameResolution']").checkEq(properties, new String[] { "skipHostnameResolution']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='', mdcName='false']").checkEq(properties, new String[] { "MdcMessageField [name=''", " mdcName='false']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StackTrace").checkEq(properties, new String[] { "StackTrace" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "RHluYW1pY01kY01lc3NhZ2VGaWVsZCBbcmVnZXg9J3RpbWVzdGFtcFBhdHRlcm4nXQ==").checkEq(properties, new String[] { "RHluYW1pY01kY01lc3NhZ2VGaWVsZCBbcmVnZXg9J3RpbWVzdGFtcFBhdHRlcm4nXQ==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"MdcMessageField [name='timestamp', mdcName='{\\\"level\\\":\\\"additionalFieldTypes\\\",\\\"facility\\\":\\\"logstash-gelf\\\",\\\"kafkaresolutionOrder\\\":1.1}']\"}").checkEq(properties, new String[] { "{\"facility\":\"MdcMessageField [name='timestamp'", " mdcName='{\\\"level\\\":\\\"additionalFieldTypes\\\"", "\\\"facility\\\":\\\"logstash-gelf\\\"", "\\\"kafkaresolutionOrder\\\":1.1}']\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "appender").checkEq(properties, new String[] { "appender" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "additionalFieldType.").checkEq(properties, new String[] { "additionalFieldType." });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"logstash-gelf\",\"logstash-gelf.message.poolinga2VlcEFsaXZl\":\"MdcMessageField [name='host', mdcName='host']\",\"logstash-gelf.message.poolingresolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"facility\":\"logstash-gelf\"", "\"logstash-gelf.message.poolinga2VlcEFsaXZl\":\"MdcMessageField [name='host'", " mdcName='host']\"", "\"logstash-gelf.message.poolingresolutionOrder\":1.1}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name=',', value='logstash-gelf.buffer.size']").checkEq(properties, new String[] { "StaticMessageField [name='", "'", " value='logstash-gelf.buffer.size']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "/StackTraceFilter.packages").checkEq(properties, new String[] { "/StackTraceFilter.packages" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "double").checkEq(properties, new String[] { "double" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "millis").checkEq(properties, new String[] { "millis" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='deliveryAttempts', mdcName='profiling.requestDuration']").checkEq(properties, new String[] { "MdcMessageField [name='deliveryAttempts'", " mdcName='profiling.requestDuration']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MA==").checkEq(properties, new String[] { "MA==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='redis-sentinel', mdcName='c2hvcnRfbWVzc2FnZQ==']").checkEq(properties, new String[] { "MdcMessageField [name='redis-sentinel'", " mdcName='c2hvcnRfbWVzc2FnZQ==']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Ykc5bmMzUmhjMmd0WjJWc1ppNVRkR0ZqYTFSeVlXTmxSbWxzZEdWeUxuWmxjbUp2YzJVPQ==").checkEq(properties, new String[] { "Ykc5bmMzUmhjMmd0WjJWc1ppNVRkR0ZqYTFSeVlXTmxSbWxzZEdWeUxuWmxjbUp2YzJVPQ==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "readTimeout").checkEq(properties, new String[] { "readTimeout" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TG9uZw==").checkEq(properties, new String[] { "TG9uZw==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJfcmVzb2x1dGlvbk9yZGVyIjoxLjF9").checkEq(properties, new String[] { "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJfcmVzb2x1dGlvbk9yZGVyIjoxLjF9" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='<empty>', mdcName='timestampPattern']").checkEq(properties, new String[] { "MdcMessageField [name='<empty>'", " mdcName='timestampPattern']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "NDC").checkEq(properties, new String[] { "NDC" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.StackTraceFilter.verbose").checkEq(properties, new String[] { "logstash-gelf.StackTraceFilter.verbose" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "035\",\"level\":\"keepAlive\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "035\"", "\"level\":\"keepAlive\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Server").checkEq(properties, new String[] { "Server" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='hi!', namedLogField=null]").checkEq(properties, new String[] { "PatternLogMessageField [name='hi!'", " namedLogField=null]" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"MdcMessageField [name='includeFullMdc', mdcName='extractStackTrace']\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"MdcMessageField [name='includeFullMdc'", " mdcName='extractStackTrace']\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJzaG9ydF9tZXNzYWdlIjoieXl5eS1NTS1kZCBISDptbTpzcyxTU1MiLCJsZXZlbCI6ImFkZGl0aW9uYWxGaWVsZFR5cGVzIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIiwiX3Jlc29sdXRpb25PcmRlciI6MS4xfQ==").checkEq(properties, new String[] { "eyJzaG9ydF9tZXNzYWdlIjoieXl5eS1NTS1kZCBISDptbTpzcyxTU1MiLCJsZXZlbCI6ImFkZGl0aW9uYWxGaWVsZFR5cGVzIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIiwiX3Jlc29sdXRpb25PcmRlciI6MS4xfQ==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='', mdcName='NDC']").checkEq(properties, new String[] { "MdcMessageField [name=''", " mdcName='NDC']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='writeBackoffTime', value='']").checkEq(properties, new String[] { "StaticMessageField [name='writeBackoffTime'", " value='']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='hi!', mdcName='c2hvcnRfbWVzc2FnZQ==']").checkEq(properties, new String[] { "MdcMessageField [name='hi!'", " mdcName='c2hvcnRfbWVzc2FnZQ==']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"level\":\"logstash-gelf.resolutionOrder\",\"facility\":\"Double\"}").checkEq(properties, new String[] { "{\"level\":\"logstash-gelf.resolutionOrder\"", "\"facility\":\"Double\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0nbG9nc3Rhc2gtZ2VsZi5Mb2dNZXNzYWdlRmllbGQudmVyYm9zZScsIG5hbWVkTG9nRmllbGQ9U2VydmVyXQ==").checkEq(properties, new String[] { "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0nbG9nc3Rhc2gtZ2VsZi5Mb2dNZXNzYWdlRmllbGQudmVyYm9zZScsIG5hbWVkTG9nRmllbGQ9U2VydmVyXQ==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.resolutionOrder").checkEq(properties, new String[] { "logstash-gelf.resolutionOrder" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.message.pooling").checkEq(properties, new String[] { "logstash-gelf.message.pooling" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "GelfLogbackAppender[null]").checkEq(properties, new String[] { "GelfLogbackAppender[null]" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "additionalField.").checkEq(properties, new String[] { "additionalField." });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dynamicMdcFields.").checkEq(properties, new String[] { "dynamicMdcFields." });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='graylogHost', mdcName='VUdGMGRHVnlia3h2WjAxbGMzTmhaMlZHYVdWc1pDQmJibUZ0WlQwbmFXNWpiSFZrWlVaMWJHeE5aR01uTENCdVlXMWxaRXh2WjBacFpXeGtQVk52ZFhKalpVMWxkR2h2WkU1aGJXVmQ=']").checkEq(properties, new String[] { "MdcMessageField [name='graylogHost'", " mdcName='VUdGMGRHVnlia3h2WjAxbGMzTmhaMlZHYVdWc1pDQmJibUZ0WlQwbmFXNWpiSFZrWlVaMWJHeE5aR01uTENCdVlXMWxaRXh2WjBacFpXeGtQVk52ZFhKalpVMWxkR2h2WkU1aGJXVmQ=']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "connectionTimeout").checkEq(properties, new String[] { "connectionTimeout" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0nJywgbmFtZWRMb2dGaWVsZD1Tb3VyY2VNZXRob2ROYW1lXQ==").checkEq(properties, new String[] { "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0nJywgbmFtZWRMb2dGaWVsZD1Tb3VyY2VNZXRob2ROYW1lXQ==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='/StackTraceFilter.packages', mdcName='logstash-gelf.skipHostnameResolution']").checkEq(properties, new String[] { "MdcMessageField [name='/StackTraceFilter.packages'", " mdcName='logstash-gelf.skipHostnameResolution']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "deliveryAttempts").checkEq(properties, new String[] { "deliveryAttempts" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0naW5jbHVkZUZ1bGxNZGMnLCBuYW1lZExvZ0ZpZWxkPVNvdXJjZU1ldGhvZE5hbWVd").checkEq(properties, new String[] { "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0naW5jbHVkZUZ1bGxNZGMnLCBuYW1lZExvZ0ZpZWxkPVNvdXJjZU1ldGhvZE5hbWVd" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"host\":\"network,localhost\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"host\":\"network", "localhost\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"Long\",\"full_message\":\"DynamicMdcMessageField [regex='facility']\",\"timestamp\":\"0.1\",\"level\":\"0\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"Long\"", "\"full_message\":\"DynamicMdcMessageField [regex='facility']\"", "\"timestamp\":\"0.1\"", "\"level\":\"0\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "biz.paluch.logging.gelf.logback.GelfLogbackAppender[null]").checkEq(properties, new String[] { "biz.paluch.logging.gelf.logback.GelfLogbackAppender[null]" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.LogMessageField.verbose").checkEq(properties, new String[] { "logstash-gelf.LogMessageField.verbose" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dynamicMdcFieldTypes").checkEq(properties, new String[] { "dynamicMdcFieldTypes" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "0.001").checkEq(properties, new String[] { "0.001" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "").checkEq(properties, new String[] { "" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "long").checkEq(properties, new String[] { "long" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='writeBackoffThreshold', value='redis-sentinel']").checkEq(properties, new String[] { "StaticMessageField [name='writeBackoffThreshold'", " value='redis-sentinel']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='extractStackTrace', namedLogField=SourceMethodName]").checkEq(properties, new String[] { "PatternLogMessageField [name='extractStackTrace'", " namedLogField=SourceMethodName]" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "SourceSimpleClassName").checkEq(properties, new String[] { "SourceSimpleClassName" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"version\":\"redis-sentinel\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"version\":\"redis-sentinel\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='NDC', value='eyJ0aW1lc3RhbXAiOiIwLjAwNyIsImZhY2lsaXR5IjoibG9nc3Rhc2gtZ2VsZiJ9']").checkEq(properties, new String[] { "StaticMessageField [name='NDC'", " value='eyJ0aW1lc3RhbXAiOiIwLjAwNyIsImZhY2lsaXR5IjoibG9nc3Rhc2gtZ2VsZiJ9']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='profiling.requestDuration', value='maximumMessageSize']").checkEq(properties, new String[] { "StaticMessageField [name='profiling.requestDuration'", " value='maximumMessageSize']" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dGV4dC9wbGFpbg==").checkEq(properties, new String[] { "dGV4dC9wbGFpbg==" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "327.68").checkEq(properties, new String[] { "327.68" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"0.1\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"timestamp\":\"0.1\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, ",").checkEq(properties, new String[] {});
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "writeBackoffTime").checkEq(properties, new String[] { "writeBackoffTime" });
        itest("dev", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Severity, Time, LoggerName, NDC, SourceClassName, SourceSimpleClassName, SourceMethodName, SourceLineNumber").checkEq(properties, new String[] { "Severity", " Time", " LoggerName", " NDC", " SourceClassName", " SourceSimpleClassName", " SourceMethodName", " SourceLineNumber" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"version\":\"writeBackoffTime\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"version\":\"writeBackoffTime\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "profiling.requestEnd").checkEq(properties, new String[] { "profiling.requestEnd" });
        itest("randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Double").checkEq(properties, new String[] { "Double" });
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

    public boolean isIncludeLocation() {
        return gelfMessageAssembler.isIncludeLocation();
    }

    public void setIncludeLocation(boolean includeLocation) {
        gelfMessageAssembler.setIncludeLocation(includeLocation);
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
}
