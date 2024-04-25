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

public class ProjectBriefsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public ProjectBriefsBase(Client client) {
        super(client);
    }

    /**
     * Create a project brief
     * Creates a new project brief.  Returns the full record of the newly created project brief.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> createProjectBrief(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/project_briefs".replace("{project_gid}", projectGid);
        itest("randoop", 31).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/project_briefs");
        itest("randoop", 31).given(projectGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/project_briefs");
        itest("randoop", 31).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/project_briefs");
        itest("randoop", 31).given(projectGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/project_briefs");
        itest("randoop", 31).given(projectGid, "0").checkEq(path, "/projects/0/project_briefs");
        itest("randoop", 31).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/project_briefs");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/project_briefs");
        itest("randoop", 31).given(projectGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/projects//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/project_briefs");
        itest("randoop", 31).given(projectGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject/project_briefs");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/project_briefs");
        itest("randoop", 31).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/project_briefs");
        itest("randoop", 31).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/project_briefs");
        itest("randoop", 31).given(projectGid, "").checkEq(path, "/projects//project_briefs");
        itest("randoop", 31).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/project_briefs");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/project_briefs");
        itest("randoop", 31).given(projectGid, "10").checkEq(path, "/projects/10/project_briefs");
        itest("randoop", 31).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/project_briefs");
        itest("randoop", 31).given(projectGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error/project_briefs");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/project_briefs");
        itest("randoop", 31).given(projectGid, "/goals/Sync token invalid or too old").checkEq(path, "/projects//goals/Sync token invalid or too old/project_briefs");
        itest("evosuite", 31).given(projectGid, "").checkEq(path, "/projects//project_briefs");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/project_briefs");
        itest("randoop", 31).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/project_briefs");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/project_briefs");
        itest("randoop", 31).given(projectGid, "/portfolios/").checkEq(path, "/projects//portfolios//project_briefs");
        itest("evosuite", 31).given(projectGid, "h:eke").checkEq(path, "/projects/h:eke/project_briefs");
        itest("randoop", 31).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/project_briefs");
        itest("randoop", 31).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/project_briefs");
        itest("randoop", 31).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/project_briefs");
        itest("randoop", 31).given(projectGid, "/tags").checkEq(path, "/projects//tags/project_briefs");
        itest("randoop", 31).given(projectGid, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/project_briefs");
        itest("randoop", 31).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/project_briefs");
        itest("randoop", 31).given(projectGid, "GET").checkEq(path, "/projects/GET/project_briefs");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> createProjectBrief(String projectGid) throws IOException {
        return createProjectBrief(projectGid, null, false);
    }

    /**
     * Delete a project brief
     * Deletes a specific, existing project brief.  Returns an empty data record.
     * @param projectBriefGid Globally unique identifier for the project brief. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteProjectBrief(String projectBriefGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_briefs/{project_brief_gid}".replace("{project_brief_gid}", projectBriefGid);
        itest("randoop", 53).given(projectBriefGid, "/attachments/").checkEq(path, "/project_briefs//attachments/");
        itest("randoop", 53).given(projectBriefGid, "/workspaces/").checkEq(path, "/project_briefs//workspaces/");
        itest("randoop", 53).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 53).given(projectBriefGid, "Not Found").checkEq(path, "/project_briefs/Not Found");
        itest("randoop", 53).given(projectBriefGid, "10").checkEq(path, "/project_briefs/10");
        itest("randoop", 53).given(projectBriefGid, "NoAuthorizationError").checkEq(path, "/project_briefs/NoAuthorizationError");
        itest("randoop", 53).given(projectBriefGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/project_briefs//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("evosuite", 53).given(projectBriefGid, "/project_briefs/{project_brief_gid}").checkEq(path, "/project_briefs//project_briefs/{project_brief_gid}");
        itest("randoop", 53).given(projectBriefGid, "Payment Required").checkEq(path, "/project_briefs/Payment Required");
        itest("randoop", 53).given(projectBriefGid, "Forbidden").checkEq(path, "/project_briefs/Forbidden");
        itest("randoop", 53).given(projectBriefGid, "Server Error").checkEq(path, "/project_briefs/Server Error");
        itest("randoop", 53).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 53).given(projectBriefGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/project_briefs//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 53).given(projectBriefGid, "hi!").checkEq(path, "/project_briefs/hi!");
        itest("randoop", 53).given(projectBriefGid, "0").checkEq(path, "/project_briefs/0");
        itest("randoop", 53).given(projectBriefGid, "").checkEq(path, "/project_briefs/");
        itest("randoop", 53).given(projectBriefGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/project_briefs//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 53).given(projectBriefGid, "POST").checkEq(path, "/project_briefs/POST");
        itest("randoop", 53).given(projectBriefGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/project_briefs/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 53).given(projectBriefGid, "/goals/Sync token invalid or too old").checkEq(path, "/project_briefs//goals/Sync token invalid or too old");
        itest("randoop", 53).given(projectBriefGid, "GET").checkEq(path, "/project_briefs/GET");
        itest("randoop", 53).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 53).given(projectBriefGid, "z0JAbG").checkEq(path, "/project_briefs/z0JAbG");
        itest("randoop", 53).given(projectBriefGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/project_briefs/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 53).given(projectBriefGid, "Sync token invalid or too old").checkEq(path, "/project_briefs/Sync token invalid or too old");
        itest("randoop", 53).given(projectBriefGid, "/tags/Payment Required").checkEq(path, "/project_briefs//tags/Payment Required");
        itest("randoop", 53).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 53).given(projectBriefGid, "200").checkEq(path, "/project_briefs/200");
        itest("randoop", 53).given(projectBriefGid, "Invalid Request").checkEq(path, "/project_briefs/Invalid Request");
        itest("randoop", 53).given(projectBriefGid, "/tasks/GET").checkEq(path, "/project_briefs//tasks/GET");
        itest("evosuite", 53).given(projectBriefGid, "").checkEq(path, "/project_briefs/");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteProjectBrief(String projectBriefGid) throws IOException {
        return deleteProjectBrief(projectBriefGid, null, false);
    }

    /**
     * Get a project brief
     * Get the full record for a project brief.
     * @param projectBriefGid Globally unique identifier for the project brief. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> getProjectBrief(String projectBriefGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_briefs/{project_brief_gid}".replace("{project_brief_gid}", projectBriefGid);
        itest("randoop", 75).given(projectBriefGid, "").checkEq(path, "/project_briefs/");
        itest("randoop", 75).given(projectBriefGid, "NoAuthorizationError").checkEq(path, "/project_briefs/NoAuthorizationError");
        itest("randoop", 75).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 75).given(projectBriefGid, "Sync token invalid or too old").checkEq(path, "/project_briefs/Sync token invalid or too old");
        itest("randoop", 75).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 75).given(projectBriefGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/project_briefs/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 75).given(projectBriefGid, "POST").checkEq(path, "/project_briefs/POST");
        itest("evosuite", 75).given(projectBriefGid, "/project_briefs/{project_brief_gid}").checkEq(path, "/project_briefs//project_briefs/{project_brief_gid}");
        itest("evosuite", 75).given(projectBriefGid, "!").checkEq(path, "/project_briefs/!");
        itest("evosuite", 75).given(projectBriefGid, "(Pgv4U> ;Q").checkEq(path, "/project_briefs/(Pgv4U> ;Q");
        itest("evosuite", 75).given(projectBriefGid, "GET").checkEq(path, "/project_briefs/GET");
        itest("randoop", 75).given(projectBriefGid, "100").checkEq(path, "/project_briefs/100");
        itest("evosuite", 75).given(projectBriefGid, "").checkEq(path, "/project_briefs/");
        itest("randoop", 75).given(projectBriefGid, "hi!").checkEq(path, "/project_briefs/hi!");
        itest("randoop", 75).given(projectBriefGid, "/attachments/Not Found").checkEq(path, "/project_briefs//attachments/Not Found");
        itest("randoop", 75).given(projectBriefGid, "/portfolios/").checkEq(path, "/project_briefs//portfolios/");
        itest("randoop", 75).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 75).given(projectBriefGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/project_briefs//goals/{goal_gid}/subgoals");
        itest("randoop", 75).given(projectBriefGid, "/goals/Sync token invalid or too old").checkEq(path, "/project_briefs//goals/Sync token invalid or too old");
        itest("randoop", 75).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 75).given(projectBriefGid, "/webhooks/NoAuthorizationError").checkEq(path, "/project_briefs//webhooks/NoAuthorizationError");
        itest("randoop", 75).given(projectBriefGid, "Payment Required").checkEq(path, "/project_briefs/Payment Required");
        itest("randoop", 75).given(projectBriefGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/project_briefs/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 75).given(projectBriefGid, "/workspaces//addUser").checkEq(path, "/project_briefs//workspaces//addUser");
        itest("randoop", 75).given(projectBriefGid, "/projects/Not Found/removeFollowers").checkEq(path, "/project_briefs//projects/Not Found/removeFollowers");
        itest("randoop", 75).given(projectBriefGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/project_briefs//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> getProjectBrief(String projectBriefGid) throws IOException {
        return getProjectBrief(projectBriefGid, null, false);
    }

    /**
     * Update a project brief
     * An existing project brief can be updated by making a PUT request on the URL for that project brief. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated project brief record.
     * @param projectBriefGid Globally unique identifier for the project brief. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> updateProjectBrief(String projectBriefGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_briefs/{project_brief_gid}".replace("{project_brief_gid}", projectBriefGid);
        itest("randoop", 97).given(projectBriefGid, "Sync token invalid or too old").checkEq(path, "/project_briefs/Sync token invalid or too old");
        itest("randoop", 97).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 97).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 97).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 97).given(projectBriefGid, "vy").checkEq(path, "/project_briefs/vy");
        itest("randoop", 97).given(projectBriefGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/project_briefs//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 97).given(projectBriefGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/project_briefs/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 97).given(projectBriefGid, "/portfolios/").checkEq(path, "/project_briefs//portfolios/");
        itest("randoop", 97).given(projectBriefGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/project_briefs/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 97).given(projectBriefGid, "Rate Limit Enforced").checkEq(path, "/project_briefs/Rate Limit Enforced");
        itest("randoop", 97).given(projectBriefGid, "Not Found").checkEq(path, "/project_briefs/Not Found");
        itest("randoop", 97).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 97).given(projectBriefGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/project_briefs//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 97).given(projectBriefGid, "0").checkEq(path, "/project_briefs/0");
        itest("randoop", 97).given(projectBriefGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/project_briefs/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 97).given(projectBriefGid, "hi!").checkEq(path, "/project_briefs/hi!");
        itest("randoop", 97).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 97).given(projectBriefGid, "/workspaces/").checkEq(path, "/project_briefs//workspaces/");
        itest("randoop", 97).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 97).given(projectBriefGid, "Payment Required").checkEq(path, "/project_briefs/Payment Required");
        itest("evosuite", 97).given(projectBriefGid, "/project_briefs/z0JAbG").checkEq(path, "/project_briefs//project_briefs/z0JAbG");
        itest("randoop", 97).given(projectBriefGid, "").checkEq(path, "/project_briefs/");
        itest("randoop", 97).given(projectBriefGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/project_briefs/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 97).given(projectBriefGid, "GET").checkEq(path, "/project_briefs/GET");
        itest("randoop", 97).given(projectBriefGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/project_briefs/com.asana.errors.AsanaError: hi!");
        itest("evosuite", 97).given(projectBriefGid, "").checkEq(path, "/project_briefs/");
        itest("evosuite", 97).given(projectBriefGid, "DELETE").checkEq(path, "/project_briefs/DELETE");
        itest("randoop", 97).given(projectBriefGid, "/tags").checkEq(path, "/project_briefs//tags");
        itest("randoop", 97).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> updateProjectBrief(String projectBriefGid) throws IOException {
        return updateProjectBrief(projectBriefGid, null, false);
    }
}
