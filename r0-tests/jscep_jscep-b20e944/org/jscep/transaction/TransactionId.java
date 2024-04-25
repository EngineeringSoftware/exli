package org.jscep.transaction;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.Charsets;
import org.apache.commons.lang3.ArrayUtils;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * This class represents a SCEP <code>transactionID</code> attribute.
 */
public final class TransactionId implements Serializable, Comparable<TransactionId> {

    private static final long serialVersionUID = -5248125945726721520L;

    private static final AtomicLong ID_SOURCE = new AtomicLong();

    private final byte[] id;

    /**
     * Creates a new <tt>TransactionId</tt> from the provided byte array.
     *
     * @param id
     *            the ID to copy.
     */
    public TransactionId(final byte[] id) {
        this.id = ArrayUtils.clone(id);
    }

    private TransactionId(final PublicKey pubKey, final String digestAlgorithm) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance(digestAlgorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        id = new Hex().encode(digest.digest(pubKey.getEncoded()));
    }

    private TransactionId() {
        try {
            id = Long.toHexString(ID_SOURCE.getAndIncrement()).getBytes(Charsets.US_ASCII.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a new Transaction ID
     * <p>
     * Each call to this method will return the same transaction ID given the
     * same parameters.
     *
     * @param pubKey
     *            the key on which to base the transaction ID.
     * @param digestAlgorithm
     *            the algorithm to use to digest the key
     * @return the new <tt>TransactionID</tt>
     */
    public static TransactionId createTransactionId(final PublicKey pubKey, final String digestAlgorithm) {
        return new TransactionId(pubKey, digestAlgorithm);
    }

    /**
     * Creates a new Transaction Id
     * <p>
     * Each call to this method will return a different transaction ID.
     *
     * @return the new <tt>TransactionID</tt>
     */
    public static TransactionId createTransactionId() {
        return new TransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            return new String(id, Charsets.US_ASCII.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionId that = (TransactionId) o;
        return Arrays.equals(id, that.id);
    }

    @Override
    public int compareTo(TransactionId that) {
        for (int i = 0, j = 0; i < this.id.length && j < that.id.length; i++, j++) {
            int a = (this.id[i] & 0xff);
            itest("evosuite", 113).given(i, 2).given(this.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).checkEq(a, 31);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 53, 53 }).checkEq(a, 50);
            itest("evosuite", 113).given(i, 0).given(this.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).checkEq(a, 253);
            itest("randoop", 113).given(i, 2).given(this.id, new byte[] { 50, 52, 50 }).checkEq(a, 50);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -84, 11, 70, 40, 101, -128, -110, 12, 66, -46, 77, 109, -58, 85, 70, -76 }).checkEq(a, 172);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 52, 52 }).checkEq(a, 52);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 53, 50 }).checkEq(a, 50);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 97, 100 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -40, -12, -69, 4, 118, 38, -20, 91, 117, -102, -86, 100, 118, -68, -28, 114 }).checkEq(a, 216);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -38, -71, 51, -30, 0, -88, -7, 63, -106, -89, -120, -51, 27, 114, -99, -106 }).checkEq(a, 218);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -3, 5, -80, 43, 126, -11, 119, -2, 80, -69, 53, -109, 83, 115, 57, -84 }).checkEq(a, 253);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 55, 56 }).checkEq(a, 55);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -8, -70, -61, 82, 119, -6, -105, 13, 92, 93, 117, 120, -127, 66, -98, 90 }).checkEq(a, 248);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 98, 102 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -80, -28, -25, 104, 78, -42, -126, -49, -51, -107, 32, 76, -46, -103, -17, -47 }).checkEq(a, 176);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 35, 10, -115, 32, -32, 89, 79, -18, -15, -21, -109, -12, 53, -125, 44, -90 }).checkEq(a, 35);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 51, 52 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 97, 97 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 53, 98 }).checkEq(a, 50);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -128, -111, 22, 43, -85, 42, 76, -67, -89, 95, 6, -17, -107, -123, 56, 107 }).checkEq(a, 128);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 53, 56 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 99, 100 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -109, 73, 127, 31, -54, -82, -46, -98, 44, -111, -2, -88, -19, -98, 53, 70 }).checkEq(a, 147);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 49, 102 }).checkEq(a, 50);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 72, 4, 64, -26, -69, -35, -14, 44, 125, -73, 84, 92, 81, 48, -121, 34 }).checkEq(a, 72);
            itest("evosuite", 113).given(i, 0).given(this.id, new byte[] { 51 }).checkEq(a, 51);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 53, 56 }).checkEq(a, 50);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 77, -93, 121, 13, 48, -63, 97, 23, -125, 89, 105, 21, -10, -62, -117, -119 }).checkEq(a, 77);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 0, 17, 106, 12, -36, 106, -117, 110, -116, -118, -110, -53, -60, 34, 29, 22 }).checkEq(a, 0);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -20, -40, 45, -18, 121, 113, -65, 84, -67, 91, 88, 107, -14, 78, 32, -90 }).checkEq(a, 236);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 115, 68, -25, -84, 64, -54, -63, -61, 120, 92, 88, 70, 86, 116, -87, -67 }).checkEq(a, 115);
            itest("randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 55, 56 }).checkEq(a, 56);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 52, 101 }).checkEq(a, 52);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 55, 52 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -63, 123, -85, 25, 36, 26, 105, 18, 69, 55, -15, -72, -11, 108, -49, 105 }).checkEq(a, 193);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 52, 53 }).checkEq(a, 53);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 71, 118, 75, 32, 100, -85, -105, -47, -57, -8, 105, -3, 67, 84, -39, 19 }).checkEq(a, 71);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -32, 110, -22, -98, -120, 2, -9, -84, -111, -73, -15, 53, -12, -101, 20, 24 }).checkEq(a, 224);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 56, 55 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 98, 99 }).checkEq(a, 98);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 71, 112, -20, -4, 116, -56, 65, -57, 59, 93, -81, -44, 30, -59, -115, 117 }).checkEq(a, 71);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 97, 51 }).checkEq(a, 49);
            itest("evosuite", 113).given(i, 0).given(this.id, new byte[] { 48 }).checkEq(a, 48);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 83, 5, -87, -73, 86, -105, 89, -73, -4, 85, -113, -89, 112, 73, 22, 12 }).checkEq(a, 83);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 101, 100 }).checkEq(a, 101);
            itest("randoop", 113).given(i, 2).given(this.id, new byte[] { 1, 0, 100, 0, -1 }).checkEq(a, 100);
            itest("evosuite", 113).given(i, 7).given(this.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).checkEq(a, 0);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 98, 53 }).checkEq(a, 98);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 99, 100 }).checkEq(a, 99);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -71, -60, -119, 3, -109, -95, -66, -23, 95, 35, -25, -113, -61, 112, -9, -44 }).checkEq(a, 185);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 1, 0, 100, 0, -1 }).checkEq(a, 1);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 100, 57 }).checkEq(a, 100);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 49, 48 }).checkEq(a, 50);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 54, 56 }).checkEq(a, 54);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 97, 51 }).checkEq(a, 97);
            itest("evosuite", 113).given(i, 3).given(this.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).checkEq(a, 0);
            itest("randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 99, 100 }).checkEq(a, 100);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 100, 54 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 55, 56 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 100, 57 }).checkEq(a, 57);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -21, 74, -116, 57, -46, -72, -69, -82, 2, -94, -2, -107, 123, -92, 68, -30 }).checkEq(a, 235);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 34, 107, -117, -125, -89, 79, 105, -96, -88, -37, -64, 123, -15, 8, 81, -42 }).checkEq(a, 34);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -106, 52, -119, 67, -74, 89, -82, 24, 11, 107, -51, 74, 101, 11, 13, 70 }).checkEq(a, 150);
            itest("evosuite", 113).given(i, 1).given(this.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).checkEq(a, 0);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 101, 100 }).checkEq(a, 100);
            itest("randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 51, 52 }).checkEq(a, 52);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -91, 56, -66, 65, 40, 114, 125, 64, -89, 94, 52, 62, -32, -54, 85, -8 }).checkEq(a, 165);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 52, 49 }).checkEq(a, 52);
            itest("evosuite", 113).given(i, 0).given(this.id, new byte[] { 56 }).checkEq(a, 56);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -1, 8, -97, 63, 90, -48, 87, 95, -5, 13, 10, -12, -64, 116, 84, -68 }).checkEq(a, 255);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 51, 52 }).checkEq(a, 51);
            itest("randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 97, 51 }).checkEq(a, 51);
            itest("evosuite", 113).given(i, 6).given(this.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).checkEq(a, 186);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 52, 49 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 98, 53 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 50, -28, -56, -54, 99, 117, 55, 127, -64, -27, -17, -53, 110, 90, -51, 124 }).checkEq(a, 50);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 16, 107, 46, 44, 75, -46, -30, 119, -28, -113, -113, -100, -26, 66, 115, 65 }).checkEq(a, 16);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 100, 50 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -116, 29, -34, 103, 92, -108, -83, 96, -84, -87, 80, 41, 74, 54, 8, -20 }).checkEq(a, 140);
            itest("evosuite", 113).given(i, 4).given(this.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).checkEq(a, 255);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -127, 106, -58, -37, -109, -79, -7, 38, -69, 94, 16, 127, 27, -18, 102, -10 }).checkEq(a, 129);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 10, 10, 10 }).checkEq(a, 10);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -22, -21, -51, -76, 8, -13, 116, 105, 9, 127, 66, 106, 44, 36, 84, -114 }).checkEq(a, 234);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 53, 98 }).checkEq(a, 53);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 52, 101 }).checkEq(a, 101);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 52, 52 }).checkEq(a, 52);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 97, 49 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 48, 99 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 2, 45, -59, -54, -13, 63, 48, -88, -34, 64, -64, -29, 105, -4, 83, -88 }).checkEq(a, 2);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 1, 0, 100, 0, -1 }).checkEq(a, 0);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 56, 56 }).checkEq(a, 56);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 116, 14, 85, -20, -43, 53, -113, -7, 33, 18, 22, 101, 41, 93, 5, 86 }).checkEq(a, 116);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 52, 50 }).checkEq(a, 50);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 56, -97, 27, -33, 73, 56, 16, -91, 105, -12, -128, -118, 18, 11, 71, 35 }).checkEq(a, 56);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 52, 53 }).checkEq(a, 52);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 104, 52, 36, -78, 104, -45, 70, 26, 97, -41, -94, -36, -67, 107, -24, 64 }).checkEq(a, 104);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 53, 98 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -95, -75, -55, 42, -104, -6, -61, 69, -37, -59, 38, 83, 124, -94, 49, -17 }).checkEq(a, 161);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 54, 101 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 98, 53 }).checkEq(a, 53);
            itest("randoop", 113).given(i, 4).given(this.id, new byte[] { 1, 0, 100, 0, -1 }).checkEq(a, 255);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -100, 52, 92, -45, -4, -108, -111, 100, -128, -62, -76, -109, -50, -120, 118, 17 }).checkEq(a, 156);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -82, -8, -121, 5, -71, -69, -11, 115, -75, -94, -12, 82, 19, -35, 97, 121 }).checkEq(a, 174);
            itest("randoop", 113).given(i, 3).given(this.id, new byte[] { 1, 0, 100, 0, -1 }).checkEq(a, 0);
            itest("evosuite", 113).given(i, 5).given(this.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).checkEq(a, 53);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 104, 89, 82, -65, 126, 6, 56, 112, 20, 69, -51, -115, 95, 32, 11, 104 }).checkEq(a, 104);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -128, 2, -112, -22, 10, -103, -37, -95, -26, 1, -118, -124, -38, 58, 45, 83 }).checkEq(a, 128);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { -68, 64, 2, 24, -100, -61, 105, 122, -55, -127, 103, -40, -92, -117, 18, 123 }).checkEq(a, 188);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 53, 53 }).checkEq(a, 49);
            itest("randoop", 113).given(i, 1).given(this.id, new byte[] { 50, 52, 50 }).checkEq(a, 52);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 54, 57 }).checkEq(a, 54);
            itest("randoop", 113).given(i, 0).given(this.id, new byte[] { 114, 39, 122, -121, -71, -7, 27, -49, 7, 41, -112, -102, 119, 9, -107, -106 }).checkEq(a, 114);
            int b = (that.id[j] & 0xff);
            itest("randoop", 114).given(that.id, new byte[] { 50, 53, 99 }).given(j, 1).checkEq(b, 53);
            itest("randoop", 114).given(that.id, new byte[] { -127, 40, -3, -75, 113, -95, 117, 114, 12, -92, 53, 99, -89, -106, 85, 125 }).given(j, 0).checkEq(b, 129);
            itest("randoop", 114).given(that.id, new byte[] { 51, 51, 48 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 102, 54 }).given(j, 0).checkEq(b, 102);
            itest("randoop", 114).given(that.id, new byte[] { 71, 76, 9, 21, 9, 69, -71, -121, 106, -102, -37, -42, -17, -68, 103, 94 }).given(j, 0).checkEq(b, 71);
            itest("randoop", 114).given(that.id, new byte[] { 49, 55, 57 }).given(j, 2).checkEq(b, 57);
            itest("randoop", 114).given(that.id, new byte[] { 51, 56, 50 }).given(j, 0).checkEq(b, 51);
            itest("evosuite", 114).given(that.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).given(j, 2).checkEq(b, 31);
            itest("randoop", 114).given(that.id, new byte[] { 49, 100, 52 }).given(j, 0).checkEq(b, 49);
            itest("evosuite", 114).given(that.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).given(j, 4).checkEq(b, 255);
            itest("randoop", 114).given(that.id, new byte[] { 49, 99, 101 }).given(j, 1).checkEq(b, 99);
            itest("randoop", 114).given(that.id, new byte[] { 49, 97, 55 }).given(j, 0).checkEq(b, 49);
            itest("evosuite", 114).given(that.id, new byte[] { 49 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { -116, -102, -19, 54, 33, 13, 70, -42, 21, 44, 122, 76, 34, 46, 13, 19 }).given(j, 0).checkEq(b, 140);
            itest("randoop", 114).given(that.id, new byte[] { 51, 55, 55 }).given(j, 1).checkEq(b, 55);
            itest("randoop", 114).given(that.id, new byte[] { 49, 100, 53 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 49, 98, 54 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 50, 99, 54 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 50, 57, 48 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 50, 102, 101 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 52, 51 }).given(j, 0).checkEq(b, 52);
            itest("randoop", 114).given(that.id, new byte[] { 100, 97 }).given(j, 1).checkEq(b, 97);
            itest("randoop", 114).given(that.id, new byte[] { 51, 48, 54 }).given(j, 1).checkEq(b, 48);
            itest("randoop", 114).given(that.id, new byte[] { 51, 55, 100 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 50, 102, 49 }).given(j, 2).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 49, 48, 97 }).given(j, 0).checkEq(b, 49);
            itest("evosuite", 114).given(that.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).given(j, 5).checkEq(b, 53);
            itest("randoop", 114).given(that.id, new byte[] { 50, 100, 55 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 49, 48, 101 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 49, 51, 53 }).given(j, 1).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 101, 101 }).given(j, 0).checkEq(b, 101);
            itest("evosuite", 114).given(that.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).given(j, 0).checkEq(b, 253);
            itest("randoop", 114).given(that.id, new byte[] { 1, 0, 100, 0, -1 }).given(j, 1).checkEq(b, 0);
            itest("randoop", 114).given(that.id, new byte[] { 49, 55, 57 }).given(j, 0).checkEq(b, 49);
            itest("evosuite", 114).given(that.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).given(j, 6).checkEq(b, 186);
            itest("randoop", 114).given(that.id, new byte[] { 49, 100, 56 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 49, 99, 101 }).given(j, 2).checkEq(b, 101);
            itest("randoop", 114).given(that.id, new byte[] { 49, 51, 53 }).given(j, 2).checkEq(b, 53);
            itest("randoop", 114).given(that.id, new byte[] { 50, 52, 53 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 49, 97, 52 }).given(j, 2).checkEq(b, 52);
            itest("randoop", 114).given(that.id, new byte[] { 101, 99 }).given(j, 0).checkEq(b, 101);
            itest("randoop", 114).given(that.id, new byte[] { 49, 98, 54 }).given(j, 2).checkEq(b, 54);
            itest("randoop", 114).given(that.id, new byte[] { 50, 56, 55 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 50, 53, 99 }).given(j, 2).checkEq(b, 99);
            itest("randoop", 114).given(that.id, new byte[] { 50, 52, 51 }).given(j, 2).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 51, 55, 55 }).given(j, 2).checkEq(b, 55);
            itest("randoop", 114).given(that.id, new byte[] { -17, -85, -74, -51, -111, -75, -126, -23, -51, 87, -52, -34, -87, -30, -105, 76 }).given(j, 0).checkEq(b, 239);
            itest("randoop", 114).given(that.id, new byte[] { 49, 49, 49 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 50, 53, 99 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 49, 54, 102 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 101, 51 }).given(j, 0).checkEq(b, 101);
            itest("randoop", 114).given(that.id, new byte[] { 50, 101, 55 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { -53, -80, 114, 122, 84, -85, 63, 12, -98, 56, 77, -100, 57, -6, -24, 3 }).given(j, 0).checkEq(b, 203);
            itest("randoop", 114).given(that.id, new byte[] { 50, 52, 51 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 51, 49, 48 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 51, 51 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 50, 102, 49 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 51, 48, 55 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 50, 52, 102 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 1, 0, 100, 0, -1 }).given(j, 0).checkEq(b, 1);
            itest("randoop", 114).given(that.id, new byte[] { 49, 97, 52 }).given(j, 1).checkEq(b, 97);
            itest("evosuite", 114).given(that.id, new byte[] { 52 }).given(j, 0).checkEq(b, 52);
            itest("evosuite", 114).given(that.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).given(j, 1).checkEq(b, 0);
            itest("randoop", 114).given(that.id, new byte[] { 49, 100, 55 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 50, 97, 100 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 52, 54 }).given(j, 0).checkEq(b, 52);
            itest("randoop", 114).given(that.id, new byte[] { 53, 57 }).given(j, 0).checkEq(b, 53);
            itest("randoop", 114).given(that.id, new byte[] { 50, 102, 49 }).given(j, 1).checkEq(b, 102);
            itest("randoop", 114).given(that.id, new byte[] { 1, 0, 100, 0, -1 }).given(j, 4).checkEq(b, 255);
            itest("evosuite", 114).given(that.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).given(j, 3).checkEq(b, 0);
            itest("randoop", 114).given(that.id, new byte[] { -3, 17, 110, -27, 87, 119, -87, 120, 46, -54, 65, -64, 105, 82, 15, -1 }).given(j, 0).checkEq(b, 253);
            itest("randoop", 114).given(that.id, new byte[] { 99, 98 }).given(j, 0).checkEq(b, 99);
            itest("randoop", 114).given(that.id, new byte[] { 49, 98, 54 }).given(j, 1).checkEq(b, 98);
            itest("randoop", 114).given(that.id, new byte[] { 49, 97, 52 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 100, 97 }).given(j, 0).checkEq(b, 100);
            itest("evosuite", 114).given(that.id, new byte[] { 48 }).given(j, 0).checkEq(b, 48);
            itest("randoop", 114).given(that.id, new byte[] { 52, 54 }).given(j, 1).checkEq(b, 54);
            itest("randoop", 114).given(that.id, new byte[] { 12, -77, 114, -41, -6, 110, -35, 120, -88, 83, 31, 82, 17, 61, 24, -120 }).given(j, 0).checkEq(b, 12);
            itest("randoop", 114).given(that.id, new byte[] { 49, 56, 48 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 26, -49, 30, 28, -3, 84, -49, 30, -99, -28, -7, 106, -13, 100, -109, 86 }).given(j, 0).checkEq(b, 26);
            itest("randoop", 114).given(that.id, new byte[] { 34, 77, -55, 13, -2, -13, 31, -54, 70, 72, -66, -46, 75, -79, -73, 42 }).given(j, 0).checkEq(b, 34);
            itest("randoop", 114).given(that.id, new byte[] { 50, 100, 101 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 50, 49, 51 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 50, 52, 51 }).given(j, 1).checkEq(b, 52);
            itest("randoop", 114).given(that.id, new byte[] { 51, 48, 54 }).given(j, 2).checkEq(b, 54);
            itest("randoop", 114).given(that.id, new byte[] { 51, 48, 54 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 52, 50 }).given(j, 0).checkEq(b, 52);
            itest("randoop", 114).given(that.id, new byte[] { 50, 48, 98 }).given(j, 0).checkEq(b, 50);
            itest("evosuite", 114).given(that.id, new byte[] { -3, 0, 31, 0, -1, 53, -70, 0 }).given(j, 7).checkEq(b, 0);
            itest("randoop", 114).given(that.id, new byte[] { 51, 55, 55 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 49, 99, 102 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 49, 98, 57 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 52, 102 }).given(j, 0).checkEq(b, 52);
            itest("randoop", 114).given(that.id, new byte[] { 51, 102 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 50, 55, 53 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 101, 101 }).given(j, 1).checkEq(b, 101);
            itest("randoop", 114).given(that.id, new byte[] { 49, 55, 57 }).given(j, 1).checkEq(b, 55);
            itest("randoop", 114).given(that.id, new byte[] { 52, 102 }).given(j, 1).checkEq(b, 102);
            itest("randoop", 114).given(that.id, new byte[] { 51, 49, 52 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 1, 0, 100, 0, -1 }).given(j, 3).checkEq(b, 0);
            itest("randoop", 114).given(that.id, new byte[] { 50, 99, 50 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 49, 99, 101 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 49, 51, 53 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 10, 10, 10 }).given(j, 0).checkEq(b, 10);
            itest("randoop", 114).given(that.id, new byte[] { 52, 50 }).given(j, 1).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 50, 52, 56 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 51, 53, 52 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 49, 57, 48 }).given(j, 0).checkEq(b, 49);
            itest("randoop", 114).given(that.id, new byte[] { 102, 55 }).given(j, 0).checkEq(b, 102);
            itest("randoop", 114).given(that.id, new byte[] { 51, 48, 48 }).given(j, 0).checkEq(b, 51);
            itest("randoop", 114).given(that.id, new byte[] { 50, 57, 52 }).given(j, 0).checkEq(b, 50);
            itest("randoop", 114).given(that.id, new byte[] { 1, 0, 100, 0, -1 }).given(j, 2).checkEq(b, 100);
            if (a != b) {
                return a - b;
            }
        }
        return this.id.length - that.id.length;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(id);
    }
}
