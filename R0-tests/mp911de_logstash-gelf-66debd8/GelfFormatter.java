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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "millis', value='timestampPattern']").checkEq(properties, new String[] { "millis'", " value='timestampPattern']" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='keepAlive', value='text/plain']").checkEq(properties, new String[] { "StaticMessageField [name='keepAlive'", " value='text/plain']" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.StackTraceFilter.verbose").checkEq(properties, new String[] { "logstash-gelf.StackTraceFilter.verbose" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='profiling.requestDuration.millis', namedLogField=ThreadName]").checkEq(properties, new String[] { "PatternLogMessageField [name='profiling.requestDuration.millis'", " namedLogField=ThreadName]" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Double").checkEq(properties, new String[] { "Double" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\",\"full_messagefilter\":1}").checkEq(properties, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"", "\"full_messagefilter\":1}" });
        new Here("Unit", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Severity, Time, LoggerName").checkEq(properties, new String[] { "Severity", " Time", " LoggerName" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "1.0").checkEq(properties, new String[] { "1.0" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "filter").checkEq(properties, new String[] { "filter" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "mdcProfiling").checkEq(properties, new String[] { "mdcProfiling" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "additionalField.").checkEq(properties, new String[] { "additionalField." });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.LogMessageField.verbose").checkEq(properties, new String[] { "logstash-gelf.LogMessageField.verbose" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYifQ==").checkEq(properties, new String[] { "eyJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYifQ==" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='1.0', namedLogField=Time]").checkEq(properties, new String[] { "LogMessageField [name='1.0'", " namedLogField=Time]" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Converter").checkEq(properties, new String[] { "Converter" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.fqdn.hostname").checkEq(properties, new String[] { "logstash-gelf.fqdn.hostname" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\",\"idadditionalField.\":\"SourceMethodName\"}").checkEq(properties, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"", "\"idadditionalField.\":\"SourceMethodName\"}" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\",\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"", "\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dynamicMdcFieldTypes").checkEq(properties, new String[] { "dynamicMdcFieldTypes" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"additionalField.\",\"full_message\":\"mdcProfiling\",\"timestamp\":\"0.035\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"additionalField.\"", "\"full_message\":\"mdcProfiling\"", "\"timestamp\":\"0.035\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='logstash-gelf', namedLogField=ThreadName]").checkEq(properties, new String[] { "LogMessageField [name='logstash-gelf'", " namedLogField=ThreadName]" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "includeLocation").checkEq(properties, new String[] { "includeLocation" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Server").checkEq(properties, new String[] { "Server" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "LogMessageField [name='mdcProfiling', namedLogField=Server]").checkEq(properties, new String[] { "LogMessageField [name='mdcProfiling'", " namedLogField=Server]" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.hostname").checkEq(properties, new String[] { "logstash-gelf.hostname" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "dynamicMdcFields.").checkEq(properties, new String[] { "dynamicMdcFields." });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MessageParam").checkEq(properties, new String[] { "MessageParam" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "writeBackoffThreshold").checkEq(properties, new String[] { "writeBackoffThreshold" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='logstash-gelf.skipHostnameResolution', mdcName='profiling.requestDuration.millis']").checkEq(properties, new String[] { "MdcMessageField [name='logstash-gelf.skipHostnameResolution'", " mdcName='profiling.requestDuration.millis']" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "0.01").checkEq(properties, new String[] { "0.01" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "YWRkaXRpb25hbEZpZWxkVHlwZS4=").checkEq(properties, new String[] { "YWRkaXRpb25hbEZpZWxkVHlwZS4=" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "bG9nc3Rhc2gtZ2VsZi5yZXNvbHV0aW9uT3JkZXI=").checkEq(properties, new String[] { "bG9nc3Rhc2gtZ2VsZi5yZXNvbHV0aW9uT3JkZXI=" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "false").checkEq(properties, new String[] { "false" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "hi!").checkEq(properties, new String[] { "hi!" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='Yml6LnBhbHVjaC5sb2dnaW5nLmdlbGYubG9nYmFjay5HZWxmTG9nYmFja0FwcGVuZGVyW251bGxd', value='filter']").checkEq(properties, new String[] { "StaticMessageField [name='Yml6LnBhbHVjaC5sb2dnaW5nLmdlbGYubG9nYmFjay5HZWxmTG9nYmFja0FwcGVuZGVyW251bGxd'", " value='filter']" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "profiling.requestDuration").checkEq(properties, new String[] { "profiling.requestDuration" });
        new Here("Randoop", 162).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "additionalFieldType.").checkEq(properties, new String[] { "additionalFieldType." });
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
