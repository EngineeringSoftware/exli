package com.ftpix.sherdogparser.parsers;

import com.ftpix.sherdogparser.exceptions.NotASherdogURLException;
import com.ftpix.sherdogparser.exceptions.SherdogParserException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.text.ParseException;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

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
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Cristiano-Kaminishi-11531").checkEq(url, "https://www.sherdog.com/fighter/Cristiano-Kaminishi-11531");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Ardalan-Darvishi-78877").checkEq(url, "https://www.sherdog.com/fighter/Ardalan-Darvishi-78877");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.NotASherdogURLException: The url isn't connecting to sherdog domain expected format: http://www.sherdog.com/xxxxxxxx").checkEq(url, "com.ftpix.sherdogparser.exceptions.NotASherdogURLException: The url isn't connecting to sherdog domain expected format: https://www.sherdog.com/xxxxxxxx");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Atsushi-Nakasa-26857").checkEq(url, "https://www.sherdog.com/fighter/Atsushi-Nakasa-26857");
            itest("randoop", 28).given(url, "Strawweight").checkEq(url, "Strawweight");
            itest("randoop", 28).given(url, "Middleweight").checkEq(url, "Middleweight");
            itest("randoop", 28).given(url, "Super Heavyweight").checkEq(url, "Super Heavyweight");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='https://www.sherdog.com', height='', weight='', birthday=null, wins=32, losses=0, draws=-1, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='httpss://www.sherdog.com', height='', weight='', birthday=null, wins=32, losses=0, draws=-1, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: ").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: ");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=32, losses=97, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=32, losses=97, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=60000, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=60000, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "hi!").checkEq(url, "hi!");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Super Heavyweight").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Super Heavyweight");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: hi!").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: hi!");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Alex-OToole-71697").checkEq(url, "https://www.sherdog.com/fighter/Alex-OToole-71697");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='https://www.sherdog.com', height='', weight='', birthday=null, wins=10, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='httpss://www.sherdog.com', height='', weight='', birthday=null, wins=10, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "Welterweight").checkEq(url, "Welterweight");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=32, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=32, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "SherdogBaseObject{name='ONE Championship', sherdogUrl='https://www.sherdog.com/organizations/ONE-Championship-3877'}").checkEq(url, "SherdogBaseObject{name='ONE Championship', sherdogUrl='httpss://www.sherdog.com/organizations/ONE-Championship-3877'}");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl='https://www.sherdog.com/'}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl='httpss://www.sherdog.com/'}");
            itest("randoop", 28).given(url, "Flyweight").checkEq(url, "Flyweight");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='hi!', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='hi!', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=35, nc=52, picture='https://www.sherdog.com', sherdogUrl='https://www.sherdog.com/'}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=35, nc=52, picture='httpss://www.sherdog.com', sherdogUrl='httpss://www.sherdog.com/'}");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='https://www.sherdog.com/', weight='', birthday=null, wins=0, losses=0, draws=0, nc=35, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='httpss://www.sherdog.com/', weight='', birthday=null, wins=0, losses=0, draws=0, nc=35, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "Invicta Fighting Championships").checkEq(url, "Invicta Fighting Championships");
            itest("randoop", 28).given(url, "America/New_York").checkEq(url, "America/New_York");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Atsushi-Hamada-41786").checkEq(url, "https://www.sherdog.com/fighter/Atsushi-Hamada-41786");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Borsevschi-Vasile-418870").checkEq(url, "https://www.sherdog.com/fighter/Borsevschi-Vasile-418870");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Akihiko-Adachi-2229").checkEq(url, "https://www.sherdog.com/fighter/Akihiko-Adachi-2229");
            itest("randoop", 28).given(url, "Light Heavyweight").checkEq(url, "Light Heavyweight");
            itest("evosuite", 28).given(url, "vc.[Z[oYUHbHI").checkEq(url, "vc.[Z[oYUHbHI");
            itest("randoop", 28).given(url, "Featherweight").checkEq(url, "Featherweight");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "http://www.sherdog.com").checkEq(url, "https://www.sherdog.com");
            itest("randoop", 28).given(url, "").checkEq(url, "");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Daisuke-Igarashi-1724").checkEq(url, "https://www.sherdog.com/fighter/Daisuke-Igarashi-1724");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: com.ftpix.sherdogparser.exceptions.SherdogParserException: hi!").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: com.ftpix.sherdogparser.exceptions.SherdogParserException: hi!");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=35, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=35, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Atsushi-Yamada-83446").checkEq(url, "https://www.sherdog.com/fighter/Atsushi-Yamada-83446");
            itest("randoop", 28).given(url, "SherdogBaseObject{name='Strawweight', sherdogUrl='https://www.sherdog.com/organizations/ONE-Championship-3877'}").checkEq(url, "SherdogBaseObject{name='Strawweight', sherdogUrl='httpss://www.sherdog.com/organizations/ONE-Championship-3877'}");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Alexandru-Ionut-Peschi-288295").checkEq(url, "https://www.sherdog.com/fighter/Alexandru-Ionut-Peschi-288295");
            itest("randoop", 28).given(url, "Bantamweight").checkEq(url, "Bantamweight");
            itest("evosuite", 28).given(url, "com.github.javaparser.metamodel.ModuleProvidesDirectiveMetaModel").checkEq(url, "com.github.javaparser.metamodel.ModuleProvidesDirectiveMetaModel");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Invicta Fighting Championships").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Invicta Fighting Championships");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Flyweight").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Flyweight");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Ashkan-Sakhi-149543").checkEq(url, "https://www.sherdog.com/fighter/Ashkan-Sakhi-149543");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=1, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=1, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=97, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=97, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: com.ftpix.sherdogparser.exceptions.SherdogParserException: https://www.sherdog.com").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: com.ftpix.sherdogparser.exceptions.SherdogParserException: httpss://www.sherdog.com");
            itest("randoop", 28).given(url, "Heavyweight").checkEq(url, "Heavyweight");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Atsushi-Doi-424156").checkEq(url, "https://www.sherdog.com/fighter/Atsushi-Doi-424156");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='Flyweight', height='', weight='', birthday=null, wins=32, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='Flyweight', height='', weight='', birthday=null, wins=32, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Atsushi-Atsushi-297551").checkEq(url, "https://www.sherdog.com/fighter/Atsushi-Atsushi-297551");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='hi!', height='', weight='', birthday=null, wins=0, losses=5, draws=0, nc=1, picture='https://www.sherdog.com', sherdogUrl='https://www.sherdog.com'}").checkEq(url, "Fighter{name='null', nickname='hi!', height='', weight='', birthday=null, wins=0, losses=5, draws=0, nc=1, picture='httpss://www.sherdog.com', sherdogUrl='httpss://www.sherdog.com'}");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Abdullahi-Ahi-435409").checkEq(url, "https://www.sherdog.com/fighter/Abdullahi-Ahi-435409");
            itest("dev", 28).given(url, "http://something.com").checkEq(url, "https://something.com");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Alessandro-Giachi-202187").checkEq(url, "https://www.sherdog.com/fighter/Alessandro-Giachi-202187");
            itest("randoop", 28).given(url, "Catchweight").checkEq(url, "Catchweight");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Chad-Waelchi-64209").checkEq(url, "https://www.sherdog.com/fighter/Chad-Waelchi-64209");
            itest("dev", 28).given(url, "somegibbierish://something").checkEq(url, "somegibbierish://something");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Daniel-Vasilachi-437861").checkEq(url, "https://www.sherdog.com/fighter/Daniel-Vasilachi-437861");
            itest("evosuite", 28).given(url, "").checkEq(url, "");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: https://www.sherdog.com").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: httpss://www.sherdog.com");
            itest("dev", 28).given(url, "http://www.sherrrrrr.com").checkEq(url, "https://www.sherrrrrr.com");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Cory-Kamachi-321683").checkEq(url, "https://www.sherdog.com/fighter/Cory-Kamachi-321683");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Daudgadzhi-Ibragimov-240733").checkEq(url, "https://www.sherdog.com/fighter/Daudgadzhi-Ibragimov-240733");
            itest("randoop", 28).given(url, "http://www.sherdog.com/fighter/Clay-Hirschi-356691").checkEq(url, "https://www.sherdog.com/fighter/Clay-Hirschi-356691");
            itest("randoop", 28).given(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "com.ftpix.sherdogparser.exceptions.SherdogParserException: Fighter{name='null', nickname='', height='', weight='', birthday=null, wins=0, losses=0, draws=0, nc=1, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("randoop", 28).given(url, "Fighter{name='null', nickname='', height='https://www.sherdog.com', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='https://www.sherdog.com', sherdogUrl=''}").checkEq(url, "Fighter{name='null', nickname='', height='httpss://www.sherdog.com', weight='', birthday=null, wins=0, losses=0, draws=0, nc=0, picture='httpss://www.sherdog.com', sherdogUrl=''}");
            itest("evosuite", 28).given(url, " IOG").checkEq(url, " IOG");
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
