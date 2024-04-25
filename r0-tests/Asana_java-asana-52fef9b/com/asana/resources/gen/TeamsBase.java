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

public class TeamsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public TeamsBase(Client client) {
        super(client);
    }

    /**
     * Add a user to a team
     * The user making this call must be a member of the team in order to add others. The user being added must exist in the same organization as the team.  Returns the complete team membership record for the newly added user.
     * @param teamGid Globally unique identifier for the team. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addUserForTeam(String teamGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/teams/{team_gid}/addUser".replace("{team_gid}", teamGid);
        itest("randoop", 31).given(teamGid, "NoAuthorizationError").checkEq(path, "/teams/NoAuthorizationError/addUser");
        itest("evosuite", 31).given(teamGid, ":@CTD=;").checkEq(path, "/teams/:@CTD=;/addUser");
        itest("randoop", 31).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/addUser");
        itest("randoop", 31).given(teamGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addUser");
        itest("randoop", 31).given(teamGid, "10").checkEq(path, "/teams/10/addUser");
        itest("randoop", 31).given(teamGid, "POST").checkEq(path, "/teams/POST/addUser");
        itest("evosuite", 31).given(teamGid, "/teams/N(OIhBER!WQ[wpzn").checkEq(path, "/teams//teams/N(OIhBER!WQ[wpzn/addUser");
        itest("randoop", 31).given(teamGid, "/tags").checkEq(path, "/teams//tags/addUser");
        itest("evosuite", 31).given(teamGid, "bH9)l7U5y").checkEq(path, "/teams/bH9)l7U5y/addUser");
        itest("randoop", 31).given(teamGid, "Not Found").checkEq(path, "/teams/Not Found/addUser");
        itest("randoop", 31).given(teamGid, "Payment Required").checkEq(path, "/teams/Payment Required/addUser");
        itest("randoop", 31).given(teamGid, "Server Error").checkEq(path, "/teams/Server Error/addUser");
        itest("evosuite", 31).given(teamGid, ") must not be negative").checkEq(path, "/teams/) must not be negative/addUser");
        itest("randoop", 31).given(teamGid, "/project_statuses/Server Error").checkEq(path, "/teams//project_statuses/Server Error/addUser");
        itest("randoop", 31).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addUser");
        itest("randoop", 31).given(teamGid, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old/addUser");
        itest("evosuite", 31).given(teamGid, "/teams//teams/N(OIhBER!WQ[wpzn/addUser").checkEq(path, "/teams//teams//teams/N(OIhBER!WQ[wpzn/addUser/addUser");
        itest("evosuite", 31).given(teamGid, "oFnk").checkEq(path, "/teams/oFnk/addUser");
        itest("randoop", 31).given(teamGid, "/attachments/Not Found").checkEq(path, "/teams//attachments/Not Found/addUser");
        itest("randoop", 31).given(teamGid, "Rate Limit Enforced").checkEq(path, "/teams/Rate Limit Enforced/addUser");
        itest("evosuite", 31).given(teamGid, "Y").checkEq(path, "/teams/Y/addUser");
        itest("randoop", 31).given(teamGid, "Forbidden").checkEq(path, "/teams/Forbidden/addUser");
        itest("randoop", 31).given(teamGid, "").checkEq(path, "/teams//addUser");
        itest("evosuite", 31).given(teamGid, "GET").checkEq(path, "/teams/GET/addUser");
        itest("evosuite", 31).given(teamGid, "Ul").checkEq(path, "/teams/Ul/addUser");
        itest("randoop", 31).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/addUser");
        itest("randoop", 31).given(teamGid, "hi!").checkEq(path, "/teams/hi!/addUser");
        itest("randoop", 31).given(teamGid, "Invalid Request").checkEq(path, "/teams/Invalid Request/addUser");
        itest("randoop", 31).given(teamGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/teams/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addUser");
        itest("randoop", 31).given(teamGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//goals/{goal_gid}/addSubgoal/addUser");
        itest("evosuite", 31).given(teamGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/teams/urn:ietf:wg:oauth:2.0:oob/addUser");
        itest("randoop", 31).given(teamGid, "/goals/Sync token invalid or too old").checkEq(path, "/teams//goals/Sync token invalid or too old/addUser");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addUserForTeam(String teamGid) throws IOException {
        return addUserForTeam(teamGid, null, false);
    }

    /**
     * Create a team
     * Creates a team within the current workspace.
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Team)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Team> createTeam(String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/teams";
        ItemRequest<Team> req = new ItemRequest<Team>(this, Team.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<Team> createTeam() throws IOException {
        return createTeam(null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get a team
     * Returns the full record for a single team.
     * @param teamGid Globally unique identifier for the team. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Team)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Team> getTeam(String teamGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/teams/{team_gid}".replace("{team_gid}", teamGid);
        itest("randoop", 80).given(teamGid, "10").checkEq(path, "/teams/10");
        itest("evosuite", 80).given(teamGid, "M%e--u").checkEq(path, "/teams/M%e--u");
        itest("randoop", 80).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 80).given(teamGid, "GET").checkEq(path, "/teams/GET");
        itest("randoop", 80).given(teamGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: Server Error");
        itest("evosuite", 80).given(teamGid, "/teams/M/removeUser").checkEq(path, "/teams//teams/M/removeUser");
        itest("randoop", 80).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 80).given(teamGid, "Invalid Request").checkEq(path, "/teams/Invalid Request");
        itest("randoop", 80).given(teamGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/teams/com.asana.errors.AsanaError: hi!");
        itest("randoop", 80).given(teamGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/teams//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("evosuite", 80).given(teamGid, "").checkEq(path, "/teams/");
        itest("evosuite", 80).given(teamGid, "Y").checkEq(path, "/teams/Y");
        itest("randoop", 80).given(teamGid, "Forbidden").checkEq(path, "/teams/Forbidden");
        itest("randoop", 80).given(teamGid, "/attachments/").checkEq(path, "/teams//attachments/");
        itest("randoop", 80).given(teamGid, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old");
        itest("randoop", 80).given(teamGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 80).given(teamGid, "Payment Required").checkEq(path, "/teams/Payment Required");
        itest("randoop", 80).given(teamGid, "POST").checkEq(path, "/teams/POST");
        itest("evosuite", 80).given(teamGid, "/teams/urn:ietf:wg:oauth:2.0:oob/addUser").checkEq(path, "/teams//teams/urn:ietf:wg:oauth:2.0:oob/addUser");
        itest("randoop", 80).given(teamGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 80).given(teamGid, "cAn?5").checkEq(path, "/teams/cAn?5");
        itest("randoop", 80).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 80).given(teamGid, "Not Found").checkEq(path, "/teams/Not Found");
        itest("evosuite", 80).given(teamGid, "\"-z`nRa'.S HT^%q5").checkEq(path, "/teams/\"-z`nRa'.S HT^%q5");
        itest("evosuite", 80).given(teamGid, "N(OIhBER!WQ[wpzn").checkEq(path, "/teams/N(OIhBER!WQ[wpzn");
        itest("randoop", 80).given(teamGid, "/tasks/200/addProject").checkEq(path, "/teams//tasks/200/addProject");
        itest("randoop", 80).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 80).given(teamGid, "/attachments/Not Found").checkEq(path, "/teams//attachments/Not Found");
        itest("randoop", 80).given(teamGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/teams/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 80).given(teamGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//goals/{goal_gid}/addSubgoal");
        itest("randoop", 80).given(teamGid, "").checkEq(path, "/teams/");
        itest("randoop", 80).given(teamGid, "0").checkEq(path, "/teams/0");
        itest("randoop", 80).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 80).given(teamGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/teams//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 80).given(teamGid, "/custom_fields//enum_options/insert").checkEq(path, "/teams//custom_fields//enum_options/insert");
        itest("evosuite", 80).given(teamGid, "POST").checkEq(path, "/teams/POST");
        ItemRequest<Team> req = new ItemRequest<Team>(this, Team.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<Team> getTeam(String teamGid) throws IOException {
        return getTeam(teamGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get teams in an organization
     * Returns the compact records for all teams in the organization visible to the authorized user.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Team)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Team> getTeamsForOrganization(String workspaceGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/organizations/{workspace_gid}/teams".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/teams");
        itest("randoop", 106).given(workspaceGid, "").checkEq(path, "/organizations//teams");
        itest("randoop", 106).given(workspaceGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/organizations/com.asana.errors.InvalidTokenError: Sync token invalid or too old/teams");
        itest("randoop", 106).given(workspaceGid, "Invalid Request").checkEq(path, "/organizations/Invalid Request/teams");
        itest("evosuite", 106).given(workspaceGid, "<ZiAVn$xn3(exK~EdZ{").checkEq(path, "/organizations/<ZiAVn$xn3(exK~EdZ{/teams");
        itest("evosuite", 106).given(workspaceGid, "Y").checkEq(path, "/organizations/Y/teams");
        itest("randoop", 106).given(workspaceGid, "Server Error").checkEq(path, "/organizations/Server Error/teams");
        itest("randoop", 106).given(workspaceGid, "Not Found").checkEq(path, "/organizations/Not Found/teams");
        itest("randoop", 106).given(workspaceGid, "GET").checkEq(path, "/organizations/GET/teams");
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/teams");
        itest("evosuite", 106).given(workspaceGid, "y%/vcHC=").checkEq(path, "/organizations/y%/vcHC=/teams");
        itest("randoop", 106).given(workspaceGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/organizations//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/teams");
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/teams");
        itest("randoop", 106).given(workspaceGid, "/goals/Sync token invalid or too old").checkEq(path, "/organizations//goals/Sync token invalid or too old/teams");
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/teams");
        itest("randoop", 106).given(workspaceGid, "Rate Limit Enforced").checkEq(path, "/organizations/Rate Limit Enforced/teams");
        itest("randoop", 106).given(workspaceGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/organizations/com.asana.errors.RetryableAsanaError: /portfolios//teams");
        itest("randoop", 106).given(workspaceGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/organizations//portfolio_memberships//goals/{goal_gid}/addSubgoal/teams");
        itest("randoop", 106).given(workspaceGid, "Sync token invalid or too old").checkEq(path, "/organizations/Sync token invalid or too old/teams");
        itest("randoop", 106).given(workspaceGid, "/tags/Payment Required").checkEq(path, "/organizations//tags/Payment Required/teams");
        itest("randoop", 106).given(workspaceGid, "POST").checkEq(path, "/organizations/POST/teams");
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/teams");
        itest("randoop", 106).given(workspaceGid, "10").checkEq(path, "/organizations/10/teams");
        itest("evosuite", 106).given(workspaceGid, "#-").checkEq(path, "/organizations/#-/teams");
        itest("randoop", 106).given(workspaceGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/organizations//portfolios//goals/{goal_gid}/subgoals/teams");
        itest("randoop", 106).given(workspaceGid, "200").checkEq(path, "/organizations/200/teams");
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/teams");
        itest("randoop", 106).given(workspaceGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/organizations/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/teams");
        itest("randoop", 106).given(workspaceGid, "Payment Required").checkEq(path, "/organizations/Payment Required/teams");
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/teams");
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//teams");
        itest("randoop", 106).given(workspaceGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/organizations/urn:ietf:wg:oauth:2.0:oob/teams");
        itest("evosuite", 106).given(workspaceGid, "/#iS &QU[v-Ra").checkEq(path, "/organizations//#iS &QU[v-Ra/teams");
        itest("randoop", 106).given(workspaceGid, "/attachments/Not Found").checkEq(path, "/organizations//attachments/Not Found/teams");
        itest("randoop", 106).given(workspaceGid, "0").checkEq(path, "/organizations/0/teams");
        itest("evosuite", 106).given(workspaceGid, "I>t7").checkEq(path, "/organizations/I>t7/teams");
        itest("randoop", 106).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/teams");
        itest("evosuite", 106).given(workspaceGid, "com.asana.resources.CustomFieldSettings").checkEq(path, "/organizations/com.asana.resources.CustomFieldSettings/teams");
        itest("randoop", 106).given(workspaceGid, "/tasks/GET").checkEq(path, "/organizations//tasks/GET/teams");
        CollectionRequest<Team> req = new CollectionRequest<Team>(this, Team.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Team> getTeamsForOrganization(String workspaceGid) throws IOException {
        return getTeamsForOrganization(workspaceGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get teams for a user
     * Returns the compact records for all teams to which the given user is assigned.
     * @param userGid A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (required)
     * @param organization The workspace or organization to filter teams on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Team)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Team> getTeamsForUser(String userGid, String organization, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/users/{user_gid}/teams".replace("{user_gid}", userGid);
        itest("randoop", 133).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/teams");
        itest("randoop", 133).given(userGid, "/attachments/Not Found").checkEq(path, "/users//attachments/Not Found/teams");
        itest("evosuite", 133).given(userGid, "Xuz!_Yja#").checkEq(path, "/users/Xuz!_Yja#/teams");
        itest("randoop", 133).given(userGid, "/portfolios/").checkEq(path, "/users//portfolios//teams");
        itest("randoop", 133).given(userGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/users/com.asana.errors.RetryableAsanaError: Server Error/teams");
        itest("randoop", 133).given(userGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/users/com.asana.errors.AsanaError: hi!/teams");
        itest("randoop", 133).given(userGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/users//projects/Rate Limit Enforced/sections/teams");
        itest("randoop", 133).given(userGid, "Not Found").checkEq(path, "/users/Not Found/teams");
        itest("randoop", 133).given(userGid, "Payment Required").checkEq(path, "/users/Payment Required/teams");
        itest("randoop", 133).given(userGid, "").checkEq(path, "/users//teams");
        itest("randoop", 133).given(userGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/users//tasks//attachments/Not Found/addProject/teams");
        itest("randoop", 133).given(userGid, "/workspaces/").checkEq(path, "/users//workspaces//teams");
        itest("randoop", 133).given(userGid, "hi!").checkEq(path, "/users/hi!/teams");
        itest("evosuite", 133).given(userGid, "projects.all").checkEq(path, "/users/projects.all/teams");
        itest("randoop", 133).given(userGid, "10").checkEq(path, "/users/10/teams");
        itest("evosuite", 133).given(userGid, "").checkEq(path, "/users//teams");
        itest("randoop", 133).given(userGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/users//goals/{goal_gid}/subgoals/teams");
        itest("randoop", 133).given(userGid, "/webhooks/NoAuthorizationError").checkEq(path, "/users//webhooks/NoAuthorizationError/teams");
        itest("randoop", 133).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/teams");
        itest("randoop", 133).given(userGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/teams");
        itest("randoop", 133).given(userGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/teams");
        itest("evosuite", 133).given(userGid, "Q0I>'p`qS{-7S").checkEq(path, "/users/Q0I>'p`qS{-7S/teams");
        itest("randoop", 133).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/teams");
        itest("randoop", 133).given(userGid, "POST").checkEq(path, "/users/POST/teams");
        itest("randoop", 133).given(userGid, "Invalid Request").checkEq(path, "/users/Invalid Request/teams");
        itest("randoop", 133).given(userGid, "Rate Limit Enforced").checkEq(path, "/users/Rate Limit Enforced/teams");
        itest("randoop", 133).given(userGid, "200").checkEq(path, "/users/200/teams");
        itest("randoop", 133).given(userGid, "Server Error").checkEq(path, "/users/Server Error/teams");
        itest("randoop", 133).given(userGid, "/portfolios/GET/removeMembers").checkEq(path, "/users//portfolios/GET/removeMembers/teams");
        itest("randoop", 133).given(userGid, "/organizations//teams").checkEq(path, "/users//organizations//teams/teams");
        itest("randoop", 133).given(userGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/users/urn:ietf:wg:oauth:2.0:oob/teams");
        itest("randoop", 133).given(userGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/users//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/teams");
        itest("randoop", 133).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//teams");
        CollectionRequest<Team> req = new CollectionRequest<Team>(this, Team.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("organization", organization);
        return req;
    }

    public CollectionRequest<Team> getTeamsForUser(String userGid, String organization) throws IOException {
        return getTeamsForUser(userGid, organization, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Remove a user from a team
     * The user making this call must be a member of the team in order to remove themselves or others.
     * @param teamGid Globally unique identifier for the team. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeUserForTeam(String teamGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/teams/{team_gid}/removeUser".replace("{team_gid}", teamGid);
        itest("randoop", 158).given(teamGid, "/workspaces/").checkEq(path, "/teams//workspaces//removeUser");
        itest("randoop", 158).given(teamGid, "POST").checkEq(path, "/teams/POST/removeUser");
        itest("randoop", 158).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeUser");
        itest("randoop", 158).given(teamGid, "hi!").checkEq(path, "/teams/hi!/removeUser");
        itest("randoop", 158).given(teamGid, "200").checkEq(path, "/teams/200/removeUser");
        itest("randoop", 158).given(teamGid, "GET").checkEq(path, "/teams/GET/removeUser");
        itest("randoop", 158).given(teamGid, "Invalid Request").checkEq(path, "/teams/Invalid Request/removeUser");
        itest("randoop", 158).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/removeUser");
        itest("randoop", 158).given(teamGid, "Not Found").checkEq(path, "/teams/Not Found/removeUser");
        itest("randoop", 158).given(teamGid, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old/removeUser");
        itest("randoop", 158).given(teamGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/teams//tasks//attachments/Not Found/addProject/removeUser");
        itest("randoop", 158).given(teamGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/teams/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeUser");
        itest("evosuite", 158).given(teamGid, "M").checkEq(path, "/teams/M/removeUser");
        itest("randoop", 158).given(teamGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeUser");
        itest("evosuite", 158).given(teamGid, "]:e#jx C}40n!@L>-(").checkEq(path, "/teams/]:e#jx C}40n!@L>-(/removeUser");
        itest("randoop", 158).given(teamGid, "/webhooks/NoAuthorizationError").checkEq(path, "/teams//webhooks/NoAuthorizationError/removeUser");
        itest("randoop", 158).given(teamGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/teams//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/removeUser");
        itest("randoop", 158).given(teamGid, "/portfolios/").checkEq(path, "/teams//portfolios//removeUser");
        itest("randoop", 158).given(teamGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: Server Error/removeUser");
        itest("randoop", 158).given(teamGid, "Forbidden").checkEq(path, "/teams/Forbidden/removeUser");
        itest("randoop", 158).given(teamGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeUser");
        itest("randoop", 158).given(teamGid, "").checkEq(path, "/teams//removeUser");
        itest("evosuite", 158).given(teamGid, "").checkEq(path, "/teams//removeUser");
        itest("randoop", 158).given(teamGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: /portfolios//removeUser");
        itest("evosuite", 158).given(teamGid, "/teams/{team_gid}/removeUser").checkEq(path, "/teams//teams/{team_gid}/removeUser/removeUser");
        itest("randoop", 158).given(teamGid, "Server Error").checkEq(path, "/teams/Server Error/removeUser");
        itest("randoop", 158).given(teamGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/teams//workspaces//goals/{goal_gid}/subgoals/tasks/removeUser");
        itest("randoop", 158).given(teamGid, "10").checkEq(path, "/teams/10/removeUser");
        itest("randoop", 158).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeUser");
        itest("randoop", 158).given(teamGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/teams//portfolios//goals/{goal_gid}/subgoals/removeUser");
        itest("randoop", 158).given(teamGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/teams/com.asana.errors.PremiumOnlyError: Payment Required/removeUser");
        itest("evosuite", 158).given(teamGid, "<bA}`]rG").checkEq(path, "/teams/<bA}`]rG/removeUser");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeUserForTeam(String teamGid) throws IOException {
        return removeUserForTeam(teamGid, null, false);
    }
}
