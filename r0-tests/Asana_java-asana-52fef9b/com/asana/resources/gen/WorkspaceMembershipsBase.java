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

public class WorkspaceMembershipsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public WorkspaceMembershipsBase(Client client) {
        super(client);
    }

    /**
     * Get a workspace membership
     * Returns the complete workspace record for a single workspace membership.
     * @param workspaceMembershipGid  (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> getWorkspaceMembership(String workspaceMembershipGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspace_memberships/{workspace_membership_gid}".replace("{workspace_membership_gid}", workspaceMembershipGid);
        itest("randoop", 31).given(workspaceMembershipGid, "/tasks/200/addProject").checkEq(path, "/workspace_memberships//tasks/200/addProject");
        itest("randoop", 31).given(workspaceMembershipGid, "10").checkEq(path, "/workspace_memberships/10");
        itest("randoop", 31).given(workspaceMembershipGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspace_memberships/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 31).given(workspaceMembershipGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/workspace_memberships//tasks//attachments/Not Found/addProject");
        itest("evosuite", 31).given(workspaceMembershipGid, "").checkEq(path, "/workspace_memberships/");
        itest("randoop", 31).given(workspaceMembershipGid, "GET").checkEq(path, "/workspace_memberships/GET");
        itest("randoop", 31).given(workspaceMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspace_memberships/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 31).given(workspaceMembershipGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/workspace_memberships/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 31).given(workspaceMembershipGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspace_memberships/com.asana.errors.AsanaError: hi!");
        itest("randoop", 31).given(workspaceMembershipGid, "/attachments/Not Found").checkEq(path, "/workspace_memberships//attachments/Not Found");
        itest("randoop", 31).given(workspaceMembershipGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspace_memberships/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 31).given(workspaceMembershipGid, "Payment Required").checkEq(path, "/workspace_memberships/Payment Required");
        itest("randoop", 31).given(workspaceMembershipGid, "Not Found").checkEq(path, "/workspace_memberships/Not Found");
        itest("randoop", 31).given(workspaceMembershipGid, "NoAuthorizationError").checkEq(path, "/workspace_memberships/NoAuthorizationError");
        itest("evosuite", 31).given(workspaceMembershipGid, "TOp").checkEq(path, "/workspace_memberships/TOp");
        itest("randoop", 31).given(workspaceMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspace_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 31).given(workspaceMembershipGid, "2").checkEq(path, "/workspace_memberships/2");
        itest("randoop", 31).given(workspaceMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspace_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 31).given(workspaceMembershipGid, "{workspace_gid}").checkEq(path, "/workspace_memberships/{workspace_gid}");
        itest("randoop", 31).given(workspaceMembershipGid, "").checkEq(path, "/workspace_memberships/");
        itest("randoop", 31).given(workspaceMembershipGid, "Rate Limit Enforced").checkEq(path, "/workspace_memberships/Rate Limit Enforced");
        itest("randoop", 31).given(workspaceMembershipGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspace_memberships//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 31).given(workspaceMembershipGid, "Invalid Request").checkEq(path, "/workspace_memberships/Invalid Request");
        itest("randoop", 31).given(workspaceMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspace_memberships/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 31).given(workspaceMembershipGid, "/attachments/").checkEq(path, "/workspace_memberships//attachments/");
        itest("randoop", 31).given(workspaceMembershipGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspace_memberships/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 31).given(workspaceMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspace_memberships/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 31).given(workspaceMembershipGid, "/workspaces/").checkEq(path, "/workspace_memberships//workspaces/");
        itest("randoop", 31).given(workspaceMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/workspace_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 31).given(workspaceMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspace_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 31).given(workspaceMembershipGid, "f?G!O>Fm]`lRX5Ed").checkEq(path, "/workspace_memberships/f?G!O>Fm]`lRX5Ed");
        itest("randoop", 31).given(workspaceMembershipGid, "POST").checkEq(path, "/workspace_memberships/POST");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> getWorkspaceMembership(String workspaceMembershipGid) throws IOException {
        return getWorkspaceMembership(workspaceMembershipGid, null, false);
    }

    /**
     * Get workspace memberships for a user
     * Returns the compact workspace membership records for the user.
     * @param userGid A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getWorkspaceMembershipsForUser(String userGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/users/{user_gid}/workspace_memberships".replace("{user_gid}", userGid);
        itest("randoop", 55).given(userGid, "0").checkEq(path, "/users/0/workspace_memberships");
        itest("randoop", 55).given(userGid, "NoAuthorizationError").checkEq(path, "/users/NoAuthorizationError/workspace_memberships");
        itest("randoop", 55).given(userGid, "Rate Limit Enforced").checkEq(path, "/users/Rate Limit Enforced/workspace_memberships");
        itest("randoop", 55).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//workspace_memberships");
        itest("randoop", 55).given(userGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/users/com.asana.errors.InvalidRequestError: Invalid Request/workspace_memberships");
        itest("evosuite", 55).given(userGid, "g2G(pD%mM").checkEq(path, "/users/g2G(pD%mM/workspace_memberships");
        itest("randoop", 55).given(userGid, "GET").checkEq(path, "/users/GET/workspace_memberships");
        itest("randoop", 55).given(userGid, "/organizations//teams").checkEq(path, "/users//organizations//teams/workspace_memberships");
        itest("randoop", 55).given(userGid, "Server Error").checkEq(path, "/users/Server Error/workspace_memberships");
        itest("randoop", 55).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/workspace_memberships");
        itest("randoop", 55).given(userGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/users/com.asana.errors.AsanaError: hi!/workspace_memberships");
        itest("randoop", 55).given(userGid, "/projects/Not Found/removeFollowers").checkEq(path, "/users//projects/Not Found/removeFollowers/workspace_memberships");
        itest("evosuite", 55).given(userGid, "").checkEq(path, "/users//workspace_memberships");
        itest("evosuite", 55).given(userGid, ":&O4%A0~rvA2Ibph").checkEq(path, "/users/:&O4%A0~rvA2Ibph/workspace_memberships");
        itest("randoop", 55).given(userGid, "/workspaces/").checkEq(path, "/users//workspaces//workspace_memberships");
        itest("randoop", 55).given(userGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/users//stories//goals/{goal_gid}/addSubgoal/workspace_memberships");
        itest("randoop", 55).given(userGid, "/webhooks/NoAuthorizationError").checkEq(path, "/users//webhooks/NoAuthorizationError/workspace_memberships");
        itest("randoop", 55).given(userGid, "/attachments/").checkEq(path, "/users//attachments//workspace_memberships");
        itest("randoop", 55).given(userGid, "").checkEq(path, "/users//workspace_memberships");
        itest("evosuite", 55).given(userGid, "TOp").checkEq(path, "/users/TOp/workspace_memberships");
        itest("randoop", 55).given(userGid, "10").checkEq(path, "/users/10/workspace_memberships");
        itest("randoop", 55).given(userGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/users//tasks//attachments/Not Found/addProject/workspace_memberships");
        itest("randoop", 55).given(userGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/workspace_memberships");
        itest("randoop", 55).given(userGid, "200").checkEq(path, "/users/200/workspace_memberships");
        itest("randoop", 55).given(userGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/workspace_memberships");
        itest("randoop", 55).given(userGid, "Forbidden").checkEq(path, "/users/Forbidden/workspace_memberships");
        itest("randoop", 55).given(userGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/workspace_memberships");
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<JsonElement> getWorkspaceMembershipsForUser(String userGid) throws IOException {
        return getWorkspaceMembershipsForUser(userGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get the workspace memberships for a workspace
     * Returns the compact workspace membership records for the workspace.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param user A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getWorkspaceMembershipsForWorkspace(String workspaceGid, String user, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/workspace_memberships".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 82).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "Payment Required").checkEq(path, "/workspaces/Payment Required/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "/organizations//teams").checkEq(path, "/workspaces//organizations//teams/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "POST").checkEq(path, "/workspaces/POST/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: /portfolios//workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "/tags").checkEq(path, "/workspaces//tags/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "").checkEq(path, "/workspaces//workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "Server Error").checkEq(path, "/workspaces/Server Error/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/workspaces/com.asana.errors.InvalidRequestError: Invalid Request/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "200").checkEq(path, "/workspaces/200/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "/workspaces/").checkEq(path, "/workspaces//workspaces//workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/workspace_memberships");
        itest("evosuite", 82).given(workspaceGid, ";").checkEq(path, "/workspaces/;/workspace_memberships");
        itest("evosuite", 82).given(workspaceGid, "/workspace_memberships/").checkEq(path, "/workspaces//workspace_memberships//workspace_memberships");
        itest("evosuite", 82).given(workspaceGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/workspace_memberships");
        itest("evosuite", 82).given(workspaceGid, ")<I|mO~0Z'2Y").checkEq(path, "/workspaces/)<I|mO~0Z'2Y/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "10").checkEq(path, "/workspaces/10/workspace_memberships");
        itest("randoop", 82).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found/workspace_memberships");
        itest("evosuite", 82).given(workspaceGid, "").checkEq(path, "/workspaces//workspace_memberships");
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("user", user).query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<JsonElement> getWorkspaceMembershipsForWorkspace(String workspaceGid, String user) throws IOException {
        return getWorkspaceMembershipsForWorkspace(workspaceGid, user, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
