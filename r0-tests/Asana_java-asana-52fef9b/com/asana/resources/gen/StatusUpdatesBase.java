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

public class StatusUpdatesBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public StatusUpdatesBase(Client client) {
        super(client);
    }

    /**
     * Create a status update
     * Creates a new status update on an object. Returns the full record of the newly created status update.
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> createStatusForObject(String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/status_updates";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<JsonElement> createStatusForObject() throws IOException {
        return createStatusForObject(null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Delete a status update
     * Deletes a specific, existing status update.  Returns an empty data record.
     * @param statusGid The status update to get. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteStatus(String statusGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/status_updates/{status_gid}".replace("{status_gid}", statusGid);
        itest("evosuite", 56).given(statusGid, "").checkEq(path, "/status_updates/");
        itest("randoop", 56).given(statusGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/status_updates/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 56).given(statusGid, "SLASHASSIGN").checkEq(path, "/status_updates/SLASHASSIGN");
        itest("randoop", 56).given(statusGid, "/workspaces/").checkEq(path, "/status_updates//workspaces/");
        itest("randoop", 56).given(statusGid, "Rate Limit Enforced").checkEq(path, "/status_updates/Rate Limit Enforced");
        itest("randoop", 56).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 56).given(statusGid, "").checkEq(path, "/status_updates/");
        itest("randoop", 56).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 56).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 56).given(statusGid, "POST").checkEq(path, "/status_updates/POST");
        itest("evosuite", 56).given(statusGid, "GET").checkEq(path, "/status_updates/GET");
        itest("randoop", 56).given(statusGid, "/workspaces//addUser").checkEq(path, "/status_updates//workspaces//addUser");
        itest("randoop", 56).given(statusGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/status_updates/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 56).given(statusGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/status_updates/com.asana.errors.AsanaError: hi!");
        itest("randoop", 56).given(statusGid, "NoAuthorizationError").checkEq(path, "/status_updates/NoAuthorizationError");
        itest("evosuite", 56).given(statusGid, "DEh").checkEq(path, "/status_updates/DEh");
        itest("randoop", 56).given(statusGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/status_updates//projects/Rate Limit Enforced/sections");
        itest("randoop", 56).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 56).given(statusGid, "hi!").checkEq(path, "/status_updates/hi!");
        itest("randoop", 56).given(statusGid, "Forbidden").checkEq(path, "/status_updates/Forbidden");
        itest("evosuite", 56).given(statusGid, "&9o").checkEq(path, "/status_updates/&9o");
        itest("randoop", 56).given(statusGid, "Not Found").checkEq(path, "/status_updates/Not Found");
        itest("randoop", 56).given(statusGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/status_updates//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 56).given(statusGid, "Invalid Request").checkEq(path, "/status_updates/Invalid Request");
        itest("randoop", 56).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 56).given(statusGid, "Payment Required").checkEq(path, "/status_updates/Payment Required");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteStatus(String statusGid) throws IOException {
        return deleteStatus(statusGid, null, false);
    }

    /**
     * Get a status update
     * Returns the complete record for a single status update.
     * @param statusGid The status update to get. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> getStatus(String statusGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/status_updates/{status_gid}".replace("{status_gid}", statusGid);
        itest("randoop", 78).given(statusGid, "Server Error").checkEq(path, "/status_updates/Server Error");
        itest("randoop", 78).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 78).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 78).given(statusGid, "Invalid Request").checkEq(path, "/status_updates/Invalid Request");
        itest("randoop", 78).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 78).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("evosuite", 78).given(statusGid, "14*WYQUg^9S5").checkEq(path, "/status_updates/14*WYQUg^9S5");
        itest("evosuite", 78).given(statusGid, "tfB%SB.%\"").checkEq(path, "/status_updates/tfB%SB.%\"");
        itest("evosuite", 78).given(statusGid, "POST").checkEq(path, "/status_updates/POST");
        itest("randoop", 78).given(statusGid, "").checkEq(path, "/status_updates/");
        itest("randoop", 78).given(statusGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/status_updates//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 78).given(statusGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/status_updates/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 78).given(statusGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/status_updates/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 78).given(statusGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/status_updates//goals/{goal_gid}/addSubgoal");
        itest("randoop", 78).given(statusGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/status_updates/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 78).given(statusGid, "Not Found").checkEq(path, "/status_updates/Not Found");
        itest("randoop", 78).given(statusGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/status_updates//goals/{goal_gid}/subgoals");
        itest("evosuite", 78).given(statusGid, "9ek8j9`?SI3-=HBI[").checkEq(path, "/status_updates/9ek8j9`?SI3-=HBI[");
        itest("randoop", 78).given(statusGid, "Sync token invalid or too old").checkEq(path, "/status_updates/Sync token invalid or too old");
        itest("randoop", 78).given(statusGid, "/attachments/Not Found").checkEq(path, "/status_updates//attachments/Not Found");
        itest("randoop", 78).given(statusGid, "/tags").checkEq(path, "/status_updates//tags");
        itest("evosuite", 78).given(statusGid, "/workspaces/{workspace_gid}/projects").checkEq(path, "/status_updates//workspaces/{workspace_gid}/projects");
        itest("randoop", 78).given(statusGid, "Payment Required").checkEq(path, "/status_updates/Payment Required");
        itest("randoop", 78).given(statusGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 78).given(statusGid, "").checkEq(path, "/status_updates/");
        itest("randoop", 78).given(statusGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/status_updates//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("evosuite", 78).given(statusGid, "count").checkEq(path, "/status_updates/count");
        itest("evosuite", 78).given(statusGid, "K7hF$J6 y/").checkEq(path, "/status_updates/K7hF$J6 y/");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> getStatus(String statusGid) throws IOException {
        return getStatus(statusGid, null, false);
    }

    /**
     * Get status updates from an object
     * Returns the compact status update records for all updates on the object.
     * @param createdSince Only return statuses that have been created since the given time. (optional)
     * @param parent Globally unique identifier for object to fetch statuses from. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getStatusesForObject(OffsetDateTime createdSince, String parent, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/status_updates";
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("parent", parent).query("created_since", createdSince);
        return req;
    }

    public CollectionRequest<JsonElement> getStatusesForObject(OffsetDateTime createdSince, String parent) throws IOException {
        return getStatusesForObject(createdSince, parent, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
