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

public class SectionsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public SectionsBase(Client client) {
        super(client);
    }

    /**
     * Add task to section
     * Add a task to a specific, existing section. This will remove the task from other sections of the project.  The task will be inserted at the top of a section unless an insert_before or insert_after parameter is declared.  This does not work for separators (tasks with the resource_subtype of section).
     * @param sectionGid The globally unique identifier for the section. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addTaskForSection(String sectionGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/sections/{section_gid}/addTask".replace("{section_gid}", sectionGid);
        itest("randoop", 31).given(sectionGid, "hi!").checkEq(path, "/sections/hi!/addTask");
        itest("randoop", 31).given(sectionGid, "Not Found").checkEq(path, "/sections/Not Found/addTask");
        itest("randoop", 31).given(sectionGid, "Sync token invalid or too old").checkEq(path, "/sections/Sync token invalid or too old/addTask");
        itest("randoop", 31).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addTask");
        itest("evosuite", 31).given(sectionGid, "").checkEq(path, "/sections//addTask");
        itest("randoop", 31).given(sectionGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/sections//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addTask");
        itest("evosuite", 31).given(sectionGid, "jq*)$_ec`j").checkEq(path, "/sections/jq*)$_ec`j/addTask");
        itest("randoop", 31).given(sectionGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/sections//projects/Rate Limit Enforced/sections/addTask");
        itest("randoop", 31).given(sectionGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/sections/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addTask");
        itest("randoop", 31).given(sectionGid, "/tags").checkEq(path, "/sections//tags/addTask");
        itest("randoop", 31).given(sectionGid, "/projects/Not Found/removeFollowers").checkEq(path, "/sections//projects/Not Found/removeFollowers/addTask");
        itest("randoop", 31).given(sectionGid, "/organizations//teams").checkEq(path, "/sections//organizations//teams/addTask");
        itest("randoop", 31).given(sectionGid, "Payment Required").checkEq(path, "/sections/Payment Required/addTask");
        itest("randoop", 31).given(sectionGid, "/tasks/200/addProject").checkEq(path, "/sections//tasks/200/addProject/addTask");
        itest("randoop", 31).given(sectionGid, "/project_statuses/Server Error").checkEq(path, "/sections//project_statuses/Server Error/addTask");
        itest("randoop", 31).given(sectionGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/sections//goals/{goal_gid}/subgoals/addTask");
        itest("randoop", 31).given(sectionGid, "Invalid Request").checkEq(path, "/sections/Invalid Request/addTask");
        itest("randoop", 31).given(sectionGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/sections/com.asana.errors.InvalidRequestError: Invalid Request/addTask");
        itest("randoop", 31).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addTask");
        itest("randoop", 31).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/addTask");
        itest("randoop", 31).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addTask");
        itest("randoop", 31).given(sectionGid, "NoAuthorizationError").checkEq(path, "/sections/NoAuthorizationError/addTask");
        itest("randoop", 31).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/addTask");
        itest("randoop", 31).given(sectionGid, "/workspaces/").checkEq(path, "/sections//workspaces//addTask");
        itest("randoop", 31).given(sectionGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/sections/com.asana.errors.RetryableAsanaError: Server Error/addTask");
        itest("randoop", 31).given(sectionGid, "/attachments/Not Found").checkEq(path, "/sections//attachments/Not Found/addTask");
        itest("randoop", 31).given(sectionGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/sections/com.asana.errors.AsanaError: hi!/addTask");
        itest("evosuite", 31).given(sectionGid, "/workspaces/com.github.javaparser.metamodel.VariableDeclarationExprMetaModel").checkEq(path, "/sections//workspaces/com.github.javaparser.metamodel.VariableDeclarationExprMetaModel/addTask");
        itest("randoop", 31).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addTask");
        itest("randoop", 31).given(sectionGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/sections//goals/{goal_gid}/addSubgoal/addTask");
        itest("randoop", 31).given(sectionGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/sections/com.asana.errors.PremiumOnlyError: Payment Required/addTask");
        itest("randoop", 31).given(sectionGid, "200").checkEq(path, "/sections/200/addTask");
        itest("randoop", 31).given(sectionGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/sections//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addTask");
        itest("randoop", 31).given(sectionGid, "").checkEq(path, "/sections//addTask");
        itest("randoop", 31).given(sectionGid, "Rate Limit Enforced").checkEq(path, "/sections/Rate Limit Enforced/addTask");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addTaskForSection(String sectionGid) throws IOException {
        return addTaskForSection(sectionGid, null, false);
    }

    /**
     * Create a section in a project
     * Creates a new section in a project. Returns the full record of the newly created section.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Section)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Section> createSectionForProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/sections".replace("{project_gid}", projectGid);
        itest("randoop", 53).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/sections");
        itest("randoop", 53).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/sections");
        itest("randoop", 53).given(projectGid, "0").checkEq(path, "/projects/0/sections");
        itest("randoop", 53).given(projectGid, "/tasks/GET").checkEq(path, "/projects//tasks/GET/sections");
        itest("randoop", 53).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/sections");
        itest("randoop", 53).given(projectGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error/sections");
        itest("randoop", 53).given(projectGid, "/tags").checkEq(path, "/projects//tags/sections");
        itest("evosuite", 53).given(projectGid, "/T8EC#8M^i>7=cei'!").checkEq(path, "/projects//T8EC#8M^i>7=cei'!/sections");
        itest("randoop", 53).given(projectGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/sections");
        itest("randoop", 53).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/sections");
        itest("randoop", 53).given(projectGid, "").checkEq(path, "/projects//sections");
        itest("randoop", 53).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/sections");
        itest("randoop", 53).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/sections");
        itest("evosuite", 53).given(projectGid, "_KL(cFb").checkEq(path, "/projects/_KL(cFb/sections");
        itest("randoop", 53).given(projectGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200/sections");
        itest("randoop", 53).given(projectGid, "/projects/Not Found/removeFollowers").checkEq(path, "/projects//projects/Not Found/removeFollowers/sections");
        itest("randoop", 53).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/sections");
        itest("randoop", 53).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/sections");
        itest("randoop", 53).given(projectGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/sections");
        itest("randoop", 53).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/sections");
        itest("randoop", 53).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/sections");
        itest("evosuite", 53).given(projectGid, "/sections/*'tyuy:4#F.II T6").checkEq(path, "/projects//sections/*'tyuy:4#F.II T6/sections");
        itest("randoop", 53).given(projectGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/sections");
        itest("randoop", 53).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/sections");
        itest("evosuite", 53).given(projectGid, "0k2Eb(?*t1TR0(").checkEq(path, "/projects/0k2Eb(?*t1TR0(/sections");
        itest("randoop", 53).given(projectGid, "hi!").checkEq(path, "/projects/hi!/sections");
        itest("randoop", 53).given(projectGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/sections");
        itest("randoop", 53).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/sections");
        itest("evosuite", 53).given(projectGid, "/projects/com.github.javaparser.ast.nodeTypes.NodeWithVariables$1Helper/sections").checkEq(path, "/projects//projects/com.github.javaparser.ast.nodeTypes.NodeWithVariables$1Helper/sections/sections");
        itest("randoop", 53).given(projectGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/sections");
        itest("randoop", 53).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/sections");
        itest("evosuite", 53).given(projectGid, "com.github.javaparser.ast.nodeTypes.NodeWithVariables$1Helper").checkEq(path, "/projects/com.github.javaparser.ast.nodeTypes.NodeWithVariables$1Helper/sections");
        itest("randoop", 53).given(projectGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals/sections");
        ItemRequest<Section> req = new ItemRequest<Section>(this, Section.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Section> createSectionForProject(String projectGid) throws IOException {
        return createSectionForProject(projectGid, null, false);
    }

    /**
     * Delete a section
     * A specific, existing section can be deleted by making a DELETE request on the URL for that section.  Note that sections must be empty to be deleted.  The last remaining section cannot be deleted.  Returns an empty data block.
     * @param sectionGid The globally unique identifier for the section. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteSection(String sectionGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/sections/{section_gid}".replace("{section_gid}", sectionGid);
        itest("randoop", 75).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 75).given(sectionGid, "@%-<lx+/.TQC=G,").checkEq(path, "/sections/@%-<lx+/.TQC=G,");
        itest("randoop", 75).given(sectionGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/sections//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 75).given(sectionGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/sections//projects/Rate Limit Enforced/sections");
        itest("evosuite", 75).given(sectionGid, "5:Bf-Ul91ws#2oA^").checkEq(path, "/sections/5:Bf-Ul91ws#2oA^");
        itest("randoop", 75).given(sectionGid, "GET").checkEq(path, "/sections/GET");
        itest("randoop", 75).given(sectionGid, "Forbidden").checkEq(path, "/sections/Forbidden");
        itest("randoop", 75).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 75).given(sectionGid, "/attachments/").checkEq(path, "/sections//attachments/");
        itest("randoop", 75).given(sectionGid, "NoAuthorizationError").checkEq(path, "/sections/NoAuthorizationError");
        itest("randoop", 75).given(sectionGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/sections/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 75).given(sectionGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/sections/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 75).given(sectionGid, "~!J $b=d").checkEq(path, "/sections/~!J $b=d");
        itest("randoop", 75).given(sectionGid, "0").checkEq(path, "/sections/0");
        itest("randoop", 75).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 75).given(sectionGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/sections//goals/{goal_gid}/subgoals");
        itest("randoop", 75).given(sectionGid, "100").checkEq(path, "/sections/100");
        itest("randoop", 75).given(sectionGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/sections/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 75).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Invalid%20Request").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Invalid%20Request");
        itest("randoop", 75).given(sectionGid, "").checkEq(path, "/sections/");
        itest("randoop", 75).given(sectionGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/sections/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 75).given(sectionGid, "Invalid Request").checkEq(path, "/sections/Invalid Request");
        itest("randoop", 75).given(sectionGid, "/attachments/Not Found").checkEq(path, "/sections//attachments/Not Found");
        itest("evosuite", 75).given(sectionGid, "=wt+RaN|OGr% ").checkEq(path, "/sections/=wt+RaN|OGr% ");
        itest("randoop", 75).given(sectionGid, "/portfolios/").checkEq(path, "/sections//portfolios/");
        itest("randoop", 75).given(sectionGid, "hi!").checkEq(path, "/sections/hi!");
        itest("evosuite", 75).given(sectionGid, "getConstructorId").checkEq(path, "/sections/getConstructorId");
        itest("randoop", 75).given(sectionGid, "/tags/Payment Required").checkEq(path, "/sections//tags/Payment Required");
        itest("randoop", 75).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteSection(String sectionGid) throws IOException {
        return deleteSection(sectionGid, null, false);
    }

    /**
     * Get a section
     * Returns the complete record for a single section.
     * @param sectionGid The globally unique identifier for the section. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Section)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Section> getSection(String sectionGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/sections/{section_gid}".replace("{section_gid}", sectionGid);
        itest("randoop", 97).given(sectionGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/sections/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 97).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 97).given(sectionGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/sections/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 97).given(sectionGid, "hi!").checkEq(path, "/sections/hi!");
        itest("randoop", 97).given(sectionGid, "200").checkEq(path, "/sections/200");
        itest("randoop", 97).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 97).given(sectionGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/sections/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 97).given(sectionGid, "Rate Limit Enforced").checkEq(path, "/sections/Rate Limit Enforced");
        itest("randoop", 97).given(sectionGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/sections/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 97).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 97).given(sectionGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/sections//projects/Rate Limit Enforced/sections");
        itest("evosuite", 97).given(sectionGid, "3G[xAnjl&").checkEq(path, "/sections/3G[xAnjl&");
        itest("randoop", 97).given(sectionGid, "GET").checkEq(path, "/sections/GET");
        itest("evosuite", 97).given(sectionGid, "*'tyuy:4#F.II T6").checkEq(path, "/sections/*'tyuy:4#F.II T6");
        itest("evosuite", 97).given(sectionGid, "9").checkEq(path, "/sections/9");
        itest("randoop", 97).given(sectionGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 97).given(sectionGid, "").checkEq(path, "/sections/");
        itest("randoop", 97).given(sectionGid, "").checkEq(path, "/sections/");
        itest("randoop", 97).given(sectionGid, "10").checkEq(path, "/sections/10");
        itest("randoop", 97).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 97).given(sectionGid, "Invalid Request").checkEq(path, "/sections/Invalid Request");
        itest("randoop", 97).given(sectionGid, "Not Found").checkEq(path, "/sections/Not Found");
        itest("randoop", 97).given(sectionGid, "NoAuthorizationError").checkEq(path, "/sections/NoAuthorizationError");
        ItemRequest<Section> req = new ItemRequest<Section>(this, Section.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Section> getSection(String sectionGid) throws IOException {
        return getSection(sectionGid, null, false);
    }

    /**
     * Get sections in a project
     * Returns the compact records for all sections in the specified project.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Section)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Section> getSectionsForProject(String projectGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/sections".replace("{project_gid}", projectGid);
        itest("evosuite", 121).given(projectGid, "").checkEq(path, "/projects//sections");
        itest("randoop", 121).given(projectGid, "10").checkEq(path, "/projects/10/sections");
        itest("randoop", 121).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/sections");
        itest("randoop", 121).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/sections");
        itest("evosuite", 121).given(projectGid, "offset").checkEq(path, "/projects/offset/sections");
        itest("randoop", 121).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/sections");
        itest("randoop", 121).given(projectGid, "0").checkEq(path, "/projects/0/sections");
        itest("randoop", 121).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/sections");
        itest("randoop", 121).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/sections");
        itest("randoop", 121).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/sections");
        itest("randoop", 121).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/sections");
        itest("randoop", 121).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/sections");
        itest("randoop", 121).given(projectGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200/sections");
        itest("evosuite", 121).given(projectGid, "gi_n]tna)!Z&?S").checkEq(path, "/projects/gi_n]tna)!Z&?S/sections");
        itest("randoop", 121).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/sections");
        itest("randoop", 121).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/sections");
        itest("randoop", 121).given(projectGid, "POST").checkEq(path, "/projects/POST/sections");
        itest("randoop", 121).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/sections");
        itest("randoop", 121).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/sections");
        itest("randoop", 121).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/sections");
        itest("randoop", 121).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/sections");
        itest("randoop", 121).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/sections");
        itest("randoop", 121).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/sections");
        itest("randoop", 121).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/sections");
        itest("randoop", 121).given(projectGid, "hi!").checkEq(path, "/projects/hi!/sections");
        itest("randoop", 121).given(projectGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/projects//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/sections");
        itest("evosuite", 121).given(projectGid, "F").checkEq(path, "/projects/F/sections");
        CollectionRequest<Section> req = new CollectionRequest<Section>(this, Section.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Section> getSectionsForProject(String projectGid) throws IOException {
        return getSectionsForProject(projectGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Move or Insert sections
     * Move sections relative to each other. One of &#x60;before_section&#x60; or &#x60;after_section&#x60; is required.  Sections cannot be moved between projects.  Returns an empty data block.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> insertSectionForProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/sections/insert".replace("{project_gid}", projectGid);
        itest("randoop", 145).given(projectGid, "/organizations//teams").checkEq(path, "/projects//organizations//teams/sections/insert");
        itest("randoop", 145).given(projectGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject/sections/insert");
        itest("randoop", 145).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/sections/insert");
        itest("randoop", 145).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/sections/insert");
        itest("randoop", 145).given(projectGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/sections/insert");
        itest("randoop", 145).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/sections/insert");
        itest("randoop", 145).given(projectGid, "POST").checkEq(path, "/projects/POST/sections/insert");
        itest("randoop", 145).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/sections/insert");
        itest("randoop", 145).given(projectGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error/sections/insert");
        itest("randoop", 145).given(projectGid, "/tasks/200/addProject").checkEq(path, "/projects//tasks/200/addProject/sections/insert");
        itest("randoop", 145).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/sections/insert");
        itest("randoop", 145).given(projectGid, "200").checkEq(path, "/projects/200/sections/insert");
        itest("randoop", 145).given(projectGid, "/tags").checkEq(path, "/projects//tags/sections/insert");
        itest("evosuite", 145).given(projectGid, "/projects/_KL(cFb/sections").checkEq(path, "/projects//projects/_KL(cFb/sections/sections/insert");
        itest("randoop", 145).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/sections/insert");
        itest("randoop", 145).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/sections/insert");
        itest("randoop", 145).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/sections/insert");
        itest("evosuite", 145).given(projectGid, "=r^OD8e1ZJ8W\"WX!").checkEq(path, "/projects/=r^OD8e1ZJ8W\"WX!/sections/insert");
        itest("randoop", 145).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/sections/insert");
        itest("randoop", 145).given(projectGid, "GET").checkEq(path, "/projects/GET/sections/insert");
        itest("evosuite", 145).given(projectGid, "{OH/!pkUtT.").checkEq(path, "/projects/{OH/!pkUtT./sections/insert");
        itest("randoop", 145).given(projectGid, "").checkEq(path, "/projects//sections/insert");
        itest("evosuite", 145).given(projectGid, "\")}&L^!lvT").checkEq(path, "/projects/\")}&L^!lvT/sections/insert");
        itest("evosuite", 145).given(projectGid, "KG8lm2!xkiq").checkEq(path, "/projects/KG8lm2!xkiq/sections/insert");
        itest("randoop", 145).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/sections/insert");
        itest("evosuite", 145).given(projectGid, "GET").checkEq(path, "/projects/GET/sections/insert");
        itest("randoop", 145).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/sections/insert");
        itest("randoop", 145).given(projectGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/projects/com.asana.errors.InvalidRequestError: Invalid Request/sections/insert");
        itest("randoop", 145).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/sections/insert");
        itest("randoop", 145).given(projectGid, "hi!").checkEq(path, "/projects/hi!/sections/insert");
        itest("randoop", 145).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/sections/insert");
        itest("evosuite", 145).given(projectGid, "/goals/{goal_gid}/removeFollowers").checkEq(path, "/projects//goals/{goal_gid}/removeFollowers/sections/insert");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> insertSectionForProject(String projectGid) throws IOException {
        return insertSectionForProject(projectGid, null, false);
    }

    /**
     * Update a section
     * A specific, existing section can be updated by making a PUT request on the URL for that project. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged. (note that at this time, the only field that can be updated is the &#x60;name&#x60; field.)  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated section record.
     * @param sectionGid The globally unique identifier for the section. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Section)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Section> updateSection(String sectionGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/sections/{section_gid}".replace("{section_gid}", sectionGid);
        itest("randoop", 167).given(sectionGid, "/attachments/Not Found").checkEq(path, "/sections//attachments/Not Found");
        itest("randoop", 167).given(sectionGid, "").checkEq(path, "/sections/");
        itest("randoop", 167).given(sectionGid, "Forbidden").checkEq(path, "/sections/Forbidden");
        itest("randoop", 167).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 167).given(sectionGid, "NoAuthorizationError").checkEq(path, "/sections/NoAuthorizationError");
        itest("randoop", 167).given(sectionGid, "POST").checkEq(path, "/sections/POST");
        itest("randoop", 167).given(sectionGid, "10").checkEq(path, "/sections/10");
        itest("randoop", 167).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 167).given(sectionGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/sections//goals/{goal_gid}/subgoals");
        itest("randoop", 167).given(sectionGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 167).given(sectionGid, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/sections//portfolios/Rate Limit Enforced/portfolio_memberships");
        itest("randoop", 167).given(sectionGid, "Server Error").checkEq(path, "/sections/Server Error");
        itest("evosuite", 167).given(sectionGid, "?0W%=9j[*vNRR6YZ").checkEq(path, "/sections/?0W%=9j[*vNRR6YZ");
        itest("evosuite", 167).given(sectionGid, "com.google.api.client.http.HttpBackOffIOExceptionHandler").checkEq(path, "/sections/com.google.api.client.http.HttpBackOffIOExceptionHandler");
        itest("randoop", 167).given(sectionGid, "hi!").checkEq(path, "/sections/hi!");
        itest("randoop", 167).given(sectionGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/sections//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 167).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 167).given(sectionGid, "/portfolios/").checkEq(path, "/sections//portfolios/");
        itest("randoop", 167).given(sectionGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/sections//projects/Rate Limit Enforced/sections");
        itest("evosuite", 167).given(sectionGid, "").checkEq(path, "/sections/");
        itest("randoop", 167).given(sectionGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/sections/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 167).given(sectionGid, "Not Found").checkEq(path, "/sections/Not Found");
        itest("randoop", 167).given(sectionGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/sections/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 167).given(sectionGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/sections//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 167).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 167).given(sectionGid, "com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy").checkEq(path, "/sections/com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy");
        itest("randoop", 167).given(sectionGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/sections//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 167).given(sectionGid, "_KL(cFb").checkEq(path, "/sections/_KL(cFb");
        itest("randoop", 167).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 167).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 167).given(sectionGid, "/projects/%s/sections").checkEq(path, "/sections//projects/%s/sections");
        itest("randoop", 167).given(sectionGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/sections/com.asana.errors.InvalidRequestError: Invalid Request");
        ItemRequest<Section> req = new ItemRequest<Section>(this, Section.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Section> updateSection(String sectionGid) throws IOException {
        return updateSection(sectionGid, null, false);
    }
}
