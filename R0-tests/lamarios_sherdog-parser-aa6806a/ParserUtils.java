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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 185).given(doc, "418.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "0.xml").checkEq(url, "//www.sherdog.com/fighter/Brandon-Moreno-80173");
        new Here("Randoop", 185).given(doc, "413.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "403.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "368.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "245.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "471.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "468.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "433.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "443.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "506.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "445.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "407.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "371.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "91.xml").checkEq(url, "//www.sherdog.com/events/Invicta-FC-2-Baszler-vs-McMann-22035");
        new Here("Randoop", 185).given(doc, "485.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Unit", 185).given(doc, "12.xml").checkEq(url, "//www.sherdog.com/fighter/Matt-Baker-49956");
        new Here("Randoop", 185).given(doc, "455.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "379.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "246.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "472.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "382.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "240.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "361.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "493.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "484.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "511.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "446.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "123.xml").checkEq(url, "//www.sherdog.com/events/DNRF-Ukrainian-Octagon-2-16471");
        new Here("Randoop", 185).given(doc, "252.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Unit", 185).given(doc, "19.xml").checkEq(url, "//www.sherdog.com/fighter/Mark-Hunt-10668");
        new Here("Randoop", 185).given(doc, "242.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "370.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "364.xml").checkEq(url, "//www.sherdog.com/organizations/Invicta-Fighting-Championships-4469");
        new Here("Randoop", 185).given(doc, "481.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "460.xml").checkEq(url, "//www.sherdog.com/organizations/Bellator-MMA-1960");
        new Here("Randoop", 185).given(doc, "454.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "504.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "392.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "376.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "409.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "43.xml").checkEq(url, "//www.sherdog.com/events/UFC-Fight-Night-115-Volkov-vs-Struve-58751");
        new Here("Randoop", 185).given(doc, "513.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "480.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "435.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "377.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "247.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "35.xml").checkEq(url, "//www.sherdog.com/fighter/Kevin-Randleman-162");
        new Here("Randoop", 185).given(doc, "411.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "486.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "93.xml").checkEq(url, "//www.sherdog.com/fighter/Alexis-Davis-22071");
        new Here("Randoop", 185).given(doc, "384.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "239.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "420.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "393.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "81.xml").checkEq(url, "//www.sherdog.com/fighter/Shane-Cadotte-41891");
        new Here("Randoop", 185).given(doc, "243.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "495.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "248.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "387.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "237.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "437.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "452.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "404.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Unit", 185).given(doc, "42.xml").checkEq(url, "//www.sherdog.com/events/UFC-1-The-Beginning-7");
        new Here("Randoop", 185).given(doc, "490.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "70.xml").checkEq(url, "//www.sherdog.com/fighter/Kevin-Messer-55425");
        new Here("Randoop", 185).given(doc, "440.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "390.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "238.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "449.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "444.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "402.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "398.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "124.xml").checkEq(url, "//www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2");
        new Here("Unit", 185).given(doc, "68.xml").checkEq(url, "//www.sherdog.com/events/KOTC-Trump-Card-19961");
        new Here("Randoop", 185).given(doc, "414.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "430.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "451.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "27.xml").checkEq(url, "//www.sherdog.com/events/UFC-Fight-Night-33-Hunt-vs-Bigfoot-32293");
        new Here("Randoop", 185).given(doc, "459.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "488.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "492.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "474.xml").checkEq(url, "//www.sherdog.com/organizations/Bellator-MMA-1960");
        new Here("Unit", 185).given(doc, "100.xml").checkEq(url, "//www.sherdog.com/fighter/Kevin-Randleman-162");
        new Here("Unit", 185).given(doc, "106.xml").checkEq(url, "//www.sherdog.com/fighter/Anderson-Silva-1356");
        new Here("Randoop", 185).given(doc, "470.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "400.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "254.xml").checkEq(url, "//www.sherdog.com/organizations/Bellator-MMA-1960");
        new Here("Unit", 185).given(doc, "28.xml").checkEq(url, "//www.sherdog.com/fighter/Johil-de-Oliveira-6");
        new Here("Randoop", 185).given(doc, "431.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "416.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "439.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "381.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "422.xml").checkEq(url, "//www.sherdog.com/organizations/Bellator-MMA-1960");
        new Here("Randoop", 185).given(doc, "374.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "508.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "26.xml").checkEq(url, "//www.sherdog.com/events/WSOF-18-Moraes-vs-Hill-43147");
        new Here("Randoop", 185).given(doc, "394.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "466.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "442.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "235.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "54.xml").checkEq(url, "//www.sherdog.com/fighter/Rose-Namajunas-69083");
        new Here("Randoop", 185).given(doc, "395.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "447.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "396.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "47.xml").checkEq(url, "//www.sherdog.com/fighter/Rustam-Khabilov-45417");
        new Here("Randoop", 185).given(doc, "373.xml").checkEq(url, "");
        new Here("Unit", 185).given(doc, "113.xml").checkEq(url, "//www.sherdog.com/fighter/Yushin-Okami-5569");
        new Here("Randoop", 185).given(doc, "388.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "380.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "244.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "509.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "428.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "241.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "363.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "406.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "253.xml").checkEq(url, "//www.sherdog.com/");
        new Here("Randoop", 185).given(doc, "483.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "497.xml").checkEq(url, "//www.sherdog.com/organizations/Invicta-Fighting-Championships-4469");
        new Here("Randoop", 185).given(doc, "457.xml").checkEq(url, "");
        new Here("Randoop", 185).given(doc, "501.xml").checkEq(url, "");
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
