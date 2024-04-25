package com.ftpix.sherdogparser.parsers;

import com.ftpix.sherdogparser.Constants;
import com.ftpix.sherdogparser.PictureProcessor;
import com.ftpix.sherdogparser.models.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import static com.ftpix.sherdogparser.parsers.ParserUtils.*;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Created by gz on 20-Aug-16.
 * Parse a fighter through a url
 */
public class FighterParser implements SherdogParser<Fighter> {

    private final Logger logger = LoggerFactory.getLogger(FighterParser.class);

    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-dd-MM");

    private final SimpleDateFormat df2 = new SimpleDateFormat("MMM dd, yyyy", Locale.US);

    private final SimpleDateFormat df3 = new SimpleDateFormat("MMMM dd, yyyy");

    private final PictureProcessor PROCESSOR;

    private final ZoneId ZONE_ID;

    private final int COLUMN_RESULT = 0, COLUMN_OPPONENT = 1, COLUMN_EVENT = 2, COLUMN_METHOD = 3, COLUMN_ROUND = 4, COLUMN_TIME = 5;

    private final int METHOD_KO = 0, METHOD_SUBMISSION = 1, METHOD_DECISION = 2, METHOD_OTHERS = 3;

    /**
     * Create a fight parser with a specified cache folder
     *
     * @param processor the picture processor to use for the fighter pictures
     */
    public FighterParser(PictureProcessor processor) {
        this.PROCESSOR = processor;
        ZONE_ID = ZoneId.systemDefault();
    }

    /**
     * Generates a fight parser with specified cache folder and zone id
     *
     * @param processor the picture processor to use for the fighter pictures
     * @param zoneId    specified zone id for time conversion
     */
    public FighterParser(PictureProcessor processor, ZoneId zoneId) {
        this.PROCESSOR = processor;
        this.ZONE_ID = zoneId;
    }

    /**
     * FighterPArser with default cache folder location
     *
     * @param zoneId specified zone id for time conversion
     */
    public FighterParser(ZoneId zoneId) {
        this.PROCESSOR = Constants.DEFAULT_PICTURE_PROCESSOR;
        ZONE_ID = zoneId;
    }

    /**
     * Parse a sherdog page
     *
     * @param doc Jsoup document of the sherdog page
     * @throws IOException if connecting to sherdog fails
     */
    @Override
    public Fighter parseDocument(Document doc) throws IOException {
        Fighter fighter = new Fighter();
        fighter.setSherdogUrl(getSherdogPageUrl(doc));
        logger.info("Refreshing fighter {}", fighter.getSherdogUrl());
        try {
            Elements name = doc.select(".bio_fighter h1 span.fn");
            fighter.setName(name.get(0).html());
        } catch (Exception e) {
            // no info, skipping
        }
        // Getting nick name
        try {
            Elements nickname = doc.select(".bio_fighter span.nickname em");
            fighter.setNickname(nickname.get(0).html());
        } catch (Exception e) {
            // no info, skipping
        }
        Elements bioTable = doc.select(".bio-holder table tr");
        try {
            for (Element tr : bioTable) {
                Elements td = tr.select("td");
                if (td.size() == 2) {
                    switch(td.get(0).text()) {
                        case "AGE":
                            Elements birthday = td.get(1).select("span[itemprop=\"birthDate\"]");
                            fighter.setBirthday(df2.parse(birthday.get(0).html()));
                            break;
                        case "HEIGHT":
                            fighter.setHeight(ParserUtils.getText(td.get(1), "b:nth-child(1)"));
                            break;
                        case "WEIGHT":
                            fighter.setWeight(getText(td.get(1), "b:nth-child(1)"));
                            break;
                    }
                }
            }
        } catch (Exception e) {
            logger.error("Couldn't parse bio", e);
        }
        // wins
        try {
            Elements wins = doc.select("div.win > span:nth-child(2)");
            fighter.setWins(Integer.parseInt(wins.get(0).html()));
        } catch (Exception e) {
            // no info, skipping
        }
        try {
            fighter.setWinsKo(getInt(doc, ".wins > div:nth-child(3) > div:nth-child(1)"));
        } catch (Exception e) {
            // no info, skipping
        }
        try {
            fighter.setWinsSub(getInt(doc, ".wins > div:nth-child(5) > div:nth-child(1)"));
        } catch (Exception e) {
            // no info, skipping
        }
        try {
            fighter.setWinsDec(getInt(doc, ".wins > div:nth-child(7) > div:nth-child(1)"));
        } catch (Exception e) {
            // no info, skipping
        }
        try {
            fighter.setWinsOther(getInt(doc, ".wins > div:nth-child(9) > div:nth-child(1)"));
        } catch (Exception e) {
            // no info, skipping
        }
        // loses
        try {
            fighter.setLosses(getInt(doc, ".lose > span:nth-child(2)"));
        } catch (Exception e) {
            // no info, skipping
        }
        try {
            fighter.setLossesKo((getInt(doc, ".loses > div:nth-child(3) > div:nth-child(1)")));
        } catch (Exception e) {
            // no info, skipping
        }
        try {
            fighter.setLossesSub(getInt(doc, ".loses > div:nth-child(5) > div:nth-child(1)"));
        } catch (Exception e) {
            // no info, skipping
        }
        try {
            fighter.setLossesDec(getInt(doc, ".loses > div:nth-child(7) > div:nth-child(1)"));
        } catch (Exception e) {
            // no info, skipping
        }
        try {
            fighter.setLossesOther(getInt(doc, ".loses > div:nth-child(9) > div:nth-child(1)"));
        } catch (Exception e) {
            // no info, skipping
        }
        // draws and NC
        try {
            fighter.setDraws(getInt(doc, "div.winloses.draws > span:nth-child(2)"));
        } catch (Exception e) {
        }
        try {
            fighter.setNc(getInt(doc, "div.winloses.nc > span:nth-child(2)"));
        } catch (Exception e) {
        }
        Elements picture = doc.select("img.profile-image.photo[itemprop=\"image\"]");
        String pictureUrl = "https://www.sherdog.com" + picture.attr("src").trim();
        fighter.setFights(new ArrayList<>());
        // upcoming fight
        try {
            Elements fightPreview = doc.select(".fight_card_preview");
            if (fightPreview.size() == 1) {
                Fight fight = new Fight();
                fight.setFighter1(fighter);
                SherdogBaseObject fighter2 = new SherdogBaseObject();
                fighter2.setName(getText(doc, "div.fighter:nth-child(3) > h3:nth-child(2) > a:nth-child(1) > span:nth-child(1)"));
                fighter2.setSherdogUrl(doc.select("div.fighter:nth-child(3) > h3:nth-child(2) > a:nth-child(1)").get(0).attr("abs:href"));
                fight.setFighter2(fighter2);
                Elements fightCardButton = doc.select(".fight_card_preview .card_button");
                if (!fightCardButton.isEmpty()) {
                    Event event = new Event();
                    event.setSherdogUrl(fightCardButton.attr("abs:href"));
                    event.setName(getText(doc, ".fight_card_preview > h2:nth-child(1)"));
                    event.setLocation(getText(doc, ".date_location > em:nth-child(2) > span:nth-child(2)"));
                    String date = doc.select(".date_location meta").get(0).attr("content");
                    ZonedDateTime dateFromStringToZoneId = getDateFromStringToZoneId(date, ZONE_ID);
                    event.setDate(dateFromStringToZoneId);
                    fight.setDate(dateFromStringToZoneId);
                    fight.setEvent(event);
                }
                fighter.getFights().add(fight);
            }
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
        Elements fightTables = doc.select(".fight_history");
        logger.info("Found {} fight history tables", fightTables.size());
        doc.select("section").stream().filter(section -> !section.select(".fight_history").isEmpty()).forEach(section -> {
            Elements title = section.select(".slanted_title div:nth-child(1)");
            FightType type = FightType.fromString(title.html());
            Elements trs = section.select(".new_table.fighter tbody tr");
            List<Fight> fights = this.getFights(trs, fighter).stream().map(f -> {
                f.setType(type);
                return f;
            }).collect(Collectors.toList());
            itest("randoop", 252).given(trs, "932.xml").given(fighter, "886.xml").given(type, "3.xml").checkEq(fights, "887.xml");
            itest("randoop", 252).given(trs, "893.xml").given(fighter, "812.xml").given(type, "3.xml").checkEq(fights, "813.xml");
            itest("randoop", 252).given(trs, "896.xml").given(fighter, "826.xml").given(type, "3.xml").checkEq(fights, "827.xml");
            itest("randoop", 252).given(trs, "850.xml").given(fighter, "851.xml").given(type, "57.xml").checkEq(fights, "852.xml");
            itest("randoop", 252).given(trs, "934.xml").given(fighter, "802.xml").given(type, "3.xml").checkEq(fights, "803.xml");
            itest("randoop", 252).given(trs, "838.xml").given(fighter, "839.xml").given(type, "3.xml").checkEq(fights, "840.xml");
            itest("randoop", 252).given(trs, "946.xml").given(fighter, "856.xml").given(type, "3.xml").checkEq(fights, "857.xml");
            itest("randoop", 252).given(trs, "895.xml").given(fighter, "821.xml").given(type, "57.xml").checkEq(fights, "822.xml");
            itest("randoop", 252).given(trs, "885.xml").given(fighter, "886.xml").given(type, "3.xml").checkEq(fights, "887.xml");
            itest("dev", 252).given(trs, "52.xml").given(fighter, "53.xml").given(type, "7.xml").checkEq(fights, "54.xml");
            itest("randoop", 252).given(trs, "959.xml").given(fighter, "815.xml").given(type, "57.xml").checkEq(fights, "816.xml");
            itest("randoop", 252).given(trs, "962.xml").given(fighter, "830.xml").given(type, "57.xml").checkEq(fights, "831.xml");
            itest("randoop", 252).given(trs, "801.xml").given(fighter, "802.xml").given(type, "3.xml").checkEq(fights, "803.xml");
            itest("randoop", 252).given(trs, "902.xml").given(fighter, "851.xml").given(type, "57.xml").checkEq(fights, "852.xml");
            itest("randoop", 252).given(trs, "970.xml").given(fighter, "864.xml").given(type, "57.xml").checkEq(fights, "865.xml");
            itest("randoop", 252).given(trs, "900.xml").given(fighter, "844.xml").given(type, "57.xml").checkEq(fights, "845.xml");
            itest("randoop", 252).given(trs, "908.xml").given(fighter, "878.xml").given(type, "3.xml").checkEq(fights, "879.xml");
            itest("dev", 252).given(trs, "91.xml").given(fighter, "33.xml").given(type, "3.xml").checkEq(fights, "92.xml");
            itest("randoop", 252).given(trs, "961.xml").given(fighter, "826.xml").given(type, "3.xml").checkEq(fights, "827.xml");
            itest("randoop", 252).given(trs, "939.xml").given(fighter, "826.xml").given(type, "3.xml").checkEq(fights, "827.xml");
            itest("randoop", 252).given(trs, "847.xml").given(fighter, "848.xml").given(type, "3.xml").checkEq(fights, "849.xml");
            itest("randoop", 252).given(trs, "909.xml").given(fighter, "882.xml").given(type, "57.xml").checkEq(fights, "883.xml");
            itest("randoop", 252).given(trs, "892.xml").given(fighter, "807.xml").given(type, "3.xml").checkEq(fights, "808.xml");
            itest("randoop", 252).given(trs, "936.xml").given(fighter, "812.xml").given(type, "3.xml").checkEq(fights, "813.xml");
            itest("dev", 252).given(trs, "26.xml").given(fighter, "27.xml").given(type, "3.xml").checkEq(fights, "28.xml");
            itest("randoop", 252).given(trs, "942.xml").given(fighter, "839.xml").given(type, "3.xml").checkEq(fights, "840.xml");
            itest("randoop", 252).given(trs, "960.xml").given(fighter, "821.xml").given(type, "57.xml").checkEq(fights, "822.xml");
            itest("randoop", 252).given(trs, "958.xml").given(fighter, "812.xml").given(type, "3.xml").checkEq(fights, "813.xml");
            itest("randoop", 252).given(trs, "916.xml").given(fighter, "815.xml").given(type, "57.xml").checkEq(fights, "816.xml");
            itest("randoop", 252).given(trs, "969.xml").given(fighter, "860.xml").given(type, "57.xml").checkEq(fights, "861.xml");
            itest("randoop", 252).given(trs, "918.xml").given(fighter, "826.xml").given(type, "3.xml").checkEq(fights, "827.xml");
            itest("dev", 252).given(trs, "102.xml").given(fighter, "103.xml").given(type, "3.xml").checkEq(fights, "104.xml");
            itest("randoop", 252).given(trs, "915.xml").given(fighter, "812.xml").given(type, "3.xml").checkEq(fights, "813.xml");
            itest("randoop", 252).given(trs, "921.xml").given(fighter, "839.xml").given(type, "3.xml").checkEq(fights, "840.xml");
            itest("randoop", 252).given(trs, "919.xml").given(fighter, "830.xml").given(type, "57.xml").checkEq(fights, "831.xml");
            itest("randoop", 252).given(trs, "930.xml").given(fighter, "878.xml").given(type, "3.xml").checkEq(fights, "879.xml");
            itest("dev", 252).given(trs, "96.xml").given(fighter, "97.xml").given(type, "3.xml").checkEq(fights, "98.xml");
            itest("randoop", 252).given(trs, "928.xml").given(fighter, "869.xml").given(type, "57.xml").checkEq(fights, "870.xml");
            itest("randoop", 252).given(trs, "890.xml").given(fighter, "798.xml").given(type, "57.xml").checkEq(fights, "799.xml");
            itest("randoop", 252).given(trs, "955.xml").given(fighter, "798.xml").given(type, "57.xml").checkEq(fights, "799.xml");
            itest("dev", 252).given(trs, "55.xml").given(fighter, "56.xml").given(type, "57.xml").checkEq(fights, "58.xml");
            itest("randoop", 252).given(trs, "825.xml").given(fighter, "826.xml").given(type, "3.xml").checkEq(fights, "827.xml");
            itest("randoop", 252).given(trs, "922.xml").given(fighter, "844.xml").given(type, "57.xml").checkEq(fights, "845.xml");
            itest("randoop", 252).given(trs, "926.xml").given(fighter, "860.xml").given(type, "57.xml").checkEq(fights, "861.xml");
            itest("randoop", 252).given(trs, "951.xml").given(fighter, "878.xml").given(type, "3.xml").checkEq(fights, "879.xml");
            itest("randoop", 252).given(trs, "894.xml").given(fighter, "815.xml").given(type, "57.xml").checkEq(fights, "816.xml");
            itest("randoop", 252).given(trs, "797.xml").given(fighter, "798.xml").given(type, "57.xml").checkEq(fights, "799.xml");
            itest("dev", 252).given(trs, "49.xml").given(fighter, "50.xml").given(type, "3.xml").checkEq(fights, "51.xml");
            itest("randoop", 252).given(trs, "947.xml").given(fighter, "860.xml").given(type, "57.xml").checkEq(fights, "861.xml");
            itest("randoop", 252).given(trs, "897.xml").given(fighter, "830.xml").given(type, "57.xml").checkEq(fights, "831.xml");
            itest("randoop", 252).given(trs, "971.xml").given(fighter, "869.xml").given(type, "57.xml").checkEq(fights, "870.xml");
            itest("randoop", 252).given(trs, "906.xml").given(fighter, "869.xml").given(type, "57.xml").checkEq(fights, "870.xml");
            itest("randoop", 252).given(trs, "933.xml").given(fighter, "798.xml").given(type, "57.xml").checkEq(fights, "799.xml");
            itest("randoop", 252).given(trs, "965.xml").given(fighter, "844.xml").given(type, "57.xml").checkEq(fights, "845.xml");
            itest("randoop", 252).given(trs, "912.xml").given(fighter, "798.xml").given(type, "57.xml").checkEq(fights, "799.xml");
            itest("randoop", 252).given(trs, "829.xml").given(fighter, "830.xml").given(type, "57.xml").checkEq(fights, "831.xml");
            itest("dev", 252).given(trs, "85.xml").given(fighter, "86.xml").given(type, "3.xml").checkEq(fights, "87.xml");
            itest("randoop", 252).given(trs, "953.xml").given(fighter, "886.xml").given(type, "3.xml").checkEq(fights, "887.xml");
            itest("randoop", 252).given(trs, "913.xml").given(fighter, "802.xml").given(type, "3.xml").checkEq(fights, "803.xml");
            itest("randoop", 252).given(trs, "872.xml").given(fighter, "873.xml").given(type, "3.xml").checkEq(fights, "874.xml");
            itest("dev", 252).given(trs, "12.xml").given(fighter, "13.xml").given(type, "3.xml").checkEq(fights, "14.xml");
            itest("randoop", 252).given(trs, "964.xml").given(fighter, "839.xml").given(type, "3.xml").checkEq(fights, "840.xml");
            itest("randoop", 252).given(trs, "904.xml").given(fighter, "860.xml").given(type, "57.xml").checkEq(fights, "861.xml");
            itest("randoop", 252).given(trs, "910.xml").given(fighter, "886.xml").given(type, "3.xml").checkEq(fights, "887.xml");
            itest("randoop", 252).given(trs, "877.xml").given(fighter, "878.xml").given(type, "3.xml").checkEq(fights, "879.xml");
            itest("randoop", 252).given(trs, "927.xml").given(fighter, "864.xml").given(type, "57.xml").checkEq(fights, "865.xml");
            itest("randoop", 252).given(trs, "820.xml").given(fighter, "821.xml").given(type, "57.xml").checkEq(fights, "822.xml");
            itest("randoop", 252).given(trs, "949.xml").given(fighter, "869.xml").given(type, "57.xml").checkEq(fights, "870.xml");
            itest("randoop", 252).given(trs, "937.xml").given(fighter, "815.xml").given(type, "57.xml").checkEq(fights, "816.xml");
            itest("randoop", 252).given(trs, "943.xml").given(fighter, "844.xml").given(type, "57.xml").checkEq(fights, "845.xml");
            itest("randoop", 252).given(trs, "945.xml").given(fighter, "851.xml").given(type, "57.xml").checkEq(fights, "852.xml");
            itest("randoop", 252).given(trs, "956.xml").given(fighter, "802.xml").given(type, "3.xml").checkEq(fights, "803.xml");
            itest("dev", 252).given(trs, "67.xml").given(fighter, "68.xml").given(type, "57.xml").checkEq(fights, "69.xml");
            itest("randoop", 252).given(trs, "859.xml").given(fighter, "860.xml").given(type, "57.xml").checkEq(fights, "861.xml");
            itest("randoop", 252).given(trs, "811.xml").given(fighter, "812.xml").given(type, "3.xml").checkEq(fights, "813.xml");
            itest("randoop", 252).given(trs, "968.xml").given(fighter, "856.xml").given(type, "3.xml").checkEq(fights, "857.xml");
            itest("randoop", 252).given(trs, "917.xml").given(fighter, "821.xml").given(type, "57.xml").checkEq(fights, "822.xml");
            itest("randoop", 252).given(trs, "903.xml").given(fighter, "856.xml").given(type, "3.xml").checkEq(fights, "857.xml");
            itest("dev", 252).given(trs, "18.xml").given(fighter, "19.xml").given(type, "3.xml").checkEq(fights, "20.xml");
            itest("dev", 252).given(trs, "74.xml").given(fighter, "75.xml").given(type, "3.xml").checkEq(fights, "76.xml");
            itest("randoop", 252).given(trs, "806.xml").given(fighter, "807.xml").given(type, "3.xml").checkEq(fights, "808.xml");
            itest("randoop", 252).given(trs, "843.xml").given(fighter, "844.xml").given(type, "57.xml").checkEq(fights, "845.xml");
            itest("randoop", 252).given(trs, "881.xml").given(fighter, "882.xml").given(type, "57.xml").checkEq(fights, "883.xml");
            itest("randoop", 252).given(trs, "814.xml").given(fighter, "815.xml").given(type, "57.xml").checkEq(fights, "816.xml");
            itest("randoop", 252).given(trs, "899.xml").given(fighter, "839.xml").given(type, "3.xml").checkEq(fights, "840.xml");
            itest("randoop", 252).given(trs, "898.xml").given(fighter, "834.xml").given(type, "3.xml").checkEq(fights, "835.xml");
            itest("randoop", 252).given(trs, "833.xml").given(fighter, "834.xml").given(type, "3.xml").checkEq(fights, "835.xml");
            itest("dev", 252).given(trs, "32.xml").given(fighter, "33.xml").given(type, "3.xml").checkEq(fights, "34.xml");
            itest("randoop", 252).given(trs, "940.xml").given(fighter, "830.xml").given(type, "57.xml").checkEq(fights, "831.xml");
            itest("dev", 252).given(trs, "1.xml").given(fighter, "2.xml").given(type, "3.xml").checkEq(fights, "4.xml");
            itest("randoop", 252).given(trs, "948.xml").given(fighter, "864.xml").given(type, "57.xml").checkEq(fights, "865.xml");
            itest("dev", 252).given(trs, "64.xml").given(fighter, "65.xml").given(type, "3.xml").checkEq(fights, "66.xml");
            itest("randoop", 252).given(trs, "924.xml").given(fighter, "851.xml").given(type, "57.xml").checkEq(fights, "852.xml");
            itest("dev", 252).given(trs, "43.xml").given(fighter, "44.xml").given(type, "3.xml").checkEq(fights, "45.xml");
            itest("dev", 252).given(trs, "77.xml").given(fighter, "78.xml").given(type, "57.xml").checkEq(fights, "79.xml");
            itest("randoop", 252).given(trs, "929.xml").given(fighter, "873.xml").given(type, "3.xml").checkEq(fights, "874.xml");
            itest("randoop", 252).given(trs, "914.xml").given(fighter, "807.xml").given(type, "3.xml").checkEq(fights, "808.xml");
            itest("randoop", 252).given(trs, "855.xml").given(fighter, "856.xml").given(type, "3.xml").checkEq(fights, "857.xml");
            itest("randoop", 252).given(trs, "891.xml").given(fighter, "802.xml").given(type, "3.xml").checkEq(fights, "803.xml");
            itest("randoop", 252).given(trs, "920.xml").given(fighter, "834.xml").given(type, "3.xml").checkEq(fights, "835.xml");
            itest("randoop", 252).given(trs, "938.xml").given(fighter, "821.xml").given(type, "57.xml").checkEq(fights, "822.xml");
            itest("randoop", 252).given(trs, "935.xml").given(fighter, "807.xml").given(type, "3.xml").checkEq(fights, "808.xml");
            itest("randoop", 252).given(trs, "925.xml").given(fighter, "856.xml").given(type, "3.xml").checkEq(fights, "857.xml");
            itest("randoop", 252).given(trs, "905.xml").given(fighter, "864.xml").given(type, "57.xml").checkEq(fights, "865.xml");
            itest("randoop", 252).given(trs, "963.xml").given(fighter, "834.xml").given(type, "3.xml").checkEq(fights, "835.xml");
            itest("randoop", 252).given(trs, "931.xml").given(fighter, "882.xml").given(type, "57.xml").checkEq(fights, "883.xml");
            itest("randoop", 252).given(trs, "923.xml").given(fighter, "848.xml").given(type, "3.xml").checkEq(fights, "849.xml");
            itest("randoop", 252).given(trs, "957.xml").given(fighter, "807.xml").given(type, "3.xml").checkEq(fights, "808.xml");
            itest("dev", 252).given(trs, "5.xml").given(fighter, "6.xml").given(type, "7.xml").checkEq(fights, "8.xml");
            itest("randoop", 252).given(trs, "952.xml").given(fighter, "882.xml").given(type, "57.xml").checkEq(fights, "883.xml");
            itest("randoop", 252).given(trs, "907.xml").given(fighter, "873.xml").given(type, "3.xml").checkEq(fights, "874.xml");
            itest("randoop", 252).given(trs, "941.xml").given(fighter, "834.xml").given(type, "3.xml").checkEq(fights, "835.xml");
            itest("randoop", 252).given(trs, "966.xml").given(fighter, "848.xml").given(type, "3.xml").checkEq(fights, "849.xml");
            itest("randoop", 252).given(trs, "901.xml").given(fighter, "848.xml").given(type, "3.xml").checkEq(fights, "849.xml");
            itest("randoop", 252).given(trs, "967.xml").given(fighter, "851.xml").given(type, "57.xml").checkEq(fights, "852.xml");
            itest("dev", 252).given(trs, "105.xml").given(fighter, "106.xml").given(type, "57.xml").checkEq(fights, "107.xml");
            itest("randoop", 252).given(trs, "944.xml").given(fighter, "848.xml").given(type, "3.xml").checkEq(fights, "849.xml");
            itest("randoop", 252).given(trs, "950.xml").given(fighter, "873.xml").given(type, "3.xml").checkEq(fights, "874.xml");
            itest("randoop", 252).given(trs, "868.xml").given(fighter, "869.xml").given(type, "57.xml").checkEq(fights, "870.xml");
            itest("randoop", 252).given(trs, "863.xml").given(fighter, "864.xml").given(type, "57.xml").checkEq(fights, "865.xml");
            fighter.getFights().addAll(fights);
        });
        List<Fight> sorted = fighter.getFights().stream().sorted(Comparator.comparing(Fight::getDate, Comparator.nullsFirst(Comparator.naturalOrder()))).collect(Collectors.toList());
        itest("randoop", 261).given(fighter, "224.xml").checkEq(sorted, "225.xml");
        itest("dev", 261).given(fighter, "46.xml").checkEq(sorted, "47.xml");
        itest("randoop", 261).given(fighter, "911.xml").checkEq(sorted, "225.xml");
        itest("dev", 261).given(fighter, "80.xml").checkEq(sorted, "81.xml");
        itest("dev", 261).given(fighter, "21.xml").checkEq(sorted, "22.xml");
        itest("randoop", 261).given(fighter, "836.xml").checkEq(sorted, "837.xml");
        itest("randoop", 261).given(fighter, "800.xml").checkEq(sorted, "799.xml");
        itest("dev", 261).given(fighter, "70.xml").checkEq(sorted, "71.xml");
        itest("dev", 261).given(fighter, "29.xml").checkEq(sorted, "30.xml");
        itest("randoop", 261).given(fighter, "817.xml").checkEq(sorted, "818.xml");
        itest("randoop", 261).given(fighter, "853.xml").checkEq(sorted, "854.xml");
        itest("randoop", 261).given(fighter, "875.xml").checkEq(sorted, "876.xml");
        itest("evosuite", 261).given(fighter, "224.xml").checkEq(sorted, "225.xml");
        itest("dev", 261).given(fighter, "59.xml").checkEq(sorted, "60.xml");
        itest("randoop", 261).given(fighter, "832.xml").checkEq(sorted, "831.xml");
        itest("dev", 261).given(fighter, "93.xml").checkEq(sorted, "94.xml");
        itest("dev", 261).given(fighter, "88.xml").checkEq(sorted, "89.xml");
        itest("randoop", 261).given(fighter, "858.xml").checkEq(sorted, "857.xml");
        itest("randoop", 261).given(fighter, "888.xml").checkEq(sorted, "889.xml");
        itest("dev", 261).given(fighter, "108.xml").checkEq(sorted, "109.xml");
        itest("dev", 261).given(fighter, "9.xml").checkEq(sorted, "10.xml");
        itest("randoop", 261).given(fighter, "884.xml").checkEq(sorted, "883.xml");
        itest("randoop", 261).given(fighter, "880.xml").checkEq(sorted, "879.xml");
        itest("randoop", 261).given(fighter, "866.xml").checkEq(sorted, "867.xml");
        itest("randoop", 261).given(fighter, "862.xml").checkEq(sorted, "861.xml");
        itest("dev", 261).given(fighter, "15.xml").checkEq(sorted, "16.xml");
        itest("randoop", 261).given(fighter, "841.xml").checkEq(sorted, "842.xml");
        itest("randoop", 261).given(fighter, "819.xml").checkEq(sorted, "225.xml");
        itest("randoop", 261).given(fighter, "809.xml").checkEq(sorted, "810.xml");
        itest("dev", 261).given(fighter, "99.xml").checkEq(sorted, "100.xml");
        itest("randoop", 261).given(fighter, "828.xml").checkEq(sorted, "827.xml");
        itest("randoop", 261).given(fighter, "804.xml").checkEq(sorted, "805.xml");
        itest("randoop", 261).given(fighter, "359.xml").checkEq(sorted, "225.xml");
        itest("evosuite", 261).given(fighter, "359.xml").checkEq(sorted, "225.xml");
        itest("randoop", 261).given(fighter, "823.xml").checkEq(sorted, "824.xml");
        itest("dev", 261).given(fighter, "35.xml").checkEq(sorted, "36.xml");
        itest("randoop", 261).given(fighter, "846.xml").checkEq(sorted, "845.xml");
        itest("randoop", 261).given(fighter, "871.xml").checkEq(sorted, "870.xml");
        fighter.setFights(sorted);
        logger.info("Found {} fights for {}", fighter.getFights().size(), fighter.getName());
        // setting the picture last to make sure the fighter variable has all the data
        if (pictureUrl.length() > 0) {
            fighter.setPicture(PROCESSOR.process(pictureUrl, fighter));
        }
        return fighter;
    }

    /**
     * Get a fighter fights
     *
     * @param trs     JSOUP TRs document
     * @param fighter a fighter to parse against
     */
    private List<Fight> getFights(Elements trs, Fighter fighter) throws ArrayIndexOutOfBoundsException {
        List<Fight> fights = new ArrayList<>();
        logger.info("{} TRs to parse through", trs.size());
        SherdogBaseObject sFighter = new SherdogBaseObject();
        sFighter.setName(fighter.getName());
        sFighter.setSherdogUrl(fighter.getSherdogUrl());
        // removing header row...
        if (trs.size() > 0) {
            trs.remove(0);
            trs.forEach(tr -> {
                Fight fight = new Fight();
                fight.setFighter1(sFighter);
                Elements tds = tr.select("td");
                fight.setResult(getFightResult(tds.get(COLUMN_RESULT)));
                fight.setFighter2(getOpponent(tds.get(COLUMN_OPPONENT)));
                fight.setEvent(getEvent(tds.get(COLUMN_EVENT)));
                fight.setDate(getDate(tds.get(COLUMN_EVENT)));
                fight.setWinMethod(getWinMethod(tds.get(COLUMN_METHOD)).replaceAll("</?b>", ""));
                fight.setWinRound(getWinRound(tds.get(COLUMN_ROUND)));
                fight.setWinTime(getWinTime(tds.get(COLUMN_TIME)));
                fights.add(fight);
                logger.info("{}", fight);
            });
        }
        return fights;
    }

    /**
     * Get the fight result
     *
     * @param td a td from sherdogs table
     * @return a fight result enum
     */
    private FightResult getFightResult(Element td) {
        return ParserUtils.getFightResult(td);
    }

    /**
     * Get the fight result
     *
     * @param td a td from sherdogs table
     * @return a fight result enum
     */
    private SherdogBaseObject getOpponent(Element td) {
        SherdogBaseObject opponent = new SherdogBaseObject();
        Element opponentLink = td.select("a").get(0);
        opponent.setName(opponentLink.html());
        opponent.setSherdogUrl(opponentLink.attr("abs:href"));
        return opponent;
    }

    /**
     * Get the fight event
     *
     * @param td a td from sherdogs table
     * @return a sherdog base object with url and name
     */
    private SherdogBaseObject getEvent(Element td) {
        Element link = td.select("a").get(0);
        SherdogBaseObject event = new SherdogBaseObject();
        event.setName(link.html().replaceAll("<span itemprop=\"award\">|</span>", ""));
        event.setSherdogUrl(link.attr("abs:href"));
        return event;
    }

    /**
     * Get the date of the fight
     *
     * @param td a td from sherdogs table
     * @return the zonedatetime of the fight
     */
    private ZonedDateTime getDate(Element td) {
        // date
        Element date = td.select("span.sub_line").first();
        return getDateFromStringToZoneId(date.html(), ZONE_ID, DateTimeFormatter.ofPattern("MMM / dd / yyyy", Locale.US));
    }

    /**
     * Get the winning method
     *
     * @param td a td from sherdogs table
     * @return a string with the finishing method
     */
    private String getWinMethod(Element td) {
        return td.html().replaceAll("<br>(.*)", "");
    }

    /**
     * Get the winning round
     *
     * @param td a td from sherdogs table
     * @return an itneger
     */
    private int getWinRound(Element td) {
        return Integer.parseInt(td.html());
    }

    /**
     * Get time of win
     *
     * @param td a td from sherdogs table
     * @return the time of win
     */
    private String getWinTime(Element td) {
        return td.html();
    }

    /**
     * Hashes a string
     *
     * @param s the string to hash
     * @return the hashed string
     */
    private String hash(String s) {
        return DigestUtils.sha256Hex(s);
    }
}
