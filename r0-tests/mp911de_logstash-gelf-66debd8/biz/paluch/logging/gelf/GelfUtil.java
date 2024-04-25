package biz.paluch.logging.gelf;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import biz.paluch.logging.gelf.intern.GelfMessage;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * @author Mark Paluch
 * @since 17.09.13 10:47
 */
public class GelfUtil {

    /**
     * Profiling Start in MDC (msec).
     */
    public static final String MDC_REQUEST_START_MS = "profiling.requestStart.millis";

    /**
     * Profiling End in MDC.
     */
    public static final String MDC_REQUEST_END = "profiling.requestEnd";

    /**
     * Profiling Duration in MDC.
     */
    public static final String MDC_REQUEST_DURATION = "profiling.requestDuration";

    public static final String MDC_REQUEST_DURATION_MILLIS = "profiling.requestDuration.millis";

    private GelfUtil() {
    }

    public static void addMdcProfiling(LogEvent logEvent, GelfMessage gelfMessage) {
        String requestStartMs = logEvent.getMdcValue(MDC_REQUEST_START_MS);
        long timestamp;
        if (requestStartMs != null && !requestStartMs.isEmpty()) {
            timestamp = Long.parseLong(requestStartMs);
        } else {
            return;
        }
        if (timestamp > 0) {
            long now = System.currentTimeMillis();
            long durationMs = now - timestamp;
            String durationText;
            if (durationMs > 10000) {
                long durationSec = durationMs / 1000;
                durationText = durationSec + "sec";
            } else {
                durationText = durationMs + "ms";
            }
            gelfMessage.addField(MDC_REQUEST_DURATION, durationText);
            gelfMessage.addField(MDC_REQUEST_DURATION_MILLIS, "" + durationMs);
            gelfMessage.addField(MDC_REQUEST_END, new Date(now).toString());
        }
    }

    public static String getSimpleClassName(String className) {
        if (className == null) {
            return null;
        }
        int index = className.lastIndexOf('.');
        if (index != -1) {
            return className.substring(index + 1);
        }
        return className;
    }

    public static Set<String> getMatchingMdcNames(DynamicMdcMessageField field, Set<String> mdcNames) {
        Set<String> matchingMdcNames = new HashSet<>();
        for (String mdcName : mdcNames) {
            if (field.getPattern().matcher(mdcName).matches()) {
                itest("randoop", 81).given(mdcName, "Long").given(field, "143.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdcl").given(field, "5.xml").checkTrue(group());
                itest("dev", 81).given(mdcName, "myMdc").given(field, "6.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "localhost,network").given(field, "48.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc.stringValue").given(field, "5.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, "redis-sentinel").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "extractStackTrace").given(field, "152.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "someOtherField").given(field, "6.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "additionalFieldTypes").given(field, "74.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc.doubleValue1").given(field, "5.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, ",").given(field, "148.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdcs").given(field, "6.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "StaticMessageField [name='{\"timestamp\":\"0.052\",\"facility\":\"logstash-gelf\",\"_resolutionOrder\":1.1}', value='LogMessageField [name='dynamicMdcFields.', namedLogField=Marker]']").given(field, "48.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdcs").given(field, "5.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, "port").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "ZnVsbF9tZXNzYWdl").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "additionalFieldTypes").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "Long").given(field, "141.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "dynamicMdcFields.").given(field, "48.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc-with-suffix2").given(field, "5.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, "NDC").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "Double").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "NDC").given(field, "151.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "Long").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "appender").given(field, "150.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc-with-suffix1").given(field, "5.xml").checkTrue(group());
                itest("dev", 81).given(mdcName, "myMdcl").given(field, "6.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdcd").given(field, "6.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "String").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "redis-sentinel").given(field, "148.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "someField").given(field, "5.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "/StackTraceFilter.packages").given(field, "143.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdcf").given(field, "6.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc.doubleValue2").given(field, "5.xml").checkTrue(group());
                itest("dev", 81).given(mdcName, "myMdcf").given(field, "5.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, "text/plain").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "profiling.requestEnd").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "appender").given(field, "48.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "someOtherField").given(field, "5.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc.longValue2").given(field, "5.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, ",").given(field, "150.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "Long").given(field, "74.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdcd").given(field, "5.xml").checkTrue(group());
                itest("dev", 81).given(mdcName, "myMdci").given(field, "5.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, "{\"host\":\"logstash-gelf\",\"facility\":\"includeLocation\",\"_resolutionOrder\":1.1}").given(field, "142.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdci").given(field, "6.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc.longValue1").given(field, "5.xml").checkTrue(group());
                itest("dev", 81).given(mdcName, "myMdc.undefinedValue").given(field, "5.xml").checkTrue(group());
                itest("dev", 81).given(mdcName, "someField").given(field, "6.xml").checkTrue(group());
                itest("dev", 81).given(mdcName, "myMdc-with-suffix1").given(field, "6.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "Converter").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "id").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, ",").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "\n").given(field, "144.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "NDC").given(field, "71.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc").given(field, "5.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, "appender").given(field, "148.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "myMdc-with-suffix2").given(field, "6.xml").checkFalse(group());
                itest("dev", 81).given(mdcName, "mdcField1").given(field, "3.xml").checkTrue(group());
                itest("randoop", 81).given(mdcName, "extractStackTrace").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "graylogHost").given(field, "48.xml").checkFalse(group());
                itest("randoop", 81).given(mdcName, "extractStackTrace").given(field, "149.xml").checkFalse(group());
                matchingMdcNames.add(mdcName);
            }
        }
        return matchingMdcNames;
    }
}
