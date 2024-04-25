package biz.paluch.logging.gelf.intern;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * This class implements a stream filter for writing compressed data in the GZIP file format. It's an adoption of
 * {@link java.util.zip.GZIPOutputStream} but with a notable difference regarding re-usability:
 * <ul>
 * <li>Expose {@link #reset()} to reset CRC32 and the deflater</li>
 * <li>Don't write the GZIP header upon construction but expose {@link #writeHeader()}</li>
 * </ul>
 *
 * @author Mark Paluch
 * @since 1.11
 */
class ReusableGzipOutputStream extends DeflaterOutputStream {

    /**
     * CRC-32 of uncompressed data.
     */
    private final CRC32 crc = new CRC32();

    /*
     * GZIP header magic number.
     */
    private static final int GZIP_MAGIC = 0x8b1f;

    /*
     * Trailer size in bytes.
     *
     */
    private static final int TRAILER_SIZE = 8;

    /**
     * Creates a new output stream with the specified buffer size and flush mode.
     *
     * @param out the output stream
     * @exception IOException If an I/O error has occurred.
     * @exception IllegalArgumentException if {@code size <= 0}
     *
     * @since 1.7
     */
    public ReusableGzipOutputStream(OutputStream out) throws IOException {
        super(out, new Deflater(Deflater.DEFAULT_COMPRESSION, true));
        crc.reset();
    }

    /**
     * Writes array of bytes to the compressed output stream. This method will block until all the bytes are written.
     *
     * @param buf the data to be written
     * @param off the start offset of the data
     * @param len the length of the data
     * @exception IOException If an I/O error has occurred.
     */
    @Override
    public synchronized void write(byte[] buf, int off, int len) throws IOException {
        super.write(buf, off, len);
        crc.update(buf, off, len);
    }

    /**
     * Finishes writing compressed data to the output stream without closing the underlying stream. Use this method when
     * applying multiple filters in succession to the same output stream.
     *
     * @exception IOException if an I/O error has occurred
     */
    @Override
    public void finish() throws IOException {
        if (!def.finished()) {
            def.finish();
            while (!def.finished()) {
                int len = def.deflate(buf, 0, buf.length);
                if (def.finished() && len <= buf.length - TRAILER_SIZE) {
                    // last deflater buffer. Fit trailer at the end
                    writeTrailer(buf, len);
                    len = len + TRAILER_SIZE;
                    out.write(buf, 0, len);
                    return;
                }
                if (len > 0) {
                    out.write(buf, 0, len);
                }
            }
            // if we can't fit the trailer at the end of the last
            // deflater buffer, we write it separately
            byte[] trailer = new byte[TRAILER_SIZE];
            writeTrailer(trailer, 0);
            out.write(trailer);
        }
    }

    /*
     * Writes GZIP member header.
     */
    public void writeHeader() throws IOException {
        out.write(new byte[] { // Magic number (short)
        (byte) GZIP_MAGIC, // Magic number (short)
        (byte) (GZIP_MAGIC >> 8), // Compression method (CM)
        Deflater.DEFLATED, // Flags (FLG)
        0, // Modification time MTIME (int)
        0, // Modification time MTIME (int)
        0, // Modification time MTIME (int)
        0, // Modification time MTIME (int)
        0, // Extra flags (XFLG)
        0, // Operating system (OS)
        0 });
    }

    /*
     * Writes GZIP member trailer to a byte array, starting at a given offset.
     */
    private void writeTrailer(byte[] buf, int offset) {
        // CRC-32 of uncompr. data
        writeInt((int) crc.getValue(), buf, offset);
        // Number of uncompr. bytes
        writeInt(def.getTotalIn(), buf, offset + 4);
    }

    /*
     * Writes integer in Intel byte order to a byte array, starting at a given offset.
     */
    private void writeInt(int i, byte[] buf, int offset) {
        writeShort(i & 0xffff, buf, offset);
        writeShort((i >> 16) & 0xffff, buf, offset + 2);
    }

    /*
     * Writes short integer in Intel byte order to a byte array, starting at a given offset
     */
    private void writeShort(int s, byte[] buf, int offset) {
        buf[offset] = (byte) (s & 0xff);
        itest("randoop", 133).given(s, 47).checkEq(buf[offset], 47);
        itest("randoop", 133).given(s, 222).checkEq(buf[offset], -34);
        itest("randoop", 133).given(s, 0).checkEq(buf[offset], 0);
        itest("randoop", 133).given(s, 200).checkEq(buf[offset], -56);
        itest("randoop", 133).given(s, 60233).checkEq(buf[offset], 73);
        itest("randoop", 133).given(s, 45510).checkEq(buf[offset], -58);
        itest("randoop", 133).given(s, 58317).checkEq(buf[offset], -51);
        itest("dev", 133).given(s, 14786).checkEq(buf[offset], -62);
        itest("randoop", 133).given(s, 62276).checkEq(buf[offset], 68);
        itest("randoop", 133).given(s, 54550).checkEq(buf[offset], 22);
        itest("dev", 133).given(s, 0).checkEq(buf[offset], 0);
        itest("randoop", 133).given(s, 18196).checkEq(buf[offset], 20);
        itest("randoop", 133).given(s, 231).checkEq(buf[offset], -25);
        itest("randoop", 133).given(s, 26016).checkEq(buf[offset], -96);
        itest("randoop", 133).given(s, 48).checkEq(buf[offset], 48);
        itest("randoop", 133).given(s, 29575).checkEq(buf[offset], -121);
        itest("dev", 133).given(s, 664).checkEq(buf[offset], -104);
        itest("randoop", 133).given(s, 26193).checkEq(buf[offset], 81);
        itest("randoop", 133).given(s, 33157).checkEq(buf[offset], -123);
        itest("randoop", 133).given(s, 150).checkEq(buf[offset], -106);
        itest("randoop", 133).given(s, 49660).checkEq(buf[offset], -4);
        itest("randoop", 133).given(s, 36042).checkEq(buf[offset], -54);
        itest("randoop", 133).given(s, 78).checkEq(buf[offset], 78);
        itest("randoop", 133).given(s, 133).checkEq(buf[offset], -123);
        itest("randoop", 133).given(s, 38306).checkEq(buf[offset], -94);
        itest("dev", 133).given(s, 47318).checkEq(buf[offset], -42);
        itest("randoop", 133).given(s, 58).checkEq(buf[offset], 58);
        itest("randoop", 133).given(s, 55745).checkEq(buf[offset], -63);
        itest("randoop", 133).given(s, 35549).checkEq(buf[offset], -35);
        itest("randoop", 133).given(s, 7667).checkEq(buf[offset], -13);
        itest("randoop", 133).given(s, 59413).checkEq(buf[offset], 21);
        itest("randoop", 133).given(s, 2058).checkEq(buf[offset], 10);
        itest("randoop", 133).given(s, 31047).checkEq(buf[offset], 71);
        itest("randoop", 133).given(s, 12857).checkEq(buf[offset], 57);
        itest("randoop", 133).given(s, 32772).checkEq(buf[offset], 4);
        itest("randoop", 133).given(s, 62594).checkEq(buf[offset], -126);
        itest("randoop", 133).given(s, 32065).checkEq(buf[offset], 65);
        itest("randoop", 133).given(s, 57994).checkEq(buf[offset], -118);
        itest("randoop", 133).given(s, 349).checkEq(buf[offset], 93);
        itest("randoop", 133).given(s, 54).checkEq(buf[offset], 54);
        itest("randoop", 133).given(s, 44786).checkEq(buf[offset], -14);
        itest("randoop", 133).given(s, 22175).checkEq(buf[offset], -97);
        itest("randoop", 133).given(s, 28).checkEq(buf[offset], 28);
        itest("randoop", 133).given(s, 63).checkEq(buf[offset], 63);
        buf[offset + 1] = (byte) ((s >> 8) & 0xff);
        itest("randoop", 134).given(s, 28).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 26016).checkEq(buf[offset + 1], 101);
        itest("randoop", 134).given(s, 7667).checkEq(buf[offset + 1], 29);
        itest("randoop", 134).given(s, 59413).checkEq(buf[offset + 1], -24);
        itest("randoop", 134).given(s, 58).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 36042).checkEq(buf[offset + 1], -116);
        itest("randoop", 134).given(s, 349).checkEq(buf[offset + 1], 1);
        itest("randoop", 134).given(s, 222).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 44786).checkEq(buf[offset + 1], -82);
        itest("randoop", 134).given(s, 54550).checkEq(buf[offset + 1], -43);
        itest("randoop", 134).given(s, 133).checkEq(buf[offset + 1], 0);
        itest("dev", 134).given(s, 664).checkEq(buf[offset + 1], 2);
        itest("randoop", 134).given(s, 63).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 57994).checkEq(buf[offset + 1], -30);
        itest("randoop", 134).given(s, 45510).checkEq(buf[offset + 1], -79);
        itest("randoop", 134).given(s, 35549).checkEq(buf[offset + 1], -118);
        itest("randoop", 134).given(s, 31047).checkEq(buf[offset + 1], 121);
        itest("randoop", 134).given(s, 26193).checkEq(buf[offset + 1], 102);
        itest("randoop", 134).given(s, 22175).checkEq(buf[offset + 1], 86);
        itest("randoop", 134).given(s, 60233).checkEq(buf[offset + 1], -21);
        itest("randoop", 134).given(s, 150).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 33157).checkEq(buf[offset + 1], -127);
        itest("randoop", 134).given(s, 200).checkEq(buf[offset + 1], 0);
        itest("dev", 134).given(s, 14786).checkEq(buf[offset + 1], 57);
        itest("randoop", 134).given(s, 55745).checkEq(buf[offset + 1], -39);
        itest("randoop", 134).given(s, 62594).checkEq(buf[offset + 1], -12);
        itest("randoop", 134).given(s, 32772).checkEq(buf[offset + 1], -128);
        itest("randoop", 134).given(s, 231).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 38306).checkEq(buf[offset + 1], -107);
        itest("randoop", 134).given(s, 58317).checkEq(buf[offset + 1], -29);
        itest("randoop", 134).given(s, 49660).checkEq(buf[offset + 1], -63);
        itest("dev", 134).given(s, 0).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 78).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 12857).checkEq(buf[offset + 1], 50);
        itest("randoop", 134).given(s, 29575).checkEq(buf[offset + 1], 115);
        itest("randoop", 134).given(s, 54).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 48).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 62276).checkEq(buf[offset + 1], -13);
        itest("randoop", 134).given(s, 32065).checkEq(buf[offset + 1], 125);
        itest("dev", 134).given(s, 47318).checkEq(buf[offset + 1], -72);
        itest("randoop", 134).given(s, 2058).checkEq(buf[offset + 1], 8);
        itest("randoop", 134).given(s, 47).checkEq(buf[offset + 1], 0);
        itest("randoop", 134).given(s, 18196).checkEq(buf[offset + 1], 71);
        itest("randoop", 134).given(s, 0).checkEq(buf[offset + 1], 0);
    }

    public void reset() {
        crc.reset();
        def.reset();
    }
}
