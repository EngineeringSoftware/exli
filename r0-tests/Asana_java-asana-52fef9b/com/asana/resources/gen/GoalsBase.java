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

public class GoalsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public GoalsBase(Client client) {
        super(client);
    }

    /**
     * Add a collaborator to a goal
     * Adds followers to a goal. Returns the goal the followers were added to. Each goal can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated goal record, described above.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addFollowers(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/addFollowers";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addFollowers() throws IOException {
        return addFollowers(null, false);
    }

    /**
     * Add a subgoal to a parent goal
     * Adds a subgoal to a parent goal. *A goal can have at most 100 subgoals, and a subgoal can have at most 4 parent goals.  Returns an empty data block.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addSubgoal(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/addSubgoal";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addSubgoal() throws IOException {
        return addSubgoal(null, false);
    }

    /**
     * Add a project/portfolio as supporting work for a goal.
     * Adds a project or portfolio as supporting work for a goal. *A goal can have at most 10 supporting projects/portfolios, and a project/portfolio can support at most 10 goals*.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addSupportingWorkForGoal(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/addSupportingWork";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addSupportingWorkForGoal() throws IOException {
        return addSupportingWorkForGoal(null, false);
    }

    /**
     * Create a goal
     * Creates a new goal in a workspace or team.  Returns the full record of the newly created goal.
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> createGoal(String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<JsonElement> createGoal() throws IOException {
        return createGoal(null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Create a goal metric
     * Creates and adds a goal metric to a specified goal. Note that this replaces an existing goal metric if one already exists.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> createGoalMetric(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/setMetric";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> createGoalMetric() throws IOException {
        return createGoalMetric(null, false);
    }

    /**
     * Delete a goal
     * A specific, existing goal can be deleted by making a DELETE request on the URL for that goal.  Returns an empty data record.
     * @param goalGid Globally unique identifier for the goal. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteGoal(String goalGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}".replace("{goal_gid}", goalGid);
        itest("randoop", 140).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("evosuite", 140).given(goalGid, ")/(").checkEq(path, "/goals/)/(");
        itest("randoop", 140).given(goalGid, "GET").checkEq(path, "/goals/GET");
        itest("randoop", 140).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 140).given(goalGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/goals/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 140).given(goalGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/goals//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("evosuite", 140).given(goalGid, "ymFm^4smlx@,[>Ac").checkEq(path, "/goals/ymFm^4smlx@,[>Ac");
        itest("randoop", 140).given(goalGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/goals/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 140).given(goalGid, "Forbidden").checkEq(path, "/goals/Forbidden");
        itest("randoop", 140).given(goalGid, "/projects/Not Found/removeFollowers").checkEq(path, "/goals//projects/Not Found/removeFollowers");
        itest("evosuite", 140).given(goalGid, "z_g?0wI:r?-Jy\"0s").checkEq(path, "/goals/z_g?0wI:r?-Jy\"0s");
        itest("evosuite", 140).given(goalGid, "/goals/{goal_gid}/supportingWork").checkEq(path, "/goals//goals/{goal_gid}/supportingWork");
        itest("randoop", 140).given(goalGid, "NoAuthorizationError").checkEq(path, "/goals/NoAuthorizationError");
        itest("randoop", 140).given(goalGid, "/workspaces/").checkEq(path, "/goals//workspaces/");
        itest("randoop", 140).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("evosuite", 140).given(goalGid, "POST").checkEq(path, "/goals/POST");
        itest("randoop", 140).given(goalGid, "10").checkEq(path, "/goals/10");
        itest("randoop", 140).given(goalGid, "").checkEq(path, "/goals/");
        itest("randoop", 140).given(goalGid, "/tags/Payment Required").checkEq(path, "/goals//tags/Payment Required");
        itest("randoop", 140).given(goalGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/goals//goals/{goal_gid}/subgoals");
        itest("randoop", 140).given(goalGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/goals//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 140).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 140).given(goalGid, "/tasks/200/addProject").checkEq(path, "/goals//tasks/200/addProject");
        itest("randoop", 140).given(goalGid, "Invalid Request").checkEq(path, "/goals/Invalid Request");
        itest("randoop", 140).given(goalGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/goals/com.asana.errors.AsanaError: hi!");
        itest("randoop", 140).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 140).given(goalGid, "").checkEq(path, "/goals/");
        itest("randoop", 140).given(goalGid, "Payment Required").checkEq(path, "/goals/Payment Required");
        itest("randoop", 140).given(goalGid, "Server Error").checkEq(path, "/goals/Server Error");
        itest("randoop", 140).given(goalGid, "Not Found").checkEq(path, "/goals/Not Found");
        itest("randoop", 140).given(goalGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/goals//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 140).given(goalGid, "/goals/{goal_gid}/setMetricCurrentValue").checkEq(path, "/goals//goals/{goal_gid}/setMetricCurrentValue");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteGoal(String goalGid) throws IOException {
        return deleteGoal(goalGid, null, false);
    }

    /**
     * Get a goal
     * Returns the complete goal record for a single goal.
     * @param goalGid Globally unique identifier for the goal. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> getGoal(String goalGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}".replace("{goal_gid}", goalGid);
        itest("randoop", 162).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 162).given(goalGid, "Forbidden").checkEq(path, "/goals/Forbidden");
        itest("randoop", 162).given(goalGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/goals//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 162).given(goalGid, "NoAuthorizationError").checkEq(path, "/goals/NoAuthorizationError");
        itest("randoop", 162).given(goalGid, "Invalid Request").checkEq(path, "/goals/Invalid Request");
        itest("evosuite", 162).given(goalGid, "/goals/POST").checkEq(path, "/goals//goals/POST");
        itest("evosuite", 162).given(goalGid, "project").checkEq(path, "/goals/project");
        itest("randoop", 162).given(goalGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/goals/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 162).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("evosuite", 162).given(goalGid, "E").checkEq(path, "/goals/E");
        itest("randoop", 162).given(goalGid, "Payment Required").checkEq(path, "/goals/Payment Required");
        itest("evosuite", 162).given(goalGid, "f~-]ix@r)y@S(*").checkEq(path, "/goals/f~-]ix@r)y@S(*");
        itest("randoop", 162).given(goalGid, "Sync token invalid or too old").checkEq(path, "/goals/Sync token invalid or too old");
        itest("randoop", 162).given(goalGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/goals//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 162).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("evosuite", 162).given(goalGid, "InternalTypes not available for ").checkEq(path, "/goals/InternalTypes not available for ");
        itest("randoop", 162).given(goalGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/goals//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 162).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 162).given(goalGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/goals/urn:ietf:wg:oauth:2.0:oob");
        itest("evosuite", 162).given(goalGid, "").checkEq(path, "/goals/");
        itest("randoop", 162).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 162).given(goalGid, "").checkEq(path, "/goals/");
        itest("randoop", 162).given(goalGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/goals/com.asana.errors.AsanaError: NoAuthorizationError");
        itest("randoop", 162).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 162).given(goalGid, "POST").checkEq(path, "/goals/POST");
        itest("randoop", 162).given(goalGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/goals/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 162).given(goalGid, "hi!").checkEq(path, "/goals/hi!");
        itest("evosuite", 162).given(goalGid, "2h;^x").checkEq(path, "/goals/2h;^x");
        itest("randoop", 162).given(goalGid, "/attachments/").checkEq(path, "/goals//attachments/");
        itest("evosuite", 162).given(goalGid, "X6$[Cm$fV]9Z%Bj~").checkEq(path, "/goals/X6$[Cm$fV]9Z%Bj~");
        itest("randoop", 162).given(goalGid, "Rate Limit Enforced").checkEq(path, "/goals/Rate Limit Enforced");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> getGoal(String goalGid) throws IOException {
        return getGoal(goalGid, null, false);
    }

    /**
     * Get goals
     * Returns compact goal records.
     * @param timePeriods Globally unique identifiers for the time periods. (optional)
     * @param workspace Globally unique identifier for the workspace. (optional)
     * @param team Globally unique identifier for the team. (optional)
     * @param isWorkspaceLevel Filter to goals with is_workspace_level set to query value. Must be used with the workspace parameter. (optional)
     * @param project Globally unique identifier for supporting project. (optional)
     * @param portfolio Globally unique identifier for supporting portfolio. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getGoals(List<String> timePeriods, String workspace, String team, Boolean isWorkspaceLevel, String project, String portfolio, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals";
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("portfolio", portfolio).query("project", project).query("is_workspace_level", isWorkspaceLevel).query("team", team).query("workspace", workspace).query("time_periods", timePeriods);
        return req;
    }

    public CollectionRequest<JsonElement> getGoals(List<String> timePeriods, String workspace, String team, Boolean isWorkspaceLevel, String project, String portfolio) throws IOException {
        return getGoals(timePeriods, workspace, team, isWorkspaceLevel, project, portfolio, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get parent goals from a goal
     * Returns a compact representation of all of the parent goals of a goal.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getParentGoalsForGoal(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/parentGoals";
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public CollectionRequest<JsonElement> getParentGoalsForGoal() throws IOException {
        return getParentGoalsForGoal(null, false);
    }

    /**
     * Get subgoals from a goal
     * Returns a compact representation of all of the subgoals of a goal.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> getSubgoalsForGoal(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/subgoals";
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public CollectionRequest<JsonElement> getSubgoalsForGoal() throws IOException {
        return getSubgoalsForGoal(null, false);
    }

    /**
     * Remove a collaborator from a goal
     * Removes followers from a goal. Returns the goal the followers were removed from. Each goal can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated goal record, described above.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeFollowers(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/removeFollowers";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeFollowers() throws IOException {
        return removeFollowers(null, false);
    }

    /**
     * Remove a subgoal from a goal
     * Removes a goal as a subgoal of a specified parent goal.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeSubgoal(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/removeSubgoal";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeSubgoal() throws IOException {
        return removeSubgoal(null, false);
    }

    /**
     * Remove a project/portfolio as supporting work for a goal.
     * Removes a project or portfolio as supporting work for a goal.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeSupportingWorkForGoal(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/removeSupportingWork";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeSupportingWorkForGoal() throws IOException {
        return removeSupportingWorkForGoal(null, false);
    }

    /**
     * Get supporting work from a goal
     * Returns any portfolios or projects associated with specified goal.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Project> supportingWork(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/supportingWork";
        CollectionRequest<Project> req = new CollectionRequest<Project>(this, Project.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public CollectionRequest<Project> supportingWork() throws IOException {
        return supportingWork(null, false);
    }

    /**
     * Update a goal
     * An existing goal can be updated by making a PUT request on the URL for that goal. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal record.
     * @param goalGid Globally unique identifier for the goal. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> updateGoal(String goalGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}".replace("{goal_gid}", goalGid);
        itest("randoop", 347).given(goalGid, "/custom_fields//enum_options/insert").checkEq(path, "/goals//custom_fields//enum_options/insert");
        itest("evosuite", 347).given(goalGid, "kf4@HV+m#DUQ<%").checkEq(path, "/goals/kf4@HV+m#DUQ<%");
        itest("randoop", 347).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 347).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 347).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 347).given(goalGid, "10").checkEq(path, "/goals/10");
        itest("evosuite", 347).given(goalGid, "ibled(").checkEq(path, "/goals/ibled(");
        itest("randoop", 347).given(goalGid, "").checkEq(path, "/goals/");
        itest("randoop", 347).given(goalGid, "GET").checkEq(path, "/goals/GET");
        itest("randoop", 347).given(goalGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/goals/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 347).given(goalGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/goals//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 347).given(goalGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/goals//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 347).given(goalGid, "NoAuthorizationError").checkEq(path, "/goals/NoAuthorizationError");
        itest("randoop", 347).given(goalGid, "/attachments/").checkEq(path, "/goals//attachments/");
        itest("randoop", 347).given(goalGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/goals//goals/{goal_gid}/addSubgoal");
        itest("randoop", 347).given(goalGid, "POST").checkEq(path, "/goals/POST");
        itest("randoop", 347).given(goalGid, "Sync token invalid or too old").checkEq(path, "/goals/Sync token invalid or too old");
        itest("randoop", 347).given(goalGid, "/project_statuses/Server Error").checkEq(path, "/goals//project_statuses/Server Error");
        itest("randoop", 347).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 347).given(goalGid, "Invalid Request").checkEq(path, "/goals/Invalid Request");
        itest("evosuite", 347).given(goalGid, "com.github.javaparser.metamodel.ModifierMetaModel").checkEq(path, "/goals/com.github.javaparser.metamodel.ModifierMetaModel");
        itest("randoop", 347).given(goalGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/goals/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 347).given(goalGid, "200").checkEq(path, "/goals/200");
        itest("randoop", 347).given(goalGid, "Not Found").checkEq(path, "/goals/Not Found");
        itest("evosuite", 347).given(goalGid, "#yA=ciN_").checkEq(path, "/goals/#yA=ciN_");
        itest("randoop", 347).given(goalGid, "/projects/Not Found/removeFollowers").checkEq(path, "/goals//projects/Not Found/removeFollowers");
        itest("evosuite", 347).given(goalGid, "=w>YH6OW*!\"2t8FPv*").checkEq(path, "/goals/=w>YH6OW*!\"2t8FPv*");
        itest("randoop", 347).given(goalGid, "/attachments/Not Found").checkEq(path, "/goals//attachments/Not Found");
        itest("randoop", 347).given(goalGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/goals/com.asana.errors.AsanaError: hi!");
        itest("randoop", 347).given(goalGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/goals/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("evosuite", 347).given(goalGid, "uyL&\"2`(Keu:").checkEq(path, "/goals/uyL&\"2`(Keu:");
        itest("randoop", 347).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 347).given(goalGid, "/portfolios/").checkEq(path, "/goals//portfolios/");
        itest("randoop", 347).given(goalGid, "Payment Required").checkEq(path, "/goals/Payment Required");
        itest("evosuite", 347).given(goalGid, "").checkEq(path, "/goals/");
        itest("randoop", 347).given(goalGid, "hi!").checkEq(path, "/goals/hi!");
        itest("randoop", 347).given(goalGid, "Rate Limit Enforced").checkEq(path, "/goals/Rate Limit Enforced");
        itest("evosuite", 347).given(goalGid, "(Jj@abl_xc(d/b8").checkEq(path, "/goals/(Jj@abl_xc(d/b8");
        itest("evosuite", 347).given(goalGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/goals//goals/{goal_gid}/addSubgoal");
        itest("randoop", 347).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 347).given(goalGid, "/tasks/200/addProject").checkEq(path, "/goals//tasks/200/addProject");
        itest("randoop", 347).given(goalGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/goals/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> updateGoal(String goalGid) throws IOException {
        return updateGoal(goalGid, null, false);
    }

    /**
     * Update a goal metric
     * Updates a goal&#x27;s existing metric&#x27;s &#x60;current_number_value&#x60; if one exists, otherwise responds with a 400 status code.  Returns the complete updated goal metric record.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> updateGoalMetric(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/goals/{goal_gid}/setMetricCurrentValue";
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> updateGoalMetric() throws IOException {
        return updateGoalMetric(null, false);
    }
}
