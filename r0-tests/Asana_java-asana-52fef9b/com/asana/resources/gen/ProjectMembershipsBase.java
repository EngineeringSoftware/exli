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

public class ProjectMembershipsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public ProjectMembershipsBase(Client client) {
        super(client);
    }

    /**
     * Get a project membership
     * Returns the complete project record for a single project membership.
     * @param projectMembershipGid  (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(ProjectMembership)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<ProjectMembership> getProjectMembership(String projectMembershipGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_memberships/{project_membership_gid}".replace("{project_membership_gid}", projectMembershipGid);
        itest("randoop", 31).given(projectMembershipGid, "Not Found").checkEq(path, "/project_memberships/Not Found");
        itest("randoop", 31).given(projectMembershipGid, "POST").checkEq(path, "/project_memberships/POST");
        itest("randoop", 31).given(projectMembershipGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/project_memberships//goals/{goal_gid}/subgoals");
        itest("randoop", 31).given(projectMembershipGid, "10").checkEq(path, "/project_memberships/10");
        itest("randoop", 31).given(projectMembershipGid, "hi!").checkEq(path, "/project_memberships/hi!");
        itest("randoop", 31).given(projectMembershipGid, "/projects/Not Found/removeFollowers").checkEq(path, "/project_memberships//projects/Not Found/removeFollowers");
        itest("randoop", 31).given(projectMembershipGid, "200").checkEq(path, "/project_memberships/200");
        itest("randoop", 31).given(projectMembershipGid, "Server Error").checkEq(path, "/project_memberships/Server Error");
        itest("randoop", 31).given(projectMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 31).given(projectMembershipGid, "/webhooks/NoAuthorizationError").checkEq(path, "/project_memberships//webhooks/NoAuthorizationError");
        itest("randoop", 31).given(projectMembershipGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/project_memberships/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("evosuite", 31).given(projectMembershipGid, "").checkEq(path, "/project_memberships/");
        itest("randoop", 31).given(projectMembershipGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/project_memberships/com.asana.errors.AsanaError: hi!");
        itest("randoop", 31).given(projectMembershipGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/project_memberships//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 31).given(projectMembershipGid, "").checkEq(path, "/project_memberships/");
        itest("randoop", 31).given(projectMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 31).given(projectMembershipGid, "/portfolios/").checkEq(path, "/project_memberships//portfolios/");
        itest("evosuite", 31).given(projectMembershipGid, "5uynrP%Ir5").checkEq(path, "/project_memberships/5uynrP%Ir5");
        itest("randoop", 31).given(projectMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("evosuite", 31).given(projectMembershipGid, "`\"N").checkEq(path, "/project_memberships/`\"N");
        itest("evosuite", 31).given(projectMembershipGid, "3G[xAnjl&").checkEq(path, "/project_memberships/3G[xAnjl&");
        itest("evosuite", 31).given(projectMembershipGid, "6").checkEq(path, "/project_memberships/6");
        itest("randoop", 31).given(projectMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 31).given(projectMembershipGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/project_memberships/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 31).given(projectMembershipGid, "NoAuthorizationError").checkEq(path, "/project_memberships/NoAuthorizationError");
        itest("randoop", 31).given(projectMembershipGid, "/goals/Sync token invalid or too old").checkEq(path, "/project_memberships//goals/Sync token invalid or too old");
        itest("randoop", 31).given(projectMembershipGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/project_memberships//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 31).given(projectMembershipGid, "Ul").checkEq(path, "/project_memberships/Ul");
        itest("randoop", 31).given(projectMembershipGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/project_memberships//tasks//attachments/Not Found/addProject");
        itest("randoop", 31).given(projectMembershipGid, "/tags").checkEq(path, "/project_memberships//tags");
        itest("randoop", 31).given(projectMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 31).given(projectMembershipGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/project_memberships//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 31).given(projectMembershipGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/project_memberships/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 31).given(projectMembershipGid, "/attachments/Not Found").checkEq(path, "/project_memberships//attachments/Not Found");
        itest("randoop", 31).given(projectMembershipGid, "Sync token invalid or too old").checkEq(path, "/project_memberships/Sync token invalid or too old");
        itest("randoop", 31).given(projectMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 31).given(projectMembershipGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/project_memberships/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 31).given(projectMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("randoop", 31).given(projectMembershipGid, "Forbidden").checkEq(path, "/project_memberships/Forbidden");
        itest("randoop", 31).given(projectMembershipGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/project_memberships/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 31).given(projectMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        ItemRequest<ProjectMembership> req = new ItemRequest<ProjectMembership>(this, ProjectMembership.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<ProjectMembership> getProjectMembership(String projectMembershipGid) throws IOException {
        return getProjectMembership(projectMembershipGid, null, false);
    }

    /**
     * Get memberships from a project
     * Returns the compact project membership records for the project.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param user A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(ProjectMembership)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<ProjectMembership> getProjectMembershipsForProject(String projectGid, String user, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/project_memberships".replace("{project_gid}", projectGid);
        itest("randoop", 56).given(projectGid, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/projects//portfolios/Rate Limit Enforced/portfolio_memberships/project_memberships");
        itest("randoop", 56).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/project_memberships");
        itest("randoop", 56).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/project_memberships");
        itest("randoop", 56).given(projectGid, "100").checkEq(path, "/projects/100/project_memberships");
        itest("randoop", 56).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/project_memberships");
        itest("randoop", 56).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/project_memberships");
        itest("randoop", 56).given(projectGid, "GET").checkEq(path, "/projects/GET/project_memberships");
        itest("randoop", 56).given(projectGid, "0").checkEq(path, "/projects/0/project_memberships");
        itest("randoop", 56).given(projectGid, "/tasks/200/addProject").checkEq(path, "/projects//tasks/200/addProject/project_memberships");
        itest("randoop", 56).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/project_memberships");
        itest("randoop", 56).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/project_memberships");
        itest("randoop", 56).given(projectGid, "POST").checkEq(path, "/projects/POST/project_memberships");
        itest("evosuite", 56).given(projectGid, "GET").checkEq(path, "/projects/GET/project_memberships");
        itest("randoop", 56).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/project_memberships");
        itest("evosuite", 56).given(projectGid, "").checkEq(path, "/projects//project_memberships");
        itest("randoop", 56).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/project_memberships");
        itest("randoop", 56).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/project_memberships");
        itest("randoop", 56).given(projectGid, "/organizations//teams").checkEq(path, "/projects//organizations//teams/project_memberships");
        itest("randoop", 56).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/project_memberships");
        itest("randoop", 56).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/project_memberships");
        itest("randoop", 56).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/project_memberships");
        itest("randoop", 56).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/project_memberships");
        itest("randoop", 56).given(projectGid, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/project_memberships");
        itest("randoop", 56).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/project_memberships");
        itest("randoop", 56).given(projectGid, "").checkEq(path, "/projects//project_memberships");
        CollectionRequest<ProjectMembership> req = new CollectionRequest<ProjectMembership>(this, ProjectMembership.class, path, "GET").query("user", user).query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<ProjectMembership> getProjectMembershipsForProject(String projectGid, String user) throws IOException {
        return getProjectMembershipsForProject(projectGid, user, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
