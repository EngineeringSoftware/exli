package com.asana.resources;

import com.asana.Client;
import com.asana.models.*;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.WorkspacesBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Workspaces extends WorkspacesBase {

    public Workspaces(Client client) {
        super(client);
    }

    public CollectionRequest<Task> taskTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("randoop", 15).given(workspace, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/typeahead");
        itest("randoop", 15).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/typeahead");
        itest("evosuite", 15).given(workspace, "\"final\"").checkEq(path, "/workspaces/\"final\"/typeahead");
        itest("evosuite", 15).given(workspace, "4{uxSe^A=\"$B$s//").checkEq(path, "/workspaces/4{uxSe^A=\"$B$s///typeahead");
        itest("randoop", 15).given(workspace, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/typeahead");
        itest("randoop", 15).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/typeahead");
        itest("randoop", 15).given(workspace, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/typeahead");
        itest("randoop", 15).given(workspace, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/workspaces/com.asana.errors.AsanaError: NoAuthorizationError/typeahead");
        itest("randoop", 15).given(workspace, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/workspaces/com.asana.errors.InvalidRequestError: Invalid Request/typeahead");
        itest("randoop", 15).given(workspace, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: /portfolios//typeahead");
        itest("randoop", 15).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/typeahead");
        itest("randoop", 15).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/typeahead");
        itest("randoop", 15).given(workspace, "10").checkEq(path, "/workspaces/10/typeahead");
        itest("randoop", 15).given(workspace, "POST").checkEq(path, "/workspaces/POST/typeahead");
        itest("randoop", 15).given(workspace, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/typeahead");
        itest("randoop", 15).given(workspace, "GET").checkEq(path, "/workspaces/GET/typeahead");
        itest("evosuite", 15).given(workspace, "EXTENDED_TYPE").checkEq(path, "/workspaces/EXTENDED_TYPE/typeahead");
        itest("randoop", 15).given(workspace, "0").checkEq(path, "/workspaces/0/typeahead");
        itest("randoop", 15).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/typeahead");
        itest("randoop", 15).given(workspace, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Server Error/typeahead");
        itest("randoop", 15).given(workspace, "200").checkEq(path, "/workspaces/200/typeahead");
        itest("randoop", 15).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/typeahead");
        itest("evosuite", 15).given(workspace, "/workspaces/qVK7OEdAz&g").checkEq(path, "/workspaces//workspaces/qVK7OEdAz&g/typeahead");
        itest("randoop", 15).given(workspace, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/typeahead");
        itest("randoop", 15).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/typeahead");
        CollectionRequest<Task> request = new CollectionRequest<>(this, Task.class, path, "GET");
        return request.query("type", "task");
    }

    public CollectionRequest<User> userTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("randoop", 21).given(workspace, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/typeahead");
        itest("evosuite", 21).given(workspace, "=Am$y1~.z'P").checkEq(path, "/workspaces/=Am$y1~.z'P/typeahead");
        itest("randoop", 21).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/typeahead");
        itest("randoop", 21).given(workspace, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/typeahead");
        itest("randoop", 21).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/typeahead");
        itest("randoop", 21).given(workspace, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/typeahead");
        itest("randoop", 21).given(workspace, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/workspaces//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/typeahead");
        itest("randoop", 21).given(workspace, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/typeahead");
        itest("randoop", 21).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/typeahead");
        itest("randoop", 21).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden/typeahead");
        itest("randoop", 21).given(workspace, "/portfolios/").checkEq(path, "/workspaces//portfolios//typeahead");
        itest("randoop", 21).given(workspace, "10").checkEq(path, "/workspaces/10/typeahead");
        itest("evosuite", 21).given(workspace, "Lud").checkEq(path, "/workspaces/Lud/typeahead");
        itest("randoop", 21).given(workspace, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/typeahead");
        itest("randoop", 21).given(workspace, "/tags").checkEq(path, "/workspaces//tags/typeahead");
        itest("randoop", 21).given(workspace, "200").checkEq(path, "/workspaces/200/typeahead");
        itest("randoop", 21).given(workspace, "/custom_fields//enum_options/insert").checkEq(path, "/workspaces//custom_fields//enum_options/insert/typeahead");
        itest("randoop", 21).given(workspace, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspaces/com.asana.errors.AsanaError: hi!/typeahead");
        itest("randoop", 21).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//typeahead");
        itest("randoop", 21).given(workspace, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/typeahead");
        itest("evosuite", 21).given(workspace, null).checkEq(path, "/workspaces/null/typeahead");
        itest("randoop", 21).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found/typeahead");
        itest("randoop", 21).given(workspace, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Server Error/typeahead");
        itest("evosuite", 21).given(workspace, "0B").checkEq(path, "/workspaces/0B/typeahead");
        itest("evosuite", 21).given(workspace, "/workspaces").checkEq(path, "/workspaces//workspaces/typeahead");
        itest("randoop", 21).given(workspace, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/typeahead");
        itest("randoop", 21).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/typeahead");
        itest("evosuite", 21).given(workspace, "PUT").checkEq(path, "/workspaces/PUT/typeahead");
        itest("randoop", 21).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/typeahead");
        itest("randoop", 21).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/typeahead");
        itest("randoop", 21).given(workspace, "0").checkEq(path, "/workspaces/0/typeahead");
        itest("randoop", 21).given(workspace, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/typeahead");
        itest("randoop", 21).given(workspace, "GET").checkEq(path, "/workspaces/GET/typeahead");
        CollectionRequest<User> request = new CollectionRequest<>(this, User.class, path, "GET");
        return request.query("type", "user");
    }

    public CollectionRequest<Project> projectTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("randoop", 27).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/typeahead");
        itest("randoop", 27).given(workspace, "10").checkEq(path, "/workspaces/10/typeahead");
        itest("randoop", 27).given(workspace, "POST").checkEq(path, "/workspaces/POST/typeahead");
        itest("randoop", 27).given(workspace, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspaces/com.asana.errors.AsanaError: hi!/typeahead");
        itest("randoop", 27).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/typeahead");
        itest("randoop", 27).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/typeahead");
        itest("randoop", 27).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/typeahead");
        itest("randoop", 27).given(workspace, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Server Error/typeahead");
        itest("randoop", 27).given(workspace, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//stories//goals/{goal_gid}/addSubgoal/typeahead");
        itest("randoop", 27).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/typeahead");
        itest("randoop", 27).given(workspace, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/typeahead");
        itest("randoop", 27).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/typeahead");
        itest("evosuite", 27).given(workspace, "").checkEq(path, "/workspaces//typeahead");
        itest("randoop", 27).given(workspace, "/tags/Payment Required").checkEq(path, "/workspaces//tags/Payment Required/typeahead");
        itest("randoop", 27).given(workspace, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/typeahead");
        itest("randoop", 27).given(workspace, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//portfolio_memberships//goals/{goal_gid}/addSubgoal/typeahead");
        itest("randoop", 27).given(workspace, "/tasks//attachments/Not Found/addProject").checkEq(path, "/workspaces//tasks//attachments/Not Found/addProject/typeahead");
        itest("randoop", 27).given(workspace, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/typeahead");
        itest("randoop", 27).given(workspace, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/typeahead");
        itest("randoop", 27).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found/typeahead");
        itest("evosuite", 27).given(workspace, "~ET").checkEq(path, "/workspaces/~ET/typeahead");
        itest("randoop", 27).given(workspace, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/typeahead");
        itest("randoop", 27).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/typeahead");
        itest("randoop", 27).given(workspace, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspaces/com.asana.errors.PremiumOnlyError: Payment Required/typeahead");
        itest("randoop", 27).given(workspace, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/typeahead");
        itest("randoop", 27).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/typeahead");
        CollectionRequest<Project> request = new CollectionRequest<>(this, Project.class, path, "GET");
        return request.query("type", "project");
    }

    public CollectionRequest<Tag> tagTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("evosuite", 33).given(workspace, "~(_VS?").checkEq(path, "/workspaces/~(_VS?/typeahead");
        itest("randoop", 33).given(workspace, "/tags").checkEq(path, "/workspaces//tags/typeahead");
        itest("randoop", 33).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found/typeahead");
        itest("randoop", 33).given(workspace, "").checkEq(path, "/workspaces//typeahead");
        itest("randoop", 33).given(workspace, "Payment Required").checkEq(path, "/workspaces/Payment Required/typeahead");
        itest("randoop", 33).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/typeahead");
        itest("evosuite", 33).given(workspace, "/workspaces/%s").checkEq(path, "/workspaces//workspaces/%s/typeahead");
        itest("evosuite", 33).given(workspace, "GET").checkEq(path, "/workspaces/GET/typeahead");
        itest("randoop", 33).given(workspace, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//stories//goals/{goal_gid}/addSubgoal/typeahead");
        itest("randoop", 33).given(workspace, "/goals/Sync token invalid or too old").checkEq(path, "/workspaces//goals/Sync token invalid or too old/typeahead");
        itest("randoop", 33).given(workspace, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/typeahead");
        itest("randoop", 33).given(workspace, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/typeahead");
        itest("randoop", 33).given(workspace, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspaces/com.asana.errors.PremiumOnlyError: Payment Required/typeahead");
        itest("randoop", 33).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/typeahead");
        itest("randoop", 33).given(workspace, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/typeahead");
        itest("evosuite", 33).given(workspace, "").checkEq(path, "/workspaces//typeahead");
        itest("randoop", 33).given(workspace, "/webhooks/NoAuthorizationError").checkEq(path, "/workspaces//webhooks/NoAuthorizationError/typeahead");
        itest("randoop", 33).given(workspace, "/organizations//teams").checkEq(path, "/workspaces//organizations//teams/typeahead");
        itest("randoop", 33).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/typeahead");
        itest("randoop", 33).given(workspace, "POST").checkEq(path, "/workspaces/POST/typeahead");
        itest("randoop", 33).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/typeahead");
        itest("randoop", 33).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/typeahead");
        itest("evosuite", 33).given(workspace, "com.github.javaparser.ast.comments.JavadocComment").checkEq(path, "/workspaces/com.github.javaparser.ast.comments.JavadocComment/typeahead");
        itest("randoop", 33).given(workspace, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/typeahead");
        itest("randoop", 33).given(workspace, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/typeahead");
        CollectionRequest<Tag> request = new CollectionRequest<>(this, Tag.class, path, "GET");
        return request.query("type", "tag");
    }

    /**
     * Returns the full workspace record for a single workspace.
     *
     * @param  workspace Globally unique identifier for the workspace or organization.
     * @return Request object
     */
    public ItemRequest<Workspace> findById(String workspace) {
        String path = String.format("/workspaces/%s", workspace);
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 46).given(workspace, "/tags/Payment Required").checkEq(path, "/workspaces//tags/Payment Required");
        itest("evosuite", 46).given(workspace, "cl6A0").checkEq(path, "/workspaces/cl6A0");
        itest("evosuite", 46).given(workspace, "/workspaces//typeahead").checkEq(path, "/workspaces//workspaces//typeahead");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("evosuite", 46).given(workspace, null).checkEq(path, "/workspaces/null");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 46).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found");
        itest("randoop", 46).given(workspace, "/custom_fields//enum_options/insert").checkEq(path, "/workspaces//custom_fields//enum_options/insert");
        itest("randoop", 46).given(workspace, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError");
        itest("evosuite", 46).given(workspace, "com.github.javaparser.metamodel.VariableDeclarationExprMetaModel").checkEq(path, "/workspaces/com.github.javaparser.metamodel.VariableDeclarationExprMetaModel");
        itest("evosuite", 46).given(workspace, "VYN^XN^").checkEq(path, "/workspaces/VYN^XN^");
        itest("randoop", 46).given(workspace, "/projects/Not Found/removeFollowers").checkEq(path, "/workspaces//projects/Not Found/removeFollowers");
        itest("evosuite", 46).given(workspace, "uri").checkEq(path, "/workspaces/uri");
        itest("randoop", 46).given(workspace, "").checkEq(path, "/workspaces/");
        itest("dev", 46).given(workspace, "1").checkEq(path, "/workspaces/1");
        itest("randoop", 46).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 46).given(workspace, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/workspaces//portfolios/Rate Limit Enforced/portfolio_memberships");
        itest("randoop", 46).given(workspace, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 46).given(workspace, "0").checkEq(path, "/workspaces/0");
        itest("randoop", 46).given(workspace, "GET").checkEq(path, "/workspaces/GET");
        itest("randoop", 46).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 46).given(workspace, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("evosuite", 46).given(workspace, "~(_VS?").checkEq(path, "/workspaces/~(_VS?");
        itest("randoop", 46).given(workspace, "10").checkEq(path, "/workspaces/10");
        itest("randoop", 46).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error");
        itest("evosuite", 46).given(workspace, "/workspaces/=Am$y1~.z'P/addUser").checkEq(path, "/workspaces//workspaces/=Am$y1~.z'P/addUser");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "GET");
    }

    /**
     * Returns the compact records for all workspaces visible to the authorized user.
     *
     * @return Request object
     */
    public CollectionRequest<Workspace> findAll() {
        return new CollectionRequest<Workspace>(this, Workspace.class, "/workspaces", "GET");
    }

    /**
     * A specific, existing workspace can be updated by making a PUT request on
     * the URL for that workspace. Only the fields provided in the data block
     * will be updated; any unspecified fields will remain unchanged.
     *
     * Currently the only field that can be modified for a workspace is its `name`.
     *
     * Returns the complete, updated workspace record.
     *
     * @param  workspace The workspace to update.
     * @return Request object
     */
    public ItemRequest<Workspace> update(String workspace) {
        String path = String.format("/workspaces/%s", workspace);
        itest("randoop", 74).given(workspace, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 74).given(workspace, "200").checkEq(path, "/workspaces/200");
        itest("randoop", 74).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 74).given(workspace, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 74).given(workspace, "/workspaces/com.github.javaparser.ast.comments.JavadocComment/typeahead").checkEq(path, "/workspaces//workspaces/com.github.javaparser.ast.comments.JavadocComment/typeahead");
        itest("randoop", 74).given(workspace, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 74).given(workspace, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspaces/com.asana.errors.AsanaError: hi!");
        itest("randoop", 74).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 74).given(workspace, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found");
        itest("evosuite", 74).given(workspace, "").checkEq(path, "/workspaces/");
        itest("randoop", 74).given(workspace, "Payment Required").checkEq(path, "/workspaces/Payment Required");
        itest("randoop", 74).given(workspace, "").checkEq(path, "/workspaces/");
        itest("evosuite", 74).given(workspace, "=").checkEq(path, "/workspaces/=");
        itest("randoop", 74).given(workspace, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 74).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found");
        itest("randoop", 74).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("evosuite", 74).given(workspace, "qVK7OEdAz&g").checkEq(path, "/workspaces/qVK7OEdAz&g");
        itest("randoop", 74).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 74).given(workspace, "Invalid Request").checkEq(path, "/workspaces/Invalid Request");
        itest("randoop", 74).given(workspace, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 74).given(workspace, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old");
        itest("evosuite", 74).given(workspace, "/workspaces/uri").checkEq(path, "/workspaces//workspaces/uri");
        itest("evosuite", 74).given(workspace, "E4I:xk]U>0").checkEq(path, "/workspaces/E4I:xk]U>0");
        itest("randoop", 74).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error");
        itest("evosuite", 74).given(workspace, null).checkEq(path, "/workspaces/null");
        itest("randoop", 74).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 74).given(workspace, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//portfolios//goals/{goal_gid}/subgoals");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "PUT");
    }

    /**
     * Retrieves objects in the workspace based on an auto-completion/typeahead
     * search algorithm. This feature is meant to provide results quickly, so do
     * not rely on this API to provide extremely accurate search results. The
     * result set is limited to a single page of results with a maximum size,
     * so you won't be able to fetch large numbers of results.
     *
     * @param  workspace The workspace to fetch objects from.
     * @return Request object
     */
    public CollectionRequest<ResourceWithSubtype> typeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("randoop", 90).given(workspace, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//portfolio_memberships//goals/{goal_gid}/addSubgoal/typeahead");
        itest("randoop", 90).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/typeahead");
        itest("randoop", 90).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/typeahead");
        itest("evosuite", 90).given(workspace, "com.asana.resources.Tasks").checkEq(path, "/workspaces/com.asana.resources.Tasks/typeahead");
        itest("evosuite", 90).given(workspace, "com.google.common.collect.ImmutableList").checkEq(path, "/workspaces/com.google.common.collect.ImmutableList/typeahead");
        itest("randoop", 90).given(workspace, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/typeahead");
        itest("randoop", 90).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden/typeahead");
        itest("evosuite", 90).given(workspace, null).checkEq(path, "/workspaces/null/typeahead");
        itest("randoop", 90).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/typeahead");
        itest("randoop", 90).given(workspace, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/typeahead");
        itest("randoop", 90).given(workspace, "/attachments/").checkEq(path, "/workspaces//attachments//typeahead");
        itest("randoop", 90).given(workspace, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: 200/typeahead");
        itest("randoop", 90).given(workspace, "0").checkEq(path, "/workspaces/0/typeahead");
        itest("randoop", 90).given(workspace, "/tags").checkEq(path, "/workspaces//tags/typeahead");
        itest("randoop", 90).given(workspace, "").checkEq(path, "/workspaces//typeahead");
        itest("randoop", 90).given(workspace, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/workspaces//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/typeahead");
        itest("randoop", 90).given(workspace, "200").checkEq(path, "/workspaces/200/typeahead");
        itest("evosuite", 90).given(workspace, "=cei'!").checkEq(path, "/workspaces/=cei'!/typeahead");
        return new CollectionRequest<ResourceWithSubtype>(this, ResourceWithSubtype.class, path, "GET");
    }

    /**
     * The user can be referenced by their globally unique user ID or their email address.
     * Returns the full user record for the invited user.
     *
     * @param  workspace The workspace or organization to invite the user to.
     * @return Request object
     */
    public ItemRequest<Workspace> addUser(String workspace) {
        String path = String.format("/workspaces/%s/addUser", workspace);
        itest("randoop", 103).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addUser");
        itest("evosuite", 103).given(workspace, "`A$3KhYbI\"/$$mFi*kR").checkEq(path, "/workspaces/`A$3KhYbI\"/$$mFi*kR/addUser");
        itest("randoop", 103).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addUser");
        itest("randoop", 103).given(workspace, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/addUser");
        itest("randoop", 103).given(workspace, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/addUser");
        itest("randoop", 103).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/addUser");
        itest("evosuite", 103).given(workspace, "").checkEq(path, "/workspaces//addUser");
        itest("randoop", 103).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/addUser");
        itest("evosuite", 103).given(workspace, "~(_VS?").checkEq(path, "/workspaces/~(_VS?/addUser");
        itest("evosuite", 103).given(workspace, "=Am$y1~.z'P").checkEq(path, "/workspaces/=Am$y1~.z'P/addUser");
        itest("randoop", 103).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden/addUser");
        itest("randoop", 103).given(workspace, "/webhooks/NoAuthorizationError").checkEq(path, "/workspaces//webhooks/NoAuthorizationError/addUser");
        itest("randoop", 103).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces//addUser");
        itest("randoop", 103).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found/addUser");
        itest("randoop", 103).given(workspace, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Server Error/addUser");
        itest("randoop", 103).given(workspace, "10").checkEq(path, "/workspaces/10/addUser");
        itest("randoop", 103).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state/addUser");
        itest("randoop", 103).given(workspace, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addUser");
        itest("randoop", 103).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/addUser");
        itest("randoop", 103).given(workspace, "").checkEq(path, "/workspaces//addUser");
        itest("evosuite", 103).given(workspace, "0123456789ABCDEFGHIJKLMNOPQRSTUV").checkEq(path, "/workspaces/0123456789ABCDEFGHIJKLMNOPQRSTUV/addUser");
        itest("randoop", 103).given(workspace, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addUser");
        itest("randoop", 103).given(workspace, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: 200/addUser");
        itest("randoop", 103).given(workspace, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/workspaces//workspaces//goals/{goal_gid}/subgoals/tasks/addUser");
        itest("randoop", 103).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/addUser");
        itest("randoop", 103).given(workspace, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/addUser");
        itest("randoop", 103).given(workspace, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/workspaces//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/addUser");
        itest("randoop", 103).given(workspace, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//portfolio_memberships//goals/{goal_gid}/addSubgoal/addUser");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "POST");
    }

    /**
     * The user making this call must be an admin in the workspace.
     * Returns an empty data record.
     *
     * @param  workspace The workspace or organization to invite the user to.
     * @return Request object
     */
    public ItemRequest<Workspace> removeUser(String workspace) {
        String path = String.format("/workspaces/%s/removeUser", workspace);
        itest("evosuite", 116).given(workspace, "").checkEq(path, "/workspaces//removeUser");
        itest("randoop", 116).given(workspace, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/removeUser");
        itest("randoop", 116).given(workspace, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeUser");
        itest("randoop", 116).given(workspace, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/removeUser");
        itest("randoop", 116).given(workspace, "/tasks//attachments/Not Found/addProject").checkEq(path, "/workspaces//tasks//attachments/Not Found/addProject/removeUser");
        itest("randoop", 116).given(workspace, "200").checkEq(path, "/workspaces/200/removeUser");
        itest("randoop", 116).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found/removeUser");
        itest("randoop", 116).given(workspace, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/removeUser");
        itest("randoop", 116).given(workspace, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/removeUser");
        itest("randoop", 116).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeUser");
        itest("randoop", 116).given(workspace, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspaces/com.asana.errors.PremiumOnlyError: Payment Required/removeUser");
        itest("randoop", 116).given(workspace, "GET").checkEq(path, "/workspaces/GET/removeUser");
        itest("randoop", 116).given(workspace, "100").checkEq(path, "/workspaces/100/removeUser");
        itest("randoop", 116).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//removeUser");
        itest("evosuite", 116).given(workspace, "f<Zi").checkEq(path, "/workspaces/f<Zi/removeUser");
        itest("randoop", 116).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeUser");
        itest("randoop", 116).given(workspace, "POST").checkEq(path, "/workspaces/POST/removeUser");
        itest("randoop", 116).given(workspace, "0").checkEq(path, "/workspaces/0/removeUser");
        itest("randoop", 116).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/removeUser");
        itest("randoop", 116).given(workspace, "com.asana.errors.ServerError: Server Error").checkEq(path, "/workspaces/com.asana.errors.ServerError: Server Error/removeUser");
        itest("randoop", 116).given(workspace, "10").checkEq(path, "/workspaces/10/removeUser");
        itest("randoop", 116).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/removeUser");
        itest("randoop", 116).given(workspace, "/organizations//teams").checkEq(path, "/workspaces//organizations//teams/removeUser");
        itest("evosuite", 116).given(workspace, "com.github.javaparser.ast.observer.PropagatingAstObserver$1").checkEq(path, "/workspaces/com.github.javaparser.ast.observer.PropagatingAstObserver$1/removeUser");
        itest("randoop", 116).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/removeUser");
        itest("randoop", 116).given(workspace, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeUser");
        itest("randoop", 116).given(workspace, "").checkEq(path, "/workspaces//removeUser");
        itest("evosuite", 116).given(workspace, "~(VS?").checkEq(path, "/workspaces/~(VS?/removeUser");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "POST");
    }
}
