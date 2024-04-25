package com.asana.resources.gen;

import com.asana.Client;
import com.asana.resources.Resource;
import com.asana.requests.ItemRequest;
import com.asana.requests.CollectionRequest;
import com.asana.models.*;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class TimePeriodsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public TimePeriodsBase(Client client) {
        super(client);
    }

    /**
     * Get a time period
     * Returns the full record for a single time period.
     * @param timePeriodGid Globally unique identifier for the time period. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> getTimePeriod(String timePeriodGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/time_periods/{time_period_gid}".replace("{time_period_gid}", timePeriodGid);
        itest("randoop", 31).given(timePeriodGid, "/tasks/GET").checkEq(path, "/time_periods//tasks/GET");
        itest("randoop", 31).given(timePeriodGid, "").checkEq(path, "/time_periods/");
        itest("evosuite", 31).given(timePeriodGid, "Iq!b`Ae=m").checkEq(path, "/time_periods/Iq!b`Ae=m");
        itest("randoop", 31).given(timePeriodGid, "/webhooks/NoAuthorizationError").checkEq(path, "/time_periods//webhooks/NoAuthorizationError");
        itest("randoop", 31).given(timePeriodGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/time_periods//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 31).given(timePeriodGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/time_periods//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 31).given(timePeriodGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/time_periods/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 31).given(timePeriodGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/time_periods//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 31).given(timePeriodGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/time_periods//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("evosuite", 31).given(timePeriodGid, " }Z").checkEq(path, "/time_periods/ }Z");
        itest("randoop", 31).given(timePeriodGid, "Not Found").checkEq(path, "/time_periods/Not Found");
        itest("randoop", 31).given(timePeriodGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/time_periods/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 31).given(timePeriodGid, "com.github.javaparser.ast.Node$PreOrderIterator").checkEq(path, "/time_periods/com.github.javaparser.ast.Node$PreOrderIterator");
        itest("randoop", 31).given(timePeriodGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/time_periods/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 31).given(timePeriodGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/time_periods/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("evosuite", 31).given(timePeriodGid, "UT}c4&HRf").checkEq(path, "/time_periods/UT}c4&HRf");
        itest("randoop", 31).given(timePeriodGid, "Sync token invalid or too old").checkEq(path, "/time_periods/Sync token invalid or too old");
        itest("randoop", 31).given(timePeriodGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/time_periods/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 31).given(timePeriodGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/time_periods/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 31).given(timePeriodGid, "/tags").checkEq(path, "/time_periods//tags");
        itest("randoop", 31).given(timePeriodGid, "Payment Required").checkEq(path, "/time_periods/Payment Required");
        itest("randoop", 31).given(timePeriodGid, "Rate Limit Enforced").checkEq(path, "/time_periods/Rate Limit Enforced");
        itest("randoop", 31).given(timePeriodGid, "GET").checkEq(path, "/time_periods/GET");
        itest("randoop", 31).given(timePeriodGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/time_periods//goals/{goal_gid}/subgoals");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> getTimePeriod(String timePeriodGid) throws IOException {
        return getTimePeriod(timePeriodGid, null, false);
    }

    /**
     * Get time periods
     * Returns compact time period records.
     * @param endOn ISO 8601 date string (optional)
     * @param startOn ISO 8601 date string (optional)
     * @param workspace Globally unique identifier for the workspace. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getTimePeriods(LocalDate endOn, LocalDate startOn, String workspace, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/time_periods";
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("start_on", startOn).query("end_on", endOn).query("workspace", workspace);
        return req;
    }

    public CollectionRequest<JsonElement> getTimePeriods(LocalDate endOn, LocalDate startOn, String workspace) throws IOException {
        return getTimePeriods(endOn, startOn, workspace, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
