package com.ftpix.sherdogparser.parsers;

import com.ftpix.sherdogparser.Constants;
import com.ftpix.sherdogparser.Sherdog;
import com.ftpix.sherdogparser.models.*;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Created by gz on 20-Aug-16.
 * tools to help during parsing
 */
public class ParserUtils {

    /**
     * Gets the result of a fight following sherdog website win/lose/draw/nc
     * Make sure to use on Fighter1 only
     *
     * @param element Jsoup element
     * @return a FightResult
     */
    static FightResult getFightResult(Element element) {
        if (element.select(".win").size() > 0) {
            return FightResult.FIGHTER_1_WIN;
        } else if (element.select(".loss").size() > 0) {
            return FightResult.FIGHTER_2_WIN;
        } else if (element.select(".draw").size() > 0) {
            return FightResult.DRAW;
        } else if (element.select(".no_contest").size() > 0) {
            return FightResult.NO_CONTEST;
        } else {
            return FightResult.NOT_HAPPENED;
        }
    }

    /**
     * PArses a URL with all the required parameters
     *
     * @param url of the document to parse
     * @return the jsoup document
     * @throws IOException if the connection fails
     */
    public static Document parseDocument(String url) throws IOException {
        return Jsoup.connect(url).timeout(Constants.PARSING_TIMEOUT).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").referrer("http://www.google.com").get();
    }

    /**
     * Converts a String to the given timezone.
     *
     * @param date   Date to format
     * @param zoneId Zone id to convert from sherdog's time
     * @return the  converted zonedatetime
     */
    static ZonedDateTime getDateFromStringToZoneId(String date, ZoneId zoneId) throws DateTimeParseException {
        ZonedDateTime usDate = ZonedDateTime.parse(date).withZoneSameInstant(ZoneId.of(Constants.SHERDOG_TIME_ZONE));
        return usDate.withZoneSameInstant(zoneId);
    }

    /**
     * Converts a String to the given timezone.
     *
     * @param date      Date to format
     * @param zoneId    Zone id to convert from sherdog's time
     * @param formatter Formatter for exotic date format
     * @return the converted zonedatetime
     */
    static ZonedDateTime getDateFromStringToZoneId(String date, ZoneId zoneId, DateTimeFormatter formatter) throws DateTimeParseException {
        try {
            // noticed that date not parsed with non-US locale. For me this fix is helpful
            LocalDate localDate = LocalDate.parse(date, formatter);
            ZonedDateTime usDate = localDate.atStartOfDay(zoneId);
            return usDate.withZoneSameInstant(zoneId);
        } catch (Exception e) {
            // In case the parsing fail, we try without time
            try {
                ZonedDateTime usDate = LocalDate.parse(date, formatter).atStartOfDay(ZoneId.of(Constants.SHERDOG_TIME_ZONE));
                return usDate.withZoneSameInstant(zoneId);
            } catch (DateTimeParseException e2) {
                return null;
            }
        }
    }

    /**
     * Downloads an image to a file with the adequate headers to the http query
     *
     * @param url  the url of the image
     * @param file the file to create
     * @throws IOException if the file download fails
     */
    public static void downloadImageToFile(String url, Path file) throws IOException {
        if (Files.exists(file.getParent())) {
            URL urlObject = new URL(url);
            URLConnection connection = urlObject.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6");
            connection.setRequestProperty("Referer", "http://www.google.com");
            FileUtils.copyInputStreamToFile(connection.getInputStream(), file.toFile());
        }
    }

    /**
     * Gets the type of a fight (Pro, amateur etc...)
     *
     * @param parser the sherdsog parser, required as we need to use the parser to get info on the fighter
     * @param fight  the fight to check
     * @return the type of the fight
     */
    public static FightType getFightType(Sherdog parser, Fight fight) {
        // getting one of the fighter, and parsing his/her fights to find this fight
        BiFunction<SherdogBaseObject, SherdogBaseObject, FightType> getType = (f1, f2) -> {
            try {
                Fighter fighter = parser.getFighter(f1.getSherdogUrl());
                return fighter.getFights().stream().filter(f -> f.getResult() != FightResult.NOT_HAPPENED).filter(f -> f.getFighter2() != null).filter(f -> f.getFighter2().getSherdogUrl().equalsIgnoreCase(f2.getSherdogUrl()) && f.getEvent().getSherdogUrl().equalsIgnoreCase(fight.getEvent().getSherdogUrl())).findFirst().map(Fight::getType).orElse(// if we don't know, assume pro
                FightType.PRO);
            } catch (Exception e) {
                e.printStackTrace();
                // if we dont know assume pro
                return FightType.PRO;
            }
        };
        itest("dev", 142).given(parser, "39.xml").given(fight, "72.xml").checkEq(getType, "41.xml");
        itest("randoop", 142).given(parser, "513.xml").given(fight, null).checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "360.xml").checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "362.xml").checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "335.xml").checkEq(getType, "41.xml");
        itest("dev", 142).given(parser, "39.xml").given(fight, "62.xml").checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "370.xml").checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "271.xml").checkEq(getType, "41.xml");
        itest("randoop", 142).given(parser, "793.xml").given(fight, null).checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, null).checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "227.xml").checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "364.xml").checkEq(getType, "41.xml");
        itest("randoop", 142).given(parser, null).given(fight, null).checkEq(getType, "41.xml");
        itest("dev", 142).given(parser, "39.xml").given(fight, "40.xml").checkEq(getType, "41.xml");
        itest("randoop", 142).given(parser, "550.xml").given(fight, null).checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "356.xml").checkEq(getType, "41.xml");
        itest("dev", 142).given(parser, "39.xml").given(fight, "83.xml").checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "354.xml").checkEq(getType, "41.xml");
        itest("evosuite", 142).given(parser, "226.xml").given(fight, "353.xml").checkEq(getType, "41.xml");
        if (fight.getResult() == FightResult.NOT_HAPPENED) {
            return FightType.UPCOMING;
        }
        Optional<SherdogBaseObject> fighter = Optional.of(fight).map(Fight::getFighter1).filter(f -> f.getSherdogUrl() != null && f.getSherdogUrl().length() > 0);
        if (fighter.isPresent()) {
            return getType.apply(fighter.get(), fight.getFighter2());
        } else {
            return getType.apply(fight.getFighter2(), fight.getFighter1());
        }
    }

    /**
     * Gets the url of a page using the meta tags in head
     *
     * @param doc the jsoup document to extract the page url from
     * @return the url of the document
     */
    static String getSherdogPageUrl(Document doc) {
        String url = Optional.ofNullable(doc.head()).map(h -> h.select("meta")).map(es -> es.stream().filter(e -> e.attr("property").equalsIgnoreCase("og:url")).findFirst().orElse(null)).map(m -> m.attr("content")).orElse("");
        itest("randoop", 185).given(doc, "586.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "608.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "514.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "708.xml").checkEq(url, "//www.sherdog.com/");
        itest("evosuite", 185).given(doc, "355.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "23.xml").checkEq(url, "//www.sherdog.com/events/WSOF-18-Moraes-vs-Hill-43147");
        itest("randoop", 185).given(doc, "632.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "567.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "729.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "700.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "390.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "696.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "651.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "585.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "718.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("evosuite", 185).given(doc, "381.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "499.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("evosuite", 185).given(doc, "361.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "573.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "365.xml").checkEq(url, "//www.sherdog.com/organizations/Invicta-Fighting-Championships-4469");
        itest("randoop", 185).given(doc, "715.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "558.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "498.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "382.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "528.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "722.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "560.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("evosuite", 185).given(doc, "377.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "42.xml").checkEq(url, "//www.sherdog.com/fighter/Rustam-Khabilov-45417");
        itest("randoop", 185).given(doc, "701.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "650.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "228.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "559.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "674.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "629.xml").checkEq(url, "//www.sherdog.com/");
        itest("dev", 185).given(doc, "110.xml").checkEq(url, "//www.sherdog.com/events/DNRF-Ukrainian-Octagon-2-16471");
        itest("randoop", 185).given(doc, "639.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "657.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "534.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "725.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("dev", 185).given(doc, "38.xml").checkEq(url, "//www.sherdog.com/events/UFC-Fight-Night-115-Volkov-vs-Struve-58751");
        itest("randoop", 185).given(doc, "714.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "111.xml").checkEq(url, "//www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2");
        itest("dev", 185).given(doc, "11.xml").checkEq(url, "//www.sherdog.com/fighter/Matt-Baker-49956");
        itest("randoop", 185).given(doc, "695.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "526.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "712.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "666.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "694.xml").checkEq(url, "//www.sherdog.com/");
        itest("evosuite", 185).given(doc, "369.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "336.xml").checkEq(url, "//www.sherdog.com/");
        itest("dev", 185).given(doc, "95.xml").checkEq(url, "//www.sherdog.com/fighter/Anderson-Silva-1356");
        itest("evosuite", 185).given(doc, "372.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "505.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "507.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "566.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("evosuite", 185).given(doc, "387.xml").checkEq(url, "//www.sherdog.com/");
        itest("dev", 185).given(doc, "0.xml").checkEq(url, "//www.sherdog.com/fighter/Brandon-Moreno-80173");
        itest("dev", 185).given(doc, "101.xml").checkEq(url, "//www.sherdog.com/fighter/Yushin-Okami-5569");
        itest("randoop", 185).given(doc, "592.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "389.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "527.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "363.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "688.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "631.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "638.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "371.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "337.xml").checkEq(url, "//www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2");
        itest("randoop", 185).given(doc, "724.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "658.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "681.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "82.xml").checkEq(url, "//www.sherdog.com/events/Invicta-FC-2-Baszler-vs-McMann-22035");
        itest("randoop", 185).given(doc, "705.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "643.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "48.xml").checkEq(url, "//www.sherdog.com/fighter/Rose-Namajunas-69083");
        itest("randoop", 185).given(doc, "628.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "31.xml").checkEq(url, "//www.sherdog.com/fighter/Kevin-Randleman-162");
        itest("evosuite", 185).given(doc, "374.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "728.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "25.xml").checkEq(url, "//www.sherdog.com/fighter/Johil-de-Oliveira-6");
        itest("randoop", 185).given(doc, "691.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "605.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "659.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "599.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "702.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "535.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "704.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "24.xml").checkEq(url, "//www.sherdog.com/events/UFC-Fight-Night-33-Hunt-vs-Bigfoot-32293");
        itest("dev", 185).given(doc, "17.xml").checkEq(url, "//www.sherdog.com/fighter/Mark-Hunt-10668");
        itest("randoop", 185).given(doc, "675.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "576.xml").checkEq(url, "//www.sherdog.com/");
        itest("evosuite", 185).given(doc, "386.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "520.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "690.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "584.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "542.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "73.xml").checkEq(url, "//www.sherdog.com/fighter/Shane-Cadotte-41891");
        itest("randoop", 185).given(doc, "640.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "622.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("dev", 185).given(doc, "90.xml").checkEq(url, "//www.sherdog.com/fighter/Kevin-Randleman-162");
        itest("randoop", 185).given(doc, "577.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "606.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "551.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("dev", 185).given(doc, "84.xml").checkEq(url, "//www.sherdog.com/fighter/Alexis-Davis-22071");
        itest("evosuite", 185).given(doc, "272.xml").checkEq(url, "//www.sherdog.com/organizations/Invicta-Fighting-Championships-4469");
        itest("dev", 185).given(doc, "63.xml").checkEq(url, "//www.sherdog.com/fighter/Kevin-Messer-55425");
        itest("randoop", 185).given(doc, "630.xml").checkEq(url, "//www.sherdog.com/");
        itest("evosuite", 185).given(doc, "385.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "230.xml").checkEq(url, "//www.sherdog.com/organizations/World-Series-of-Fighting-5449");
        itest("randoop", 185).given(doc, "699.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "373.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "717.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "689.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "707.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "388.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "620.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "709.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "541.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "644.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("evosuite", 185).given(doc, "357.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "383.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "607.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "376.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "665.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "721.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "682.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("evosuite", 185).given(doc, "384.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "358.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "549.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "668.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("dev", 185).given(doc, "37.xml").checkEq(url, "//www.sherdog.com/events/UFC-1-The-Beginning-7");
        itest("randoop", 185).given(doc, "575.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "223.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "506.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "598.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "711.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "642.xml").checkEq(url, "");
        itest("dev", 185).given(doc, "61.xml").checkEq(url, "//www.sherdog.com/events/KOTC-Trump-Card-19961");
        itest("evosuite", 185).given(doc, "375.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "727.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "667.xml").checkEq(url, "");
        itest("evosuite", 185).given(doc, "229.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "641.xml").checkEq(url, "//www.sherdog.com/");
        itest("randoop", 185).given(doc, "543.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "583.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "720.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "697.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "614.xml").checkEq(url, "//www.sherdog.com/organizations/ONE-Championship-3877");
        itest("randoop", 185).given(doc, "557.xml").checkEq(url, "");
        itest("randoop", 185).given(doc, "574.xml").checkEq(url, "");
        if (url.startsWith("//")) {
            // 2018-10-10 bug in sherdog  where ig:url starts with //?
            url = url.replaceFirst("//", "http://");
        }
        return url.replace("http://", "https://");
    }

    static String getText(Element doc, String cssSelector) {
        Elements e = doc.select(cssSelector);
        return e.get(0).html();
    }

    static int getInt(Element doc, String cssSelector) {
        return Integer.parseInt(getText(doc, cssSelector));
    }
}
