package biz.paluch.logging.gelf.intern;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Unit", 133).given(s, 712).checkEq(buf[offset], -56);
        new Here("Randoop", 133).given(s, 109).checkEq(buf[offset], 109);
        new Here("Randoop", 133).given(s, 128).checkEq(buf[offset], -128);
        new Here("Randoop", 133).given(s, 44350).checkEq(buf[offset], 62);
        new Here("Randoop", 133).given(s, 99).checkEq(buf[offset], 99);
        new Here("Randoop", 133).given(s, 20724).checkEq(buf[offset], -12);
        new Here("Randoop", 133).given(s, 36663).checkEq(buf[offset], 55);
        new Here("Unit", 133).given(s, 23148).checkEq(buf[offset], 108);
        new Here("Randoop", 133).given(s, 168).checkEq(buf[offset], -88);
        new Here("Randoop", 133).given(s, 52229).checkEq(buf[offset], 5);
        new Here("Unit", 133).given(s, 0).checkEq(buf[offset], 0);
        new Here("Randoop", 133).given(s, 0).checkEq(buf[offset], 0);
        new Here("Randoop", 133).given(s, 58440).checkEq(buf[offset], 72);
        new Here("Randoop", 133).given(s, 50).checkEq(buf[offset], 50);
        new Here("Randoop", 133).given(s, 59668).checkEq(buf[offset], 20);
        new Here("Randoop", 133).given(s, 41836).checkEq(buf[offset], 108);
        new Here("Randoop", 133).given(s, 46376).checkEq(buf[offset], 40);
        new Here("Randoop", 133).given(s, 2134).checkEq(buf[offset], 86);
        new Here("Randoop", 133).given(s, 31047).checkEq(buf[offset], 71);
        new Here("Randoop", 133).given(s, 60233).checkEq(buf[offset], 73);
        new Here("Randoop", 133).given(s, 154).checkEq(buf[offset], -102);
        new Here("Randoop", 133).given(s, 9027).checkEq(buf[offset], 67);
        new Here("Unit", 133).given(s, 33150).checkEq(buf[offset], 126);
        new Here("Randoop", 133).given(s, 28).checkEq(buf[offset], 28);
        new Here("Randoop", 133).given(s, 5202).checkEq(buf[offset], 82);
        new Here("Randoop", 133).given(s, 67).checkEq(buf[offset], 67);
        new Here("Randoop", 133).given(s, 10598).checkEq(buf[offset], 102);
        new Here("Randoop", 133).given(s, 43537).checkEq(buf[offset], 17);
        new Here("Randoop", 133).given(s, 38090).checkEq(buf[offset], -54);
        buf[offset + 1] = (byte) ((s >> 8) & 0xff);
        new Here("Randoop", 134).given(s, 99).checkEq(buf[offset + 1], 0);
        new Here("Randoop", 134).given(s, 38090).checkEq(buf[offset + 1], -108);
        new Here("Randoop", 134).given(s, 60233).checkEq(buf[offset + 1], -21);
        new Here("Unit", 134).given(s, 33150).checkEq(buf[offset + 1], -127);
        new Here("Randoop", 134).given(s, 52229).checkEq(buf[offset + 1], -52);
        new Here("Randoop", 134).given(s, 9027).checkEq(buf[offset + 1], 35);
        new Here("Unit", 134).given(s, 0).checkEq(buf[offset + 1], 0);
        new Here("Randoop", 134).given(s, 50).checkEq(buf[offset + 1], 0);
        new Here("Unit", 134).given(s, 712).checkEq(buf[offset + 1], 2);
        new Here("Randoop", 134).given(s, 41836).checkEq(buf[offset + 1], -93);
        new Here("Randoop", 134).given(s, 0).checkEq(buf[offset + 1], 0);
        new Here("Randoop", 134).given(s, 109).checkEq(buf[offset + 1], 0);
        new Here("Randoop", 134).given(s, 128).checkEq(buf[offset + 1], 0);
        new Here("Randoop", 134).given(s, 28).checkEq(buf[offset + 1], 0);
        new Here("Randoop", 134).given(s, 154).checkEq(buf[offset + 1], 0);
        new Here("Randoop", 134).given(s, 20724).checkEq(buf[offset + 1], 80);
        new Here("Randoop", 134).given(s, 58440).checkEq(buf[offset + 1], -28);
        new Here("Randoop", 134).given(s, 46376).checkEq(buf[offset + 1], -75);
        new Here("Randoop", 134).given(s, 31047).checkEq(buf[offset + 1], 121);
        new Here("Randoop", 134).given(s, 10598).checkEq(buf[offset + 1], 41);
        new Here("Randoop", 134).given(s, 67).checkEq(buf[offset + 1], 0);
        new Here("Randoop", 134).given(s, 2134).checkEq(buf[offset + 1], 8);
        new Here("Randoop", 134).given(s, 44350).checkEq(buf[offset + 1], -83);
        new Here("Randoop", 134).given(s, 5202).checkEq(buf[offset + 1], 20);
        new Here("Randoop", 134).given(s, 168).checkEq(buf[offset + 1], 0);
        new Here("Unit", 134).given(s, 23148).checkEq(buf[offset + 1], 90);
        new Here("Randoop", 134).given(s, 43537).checkEq(buf[offset + 1], -86);
        new Here("Randoop", 134).given(s, 36663).checkEq(buf[offset + 1], -113);
        new Here("Randoop", 134).given(s, 59668).checkEq(buf[offset + 1], -23);
    }

    public void reset() {
        crc.reset();
        def.reset();
    }
}
