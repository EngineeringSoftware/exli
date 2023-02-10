package biz.paluch.logging.gelf;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import biz.paluch.logging.gelf.intern.GelfMessage;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
                new Here("Unit", 81).given(mdcName, "myMdcd").given(field, "14.xml").checkFalse(group());
                new Here("Randoop", 81).given(mdcName, "HostnameConverter").given(field, "110.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdcf").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "someOtherField").given(field, "14.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdc-with-suffix2").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdcs").given(field, "14.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "someField").given(field, "7.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdcf").given(field, "14.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "someOtherField").given(field, "7.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdcl").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "mdcField1").given(field, "16.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdc-with-suffix2").given(field, "14.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdc.doubleValue1").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdc.longValue1").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdc.undefinedValue").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdc.doubleValue2").given(field, "7.xml").checkTrue(group());
                new Here("Randoop", 81).given(mdcName, "additionalFields").given(field, "109.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdc").given(field, "14.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdcd").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdc.longValue2").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdci").given(field, "14.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdcl").given(field, "14.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "someField").given(field, "14.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdc").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdc-with-suffix1").given(field, "14.xml").checkFalse(group());
                new Here("Unit", 81).given(mdcName, "myMdc-with-suffix1").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdci").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdcs").given(field, "7.xml").checkTrue(group());
                new Here("Unit", 81).given(mdcName, "myMdc.stringValue").given(field, "7.xml").checkTrue(group());
                matchingMdcNames.add(mdcName);
            }
        }
        return matchingMdcNames;
    }
}
