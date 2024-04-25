package org.elasticsearch.index.analysis;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;
import org.elasticsearch.analysis.PinyinConfig;
import org.nlpcn.commons.lang.pinyin.Pinyin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class PinyinTokenizer extends Tokenizer {

    private static final int DEFAULT_BUFFER_SIZE = 256;

    private final CharTermAttribute termAtt = addAttribute(CharTermAttribute.class);

    private boolean done = false;

    private boolean processedCandidate = false;

    private boolean processedSortCandidate = false;

    private boolean processedFirstLetter = false;

    private boolean processedFullPinyinLetter = false;

    private boolean processedOriginal = false;

    protected int position = 0;

    protected int lastOffset = 0;

    private OffsetAttribute offsetAtt = addAttribute(OffsetAttribute.class);

    private PositionIncrementAttribute positionAttr = addAttribute(PositionIncrementAttribute.class);

    private PinyinConfig config;

    ArrayList<TermItem> candidate;

    // indicate candidates process offset
    protected int candidateOffset = 0;

    private HashSet<String> termsFilter;

    StringBuilder firstLetters;

    StringBuilder fullPinyinLetters;

    private int lastIncrementPosition = 0;

    String source;

    public PinyinTokenizer(PinyinConfig config) {
        this(DEFAULT_BUFFER_SIZE);
        this.config = config;
        // validate config
        if (!(config.keepFirstLetter || config.keepSeparateFirstLetter || config.keepFullPinyin || config.keepJoinedFullPinyin || config.keepSeparateChinese)) {
            throw new ConfigErrorException("pinyin config error, can't disable separate_first_letter, first_letter and full_pinyin at the same time.");
        }
        candidate = new ArrayList<>();
        termsFilter = new HashSet<>();
        firstLetters = new StringBuilder();
        fullPinyinLetters = new StringBuilder();
    }

    public PinyinTokenizer(int bufferSize) {
        super();
        termAtt.resizeBuffer(bufferSize);
    }

    void addCandidate(TermItem item) {
        String term = item.term;
        if (config.lowercase) {
            term = term.toLowerCase();
        }
        if (config.trimWhitespace) {
            term = term.trim();
        }
        item.term = term;
        if (term.length() == 0) {
            return;
        }
        // remove same term with same position
        String fr = term + item.position;
        // remove same term, regardless position
        if (config.removeDuplicateTerm) {
            fr = term;
        }
        if (termsFilter.contains(fr)) {
            return;
        }
        termsFilter.add(fr);
        candidate.add(item);
    }

    void setTerm(String term, int startOffset, int endOffset, int position) {
        if (config.lowercase) {
            term = term.toLowerCase();
        }
        if (config.trimWhitespace) {
            term = term.trim();
        }
        // ignore empty term
        if (term.length() == 0) {
            return;
        }
        termAtt.setEmpty();
        termAtt.append(term);
        if (startOffset < 0) {
            startOffset = 0;
        }
        if (endOffset < startOffset) {
            endOffset = startOffset + term.length();
        }
        if (!config.ignorePinyinOffset) {
            offsetAtt.setOffset(correctOffset(startOffset), correctOffset(endOffset));
        }
        int offset = position - lastIncrementPosition;
        if (offset < 0) {
            offset = 0;
        }
        positionAttr.setPositionIncrement(offset);
        lastIncrementPosition = position;
    }

    @Override
    public final boolean incrementToken() throws IOException {
        clearAttributes();
        if (!done) {
            // combine text together to get right pinyin
            if (!processedCandidate) {
                processedCandidate = true;
                int upto = 0;
                char[] buffer = termAtt.buffer();
                while (true) {
                    final int length = input.read(buffer, upto, buffer.length - upto);
                    if (length == -1) {
                        break;
                    }
                    upto += length;
                    if (upto == buffer.length) {
                        buffer = termAtt.resizeBuffer(1 + buffer.length);
                    }
                }
                termAtt.setLength(upto);
                source = termAtt.toString();
                List<String> pinyinList = Pinyin.pinyin(source);
                List<String> chineseList = ChineseUtil.segmentChinese(source);
                if (pinyinList.size() == 0 || chineseList.size() == 0) {
                    return false;
                }
                StringBuilder buff = new StringBuilder();
                int buffStartPosition = 0;
                int buffSize = 0;
                position = 0;
                for (int i = 0; i < source.length(); i++) {
                    char c = source.charAt(i);
                    // keep original alphabet
                    if (c < 128) {
                        if (buff.length() <= 0) {
                            buffStartPosition = i;
                        }
                        if ((c > 96 && c < 123) || (c > 64 && c < 91) || (c > 47 && c < 58)) {
                            if (config.keepNoneChinese) {
                                if (config.keepNoneChineseTogether) {
                                    buff.append(c);
                                    buffSize++;
                                } else {
                                    position++;
                                    addCandidate(new TermItem(String.valueOf(c), i, i + 1, buffStartPosition + 1));
                                }
                            }
                            if (config.keepNoneChineseInFirstLetter) {
                                firstLetters.append(c);
                            }
                            if (config.keepNoneChineseInJoinedFullPinyin) {
                                fullPinyinLetters.append(c);
                            }
                        }
                    } else {
                        // clean previous temp
                        if (buff.length() > 0) {
                            buffSize = parseBuff(buff, buffSize, buffStartPosition);
                        }
                        boolean incrPosition = false;
                        String pinyin = pinyinList.get(i);
                        String chinese = chineseList.get(i);
                        if (pinyin != null && pinyin.length() > 0) {
                            firstLetters.append(pinyin.charAt(0));
                            if (config.keepSeparateFirstLetter & pinyin.length() > 1) {
                                itest("dev", 201).given(pinyin, "jia").given(config.keepSeparateFirstLetter, true).checkTrue(group());
                                itest("dev", 201).given(pinyin, "di").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "bu").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "hua").given(config.keepSeparateFirstLetter, true).checkTrue(group());
                                itest("dev", 201).given(pinyin, "ce").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "zhang").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "an").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "ji").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "ping").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "yin").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "bo").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "si").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "ren").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "de").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "jia").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "wo").given(config.keepSeparateFirstLetter, true).checkTrue(group());
                                itest("dev", 201).given(pinyin, "ha").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "niao").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "lv").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "le").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "gao").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "xue").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "yue").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "liu").given(config.keepSeparateFirstLetter, true).checkTrue(group());
                                itest("dev", 201).given(pinyin, "tian").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "fu").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "xiao").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "zhi").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "shi").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "cheng").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "yi").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "huo").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "neng").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "suan").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "liu").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "sheng").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "fa").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "ming").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "you").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "yue").given(config.keepSeparateFirstLetter, true).checkTrue(group());
                                itest("dev", 201).given(pinyin, "wang").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "jin").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "de").given(config.keepSeparateFirstLetter, true).checkTrue(group());
                                itest("dev", 201).given(pinyin, "guo").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "hua").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "li").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "dao").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "jiang").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "yin").given(config.keepSeparateFirstLetter, true).checkTrue(group());
                                itest("dev", 201).given(pinyin, "pin").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                itest("dev", 201).given(pinyin, "da").given(config.keepSeparateFirstLetter, false).checkFalse(group());
                                position++;
                                incrPosition = true;
                                addCandidate(new TermItem(String.valueOf(pinyin.charAt(0)), i, i + 1, position));
                            }
                            if (config.keepFullPinyin) {
                                if (!incrPosition) {
                                    position++;
                                }
                                addCandidate(new TermItem(pinyin, i, i + 1, position));
                            }
                            if (config.keepSeparateChinese) {
                                addCandidate(new TermItem(chinese, i, i + 1, position));
                            }
                            if (config.keepJoinedFullPinyin) {
                                fullPinyinLetters.append(pinyin);
                            }
                        }
                    }
                    lastOffset = i;
                }
                // clean previous temp
                if (buff.length() > 0) {
                    buffSize = parseBuff(buff, buffSize, buffStartPosition);
                }
            }
            if (config.keepOriginal && !processedOriginal) {
                processedOriginal = true;
                addCandidate(new TermItem(source, 0, source.length(), 1));
            }
            if (config.keepJoinedFullPinyin && !processedFullPinyinLetter && fullPinyinLetters.length() > 0) {
                processedFullPinyinLetter = true;
                addCandidate(new TermItem(fullPinyinLetters.toString(), 0, source.length(), 1));
                fullPinyinLetters.setLength(0);
            }
            if (config.keepFirstLetter && firstLetters.length() > 0 && !processedFirstLetter) {
                processedFirstLetter = true;
                String fl;
                if (firstLetters.length() > config.LimitFirstLetterLength && config.LimitFirstLetterLength > 0) {
                    fl = firstLetters.substring(0, config.LimitFirstLetterLength);
                    itest("randoop", 247).given(firstLetters, "129.xml").checkEq(fl, "orgapachelucenea");
                    itest("dev", 247).given(firstLetters, "14.xml").checkEq(fl, "lujsldhzxygfclms");
                } else {
                    fl = firstLetters.toString();
                }
                if (config.lowercase) {
                    fl = fl.toLowerCase();
                }
                if (!(config.keepSeparateFirstLetter && fl.length() <= 1)) {
                    addCandidate(new TermItem(fl, 0, fl.length(), 1));
                }
            }
            if (!processedSortCandidate) {
                processedSortCandidate = true;
                Collections.sort(candidate);
            }
            if (candidateOffset < candidate.size()) {
                TermItem item = candidate.get(candidateOffset);
                candidateOffset++;
                setTerm(item.term, item.startOffset, item.endOffset, item.position);
                return true;
            }
            done = true;
            return false;
        }
        return false;
    }

    private int parseBuff(StringBuilder buff, int buffSize, int buffPosition) {
        if (config.keepNoneChinese) {
            if (config.noneChinesePinyinTokenize) {
                List<String> result = PinyinAlphabetTokenizer.walk(buff.toString());
                int start = (lastOffset - buffSize + 1);
                for (int i = 0; i < result.size(); i++) {
                    int end;
                    String t = result.get(i);
                    if (config.fixedPinyinOffset) {
                        end = start + 1;
                    } else {
                        end = start + t.length();
                    }
                    position++;
                    addCandidate(new TermItem(result.get(i), start, end, position));
                    start = end;
                }
            } else if (config.keepFirstLetter || config.keepSeparateFirstLetter || config.keepFullPinyin || !config.keepNoneChineseInJoinedFullPinyin) {
                position++;
                addCandidate(new TermItem(buff.toString(), lastOffset - buffSize, lastOffset, position));
            }
        }
        buff.setLength(0);
        buffSize = 0;
        return buffSize;
    }

    @Override
    public final void end() throws IOException {
        super.end();
        if (!config.ignorePinyinOffset) {
            ++lastOffset;
            offsetAtt.setOffset(correctOffset(lastOffset), correctOffset(lastOffset));
        }
    }

    @Override
    public void reset() throws IOException {
        super.reset();
        position = 0;
        candidateOffset = 0;
        this.done = false;
        this.processedCandidate = false;
        this.processedFirstLetter = false;
        this.processedFullPinyinLetter = false;
        this.processedOriginal = false;
        this.processedSortCandidate = false;
        firstLetters.setLength(0);
        fullPinyinLetters.setLength(0);
        termsFilter.clear();
        candidate.clear();
        source = null;
        lastIncrementPosition = 0;
        lastOffset = 0;
    }
}
