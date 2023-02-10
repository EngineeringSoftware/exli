package com.ftpix.sherdogparser.parsers;

import com.ftpix.sherdogparser.exceptions.NotASherdogURLException;
import com.ftpix.sherdogparser.exceptions.SherdogParserException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.text.ParseException;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Created by gz on 20-Aug-16.
 * teh default interface for a shergod parser
 */
public interface SherdogParser<T> {

    /**
     * Parse a sherdog page
     *
     * @param url of the sherdog page
     * @return the object parsed by the parser
     * @throws IOException    if connecting to sherdog fails
     * @throws ParseException if the page structure has changed
     * @throws SherdogParserException if anythign related to the parser goes wrong
     */
    default T parse(String url) throws IOException, ParseException, SherdogParserException {
        if (!url.startsWith("https")) {
            url = url.replace("http", "https");
            new Here("Randoop", 28).given(url, "Light Heavyweight").checkEq(url, "Light Heavyweight");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Praschak-15827").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Praschak-15827");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Johnson-39330").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Johnson-39330");
            new Here("Randoop", 28).given(url, "SherdogBaseObject{name='Bellator MMA', sherdogUrl='https://www.sherdog.com/organizations/Bellator-MMA-1960'}").checkEq(url, "SherdogBaseObject{name='Bellator MMA', sherdogUrl='httpss://www.sherdog.com/organizations/Bellator-MMA-1960'}");
            new Here("Randoop", 28).given(url, "Fighter{name='', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-Marquez-340107").checkEq(url, "https://www.sherdog.com/fighter/AJ-Marquez-340107");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Raffin-50992").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Raffin-50992");
            new Here("Randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.NotASherdogURLException: The url isn't connecting to sherdog domain expected format: http://www.sherdog.com/xxxxxxxx").checkEq(url, "com.ftpix.sherdogparser.exceptions.NotASherdogURLException: The url isn't connecting to sherdog domain expected format: https://www.sherdog.com/xxxxxxxx");
            new Here("Randoop", 28).given(url, "Pound for Pound").checkEq(url, "Pound for Pound");
            new Here("Randoop", 28).given(url, "").checkEq(url, "");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Jollimore-20361").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Jollimore-20361");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/annis-Kargas-280791").checkEq(url, "https://www.sherdog.com/fighter/annis-Kargas-280791");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Joao-Gabriel-416868").checkEq(url, "https://www.sherdog.com/fighter/Joao-Gabriel-416868");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Keyes-60149").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Keyes-60149");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Davis-23061").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Davis-23061");
            new Here("Randoop", 28).given(url, "Middleweight").checkEq(url, "Middleweight");
            new Here("Randoop", 28).given(url, "hi!").checkEq(url, "hi!");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Hamilton-65199").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Hamilton-65199");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Ratcliff-48230").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Ratcliff-48230");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Kreke-16151").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Kreke-16151");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Spurge-52788").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Spurge-52788");
            new Here("Randoop", 28).given(url, "Strawweight").checkEq(url, "Strawweight");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Bourcier-61440").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Bourcier-61440");
            new Here("Randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: http://www.sherdog.com").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: https://www.sherdog.com");
            new Here("Randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl='com.ftpix.sherdogparser.exceptions.SherdogParserException: http://www.sherdog.com'}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl='com.ftpix.sherdogparser.exceptions.SherdogParserException: https://www.sherdog.com'}");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-Stephens-315465").checkEq(url, "https://www.sherdog.com/fighter/AJ-Stephens-315465");
            new Here("Randoop", 28).given(url, "Atomweight").checkEq(url, "Atomweight");
            new Here("Randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: ").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: ");
            new Here("Unit", 28).given(url, "http://something.com").checkEq(url, "https://something.com");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Skates-39676").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Skates-39676");
            new Here("Randoop", 28).given(url, "Ultimate Fighting Championship (UFC)").checkEq(url, "Ultimate Fighting Championship (UFC)");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AT-McCowin-296475").checkEq(url, "https://www.sherdog.com/fighter/AT-McCowin-296475");
            new Here("Randoop", 28).given(url, "SherdogBaseObject{name='null', sherdogUrl='null'}").checkEq(url, "SherdogBaseObject{name='null', sherdogUrl='null'}");
            new Here("Randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Fighter{name='Middleweight', nickname='', height='', weight='', birthday=null, wins=0, losses=60000, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Fighter{name='Middleweight', nickname='', height='', weight='', birthday=null, wins=0, losses=60000, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Young-41095").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Young-41095");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Barrios-31034").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Barrios-31034");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-Branch-292995").checkEq(url, "https://www.sherdog.com/fighter/AJ-Branch-292995");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-Dougherty-240859").checkEq(url, "https://www.sherdog.com/fighter/AJ-Dougherty-240859");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Coorough-66324").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Coorough-66324");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Bernardo-29714").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Bernardo-29714");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Kelle-48485").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Kelle-48485");
            new Here("Randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='America/New_York', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='America/New_York', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Barnard-22170").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Barnard-22170");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Garrett-2653").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Garrett-2653");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-Matthews-21922").checkEq(url, "https://www.sherdog.com/fighter/AJ-Matthews-21922");
            new Here("Randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Fighter{name='null', nickname='', height='', weight='America/New_York', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Fighter{name='null', nickname='', height='', weight='America/New_York', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Unit", 28).given(url, "http://www.sherrrrrr.com").checkEq(url, "https://www.sherrrrrr.com");
            new Here("Randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-Hoffman-144263").checkEq(url, "https://www.sherdog.com/fighter/AJ-Hoffman-144263");
            new Here("Randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=100, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=100, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-St-Louis-25305").checkEq(url, "https://www.sherdog.com/fighter/Aaron-St-Louis-25305");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com").checkEq(url, "https://www.sherdog.com");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-McConnell-161417").checkEq(url, "https://www.sherdog.com/fighter/AJ-McConnell-161417");
            new Here("Unit", 28).given(url, "somegibbierish://something").checkEq(url, "somegibbierish://something");
            new Here("Randoop", 28).given(url, "Bantamweight").checkEq(url, "Bantamweight");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-Blaskievich-371313").checkEq(url, "https://www.sherdog.com/fighter/AJ-Blaskievich-371313");
            new Here("Randoop", 28).given(url, "America/New_York").checkEq(url, "America/New_York");
            new Here("Randoop", 28).given(url, "Invicta Fighting Championships").checkEq(url, "Invicta Fighting Championships");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Jung-Sung-Jik-202239").checkEq(url, "https://www.sherdog.com/fighter/Jung-Sung-Jik-202239");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Dyett-65785").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Dyett-65785");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Conway-65204").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Conway-65204");
            new Here("Randoop", 28).given(url, "Fighter{name='null', nickname='Fighter{name='null', nickname='', height='', weight='America/New_York', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='https://www.sherdog.com', sherdogUrl=''}', height='', weight='America/New_York', birthday=null, wins=60000, losses=0, draws=0, nc=1, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='Fighter{name='null', nickname='', height='', weight='America/New_York', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='httpss://www.sherdog.com', sherdogUrl=''}', height='', weight='America/New_York', birthday=null, wins=60000, losses=0, draws=0, nc=1, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Bowman-69315").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Bowman-69315");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Kenny-Mbongo-412978").checkEq(url, "https://www.sherdog.com/fighter/Kenny-Mbongo-412978");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Stephenson-61381").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Stephenson-61381");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/AJ-Dobson-119943").checkEq(url, "https://www.sherdog.com/fighter/AJ-Dobson-119943");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Winzer-58518").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Winzer-58518");
            new Here("Randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=10, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=10, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Randoop", 28).given(url, "http://www.sherdog.com/fighter/Aaron-Stark-14710").checkEq(url, "https://www.sherdog.com/fighter/Aaron-Stark-14710");
            new Here("Randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            new Here("Randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: America/New_York").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: America/New_York");
            new Here("Randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=1, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=1, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
        }
        if (!url.startsWith("https://www.sherdog.com/")) {
            throw new NotASherdogURLException();
        }
        Document doc = ParserUtils.parseDocument(url);
        return parseDocument(doc);
    }

    /**
     * Parses a document from the HTML source code directly
     *
     * @param html the HTML source code
     * @return the parsed object
     * @throws IOException    if connecting to sherdog fails
     * @throws ParseException if the page structure has changed
     */
    default T parseFromHtml(String html) throws IOException, ParseException {
        return parseDocument(Jsoup.parse(html));
    }

    /**
     * Parses a jsoup document
     *
     * @param doc the document to parse
     * @return the parsed object
     * @throws IOException    if connecting to sherdog fails
     * @throws ParseException if the page structure has changed
     */
    T parseDocument(Document doc) throws ParseException, IOException;
}
