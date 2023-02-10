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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 31).given(teamGid, "").checkEq(path, "/teams//addUser");
        new Here("Randoop", 31).given(teamGid, "/tasks/Not Found/removeProject").checkEq(path, "/teams//tasks/Not Found/removeProject/addUser");
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
        new Here("Randoop", 80).given(teamGid, "Rate Limit Enforced").checkEq(path, "/teams/Rate Limit Enforced");
        new Here("Randoop", 80).given(teamGid, "Server Error").checkEq(path, "/teams/Server Error");
        new Here("Randoop", 80).given(teamGid, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old");
        new Here("Randoop", 80).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error");
        new Here("Randoop", 80).given(teamGid, "POST").checkEq(path, "/teams/POST");
        new Here("Randoop", 80).given(teamGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
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
        new Here("Randoop", 106).given(workspaceGid, "").checkEq(path, "/organizations//teams");
        new Here("Randoop", 106).given(workspaceGid, "DELETE").checkEq(path, "/organizations/DELETE/teams");
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
        new Here("Randoop", 133).given(userGid, "Server Error").checkEq(path, "/users/Server Error/teams");
        new Here("Randoop", 133).given(userGid, "Sync token invalid or too old").checkEq(path, "/users/Sync token invalid or too old/teams");
        new Here("Randoop", 133).given(userGid, "hi!").checkEq(path, "/users/hi!/teams");
        new Here("Randoop", 133).given(userGid, "/tasks/Not Found/removeProject").checkEq(path, "/users//tasks/Not Found/removeProject/teams");
        new Here("Randoop", 133).given(userGid, "").checkEq(path, "/users//teams");
        new Here("Randoop", 133).given(userGid, "Not Found").checkEq(path, "/users/Not Found/teams");
        new Here("Randoop", 133).given(userGid, "com.asana.errors.RetryableAsanaError: Not Found").checkEq(path, "/users/com.asana.errors.RetryableAsanaError: Not Found/teams");
        new Here("Randoop", 133).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Invalid%20Request").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Invalid%20Request/teams");
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
        new Here("Randoop", 158).given(teamGid, "com.asana.errors.RetryableAsanaError: Not Found").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: Not Found/removeUser");
        new Here("Randoop", 158).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=com.asana.errors.RateLimitEnforcedError:%20Rate%20Limit%20Enforced").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=com.asana.errors.RateLimitEnforcedError:%20Rate%20Limit%20Enforced/removeUser");
        new Here("Randoop", 158).given(teamGid, "Not Found").checkEq(path, "/teams/Not Found/removeUser");
        new Here("Randoop", 158).given(teamGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeUser");
        new Here("Randoop", 158).given(teamGid, "").checkEq(path, "/teams//removeUser");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeUserForTeam(String teamGid) throws IOException {
        return removeUserForTeam(teamGid, null, false);
    }
}
