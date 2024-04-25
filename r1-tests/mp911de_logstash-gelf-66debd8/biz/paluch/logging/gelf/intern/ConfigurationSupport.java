package biz.paluch.logging.gelf.intern;

import biz.paluch.logging.gelf.DynamicMdcMessageField;
import biz.paluch.logging.gelf.GelfMessageAssembler;
import biz.paluch.logging.gelf.MdcMessageField;
import biz.paluch.logging.gelf.StaticMessageField;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

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
            itest("dev", 28).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "fieldName1=fieldValue1,fieldName2=fieldValue2").checkEq(properties, new String[] { "fieldName1=fieldValue1", "fieldName2=fieldValue2" });
            for (String field : properties) {
                final int index = field.indexOf(EQ);
                itest("dev", 31).given(field, "fieldName1=fieldValue1").given(EQ, '=').checkEq(index, 10);
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
            itest("dev", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "mdcField1,mdcField2").checkEq(fields, new String[] { "mdcField1", "mdcField2" });
            itest("randoop", 48).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "hi!").checkEq(fields, new String[] { "hi!" });
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
            itest("dev", 64).given(MULTI_VALUE_DELIMITTER, ",").given(spec, ".*").checkEq(fields, new String[] { ".*" });
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
            itest("dev", 80).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "myMdcs=String,myMdci=long,myMdcl=Long,myMdcf=double,myMdcd=Double").checkEq(properties, new String[] { "myMdcs=String", "myMdci=long", "myMdcl=Long", "myMdcf=double", "myMdcd=Double" });
            for (String field : properties) {
                final int index = field.indexOf(EQ);
                itest("dev", 83).given(field, "myMdcs=String").given(EQ, '=').checkEq(index, 6);
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
            itest("dev", 99).given(MULTI_VALUE_DELIMITTER, ",").given(spec, "myMdc.long.*=Long,myMdc.double.*=Double,myMdc.string.*=String").checkEq(properties, new String[] { "myMdc.long.*=Long", "myMdc.double.*=Double", "myMdc.string.*=String" });
            for (String field : properties) {
                final int index = field.indexOf(EQ);
                itest("dev", 102).given(field, "myMdc.long.*=Long").given(EQ, '=').checkEq(index, 12);
                if (-1 != index) {
                    gelfMessageAssembler.setDynamicMdcFieldType(field.substring(0, index), field.substring(index + 1));
                }
            }
        }
    }
}
