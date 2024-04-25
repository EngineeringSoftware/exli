package biz.paluch.logging.gelf.jul;

import static biz.paluch.logging.gelf.LogMessageField.NamedLogField.*;
import java.util.*;
import java.util.logging.Formatter;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import biz.paluch.logging.gelf.LogMessageField;
import biz.paluch.logging.gelf.MdcGelfMessageAssembler;
import biz.paluch.logging.gelf.intern.ConfigurationSupport;
import biz.paluch.logging.gelf.intern.GelfMessage;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Log-Formatter for JSON using fields specified within GELF. This formatter will produce a JSON object for each log event.
 * Example:
 *
 * <code>
 * {
 *    "timestamp": "1439319236.722",
 *    "SourceClassName": "biz.paluch.logging.gelf.wildfly.WildFlyGelfLogFormatterTest",
 *    "SourceMethodName": "testDefaults",
 *    "level": "6",
 *    "SourceSimpleClassName": "WildFlyGelfLogFormatterTest",
 *    "facility": "logstash-gelf",
 *    "full_message": "foo bar test log message",
 *    "short_message": "foo bar test log message",
 *    "MySeverity": "INFO",
 *    "LoggerName": "biz.paluch.logging.gelf.wildfly.WildFlyGelfLogFormatterTest",
 *    "Thread": "main",
 *    "Time": "2015-08-11 20:53:56,0722"
 * }
 * </code>
 *
 * Following parameters are supported/needed:
 * <ul>
 * <li>lineBreak (Optional): End of line, platform dependent default value, see {@code System.getProperty("line.separator")}</li>
 * <li>fields (Optional): Comma-separated list of log event fields that should be included in the JSON. Defaults to
 * {@code Time, Severity, ThreadName, SourceClassName, SourceMethodName, SourceSimpleClassName, LoggerName}</li>
 * <li>originHost (Optional): Originating Hostname, default FQDN Hostname</li>
 * <li>extractStackTrace (Optional): Post Stack-Trace to StackTrace field (true/false/throwable reference [0 = throwable, 1 =
 * throwable.cause, -1 = root cause]), default false</li>
 * <li>filterStackTrace (Optional): Perform Stack-Trace filtering (true/false), default false</li>
 * <li>includeLocation (Optional): Include source code location, default true</li>
 * <li>includeLogMessageParameters (Optional): Include message parameters from the log event (see
 * {@link LogRecord#getParameters()}, default true</li>
 * <li>facility (Optional): Name of the Facility, default gelf-java</li>
 * <li>additionalFields(number) (Optional): Post additional fields. Eg. fieldName=Value,field2=value2</li>
 * <li>additionalFieldTypes (Optional): Type specification for additional and MDC fields. Supported types: String, long, Long,
 * double, Double and discover (default if not specified, discover field type on parseability). Eg. field=String,field2=double</li>
 * </ul>
 *
 * @author Greg Peterson
 * @since 1.14.0
 */
public class GelfFormatter extends Formatter {

    public static final String MULTI_VALUE_DELIMITTER = ",";

    public static final Set<LogMessageField.NamedLogField> SUPPORTED_FIELDS;

    private final MdcGelfMessageAssembler gelfMessageAssembler = new MdcGelfMessageAssembler();

    private String lineBreak = System.getProperty("line.separator");

    private boolean wasSetFieldsCalled = false;

    static {
        Set<LogMessageField.NamedLogField> supportedFields = new LinkedHashSet<>();
        supportedFields.add(Time);
        supportedFields.add(Severity);
        supportedFields.add(ThreadName);
        supportedFields.add(SourceClassName);
        supportedFields.add(SourceMethodName);
        supportedFields.add(SourceSimpleClassName);
        supportedFields.add(LoggerName);
        supportedFields.add(Server);
        SUPPORTED_FIELDS = Collections.unmodifiableSet(supportedFields);
    }

    public GelfFormatter() {
        super();
        configure();
    }

    private void configure() {
        String cname = getClass().getName();
        LogManager manager = LogManager.getLogManager();
        String val = manager.getProperty(cname + ".fields");
        if (val != null) {
            setFields(val);
        }
        val = manager.getProperty(cname + ".version");
        if (val != null) {
            setVersion(val);
        }
        val = manager.getProperty(cname + ".facility");
        if (val != null) {
            setFacility(val);
        }
        val = manager.getProperty(cname + ".extractStackTrace");
        if (val != null) {
            setExtractStackTrace(val);
        }
        val = manager.getProperty(cname + ".filterStackTrace");
        if (val != null) {
            setFilterStackTrace(Boolean.valueOf(val));
        }
        val = manager.getProperty(cname + ".includeLogMessageParameters");
        if (val != null) {
            setIncludeLogMessageParameters(Boolean.valueOf(val));
        }
        val = manager.getProperty(cname + ".includeLocation");
        if (val != null) {
            setIncludeLocation(Boolean.valueOf(val));
        }
        val = manager.getProperty(cname + ".timestampPattern");
        if (val != null) {
            setTimestampPattern(val);
        }
        val = manager.getProperty(cname + ".additionalFields");
        if (val != null) {
            setAdditionalFields(val);
        }
        val = manager.getProperty(cname + ".additionalFieldTypes");
        if (val != null) {
            setAdditionalFieldTypes(val);
        }
        val = manager.getProperty(cname + ".originHost");
        if (val != null) {
            setOriginHost(val);
        }
        val = manager.getProperty(cname + ".linebreak");
        if (val != null) {
            setLineBreak(val);
        }
    }

    @Override
    public String format(final LogRecord record) {
        if (!wasSetFieldsCalled) {
            addFields(SUPPORTED_FIELDS);
        }
        GelfMessage gelfMessage = gelfMessageAssembler.createGelfMessage(new JulLogEvent(record));
        return gelfMessage.toJson("") + lineBreak;
    }

    public void setFields(String fieldSpec) {
        String[] properties = fieldSpec.split(MULTI_VALUE_DELIMITTER);
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJsb2dzdGFzaC1nZWxmLkxvZ01lc3NhZ2VGaWVsZC52ZXJib3NlcmVzb2x1dGlvbk9yZGVyIjoxLjF9").checkEq(properties, new String[] { "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJsb2dzdGFzaC1nZWxmLkxvZ01lc3NhZ2VGaWVsZC52ZXJib3NlcmVzb2x1dGlvbk9yZGVyIjoxLjF9" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='facility', mdcName='filter']").checkEq(properties, new String[] { "MdcMessageField [name='facility'", " mdcName='filter']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"level\":\"MdcMessageField [name='logstash-gelf.hostname', mdcName='']\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"level\":\"MdcMessageField [name='logstash-gelf.hostname'", " mdcName='']\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdhMlZsY0VGc2FYWmwnLCB2YWx1ZT0nWm5Wc2JGOXRaWE56WVdkbCdd").checkEq(properties, new String[] { "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdhMlZsY0VGc2FYWmwnLCB2YWx1ZT0nWm5Wc2JGOXRaWE56WVdkbCdd" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "size").checkEq(properties, new String[] { "size" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "filterStackTrace").checkEq(properties, new String[] { "filterStackTrace" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='short_message']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='short_message']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "profiling.requestEnd").checkEq(properties, new String[] { "profiling.requestEnd" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "readTimeout").checkEq(properties, new String[] { "readTimeout" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"logstash-gelf\",\"RHluYW1pY01kY01lc3NhZ2VGaWVsZCBbcmVnZXg9J3RpbWVzdGFtcFBhdHRlcm4nXQ==includeFullMdc\":\"graylogPort\"}").checkEq(properties, new String[] { "{\"facility\":\"logstash-gelf\"", "\"RHluYW1pY01kY01lc3NhZ2VGaWVsZCBbcmVnZXg9J3RpbWVzdGFtcFBhdHRlcm4nXQ==includeFullMdc\":\"graylogPort\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dynamicMdcFields.").checkEq(properties, new String[] { "dynamicMdcFields." });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "includeLocation").checkEq(properties, new String[] { "includeLocation" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='logstash-gelf.message.pooling', namedLogField=SourceLineNumber]").checkEq(properties, new String[] { "LogMessageField [name='logstash-gelf.message.pooling'", " namedLogField=SourceLineNumber]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='maxWriteBackoffTime', namedLogField=SourceClassName]").checkEq(properties, new String[] { "LogMessageField [name='maxWriteBackoffTime'", " namedLogField=SourceClassName]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='LogMessageField [name='yyyy-MM-dd HH:mm:ss,SSS', namedLogField=SourceSimpleClassName]', value='includeLocation']").checkEq(properties, new String[] { "StaticMessageField [name='LogMessageField [name='yyyy-MM-dd HH:mm:ss", "SSS'", " namedLogField=SourceSimpleClassName]'", " value='includeLocation']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TWRjTWVzc2FnZUZpZWxkIFtuYW1lPSdhZjk4ZDM2YmFjYWUnLCBtZGNOYW1lPSdsb25nJ10=").checkEq(properties, new String[] { "TWRjTWVzc2FnZUZpZWxkIFtuYW1lPSdhZjk4ZDM2YmFjYWUnLCBtZGNOYW1lPSdsb25nJ10=" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "double").checkEq(properties, new String[] { "double" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "\n").checkEq(properties, new String[] { "\n" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='logstash-gelf.hostname', mdcName='']").checkEq(properties, new String[] { "MdcMessageField [name='logstash-gelf.hostname'", " mdcName='']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TkRD").checkEq(properties, new String[] { "TkRD" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dynamicMdcFieldTypes").checkEq(properties, new String[] { "dynamicMdcFieldTypes" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "graylogHost").checkEq(properties, new String[] { "graylogHost" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"1.1\",\"full_message\":\"HostnameConverter\",\"timestamp\":\"0.035\",\"level\":\"keepAlive\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"1.1\"", "\"full_message\":\"HostnameConverter\"", "\"timestamp\":\"0.035\"", "\"level\":\"keepAlive\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "<empty>").checkEq(properties, new String[] { "<empty>" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdsb2dzdGFzaC1nZWxmLlN0YWNrVHJhY2VGaWx0ZXIudmVyYm9zZScsIHZhbHVlPSdkb3VibGUnXQ==").checkEq(properties, new String[] { "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdsb2dzdGFzaC1nZWxmLlN0YWNrVHJhY2VGaWx0ZXIudmVyYm9zZScsIHZhbHVlPSdkb3VibGUnXQ==" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdEeW5hbWljTWRjTWVzc2FnZUZpZWxkIFtyZWdleD0na2VlcEFsaXZlJ10nLCB2YWx1ZT0neyJ2ZXJzaW9uIjoicmVkaXMtc2VudGluZWwiLCJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYifSdd").checkEq(properties, new String[] { "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdEeW5hbWljTWRjTWVzc2FnZUZpZWxkIFtyZWdleD0na2VlcEFsaXZlJ10nLCB2YWx1ZT0neyJ2ZXJzaW9uIjoicmVkaXMtc2VudGluZWwiLCJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYifSdd" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"version\":\"redis-sentinel\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"version\":\"redis-sentinel\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='writeBackoffThreshold', namedLogField=LoggerName]").checkEq(properties, new String[] { "LogMessageField [name='writeBackoffThreshold'", " namedLogField=LoggerName]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='MdcMessageField [name='timestamp', mdcName='{\"level\":\"additionalFieldTypes\",\"facility\":\"logstash-gelf\",\"kafkaresolutionOrder\":1.1}']', mdcName='']").checkEq(properties, new String[] { "MdcMessageField [name='MdcMessageField [name='timestamp'", " mdcName='{\"level\":\"additionalFieldTypes\"", "\"facility\":\"logstash-gelf\"", "\"kafkaresolutionOrder\":1.1}']'", " mdcName='']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"version\":\"logstash-gelf.LogMessageField.verbose\",\"facility\":\"logstash-gelf\",\",appender\":\"Long\"}").checkEq(properties, new String[] { "{\"version\":\"logstash-gelf.LogMessageField.verbose\"", "\"facility\":\"logstash-gelf\"", "\"", "appender\":\"Long\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='Thread', mdcName='StaticMessageField [name='a2VlcEFsaXZl', value='ZnVsbF9tZXNzYWdl']']").checkEq(properties, new String[] { "MdcMessageField [name='Thread'", " mdcName='StaticMessageField [name='a2VlcEFsaXZl'", " value='ZnVsbF9tZXNzYWdl']']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='timestampPattern']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='timestampPattern']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "full_message").checkEq(properties, new String[] { "full_message" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='logstash-gelf.hostname', namedLogField=NDC]").checkEq(properties, new String[] { "LogMessageField [name='logstash-gelf.hostname'", " namedLogField=NDC]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='profiling.requestStart.millis', namedLogField=SourceClassName]").checkEq(properties, new String[] { "PatternLogMessageField [name='profiling.requestStart.millis'", " namedLogField=SourceClassName]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJ2ZXJzaW9uIjoie1wiZmFjaWxpdHlcIjpcImRpc2NvdmVyXCJ9IiwibGV2ZWwiOiJwcm9maWxpbmcucmVxdWVzdER1cmF0aW9uIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIn0=").checkEq(properties, new String[] { "eyJ2ZXJzaW9uIjoie1wiZmFjaWxpdHlcIjpcImRpc2NvdmVyXCJ9IiwibGV2ZWwiOiJwcm9maWxpbmcucmVxdWVzdER1cmF0aW9uIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIn0=" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "a2VlcEFsaXZl").checkEq(properties, new String[] { "a2VlcEFsaXZl" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='redis-sentinel', mdcName='c2hvcnRfbWVzc2FnZQ==']").checkEq(properties, new String[] { "MdcMessageField [name='redis-sentinel'", " mdcName='c2hvcnRfbWVzc2FnZQ==']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "NDC").checkEq(properties, new String[] { "NDC" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "includeLogMessageParameters").checkEq(properties, new String[] { "includeLogMessageParameters" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='<empty>', mdcName='timestampPattern']").checkEq(properties, new String[] { "MdcMessageField [name='<empty>'", " mdcName='timestampPattern']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TWRjTWVzc2FnZUZpZWxkIFtuYW1lPScnLCBtZGNOYW1lPSdmYWxzZSdd").checkEq(properties, new String[] { "TWRjTWVzc2FnZUZpZWxkIFtuYW1lPScnLCBtZGNOYW1lPSdmYWxzZSdd" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "RHluYW1pY01kY01lc3NhZ2VGaWVsZCBbcmVnZXg9J3dyaXRlQmFja29mZlRocmVzaG9sZCdd").checkEq(properties, new String[] { "RHluYW1pY01kY01lc3NhZ2VGaWVsZCBbcmVnZXg9J3dyaXRlQmFja29mZlRocmVzaG9sZCdd" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSd5eXl5LU1NLWRkIEhIOm1tOnNzLFNTUycsIG5hbWVkTG9nRmllbGQ9U291cmNlU2ltcGxlQ2xhc3NOYW1lXQ==").checkEq(properties, new String[] { "TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSd5eXl5LU1NLWRkIEhIOm1tOnNzLFNTUycsIG5hbWVkTG9nRmllbGQ9U291cmNlU2ltcGxlQ2xhc3NOYW1lXQ==" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"0.001\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"timestamp\":\"0.001\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "short_message").checkEq(properties, new String[] { "short_message" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "filter").checkEq(properties, new String[] { "filter" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name=',', value='logstash-gelf.buffer.size']").checkEq(properties, new String[] { "StaticMessageField [name='", "'", " value='logstash-gelf.buffer.size']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='appender', value='MessageParam']").checkEq(properties, new String[] { "StaticMessageField [name='appender'", " value='MessageParam']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='bG9nc3Rhc2gtZ2VsZi5TdGFja1RyYWNlRmlsdGVyLnZlcmJvc2U=', namedLogField=NDC]").checkEq(properties, new String[] { "PatternLogMessageField [name='bG9nc3Rhc2gtZ2VsZi5TdGFja1RyYWNlRmlsdGVyLnZlcmJvc2U='", " namedLogField=NDC]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "false").checkEq(properties, new String[] { "false" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='DynamicMdcMessageField [regex='includeLogMessageParameters']', mdcName='double']").checkEq(properties, new String[] { "MdcMessageField [name='DynamicMdcMessageField [regex='includeLogMessageParameters']'", " mdcName='double']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.message.pooling").checkEq(properties, new String[] { "logstash-gelf.message.pooling" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "connectionTimeout").checkEq(properties, new String[] { "connectionTimeout" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "writeBackoffTime").checkEq(properties, new String[] { "writeBackoffTime" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MS4w").checkEq(properties, new String[] { "MS4w" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"version\":\"Converter\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"version\":\"Converter\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"graylogPort\",\"_resolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"facility\":\"graylogPort\"", "\"_resolutionOrder\":1.1}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='resolutionOrder', value='']").checkEq(properties, new String[] { "StaticMessageField [name='resolutionOrder'", " value='']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='', namedLogField=Server]").checkEq(properties, new String[] { "PatternLogMessageField [name=''", " namedLogField=Server]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"host\":\"network,localhost\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"host\":\"network", "localhost\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.StackTraceFilter.verbose").checkEq(properties, new String[] { "logstash-gelf.StackTraceFilter.verbose" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "resolutionOrder").checkEq(properties, new String[] { "resolutionOrder" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.fqdn.hostname").checkEq(properties, new String[] { "logstash-gelf.fqdn.hostname" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, ",").checkEq(properties, new String[] {});
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='timestamp', mdcName='{\"level\":\"additionalFieldTypes\",\"facility\":\"logstash-gelf\",\"kafkaresolutionOrder\":1.1}']").checkEq(properties, new String[] { "MdcMessageField [name='timestamp'", " mdcName='{\"level\":\"additionalFieldTypes\"", "\"facility\":\"logstash-gelf\"", "\"kafkaresolutionOrder\":1.1}']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJUaW1lcmVzb2x1dGlvbk9yZGVyIjoxLjF9").checkEq(properties, new String[] { "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJUaW1lcmVzb2x1dGlvbk9yZGVyIjoxLjF9" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "appender").checkEq(properties, new String[] { "appender" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "verbose', value='double']").checkEq(properties, new String[] { "verbose'", " value='double']" });
        itest("dev", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Severity, Time, LoggerName").checkEq(properties, new String[] { "Severity", " Time", " LoggerName" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJsZXZlbCI6ImFkZGl0aW9uYWxGaWVsZFR5cGVzIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIiwiX2dyYXlsb2dQb3J0IjoiZG91YmxlIiwiX3Jlc29sdXRpb25PcmRlciI6MS4xfQ==").checkEq(properties, new String[] { "eyJsZXZlbCI6ImFkZGl0aW9uYWxGaWVsZFR5cGVzIiwiZmFjaWxpdHkiOiJsb2dzdGFzaC1nZWxmIiwiX2dyYXlsb2dQb3J0IjoiZG91YmxlIiwiX3Jlc29sdXRpb25PcmRlciI6MS4xfQ==" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "1}']\"}").checkEq(properties, new String[] { "1}']\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "ZnVsbF9tZXNzYWdl").checkEq(properties, new String[] { "ZnVsbF9tZXNzYWdl" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "ZHluYW1pY01kY0ZpZWxkVHlwZXM=").checkEq(properties, new String[] { "ZHluYW1pY01kY0ZpZWxkVHlwZXM=" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "facility").checkEq(properties, new String[] { "facility" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "biz.paluch.logging.gelf.logback.GelfLogbackAppender[StaticMessageField [name=',', value='logstash-gelf.buffer.size']]").checkEq(properties, new String[] { "biz.paluch.logging.gelf.logback.GelfLogbackAppender[StaticMessageField [name='", "'", " value='logstash-gelf.buffer.size']]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"readTimeout\",\"facility\":\"logstash-gelf\",\"{\\\"facility\\\":\\\"logstash-gelf\\\",\\\"includeFullMdc\\\":\\\"graylogPort\\\"}mdcField.\":\"writeBackoffTime\"}").checkEq(properties, new String[] { "{\"short_message\":\"readTimeout\"", "\"facility\":\"logstash-gelf\"", "\"{\\\"facility\\\":\\\"logstash-gelf\\\"", "\\\"includeFullMdc\\\":\\\"graylogPort\\\"}mdcField.\":\"writeBackoffTime\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"1}\",\"full_message\":\"U2VydmVy\",\"timestamp\":\"-0.001\",\"level\":\"logstash-gelf.fqdn.hostname\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"1}\"", "\"full_message\":\"U2VydmVy\"", "\"timestamp\":\"-0.001\"", "\"level\":\"logstash-gelf.fqdn.hostname\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "millis").checkEq(properties, new String[] { "millis" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "1}").checkEq(properties, new String[] { "1}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='{\"facility\":\"logstash-gelf\",\"_a2VlcEFsaXZl\":\"MdcMessageField [name='host', mdcName='host']\",\"_resolutionOrder\":1.1}', value='dynamicMdcFields.']").checkEq(properties, new String[] { "StaticMessageField [name='{\"facility\":\"logstash-gelf\"", "\"_a2VlcEFsaXZl\":\"MdcMessageField [name='host'", " mdcName='host']\"", "\"_resolutionOrder\":1.1}'", " value='dynamicMdcFields.']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0nJywgbmFtZWRMb2dGaWVsZD1TZXJ2ZXJd").checkEq(properties, new String[] { "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0nJywgbmFtZWRMb2dGaWVsZD1TZXJ2ZXJd" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0naW5jbHVkZUZ1bGxNZGMnLCBuYW1lZExvZ0ZpZWxkPVNvdXJjZU1ldGhvZE5hbWVd").checkEq(properties, new String[] { "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0naW5jbHVkZUZ1bGxNZGMnLCBuYW1lZExvZ0ZpZWxkPVNvdXJjZU1ldGhvZE5hbWVd" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSdwcm9maWxpbmcucmVxdWVzdER1cmF0aW9uLm1pbGxpcycsIG5hbWVkTG9nRmllbGQ9U291cmNlQ2xhc3NOYW1lXQ==', value='mdcProfiling']").checkEq(properties, new String[] { "StaticMessageField [name='TG9nTWVzc2FnZUZpZWxkIFtuYW1lPSdwcm9maWxpbmcucmVxdWVzdER1cmF0aW9uLm1pbGxpcycsIG5hbWVkTG9nRmllbGQ9U291cmNlQ2xhc3NOYW1lXQ=='", " value='mdcProfiling']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJfcmVzb2x1dGlvbk9yZGVyIjoxLjF9").checkEq(properties, new String[] { "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYiLCJfcmVzb2x1dGlvbk9yZGVyIjoxLjF9" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "").checkEq(properties, new String[] { "" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "profiling.requestDuration.millis").checkEq(properties, new String[] { "profiling.requestDuration.millis" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='DynamicMdcMessageField [regex='MdcMessageField [name='<empty>', mdcName='timestampPattern']']', value='verbose', value='double']']").checkEq(properties, new String[] { "StaticMessageField [name='DynamicMdcMessageField [regex='MdcMessageField [name='<empty>'", " mdcName='timestampPattern']']'", " value='verbose'", " value='double']']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"version\":\"{\\\"facility\\\":\\\"discover\\\"}\",\"level\":\"profiling.requestDuration\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"version\":\"{\\\"facility\\\":\\\"discover\\\"}\"", "\"level\":\"profiling.requestDuration\"", "\"facility\":\"logstash-gelf\"}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"0.052\",\"facility\":\"logstash-gelf\",\"LongresolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"timestamp\":\"0.052\"", "\"facility\":\"logstash-gelf\"", "\"LongresolutionOrder\":1.1}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0nbG9nc3Rhc2gtZ2VsZi5Mb2dNZXNzYWdlRmllbGQudmVyYm9zZScsIG5hbWVkTG9nRmllbGQ9U2VydmVyXQ==").checkEq(properties, new String[] { "UGF0dGVybkxvZ01lc3NhZ2VGaWVsZCBbbmFtZT0nbG9nc3Rhc2gtZ2VsZi5Mb2dNZXNzYWdlRmllbGQudmVyYm9zZScsIG5hbWVkTG9nRmllbGQ9U2VydmVyXQ==" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "pooling").checkEq(properties, new String[] { "pooling" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"logstash-gelf\",\"_a2VlcEFsaXZl\":\"MdcMessageField [name='host', mdcName='host']\",\"_resolutionOrder\":1.1}").checkEq(properties, new String[] { "{\"facility\":\"logstash-gelf\"", "\"_a2VlcEFsaXZl\":\"MdcMessageField [name='host'", " mdcName='host']\"", "\"_resolutionOrder\":1.1}" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "profiling.requestStart.millis").checkEq(properties, new String[] { "profiling.requestStart.millis" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='host', mdcName='host']").checkEq(properties, new String[] { "MdcMessageField [name='host'", " mdcName='host']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='mdcField.']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='mdcField.']" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "RHluYW1pY01kY01lc3NhZ2VGaWVsZCBbcmVnZXg9J2hvc3QnXQ==").checkEq(properties, new String[] { "RHluYW1pY01kY01lc3NhZ2VGaWVsZCBbcmVnZXg9J2hvc3QnXQ==" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "ZGVsaXZlcnlBdHRlbXB0cw==").checkEq(properties, new String[] { "ZGVsaXZlcnlBdHRlbXB0cw==" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "additionalFieldTypes").checkEq(properties, new String[] { "additionalFieldTypes" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "maxWriteBackoffTime").checkEq(properties, new String[] { "maxWriteBackoffTime" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='yyyy-MM-dd HH:mm:ss,SSS', namedLogField=SourceSimpleClassName]").checkEq(properties, new String[] { "LogMessageField [name='yyyy-MM-dd HH:mm:ss", "SSS'", " namedLogField=SourceSimpleClassName]" });
        itest("randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "id").checkEq(properties, new String[] { "id" });
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

    public boolean isIncludeLogMessageParameters() {
        return gelfMessageAssembler.isIncludeLogMessageParameters();
    }

    public void setIncludeLogMessageParameters(boolean includeLogMessageParameters) {
        gelfMessageAssembler.setIncludeLogMessageParameters(includeLogMessageParameters);
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
