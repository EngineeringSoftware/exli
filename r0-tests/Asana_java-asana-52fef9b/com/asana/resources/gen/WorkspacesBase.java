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

public class WorkspacesBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public WorkspacesBase(Client client) {
        super(client);
    }

    /**
     * Add a user to a workspace or organization
     * Add a user to a workspace or organization. The user can be referenced by their globally unique user ID or their email address. Returns the full user record for the invited user.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(User)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<User> addUserForWorkspace(String workspaceGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/addUser".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 31).given(workspaceGid, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/addUser");
        itest("randoop", 31).given(workspaceGid, "GET").checkEq(path, "/workspaces/GET/addUser");
        itest("randoop", 31).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addUser");
        itest("evosuite", 31).given(workspaceGid, "CRLF (\r\n)").checkEq(path, "/workspaces/CRLF (\r\n)/addUser");
        itest("randoop", 31).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addUser");
        itest("randoop", 31).given(workspaceGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/workspaces//projects/Rate Limit Enforced/sections/addUser");
        itest("randoop", 31).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addUser");
        itest("randoop", 31).given(workspaceGid, "0").checkEq(path, "/workspaces/0/addUser");
        itest("randoop", 31).given(workspaceGid, "/tags/Payment Required").checkEq(path, "/workspaces//tags/Payment Required/addUser");
        itest("randoop", 31).given(workspaceGid, "10").checkEq(path, "/workspaces/10/addUser");
        itest("randoop", 31).given(workspaceGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspaces/com.asana.errors.AsanaError: hi!/addUser");
        itest("randoop", 31).given(workspaceGid, "").checkEq(path, "/workspaces//addUser");
        itest("randoop", 31).given(workspaceGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addUser");
        itest("randoop", 31).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/addUser");
        itest("randoop", 31).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addUser");
        itest("randoop", 31).given(workspaceGid, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/addUser");
        itest("evosuite", 31).given(workspaceGid, "b!$w`|rBza!#").checkEq(path, "/workspaces/b!$w`|rBza!#/addUser");
        itest("randoop", 31).given(workspaceGid, "/tags").checkEq(path, "/workspaces//tags/addUser");
        itest("evosuite", 31).given(workspaceGid, "/workspaces/opt_fields/removeUser").checkEq(path, "/workspaces//workspaces/opt_fields/removeUser/addUser");
        itest("randoop", 31).given(workspaceGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addUser");
        itest("randoop", 31).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/addUser");
        itest("evosuite", 31).given(workspaceGid, "O%V,0=2T#%J9KT").checkEq(path, "/workspaces/O%V,0=2T#%J9KT/addUser");
        itest("evosuite", 31).given(workspaceGid, "").checkEq(path, "/workspaces//addUser");
        itest("randoop", 31).given(workspaceGid, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/addUser");
        itest("randoop", 31).given(workspaceGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addUser");
        itest("randoop", 31).given(workspaceGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addUser");
        itest("randoop", 31).given(workspaceGid, "Payment Required").checkEq(path, "/workspaces/Payment Required/addUser");
        itest("randoop", 31).given(workspaceGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/addUser");
        itest("randoop", 31).given(workspaceGid, "/portfolios/").checkEq(path, "/workspaces//portfolios//addUser");
        itest("evosuite", 31).given(workspaceGid, "}MJUWXFjQwjmJvh").checkEq(path, "/workspaces/}MJUWXFjQwjmJvh/addUser");
        itest("randoop", 31).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addUser");
        ItemRequest<User> req = new ItemRequest<User>(this, User.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<User> addUserForWorkspace(String workspaceGid) throws IOException {
        return addUserForWorkspace(workspaceGid, null, false);
    }

    /**
     * Get a workspace
     * Returns the full workspace record for a single workspace.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Workspace)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Workspace> getWorkspace(String workspaceGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 53).given(workspaceGid, "/workspaces/").checkEq(path, "/workspaces//workspaces/");
        itest("randoop", 53).given(workspaceGid, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found");
        itest("randoop", 53).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request");
        itest("randoop", 53).given(workspaceGid, "GET").checkEq(path, "/workspaces/GET");
        itest("randoop", 53).given(workspaceGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/workspaces//workspaces//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 53).given(workspaceGid, "").checkEq(path, "/workspaces/");
        itest("randoop", 53).given(workspaceGid, "200").checkEq(path, "/workspaces/200");
        itest("evosuite", 53).given(workspaceGid, "Lo{yO84 L95>`T`").checkEq(path, "/workspaces/Lo{yO84 L95>`T`");
        itest("randoop", 53).given(workspaceGid, "Forbidden").checkEq(path, "/workspaces/Forbidden");
        itest("evosuite", 53).given(workspaceGid, "^$DQCzYiox&8-Vy").checkEq(path, "/workspaces/^$DQCzYiox&8-Vy");
        itest("randoop", 53).given(workspaceGid, "/attachments/").checkEq(path, "/workspaces//attachments/");
        itest("randoop", 53).given(workspaceGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 53).given(workspaceGid, "Payment Required").checkEq(path, "/workspaces/Payment Required");
        itest("evosuite", 53).given(workspaceGid, "/sections/{section_gid}").checkEq(path, "/workspaces//sections/{section_gid}");
        itest("evosuite", 53).given(workspaceGid, "q gPQBstYY<Z^EAV(s*").checkEq(path, "/workspaces/q gPQBstYY<Z^EAV(s*");
        itest("randoop", 53).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 53).given(workspaceGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 53).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("randoop", 53).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state");
        itest("randoop", 53).given(workspaceGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 53).given(workspaceGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/workspaces/com.asana.errors.AsanaError: NoAuthorizationError");
        itest("randoop", 53).given(workspaceGid, "/custom_fields//enum_options/insert").checkEq(path, "/workspaces//custom_fields//enum_options/insert");
        itest("randoop", 53).given(workspaceGid, "Server Error").checkEq(path, "/workspaces/Server Error");
        itest("randoop", 53).given(workspaceGid, "/webhooks/NoAuthorizationError").checkEq(path, "/workspaces//webhooks/NoAuthorizationError");
        itest("randoop", 53).given(workspaceGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 53).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 53).given(workspaceGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 53).given(workspaceGid, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced");
        itest("evosuite", 53).given(workspaceGid, "").checkEq(path, "/workspaces/");
        itest("randoop", 53).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 53).given(workspaceGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/workspaces//projects/Rate Limit Enforced/sections");
        itest("randoop", 53).given(workspaceGid, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old");
        itest("randoop", 53).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 53).given(workspaceGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/workspaces//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        ItemRequest<Workspace> req = new ItemRequest<Workspace>(this, Workspace.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Workspace> getWorkspace(String workspaceGid) throws IOException {
        return getWorkspace(workspaceGid, null, false);
    }

    /**
     * Get multiple workspaces
     * Returns the compact records for all workspaces visible to the authorized user.
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Workspace)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Workspace> getWorkspaces(String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces";
        CollectionRequest<Workspace> req = new CollectionRequest<Workspace>(this, Workspace.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Workspace> getWorkspaces() throws IOException {
        return getWorkspaces(null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Remove a user from a workspace or organization
     * Remove a user from a workspace or organization. The user making this call must be an admin in the workspace. The user can be referenced by their globally unique user ID or their email address. Returns an empty data record.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeUserForWorkspace(String workspaceGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/removeUser".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 100).given(workspaceGid, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/removeUser");
        itest("randoop", 100).given(workspaceGid, "/attachments/").checkEq(path, "/workspaces//attachments//removeUser");
        itest("randoop", 100).given(workspaceGid, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/removeUser");
        itest("randoop", 100).given(workspaceGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeUser");
        itest("randoop", 100).given(workspaceGid, "GET").checkEq(path, "/workspaces/GET/removeUser");
        itest("randoop", 100).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//removeUser");
        itest("evosuite", 100).given(workspaceGid, "opt_fields").checkEq(path, "/workspaces/opt_fields/removeUser");
        itest("randoop", 100).given(workspaceGid, "/portfolios/").checkEq(path, "/workspaces//portfolios//removeUser");
        itest("randoop", 100).given(workspaceGid, "").checkEq(path, "/workspaces//removeUser");
        itest("randoop", 100).given(workspaceGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/removeUser");
        itest("randoop", 100).given(workspaceGid, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/removeUser");
        itest("evosuite", 100).given(workspaceGid, "").checkEq(path, "/workspaces//removeUser");
        itest("randoop", 100).given(workspaceGid, "Forbidden").checkEq(path, "/workspaces/Forbidden/removeUser");
        itest("evosuite", 100).given(workspaceGid, "com.github.javaparser.ast.observer.PropagatingAstObserver$1").checkEq(path, "/workspaces/com.github.javaparser.ast.observer.PropagatingAstObserver$1/removeUser");
        itest("randoop", 100).given(workspaceGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/workspaces//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeUser");
        itest("randoop", 100).given(workspaceGid, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/removeUser");
        itest("randoop", 100).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found/removeUser");
        itest("randoop", 100).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/removeUser");
        itest("randoop", 100).given(workspaceGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/workspaces/com.asana.errors.InvalidRequestError: Invalid Request/removeUser");
        itest("randoop", 100).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeUser");
        itest("randoop", 100).given(workspaceGid, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/removeUser");
        itest("randoop", 100).given(workspaceGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/removeUser");
        itest("randoop", 100).given(workspaceGid, "hi!").checkEq(path, "/workspaces/hi!/removeUser");
        itest("evosuite", 100).given(workspaceGid, "/projects/%s/removeMembers").checkEq(path, "/workspaces//projects/%s/removeMembers/removeUser");
        itest("evosuite", 100).given(workspaceGid, "%s is not ModuleOpensDirective, it is %s").checkEq(path, "/workspaces/%s is not ModuleOpensDirective, it is %s/removeUser");
        itest("randoop", 100).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/removeUser");
        itest("evosuite", 100).given(workspaceGid, "t%LDH;F5%!").checkEq(path, "/workspaces/t%LDH;F5%!/removeUser");
        itest("randoop", 100).given(workspaceGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeUser");
        itest("randoop", 100).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/removeUser");
        itest("randoop", 100).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeUser");
        itest("evosuite", 100).given(workspaceGid, "U-=#jmX,n&^sNv?N").checkEq(path, "/workspaces/U-=#jmX,n&^sNv?N/removeUser");
        itest("randoop", 100).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeUser");
        itest("evosuite", 100).given(workspaceGid, "POST").checkEq(path, "/workspaces/POST/removeUser");
        itest("randoop", 100).given(workspaceGid, "/tags").checkEq(path, "/workspaces//tags/removeUser");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeUserForWorkspace(String workspaceGid) throws IOException {
        return removeUserForWorkspace(workspaceGid, null, false);
    }

    /**
     * Update a workspace
     * A specific, existing workspace can be updated by making a PUT request on the URL for that workspace. Only the fields provided in the data block will be updated; any unspecified fields will remain unchanged. Currently the only field that can be modified for a workspace is its name. Returns the complete, updated workspace record.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Workspace)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Workspace> updateWorkspace(String workspaceGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}".replace("{workspace_gid}", workspaceGid);
        itest("evosuite", 122).given(workspaceGid, "(pjGg:|").checkEq(path, "/workspaces/(pjGg:|");
        itest("randoop", 122).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 122).given(workspaceGid, "Q>Y'W_;j").checkEq(path, "/workspaces/Q>Y'W_;j");
        itest("randoop", 122).given(workspaceGid, "/tags/Payment Required").checkEq(path, "/workspaces//tags/Payment Required");
        itest("randoop", 122).given(workspaceGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 122).given(workspaceGid, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError");
        itest("evosuite", 122).given(workspaceGid, "22x`?,yq(t?+ s").checkEq(path, "/workspaces/22x`?,yq(t?+ s");
        itest("randoop", 122).given(workspaceGid, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found");
        itest("randoop", 122).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 122).given(workspaceGid, "2").checkEq(path, "/workspaces/2");
        itest("randoop", 122).given(workspaceGid, "").checkEq(path, "/workspaces/");
        itest("randoop", 122).given(workspaceGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals");
        itest("randoop", 122).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 122).given(workspaceGid, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced");
        itest("randoop", 122).given(workspaceGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 122).given(workspaceGid, "200").checkEq(path, "/workspaces/200");
        itest("randoop", 122).given(workspaceGid, "/project_statuses/Server Error").checkEq(path, "/workspaces//project_statuses/Server Error");
        itest("randoop", 122).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("randoop", 122).given(workspaceGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/workspaces//workspaces//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 122).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 122).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 122).given(workspaceGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspaces/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 122).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 122).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found");
        itest("randoop", 122).given(workspaceGid, "/tasks/GET").checkEq(path, "/workspaces//tasks/GET");
        itest("randoop", 122).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 122).given(workspaceGid, "Forbidden").checkEq(path, "/workspaces/Forbidden");
        itest("randoop", 122).given(workspaceGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 122).given(workspaceGid, "opt_fields").checkEq(path, "/workspaces/opt_fields");
        itest("randoop", 122).given(workspaceGid, "hi!").checkEq(path, "/workspaces/hi!");
        itest("evosuite", 122).given(workspaceGid, "}MJUWXFjQwjmJvh").checkEq(path, "/workspaces/}MJUWXFjQwjmJvh");
        ItemRequest<Workspace> req = new ItemRequest<Workspace>(this, Workspace.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Workspace> updateWorkspace(String workspaceGid) throws IOException {
        return updateWorkspace(workspaceGid, null, false);
    }
}
