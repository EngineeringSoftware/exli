package biz.paluch.logging.gelf.intern;

import biz.paluch.logging.gelf.DynamicMdcMessageField;
import biz.paluch.logging.gelf.GelfMessageAssembler;
import biz.paluch.logging.gelf.MdcMessageField;
import biz.paluch.logging.gelf.StaticMessageField;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * @author Mark Paluch
 * @author Thomas Herzog
 */
public class ConfigurationSupport {

    public static final String MULTI_VALUE_DELIMITTER = ",";

    public static final char EQ = '=';

    private ConfigurationSupport() {
    }

    /**
     * Set the additional (static) fields.
     *
     * @param spec field=value,field1=value1, ...
     * @param gelfMessageAssembler the Gelf message assembler to apply the configuration
     */
    public static void setAdditionalFields(String spec, GelfMessageAssembler gelfMessageAssembler) {
        if (null != spec) {
            String[] properties = spec.split(MULTI_VALUE_DELIMITTER);
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "hostname").checkEq(properties, new String[] { "hostname" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Converter").checkEq(properties, new String[] { "Converter" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "writeBackoffTime").checkEq(properties, new String[] { "writeBackoffTime" });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "propertyField1=en,propertyField2=myproperty_IS_UNDEFINED,propertyField3=otherproperty:fallback_IS_UNDEFINED,propertyField4=embeddedmyproperty_IS_UNDEFINEDproperty").checkEq(properties, new String[] { "propertyField1=en", "propertyField2=myproperty_IS_UNDEFINED", "propertyField3=otherproperty:fallback_IS_UNDEFINED", "propertyField4=embeddedmyproperty_IS_UNDEFINEDproperty" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "1.0").checkEq(properties, new String[] { "1.0" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Marker").checkEq(properties, new String[] { "Marker" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "double").checkEq(properties, new String[] { "double" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "").checkEq(properties, new String[] { "" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Severity").checkEq(properties, new String[] { "Severity" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.resolutionOrder").checkEq(properties, new String[] { "logstash-gelf.resolutionOrder" });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "propertyField1=${user.language},propertyField2=${myproperty},propertyField3=${otherproperty:fallback},propertyField4=embedded${myproperty}property").checkEq(properties, new String[] { "propertyField1=${user.language}", "propertyField2=${myproperty}", "propertyField3=${otherproperty:fallback}", "propertyField4=embedded${myproperty}property" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Double").checkEq(properties, new String[] { "Double" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "profiling.requestDuration").checkEq(properties, new String[] { "profiling.requestDuration" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, ",").checkEq(properties, new String[] {});
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "<empty>").checkEq(properties, new String[] { "<empty>" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "1.1").checkEq(properties, new String[] { "1.1" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "appender").checkEq(properties, new String[] { "appender" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "DynamicMdcMessageField [regex='dynamicMdcFields.']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='dynamicMdcFields.']" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "readTimeout").checkEq(properties, new String[] { "readTimeout" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "MdcMessageField [name='logstash-gelf.skipHostnameResolution', mdcName='profiling.requestDuration.millis']").checkEq(properties, new String[] { "MdcMessageField [name='logstash-gelf.skipHostnameResolution'", " mdcName='profiling.requestDuration.millis']" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "localhost,network").checkEq(properties, new String[] { "localhost", "network" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "keepAlive").checkEq(properties, new String[] { "keepAlive" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "additionalFieldType.").checkEq(properties, new String[] { "additionalFieldType." });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "propertyField1=en,propertyField2=value of myproperty,propertyField3=otherproperty:fallback_IS_UNDEFINED,propertyField4=embeddedvalue of mypropertyproperty").checkEq(properties, new String[] { "propertyField1=en", "propertyField2=value of myproperty", "propertyField3=otherproperty:fallback_IS_UNDEFINED", "propertyField4=embeddedvalue of mypropertyproperty" });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "fieldName1=fieldValue1,fieldName2=fieldValue2").checkEq(properties, new String[] { "fieldName1=fieldValue1", "fieldName2=fieldValue2" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "LogMessageField [name=',', namedLogField=Server]").checkEq(properties, new String[] { "LogMessageField [name='", "'", " namedLogField=Server]" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "level").checkEq(properties, new String[] { "level" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "DynamicMdcMessageField [regex='']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='']" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='includeLogMessageParameters', value='']").checkEq(properties, new String[] { "StaticMessageField [name='includeLogMessageParameters'", " value='']" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "connectionTimeout").checkEq(properties, new String[] { "connectionTimeout" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "172.19.0.1").checkEq(properties, new String[] { "172.19.0.1" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StackTrace").checkEq(properties, new String[] { "StackTrace" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "long").checkEq(properties, new String[] { "long" });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "fieldName1=fieldValue1,fieldName2=fieldValue2,myOriginHost=hostname").checkEq(properties, new String[] { "fieldName1=fieldValue1", "fieldName2=fieldValue2", "myOriginHost=hostname" });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "").checkEq(properties, new String[] { "" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "version").checkEq(properties, new String[] { "version" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "deliveryAttempts").checkEq(properties, new String[] { "deliveryAttempts" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "redis-sentinel").checkEq(properties, new String[] { "redis-sentinel" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Thread").checkEq(properties, new String[] { "Thread" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "mdcProfiling").checkEq(properties, new String[] { "mdcProfiling" });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "propertyField1=en,propertyField2=,propertyField3=,propertyField4=embeddedproperty").checkEq(properties, new String[] { "propertyField1=en", "propertyField2=", "propertyField3=", "propertyField4=embeddedproperty" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "SourceMethodName").checkEq(properties, new String[] { "SourceMethodName" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.StackTraceFilter.verbose").checkEq(properties, new String[] { "logstash-gelf.StackTraceFilter.verbose" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.hostname").checkEq(properties, new String[] { "logstash-gelf.hostname" });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "crossCheckHostName=hostname").checkEq(properties, new String[] { "crossCheckHostName=hostname" });
            new Here("Unit", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "propertyField1=en,propertyField2=value of myproperty,propertyField3=,propertyField4=embeddedvalue of mypropertyproperty").checkEq(properties, new String[] { "propertyField1=en", "propertyField2=value of myproperty", "propertyField3=", "propertyField4=embeddedvalue of mypropertyproperty" });
            new Here("Randoop", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "\n").checkEq(properties, new String[] { "\n" });
            for (String field : properties) {
                final int index = field.indexOf(EQ);
                new Here("Randoop", 31).given(field, "StaticMessageField [name='includeLogMessageParameters'").given(EQ, '=').checkEq(index, 24);
                new Here("Randoop", 31).given(field, "{\"short_message\":\"/StackTraceFilter.packages\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "\n").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "Severity").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField3=").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 31).given(field, "172.19.0.1").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, " value='']").given(EQ, '=').checkEq(index, 6);
                new Here("Randoop", 31).given(field, "appender").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "1.0").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField1=${user.language}").given(EQ, '=').checkEq(index, 14);
                new Here("Unit", 31).given(field, "propertyField4=embeddedvalue of mypropertyproperty").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 31).given(field, "additionalFieldType.").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "logstash-gelf.hostname").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "DynamicMdcMessageField [regex='']").given(EQ, '=').checkEq(index, 29);
                new Here("Unit", 31).given(field, "myOriginHost=hostname").given(EQ, '=').checkEq(index, 12);
                new Here("Unit", 31).given(field, "propertyField4=embeddedproperty").given(EQ, '=').checkEq(index, 14);
                new Here("Unit", 31).given(field, "fieldName1=fieldValue1").given(EQ, '=').checkEq(index, 10);
                new Here("Randoop", 31).given(field, "\"full_message\":\"mdcProfiling\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "redis-sentinel").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "1.1").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "MdcMessageField [name='logstash-gelf.skipHostnameResolution'").given(EQ, '=').checkEq(index, 21);
                new Here("Randoop", 31).given(field, "writeBackoffTime").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "profiling.requestDuration").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "localhost").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField4=embeddedmyproperty_IS_UNDEFINEDproperty").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 31).given(field, "connectionTimeout").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "StackTrace").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "SSS\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "readTimeout").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField2=myproperty_IS_UNDEFINED").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 31).given(field, "network").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "logstash-gelf.StackTraceFilter.verbose").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "DynamicMdcMessageField [regex='dynamicMdcFields.']").given(EQ, '=').checkEq(index, 29);
                new Here("Randoop", 31).given(field, "Converter").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField3=${otherproperty:fallback}").given(EQ, '=').checkEq(index, 14);
                new Here("Unit", 31).given(field, "propertyField4=embedded${myproperty}property").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 31).given(field, "logstash-gelf.resolutionOrder").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField3=otherproperty:fallback_IS_UNDEFINED").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 31).given(field, "\"level\":\"yyyy-MM-dd HH:mm:ss").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "<empty>").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "fieldName2=fieldValue2").given(EQ, '=').checkEq(index, 10);
                new Here("Randoop", 31).given(field, "keepAlive").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "hostname").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "level").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "double").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "LogMessageField [name='").given(EQ, '=').checkEq(index, 21);
                new Here("Unit", 31).given(field, "propertyField1=en").given(EQ, '=').checkEq(index, 14);
                new Here("Unit", 31).given(field, "crossCheckHostName=hostname").given(EQ, '=').checkEq(index, 18);
                new Here("Randoop", 31).given(field, "mdcProfiling").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "\"facility\":\"logstash-gelf\"}").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField2=").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 31).given(field, "deliveryAttempts").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "version").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "Thread").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "Marker").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 31).given(field, "long").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField2=${myproperty}").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 31).given(field, " mdcName='profiling.requestDuration.millis']").given(EQ, '=').checkEq(index, 8);
                new Here("Randoop", 31).given(field, "Double").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 31).given(field, "propertyField2=value of myproperty").given(EQ, '=').checkEq(index, 14);
                if (-1 == index) {
                    continue;
                }
                gelfMessageAssembler.addField(new StaticMessageField(field.substring(0, index), field.substring(index + 1)));
            }
        }
    }

    /**
     * Set the MDC fields.
     *
     * @param spec field, field2, field3
     * @param gelfMessageAssembler the Gelf message assembler to apply the configuration
     */
    public static void setMdcFields(String spec, GelfMessageAssembler gelfMessageAssembler) {
        if (null != spec) {
            String[] fields = spec.split(MULTI_VALUE_DELIMITTER);
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "localhost,network").checkEq(fields, new String[] { "localhost", "network" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "includeFullMdc").checkEq(fields, new String[] { "includeFullMdc" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "1.1").checkEq(fields, new String[] { "1.1" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf").checkEq(fields, new String[] { "logstash-gelf" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='PGVtcHR5Pg==', value='Time']").checkEq(fields, new String[] { "StaticMessageField [name='PGVtcHR5Pg=='", " value='Time']" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "hi!").checkEq(fields, new String[] { "hi!" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "keepAlive").checkEq(fields, new String[] { "keepAlive" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StackTrace").checkEq(fields, new String[] { "StackTrace" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "filterStackTrace").checkEq(fields, new String[] { "filterStackTrace" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "a2VlcEFsaXZl").checkEq(fields, new String[] { "a2VlcEFsaXZl" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "DynamicMdcMessageField [regex='']").checkEq(fields, new String[] { "DynamicMdcMessageField [regex='']" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "text/plain").checkEq(fields, new String[] { "text/plain" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "<empty>").checkEq(fields, new String[] { "<empty>" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Severity").checkEq(fields, new String[] { "Severity" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "redis-sentinel").checkEq(fields, new String[] { "redis-sentinel" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"mdcProfiling\",\"full_message\":\"double\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(fields, new String[] { "{\"short_message\":\"mdcProfiling\"", "\"full_message\":\"double\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"timestamp\":\"-0.001\",\"facility\":\"logstash-gelf\"}").checkEq(fields, new String[] { "{\"timestamp\":\"-0.001\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "mdcField.").checkEq(fields, new String[] { "mdcField." });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='profiling.requestDuration.millis', value='timestampPattern']").checkEq(fields, new String[] { "StaticMessageField [name='profiling.requestDuration.millis'", " value='timestampPattern']" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Long").checkEq(fields, new String[] { "Long" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "long").checkEq(fields, new String[] { "long" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "level").checkEq(fields, new String[] { "level" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.skipHostnameResolution").checkEq(fields, new String[] { "logstash-gelf.skipHostnameResolution" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "SourceMethodName").checkEq(fields, new String[] { "SourceMethodName" });
            new Here("Unit", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "").checkEq(fields, new String[] { "" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Double").checkEq(fields, new String[] { "Double" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "/StackTraceFilter.packages").checkEq(fields, new String[] { "/StackTraceFilter.packages" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "DynamicMdcMessageField [regex='dynamicMdcFields.']").checkEq(fields, new String[] { "DynamicMdcMessageField [regex='dynamicMdcFields.']" });
            new Here("Unit", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "mdcField1,mdcField2").checkEq(fields, new String[] { "mdcField1", "mdcField2" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "graylogHost").checkEq(fields, new String[] { "graylogHost" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.LogMessageField.verbose").checkEq(fields, new String[] { "logstash-gelf.LogMessageField.verbose" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "mdcProfiling").checkEq(fields, new String[] { "mdcProfiling" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "full_message").checkEq(fields, new String[] { "full_message" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "String").checkEq(fields, new String[] { "String" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "includeLogMessageParameters").checkEq(fields, new String[] { "includeLogMessageParameters" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "additionalField.").checkEq(fields, new String[] { "additionalField." });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "").checkEq(fields, new String[] { "" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "filter").checkEq(fields, new String[] { "filter" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "writeBackoffTime").checkEq(fields, new String[] { "writeBackoffTime" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.buffer.size").checkEq(fields, new String[] { "logstash-gelf.buffer.size" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "maxWriteBackoffTime").checkEq(fields, new String[] { "maxWriteBackoffTime" });
            new Here("Randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "yyyy-MM-dd HH:mm:ss,SSS").checkEq(fields, new String[] { "yyyy-MM-dd HH:mm:ss", "SSS" });
            for (String field : fields) {
                gelfMessageAssembler.addField(new MdcMessageField(field.trim(), field.trim()));
            }
        }
    }

    /**
     * Set the dynamic MDC fields.
     *
     * @param spec field, .*FieldSuffix, fieldPrefix.*
     * @param gelfMessageAssembler the {@link GelfMessageAssembler}.
     */
    public static void setDynamicMdcFields(String spec, GelfMessageAssembler gelfMessageAssembler) {
        if (null != spec) {
            String[] fields = spec.split(MULTI_VALUE_DELIMITTER);
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"version\":\"additionalFields\",\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(fields, new String[] { "{\"version\":\"additionalFields\"", "\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"<empty>\"}").checkEq(fields, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"<empty>\"}" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "HostnameConverter").checkEq(fields, new String[] { "HostnameConverter" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='keepAlive', value='text/plain']").checkEq(fields, new String[] { "StaticMessageField [name='keepAlive'", " value='text/plain']" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "eyJzaG9ydF9tZXNzYWdlIjoiZHluYW1pY01kY0ZpZWxkVHlwZXMiLCJmdWxsX21lc3NhZ2UiOiJmdWxsX21lc3NhZ2UiLCJ0aW1lc3RhbXAiOiIwLjAxIiwibGV2ZWwiOiJpbmNsdWRlTG9jYXRpb24iLCJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYifQ==").checkEq(fields, new String[] { "eyJzaG9ydF9tZXNzYWdlIjoiZHluYW1pY01kY0ZpZWxkVHlwZXMiLCJmdWxsX21lc3NhZ2UiOiJmdWxsX21lc3NhZ2UiLCJ0aW1lc3RhbXAiOiIwLjAxIiwibGV2ZWwiOiJpbmNsdWRlTG9jYXRpb24iLCJmYWNpbGl0eSI6ImxvZ3N0YXNoLWdlbGYifQ==" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "hi!").checkEq(fields, new String[] { "hi!" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.hostname").checkEq(fields, new String[] { "logstash-gelf.hostname" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.resolutionOrder").checkEq(fields, new String[] { "logstash-gelf.resolutionOrder" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "SourceMethodName").checkEq(fields, new String[] { "SourceMethodName" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"dynamicMdcFieldTypes\",\"full_message\":\"full_message\",\"timestamp\":\"0.01\",\"level\":\"includeLocation\",\"facility\":\"logstash-gelf\"}").checkEq(fields, new String[] { "{\"short_message\":\"dynamicMdcFieldTypes\"", "\"full_message\":\"full_message\"", "\"timestamp\":\"0.01\"", "\"level\":\"includeLocation\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "long").checkEq(fields, new String[] { "long" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "additionalField.").checkEq(fields, new String[] { "additionalField." });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "originHost").checkEq(fields, new String[] { "originHost" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "timestamp").checkEq(fields, new String[] { "timestamp" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "false").checkEq(fields, new String[] { "false" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "graylogHost").checkEq(fields, new String[] { "graylogHost" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "text/plain").checkEq(fields, new String[] { "text/plain" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StackTrace").checkEq(fields, new String[] { "StackTrace" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.fqdn.hostname").checkEq(fields, new String[] { "logstash-gelf.fqdn.hostname" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "").checkEq(fields, new String[] { "" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "hostname").checkEq(fields, new String[] { "hostname" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "keepAlive").checkEq(fields, new String[] { "keepAlive" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "1").checkEq(fields, new String[] { "1" });
            new Here("Unit", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, ".*").checkEq(fields, new String[] { ".*" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(fields, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='Long', value='bG9nc3Rhc2gtZ2VsZi5yZXNvbHV0aW9uT3JkZXI=']").checkEq(fields, new String[] { "StaticMessageField [name='Long'", " value='bG9nc3Rhc2gtZ2VsZi5yZXNvbHV0aW9uT3JkZXI=']" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "<empty>").checkEq(fields, new String[] { "<empty>" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "profiling.requestEnd").checkEq(fields, new String[] { "profiling.requestEnd" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='includeLogMessageParameters', value='']").checkEq(fields, new String[] { "StaticMessageField [name='includeLogMessageParameters'", " value='']" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "network,localhost").checkEq(fields, new String[] { "network", "localhost" });
            new Here("Unit", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "myMdc.*").checkEq(fields, new String[] { "myMdc.*" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "cG9ydA==").checkEq(fields, new String[] { "cG9ydA==" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "filterStackTrace").checkEq(fields, new String[] { "filterStackTrace" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "mdcProfiling").checkEq(fields, new String[] { "mdcProfiling" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Server").checkEq(fields, new String[] { "Server" });
            new Here("Unit", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "myMdc.*,[a-z]+Field").checkEq(fields, new String[] { "myMdc.*", "[a-z]+Field" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "includeFullMdc").checkEq(fields, new String[] { "includeFullMdc" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "\n").checkEq(fields, new String[] { "\n" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "MdcMessageField [name='id', mdcName='logstash-gelf.LogMessageField.verbose']").checkEq(fields, new String[] { "MdcMessageField [name='id'", " mdcName='logstash-gelf.LogMessageField.verbose']" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "readTimeout").checkEq(fields, new String[] { "readTimeout" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Long").checkEq(fields, new String[] { "Long" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\",\"idadditionalField.\":\"SourceMethodName\"}").checkEq(fields, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"", "\"idadditionalField.\":\"SourceMethodName\"}" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "MdcMessageField [name='logstash-gelf.skipHostnameResolution', mdcName='profiling.requestDuration.millis']").checkEq(fields, new String[] { "MdcMessageField [name='logstash-gelf.skipHostnameResolution'", " mdcName='profiling.requestDuration.millis']" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "bWRjUHJvZmlsaW5n").checkEq(fields, new String[] { "bWRjUHJvZmlsaW5n" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "String").checkEq(fields, new String[] { "String" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Thread").checkEq(fields, new String[] { "Thread" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "maxWriteBackoffTime").checkEq(fields, new String[] { "maxWriteBackoffTime" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "SourceLineNumber").checkEq(fields, new String[] { "SourceLineNumber" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Ykc5bmMzUmhjMmd0WjJWc1ppNXlaWE52YkhWMGFXOXVUM0prWlhJPQ==").checkEq(fields, new String[] { "Ykc5bmMzUmhjMmd0WjJWc1ppNXlaWE52YkhWMGFXOXVUM0prWlhJPQ==" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "short_message").checkEq(fields, new String[] { "short_message" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Marker").checkEq(fields, new String[] { "Marker" });
            new Here("Randoop", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.StackTraceFilter.verbose").checkEq(fields, new String[] { "logstash-gelf.StackTraceFilter.verbose" });
            for (String field : fields) {
                gelfMessageAssembler.addField(new DynamicMdcMessageField(field.trim()));
            }
        }
    }

    /**
     * Set the additional field types.
     *
     * @param spec field=String,field1=Double, ... See {@link GelfMessage} for supported types.
     * @param gelfMessageAssembler the Gelf message assembler to apply the configuration
     */
    public static void setAdditionalFieldTypes(String spec, GelfMessageAssembler gelfMessageAssembler) {
        if (null != spec) {
            String[] properties = spec.split(MULTI_VALUE_DELIMITTER);
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Time").checkEq(properties, new String[] { "Time" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "long").checkEq(properties, new String[] { "long" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "yyyy-MM-dd HH:mm:ss,SSS").checkEq(properties, new String[] { "yyyy-MM-dd HH:mm:ss", "SSS" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"profiling.requestEnd\",\"level\":\"{\\\"short_message\\\":\\\"/StackTraceFilter.packages\\\",\\\"full_message\\\":\\\"mdcProfiling\\\",\\\"level\\\":\\\"yyyy-MM-dd HH:mm:ss,SSS\\\",\\\"facility\\\":\\\"logstash-gelf\\\"}\",\"facility\":\"logstash-gelf\",\"_maxWriteBackoffTime\":\"<empty>\"}").checkEq(properties, new String[] { "{\"short_message\":\"profiling.requestEnd\"", "\"level\":\"{\\\"short_message\\\":\\\"/StackTraceFilter.packages\\\"", "\\\"full_message\\\":\\\"mdcProfiling\\\"", "\\\"level\\\":\\\"yyyy-MM-dd HH:mm:ss", "SSS\\\"", "\\\"facility\\\":\\\"logstash-gelf\\\"}\"", "\"facility\":\"logstash-gelf\"", "\"_maxWriteBackoffTime\":\"<empty>\"}" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "filter").checkEq(properties, new String[] { "filter" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "cG9ydA==").checkEq(properties, new String[] { "cG9ydA==" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "host").checkEq(properties, new String[] { "host" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.buffer.size").checkEq(properties, new String[] { "logstash-gelf.buffer.size" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"version\":\"additionalFields\",\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"version\":\"additionalFields\"", "\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "SourceLineNumber").checkEq(properties, new String[] { "SourceLineNumber" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "level").checkEq(properties, new String[] { "level" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "port").checkEq(properties, new String[] { "port" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Server").checkEq(properties, new String[] { "Server" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "LogMessageField [name=',', namedLogField=Server]").checkEq(properties, new String[] { "LogMessageField [name='", "'", " namedLogField=Server]" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Converter").checkEq(properties, new String[] { "Converter" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "network,localhost").checkEq(properties, new String[] { "network", "localhost" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "graylogHost").checkEq(properties, new String[] { "graylogHost" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "DynamicMdcMessageField [regex='']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='']" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "includeLogMessageParameters").checkEq(properties, new String[] { "includeLogMessageParameters" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "writeBackoffThreshold").checkEq(properties, new String[] { "writeBackoffThreshold" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, ",").checkEq(properties, new String[] {});
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.resolutionOrder").checkEq(properties, new String[] { "logstash-gelf.resolutionOrder" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "hostname").checkEq(properties, new String[] { "hostname" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "additionalFieldType.").checkEq(properties, new String[] { "additionalFieldType." });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "text/plain").checkEq(properties, new String[] { "text/plain" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.StackTraceFilter.verbose").checkEq(properties, new String[] { "logstash-gelf.StackTraceFilter.verbose" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "false").checkEq(properties, new String[] { "false" });
            new Here("Unit", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "myMdcs=String,myMdci=long,myMdcl=Long,myMdcf=double,myMdcd=Double").checkEq(properties, new String[] { "myMdcs=String", "myMdci=long", "myMdcl=Long", "myMdcf=double", "myMdcd=Double" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "readTimeout").checkEq(properties, new String[] { "readTimeout" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "<empty>").checkEq(properties, new String[] { "<empty>" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Double").checkEq(properties, new String[] { "Double" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "full_message").checkEq(properties, new String[] { "full_message" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "1").checkEq(properties, new String[] { "1" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "double").checkEq(properties, new String[] { "double" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StackTrace").checkEq(properties, new String[] { "StackTrace" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "redis-sentinel").checkEq(properties, new String[] { "redis-sentinel" });
            new Here("Randoop", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "").checkEq(properties, new String[] { "" });
            for (String field : properties) {
                final int index = field.indexOf(EQ);
                new Here("Randoop", 83).given(field, "SSS\\\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\"full_message\":\"mdcProfiling\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "full_message").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "StackTrace").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "'").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "graylogHost").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "additionalFieldType.").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 83).given(field, "myMdcd=Double").given(EQ, '=').checkEq(index, 6);
                new Here("Randoop", 83).given(field, "SSS").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\\\"facility\\\":\\\"logstash-gelf\\\"}\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "readTimeout").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "text/plain").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\"facility\":\"logstash-gelf\"}").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "yyyy-MM-dd HH:mm:ss").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "long").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 83).given(field, "myMdcl=Long").given(EQ, '=').checkEq(index, 6);
                new Here("Randoop", 83).given(field, "port").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\\\"level\\\":\\\"yyyy-MM-dd HH:mm:ss").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "Server").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "{\"version\":\"additionalFields\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "DynamicMdcMessageField [regex='']").given(EQ, '=').checkEq(index, 29);
                new Here("Randoop", 83).given(field, "false").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "level").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "<empty>").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\"_maxWriteBackoffTime\":\"<empty>\"}").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\"level\":\"{\\\"short_message\\\":\\\"/StackTraceFilter.packages\\\"").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 83).given(field, "myMdci=long").given(EQ, '=').checkEq(index, 6);
                new Here("Randoop", 83).given(field, "Converter").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "writeBackoffThreshold").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "1").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "logstash-gelf.resolutionOrder").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "SSS\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\"level\":\"yyyy-MM-dd HH:mm:ss").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\"facility\":\"logstash-gelf\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\\\"full_message\\\":\\\"mdcProfiling\\\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "filter").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "\"short_message\":\"/StackTraceFilter.packages\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "host").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "LogMessageField [name='").given(EQ, '=').checkEq(index, 21);
                new Here("Unit", 83).given(field, "myMdcf=double").given(EQ, '=').checkEq(index, 6);
                new Here("Randoop", 83).given(field, "logstash-gelf.StackTraceFilter.verbose").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "includeLogMessageParameters").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, "{\"short_message\":\"profiling.requestEnd\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 83).given(field, " namedLogField=Server]").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 83).given(field, "logstash-gelf.buffer.size").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 83).given(field, "myMdcs=String").given(EQ, '=').checkEq(index, 6);
                if (-1 != index) {
                    gelfMessageAssembler.setAdditionalFieldType(field.substring(0, index), field.substring(index + 1));
                }
            }
        }
    }

    /**
     * Set the dynamic mdc field types.
     *
     * @param spec field=String,field1=Double, ... See {@link GelfMessage} for supported types.
     * @param gelfMessageAssembler the Gelf message assembler to apply the configuration
     */
    public static void setDynamicMdcFieldTypes(String spec, GelfMessageAssembler gelfMessageAssembler) {
        if (null != spec) {
            String[] properties = spec.split(MULTI_VALUE_DELIMITTER);
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "bWRjUHJvZmlsaW5n").checkEq(properties, new String[] { "bWRjUHJvZmlsaW5n" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Time").checkEq(properties, new String[] { "Time" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "MessageParam").checkEq(properties, new String[] { "MessageParam" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, ",").checkEq(properties, new String[] {});
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"<empty>\"}").checkEq(properties, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"<empty>\"}" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Double").checkEq(properties, new String[] { "Double" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "").checkEq(properties, new String[] { "" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='graylogPort', value='graylogPort']").checkEq(properties, new String[] { "StaticMessageField [name='graylogPort'", " value='graylogPort']" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "dynamicMdcFieldTypes").checkEq(properties, new String[] { "dynamicMdcFieldTypes" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "port").checkEq(properties, new String[] { "port" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "extractStackTrace").checkEq(properties, new String[] { "extractStackTrace" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf").checkEq(properties, new String[] { "logstash-gelf" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Marker").checkEq(properties, new String[] { "Marker" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "originHost").checkEq(properties, new String[] { "originHost" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"additionalField.\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"additionalField.\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='false', value='logstash-gelf.message.pooling']").checkEq(properties, new String[] { "StaticMessageField [name='false'", " value='logstash-gelf.message.pooling']" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"version\":\"additionalFields\",\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"version\":\"additionalFields\"", "\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "includeLocation").checkEq(properties, new String[] { "includeLocation" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "id").checkEq(properties, new String[] { "id" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.message.pooling").checkEq(properties, new String[] { "logstash-gelf.message.pooling" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "cG9ydA==").checkEq(properties, new String[] { "cG9ydA==" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "rtr-ipaddress.facilities.uu.edu").checkEq(properties, new String[] { "rtr-ipaddress.facilities.uu.edu" });
            new Here("Unit", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "myMdc.long.*=Long,myMdc.double.*=Double,myMdc.string.*=String").checkEq(properties, new String[] { "myMdc.long.*=Long", "myMdc.double.*=Double", "myMdc.string.*=String" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "filter").checkEq(properties, new String[] { "filter" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "<empty>").checkEq(properties, new String[] { "<empty>" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "mdcField.").checkEq(properties, new String[] { "mdcField." });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "readTimeout").checkEq(properties, new String[] { "readTimeout" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"mdcProfiling\",\"full_message\":\"double\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"mdcProfiling\"", "\"full_message\":\"double\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"timestamp\":\"-0.001\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"timestamp\":\"-0.001\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "HostnameConverter").checkEq(properties, new String[] { "HostnameConverter" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "PatternLogMessageField [name='DynamicMdcMessageField [regex='']', namedLogField=NDC]").checkEq(properties, new String[] { "PatternLogMessageField [name='DynamicMdcMessageField [regex='']'", " namedLogField=NDC]" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "a2VlcEFsaXZl").checkEq(properties, new String[] { "a2VlcEFsaXZl" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.LogMessageField.verbose").checkEq(properties, new String[] { "logstash-gelf.LogMessageField.verbose" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "SourceMethodName").checkEq(properties, new String[] { "SourceMethodName" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "hostname").checkEq(properties, new String[] { "hostname" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "MdcMessageField [name='0', mdcName='maxWriteBackoffTime']").checkEq(properties, new String[] { "MdcMessageField [name='0'", " mdcName='maxWriteBackoffTime']" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "deliveryAttempts").checkEq(properties, new String[] { "deliveryAttempts" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "StaticMessageField [name='profiling.requestDuration.millis', value='timestampPattern']").checkEq(properties, new String[] { "StaticMessageField [name='profiling.requestDuration.millis'", " value='timestampPattern']" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "/StackTraceFilter.packages").checkEq(properties, new String[] { "/StackTraceFilter.packages" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "profiling.requestStart.millis").checkEq(properties, new String[] { "profiling.requestStart.millis" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "LogMessageField [name=',', namedLogField=Server]").checkEq(properties, new String[] { "LogMessageField [name='", "'", " namedLogField=Server]" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "Thread").checkEq(properties, new String[] { "Thread" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "text/plain").checkEq(properties, new String[] { "text/plain" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "logstash-gelf.fqdn.hostname").checkEq(properties, new String[] { "logstash-gelf.fqdn.hostname" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "DynamicMdcMessageField [regex='']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='']" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "kafka").checkEq(properties, new String[] { "kafka" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "timestampPattern").checkEq(properties, new String[] { "timestampPattern" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "hi!").checkEq(properties, new String[] { "hi!" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "DynamicMdcMessageField [regex='dynamicMdcFields.']").checkEq(properties, new String[] { "DynamicMdcMessageField [regex='dynamicMdcFields.']" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "facility").checkEq(properties, new String[] { "facility" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "additionalField.").checkEq(properties, new String[] { "additionalField." });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "MdcMessageField [name='logstash-gelf.skipHostnameResolution', mdcName='profiling.requestDuration.millis']").checkEq(properties, new String[] { "MdcMessageField [name='logstash-gelf.skipHostnameResolution'", " mdcName='profiling.requestDuration.millis']" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "additionalFieldTypes").checkEq(properties, new String[] { "additionalFieldTypes" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"dynamicMdcFieldTypes\",\"full_message\":\"filterStackTrace\",\"timestamp\":\"0.01\",\"level\":\"includeLocation\",\"facility\":\"logstash-gelf\"}").checkEq(properties, new String[] { "{\"short_message\":\"dynamicMdcFieldTypes\"", "\"full_message\":\"filterStackTrace\"", "\"timestamp\":\"0.01\"", "\"level\":\"includeLocation\"", "\"facility\":\"logstash-gelf\"}" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "LogMessageField [name='mdcProfiling', namedLogField=Server]").checkEq(properties, new String[] { "LogMessageField [name='mdcProfiling'", " namedLogField=Server]" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "NDC").checkEq(properties, new String[] { "NDC" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "includeFullMdc").checkEq(properties, new String[] { "includeFullMdc" });
            new Here("Randoop", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "{\"short_message\":\"/StackTraceFilter.packages\",\"full_message\":\"mdcProfiling\",\"level\":\"yyyy-MM-dd HH:mm:ss,SSS\",\"facility\":\"logstash-gelf\",\"idadditionalField.\":\"SourceMethodName\"}").checkEq(properties, new String[] { "{\"short_message\":\"/StackTraceFilter.packages\"", "\"full_message\":\"mdcProfiling\"", "\"level\":\"yyyy-MM-dd HH:mm:ss", "SSS\"", "\"facility\":\"logstash-gelf\"", "\"idadditionalField.\":\"SourceMethodName\"}" });
            for (String field : properties) {
                final int index = field.indexOf(EQ);
                new Here("Randoop", 102).given(field, "{\"short_message\":\"mdcProfiling\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "hi!").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "StaticMessageField [name='false'").given(EQ, '=').checkEq(index, 24);
                new Here("Randoop", 102).given(field, "LogMessageField [name='").given(EQ, '=').checkEq(index, 21);
                new Here("Randoop", 102).given(field, "id").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "\"short_message\":\"/StackTraceFilter.packages\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "includeLocation").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "MdcMessageField [name='0'").given(EQ, '=').checkEq(index, 21);
                new Here("Randoop", 102).given(field, "SourceMethodName").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "facility").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "a2VlcEFsaXZl").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "logstash-gelf.LogMessageField.verbose").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "includeFullMdc").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 102).given(field, "myMdc.string.*=String").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 102).given(field, "logstash-gelf").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "{\"short_message\":\"additionalField.\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "<empty>").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "deliveryAttempts").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "bWRjUHJvZmlsaW5n").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "{\"short_message\":\"/StackTraceFilter.packages\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "DynamicMdcMessageField [regex='']").given(EQ, '=').checkEq(index, 29);
                new Here("Randoop", 102).given(field, "{\"version\":\"additionalFields\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "originHost").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "Time").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "mdcField.").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "\"level\":\"yyyy-MM-dd HH:mm:ss").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "additionalFieldTypes").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "cG9ydA==").given(EQ, '=').checkEq(index, 6);
                new Here("Randoop", 102).given(field, "additionalField.").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "\"facility\":\"logstash-gelf\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "\"facility\":\"logstash-gelf\"}").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "dynamicMdcFieldTypes").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "StaticMessageField [name='graylogPort'").given(EQ, '=').checkEq(index, 24);
                new Here("Randoop", 102).given(field, "kafka").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 102).given(field, "myMdc.long.*=Long").given(EQ, '=').checkEq(index, 12);
                new Here("Randoop", 102).given(field, "DynamicMdcMessageField [regex='dynamicMdcFields.']").given(EQ, '=').checkEq(index, 29);
                new Here("Randoop", 102).given(field, "hostname").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "timestampPattern").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "MessageParam").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "StaticMessageField [name='profiling.requestDuration.millis'").given(EQ, '=').checkEq(index, 24);
                new Here("Randoop", 102).given(field, "text/plain").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "port").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "filter").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "/StackTraceFilter.packages").given(EQ, '=').checkEq(index, -1);
                new Here("Unit", 102).given(field, "myMdc.double.*=Double").given(EQ, '=').checkEq(index, 14);
                new Here("Randoop", 102).given(field, "logstash-gelf.fqdn.hostname").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "\"idadditionalField.\":\"SourceMethodName\"}").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "rtr-ipaddress.facilities.uu.edu").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "SSS\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "profiling.requestStart.millis").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "NDC").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "readTimeout").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "Marker").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "extractStackTrace").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "HostnameConverter").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "\"full_message\":\"mdcProfiling\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "{\"timestamp\":\"-0.001\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "LogMessageField [name='mdcProfiling'").given(EQ, '=').checkEq(index, 21);
                new Here("Randoop", 102).given(field, "Double").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "\"full_message\":\"double\"").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "PatternLogMessageField [name='DynamicMdcMessageField [regex='']'").given(EQ, '=').checkEq(index, 28);
                new Here("Randoop", 102).given(field, "").given(EQ, '=').checkEq(index, -1);
                new Here("Randoop", 102).given(field, "logstash-gelf.message.pooling").given(EQ, '=').checkEq(index, -1);
                if (-1 != index) {
                    gelfMessageAssembler.setDynamicMdcFieldType(field.substring(0, index), field.substring(index + 1));
                }
            }
        }
    }
}
