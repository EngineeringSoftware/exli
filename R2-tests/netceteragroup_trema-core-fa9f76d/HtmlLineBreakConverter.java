package com.netcetera.trema.core.exporting;

import com.netcetera.trema.core.api.IExportFilter;
import com.netcetera.trema.core.api.IKeyValuePair;
import org.apache.commons.lang3.StringUtils;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Filter for converting newlines (\n, \r\n and \r) into HTML
 * line breaks (<code><br></code>).
 * Note that the newlines in the value are written out, meaning '\n' are
 * actually two characters instead of the character with ASCII code 10.
 */
public class HtmlLineBreakConverter implements IExportFilter {

    private static final String REPLACEMENT = "<br/>";

    @Override
    public void filter(IKeyValuePair keyValuePair) {
        String value = keyValuePair.getValue();
        if (value != null) {
            String newValue = StringUtils.replace(value, "\\r\\n", REPLACEMENT);
            new Here("Unit", 21).given(REPLACEMENT, "<br/>").given(value, "The quick brown fox jumps\\n over the lazy dog.").checkEq(newValue, "The quick brown fox jumps\\n over the lazy dog.");
            new Here("Unit", 21).given(REPLACEMENT, "<br/>").given(value, "The quick brown fox jumps\\r\\n over the lazy dog.").checkEq(newValue, "The quick brown fox jumps<br/> over the lazy dog.");
            newValue = StringUtils.replace(newValue, "\\n", REPLACEMENT);
            new Here("Unit", 22).given(REPLACEMENT, "<br/>").given(newValue, "The quick brown fox jumps\\n over the lazy dog.").checkEq(newValue, "The quick brown fox jumps<br/> over the lazy dog.");
            newValue = StringUtils.replace(newValue, "\\r", REPLACEMENT);
            new Here("Unit", 23).given(REPLACEMENT, "<br/>").given(newValue, "The quick brown fox jumps\\r over the lazy dog.").checkEq(newValue, "The quick brown fox jumps<br/> over the lazy dog.");
            new Here("Unit", 23).given(REPLACEMENT, "<br/>").given(newValue, "The quick brown fox jumps<br/> over the lazy dog.").checkEq(newValue, "The quick brown fox jumps<br/> over the lazy dog.");
            keyValuePair.setValue(newValue);
        }
    }
}
