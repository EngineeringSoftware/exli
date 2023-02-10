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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 144).given(td, "307.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "216.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Toyota Center, Houston, Texas, United States" });
        new Here("Unit", 144).given(td, "146.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Madison Square Garden, New York, New York, United States" });
        new Here("Randoop", 144).given(td, "333.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/gb.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Resorts World Arena, Birmingham, England, United Kingdom" });
        new Here("Randoop", 144).given(td, "276.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/ie.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 3Arena, Dublin, Ireland" });
        new Here("Unit", 144).given(td, "164.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "351.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Sanford Pentagon, Sioux Falls, South Dakota, United States" });
        new Here("Unit", 144).given(td, "182.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "325.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Forum, Inglewood, California, United States" });
        new Here("Randoop", 144).given(td, "266.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/ie.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 3Arena, Dublin, Ireland" });
        new Here("Unit", 144).given(td, "183.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "180.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Nationwide Arena, Columbus, Ohio, United States" });
        new Here("Randoop", 144).given(td, "272.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Neil S. Blaisdell Center, Honolulu, Hawaii, United States" });
        new Here("Unit", 144).given(td, "222.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "142.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "354.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Pechanga Resort and Casino, Temecula, California, United States" });
        new Here("Unit", 144).given(td, "208.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "128.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "168.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        new Here("Randoop", 144).given(td, "324.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Pechanga Resort &amp; Casino, Temecula, California, United States" });
        new Here("Randoop", 144).given(td, "353.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Winstar World Casino and Resort, Thackerville, Oklahoma, United States" });
        new Here("Randoop", 144).given(td, "322.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "340.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Metro Radio Arena, Newcastle, Tyne and Wear, England" });
        new Here("Randoop", 144).given(td, "264.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/it.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Allianz Cloud Arena, Milan, Italy" });
        new Here("Unit", 144).given(td, "154.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "141.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "305.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/it.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Allianz Cloud, Milan, Italy" });
        new Here("Randoop", 144).given(td, "328.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Webster Bank Arena, Bridgeport, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "293.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "257.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SAP Center, San Jose, California, United States" });
        new Here("Unit", 144).given(td, "221.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "326.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/ie.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 3Arena, Dublin, Ireland" });
        new Here("Randoop", 144).given(td, "297.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "280.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Seminole Hard Rock Hotel and Casino, Hollywood, Florida, United States" });
        new Here("Unit", 144).given(td, "211.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "193.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "315.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/jp.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Saitama Super Arena, Saitama, Japan" });
        new Here("Unit", 144).given(td, "212.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "170.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        new Here("Unit", 144).given(td, "209.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "194.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "256.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/ie.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 3Arena, Dublin, Ireland" });
        new Here("Randoop", 144).given(td, "289.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "188.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Honda Center, Anaheim, California, United States" });
        new Here("Randoop", 144).given(td, "302.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "210.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "261.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Forum, Inglewood, California, United States" });
        new Here("Unit", 144).given(td, "185.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "274.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SAP Center, San Jose, California, United States" });
        new Here("Unit", 144).given(td, "178.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "150.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        new Here("Randoop", 144).given(td, "300.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "279.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "165.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "281.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/ie.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 3Arena, Dublin, Ireland" });
        new Here("Randoop", 144).given(td, "273.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Neil S. Blaisdell Center, Honolulu, Hawaii, United States" });
        new Here("Randoop", 144).given(td, "316.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Neal S. Blaisdell Center, Honolulu, Hawaii, United States" });
        new Here("Randoop", 144).given(td, "318.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The SSE Arena, Wembley, London, England" });
        new Here("Randoop", 144).given(td, "278.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Footprint Center, Phoenix, Arizona, United States" });
        new Here("Randoop", 144).given(td, "277.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "159.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "327.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SAP Center, San Jose, California, United States" });
        new Here("Randoop", 144).given(td, "314.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Forum, Inglewood, California, United States" });
        new Here("Unit", 144).given(td, "173.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "144.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Amway Center, Orlando, Florida, United States" });
        new Here("Randoop", 144).given(td, "350.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " CenturyLink Arena, Boise, Idaho, United States" });
        new Here("Randoop", 144).given(td, "271.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/fr.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Accor Arena, Paris, France" });
        new Here("Unit", 144).given(td, "166.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Moody Center, Austin, Texas, United States" });
        new Here("Unit", 144).given(td, "131.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " O2 Arena, London, Greater London, England" });
        new Here("Unit", 144).given(td, "143.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "139.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "198.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "285.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SAP Center, San Jose, California, United States" });
        new Here("Randoop", 144).given(td, "268.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Emerald Queen Casino, Tacoma, Washington, United States" });
        new Here("Randoop", 144).given(td, "343.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Neil S. Blaisdell Center, Honolulu, Hawaii, United States" });
        new Here("Unit", 144).given(td, "224.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "267.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Sanford Pentagon, Sioux Falls, South Dakota, United States" });
        new Here("Unit", 144).given(td, "171.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        new Here("Unit", 144).given(td, "134.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "292.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "214.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "201.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "352.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/it.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Il Centrale Live, Rome, Italy" });
        new Here("Randoop", 144).given(td, "295.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "152.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "310.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "341.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Forum, Inglewood, California, United States" });
        new Here("Randoop", 144).given(td, "313.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " WinStar World Casino, Thackerville, Oklahoma, United States" });
        new Here("Randoop", 144).given(td, "304.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/it.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Allianz Cloud, Milan, Italy" });
        new Here("Unit", 144).given(td, "133.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Miami-Dade Arena, Miami, Florida, United States" });
        new Here("Randoop", 144).given(td, "355.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SSE Arena, London, England" });
        new Here("Randoop", 144).given(td, "286.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Sanford Pentagon, Sioux Falls, South Dakota, United States" });
        new Here("Randoop", 144).given(td, "287.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "301.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "339.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "330.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SSE Arena, London, England" });
        new Here("Randoop", 144).given(td, "309.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "151.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        new Here("Randoop", 144).given(td, "270.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The SSE Arena, Wembley, London, England" });
        new Here("Unit", 144).given(td, "203.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "332.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Allstate Arena, Rosemont, Illinois, United States" });
        new Here("Unit", 144).given(td, "167.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        new Here("Unit", 144).given(td, "148.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "190.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "157.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Vivint Arena, Salt Lake City, Utah, United States" });
        new Here("Unit", 144).given(td, "176.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "161.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " O2 Arena, London, Greater London, England" });
        new Here("Unit", 144).given(td, "169.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/sg.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Singapore Indoor Stadium, Kallang, Singapore" });
        new Here("Randoop", 144).given(td, "317.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Neil S. Blaisdell Arena, Honolulu, Hawaii, United States" });
        new Here("Unit", 144).given(td, "196.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        new Here("Randoop", 144).given(td, "346.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/il.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Menora Mivtachim Arena, Tel Aviv, Israel" });
        new Here("Randoop", 144).given(td, "336.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " WinStar World Casino, Thackerville, Oklahoma, United States" });
        new Here("Randoop", 144).given(td, "319.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/il.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Menora Mivtachim Arena, Tel Aviv, Israel" });
        new Here("Unit", 144).given(td, "136.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "284.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The SSE Arena, London, England" });
        new Here("Unit", 144).given(td, "187.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "175.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Footprint Center, Phoenix, Arizona, United States" });
        new Here("Randoop", 144).given(td, "306.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/it.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Allianz Cloud, Milan, Italy" });
        new Here("Unit", 144).given(td, "202.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "312.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/ie.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 3Arena, Dublin, Ireland" });
        new Here("Randoop", 144).given(td, "269.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "158.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Pechanga Arena, San Diego, California, United States" });
        new Here("Unit", 144).given(td, "147.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "329.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " WinStar World Casino, Thackerville, Oklahoma, United States" });
        new Here("Unit", 144).given(td, "217.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "132.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " AT&amp;T Center, San Antonio, Texas, United States" });
        new Here("Unit", 144).given(td, "227.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "298.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "137.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "331.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Madison Square Garden, New York City, New York, United States" });
        new Here("Randoop", 144).given(td, "303.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/fr.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Accor Arena, Paris, France" });
        new Here("Randoop", 144).given(td, "282.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ru.gif\" width=\"16\" height=\"11\" alt=\"country\"", " VTB Arena, Moscow, Russia" });
        new Here("Unit", 144).given(td, "181.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/en.gif\" width=\"16\" height=\"11\" alt=\"country\"", " O2 Arena, London, Greater London, England" });
        new Here("Randoop", 144).given(td, "290.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "265.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Long Beach Arena, Long Beach, California, United States" });
        new Here("Unit", 144).given(td, "204.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "283.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Footprint Center, Phoenix, Arizona, United States" });
        new Here("Unit", 144).given(td, "199.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "349.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SAP Center, San Jose, California, United States" });
        new Here("Unit", 144).given(td, "179.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " VyStar Veterans Memorial Arena, Jacksonville, Florida, United States" });
        new Here("Randoop", 144).given(td, "294.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "320.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " WinStar World Casino, Thackerville, Oklahoma, United States" });
        new Here("Randoop", 144).given(td, "321.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Conn., United States" });
        new Here("Unit", 144).given(td, "163.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "218.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "177.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "162.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UBS Arena, Elmont, New York, United States" });
        new Here("Randoop", 144).given(td, "344.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/it.gif\" width=\"16\" height=\"11\" alt=\"country\"", " RDS Stadium, Genoa, Italy" });
        new Here("Unit", 144).given(td, "186.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Toyota Center, Houston, Texas, United States" });
        new Here("Unit", 144).given(td, "129.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "195.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Madison Square Garden, New York, New York, United States" });
        new Here("Unit", 144).given(td, "191.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "226.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "140.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/br.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Jeunesse Arena, Rio de Janeiro, Brazil" });
        new Here("Randoop", 144).given(td, "338.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "220.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "156.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/fr.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Accor Arena, Paris, France" });
        new Here("Randoop", 144).given(td, "308.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "200.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "288.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Forum, Inglewood, California, United States" });
        new Here("Unit", 144).given(td, "149.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/ae.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Etihad Arena, Yas Island, Abu Dhabi, United Arab Emirates" });
        new Here("Unit", 144).given(td, "172.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "205.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "259.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/fr.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Accor Arena, Paris, France" });
        new Here("Randoop", 144).given(td, "311.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "145.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "219.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " VyStar Veterans Memorial Arena, Jacksonville, Florida, United States" });
        new Here("Unit", 144).given(td, "225.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "206.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Toyota Center, Houston, Texas, United States" });
        new Here("Randoop", 144).given(td, "337.xml").checkEq(split, new String[] { "<img src=\"https://www1-cdn.sherdog.com/img/flags/ie.gif\" width=\"16\" height=\"11\" alt=\"country\"", " 3Arena, Dublin, Ireland" });
        new Here("Unit", 144).given(td, "153.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "192.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "184.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "347.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Nassau Veterans Memorial Coliseum at NYCB Live, Uniondale, New York, United States" });
        new Here("Randoop", 144).given(td, "262.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "335.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Pechanga Resort &amp; Casino, Temecula, California, United States" });
        new Here("Randoop", 144).given(td, "356.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SAP Center, San Jose, California, United States" });
        new Here("Randoop", 144).given(td, "299.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "213.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Gila River Arena, Glendale, Arizona, United States" });
        new Here("Randoop", 144).given(td, "258.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Pechanga Resort &amp; Casino, Temecula, California, United States" });
        new Here("Randoop", 144).given(td, "291.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "357.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Allstate Arena, Rosemont, Illinois, United States" });
        new Here("Randoop", 144).given(td, "296.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Unit", 144).given(td, "127.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "207.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "342.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Neil S. Blaisdell Center, Honolulu, Hawaii, United States" });
        new Here("Unit", 144).given(td, "160.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " American Airlines Center, Dallas, Texas, United States" });
        new Here("Unit", 144).given(td, "189.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "345.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " WinStar World Casino and Resort, Thackerville, Oklahoma, United States" });
        new Here("Randoop", 144).given(td, "334.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " SAP Center, San Jose, California, United States" });
        new Here("Randoop", 144).given(td, "348.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Mohegan Sun Arena, Uncasville, Connecticut, United States" });
        new Here("Randoop", 144).given(td, "323.xml").checkEq(split, new String[] { "<img src=\"https://www4-cdn.sherdog.com/img/flags/it.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Allianz Cloud, Milan, Italy" });
        new Here("Randoop", 144).given(td, "263.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " Wintrust Arena, Chicago, Illinois, United States" });
        new Here("Unit", 144).given(td, "155.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " T-Mobile Arena, Las Vegas, Nevada, United States" });
        new Here("Randoop", 144).given(td, "275.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Family Arena, St. Louis, Missouri, United States" });
        new Here("Unit", 144).given(td, "197.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "215.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "126.xml").checkEq(split, new String[] { "<img src=\"https://www2-cdn.sherdog.com/img/flags/au.gif\" width=\"16\" height=\"11\" alt=\"country\"", " RAC Arena, Perth, Western Australia, Australia" });
        new Here("Unit", 144).given(td, "135.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "223.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "130.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " The Theater at Virgin Hotels, Las Vegas, Nevada, United States" });
        new Here("Unit", 144).given(td, "174.xml").checkEq(split, new String[] { "<img src=\"https://www3-cdn.sherdog.com/img/flags/us.gif\" width=\"16\" height=\"11\" alt=\"country\"", " UFC Apex, Las Vegas, Nevada, United States" });
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
