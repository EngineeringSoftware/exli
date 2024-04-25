package com.ftpix.sherdogparser.parsers;

import com.ftpix.sherdogparser.models.Event;
import com.ftpix.sherdogparser.models.Organization;
import com.ftpix.sherdogparser.models.SherdogBaseObject;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Created by gz on 20-Aug-16.
 * PArser to parse an organization
 */
public class OrganizationParser implements SherdogParser<Organization> {

    private final Logger logger = LoggerFactory.getLogger(OrganizationParser.class);

    private final int DATE_COLUMN = 0, NAME_COLUMN = 1, LOCATION_COLUMN = 2;

    private final ZoneId ZONE_ID;

    /**
     * Creates an organization parser with the default zone id
     */
    public OrganizationParser() {
        ZONE_ID = ZoneId.systemDefault();
    }

    /**
     * Create a parser with a specified zoneid
     * @param zoneId  specified zone id for time conversion
     */
    public OrganizationParser(ZoneId zoneId) {
        this.ZONE_ID = zoneId;
    }

    /**
     * Parse a sherdog page
     *
     * @param doc Jsoup document of the sherdog page
     * @throws IOException    if connecting to sherdog fails
     * @throws ParseException if the page structure has changed
     */
    public Organization parseDocument(Document doc) throws IOException, ParseException {
        Organization organization = new Organization();
        organization.setSherdogUrl(ParserUtils.getSherdogPageUrl(doc));
        String url = organization.getSherdogUrl();
        url += "/recent-events/%d";
        int page = 1;
        doc = ParserUtils.parseDocument(String.format(url, page));
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "786.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "782.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "775.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "771.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "716.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "764.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "723.xml");
        itest("evosuite", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/Invicta-Fighting-Championships-4469/recent-events/%d").checkEq(doc, "273.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "753.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "587.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "568.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "760.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "734.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "742.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "741.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "600.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "739.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "738.xml");
        itest("evosuite", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/World-Series-of-Fighting-5449/recent-events/%d").checkEq(doc, "231.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "757.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "756.xml");
        itest("evosuite", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "338.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "778.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "779.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/Invicta-Fighting-Championships-4469/recent-events/%d").checkEq(doc, "766.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "669.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "536.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "774.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "772.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "770.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "763.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "761.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "735.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "733.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "726.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "578.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "731.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "730.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "765.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "768.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "767.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "544.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "633.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "769.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "676.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "391.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "515.xml");
        itest("evosuite", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/Invicta-Fighting-Championships-4469/recent-events/%d").checkEq(doc, "366.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "795.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "660.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "508.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "500.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "703.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "791.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "784.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "710.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "773.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "762.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "780.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "732.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "736.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "740.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "737.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "609.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "755.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "754.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "552.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "759.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "758.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "623.xml");
        itest("dev", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "112.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "776.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "777.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "683.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "645.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "796.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "652.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/Invicta-Fighting-Championships-4469/recent-events/%d").checkEq(doc, "751.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "785.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "794.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "790.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "529.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "783.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "792.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "713.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "719.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "781.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "706.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "593.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "752.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "750.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "746.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "745.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "744.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "743.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "749.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "747.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "748.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "615.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "698.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "561.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "692.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "787.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "788.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "789.xml");
        itest("randoop", 63).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "521.xml");
        logger.info("Getting name");
        Elements name = doc.select("section[itemtype=\"http://schema.org/Organization\"] div[itemprop=\"name\"]");
        organization.setName(name.html());
        logger.info("Getting upcoming event");
        Elements upcomingEventsElement = doc.select("#upcoming_tab .event tr");
        organization.getEvents().addAll(parseEvent(upcomingEventsElement, organization));
        logger.info("Getting past events");
        List<Event> toAdd;
        do {
            logger.info("Parsing page [{}]", page);
            doc = ParserUtils.parseDocument(String.format(url, page));
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "571.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "677.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "603.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "564.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "684.xml");
            itest("dev", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "216.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "553.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "649.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "494.xml");
            itest("evosuite", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "344.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "636.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "656.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "618.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "595.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "579.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "594.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "627.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "635.xml");
            itest("evosuite", 79).given(page, 5).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "348.xml");
            itest("dev", 79).given(page, 8).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "221.xml");
            itest("evosuite", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/World-Series-of-Fighting-5449/recent-events/%d").checkEq(doc, "232.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "495.xml");
            itest("evosuite", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "347.xml");
            itest("dev", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "132.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "540.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "525.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "648.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "617.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "580.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "590.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "671.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "539.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "548.xml");
            itest("dev", 79).given(page, 7).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "220.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "678.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "661.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "565.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "670.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "554.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "530.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "545.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "401.xml");
            itest("evosuite", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/World-Series-of-Fighting-5449/recent-events/%d").checkEq(doc, "270.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "509.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "626.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "596.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "504.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "637.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "611.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "602.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "589.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "655.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "664.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "647.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "524.xml");
            itest("evosuite", 79).given(page, 7).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "350.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "533.xml");
            itest("evosuite", 79).given(page, 9).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "352.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "517.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "501.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "510.xml");
            itest("evosuite", 79).given(page, 8).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "351.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "634.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "572.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "685.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "546.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "537.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "522.xml");
            itest("evosuite", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/Invicta-Fighting-Championships-4469/recent-events/%d").checkEq(doc, "368.xml");
            itest("evosuite", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/Invicta-Fighting-Championships-4469/recent-events/%d").checkEq(doc, "367.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "597.xml");
            itest("dev", 79).given(page, 5).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "218.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "562.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "512.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "612.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "673.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "511.xml");
            itest("dev", 79).given(page, 9).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "222.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "518.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "601.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "588.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "502.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "624.xml");
            itest("evosuite", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "346.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "663.xml");
            itest("evosuite", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "345.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "686.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "646.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "532.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "654.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "555.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "582.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "523.xml");
            itest("evosuite", 79).given(page, 6).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "349.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "619.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "613.xml");
            itest("dev", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "215.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "538.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "516.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "604.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "563.xml");
            itest("dev", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "217.xml");
            itest("dev", 79).given(page, 6).given(url, "https://www.sherdog.com/organizations/Ultimate-Fighting-Championship-UFC-2/recent-events/%d").checkEq(doc, "219.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "569.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "496.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "616.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "680.xml");
            itest("evosuite", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/Invicta-Fighting-Championships-4469/recent-events/%d").checkEq(doc, "274.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "610.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "519.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "687.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "625.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "503.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "672.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "662.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "547.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "570.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "693.xml");
            itest("evosuite", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/Invicta-Fighting-Championships-4469/recent-events/%d").checkEq(doc, "334.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "581.xml");
            itest("randoop", 79).given(page, 2).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "531.xml");
            itest("randoop", 79).given(page, 1).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "653.xml");
            itest("randoop", 79).given(page, 3).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "679.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "556.xml");
            itest("randoop", 79).given(page, 4).given(url, "https://www.sherdog.com/organizations/ONE-Championship-3877/recent-events/%d").checkEq(doc, "591.xml");
            Elements events = doc.select("#recent_tab .event tr");
            toAdd = parseEvent(events, organization);
            organization.getEvents().addAll(toAdd);
            page++;
        } while (toAdd.size() > 0);
        organization.getEvents().sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
        return organization;
    }

    /**
     * Get all the events of an organization
     *
     * @param trs the JSOUP TR elements from the event table
     * @return a list of events
     * @throws ParseException if something is wrong with sherdog layout
     */
    private List<Event> parseEvent(Elements trs, Organization organization) throws ParseException {
        List<Event> events = new ArrayList<>();
        if (trs.size() > 0) {
            trs.remove(0);
            SherdogBaseObject sOrg = new SherdogBaseObject();
            sOrg.setName(organization.getName());
            sOrg.setSherdogUrl(organization.getSherdogUrl());
            trs.forEach(tr -> {
                Event event = new Event();
                boolean addEvent = true;
                Elements tds = tr.select("td");
                event.setOrganization(sOrg);
                event.setName(getEventName(tds.get(NAME_COLUMN)));
                event.setSherdogUrl(getEventUrl(tds.get(NAME_COLUMN)));
                event.setLocation(getElementLocation(tds.get(LOCATION_COLUMN)));
                try {
                    event.setDate(getEventDate(tds.get(DATE_COLUMN)));
                } catch (DateTimeParseException e) {
                    logger.error("Couldn't fornat date, we shouldn't add the event", e);
                    addEvent = false;
                }
                if (addEvent) {
                    events.add(event);
                }
            });
        }
        return events;
    }

    private String getElementLocation(Element td) {
        String[] split = td.html().split(">");
        itest("randoop", 144).given(td, "431.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "122.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " KFC Yum! Center, Louisville, Kentucky, United States" });
        itest("evosuite", 144).given(td, "290.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Police Athletic League, Kansas City, Kansas, United States" });
        itest("randoop", 144).given(td, "417.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "119.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("dev", 144).given(td, "162.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("dev", 144).given(td, "128.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/au.gif\" width=\"16\" height=\"11\" alt=\"country\"", " RAC Arena, Perth, Western Australia, Australia" });
        itest("randoop", 144).given(td, "471.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "444.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "180.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "307.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("evosuite", 144).given(td, "279.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " ReelWorks Denver, Denver, Colorado, United States" });
        itest("evosuite", 144).given(td, "243.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Comerica Theatre, Phoenix, Arizona, United States" });
        itest("randoop", 144).given(td, "457.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "212.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Vivint Arena, Salt Lake City, Utah, United States" });
        itest("dev", 144).given(td, "185.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Center, Kansas City, Missouri, United States" });
        itest("dev", 144).given(td, "172.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Vystar Veterans Memorial Arena, Jacksonville, Florida, United States" });
        itest("dev", 144).given(td, "207.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "121.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Prudential Center, Newark, New Jersey, United States" });
        itest("dev", 144).given(td, "154.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "115.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Enterprise Center, St. Louis, Missouri, United States" });
        itest("randoop", 144).given(td, "405.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "292.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("dev", 144).given(td, "120.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("evosuite", 144).given(td, "234.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Theater at Madison Square Garden, New York City, New York, United States" });
        itest("dev", 144).given(td, "194.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "282.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "280.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Sugar Creek Casino, Hinton, Oklahoma, United States" });
        itest("randoop", 144).given(td, "456.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "245.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Comerica Theatre, Phoenix, Arizona, United States" });
        itest("dev", 144).given(td, "201.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Madison Square Garden, New York, New York, United States" });
        itest("dev", 144).given(td, "126.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "118.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("randoop", 144).given(td, "470.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "312.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("randoop", 144).given(td, "455.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "251.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Planet Hollywood Resort and Casino, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "187.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " AT&amp;T Center, San Antonio, Texas, United States" });
        itest("randoop", 144).given(td, "392.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "343.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("randoop", 144).given(td, "472.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "445.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "141.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Honda Center, Anaheim, California, United States" });
        itest("evosuite", 144).given(td, "327.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Ameristar Casino Hotel, Kansas City, Missouri, United States" });
        itest("evosuite", 144).given(td, "325.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " RiverCenter, Davenport, Iowa, United States" });
        itest("evosuite", 144).given(td, "323.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Shrine Auditorium, Los Angeles, California, United States" });
        itest("evosuite", 144).given(td, "257.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Ocean Center, Daytona Beach, Florida, United States" });
        itest("dev", 144).given(td, "147.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "208.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "482.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("dev", 144).given(td, "181.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Spectrum Center, Charlotte, North Carolina, United States" });
        itest("randoop", 144).given(td, "468.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "406.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "416.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "260.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Hard Rock Hotel and Casino, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "316.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("randoop", 144).given(td, "429.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "466.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "434.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "446.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "241.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " FedEx Forum, Memphis, Tennessee, United States" });
        itest("dev", 144).given(td, "190.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "113.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "236.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Xfinity Arena, Everett, Washington, United States" });
        itest("evosuite", 144).given(td, "319.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Hangar at OC Fair, Costa Mesa, California, United States" });
        itest("dev", 144).given(td, "192.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "296.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("randoop", 144).given(td, "469.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "324.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Arena Theatre, Houston, Texas, United States" });
        itest("evosuite", 144).given(td, "300.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("dev", 144).given(td, "160.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "432.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "206.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        itest("dev", 144).given(td, "183.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "159.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/fr.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Accor Arena, Paris, France" });
        itest("randoop", 144).given(td, "490.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "489.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "407.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "306.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Union Event Center, Salt Lake City, Utah, United States" });
        itest("evosuite", 144).given(td, "265.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Revel Resort &amp; Casino, Atlantic City, New Jersey, United States" });
        itest("dev", 144).given(td, "204.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        itest("randoop", 144).given(td, "441.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "414.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "158.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/au.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Qudos Bank Arena, Sydney, New South Wales, Australia" });
        itest("evosuite", 144).given(td, "269.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Planet Hollywood Resort &amp; Casino, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "145.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ca.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Scotiabank Arena, Toronto, Ontario, Canada" });
        itest("randoop", 144).given(td, "427.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "488.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("evosuite", 144).given(td, "287.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Police Athletic League, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "263.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ca.gif\" width=\"16\" height=\"11\" alt=\"country\"", " PNE Agrodome, Vancouver, British Columbia, Canada" });
        itest("dev", 144).given(td, "124.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sa.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kingdom Arena, Riyadh, Saudi Arabia" });
        itest("randoop", 144).given(td, "461.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "196.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "328.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Ameristar Casino Hotel, Kansas City, Missouri, United States" });
        itest("randoop", 144).given(td, "419.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "308.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("evosuite", 144).given(td, "249.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Comerica Theatre, Phoenix, Arizona, United States" });
        itest("evosuite", 144).given(td, "295.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("randoop", 144).given(td, "402.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "453.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "137.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "433.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "240.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Next Level Sports Complex, Garden Grove, California, United States" });
        itest("randoop", 144).given(td, "493.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("evosuite", 144).given(td, "235.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Municipal Auditorium Arena, Kansas City, MO, United States" });
        itest("randoop", 144).given(td, "422.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "168.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "191.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "239.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Bank of Colorado Arena, Greeley, Colorado, United States" });
        itest("randoop", 144).given(td, "481.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/mn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Steppe Arena, Ulaanbataar, Mongolia" });
        itest("evosuite", 144).given(td, "250.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ca.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Edmonton Expo Centre, Edmonton, Alberta, Canada" });
        itest("evosuite", 144).given(td, "304.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("dev", 144).given(td, "209.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "177.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("randoop", 144).given(td, "484.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/my.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Axiata Arena, Kuala Lumpur, Malaysia" });
        itest("evosuite", 144).given(td, "321.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Cosmopolitan, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "448.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "409.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/qa.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lusail Sports Arena, Lusail, Qatar" });
        itest("dev", 144).given(td, "142.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "303.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("evosuite", 144).given(td, "313.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("randoop", 144).given(td, "458.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "166.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Delta Center, Salt Lake City, Utah, United States" });
        itest("dev", 144).given(td, "131.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        itest("randoop", 144).given(td, "430.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "318.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Trinidad Pavilion at Tropicana Las Vegas, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "294.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "237.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Foxwoods Resort Casino, Mashantucket, Connecticut, United States" });
        itest("evosuite", 144).given(td, "329.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Ameristar Casino Hotel, Kansas City, Missouri, United States" });
        itest("randoop", 144).given(td, "420.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "155.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "116.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "474.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "443.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "412.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "293.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("dev", 144).given(td, "211.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/fr.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Accor Arena, Paris, France" });
        itest("dev", 144).given(td, "150.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "139.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "317.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Hangar at OC Fair, Costa Mesa, California, United States" });
        itest("randoop", 144).given(td, "404.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "435.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "167.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 02 Arena, London, Greater London, England" });
        itest("randoop", 144).given(td, "485.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/my.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Axiata Arena, Kuala Lumpur, Malaysia" });
        itest("dev", 144).given(td, "161.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("evosuite", 144).given(td, "341.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Enterprise Center, St. Louis, Missouri, United States" });
        itest("dev", 144).given(td, "205.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        itest("evosuite", 144).given(td, "254.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ca.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Edmonton Expo Centre, Edmonton, Alberta, Canada" });
        itest("dev", 144).given(td, "173.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "255.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Sands Bethlehem Event Center, Bethlehem, Pennsylvania, United States" });
        itest("randoop", 144).given(td, "424.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "437.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "125.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "247.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ca.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Edmonton Expo Centre, Edmonton, Alberta, Canada" });
        itest("evosuite", 144).given(td, "256.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Hard Rock Hotel and Casino, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "394.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Impact Arena, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "464.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "459.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 1stBank Center, Broomfield, Colorado, United States" });
        itest("dev", 144).given(td, "179.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("dev", 144).given(td, "134.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "451.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "275.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Citizens House of Blues Boston, Boston, Massachusetts, United States" });
        itest("dev", 144).given(td, "214.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "477.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Impact Arena, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "281.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " ReelWorks Denver, Denver, Colorado, United States" });
        itest("dev", 144).given(td, "153.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        itest("randoop", 144).given(td, "436.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "340.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/br.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Rio Arena, Rio de Janeiro, Rio de Janeiro, Brazil" });
        itest("randoop", 144).given(td, "450.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "252.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " McClellan Conference Center, Sacramento, California, United States" });
        itest("evosuite", 144).given(td, "288.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Police Athletic League, Kansas City, Kansas, United States" });
        itest("dev", 144).given(td, "200.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "278.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " ReelWorks Denver, Denver, Colorado, United States" });
        itest("randoop", 144).given(td, "425.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "399.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " State Farm Arena, Atlanta, Georgia, United States" });
        itest("dev", 144).given(td, "146.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "476.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "396.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "305.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("randoop", 144).given(td, "411.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "342.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "322.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Municipal Auditorium, Kansas City, Missouri, United States" });
        itest("evosuite", 144).given(td, "248.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Foxwoods Resort and Casino, Ledyard, Connecticut, United States" });
        itest("evosuite", 144).given(td, "261.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ca.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Edmonton Expo Centre, Edmonton, Alberta, Canada" });
        itest("randoop", 144).given(td, "438.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "130.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/fr.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Accor Arena, Paris, France" });
        itest("evosuite", 144).given(td, "339.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "197.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "478.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ph.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SM Mall of Asia Arena, Pasay, Manila, Philippines" });
        itest("randoop", 144).given(td, "400.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "140.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/mx.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mexico City Arena, Mexico City, Federal District, Mexico" });
        itest("dev", 144).given(td, "182.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Prudential Center, Newark, New Jersey, United States" });
        itest("randoop", 144).given(td, "462.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "408.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "262.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Seminole Hard Rock Hotel and Casino, Hollywood, Florida, United States" });
        itest("evosuite", 144).given(td, "309.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Tachi Palace Hotel and Casino, Lemoore, California, United States" });
        itest("randoop", 144).given(td, "410.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "152.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/br.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Ibirapuera Gymnasium, Sao Paulo, Sao Paulo, Brazil" });
        itest("randoop", 144).given(td, "423.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "114.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/br.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Rio Arena, Rio de Janeiro, Rio de Janeiro, Brazil" });
        itest("dev", 144).given(td, "157.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "398.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "213.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Pechanga Arena, San Diego, California, United States" });
        itest("dev", 144).given(td, "178.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("evosuite", 144).given(td, "246.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Axis at Planet Hollywood Resort and Casino, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "198.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "144.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "440.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "175.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "415.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/jp.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Ariake Arena, Tokyo, Japan" });
        itest("dev", 144).given(td, "136.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "314.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("dev", 144).given(td, "184.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "463.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "202.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "253.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " USF Sun Dome, Tampa, Florida, United States" });
        itest("randoop", 144).given(td, "480.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/mn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Steppe Arena, Ulaanbataar, Mongolia" });
        itest("evosuite", 144).given(td, "331.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "242.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Cosmopolitan of Las Vegas, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "491.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "421.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "176.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("evosuite", 144).given(td, "267.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Hard Rock Hotel and Casino, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "156.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "326.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Municipal Auditorium, Kansas City, Missouri, United States" });
        itest("evosuite", 144).given(td, "297.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("dev", 144).given(td, "193.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/au.gif\" width=\"16\" height=\"11\" alt=\"country\"", " RAC Arena, Perth, Western Australia, Australia" });
        itest("dev", 144).given(td, "170.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "454.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "129.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Sphere, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "286.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "264.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Bank United Center, Coral Gables, Florida, United States" });
        itest("dev", 144).given(td, "165.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Bridgestone Arena, Nashville, Tennessee, United States" });
        itest("dev", 144).given(td, "117.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/cn.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Performance Institute, Shanghai, China" });
        itest("evosuite", 144).given(td, "233.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Turning Stone Resort Casino, Verona, New York, United States" });
        itest("randoop", 144).given(td, "447.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "332.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("dev", 144).given(td, "171.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "258.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Hard Rock Hotel and Casino, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "467.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "123.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "268.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Revel Resort &amp; Casino, Atlantic City, New Jersey, United States" });
        itest("evosuite", 144).given(td, "298.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("randoop", 144).given(td, "439.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "203.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "169.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "310.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("randoop", 144).given(td, "442.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "291.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Police Athletic League, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "330.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("dev", 144).given(td, "186.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kaseya Center, Miami, Florida, United States" });
        itest("randoop", 144).given(td, "487.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "393.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "199.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Amway Center, Orlando, Florida, United States" });
        itest("dev", 144).given(td, "174.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ca.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Rogers Arena, Vancouver, British Columbia, Canada" });
        itest("evosuite", 144).given(td, "333.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "285.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("randoop", 144).given(td, "428.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "479.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ph.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SM Mall of Asia Arena, Pasay, Manila, Philippines" });
        itest("randoop", 144).given(td, "473.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "143.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "133.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "492.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "486.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("evosuite", 144).given(td, "284.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Police Athletic League, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "299.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "244.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Foxwoods Resort Casino, Mashantucket, Connecticut, United States" });
        itest("dev", 144).given(td, "163.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " TD Garden, Boston, Massachusetts, United States" });
        itest("evosuite", 144).given(td, "277.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " ReelWorks Denver, Denver, Colorado, United States" });
        itest("randoop", 144).given(td, "465.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "289.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Police Athletic League, Kansas City, Kansas, United States" });
        itest("dev", 144).given(td, "210.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "311.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("dev", 144).given(td, "127.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Abu Dhabi, United Arab Emirates" });
        itest("dev", 144).given(td, "138.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kaseya Center, Miami, Florida, United States" });
        itest("evosuite", 144).given(td, "238.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Hard Rock Hotel and Casino, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "148.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("randoop", 144).given(td, "413.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "135.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Boardwalk Hall, Atlantic City, New Jersey, United States" });
        itest("randoop", 144).given(td, "403.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "301.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("randoop", 144).given(td, "475.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "283.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Memorial Hall, Kansas City, Kansas, United States" });
        itest("evosuite", 144).given(td, "276.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " ReelWorks Denver, Denver, Colorado, United States" });
        itest("randoop", 144).given(td, "397.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Ball Arena, Denver, Colorado, United States" });
        itest("randoop", 144).given(td, "483.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        itest("randoop", 144).given(td, "395.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "460.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "426.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "164.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        itest("dev", 144).given(td, "151.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Madison Square Garden, New York, New York, United States" });
        itest("evosuite", 144).given(td, "302.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " FireLake Arena, Shawnee, Oklahoma, United States" });
        itest("randoop", 144).given(td, "449.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("dev", 144).given(td, "149.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Moody Center, Austin, Texas, United States" });
        itest("evosuite", 144).given(td, "259.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ca.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Edmonton Expo Centre, Edmonton, Alberta, Canada" });
        itest("randoop", 144).given(td, "452.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("randoop", 144).given(td, "418.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/th.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Lumpinee Boxing Stadium, Bangkok, Thailand" });
        itest("evosuite", 144).given(td, "320.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Municipal Auditorium, Kansas City, Missouri, United States" });
        itest("dev", 144).given(td, "189.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Theater at Virgin Hotels, Las Vegas, Nevada, United States" });
        itest("evosuite", 144).given(td, "266.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Citizens Bank Arena, Ontario, California, United States" });
        itest("evosuite", 144).given(td, "315.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Kansas City Scottish Rite Temple, Kansas City, Missouri, United States" });
        itest("dev", 144).given(td, "195.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/br.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Jeunesse Arena, Rio de Janeiro, Brazil" });
        itest("dev", 144).given(td, "188.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " O2 Arena, London, Greater London, England" });
        if (split.length > 1) {
            return split[1].trim();
        } else {
            return "";
        }
    }

    private String getEventName(Element td) {
        Elements nameElement = td.select("span[itemprop=\"name\"]");
        if (nameElement.size() > 0) {
            String name = nameElement.get(0).html();
            name = name.replaceAll("( )+", " ").trim();
            return name;
        } else {
            return "";
        }
    }

    private String getEventUrl(Element td) {
        Elements url = td.select("a[itemprop=\"url\"]");
        if (url.size() > 0) {
            String attr = url.get(0).attr("abs:href");
            return attr;
        } else {
            return "";
        }
    }

    private ZonedDateTime getEventDate(Element element) {
        Elements metaDate = element.select("meta[itemprop=\"startDate\"]");
        if (metaDate.size() > 0) {
            String date = metaDate.get(0).attr("content");
            return ParserUtils.getDateFromStringToZoneId(date, ZONE_ID);
        } else {
            return null;
        }
    }
}
