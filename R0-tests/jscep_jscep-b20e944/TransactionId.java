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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 54, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 101, 100 }).checkEq(a, 100);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 99, 97 }).checkEq(a, 99);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 53, 100 }).checkEq(a, 100);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 56, 55 }).checkEq(a, 56);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 53, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 54, 99 }).checkEq(a, 99);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 100, 101 }).checkEq(a, 100);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 56, 51 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 99, 97 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 48, 99 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 102, 50 }).checkEq(a, 102);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 49, 54 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 102, 100 }).checkEq(a, 100);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 52, 51 }).checkEq(a, 51);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 55, 48 }).checkEq(a, 48);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 52, 56 }).checkEq(a, 52);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 49, 57 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 50, 50 }).checkEq(a, 50);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 55, 55 }).checkEq(a, 55);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 102, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 54, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 51, 100 }).checkEq(a, 51);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 101, 54 }).checkEq(a, 101);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 99, 97 }).checkEq(a, 99);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 102, 100 }).checkEq(a, 102);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 100 }).checkEq(a, 100);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 49, 54 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 56, 100 }).checkEq(a, 56);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 54, 99 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 48, 99 }).checkEq(a, 99);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 102, 50 }).checkEq(a, 50);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 51, 48 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 101 }).checkEq(a, 101);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 97, 55 }).checkEq(a, 97);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 98, 53 }).checkEq(a, 53);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 51, 56 }).checkEq(a, 56);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 54, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 97 }).checkEq(a, 50);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 101, 54 }).checkEq(a, 54);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 51, 56 }).checkEq(a, 51);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 101, 97 }).checkEq(a, 97);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 57, 54 }).checkEq(a, 57);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 49, 57 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 98, 53 }).checkEq(a, 98);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 56, 55 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 101, 100 }).checkEq(a, 101);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 51, 100 }).checkEq(a, 100);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 57, 54 }).checkEq(a, 54);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 97, 101 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 53, 49 }).checkEq(a, 53);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 97, 101 }).checkEq(a, 97);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 51, 101 }).checkEq(a, 101);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 51, 48 }).checkEq(a, 51);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 99, 49 }).checkEq(a, 99);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 52, 51 }).checkEq(a, 52);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 53, 51 }).checkEq(a, 51);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 51, 101 }).checkEq(a, 51);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 54, 49 }).checkEq(a, 54);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 101, 97 }).checkEq(a, 101);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 100, 52 }).checkEq(a, 100);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 98, 99 }).checkEq(a, 99);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 53, 51 }).checkEq(a, 53);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 56, 51 }).checkEq(a, 51);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 50, 50 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 98, 99 }).checkEq(a, 98);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 51, 101 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 54, 49 }).checkEq(a, 54);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 53, 100 }).checkEq(a, 53);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 98, 49 }).checkEq(a, 98);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 50, 101 }).checkEq(a, 101);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 53, 51 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 56, 100 }).checkEq(a, 100);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 97, 55 }).checkEq(a, 55);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 101, 97 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 101, 54 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 50, 97 }).checkEq(a, 97);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 55, 55 }).checkEq(a, 55);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 100, 101 }).checkEq(a, 101);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 97, 49 }).checkEq(a, 97);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 52, 56 }).checkEq(a, 56);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 102, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 55, 48 }).checkEq(a, 55);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 102, 49 }).checkEq(a, 102);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 50, 50 }).checkEq(a, 50);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 56, 51 }).checkEq(a, 56);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 99, 97 }).checkEq(a, 97);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 56, 55 }).checkEq(a, 55);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 99, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 49, 57 }).checkEq(a, 57);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 51, 48 }).checkEq(a, 48);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 54, 99 }).checkEq(a, 54);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 100, 52 }).checkEq(a, 52);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 50, 101 }).checkEq(a, 50);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 97, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 99, 97 }).checkEq(a, 97);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 98, 49 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 49, 54 }).checkEq(a, 54);
            new Here("Randoop", 113).given(i, 0).given(this.id, new byte[] { 49, 101 }).checkEq(a, 49);
            new Here("Randoop", 113).given(i, 1).given(this.id, new byte[] { 49, 48, 99 }).checkEq(a, 48);
            new Here("Randoop", 113).given(i, 2).given(this.id, new byte[] { 49, 97, 101 }).checkEq(a, 101);
            int b = (that.id[j] & 0xff);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 51, 49 }).given(j, 2).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 98, 54 }).given(j, 0).checkEq(b, 98);
            new Here("Randoop", 114).given(that.id, new byte[] { 53, 101 }).given(j, 1).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 102, 51 }).given(j, 1).checkEq(b, 51);
            new Here("Randoop", 114).given(that.id, new byte[] { 97, 50 }).given(j, 1).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 52, 52 }).given(j, 1).checkEq(b, 52);
            new Here("Randoop", 114).given(that.id, new byte[] { 101, 101 }).given(j, 0).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 53, 52 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 54, 100 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 99, 98 }).given(j, 1).checkEq(b, 98);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 101, 55 }).given(j, 2).checkEq(b, 55);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 101, 55 }).given(j, 1).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 51, 57 }).given(j, 1).checkEq(b, 57);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 54, 50 }).given(j, 2).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 98, 50 }).given(j, 1).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 100, 102 }).given(j, 1).checkEq(b, 102);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 49, 55 }).given(j, 2).checkEq(b, 55);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 56, 52 }).given(j, 2).checkEq(b, 52);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 101, 98 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 50, 51 }).given(j, 1).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 54, 100 }).given(j, 2).checkEq(b, 100);
            new Here("Randoop", 114).given(that.id, new byte[] { 56, 101 }).given(j, 1).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 100, 102 }).given(j, 0).checkEq(b, 100);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 102, 50 }).given(j, 2).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 48, 100 }).given(j, 2).checkEq(b, 100);
            new Here("Randoop", 114).given(that.id, new byte[] { 99, 98 }).given(j, 0).checkEq(b, 99);
            new Here("Randoop", 114).given(that.id, new byte[] { 97, 56 }).given(j, 0).checkEq(b, 97);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 48, 100 }).given(j, 1).checkEq(b, 48);
            new Here("Randoop", 114).given(that.id, new byte[] { 53, 50 }).given(j, 0).checkEq(b, 53);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 56, 56 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 50, 51 }).given(j, 2).checkEq(b, 51);
            new Here("Randoop", 114).given(that.id, new byte[] { 98, 50 }).given(j, 0).checkEq(b, 98);
            new Here("Randoop", 114).given(that.id, new byte[] { 50, 102 }).given(j, 1).checkEq(b, 102);
            new Here("Randoop", 114).given(that.id, new byte[] { 51, 101 }).given(j, 1).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 55, 56 }).given(j, 1).checkEq(b, 56);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 101, 55 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 50, 102 }).given(j, 0).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 49, 55 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 97, 50 }).given(j, 0).checkEq(b, 97);
            new Here("Randoop", 114).given(that.id, new byte[] { 55, 56 }).given(j, 0).checkEq(b, 55);
            new Here("Randoop", 114).given(that.id, new byte[] { 54, 50 }).given(j, 0).checkEq(b, 54);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 101, 98 }).given(j, 2).checkEq(b, 98);
            new Here("Randoop", 114).given(that.id, new byte[] { 53, 50 }).given(j, 1).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 99, 50 }).given(j, 0).checkEq(b, 99);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 51, 102 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 100, 53 }).given(j, 1).checkEq(b, 53);
            new Here("Randoop", 114).given(that.id, new byte[] { 99, 50 }).given(j, 1).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 102, 51 }).given(j, 0).checkEq(b, 102);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 102 }).given(j, 1).checkEq(b, 102);
            new Here("Randoop", 114).given(that.id, new byte[] { 101 }).given(j, 0).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 102, 50 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 56, 101 }).given(j, 0).checkEq(b, 56);
            new Here("Randoop", 114).given(that.id, new byte[] { 55, 49 }).given(j, 0).checkEq(b, 55);
            new Here("Randoop", 114).given(that.id, new byte[] { 51, 101 }).given(j, 0).checkEq(b, 51);
            new Here("Randoop", 114).given(that.id, new byte[] { 54, 50 }).given(j, 1).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 53, 101 }).given(j, 0).checkEq(b, 53);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 56, 56 }).given(j, 1).checkEq(b, 56);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 51, 102 }).given(j, 2).checkEq(b, 102);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 49, 98 }).given(j, 1).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 56, 52 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 97, 102 }).given(j, 2).checkEq(b, 102);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 102, 50 }).given(j, 1).checkEq(b, 102);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 50, 51 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 98, 100 }).given(j, 0).checkEq(b, 98);
            new Here("Randoop", 114).given(that.id, new byte[] { 97, 56 }).given(j, 1).checkEq(b, 56);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 53, 52 }).given(j, 2).checkEq(b, 52);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 99, 98 }).given(j, 1).checkEq(b, 99);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 51, 49 }).given(j, 1).checkEq(b, 51);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 54, 50 }).given(j, 1).checkEq(b, 54);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 101, 98 }).given(j, 1).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 98, 100 }).given(j, 1).checkEq(b, 100);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 53, 52 }).given(j, 1).checkEq(b, 53);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 97, 102 }).given(j, 1).checkEq(b, 97);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 99, 98 }).given(j, 2).checkEq(b, 98);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 49, 98 }).given(j, 2).checkEq(b, 98);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 56, 52 }).given(j, 1).checkEq(b, 56);
            new Here("Randoop", 114).given(that.id, new byte[] { 52, 52 }).given(j, 0).checkEq(b, 52);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 48, 100 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 55, 49 }).given(j, 1).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 97, 102 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 56, 56 }).given(j, 2).checkEq(b, 56);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 51, 102 }).given(j, 1).checkEq(b, 51);
            new Here("Randoop", 114).given(that.id, new byte[] { 100, 53 }).given(j, 0).checkEq(b, 100);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 102 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 51, 49 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 102, 101 }).given(j, 1).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 102, 101 }).given(j, 0).checkEq(b, 102);
            new Here("Randoop", 114).given(that.id, new byte[] { 98, 54 }).given(j, 1).checkEq(b, 54);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 54, 50 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 57, 55 }).given(j, 0).checkEq(b, 57);
            new Here("Randoop", 114).given(that.id, new byte[] { 52, 57 }).given(j, 0).checkEq(b, 52);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 49, 55 }).given(j, 1).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 50, 98 }).given(j, 0).checkEq(b, 50);
            new Here("Randoop", 114).given(that.id, new byte[] { 50, 98 }).given(j, 1).checkEq(b, 98);
            new Here("Randoop", 114).given(that.id, new byte[] { 57, 55 }).given(j, 1).checkEq(b, 55);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 54, 100 }).given(j, 1).checkEq(b, 54);
            new Here("Randoop", 114).given(that.id, new byte[] { 101, 101 }).given(j, 1).checkEq(b, 101);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 99, 98 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 52, 57 }).given(j, 1).checkEq(b, 57);
            new Here("Randoop", 114).given(that.id, new byte[] { 49, 49, 98 }).given(j, 0).checkEq(b, 49);
            new Here("Randoop", 114).given(that.id, new byte[] { 51, 57 }).given(j, 0).checkEq(b, 51);
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
