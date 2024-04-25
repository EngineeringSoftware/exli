package com.ftpix.sherdogparser.models;

import com.ftpix.sherdogparser.Constants;
import com.ftpix.sherdogparser.Sherdog;
import com.ftpix.sherdogparser.exceptions.SherdogParserException;
import com.ftpix.sherdogparser.parsers.SearchParser;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class SearchResults {

    private final String term;

    private final SearchWeightClass weightClass;

    private final String SEARCH_URL = "http://www.sherdog.com/stats/fightfinder?SearchTxt=%s&weight=%s&page=%d";

    private Sherdog sherdog;

    private int page = 1;

    private List<SherdogBaseObject> dryFighters = new ArrayList<>(), dryEvents = new ArrayList<>();

    public SearchResults(String term, SearchWeightClass weightClass, Sherdog sherdog) throws IOException {
        this.term = term;
        this.weightClass = weightClass;
        this.sherdog = sherdog;
        this.search();
    }

    /**
     * Triggers the actual search
     *
     * @throws IOException if anything goes wrong
     */
    private void search() throws IOException {
        String url = String.format(SEARCH_URL, term, (weightClass != null) ? weightClass.getValue() : "", page);
        itest("randoop", 44).given(weightClass, "497.xml").given(term, "hi!").given(page, 1).given(SEARCH_URL, "http://www.sherdog.com/stats/fightfinder?SearchTxt=%s&weight=%s&page=%d").checkEq(url, "http://www.sherdog.com/stats/fightfinder?SearchTxt=hi!&weight=3&page=1");
        itest("evosuite", 44).given(weightClass, "378.xml").given(term, "%l{(dM?<").given(page, 1).given(SEARCH_URL, "http://www.sherdog.com/stats/fightfinder?SearchTxt=%s&weight=%s&page=%d").checkEq(url, "http://www.sherdog.com/stats/fightfinder?SearchTxt=%l{(dM?<&weight=4&page=1");
        dryEvents = new ArrayList<>();
        dryFighters = new ArrayList<>();
        List<SherdogBaseObject> parse = new SearchParser().parse(url);
        parse.forEach(r -> {
            if (r.getSherdogUrl().startsWith(Constants.BASE_URL + "/events/")) {
                dryEvents.add(r);
            } else if (r.getSherdogUrl().startsWith(Constants.BASE_URL + "/fighter/")) {
                dryFighters.add(r);
            }
        });
    }

    /**
     * Gets the next result page
     *
     * @return itself
     * @throws IOException if the search http query fails
     */
    public SearchResults nextPage() throws IOException {
        this.page++;
        this.search();
        return this;
    }

    /**
     * Gets the simple version of the fighters (name and url only)
     *
     * @return the list of fighters
     */
    public List<SherdogBaseObject> getFighters() {
        return dryFighters;
    }

    /**
     * Gets the simple version of the events(name and url only)
     *
     * @return the list of fighters
     */
    public List<SherdogBaseObject> getEvents() {
        return dryEvents;
    }

    /**
     * Gets the fighter with the full data
     * This method can be long as it will query each fighter page
     *
     * @return the list of fighters
     */
    public List<Fighter> getFightersWithCompleteData() {
        return dryFighters.stream().map(f -> {
            try {
                return sherdog.getFighter(f.getSherdogUrl());
            } catch (IOException | ParseException | SherdogParserException e) {
                return null;
            }
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

    /**
     * Gets the events with the full data
     * This method can be long as it will query each event page
     *
     * @return the list of events
     */
    public List<Event> getEventsWithCompleteData() {
        return dryEvents.stream().map(f -> {
            try {
                return sherdog.getEvent(f.getSherdogUrl());
            } catch (IOException | ParseException | SherdogParserException e) {
                return null;
            }
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }
}
