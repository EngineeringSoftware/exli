package com.mpatric.mp3agic;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.EnumSet;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Mp3File extends FileWrapper {

    private static final int DEFAULT_BUFFER_LENGTH = 65536;

    private static final int MINIMUM_BUFFER_LENGTH = 40;

    private static final int XING_MARKER_OFFSET_1 = 13;

    private static final int XING_MARKER_OFFSET_2 = 21;

    private static final int XING_MARKER_OFFSET_3 = 36;

    protected int bufferLength;

    private int xingOffset = -1;

    private int startOffset = -1;

    private int endOffset = -1;

    private int frameCount = 0;

    private Map<Integer, MutableInteger> bitrates = new HashMap<>();

    private int xingBitrate;

    private double bitrate = 0;

    private String channelMode;

    private String emphasis;

    private String layer;

    private String modeExtension;

    private int sampleRate;

    private boolean copyright;

    private boolean original;

    private String version;

    private ID3v1 id3v1Tag;

    private ID3v2 id3v2Tag;

    private byte[] customTag;

    private boolean scanFile;

    protected Mp3File() {
    }

    public Mp3File(String filename) throws IOException, UnsupportedTagException, InvalidDataException {
        this(filename, DEFAULT_BUFFER_LENGTH, true);
    }

    public Mp3File(String filename, int bufferLength) throws IOException, UnsupportedTagException, InvalidDataException {
        this(filename, bufferLength, true);
    }

    public Mp3File(String filename, boolean scanFile) throws IOException, UnsupportedTagException, InvalidDataException {
        this(filename, DEFAULT_BUFFER_LENGTH, scanFile);
    }

    public Mp3File(String filename, int bufferLength, boolean scanFile) throws IOException, UnsupportedTagException, InvalidDataException {
        super(filename);
        init(bufferLength, scanFile);
    }

    public Mp3File(File file) throws IOException, UnsupportedTagException, InvalidDataException {
        this(file, DEFAULT_BUFFER_LENGTH, true);
    }

    public Mp3File(File file, int bufferLength) throws IOException, UnsupportedTagException, InvalidDataException {
        this(file, bufferLength, true);
    }

    public Mp3File(File file, int bufferLength, boolean scanFile) throws IOException, UnsupportedTagException, InvalidDataException {
        super(file);
        init(bufferLength, scanFile);
    }

    public Mp3File(Path path) throws IOException, UnsupportedTagException, InvalidDataException {
        this(path, DEFAULT_BUFFER_LENGTH, true);
    }

    public Mp3File(Path path, int bufferLength) throws IOException, UnsupportedTagException, InvalidDataException {
        this(path, bufferLength, true);
    }

    public Mp3File(Path path, int bufferLength, boolean scanFile) throws IOException, UnsupportedTagException, InvalidDataException {
        super(path);
        init(bufferLength, scanFile);
    }

    private void init(int bufferLength, boolean scanFile) throws IOException, UnsupportedTagException, InvalidDataException {
        if (bufferLength < MINIMUM_BUFFER_LENGTH + 1) {
            throw new IllegalArgumentException("Buffer too small");
        }
        this.bufferLength = bufferLength;
        this.scanFile = scanFile;
        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            initId3v1Tag(seekableByteChannel);
            scanFile(seekableByteChannel);
            if (startOffset < 0) {
                throw new InvalidDataException("No mpegs frames found");
            }
            initId3v2Tag(seekableByteChannel);
            if (scanFile) {
                initCustomTag(seekableByteChannel);
            }
        }
    }

    protected int preScanFile(SeekableByteChannel seekableByteChannel) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(AbstractID3v2Tag.HEADER_LENGTH);
        try {
            seekableByteChannel.position(0);
            byteBuffer.clear();
            int bytesRead = seekableByteChannel.read(byteBuffer);
            if (bytesRead == AbstractID3v2Tag.HEADER_LENGTH) {
                try {
                    byte[] bytes = byteBuffer.array();
                    ID3v2TagFactory.sanityCheckTag(bytes);
                    return AbstractID3v2Tag.HEADER_LENGTH + BufferTools.unpackSynchsafeInteger(bytes[AbstractID3v2Tag.DATA_LENGTH_OFFSET], bytes[AbstractID3v2Tag.DATA_LENGTH_OFFSET + 1], bytes[AbstractID3v2Tag.DATA_LENGTH_OFFSET + 2], bytes[AbstractID3v2Tag.DATA_LENGTH_OFFSET + 3]);
                } catch (NoSuchTagException | UnsupportedTagException e) {
                    // do nothing
                }
            }
        } catch (IOException e) {
            // do nothing
        }
        return 0;
    }

    private void scanFile(SeekableByteChannel seekableByteChannel) throws IOException, InvalidDataException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(bufferLength);
        int fileOffset = preScanFile(seekableByteChannel);
        seekableByteChannel.position(fileOffset);
        boolean lastBlock = false;
        int lastOffset = fileOffset;
        while (!lastBlock) {
            byteBuffer.clear();
            int bytesRead = seekableByteChannel.read(byteBuffer);
            byte[] bytes = byteBuffer.array();
            if (bytesRead < bufferLength) {
                lastBlock = true;
            }
            if (bytesRead >= MINIMUM_BUFFER_LENGTH) {
                while (true) {
                    try {
                        int offset = 0;
                        if (startOffset < 0) {
                            offset = scanBlockForStart(bytes, bytesRead, fileOffset, offset);
                            if (startOffset >= 0 && !scanFile) {
                                return;
                            }
                            lastOffset = startOffset;
                        }
                        offset = scanBlock(bytes, bytesRead, fileOffset, offset);
                        fileOffset += offset;
                        seekableByteChannel.position(fileOffset);
                        break;
                    } catch (InvalidDataException e) {
                        if (frameCount < 2) {
                            startOffset = -1;
                            xingOffset = -1;
                            frameCount = 0;
                            bitrates.clear();
                            lastBlock = false;
                            fileOffset = lastOffset + 1;
                            if (fileOffset == 0) {
                                throw new InvalidDataException("Valid start of mpeg frames not found", e);
                            }
                            seekableByteChannel.position(fileOffset);
                            break;
                        }
                        return;
                    }
                }
            }
        }
    }

    private int scanBlockForStart(byte[] bytes, int bytesRead, int absoluteOffset, int offset) {
        while (offset < bytesRead - MINIMUM_BUFFER_LENGTH) {
            if (bytes[offset] == (byte) 0xFF && (bytes[offset + 1] & (byte) 0xE0) == (byte) 0xE0) {
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51, -1, -1, 51, -52, -1 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -5, 16, 100, 0, 15, -16, 0, 0, 105, 0, 0, 0, 8, 0, 0, 13, 32, 0, 0, 1, 0, 0, 1, -92, 0, 0, 0, 32, 0, 0, 52, -128, 0, 0, 4, 3, -127, 64, 3, -1, -1, -14, -93, -116, 63, -1, -5, 19, 31, 31, 64, 3, -113, -1, -1, -2, 62, -41, -62, -22, 31, -5 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51, -1, -1, 51 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -5, -112, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 88, 105, 110, 103, 0, 0, 0, 15, 0, 0, 28, 121, 0, 81, -18, -20, 0, 2, 4, 6, 9, 11, 13, 15, 18, 20, 22 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51, -1, -1, 51, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1 }).checkTrue(group());
                itest("dev", 175).given(offset, 0).given(bytes, new byte[] { -1, -5, -64, 68, 0, 0, 4, 88, -125, 78, 110, 110, -128, 2, -88, -79, 74, 45, -51, 80, 0, 21, -28, -39, 73, -71, -18, -128, 2, -70, 43, 42, 119, 61, 96, 0, 0, 0, 0, 0, 0 }).checkTrue(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51, -1, -1, 51, -52, -1, 51, -103, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51, -1, -1, 51, -52, -1, 51 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 72, 68, 82, 0, 0, 0, -56, 0, 0, 0, -56, 8, 3, 0, 0, 0, -102, -122, 94, -84, 0, 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102, 102, -1, 102, 51, -1, 102, 0, -1, 51, -1, -1, 51, -52, -1, 51, -103 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 0, 0, 4, 103, 65, 77, 65, 0, 0, -100, 64, 32, 13, -28, -53, 0, 0, 3, 0, 80, 76, 84, 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { 69, -1, -1, -1, -1, -1, -52, -1, -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102, -1, -103, 51, -1, -103, 0, -1, 102, -1, -1, 102, -52, -1, 102, -103, -1, 102 }).checkFalse(group());
                itest("evosuite", 175).given(offset, 0).given(bytes, new byte[] { -1, -103, -1, -1, 102, -1, -1, 51, -1, -1, 0, -1, -52, -1, -1, -52, -52, -1, -52, -103, -1, -52, 102, -1, -52, 51, -1, -52, 0, -1, -103, -1, -1, -103, -52, -1, -103, -103, -1, -103, 102 }).checkFalse(group());
                itest("dev", 175).given(offset, 0).given(bytes, new byte[] { -1, -5, -112, 68, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 88, 105, 110, 103, 0 }).checkTrue(group());
                try {
                    MpegFrame frame = new MpegFrame(bytes[offset], bytes[offset + 1], bytes[offset + 2], bytes[offset + 3]);
                    if (xingOffset < 0 && isXingFrame(bytes, offset)) {
                        xingOffset = absoluteOffset + offset;
                        xingBitrate = frame.getBitrate();
                        offset += frame.getLengthInBytes();
                    } else {
                        startOffset = absoluteOffset + offset;
                        channelMode = frame.getChannelMode();
                        emphasis = frame.getEmphasis();
                        layer = frame.getLayer();
                        modeExtension = frame.getModeExtension();
                        sampleRate = frame.getSampleRate();
                        version = frame.getVersion();
                        copyright = frame.isCopyright();
                        original = frame.isOriginal();
                        frameCount++;
                        addBitrate(frame.getBitrate());
                        offset += frame.getLengthInBytes();
                        return offset;
                    }
                } catch (InvalidDataException e) {
                    offset++;
                }
            } else {
                offset++;
            }
        }
        return offset;
    }

    private int scanBlock(byte[] bytes, int bytesRead, int absoluteOffset, int offset) throws InvalidDataException {
        while (offset < bytesRead - MINIMUM_BUFFER_LENGTH) {
            MpegFrame frame = new MpegFrame(bytes[offset], bytes[offset + 1], bytes[offset + 2], bytes[offset + 3]);
            sanityCheckFrame(frame, absoluteOffset + offset);
            int newEndOffset = absoluteOffset + offset + frame.getLengthInBytes() - 1;
            if (newEndOffset < maxEndOffset()) {
                endOffset = absoluteOffset + offset + frame.getLengthInBytes() - 1;
                frameCount++;
                addBitrate(frame.getBitrate());
                offset += frame.getLengthInBytes();
            } else {
                break;
            }
        }
        return offset;
    }

    private int maxEndOffset() {
        int maxEndOffset = (int) getLength();
        if (hasId3v1Tag()) {
            maxEndOffset -= ID3v1Tag.TAG_LENGTH;
        }
        return maxEndOffset;
    }

    private boolean isXingFrame(byte[] bytes, int offset) {
        if (bytes.length >= offset + XING_MARKER_OFFSET_1 + 3) {
            if ("Xing".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bytes, offset + XING_MARKER_OFFSET_1, 4))) {
                return true;
            }
            if ("Info".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bytes, offset + XING_MARKER_OFFSET_1, 4))) {
                return true;
            }
            if (bytes.length >= offset + XING_MARKER_OFFSET_2 + 3) {
                if ("Xing".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bytes, offset + XING_MARKER_OFFSET_2, 4))) {
                    return true;
                }
                if ("Info".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bytes, offset + XING_MARKER_OFFSET_2, 4))) {
                    return true;
                }
                if (bytes.length >= offset + XING_MARKER_OFFSET_3 + 3) {
                    if ("Xing".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bytes, offset + XING_MARKER_OFFSET_3, 4))) {
                        return true;
                    }
                    if ("Info".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bytes, offset + XING_MARKER_OFFSET_3, 4))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void sanityCheckFrame(MpegFrame frame, int offset) throws InvalidDataException {
        if (sampleRate != frame.getSampleRate()) {
            throw new InvalidDataException("Inconsistent frame header");
        }
        if (!layer.equals(frame.getLayer())) {
            throw new InvalidDataException("Inconsistent frame header");
        }
        if (!version.equals(frame.getVersion())) {
            throw new InvalidDataException("Inconsistent frame header");
        }
        if (offset + frame.getLengthInBytes() > getLength()) {
            throw new InvalidDataException("Frame would extend beyond end of file");
        }
    }

    private void addBitrate(final int bitrate) {
        MutableInteger count = bitrates.get(bitrate);
        if (count != null) {
            count.increment();
        } else {
            bitrates.put(bitrate, new MutableInteger(1));
        }
        this.bitrate = ((this.bitrate * (frameCount - 1)) + bitrate) / frameCount;
    }

    private void initId3v1Tag(SeekableByteChannel seekableByteChannel) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(ID3v1Tag.TAG_LENGTH);
        seekableByteChannel.position(getLength() - ID3v1Tag.TAG_LENGTH);
        byteBuffer.clear();
        int bytesRead = seekableByteChannel.read(byteBuffer);
        if (bytesRead < ID3v1Tag.TAG_LENGTH) {
            throw new IOException("Not enough bytes read");
        }
        try {
            id3v1Tag = new ID3v1Tag(byteBuffer.array());
        } catch (NoSuchTagException e) {
            id3v1Tag = null;
        }
    }

    private void initId3v2Tag(SeekableByteChannel seekableByteChannel) throws IOException, UnsupportedTagException, InvalidDataException {
        if (xingOffset == 0 || startOffset == 0) {
            id3v2Tag = null;
        } else {
            int bufferLength;
            if (hasXingFrame()) {
                bufferLength = xingOffset;
            } else
                bufferLength = startOffset;
            ByteBuffer byteBuffer = ByteBuffer.allocate(bufferLength);
            seekableByteChannel.position(0);
            byteBuffer.clear();
            int bytesRead = seekableByteChannel.read(byteBuffer);
            if (bytesRead < bufferLength) {
                throw new IOException("Not enough bytes read");
            }
            try {
                id3v2Tag = ID3v2TagFactory.createTag(byteBuffer.array());
            } catch (NoSuchTagException e) {
                id3v2Tag = null;
            }
        }
    }

    private void initCustomTag(SeekableByteChannel seekableByteChannel) throws IOException {
        int bufferLength = (int) (getLength() - (endOffset + 1));
        if (hasId3v1Tag()) {
            bufferLength -= ID3v1Tag.TAG_LENGTH;
        }
        if (bufferLength <= 0) {
            customTag = null;
        } else {
            ByteBuffer byteBuffer = ByteBuffer.allocate(bufferLength);
            seekableByteChannel.position(endOffset + 1);
            byteBuffer.clear();
            int bytesRead = seekableByteChannel.read(byteBuffer);
            customTag = byteBuffer.array();
            if (bytesRead < bufferLength) {
                throw new IOException("Not enough bytes read");
            }
        }
    }

    public int getFrameCount() {
        return frameCount;
    }

    public int getStartOffset() {
        return startOffset;
    }

    public int getEndOffset() {
        return endOffset;
    }

    public long getLengthInMilliseconds() {
        return (long) (((endOffset - startOffset) * (8.0 / bitrate)) + 0.5);
    }

    public long getLengthInSeconds() {
        return ((getLengthInMilliseconds() + 500) / 1000);
    }

    public boolean isVbr() {
        return bitrates.size() > 1;
    }

    public int getBitrate() {
        return (int) (bitrate + 0.5);
    }

    public Map<Integer, MutableInteger> getBitrates() {
        return bitrates;
    }

    public String getChannelMode() {
        return channelMode;
    }

    public boolean isCopyright() {
        return copyright;
    }

    public String getEmphasis() {
        return emphasis;
    }

    public String getLayer() {
        return layer;
    }

    public String getModeExtension() {
        return modeExtension;
    }

    public boolean isOriginal() {
        return original;
    }

    public int getSampleRate() {
        return sampleRate;
    }

    public String getVersion() {
        return version;
    }

    public boolean hasXingFrame() {
        return (xingOffset >= 0);
    }

    public int getXingOffset() {
        return xingOffset;
    }

    public int getXingBitrate() {
        return xingBitrate;
    }

    public boolean hasId3v1Tag() {
        return id3v1Tag != null;
    }

    public ID3v1 getId3v1Tag() {
        return id3v1Tag;
    }

    public void setId3v1Tag(ID3v1 id3v1Tag) {
        this.id3v1Tag = id3v1Tag;
    }

    public void removeId3v1Tag() {
        this.id3v1Tag = null;
    }

    public boolean hasId3v2Tag() {
        return id3v2Tag != null;
    }

    public ID3v2 getId3v2Tag() {
        return id3v2Tag;
    }

    public void setId3v2Tag(ID3v2 id3v2Tag) {
        this.id3v2Tag = id3v2Tag;
    }

    public void removeId3v2Tag() {
        this.id3v2Tag = null;
    }

    public boolean hasCustomTag() {
        return customTag != null;
    }

    public byte[] getCustomTag() {
        return customTag;
    }

    public void setCustomTag(byte[] customTag) {
        this.customTag = customTag;
    }

    public void removeCustomTag() {
        this.customTag = null;
    }

    public void save(String newFilename) throws IOException, NotSupportedException {
        if (path.toAbsolutePath().compareTo(Paths.get(newFilename).toAbsolutePath()) == 0) {
            throw new IllegalArgumentException("Save filename same as source filename");
        }
        try (SeekableByteChannel saveFile = Files.newByteChannel(Paths.get(newFilename), EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE))) {
            if (hasId3v2Tag()) {
                ByteBuffer byteBuffer = ByteBuffer.wrap(id3v2Tag.toBytes());
                byteBuffer.rewind();
                saveFile.write(byteBuffer);
            }
            saveMpegFrames(saveFile);
            if (hasCustomTag()) {
                ByteBuffer byteBuffer = ByteBuffer.wrap(customTag);
                byteBuffer.rewind();
                saveFile.write(byteBuffer);
            }
            if (hasId3v1Tag()) {
                ByteBuffer byteBuffer = ByteBuffer.wrap(id3v1Tag.toBytes());
                byteBuffer.rewind();
                saveFile.write(byteBuffer);
            }
            saveFile.close();
        }
    }

    private void saveMpegFrames(SeekableByteChannel saveFile) throws IOException {
        int filePos = xingOffset;
        if (filePos < 0) {
            filePos = startOffset;
        }
        if (filePos < 0) {
            return;
        }
        if (endOffset < filePos) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(bufferLength);
        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            seekableByteChannel.position(filePos);
            while (true) {
                byteBuffer.clear();
                int bytesRead = seekableByteChannel.read(byteBuffer);
                byteBuffer.rewind();
                if (filePos + bytesRead <= endOffset) {
                    byteBuffer.limit(bytesRead);
                    saveFile.write(byteBuffer);
                    filePos += bytesRead;
                } else {
                    byteBuffer.limit(endOffset - filePos + 1);
                    saveFile.write(byteBuffer);
                    break;
                }
            }
        }
    }
}
