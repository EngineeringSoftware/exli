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

public class ProjectStatusesBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public ProjectStatusesBase(Client client) {
        super(client);
    }

    /**
     * Create a project status
     * *Deprecated: new integrations should prefer the &#x60;/status_updates&#x60; route.*  Creates a new status update on the project.  Returns the full record of the newly created project status update.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(ProjectStatus)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<ProjectStatus> createProjectStatusForProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/project_statuses".replace("{project_gid}", projectGid);
        itest("randoop", 31).given(projectGid, "200").checkEq(path, "/projects/200/project_statuses");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/project_statuses");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/project_statuses");
        itest("randoop", 31).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/project_statuses");
        itest("randoop", 31).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/project_statuses");
        itest("randoop", 31).given(projectGid, "0").checkEq(path, "/projects/0/project_statuses");
        itest("randoop", 31).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/project_statuses");
        itest("randoop", 31).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/project_statuses");
        itest("randoop", 31).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/project_statuses");
        itest("randoop", 31).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/project_statuses");
        itest("randoop", 31).given(projectGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200/project_statuses");
        itest("randoop", 31).given(projectGid, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/project_statuses");
        itest("evosuite", 31).given(projectGid, "limit").checkEq(path, "/projects/limit/project_statuses");
        itest("randoop", 31).given(projectGid, "POST").checkEq(path, "/projects/POST/project_statuses");
        itest("evosuite", 31).given(projectGid, "Ul").checkEq(path, "/projects/Ul/project_statuses");
        itest("evosuite", 31).given(projectGid, "~QqI9I").checkEq(path, "/projects/~QqI9I/project_statuses");
        itest("randoop", 31).given(projectGid, "100").checkEq(path, "/projects/100/project_statuses");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/project_statuses");
        itest("randoop", 31).given(projectGid, "/portfolios/").checkEq(path, "/projects//portfolios//project_statuses");
        itest("randoop", 31).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/project_statuses");
        itest("evosuite", 31).given(projectGid, "POST").checkEq(path, "/projects/POST/project_statuses");
        itest("randoop", 31).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/project_statuses");
        itest("evosuite", 31).given(projectGid, "eJn").checkEq(path, "/projects/eJn/project_statuses");
        itest("randoop", 31).given(projectGid, "").checkEq(path, "/projects//project_statuses");
        itest("randoop", 31).given(projectGid, "/webhooks/NoAuthorizationError").checkEq(path, "/projects//webhooks/NoAuthorizationError/project_statuses");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/project_statuses");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/project_statuses");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/project_statuses");
        itest("randoop", 31).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/project_statuses");
        itest("evosuite", 31).given(projectGid, "").checkEq(path, "/projects//project_statuses");
        itest("randoop", 31).given(projectGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/project_statuses");
        itest("randoop", 31).given(projectGid, "/tasks/200/addProject").checkEq(path, "/projects//tasks/200/addProject/project_statuses");
        itest("randoop", 31).given(projectGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/project_statuses");
        itest("randoop", 31).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/project_statuses");
        ItemRequest<ProjectStatus> req = new ItemRequest<ProjectStatus>(this, ProjectStatus.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<ProjectStatus> createProjectStatusForProject(String projectGid) throws IOException {
        return createProjectStatusForProject(projectGid, null, false);
    }

    /**
     * Delete a project status
     * *Deprecated: new integrations should prefer the &#x60;/status_updates/{status_gid}&#x60; route.*  Deletes a specific, existing project status update.  Returns an empty data record.
     * @param projectStatusGid The project status update to get. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteProjectStatus(String projectStatusGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_statuses/{project_status_gid}".replace("{project_status_gid}", projectStatusGid);
        itest("randoop", 53).given(projectStatusGid, "Rate Limit Enforced").checkEq(path, "/project_statuses/Rate Limit Enforced");
        itest("randoop", 53).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 53).given(projectStatusGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/project_statuses/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 53).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("evosuite", 53).given(projectStatusGid, "/projects/{project_gid}/project_statuses").checkEq(path, "/project_statuses//projects/{project_gid}/project_statuses");
        itest("randoop", 53).given(projectStatusGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/project_statuses//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 53).given(projectStatusGid, "Sync token invalid or too old").checkEq(path, "/project_statuses/Sync token invalid or too old");
        itest("evosuite", 53).given(projectStatusGid, "u`$UgVc{8lXELH=LvW").checkEq(path, "/project_statuses/u`$UgVc{8lXELH=LvW");
        itest("randoop", 53).given(projectStatusGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/project_statuses/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("evosuite", 53).given(projectStatusGid, "").checkEq(path, "/project_statuses/");
        itest("randoop", 53).given(projectStatusGid, "/workspaces/").checkEq(path, "/project_statuses//workspaces/");
        itest("randoop", 53).given(projectStatusGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/project_statuses//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 53).given(projectStatusGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/project_statuses/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 53).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 53).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 53).given(projectStatusGid, "Server Error").checkEq(path, "/project_statuses/Server Error");
        itest("evosuite", 53).given(projectStatusGid, "{project_gid}").checkEq(path, "/project_statuses/{project_gid}");
        itest("randoop", 53).given(projectStatusGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/project_statuses/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 53).given(projectStatusGid, "POST").checkEq(path, "/project_statuses/POST");
        itest("randoop", 53).given(projectStatusGid, "/attachments/Not Found").checkEq(path, "/project_statuses//attachments/Not Found");
        itest("randoop", 53).given(projectStatusGid, "0").checkEq(path, "/project_statuses/0");
        itest("randoop", 53).given(projectStatusGid, "Not Found").checkEq(path, "/project_statuses/Not Found");
        itest("randoop", 53).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 53).given(projectStatusGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/project_statuses//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 53).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 53).given(projectStatusGid, "NoAuthorizationError").checkEq(path, "/project_statuses/NoAuthorizationError");
        itest("randoop", 53).given(projectStatusGid, "POST").checkEq(path, "/project_statuses/POST");
        itest("randoop", 53).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 53).given(projectStatusGid, "EOL").checkEq(path, "/project_statuses/EOL");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteProjectStatus(String projectStatusGid) throws IOException {
        return deleteProjectStatus(projectStatusGid, null, false);
    }

    /**
     * Get a project status
     * *Deprecated: new integrations should prefer the &#x60;/status_updates/{status_gid}&#x60; route.*  Returns the complete record for a single status update.
     * @param projectStatusGid The project status update to get. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(ProjectStatus)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<ProjectStatus> getProjectStatus(String projectStatusGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_statuses/{project_status_gid}".replace("{project_status_gid}", projectStatusGid);
        itest("evosuite", 75).given(projectStatusGid, "com.github.javaparser.metamodel.ForEachStmtMetaModel").checkEq(path, "/project_statuses/com.github.javaparser.metamodel.ForEachStmtMetaModel");
        itest("randoop", 75).given(projectStatusGid, "/workspaces/").checkEq(path, "/project_statuses//workspaces/");
        itest("randoop", 75).given(projectStatusGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/project_statuses/urn:ietf:wg:oauth:2.0:oob");
        itest("evosuite", 75).given(projectStatusGid, "83R@UszJ3r=h:W").checkEq(path, "/project_statuses/83R@UszJ3r=h:W");
        itest("randoop", 75).given(projectStatusGid, "/tasks/200/addProject").checkEq(path, "/project_statuses//tasks/200/addProject");
        itest("randoop", 75).given(projectStatusGid, "0").checkEq(path, "/project_statuses/0");
        itest("randoop", 75).given(projectStatusGid, "hi!").checkEq(path, "/project_statuses/hi!");
        itest("randoop", 75).given(projectStatusGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/project_statuses/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 75).given(projectStatusGid, "/tags").checkEq(path, "/project_statuses//tags");
        itest("randoop", 75).given(projectStatusGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/project_statuses/com.asana.errors.AsanaError: hi!");
        itest("evosuite", 75).given(projectStatusGid, "EOL").checkEq(path, "/project_statuses/EOL");
        itest("randoop", 75).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 75).given(projectStatusGid, "").checkEq(path, "/project_statuses/");
        itest("evosuite", 75).given(projectStatusGid, "gGG<P%`G,Y!5\"q").checkEq(path, "/project_statuses/gGG<P%`G,Y!5\"q");
        itest("randoop", 75).given(projectStatusGid, "Invalid Request").checkEq(path, "/project_statuses/Invalid Request");
        itest("randoop", 75).given(projectStatusGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/project_statuses//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 75).given(projectStatusGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/project_statuses//tasks//attachments/Not Found/addProject");
        itest("randoop", 75).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 75).given(projectStatusGid, "Payment Required").checkEq(path, "/project_statuses/Payment Required");
        itest("randoop", 75).given(projectStatusGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/project_statuses/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 75).given(projectStatusGid, "NoAuthorizationError").checkEq(path, "/project_statuses/NoAuthorizationError");
        itest("randoop", 75).given(projectStatusGid, "Not Found").checkEq(path, "/project_statuses/Not Found");
        itest("evosuite", 75).given(projectStatusGid, "GET").checkEq(path, "/project_statuses/GET");
        itest("randoop", 75).given(projectStatusGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/project_statuses/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 75).given(projectStatusGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/project_statuses//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 75).given(projectStatusGid, "200").checkEq(path, "/project_statuses/200");
        itest("randoop", 75).given(projectStatusGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/project_statuses//goals/{goal_gid}/subgoals");
        itest("randoop", 75).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 75).given(projectStatusGid, "/teams/%s").checkEq(path, "/project_statuses//teams/%s");
        itest("randoop", 75).given(projectStatusGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/project_statuses//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 75).given(projectStatusGid, "10").checkEq(path, "/project_statuses/10");
        itest("evosuite", 75).given(projectStatusGid, "").checkEq(path, "/project_statuses/");
        itest("randoop", 75).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 75).given(projectStatusGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/project_statuses/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 75).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 75).given(projectStatusGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 75).given(projectStatusGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/project_statuses//goals/{goal_gid}/addSubgoal");
        ItemRequest<ProjectStatus> req = new ItemRequest<ProjectStatus>(this, ProjectStatus.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<ProjectStatus> getProjectStatus(String projectStatusGid) throws IOException {
        return getProjectStatus(projectStatusGid, null, false);
    }

    /**
     * Get statuses from a project
     * *Deprecated: new integrations should prefer the &#x60;/status_updates&#x60; route.*  Returns the compact project status update records for all updates on the project.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(ProjectStatus)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<ProjectStatus> getProjectStatusesForProject(String projectGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/project_statuses".replace("{project_gid}", projectGid);
        itest("randoop", 99).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/project_statuses");
        itest("randoop", 99).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/project_statuses");
        itest("evosuite", 99).given(projectGid, "jO.fyt\"/h^r%t").checkEq(path, "/projects/jO.fyt\"/h^r%t/project_statuses");
        itest("randoop", 99).given(projectGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject/project_statuses");
        itest("randoop", 99).given(projectGid, "").checkEq(path, "/projects//project_statuses");
        itest("randoop", 99).given(projectGid, "POST").checkEq(path, "/projects/POST/project_statuses");
        itest("randoop", 99).given(projectGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/project_statuses");
        itest("evosuite", 99).given(projectGid, "/W").checkEq(path, "/projects//W/project_statuses");
        itest("randoop", 99).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/project_statuses");
        itest("randoop", 99).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/project_statuses");
        itest("randoop", 99).given(projectGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error/project_statuses");
        itest("randoop", 99).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/project_statuses");
        itest("randoop", 99).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/project_statuses");
        itest("randoop", 99).given(projectGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/project_statuses");
        itest("evosuite", 99).given(projectGid, "").checkEq(path, "/projects//project_statuses");
        itest("randoop", 99).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/project_statuses");
        itest("randoop", 99).given(projectGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/project_statuses");
        itest("evosuite", 99).given(projectGid, "/projects/limit/project_statuses").checkEq(path, "/projects//projects/limit/project_statuses/project_statuses");
        itest("randoop", 99).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/project_statuses");
        itest("randoop", 99).given(projectGid, "200").checkEq(path, "/projects/200/project_statuses");
        itest("randoop", 99).given(projectGid, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/project_statuses");
        itest("randoop", 99).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/project_statuses");
        itest("randoop", 99).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/project_statuses");
        itest("randoop", 99).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/project_statuses");
        itest("randoop", 99).given(projectGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/projects/com.asana.errors.AsanaError: NoAuthorizationError/project_statuses");
        itest("randoop", 99).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/project_statuses");
        itest("randoop", 99).given(projectGid, "hi!").checkEq(path, "/projects/hi!/project_statuses");
        itest("randoop", 99).given(projectGid, "10").checkEq(path, "/projects/10/project_statuses");
        itest("randoop", 99).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/project_statuses");
        itest("randoop", 99).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/project_statuses");
        itest("randoop", 99).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/project_statuses");
        itest("randoop", 99).given(projectGid, "/webhooks/NoAuthorizationError").checkEq(path, "/projects//webhooks/NoAuthorizationError/project_statuses");
        itest("randoop", 99).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/project_statuses");
        CollectionRequest<ProjectStatus> req = new CollectionRequest<ProjectStatus>(this, ProjectStatus.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<ProjectStatus> getProjectStatusesForProject(String projectGid) throws IOException {
        return getProjectStatusesForProject(projectGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
