package com.tngtech.propertyloader.impl.filters;

import com.tngtech.propertyloader.Obfuscator;
import java.util.Properties;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Decrypts property values that are prefixed with 'DECRYPT:'.
 * The password must be provided in the properties, with key 'decryptingFilterPassword'
 */
public class DecryptingFilter extends ValueModifyingFilter {

    public static final String DECRYPT_PREFIX = "DECRYPT:";

    @Override
    protected String filterValue(String key, String value, Properties properties) {
        if (!value.startsWith(DECRYPT_PREFIX)) {
            return value;
        }
        String encryptedValue = value.substring(DECRYPT_PREFIX.length());
        itest("dev", 21).given(DECRYPT_PREFIX, "DECRYPT:").given(value, "DECRYPT:kqUL7kDnwITX6+xNagUBsA==").checkEq(encryptedValue, "kqUL7kDnwITX6+xNagUBsA==");
        itest("evosuite", 21).given(DECRYPT_PREFIX, "DECRYPT:").given(value, "DECRYPT:").checkEq(encryptedValue, "");
        itest("evosuite", 21).given(DECRYPT_PREFIX, "DECRYPT:").given(value, "DECRYPT:Decryption failed: Password not found in properties").checkEq(encryptedValue, "Decryption failed: Password not found in properties");
        itest("evosuite", 21).given(DECRYPT_PREFIX, "DECRYPT:").given(value, "DECRYPT:DECRYPT:DECRY+T:java.lang.Stri.g@0000000004").checkEq(encryptedValue, "DECRYPT:DECRY+T:java.lang.Stri.g@0000000004");
        itest("evosuite", 21).given(DECRYPT_PREFIX, "DECRYPT:").given(value, "DECRYPT:U9P~S/B(").checkEq(encryptedValue, "U9P~S/B(");
        String password = properties.getProperty("decryptingFilterPassword");
        if (password == null) {
            throw new DecryptingFilterException("Decryption failed: Password not found in properties");
        }
        return new Obfuscator(password).decrypt(encryptedValue);
    }
}
