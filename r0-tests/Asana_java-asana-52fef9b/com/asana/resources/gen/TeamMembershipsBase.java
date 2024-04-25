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

public class TeamMembershipsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public TeamMembershipsBase(Client client) {
        super(client);
    }

    /**
     * Get a team membership
     * Returns the complete team membership record for a single team membership.
     * @param teamMembershipGid  (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> getTeamMembership(String teamMembershipGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/team_memberships/{team_membership_gid}".replace("{team_membership_gid}", teamMembershipGid);
        itest("randoop", 31).given(teamMembershipGid, "/portfolios/").checkEq(path, "/team_memberships//portfolios/");
        itest("randoop", 31).given(teamMembershipGid, "NoAuthorizationError").checkEq(path, "/team_memberships/NoAuthorizationError");
        itest("randoop", 31).given(teamMembershipGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/team_memberships//goals/{goal_gid}/subgoals");
        itest("randoop", 31).given(teamMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/team_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 31).given(teamMembershipGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/team_memberships//tasks//attachments/Not Found/addProject");
        itest("randoop", 31).given(teamMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/team_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 31).given(teamMembershipGid, "0").checkEq(path, "/team_memberships/0");
        itest("randoop", 31).given(teamMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/team_memberships/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 31).given(teamMembershipGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/team_memberships//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 31).given(teamMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/team_memberships/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 31).given(teamMembershipGid, "Payment Required").checkEq(path, "/team_memberships/Payment Required");
        itest("randoop", 31).given(teamMembershipGid, "/tasks/200/addProject").checkEq(path, "/team_memberships//tasks/200/addProject");
        itest("randoop", 31).given(teamMembershipGid, "/tasks/GET").checkEq(path, "/team_memberships//tasks/GET");
        itest("randoop", 31).given(teamMembershipGid, "Not Found").checkEq(path, "/team_memberships/Not Found");
        itest("randoop", 31).given(teamMembershipGid, "/attachments/Not Found").checkEq(path, "/team_memberships//attachments/Not Found");
        itest("randoop", 31).given(teamMembershipGid, "10").checkEq(path, "/team_memberships/10");
        itest("randoop", 31).given(teamMembershipGid, "200").checkEq(path, "/team_memberships/200");
        itest("randoop", 31).given(teamMembershipGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/team_memberships//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 31).given(teamMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/team_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 31).given(teamMembershipGid, "/goals/Sync token invalid or too old").checkEq(path, "/team_memberships//goals/Sync token invalid or too old");
        itest("randoop", 31).given(teamMembershipGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/team_memberships/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 31).given(teamMembershipGid, "Rate Limit Enforced").checkEq(path, "/team_memberships/Rate Limit Enforced");
        itest("randoop", 31).given(teamMembershipGid, "Server Error").checkEq(path, "/team_memberships/Server Error");
        itest("randoop", 31).given(teamMembershipGid, "/tags/Payment Required").checkEq(path, "/team_memberships//tags/Payment Required");
        itest("randoop", 31).given(teamMembershipGid, "/custom_fields//enum_options/insert").checkEq(path, "/team_memberships//custom_fields//enum_options/insert");
        itest("randoop", 31).given(teamMembershipGid, "GET").checkEq(path, "/team_memberships/GET");
        itest("randoop", 31).given(teamMembershipGid, "Forbidden").checkEq(path, "/team_memberships/Forbidden");
        itest("evosuite", 31).given(teamMembershipGid, "\r").checkEq(path, "/team_memberships/\r");
        itest("randoop", 31).given(teamMembershipGid, "POST").checkEq(path, "/team_memberships/POST");
        itest("randoop", 31).given(teamMembershipGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/team_memberships//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 31).given(teamMembershipGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/team_memberships/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 31).given(teamMembershipGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/team_memberships/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 31).given(teamMembershipGid, "Sync token invalid or too old").checkEq(path, "/team_memberships/Sync token invalid or too old");
        itest("randoop", 31).given(teamMembershipGid, "Invalid Request").checkEq(path, "/team_memberships/Invalid Request");
        itest("randoop", 31).given(teamMembershipGid, "").checkEq(path, "/team_memberships/");
        itest("evosuite", 31).given(teamMembershipGid, "GET").checkEq(path, "/team_memberships/GET");
        itest("randoop", 31).given(teamMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/team_memberships/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> getTeamMembership(String teamMembershipGid) throws IOException {
        return getTeamMembership(teamMembershipGid, null, false);
    }

    /**
     * Get team memberships
     * Returns compact team membership records.
     * @param workspace Globally unique identifier for the workspace. This parameter must be used with the user parameter. (optional)
     * @param user A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. This parameter must be used with the workspace parameter. (optional)
     * @param team Globally unique identifier for the team. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getTeamMemberships(String workspace, String user, String team, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/team_memberships";
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("team", team).query("user", user).query("workspace", workspace);
        return req;
    }

    public CollectionRequest<JsonElement> getTeamMemberships(String workspace, String user, String team) throws IOException {
        return getTeamMemberships(workspace, user, team, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get memberships from a team
     * Returns the compact team memberships for the team.
     * @param teamGid Globally unique identifier for the team. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getTeamMembershipsForTeam(String teamGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/teams/{team_gid}/team_memberships".replace("{team_gid}", teamGid);
        itest("randoop", 86).given(teamGid, "200").checkEq(path, "/teams/200/team_memberships");
        itest("randoop", 86).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/team_memberships");
        itest("randoop", 86).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/team_memberships");
        itest("randoop", 86).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/team_memberships");
        itest("evosuite", 86).given(teamGid, "/team_memberships/GET").checkEq(path, "/teams//team_memberships/GET/team_memberships");
        itest("randoop", 86).given(teamGid, "0").checkEq(path, "/teams/0/team_memberships");
        itest("randoop", 86).given(teamGid, "POST").checkEq(path, "/teams/POST/team_memberships");
        itest("randoop", 86).given(teamGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/teams/com.asana.errors.PremiumOnlyError: Payment Required/team_memberships");
        itest("randoop", 86).given(teamGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/teams//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/team_memberships");
        itest("randoop", 86).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/team_memberships");
        itest("randoop", 86).given(teamGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//goals/{goal_gid}/addSubgoal/team_memberships");
        itest("randoop", 86).given(teamGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/teams//tasks//attachments/Not Found/addProject/team_memberships");
        itest("randoop", 86).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/team_memberships");
        itest("evosuite", 86).given(teamGid, "team").checkEq(path, "/teams/team/team_memberships");
        itest("randoop", 86).given(teamGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/team_memberships");
        itest("randoop", 86).given(teamGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//portfolio_memberships//goals/{goal_gid}/addSubgoal/team_memberships");
        itest("randoop", 86).given(teamGid, "/organizations//teams").checkEq(path, "/teams//organizations//teams/team_memberships");
        itest("randoop", 86).given(teamGid, "/webhooks/NoAuthorizationError").checkEq(path, "/teams//webhooks/NoAuthorizationError/team_memberships");
        itest("randoop", 86).given(teamGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/teams/com.asana.errors.InvalidTokenError: Sync token invalid or too old/team_memberships");
        itest("randoop", 86).given(teamGid, "").checkEq(path, "/teams//team_memberships");
        itest("evosuite", 86).given(teamGid, "><z`!:8a[(Wg$,D").checkEq(path, "/teams/><z`!:8a[(Wg$,D/team_memberships");
        itest("randoop", 86).given(teamGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: Server Error/team_memberships");
        itest("randoop", 86).given(teamGid, "/attachments/").checkEq(path, "/teams//attachments//team_memberships");
        itest("randoop", 86).given(teamGid, "hi!").checkEq(path, "/teams/hi!/team_memberships");
        itest("randoop", 86).given(teamGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/teams/urn:ietf:wg:oauth:2.0:oob/team_memberships");
        itest("randoop", 86).given(teamGid, "Invalid Request").checkEq(path, "/teams/Invalid Request/team_memberships");
        itest("randoop", 86).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/team_memberships");
        itest("randoop", 86).given(teamGid, "/attachments/Not Found").checkEq(path, "/teams//attachments/Not Found/team_memberships");
        itest("evosuite", 86).given(teamGid, "IPK").checkEq(path, "/teams/IPK/team_memberships");
        itest("evosuite", 86).given(teamGid, "").checkEq(path, "/teams//team_memberships");
        itest("randoop", 86).given(teamGid, "Not Found").checkEq(path, "/teams/Not Found/team_memberships");
        itest("randoop", 86).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/team_memberships");
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<JsonElement> getTeamMembershipsForTeam(String teamGid) throws IOException {
        return getTeamMembershipsForTeam(teamGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get memberships from a user
     * Returns the compact team membership records for the user.
     * @param userGid A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (required)
     * @param workspace Globally unique identifier for the workspace. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getTeamMembershipsForUser(String userGid, String workspace, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/users/{user_gid}/team_memberships".replace("{user_gid}", userGid);
        itest("randoop", 113).given(userGid, "Rate Limit Enforced").checkEq(path, "/users/Rate Limit Enforced/team_memberships");
        itest("randoop", 113).given(userGid, "Forbidden").checkEq(path, "/users/Forbidden/team_memberships");
        itest("randoop", 113).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/team_memberships");
        itest("evosuite", 113).given(userGid, "/team_memberships").checkEq(path, "/users//team_memberships/team_memberships");
        itest("randoop", 113).given(userGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/users//portfolios//goals/{goal_gid}/subgoals/team_memberships");
        itest("randoop", 113).given(userGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/team_memberships");
        itest("randoop", 113).given(userGid, "GET").checkEq(path, "/users/GET/team_memberships");
        itest("randoop", 113).given(userGid, "/portfolios/").checkEq(path, "/users//portfolios//team_memberships");
        itest("randoop", 113).given(userGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/users/com.asana.errors.PremiumOnlyError: Payment Required/team_memberships");
        itest("evosuite", 113).given(userGid, "user").checkEq(path, "/users/user/team_memberships");
        itest("randoop", 113).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/team_memberships");
        itest("evosuite", 113).given(userGid, "GET").checkEq(path, "/users/GET/team_memberships");
        itest("randoop", 113).given(userGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/users//goals/{goal_gid}/addSubgoal/team_memberships");
        itest("randoop", 113).given(userGid, "Server Error").checkEq(path, "/users/Server Error/team_memberships");
        itest("randoop", 113).given(userGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/users/com.asana.errors.InvalidTokenError: Sync token invalid or too old/team_memberships");
        itest("evosuite", 113).given(userGid, "AE<M]Hi/^l/Q$\"yw#_J").checkEq(path, "/users/AE<M]Hi/^l/Q$\"yw#_J/team_memberships");
        itest("randoop", 113).given(userGid, "Invalid Request").checkEq(path, "/users/Invalid Request/team_memberships");
        itest("randoop", 113).given(userGid, "hi!").checkEq(path, "/users/hi!/team_memberships");
        itest("randoop", 113).given(userGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/team_memberships");
        itest("randoop", 113).given(userGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/users//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/team_memberships");
        itest("randoop", 113).given(userGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/users/urn:ietf:wg:oauth:2.0:oob/team_memberships");
        itest("randoop", 113).given(userGid, "").checkEq(path, "/users//team_memberships");
        itest("randoop", 113).given(userGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/users//projects/Rate Limit Enforced/sections/team_memberships");
        itest("randoop", 113).given(userGid, "/tags").checkEq(path, "/users//tags/team_memberships");
        itest("randoop", 113).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/team_memberships");
        itest("randoop", 113).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/team_memberships");
        itest("randoop", 113).given(userGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/users/com.asana.errors.InvalidRequestError: Invalid Request/team_memberships");
        itest("randoop", 113).given(userGid, "NoAuthorizationError").checkEq(path, "/users/NoAuthorizationError/team_memberships");
        itest("evosuite", 113).given(userGid, "com.github.javaparser.metamodel.ForStmtMetaModel").checkEq(path, "/users/com.github.javaparser.metamodel.ForStmtMetaModel/team_memberships");
        itest("evosuite", 113).given(userGid, "W,8&EeKas}").checkEq(path, "/users/W,8&EeKas}/team_memberships");
        itest("randoop", 113).given(userGid, "/attachments/Not Found").checkEq(path, "/users//attachments/Not Found/team_memberships");
        itest("randoop", 113).given(userGid, "Not Found").checkEq(path, "/users/Not Found/team_memberships");
        itest("evosuite", 113).given(userGid, "offset").checkEq(path, "/users/offset/team_memberships");
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("workspace", workspace);
        return req;
    }

    public CollectionRequest<JsonElement> getTeamMembershipsForUser(String userGid, String workspace) throws IOException {
        return getTeamMembershipsForUser(userGid, workspace, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
