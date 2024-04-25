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

public class UsersBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public UsersBase(Client client) {
        super(client);
    }

    /**
     * Get a user&#x27;s favorites
     * Returns all of a user&#x27;s favorites in the given workspace, of the given type. Results are given in order (The same order as Asana&#x27;s sidebar).
     * @param userGid A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (required)
     * @param workspace The workspace in which to get favorites. (required)
     * @param resourceType The resource type of favorites to be returned. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getFavoritesForUser(String userGid, String workspace, String resourceType, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/users/{user_gid}/favorites".replace("{user_gid}", userGid);
        itest("randoop", 33).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/favorites");
        itest("randoop", 33).given(userGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/users//tasks//attachments/Not Found/addProject/favorites");
        itest("randoop", 33).given(userGid, "200").checkEq(path, "/users/200/favorites");
        itest("randoop", 33).given(userGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/users//portfolio_memberships//goals/{goal_gid}/addSubgoal/favorites");
        itest("randoop", 33).given(userGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/favorites");
        itest("randoop", 33).given(userGid, "/tags").checkEq(path, "/users//tags/favorites");
        itest("randoop", 33).given(userGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/users//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/favorites");
        itest("randoop", 33).given(userGid, "Invalid Request").checkEq(path, "/users/Invalid Request/favorites");
        itest("randoop", 33).given(userGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/users/com.asana.errors.RetryableAsanaError: 200/favorites");
        itest("randoop", 33).given(userGid, "10").checkEq(path, "/users/10/favorites");
        itest("randoop", 33).given(userGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/users/com.asana.errors.InvalidRequestError: Invalid Request/favorites");
        itest("randoop", 33).given(userGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/users/com.asana.errors.InvalidTokenError: Sync token invalid or too old/favorites");
        itest("randoop", 33).given(userGid, "Forbidden").checkEq(path, "/users/Forbidden/favorites");
        itest("evosuite", 33).given(userGid, "GET").checkEq(path, "/users/GET/favorites");
        itest("randoop", 33).given(userGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/users//goals/{goal_gid}/addSubgoal/favorites");
        itest("randoop", 33).given(userGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/users//projects/Rate Limit Enforced/sections/favorites");
        itest("randoop", 33).given(userGid, "POST").checkEq(path, "/users/POST/favorites");
        itest("randoop", 33).given(userGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/users//stories//goals/{goal_gid}/addSubgoal/favorites");
        itest("evosuite", 33).given(userGid, "").checkEq(path, "/users//favorites");
        itest("randoop", 33).given(userGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/users/urn:ietf:wg:oauth:2.0:oob/favorites");
        itest("randoop", 33).given(userGid, "Rate Limit Enforced").checkEq(path, "/users/Rate Limit Enforced/favorites");
        itest("randoop", 33).given(userGid, "").checkEq(path, "/users//favorites");
        itest("evosuite", 33).given(userGid, "3Z 84vst$~*7bE`5*").checkEq(path, "/users/3Z 84vst$~*7bE`5*/favorites");
        itest("randoop", 33).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/favorites");
        itest("randoop", 33).given(userGid, "Server Error").checkEq(path, "/users/Server Error/favorites");
        itest("randoop", 33).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/favorites");
        itest("evosuite", 33).given(userGid, "js~").checkEq(path, "/users/js~/favorites");
        itest("evosuite", 33).given(userGid, "uZG`0[#fT").checkEq(path, "/users/uZG`0[#fT/favorites");
        itest("evosuite", 33).given(userGid, "opt_fields").checkEq(path, "/users/opt_fields/favorites");
        itest("randoop", 33).given(userGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/users//goals/{goal_gid}/subgoals/favorites");
        itest("randoop", 33).given(userGid, "/attachments/Not Found").checkEq(path, "/users//attachments/Not Found/favorites");
        itest("evosuite", 33).given(userGid, "[4{141Ua|.+Iv[/kClF").checkEq(path, "/users/[4{141Ua|.+Iv[/kClF/favorites");
        itest("evosuite", 33).given(userGid, "pretty").checkEq(path, "/users/pretty/favorites");
        itest("randoop", 33).given(userGid, "GET").checkEq(path, "/users/GET/favorites");
        itest("randoop", 33).given(userGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/users/com.asana.errors.PremiumOnlyError: Payment Required/favorites");
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("resource_type", resourceType).query("workspace", workspace);
        return req;
    }

    public CollectionRequest<JsonElement> getFavoritesForUser(String userGid, String workspace, String resourceType) throws IOException {
        return getFavoritesForUser(userGid, workspace, resourceType, null, false);
    }

    /**
     * Get a user
     * Returns the full user record for the single user with the provided ID.
     * @param userGid A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(User)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<User> getUser(String userGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/users/{user_gid}".replace("{user_gid}", userGid);
        itest("evosuite", 57).given(userGid, "#g>]").checkEq(path, "/users/#g>]");
        itest("evosuite", 57).given(userGid, "").checkEq(path, "/users/");
        itest("evosuite", 57).given(userGid, "GET").checkEq(path, "/users/GET");
        itest("evosuite", 57).given(userGid, "FD@b#q,5]WSC6K)VJ&").checkEq(path, "/users/FD@b#q,5]WSC6K)VJ&");
        itest("randoop", 57).given(userGid, "hi!").checkEq(path, "/users/hi!");
        itest("randoop", 57).given(userGid, "").checkEq(path, "/users/");
        itest("randoop", 57).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 57).given(userGid, "Invalid Request").checkEq(path, "/users/Invalid Request");
        itest("randoop", 57).given(userGid, "Not Found").checkEq(path, "/users/Not Found");
        itest("evosuite", 57).given(userGid, "/users/T`Q|eD1T").checkEq(path, "/users//users/T`Q|eD1T");
        itest("randoop", 57).given(userGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/users//goals/{goal_gid}/addSubgoal");
        itest("evosuite", 57).given(userGid, "x^laz2owi.?@_").checkEq(path, "/users/x^laz2owi.?@_");
        itest("randoop", 57).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 57).given(userGid, "/webhooks/NoAuthorizationError").checkEq(path, "/users//webhooks/NoAuthorizationError");
        itest("randoop", 57).given(userGid, "POST").checkEq(path, "/users/POST");
        itest("randoop", 57).given(userGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/users//tasks//attachments/Not Found/addProject");
        itest("randoop", 57).given(userGid, "/tags/Payment Required").checkEq(path, "/users//tags/Payment Required");
        itest("randoop", 57).given(userGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/users/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 57).given(userGid, "200").checkEq(path, "/users/200");
        itest("randoop", 57).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 57).given(userGid, "T`Q|eD1T").checkEq(path, "/users/T`Q|eD1T");
        itest("randoop", 57).given(userGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 57).given(userGid, "0").checkEq(path, "/users/0");
        itest("randoop", 57).given(userGid, "Sync token invalid or too old").checkEq(path, "/users/Sync token invalid or too old");
        itest("randoop", 57).given(userGid, "Payment Required").checkEq(path, "/users/Payment Required");
        itest("randoop", 57).given(userGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/users/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 57).given(userGid, "/project_statuses/Server Error").checkEq(path, "/users//project_statuses/Server Error");
        itest("randoop", 57).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 57).given(userGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/users/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 57).given(userGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/users/com.asana.errors.AsanaError: hi!");
        ItemRequest<User> req = new ItemRequest<User>(this, User.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<User> getUser(String userGid) throws IOException {
        return getUser(userGid, null, false);
    }

    /**
     * Get multiple users
     * Returns the user records for all users in all workspaces and organizations accessible to the authenticated user. Accepts an optional workspace ID parameter. Results are sorted by user ID.
     * @param team The team ID to filter users on. (optional)
     * @param workspace The workspace or organization ID to filter users on. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(User)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<User> getUsers(String team, String workspace, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/users";
        CollectionRequest<User> req = new CollectionRequest<User>(this, User.class, path, "GET").query("workspace", workspace).query("team", team).query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<User> getUsers(String team, String workspace) throws IOException {
        return getUsers(team, workspace, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get users in a team
     * Returns the compact records for all users that are members of the team. Results are sorted alphabetically and limited to 2000. For more results use the &#x60;/users&#x60; endpoint.
     * @param teamGid Globally unique identifier for the team. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(User)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<User> getUsersForTeam(String teamGid, String offset, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/teams/{team_gid}/users".replace("{team_gid}", teamGid);
        itest("randoop", 109).given(teamGid, "Rate Limit Enforced").checkEq(path, "/teams/Rate Limit Enforced/users");
        itest("randoop", 109).given(teamGid, "hi!").checkEq(path, "/teams/hi!/users");
        itest("randoop", 109).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/users");
        itest("randoop", 109).given(teamGid, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old/users");
        itest("evosuite", 109).given(teamGid, "WyKTQAPpvh6)nk").checkEq(path, "/teams/WyKTQAPpvh6)nk/users");
        itest("evosuite", 109).given(teamGid, "J7akJ4kAj25O").checkEq(path, "/teams/J7akJ4kAj25O/users");
        itest("randoop", 109).given(teamGid, "GET").checkEq(path, "/teams/GET/users");
        itest("randoop", 109).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state/users");
        itest("randoop", 109).given(teamGid, "/tags/Payment Required").checkEq(path, "/teams//tags/Payment Required/users");
        itest("randoop", 109).given(teamGid, "/attachments/Not Found").checkEq(path, "/teams//attachments/Not Found/users");
        itest("randoop", 109).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/users");
        itest("evosuite", 109).given(teamGid, "").checkEq(path, "/teams//users");
        itest("randoop", 109).given(teamGid, "/attachments/").checkEq(path, "/teams//attachments//users");
        itest("randoop", 109).given(teamGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/teams/com.asana.errors.InvalidTokenError: Sync token invalid or too old/users");
        itest("randoop", 109).given(teamGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/teams//goals/{goal_gid}/subgoals/users");
        itest("randoop", 109).given(teamGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: 200/users");
        itest("randoop", 109).given(teamGid, "200").checkEq(path, "/teams/200/users");
        itest("evosuite", 109).given(teamGid, "#g]").checkEq(path, "/teams/#g]/users");
        itest("randoop", 109).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/users");
        itest("randoop", 109).given(teamGid, "").checkEq(path, "/teams//users");
        itest("randoop", 109).given(teamGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/teams/com.asana.errors.AsanaError: NoAuthorizationError/users");
        itest("randoop", 109).given(teamGid, "0").checkEq(path, "/teams/0/users");
        itest("evosuite", 109).given(teamGid, "s4^-K_v~sUJKY|,n").checkEq(path, "/teams/s4^-K_v~sUJKY|,n/users");
        itest("randoop", 109).given(teamGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//goals/{goal_gid}/addSubgoal/users");
        itest("evosuite", 109).given(teamGid, "sA(~+k!6cl;a").checkEq(path, "/teams/sA(~+k!6cl;a/users");
        itest("randoop", 109).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/users");
        itest("randoop", 109).given(teamGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/users");
        itest("evosuite", 109).given(teamGid, "$F|!1pj?/yp/|1G").checkEq(path, "/teams/$F|!1pj?/yp/|1G/users");
        itest("evosuite", 109).given(teamGid, "@<_4ZTJ'HjRqVgC>").checkEq(path, "/teams/@<_4ZTJ'HjRqVgC>/users");
        itest("randoop", 109).given(teamGid, "NoAuthorizationError").checkEq(path, "/teams/NoAuthorizationError/users");
        itest("randoop", 109).given(teamGid, "Invalid Request").checkEq(path, "/teams/Invalid Request/users");
        itest("randoop", 109).given(teamGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//portfolio_memberships//goals/{goal_gid}/addSubgoal/users");
        itest("randoop", 109).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/users");
        CollectionRequest<User> req = new CollectionRequest<User>(this, User.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("offset", offset);
        return req;
    }

    public CollectionRequest<User> getUsersForTeam(String teamGid) throws IOException {
        return getUsersForTeam(teamGid, null, null, false);
    }

    /**
     * Get users in a workspace or organization
     * Returns the compact records for all users in the specified workspace or organization. Results are sorted alphabetically and limited to 2000. For more results use the &#x60;/users&#x60; endpoint.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(User)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<User> getUsersForWorkspace(String workspaceGid, String offset, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/users".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 133).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/users");
        itest("randoop", 133).given(workspaceGid, "Forbidden").checkEq(path, "/workspaces/Forbidden/users");
        itest("randoop", 133).given(workspaceGid, "/projects/Not Found/removeFollowers").checkEq(path, "/workspaces//projects/Not Found/removeFollowers/users");
        itest("randoop", 133).given(workspaceGid, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/users");
        itest("randoop", 133).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/users");
        itest("randoop", 133).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/users");
        itest("randoop", 133).given(workspaceGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/users");
        itest("randoop", 133).given(workspaceGid, "Payment Required").checkEq(path, "/workspaces/Payment Required/users");
        itest("randoop", 133).given(workspaceGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Server Error/users");
        itest("randoop", 133).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/users");
        itest("randoop", 133).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/users");
        itest("evosuite", 133).given(workspaceGid, "}0P>y52Ea`pS$uUn&").checkEq(path, "/workspaces/}0P>y52Ea`pS$uUn&/users");
        itest("randoop", 133).given(workspaceGid, "/tags").checkEq(path, "/workspaces//tags/users");
        itest("randoop", 133).given(workspaceGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/users");
        itest("randoop", 133).given(workspaceGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/users");
        itest("randoop", 133).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/users");
        itest("randoop", 133).given(workspaceGid, "").checkEq(path, "/workspaces//users");
        itest("randoop", 133).given(workspaceGid, "hi!").checkEq(path, "/workspaces/hi!/users");
        itest("evosuite", 133).given(workspaceGid, "}IOv$RhIU").checkEq(path, "/workspaces/}IOv$RhIU/users");
        itest("randoop", 133).given(workspaceGid, "0").checkEq(path, "/workspaces/0/users");
        itest("randoop", 133).given(workspaceGid, "POST").checkEq(path, "/workspaces/POST/users");
        itest("randoop", 133).given(workspaceGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/users");
        itest("randoop", 133).given(workspaceGid, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/users");
        itest("randoop", 133).given(workspaceGid, "Server Error").checkEq(path, "/workspaces/Server Error/users");
        itest("randoop", 133).given(workspaceGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspaces/com.asana.errors.AsanaError: hi!/users");
        itest("randoop", 133).given(workspaceGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//portfolios//goals/{goal_gid}/subgoals/users");
        itest("randoop", 133).given(workspaceGid, "/attachments/").checkEq(path, "/workspaces//attachments//users");
        itest("randoop", 133).given(workspaceGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/users");
        itest("randoop", 133).given(workspaceGid, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/users");
        itest("randoop", 133).given(workspaceGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/users");
        itest("evosuite", 133).given(workspaceGid, "of:f\"F(h)9~").checkEq(path, "/workspaces/of:f\"F(h)9~/users");
        itest("evosuite", 133).given(workspaceGid, "/teams/@<_4ZTJ'HjRqVgC>/users").checkEq(path, "/workspaces//teams/@<_4ZTJ'HjRqVgC>/users/users");
        itest("evosuite", 133).given(workspaceGid, "_NA*[pKhrEEyp6").checkEq(path, "/workspaces/_NA*[pKhrEEyp6/users");
        itest("randoop", 133).given(workspaceGid, "200").checkEq(path, "/workspaces/200/users");
        itest("evosuite", 133).given(workspaceGid, "team").checkEq(path, "/workspaces/team/users");
        CollectionRequest<User> req = new CollectionRequest<User>(this, User.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("offset", offset);
        return req;
    }

    public CollectionRequest<User> getUsersForWorkspace(String workspaceGid) throws IOException {
        return getUsersForWorkspace(workspaceGid, null, null, false);
    }
}
