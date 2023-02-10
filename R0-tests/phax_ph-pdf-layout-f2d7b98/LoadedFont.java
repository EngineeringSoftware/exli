/*
 * Copyright (C) 2014-2022 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.pdflayout.spec;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.WillNotClose;
import javax.annotation.concurrent.Immutable;
import org.apache.pdfbox.pdmodel.font.PDCIDFont;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDFontDescriptor;
import org.apache.pdfbox.pdmodel.font.PDFontHelper;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.helger.collection.map.IntFloatMap;
import com.helger.collection.map.IntObjectMap;
import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.MustImplementEqualsAndHashcode;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.impl.CommonsArrayList;
import com.helger.commons.collection.impl.ICommonsList;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.io.stream.NonBlockingByteArrayOutputStream;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.pdflayout.PLConvert;
import com.helger.pdflayout.debug.PLDebugLog;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * This class represents a wrapper around a {@link PDFont} that is uniquely
 * assigned to a PDDocument.
 *
 * @author Philip Helger
 */
@Immutable
@MustImplementEqualsAndHashcode
public class LoadedFont {

    private static final class EncodedCodePoint implements Serializable {

        private final int m_nCodePoint;

        private final byte[] m_aEncoded;

        // Lazy inited
        private Integer m_aEncodedValue;

        private static int _toInt(@Nonnull final byte[] aEncoded) {
            int ret = 0;
            for (final byte b : aEncoded) {
                ret <<= 8;
                new Here("Unit", 74).given(ret, 29).checkEq(ret, 7424);
                new Here("Unit", 74).given(ret, 41).checkEq(ret, 10496);
                new Here("Unit", 74).given(ret, 44).checkEq(ret, 11264);
                new Here("Unit", 74).given(ret, 4).checkEq(ret, 1024);
                new Here("Unit", 74).given(ret, 51).checkEq(ret, 13056);
                new Here("Unit", 74).given(ret, 54).checkEq(ret, 13824);
                new Here("Unit", 74).given(ret, 25).checkEq(ret, 6400);
                new Here("Unit", 74).given(ret, 9).checkEq(ret, 2304);
                new Here("Unit", 74).given(ret, 79).checkEq(ret, 20224);
                new Here("Unit", 74).given(ret, 0).checkEq(ret, 0);
                new Here("Unit", 74).given(ret, 8).checkEq(ret, 2048);
                new Here("Unit", 74).given(ret, 58).checkEq(ret, 14848);
                new Here("Unit", 74).given(ret, 15).checkEq(ret, 3840);
                new Here("Unit", 74).given(ret, 2).checkEq(ret, 512);
                new Here("Unit", 74).given(ret, 3).checkEq(ret, 768);
                new Here("Unit", 74).given(ret, 72).checkEq(ret, 18432);
                new Here("Unit", 74).given(ret, 100).checkEq(ret, 25600);
                new Here("Unit", 74).given(ret, 1).checkEq(ret, 256);
                new Here("Unit", 74).given(ret, 40).checkEq(ret, 10240);
                new Here("Unit", 74).given(ret, 115).checkEq(ret, 29440);
                new Here("Unit", 74).given(ret, 18).checkEq(ret, 4608);
                new Here("Unit", 74).given(ret, 95).checkEq(ret, 24320);
                new Here("Unit", 74).given(ret, 35).checkEq(ret, 8960);
                new Here("Unit", 74).given(ret, 34).checkEq(ret, 8704);
                new Here("Unit", 74).given(ret, 74).checkEq(ret, 18944);
                new Here("Unit", 74).given(ret, 60).checkEq(ret, 15360);
                new Here("Unit", 74).given(ret, 16).checkEq(ret, 4096);
                new Here("Unit", 74).given(ret, 28).checkEq(ret, 7168);
                new Here("Unit", 74).given(ret, 23).checkEq(ret, 5888);
                new Here("Unit", 74).given(ret, 6).checkEq(ret, 1536);
                new Here("Unit", 74).given(ret, 57).checkEq(ret, 14592);
                new Here("Unit", 74).given(ret, 7).checkEq(ret, 1792);
                new Here("Unit", 74).given(ret, 11).checkEq(ret, 2816);
                ret |= (b + 256) % 256;
                new Here("Unit", 75).given(ret, 0).given(b, 71).checkEq(ret, 71);
                new Here("Unit", 75).given(ret, 256).given(b, 11).checkEq(ret, 267);
                new Here("Unit", 75).given(ret, 0).given(b, 120).checkEq(ret, 120);
                new Here("Unit", 75).given(ret, 256).given(b, 97).checkEq(ret, 353);
                new Here("Unit", 75).given(ret, 0).given(b, 69).checkEq(ret, 69);
                new Here("Unit", 75).given(ret, 0).given(b, 77).checkEq(ret, 77);
                new Here("Unit", 75).given(ret, 0).given(b, 100).checkEq(ret, 100);
                new Here("Unit", 75).given(ret, 0).given(b, -28).checkEq(ret, 228);
                new Here("Unit", 75).given(ret, 0).given(b, 116).checkEq(ret, 116);
                new Here("Unit", 75).given(ret, 0).given(b, 50).checkEq(ret, 50);
                new Here("Unit", 75).given(ret, 0).given(b, 112).checkEq(ret, 112);
                new Here("Unit", 75).given(ret, 0).given(b, 85).checkEq(ret, 85);
                new Here("Unit", 75).given(ret, 0).given(b, 47).checkEq(ret, 47);
                new Here("Unit", 75).given(ret, 0).given(b, 99).checkEq(ret, 99);
                new Here("Unit", 75).given(ret, 768).given(b, 106).checkEq(ret, 874);
                new Here("Unit", 75).given(ret, 0).given(b, 93).checkEq(ret, 93);
                new Here("Unit", 75).given(ret, 0).given(b, 64).checkEq(ret, 64);
                new Here("Unit", 75).given(ret, 0).given(b, 68).checkEq(ret, 68);
                new Here("Unit", 75).given(ret, 0).given(b, -105).checkEq(ret, 151);
                new Here("Unit", 75).given(ret, 256).given(b, 26).checkEq(ret, 282);
                new Here("Unit", 75).given(ret, 0).given(b, 72).checkEq(ret, 72);
                new Here("Unit", 75).given(ret, 0).given(b, 51).checkEq(ret, 51);
                new Here("Unit", 75).given(ret, 256).given(b, -25).checkEq(ret, 487);
                new Here("Unit", 75).given(ret, 0).given(b, 121).checkEq(ret, 121);
                new Here("Unit", 75).given(ret, 256).given(b, 63).checkEq(ret, 319);
                new Here("Unit", 75).given(ret, 0).given(b, 83).checkEq(ret, 83);
                new Here("Unit", 75).given(ret, 0).given(b, 3).checkEq(ret, 3);
                new Here("Unit", 75).given(ret, 0).given(b, 49).checkEq(ret, 49);
                new Here("Unit", 75).given(ret, 0).given(b, 115).checkEq(ret, 115);
                new Here("Unit", 75).given(ret, 0).given(b, 117).checkEq(ret, 117);
                new Here("Unit", 75).given(ret, 0).given(b, 123).checkEq(ret, 123);
                new Here("Unit", 75).given(ret, 0).given(b, 111).checkEq(ret, 111);
                new Here("Unit", 75).given(ret, 0).given(b, 125).checkEq(ret, 125);
                new Here("Unit", 75).given(ret, 0).given(b, 113).checkEq(ret, 113);
                new Here("Unit", 75).given(ret, 0).given(b, -33).checkEq(ret, 223);
                new Here("Unit", 75).given(ret, 0).given(b, 59).checkEq(ret, 59);
                new Here("Unit", 75).given(ret, 0).given(b, 41).checkEq(ret, 41);
                new Here("Unit", 75).given(ret, 0).given(b, 0).checkEq(ret, 0);
                new Here("Unit", 75).given(ret, 0).given(b, 84).checkEq(ret, 84);
                new Here("Unit", 75).given(ret, 0).given(b, 104).checkEq(ret, 104);
                new Here("Unit", 75).given(ret, 0).given(b, 73).checkEq(ret, 73);
                new Here("Unit", 75).given(ret, 0).given(b, 106).checkEq(ret, 106);
                new Here("Unit", 75).given(ret, 0).given(b, 108).checkEq(ret, 108);
                new Here("Unit", 75).given(ret, 0).given(b, 95).checkEq(ret, 95);
                new Here("Unit", 75).given(ret, 0).given(b, 52).checkEq(ret, 52);
                new Here("Unit", 75).given(ret, 0).given(b, 48).checkEq(ret, 48);
                new Here("Unit", 75).given(ret, 0).given(b, 63).checkEq(ret, 63);
                new Here("Unit", 75).given(ret, 0).given(b, 37).checkEq(ret, 37);
                new Here("Unit", 75).given(ret, 0).given(b, 122).checkEq(ret, 122);
                new Here("Unit", 75).given(ret, 0).given(b, 58).checkEq(ret, 58);
                new Here("Unit", 75).given(ret, 256).given(b, -101).checkEq(ret, 411);
                new Here("Unit", 75).given(ret, 0).given(b, -80).checkEq(ret, 176);
                new Here("Unit", 75).given(ret, 0).given(b, 114).checkEq(ret, 114);
                new Here("Unit", 75).given(ret, 512).given(b, 93).checkEq(ret, 605);
                new Here("Unit", 75).given(ret, 0).given(b, 102).checkEq(ret, 102);
                new Here("Unit", 75).given(ret, 0).given(b, 82).checkEq(ret, 82);
                new Here("Unit", 75).given(ret, 256).given(b, -3).checkEq(ret, 509);
                new Here("Unit", 75).given(ret, 0).given(b, 88).checkEq(ret, 88);
                new Here("Unit", 75).given(ret, 0).given(b, 53).checkEq(ret, 53);
                new Here("Unit", 75).given(ret, 0).given(b, 110).checkEq(ret, 110);
                new Here("Unit", 75).given(ret, 0).given(b, 79).checkEq(ret, 79);
                new Here("Unit", 75).given(ret, 0).given(b, 1).checkEq(ret, 1);
                new Here("Unit", 75).given(ret, 0).given(b, 118).checkEq(ret, 118);
                new Here("Unit", 75).given(ret, 0).given(b, 119).checkEq(ret, 119);
                new Here("Unit", 75).given(ret, 0).given(b, 32).checkEq(ret, 32);
                new Here("Unit", 75).given(ret, 0).given(b, 36).checkEq(ret, 36);
                new Here("Unit", 75).given(ret, 0).given(b, 75).checkEq(ret, 75);
                new Here("Unit", 75).given(ret, 1024).given(b, 14).checkEq(ret, 1038);
                new Here("Unit", 75).given(ret, 0).given(b, 40).checkEq(ret, 40);
                new Here("Unit", 75).given(ret, 0).given(b, 90).checkEq(ret, 90);
                new Here("Unit", 75).given(ret, 0).given(b, 57).checkEq(ret, 57);
                new Here("Unit", 75).given(ret, 0).given(b, 4).checkEq(ret, 4);
                new Here("Unit", 75).given(ret, 0).given(b, 91).checkEq(ret, 91);
                new Here("Unit", 75).given(ret, 0).given(b, 54).checkEq(ret, 54);
                new Here("Unit", 75).given(ret, 0).given(b, 46).checkEq(ret, 46);
                new Here("Unit", 75).given(ret, 0).given(b, 86).checkEq(ret, 86);
                new Here("Unit", 75).given(ret, 0).given(b, 78).checkEq(ret, 78);
                new Here("Unit", 75).given(ret, 0).given(b, 97).checkEq(ret, 97);
                new Here("Unit", 75).given(ret, 512).given(b, 31).checkEq(ret, 543);
                new Here("Unit", 75).given(ret, 0).given(b, 101).checkEq(ret, 101);
                new Here("Unit", 75).given(ret, 0).given(b, 80).checkEq(ret, 80);
                new Here("Unit", 75).given(ret, 0).given(b, 65).checkEq(ret, 65);
                new Here("Unit", 75).given(ret, 0).given(b, 67).checkEq(ret, 67);
                new Here("Unit", 75).given(ret, 0).given(b, 103).checkEq(ret, 103);
                new Here("Unit", 75).given(ret, 0).given(b, 33).checkEq(ret, 33);
                new Here("Unit", 75).given(ret, 0).given(b, 2).checkEq(ret, 2);
                new Here("Unit", 75).given(ret, 256).given(b, 86).checkEq(ret, 342);
                new Here("Unit", 75).given(ret, 0).given(b, 109).checkEq(ret, 109);
                new Here("Unit", 75).given(ret, 0).given(b, 76).checkEq(ret, 76);
                new Here("Unit", 75).given(ret, 0).given(b, 56).checkEq(ret, 56);
                new Here("Unit", 75).given(ret, 0).given(b, 44).checkEq(ret, 44);
                new Here("Unit", 75).given(ret, 0).given(b, 105).checkEq(ret, 105);
                new Here("Unit", 75).given(ret, 0).given(b, 70).checkEq(ret, 70);
                new Here("Unit", 75).given(ret, 0).given(b, 107).checkEq(ret, 107);
                new Here("Unit", 75).given(ret, 0).given(b, 87).checkEq(ret, 87);
                new Here("Unit", 75).given(ret, 0).given(b, 45).checkEq(ret, 45);
                new Here("Unit", 75).given(ret, 0).given(b, 55).checkEq(ret, 55);
                new Here("Unit", 75).given(ret, 0).given(b, 98).checkEq(ret, 98);
                new Here("Unit", 75).given(ret, 0).given(b, -73).checkEq(ret, 183);
                new Here("Unit", 75).given(ret, 0).given(b, 66).checkEq(ret, 66);
            }
            return ret;
        }

        private EncodedCodePoint(final int nCodePoint, @Nonnull final byte[] aEncoded) {
            m_nCodePoint = nCodePoint;
            m_aEncoded = aEncoded;
        }

        /**
         * @return The effective code point use.
         */
        public int getCodePoint() {
            return m_nCodePoint;
        }

        public void writeEncodedBytes(@Nonnull @WillNotClose final OutputStream aOS) throws IOException {
            aOS.write(m_aEncoded);
        }

        public int getEncodedIntValue() {
            Integer ret = m_aEncodedValue;
            if (ret == null) {
                // Lazy init
                ret = m_aEncodedValue = Integer.valueOf(_toInt(m_aEncoded));
            }
            return ret.intValue();
        }
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(LoadedFont.class);

    /**
     * The underlying PDFBox font
     */
    private final PDFont m_aFont;

    /**
     * The fallback character to be used in case an unmappable character is
     * contained
     */
    private final int m_nFallbackCodePoint;

    // Status vars
    private final float m_fBBHeight;

    private final float m_fDescent;

    private final boolean m_bFontWillBeSubset;

    private final IntObjectMap<EncodedCodePoint> m_aEncodedCodePointCache = new IntObjectMap<>();

    private final IntFloatMap m_aCodePointWidthCache = new IntFloatMap();

    public LoadedFont(@Nonnull final PDFont aFont, final int nFallbackCodePoint) {
        ValueEnforcer.notNull(aFont, "Font");
        m_aFont = aFont;
        m_nFallbackCodePoint = nFallbackCodePoint;
        PDFontDescriptor aFD = aFont.getFontDescriptor();
        if (aFD == null) {
            if (aFont instanceof PDType0Font) {
                final PDCIDFont aDescendantFont = ((PDType0Font) aFont).getDescendantFont();
                if (aDescendantFont != null) {
                    aFD = aDescendantFont.getFontDescriptor();
                }
            }
        }
        if (aFD == null) {
            throw new IllegalArgumentException("Failed to determine FontDescriptor from specified font " + aFont);
        }
        m_fBBHeight = aFD.getFontBoundingBox().getHeight();
        m_fDescent = aFD.getDescent();
        m_bFontWillBeSubset = m_aFont.willBeSubset();
    }

    /**
     * @return The underlying font. Never <code>null</code>.
     */
    @Nonnull
    public final PDFont getFont() {
        return m_aFont;
    }

    @Nonnegative
    public final float getDescent(@Nonnegative final float fFontSize) {
        return PLConvert.getWidthForFontSize(m_fDescent, fFontSize);
    }

    @Nonnegative
    public final float getTextHeight(@Nonnegative final float fFontSize) {
        return PLConvert.getWidthForFontSize(m_fBBHeight, fFontSize);
    }

    @Nonnull
    public static EncodedCodePoint encodeCodepointWithFallback(@Nonnull final PDFont aFont, final int nCodepoint, final int nFallbackCodepoint) throws IOException {
        try {
            // multi-byte encoding with 1 to 4 bytes
            final byte[] aEncodedBytes = PDFontHelper.encode(aFont, nCodepoint);
            return new EncodedCodePoint(nCodepoint, aEncodedBytes);
        } catch (final IllegalArgumentException ex) {
            if (PLDebugLog.isDebugFont()) {
                PLDebugLog.debugFont(aFont.toString(), "No code point " + nCodepoint + " in this font - " + ex.getMessage());
            }
            try {
                // Use fallback code point
                final byte[] aEncodedBytes = PDFontHelper.encode(aFont, nFallbackCodepoint);
                return new EncodedCodePoint(nFallbackCodepoint, aEncodedBytes);
            } catch (final IllegalArgumentException ex2) {
                if (PLDebugLog.isDebugFont()) {
                    PLDebugLog.debugFont(aFont.toString(), "No fallback code point " + nFallbackCodepoint + " in this font - " + ex2.getMessage());
                }
                throw ex2;
            }
        }
    }

    @Nonnull
    private EncodedCodePoint _getEncodedCodePoint(final int nCodePoint) throws IOException {
        EncodedCodePoint aECP = m_aEncodedCodePointCache.get(nCodePoint);
        if (aECP == null) {
            // Encode code point according to the font rules
            aECP = encodeCodepointWithFallback(m_aFont, nCodePoint, m_nFallbackCodePoint);
            // put in cache
            m_aEncodedCodePointCache.put(nCodePoint, aECP);
        }
        return aECP;
    }

    private float _getCodePointWidth(final int nCodePoint) throws IOException {
        float fWidth = m_aCodePointWidthCache.get(nCodePoint, -1f);
        if (fWidth < 0) {
            // Get encoded code point (from its own cache)
            final EncodedCodePoint aECP = _getEncodedCodePoint(nCodePoint);
            // Get width of encoded value
            fWidth = m_aFont.getWidth(aECP.getEncodedIntValue());
            // Map code point to width to save encoding
            m_aCodePointWidthCache.put(nCodePoint, fWidth);
        }
        return fWidth;
    }

    @Nonnegative
    public float getStringWidth(@Nonnull final String sText, @Nonnegative final float fFontSize) throws IOException {
        if (false) {
            // Toooo slow
            return PLConvert.getWidthForFontSize(m_aFont.getStringWidth(sText), fFontSize);
        }
        float fWidth = 0;
        // Iterate on code point basis
        int nCPOfs = 0;
        final int nLength = sText.length();
        while (nCPOfs < nLength) {
            final int nCP = sText.codePointAt(nCPOfs);
            nCPOfs += Character.charCount(nCP);
            // Use code point cache for maximum performance
            fWidth += _getCodePointWidth(nCP);
        }
        // The width is in 1000 unit of text space, ie 333 or 777
        return PLConvert.getWidthForFontSize(fWidth, fFontSize);
    }

    /**
     * A quick version to encode the passed text so that it can be written with
     * <code>COSWriter.writeString</code>
     *
     * @param sText
     *        Text to be written.
     * @return The byte array that can be written with the COSWrite. Never
     *         <code>null</code>.
     * @throws IOException
     *         In case something goes wrong
     */
    @Nonnull
    public byte[] getEncodedForPageContentStream(@Nonnull final String sText) throws IOException {
        // Minimum is 1*string length
        // Maximum is 4*string length
        try (final NonBlockingByteArrayOutputStream aBAOS = new NonBlockingByteArrayOutputStream(sText.length() * 2)) {
            int nCPOfs = 0;
            while (nCPOfs < sText.length()) {
                final int nCP = sText.codePointAt(nCPOfs);
                nCPOfs += Character.charCount(nCP);
                final EncodedCodePoint aECP = _getEncodedCodePoint(nCP);
                if (m_bFontWillBeSubset) {
                    m_aFont.addToSubset(aECP.getCodePoint());
                }
                aECP.writeEncodedBytes(aBAOS);
            }
            return aBAOS.toByteArray();
        }
    }

    private void _getLineFitToWidthForward(@Nonnull final String sLine, @Nonnegative final float fFontSize, @Nonnegative final float fMaxWidth, @Nonnull final List<TextAndWidthSpec> ret) throws IOException {
        String sCurLine = sLine;
        float fSumWidth = 0f;
        int nCodePointOffset = 0;
        float fSumWidthOfLastWhitespace = 0f;
        int nCodePointOffsetOfLastWhitespace = 0;
        boolean bWarnedOnTooSmallMaxWidth = false;
        // For each code point
        while (nCodePointOffset < sCurLine.length()) {
            final int nCodePoint = sCurLine.codePointAt(nCodePointOffset);
            final float fCodePointWidth = PLConvert.getWidthForFontSize(_getCodePointWidth(nCodePoint), fFontSize);
            if (Character.isWhitespace(nCodePoint)) {
                // Whitespace is considered a word break and allows us to break the line
                // here, so remember it before the increment
                nCodePointOffsetOfLastWhitespace = nCodePointOffset;
                fSumWidthOfLastWhitespace = fSumWidth;
            }
            final float fNewWidth = fSumWidth + fCodePointWidth;
            boolean bSplitNow = fNewWidth > fMaxWidth;
            if (bSplitNow && nCodePointOffset == 0) {
                if (!bWarnedOnTooSmallMaxWidth) {
                    if (LOGGER.isWarnEnabled()) {
                        LOGGER.warn("The provided max width (" + fMaxWidth + ") is too small to hold a single character! Will create an overlap! Problem string=<" + sLine + ">");
                    }
                    bWarnedOnTooSmallMaxWidth = true;
                }
                bSplitNow = false;
            }
            if (bSplitNow) {
                // Maximum width reached
                if (nCodePointOffsetOfLastWhitespace > 0) {
                    // Use everything up to but excluding the last whitespace
                    final String sPart = sCurLine.substring(0, nCodePointOffsetOfLastWhitespace);
                    // Skip whitespace char in this case
                    sCurLine = sCurLine.substring(nCodePointOffsetOfLastWhitespace + 1);
                    ret.add(new TextAndWidthSpec(sPart, fSumWidthOfLastWhitespace));
                } else {
                    // No whitespace - use up to but excluding last char
                    final String sPart = sCurLine.substring(0, nCodePointOffset);
                    sCurLine = sCurLine.substring(nCodePointOffset);
                    ret.add(new TextAndWidthSpec(sPart, fSumWidth));
                }
                // Reset counter for the rest of the line
                fSumWidth = 0f;
                nCodePointOffset = 0;
                fSumWidthOfLastWhitespace = 0f;
                nCodePointOffsetOfLastWhitespace = 0;
            } else {
                // Add current char
                nCodePointOffset += Character.charCount(nCodePoint);
                fSumWidth = fNewWidth;
            }
        }
        // Add the rest (even if it is empty, otherwise empty lines won't get
        // printed)
        ret.add(new TextAndWidthSpec(sCurLine, fSumWidth));
    }

    @Nonnull
    @ReturnsMutableCopy
    public ICommonsList<TextAndWidthSpec> getFitToWidth(@Nullable final String sText, @Nonnegative final float fFontSize, @Nonnegative final float fMaxWidth) throws IOException {
        ValueEnforcer.isGT0(fFontSize, "FontSize");
        ValueEnforcer.isGT0(fMaxWidth, "MaxWidth");
        // First split by the contained line breaks
        // In the constructor we ensured that only "\n" is used
        final String[] aLines = StringHelper.getExplodedArray('\n', sText);
        final ICommonsList<TextAndWidthSpec> ret = new CommonsArrayList<>();
        for (final String sLine : aLines) _getLineFitToWidthForward(sLine, fFontSize, fMaxWidth, ret);
        return ret;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || !getClass().equals(o.getClass())) {
            return false;
        }
        final LoadedFont rhs = (LoadedFont) o;
        return m_aFont.equals(rhs.m_aFont);
    }

    @Override
    public int hashCode() {
        return new HashCodeGenerator(this).append(m_aFont).getHashCode();
    }

    @Override
    public String toString() {
        return new ToStringGenerator(this).append("Font", m_aFont).append("FallbackCodePoint", m_nFallbackCodePoint).append("BBHeight", m_fBBHeight).append("Descent", m_fDescent).append("FontWillBeSubset", m_bFontWillBeSubset).getToString();
    }
}
