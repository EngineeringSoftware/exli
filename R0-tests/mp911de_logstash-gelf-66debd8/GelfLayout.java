package biz.paluch.logging.gelf.log4j;

import static biz.paluch.logging.gelf.LogMessageField.NamedLogField.*;
import java.util.*;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;
import biz.paluch.logging.gelf.LogMessageField;
import biz.paluch.logging.gelf.MdcGelfMessageAssembler;
import biz.paluch.logging.gelf.intern.ConfigurationSupport;
import biz.paluch.logging.gelf.intern.GelfMessage;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "host").checkEq(properties, new String[] { "host" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='StackTrace', mdcName='']").checkEq(properties, new String[] { "MdcMessageField [name='StackTrace'", " mdcName='']" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"facility\":\"redis\"}").checkEq(properties, new String[] { "{\"facility\":\"redis\"}" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"profiling.requestEnd\",\"level\":\"{\\\"short_message\\\":\\\"/StackTraceFilter.packages\\\",\\\"full_message\\\":\\\"mdcProfiling\\\",\\\"level\\\":\\\"yyyy-MM-dd HH:mm:ss,SSS\\\",\\\"facility\\\":\\\"logstash-gelf\\\"}\",\"facility\":\"logstash-gelf\",\"_maxWriteBackoffTime\":\"<empty>\"}").checkEq(properties, new String[] { "{\"short_message\":\"profiling.requestEnd\"", "\"level\":\"{\\\"short_message\\\":\\\"/StackTraceFilter.packages\\\"", "\\\"full_message\\\":\\\"mdcProfiling\\\"", "\\\"level\\\":\\\"yyyy-MM-dd HH:mm:ss", "SSS\\\"", "\\\"facility\\\":\\\"logstash-gelf\\\"}\"", "\"facility\":\"logstash-gelf\"", "\"_maxWriteBackoffTime\":\"<empty>\"}" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf").checkEq(properties, new String[] { "logstash-gelf" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "additionalFields").checkEq(properties, new String[] { "additionalFields" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "1").checkEq(properties, new String[] { "1" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.resolutionOrder").checkEq(properties, new String[] { "logstash-gelf.resolutionOrder" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "port").checkEq(properties, new String[] { "port" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdrZWVwQWxpdmUnLCB2YWx1ZT0ndGV4dC9wbGFpbidd").checkEq(properties, new String[] { "U3RhdGljTWVzc2FnZUZpZWxkIFtuYW1lPSdrZWVwQWxpdmUnLCB2YWx1ZT0ndGV4dC9wbGFpbidd" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "HostnameConverter").checkEq(properties, new String[] { "HostnameConverter" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "hostname").checkEq(properties, new String[] { "hostname" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "MdcMessageField [name='0.01', mdcName='Yml6LnBhbHVjaC5sb2dnaW5nLmdlbGYubG9nYmFjay5HZWxmTG9nYmFja0FwcGVuZGVyW251bGxd']").checkEq(properties, new String[] { "MdcMessageField [name='0.01'", " mdcName='Yml6LnBhbHVjaC5sb2dnaW5nLmdlbGYubG9nYmFjay5HZWxmTG9nYmFja0FwcGVuZGVyW251bGxd']" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='MdcMessageField [name='StackTrace', mdcName='']']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='MdcMessageField [name='StackTrace'", " mdcName='']']" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "kafka").checkEq(properties, new String[] { "kafka" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\",\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"", "\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "0").checkEq(properties, new String[] { "0" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "aGkh").checkEq(properties, new String[] { "aGkh" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "String").checkEq(properties, new String[] { "String" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"host\":\"dynamicMdcFieldTypes\",\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"host\":\"dynamicMdcFieldTypes\"", "\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\",\"full_messagefilter\":1}").checkEq(properties, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"", "\"full_messagefilter\":1}" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "mdcProfiling").checkEq(properties, new String[] { "mdcProfiling" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "profiling.requestDuration").checkEq(properties, new String[] { "profiling.requestDuration" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.buffer.size").checkEq(properties, new String[] { "logstash-gelf.buffer.size" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "PatternLogMessageField [name='DynamicMdcMessageField [regex='']', namedLogField=NDC]").checkEq(properties, new String[] { "PatternLogMessageField [name='DynamicMdcMessageField [regex='']'", " namedLogField=NDC]" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "graylogPort").checkEq(properties, new String[] { "graylogPort" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "additionalField.").checkEq(properties, new String[] { "additionalField." });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "{\"timestamp\":\"-0.001\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"timestamp\":\"-0.001\"", "\"facility\":\"logstash-gelf\"}" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "timestamp").checkEq(properties, new String[] { "timestamp" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "aG9zdG5hbWU=").checkEq(properties, new String[] { "aG9zdG5hbWU=" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "full_message").checkEq(properties, new String[] { "full_message" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "rtr-ipaddress.facilities.uu.edu").checkEq(properties, new String[] { "rtr-ipaddress.facilities.uu.edu" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "StaticMessageField [name='Long', value='bG9nc3Rhc2gtZ2VsZi5yZXNvbHV0aW9uT3JkZXI=']").checkEq(properties, new String[] { "StaticMessageField [name='Long'", " value='bG9nc3Rhc2gtZ2VsZi5yZXNvbHV0aW9uT3JkZXI=']" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "graylogHost").checkEq(properties, new String[] { "graylogHost" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "logstash-gelf.message.pooling").checkEq(properties, new String[] { "logstash-gelf.message.pooling" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "originHost").checkEq(properties, new String[] { "originHost" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "DynamicMdcMessageField [regex='port']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='port']" });
        new Here("Unit", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "Severity, Time, LoggerName, NDC, SourceClassName, SourceSimpleClassName, SourceMethodName, SourceLineNumber").checkEq(properties, new String[] { "Severity", " Time", " LoggerName", " NDC", " SourceClassName", " SourceSimpleClassName", " SourceMethodName", " SourceLineNumber" });
        new Here("Randoop", 130).given(MULTI_VALUE_DELIMITTER, ",").given(fieldSpec, "maxWriteBackoffTime").checkEq(properties, new String[] { "maxWriteBackoffTime" });
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
