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

public class ProjectsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public ProjectsBase(Client client) {
        super(client);
    }

    /**
     * Add a custom field to a project
     * Custom fields are associated with projects by way of custom field settings.  This method creates a setting for the project.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(CustomFieldSetting)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<CustomFieldSetting> addCustomFieldSettingForProject(String projectGid, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/addCustomFieldSetting".replace("{project_gid}", projectGid);
        itest("randoop", 30).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "GET").checkEq(path, "/projects/GET/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "0").checkEq(path, "/projects/0/addCustomFieldSetting");
        itest("evosuite", 30).given(projectGid, "team").checkEq(path, "/projects/team/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "").checkEq(path, "/projects//addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "com.asana.errors.RetryableAsanaError: NoAuthorizationError").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: NoAuthorizationError/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addCustomFieldSetting");
        itest("evosuite", 30).given(projectGid, "/projects/&/removeFollowers").checkEq(path, "/projects//projects/&/removeFollowers/addCustomFieldSetting");
        itest("evosuite", 30).given(projectGid, "Ul").checkEq(path, "/projects/Ul/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "POST").checkEq(path, "/projects/POST/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "/projects/Not Found/removeFollowers").checkEq(path, "/projects//projects/Not Found/removeFollowers/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "/tags").checkEq(path, "/projects//tags/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "/tasks/GET").checkEq(path, "/projects//tasks/GET/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces//addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/addCustomFieldSetting");
        itest("evosuite", 30).given(projectGid, "").checkEq(path, "/projects//addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "10").checkEq(path, "/projects/10/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "hi!").checkEq(path, "/projects/hi!/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: /portfolios//addCustomFieldSetting");
        itest("randoop", 30).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/addCustomFieldSetting");
        itest("evosuite", 30).given(projectGid, "DELETE").checkEq(path, "/projects/DELETE/addCustomFieldSetting");
        ItemRequest<CustomFieldSetting> req = new ItemRequest<CustomFieldSetting>(this, CustomFieldSetting.class, path, "POST").query("opt_pretty", optPretty);
        return req;
    }

    public ItemRequest<CustomFieldSetting> addCustomFieldSettingForProject(String projectGid) throws IOException {
        return addCustomFieldSettingForProject(projectGid, false);
    }

    /**
     * Add followers to a project
     * Adds the specified list of users as followers to the project. Followers are a subset of members who have opted in to receive \&quot;tasks added\&quot;  notifications for a project. Therefore, if the users are not already members of the project, they will also become members as a result of this operation. Returns the updated project record.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addFollowersForProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/addFollowers".replace("{project_gid}", projectGid);
        itest("randoop", 51).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addFollowers");
        itest("randoop", 51).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//addFollowers");
        itest("randoop", 51).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addFollowers");
        itest("randoop", 51).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/addFollowers");
        itest("randoop", 51).given(projectGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addFollowers");
        itest("randoop", 51).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addFollowers");
        itest("randoop", 51).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/addFollowers");
        itest("randoop", 51).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addFollowers");
        itest("randoop", 51).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/addFollowers");
        itest("randoop", 51).given(projectGid, "GET").checkEq(path, "/projects/GET/addFollowers");
        itest("randoop", 51).given(projectGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject/addFollowers");
        itest("randoop", 51).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addFollowers");
        itest("randoop", 51).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addFollowers");
        itest("randoop", 51).given(projectGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//stories//goals/{goal_gid}/addSubgoal/addFollowers");
        itest("randoop", 51).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/addFollowers");
        itest("randoop", 51).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/addFollowers");
        itest("evosuite", 51).given(projectGid, "/projects/{project_gid}/removeFollowers").checkEq(path, "/projects//projects/{project_gid}/removeFollowers/addFollowers");
        itest("evosuite", 51).given(projectGid, "OF<2__'la").checkEq(path, "/projects/OF<2__'la/addFollowers");
        itest("randoop", 51).given(projectGid, "-1").checkEq(path, "/projects/-1/addFollowers");
        itest("randoop", 51).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addFollowers");
        itest("randoop", 51).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/addFollowers");
        itest("evosuite", 51).given(projectGid, "DELETE").checkEq(path, "/projects/DELETE/addFollowers");
        itest("randoop", 51).given(projectGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addFollowers");
        itest("evosuite", 51).given(projectGid, "com.asana.models.Resource").checkEq(path, "/projects/com.asana.models.Resource/addFollowers");
        itest("randoop", 51).given(projectGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addFollowers");
        itest("randoop", 51).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/addFollowers");
        itest("randoop", 51).given(projectGid, "10").checkEq(path, "/projects/10/addFollowers");
        itest("randoop", 51).given(projectGid, "").checkEq(path, "/projects//addFollowers");
        itest("randoop", 51).given(projectGid, "/organizations//teams").checkEq(path, "/projects//organizations//teams/addFollowers");
        itest("randoop", 51).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addFollowers");
        itest("randoop", 51).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/addFollowers");
        itest("randoop", 51).given(projectGid, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/addFollowers");
        itest("randoop", 51).given(projectGid, "/tags").checkEq(path, "/projects//tags/addFollowers");
        itest("evosuite", 51).given(projectGid, "com.github.javaparser.metamodel.BinaryExprMetaModel").checkEq(path, "/projects/com.github.javaparser.metamodel.BinaryExprMetaModel/addFollowers");
        itest("evosuite", 51).given(projectGid, "").checkEq(path, "/projects//addFollowers");
        itest("randoop", 51).given(projectGid, "hi!").checkEq(path, "/projects/hi!/addFollowers");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addFollowersForProject(String projectGid) throws IOException {
        return addFollowersForProject(projectGid, null, false);
    }

    /**
     * Add users to a project
     * Adds the specified list of users as members of the project. Note that a user being added as a member may also be added as a *follower* as a result of this operation. This is because the user&#x27;s default notification settings (i.e., in the \&quot;Notifcations\&quot; tab of \&quot;My Profile Settings\&quot;) will override this endpoint&#x27;s default behavior of setting \&quot;Tasks added\&quot; notifications to &#x60;false&#x60;. Returns the updated project record.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addMembersForProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/addMembers".replace("{project_gid}", projectGid);
        itest("randoop", 73).given(projectGid, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required/addMembers");
        itest("randoop", 73).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/addMembers");
        itest("evosuite", 73).given(projectGid, "").checkEq(path, "/projects//addMembers");
        itest("randoop", 73).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/addMembers");
        itest("randoop", 73).given(projectGid, "0").checkEq(path, "/projects/0/addMembers");
        itest("randoop", 73).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/addMembers");
        itest("randoop", 73).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/addMembers");
        itest("randoop", 73).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addMembers");
        itest("randoop", 73).given(projectGid, "/tags").checkEq(path, "/projects//tags/addMembers");
        itest("randoop", 73).given(projectGid, "10").checkEq(path, "/projects/10/addMembers");
        itest("randoop", 73).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/addMembers");
        itest("randoop", 73).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addMembers");
        itest("randoop", 73).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/addMembers");
        itest("randoop", 73).given(projectGid, "/goals/Sync token invalid or too old").checkEq(path, "/projects//goals/Sync token invalid or too old/addMembers");
        itest("evosuite", 73).given(projectGid, "Invalid unicode character value ").checkEq(path, "/projects/Invalid unicode character value /addMembers");
        itest("randoop", 73).given(projectGid, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/addMembers");
        itest("randoop", 73).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/addMembers");
        itest("randoop", 73).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/addMembers");
        itest("randoop", 73).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addMembers");
        itest("randoop", 73).given(projectGid, "hi!").checkEq(path, "/projects/hi!/addMembers");
        itest("randoop", 73).given(projectGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error/addMembers");
        itest("randoop", 73).given(projectGid, "GET").checkEq(path, "/projects/GET/addMembers");
        itest("randoop", 73).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addMembers");
        itest("randoop", 73).given(projectGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/addMembers");
        itest("randoop", 73).given(projectGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals/addMembers");
        itest("randoop", 73).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addMembers");
        itest("randoop", 73).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addMembers");
        itest("randoop", 73).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addMembers");
        itest("randoop", 73).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addMembers");
        itest("randoop", 73).given(projectGid, "/webhooks/NoAuthorizationError").checkEq(path, "/projects//webhooks/NoAuthorizationError/addMembers");
        itest("evosuite", 73).given(projectGid, "static").checkEq(path, "/projects/static/addMembers");
        itest("randoop", 73).given(projectGid, "POST").checkEq(path, "/projects/POST/addMembers");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addMembersForProject(String projectGid) throws IOException {
        return addMembersForProject(projectGid, null, false);
    }

    /**
     * Create a project
     * Create a new project in a workspace or team.  Every project is required to be created in a specific workspace or organization, and this cannot be changed once set. Note that you can use the &#x60;workspace&#x60; parameter regardless of whether or not it is an organization.  If the workspace for your project is an organization, you must also supply a &#x60;team&#x60; to share the project with.  Returns the full record of the newly created project.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Project> createProject(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects";
        ItemRequest<Project> req = new ItemRequest<Project>(this, Project.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Project> createProject() throws IOException {
        return createProject(null, false);
    }

    /**
     * Create a project in a team
     * Creates a project shared with the given team.  Returns the full record of the newly created project.
     * @param teamGid Globally unique identifier for the team. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Project> createProjectForTeam(String teamGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/teams/{team_gid}/projects".replace("{team_gid}", teamGid);
        itest("randoop", 116).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/projects");
        itest("randoop", 116).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 116).given(teamGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/teams/com.asana.errors.InvalidRequestError: Invalid Request/projects");
        itest("randoop", 116).given(teamGid, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old/projects");
        itest("randoop", 116).given(teamGid, "com.asana.errors.ServerError: Server Error").checkEq(path, "/teams/com.asana.errors.ServerError: Server Error/projects");
        itest("randoop", 116).given(teamGid, "/attachments/Not Found").checkEq(path, "/teams//attachments/Not Found/projects");
        itest("randoop", 116).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 116).given(teamGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/teams/urn:ietf:wg:oauth:2.0:oob/projects");
        itest("randoop", 116).given(teamGid, "/portfolios/").checkEq(path, "/teams//portfolios//projects");
        itest("randoop", 116).given(teamGid, "0").checkEq(path, "/teams/0/projects");
        itest("evosuite", 116).given(teamGid, "Zd``7=2mLLS$q6#p").checkEq(path, "/teams/Zd``7=2mLLS$q6#p/projects");
        itest("randoop", 116).given(teamGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/projects");
        itest("evosuite", 116).given(teamGid, "POST").checkEq(path, "/teams/POST/projects");
        itest("randoop", 116).given(teamGid, "/tasks/GET").checkEq(path, "/teams//tasks/GET/projects");
        itest("randoop", 116).given(teamGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//goals/{goal_gid}/addSubgoal/projects");
        itest("evosuite", 116).given(teamGid, "{team_gid}").checkEq(path, "/teams/{team_gid}/projects");
        itest("randoop", 116).given(teamGid, "Rate Limit Enforced").checkEq(path, "/teams/Rate Limit Enforced/projects");
        itest("randoop", 116).given(teamGid, "hi!").checkEq(path, "/teams/hi!/projects");
        itest("randoop", 116).given(teamGid, "Server Error").checkEq(path, "/teams/Server Error/projects");
        itest("randoop", 116).given(teamGid, "/tags/Payment Required").checkEq(path, "/teams//tags/Payment Required/projects");
        itest("randoop", 116).given(teamGid, "/webhooks/NoAuthorizationError").checkEq(path, "/teams//webhooks/NoAuthorizationError/projects");
        itest("randoop", 116).given(teamGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/teams//goals/{goal_gid}/subgoals/projects");
        itest("evosuite", 116).given(teamGid, "JAVA_7").checkEq(path, "/teams/JAVA_7/projects");
        itest("randoop", 116).given(teamGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/teams//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/projects");
        itest("randoop", 116).given(teamGid, "Forbidden").checkEq(path, "/teams/Forbidden/projects");
        itest("randoop", 116).given(teamGid, "Not Found").checkEq(path, "/teams/Not Found/projects");
        itest("randoop", 116).given(teamGid, "Payment Required").checkEq(path, "/teams/Payment Required/projects");
        itest("evosuite", 116).given(teamGid, "Ul").checkEq(path, "/teams/Ul/projects");
        itest("randoop", 116).given(teamGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 116).given(teamGid, "POST").checkEq(path, "/teams/POST/projects");
        itest("evosuite", 116).given(teamGid, " =$~2|7gdf+Pda").checkEq(path, "/teams/ =$~2|7gdf+Pda/projects");
        itest("randoop", 116).given(teamGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/teams/com.asana.errors.InvalidTokenError: Sync token invalid or too old/projects");
        itest("randoop", 116).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 116).given(teamGid, "").checkEq(path, "/teams//projects");
        ItemRequest<Project> req = new ItemRequest<Project>(this, Project.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Project> createProjectForTeam(String teamGid) throws IOException {
        return createProjectForTeam(teamGid, null, false);
    }

    /**
     * Create a project in a workspace
     * Returns the compact project records for all projects in the workspace.  If the workspace for your project is an organization, you must also supply a team to share the project with.  Returns the full record of the newly created project.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Project> createProjectForWorkspace(String workspaceGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/projects".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 138).given(workspaceGid, "Payment Required").checkEq(path, "/workspaces/Payment Required/projects");
        itest("randoop", 138).given(workspaceGid, "/projects/Not Found/removeFollowers").checkEq(path, "/workspaces//projects/Not Found/removeFollowers/projects");
        itest("randoop", 138).given(workspaceGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//stories//goals/{goal_gid}/addSubgoal/projects");
        itest("randoop", 138).given(workspaceGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/projects");
        itest("evosuite", 138).given(workspaceGid, "GET").checkEq(path, "/workspaces/GET/projects");
        itest("randoop", 138).given(workspaceGid, "/portfolios/").checkEq(path, "/workspaces//portfolios//projects");
        itest("randoop", 138).given(workspaceGid, "Forbidden").checkEq(path, "/workspaces/Forbidden/projects");
        itest("randoop", 138).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 138).given(workspaceGid, "10").checkEq(path, "/workspaces/10/projects");
        itest("evosuite", 138).given(workspaceGid, "/projects/limit").checkEq(path, "/workspaces//projects/limit/projects");
        itest("evosuite", 138).given(workspaceGid, "com.github.javaparser.ast.stmt.YieldStmt").checkEq(path, "/workspaces/com.github.javaparser.ast.stmt.YieldStmt/projects");
        itest("randoop", 138).given(workspaceGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 138).given(workspaceGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/projects");
        itest("randoop", 138).given(workspaceGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/projects");
        itest("randoop", 138).given(workspaceGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/projects");
        itest("randoop", 138).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/projects");
        itest("randoop", 138).given(workspaceGid, "").checkEq(path, "/workspaces//projects");
        itest("evosuite", 138).given(workspaceGid, "").checkEq(path, "/workspaces//projects");
        itest("evosuite", 138).given(workspaceGid, "DELETE").checkEq(path, "/workspaces/DELETE/projects");
        itest("randoop", 138).given(workspaceGid, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/projects");
        itest("randoop", 138).given(workspaceGid, "GET").checkEq(path, "/workspaces/GET/projects");
        itest("randoop", 138).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/projects");
        itest("randoop", 138).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//projects");
        itest("randoop", 138).given(workspaceGid, "Server Error").checkEq(path, "/workspaces/Server Error/projects");
        itest("randoop", 138).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/projects");
        itest("randoop", 138).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found/projects");
        itest("randoop", 138).given(workspaceGid, "0").checkEq(path, "/workspaces/0/projects");
        itest("randoop", 138).given(workspaceGid, "/goals/Sync token invalid or too old").checkEq(path, "/workspaces//goals/Sync token invalid or too old/projects");
        ItemRequest<Project> req = new ItemRequest<Project>(this, Project.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Project> createProjectForWorkspace(String workspaceGid) throws IOException {
        return createProjectForWorkspace(workspaceGid, null, false);
    }

    /**
     * Delete a project
     * A specific, existing project can be deleted by making a DELETE request on the URL for that project.  Returns an empty data record.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}".replace("{project_gid}", projectGid);
        itest("evosuite", 160).given(projectGid, "/projects/{project_gid}/removeFollowers").checkEq(path, "/projects//projects/{project_gid}/removeFollowers");
        itest("randoop", 160).given(projectGid, "GET").checkEq(path, "/projects/GET");
        itest("randoop", 160).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden");
        itest("evosuite", 160).given(projectGid, "3]V@Gz4").checkEq(path, "/projects/3]V@Gz4");
        itest("randoop", 160).given(projectGid, "0").checkEq(path, "/projects/0");
        itest("randoop", 160).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old");
        itest("evosuite", 160).given(projectGid, "l5XByRsVC0E|?X?HO").checkEq(path, "/projects/l5XByRsVC0E|?X?HO");
        itest("randoop", 160).given(projectGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 160).given(projectGid, "[{w55D&'MgMr[IlYL").checkEq(path, "/projects/[{w55D&'MgMr[IlYL");
        itest("randoop", 160).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state");
        itest("randoop", 160).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request");
        itest("randoop", 160).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 160).given(projectGid, "YGf").checkEq(path, "/projects/YGf");
        itest("randoop", 160).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 160).given(projectGid, "hi!").checkEq(path, "/projects/hi!");
        itest("randoop", 160).given(projectGid, "10").checkEq(path, "/projects/10");
        itest("evosuite", 160).given(projectGid, "/user_task_lists/{user_task_list_gid}/tasks").checkEq(path, "/projects//user_task_lists/{user_task_list_gid}/tasks");
        itest("evosuite", 160).given(projectGid, "=U@uO x,2").checkEq(path, "/projects/=U@uO x,2");
        itest("randoop", 160).given(projectGid, "100").checkEq(path, "/projects/100");
        itest("randoop", 160).given(projectGid, "").checkEq(path, "/projects/");
        itest("randoop", 160).given(projectGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 160).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found");
        itest("randoop", 160).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 160).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found");
        itest("evosuite", 160).given(projectGid, "<[Kn7wClg< ").checkEq(path, "/projects/<[Kn7wClg< ");
        itest("randoop", 160).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced");
        itest("randoop", 160).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 160).given(projectGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 160).given(projectGid, "POST").checkEq(path, "/projects/POST");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteProject(String projectGid) throws IOException {
        return deleteProject(projectGid, null, false);
    }

    /**
     * Duplicate a project
     * Creates and returns a job that will asynchronously handle the duplication.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Job)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Job> duplicateProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/duplicate".replace("{project_gid}", projectGid);
        itest("randoop", 182).given(projectGid, "/projects/Not Found/removeFollowers").checkEq(path, "/projects//projects/Not Found/removeFollowers/duplicate");
        itest("randoop", 182).given(projectGid, "/tags").checkEq(path, "/projects//tags/duplicate");
        itest("randoop", 182).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/duplicate");
        itest("randoop", 182).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/duplicate");
        itest("evosuite", 182).given(projectGid, "").checkEq(path, "/projects//duplicate");
        itest("evosuite", 182).given(projectGid, "qw0kiQ5 g").checkEq(path, "/projects/qw0kiQ5 g/duplicate");
        itest("randoop", 182).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/duplicate");
        itest("randoop", 182).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/duplicate");
        itest("randoop", 182).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/duplicate");
        itest("randoop", 182).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/duplicate");
        itest("randoop", 182).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/duplicate");
        itest("randoop", 182).given(projectGid, "10").checkEq(path, "/projects/10/duplicate");
        itest("randoop", 182).given(projectGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/duplicate");
        itest("randoop", 182).given(projectGid, "POST").checkEq(path, "/projects/POST/duplicate");
        itest("randoop", 182).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/duplicate");
        itest("randoop", 182).given(projectGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200/duplicate");
        itest("randoop", 182).given(projectGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//portfolio_memberships//goals/{goal_gid}/addSubgoal/duplicate");
        itest("randoop", 182).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/duplicate");
        itest("randoop", 182).given(projectGid, "/webhooks/NoAuthorizationError").checkEq(path, "/projects//webhooks/NoAuthorizationError/duplicate");
        itest("randoop", 182).given(projectGid, "0").checkEq(path, "/projects/0/duplicate");
        itest("randoop", 182).given(projectGid, "GET").checkEq(path, "/projects/GET/duplicate");
        itest("evosuite", 182).given(projectGid, "Dty}6px!A]7}'Wl\"R").checkEq(path, "/projects/Dty}6px!A]7}'Wl\"R/duplicate");
        itest("randoop", 182).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/duplicate");
        itest("randoop", 182).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/duplicate");
        itest("evosuite", 182).given(projectGid, " =$~2|7gdf+Pda").checkEq(path, "/projects/ =$~2|7gdf+Pda/duplicate");
        itest("randoop", 182).given(projectGid, "").checkEq(path, "/projects//duplicate");
        itest("randoop", 182).given(projectGid, "/portfolios/").checkEq(path, "/projects//portfolios//duplicate");
        itest("evosuite", 182).given(projectGid, "[C^|bFO").checkEq(path, "/projects/[C^|bFO/duplicate");
        itest("evosuite", 182).given(projectGid, "workspace").checkEq(path, "/projects/workspace/duplicate");
        ItemRequest<Job> req = new ItemRequest<Job>(this, Job.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Job> duplicateProject(String projectGid) throws IOException {
        return duplicateProject(projectGid, null, false);
    }

    /**
     * Get a project
     * Returns the complete project record for a single project.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Project> getProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}".replace("{project_gid}", projectGid);
        itest("randoop", 204).given(projectGid, "").checkEq(path, "/projects/");
        itest("randoop", 204).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 204).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 204).given(projectGid, "hi!").checkEq(path, "/projects/hi!");
        itest("randoop", 204).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden");
        itest("randoop", 204).given(projectGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 204).given(projectGid, "/projects/{project_gid}/duplicate").checkEq(path, "/projects//projects/{project_gid}/duplicate");
        itest("randoop", 204).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 204).given(projectGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200");
        itest("evosuite", 204).given(projectGid, "limit").checkEq(path, "/projects/limit");
        itest("randoop", 204).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old");
        itest("randoop", 204).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal");
        itest("randoop", 204).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError");
        itest("randoop", 204).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced");
        itest("randoop", 204).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request");
        itest("randoop", 204).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error");
        itest("randoop", 204).given(projectGid, "POST").checkEq(path, "/projects/POST");
        itest("randoop", 204).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 204).given(projectGid, "200").checkEq(path, "/projects/200");
        itest("randoop", 204).given(projectGid, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required");
        itest("randoop", 204).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections");
        itest("randoop", 204).given(projectGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error");
        itest("evosuite", 204).given(projectGid, "com.github.javaparser.utils.ClassUtils").checkEq(path, "/projects/com.github.javaparser.utils.ClassUtils");
        itest("randoop", 204).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 204).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required");
        itest("randoop", 204).given(projectGid, "/workspaces/").checkEq(path, "/projects//workspaces/");
        itest("randoop", 204).given(projectGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject");
        itest("evosuite", 204).given(projectGid, "").checkEq(path, "/projects/");
        itest("randoop", 204).given(projectGid, "0").checkEq(path, "/projects/0");
        itest("randoop", 204).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("evosuite", 204).given(projectGid, "hUpEx;_!u8;,QC9qz").checkEq(path, "/projects/hUpEx;_!u8;,QC9qz");
        ItemRequest<Project> req = new ItemRequest<Project>(this, Project.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Project> getProject(String projectGid) throws IOException {
        return getProject(projectGid, null, false);
    }

    /**
     * Get multiple projects
     * Returns the compact project records for some filtered set of projects. Use one or more of the parameters provided to filter the projects returned. *Note: This endpoint may timeout for large domains. Try filtering by team!*
     * @param archived Only return projects whose &#x60;archived&#x60; field takes on the value of this parameter. (optional)
     * @param team The team to filter projects on. (optional)
     * @param workspace The workspace or organization to filter projects on. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Project> getProjects(Boolean archived, String team, String workspace, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects";
        CollectionRequest<Project> req = new CollectionRequest<Project>(this, Project.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("workspace", workspace).query("team", team).query("archived", archived);
        return req;
    }

    public CollectionRequest<Project> getProjects(Boolean archived, String team, String workspace) throws IOException {
        return getProjects(archived, team, workspace, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get projects a task is in
     * Returns a compact representation of all of the projects the task is in.
     * @param taskGid The task to operate on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Project> getProjectsForTask(String taskGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/projects".replace("{task_gid}", taskGid);
        itest("randoop", 259).given(taskGid, "").checkEq(path, "/tasks//projects");
        itest("randoop", 259).given(taskGid, "/portfolios/").checkEq(path, "/tasks//portfolios//projects");
        itest("randoop", 259).given(taskGid, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert/projects");
        itest("randoop", 259).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/projects");
        itest("randoop", 259).given(taskGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/projects");
        itest("randoop", 259).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/projects");
        itest("randoop", 259).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/projects");
        itest("randoop", 259).given(taskGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/projects");
        itest("randoop", 259).given(taskGid, "200").checkEq(path, "/tasks/200/projects");
        itest("randoop", 259).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/projects");
        itest("randoop", 259).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/projects");
        itest("evosuite", 259).given(taskGid, "Uj+T}s@[CWmJrM").checkEq(path, "/tasks/Uj+T}s@[CWmJrM/projects");
        itest("randoop", 259).given(taskGid, "GET").checkEq(path, "/tasks/GET/projects");
        itest("randoop", 259).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/projects");
        itest("evosuite", 259).given(taskGid, "DS").checkEq(path, "/tasks/DS/projects");
        itest("randoop", 259).given(taskGid, "POST").checkEq(path, "/tasks/POST/projects");
        itest("randoop", 259).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 259).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/projects");
        itest("randoop", 259).given(taskGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: 200/projects");
        itest("randoop", 259).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/projects");
        itest("randoop", 259).given(taskGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 259).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/projects");
        itest("randoop", 259).given(taskGid, "10").checkEq(path, "/tasks/10/projects");
        itest("randoop", 259).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/projects");
        itest("evosuite", 259).given(taskGid, "]cwo]&{~^").checkEq(path, "/tasks/]cwo]&{~^/projects");
        itest("randoop", 259).given(taskGid, "/tasks/GET").checkEq(path, "/tasks//tasks/GET/projects");
        itest("randoop", 259).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/projects");
        itest("randoop", 259).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 259).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/projects");
        itest("randoop", 259).given(taskGid, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/projects");
        CollectionRequest<Project> req = new CollectionRequest<Project>(this, Project.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Project> getProjectsForTask(String taskGid) throws IOException {
        return getProjectsForTask(taskGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get a team&#x27;s projects
     * Returns the compact project records for all projects in the team.
     * @param teamGid Globally unique identifier for the team. (required)
     * @param archived Only return projects whose &#x60;archived&#x60; field takes on the value of this parameter. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Project> getProjectsForTeam(String teamGid, Boolean archived, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/teams/{team_gid}/projects".replace("{team_gid}", teamGid);
        itest("randoop", 286).given(teamGid, "NoAuthorizationError").checkEq(path, "/teams/NoAuthorizationError/projects");
        itest("randoop", 286).given(teamGid, "Invalid Request").checkEq(path, "/teams/Invalid Request/projects");
        itest("randoop", 286).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/projects");
        itest("randoop", 286).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 286).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 286).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 286).given(teamGid, "/attachments/Not Found").checkEq(path, "/teams//attachments/Not Found/projects");
        itest("randoop", 286).given(teamGid, "").checkEq(path, "/teams//projects");
        itest("evosuite", 286).given(teamGid, ";nP`q-dQmO&\"d*").checkEq(path, "/teams/;nP`q-dQmO&\"d*/projects");
        itest("randoop", 286).given(teamGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 286).given(teamGid, "Rate Limit Enforced").checkEq(path, "/teams/Rate Limit Enforced/projects");
        itest("randoop", 286).given(teamGid, "0").checkEq(path, "/teams/0/projects");
        itest("randoop", 286).given(teamGid, "Forbidden").checkEq(path, "/teams/Forbidden/projects");
        itest("randoop", 286).given(teamGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: Server Error/projects");
        itest("randoop", 286).given(teamGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/teams//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/projects");
        itest("randoop", 286).given(teamGid, "Server Error").checkEq(path, "/teams/Server Error/projects");
        itest("evosuite", 286).given(teamGid, "/projects/{project_gid}/addCustomFieldSetting").checkEq(path, "/teams//projects/{project_gid}/addCustomFieldSetting/projects");
        itest("randoop", 286).given(teamGid, "200").checkEq(path, "/teams/200/projects");
        itest("randoop", 286).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 286).given(teamGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/teams//portfolios//goals/{goal_gid}/subgoals/projects");
        itest("randoop", 286).given(teamGid, "Not Found").checkEq(path, "/teams/Not Found/projects");
        itest("randoop", 286).given(teamGid, "POST").checkEq(path, "/teams/POST/projects");
        itest("evosuite", 286).given(teamGid, "EXTENDED_TYPES").checkEq(path, "/teams/EXTENDED_TYPES/projects");
        itest("randoop", 286).given(teamGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/teams/com.asana.errors.InvalidTokenError: Sync token invalid or too old/projects");
        itest("evosuite", 286).given(teamGid, "/projects").checkEq(path, "/teams//projects/projects");
        itest("randoop", 286).given(teamGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/projects");
        itest("randoop", 286).given(teamGid, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old/projects");
        itest("evosuite", 286).given(teamGid, "/projects/com.github.javaparser.metamodel.BinaryExprMetaModel/addFollowers").checkEq(path, "/teams//projects/com.github.javaparser.metamodel.BinaryExprMetaModel/addFollowers/projects");
        itest("randoop", 286).given(teamGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/teams/com.asana.errors.PremiumOnlyError: Payment Required/projects");
        CollectionRequest<Project> req = new CollectionRequest<Project>(this, Project.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("archived", archived);
        return req;
    }

    public CollectionRequest<Project> getProjectsForTeam(String teamGid, Boolean archived) throws IOException {
        return getProjectsForTeam(teamGid, archived, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get all projects in a workspace
     * Returns the compact project records for all projects in the workspace. *Note: This endpoint may timeout for large domains. Prefer the &#x60;/teams/{team_gid}/projects&#x60; endpoint.*
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param archived Only return projects whose &#x60;archived&#x60; field takes on the value of this parameter. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Project> getProjectsForWorkspace(String workspaceGid, Boolean archived, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/projects".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 314).given(workspaceGid, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/projects");
        itest("evosuite", 314).given(workspaceGid, "").checkEq(path, "/workspaces//projects");
        itest("randoop", 314).given(workspaceGid, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/projects");
        itest("randoop", 314).given(workspaceGid, "/attachments/").checkEq(path, "/workspaces//attachments//projects");
        itest("evosuite", 314).given(workspaceGid, "O5< w:ng/2es]m<").checkEq(path, "/workspaces/O5< w:ng/2es]m</projects");
        itest("randoop", 314).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/projects");
        itest("randoop", 314).given(workspaceGid, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/projects");
        itest("randoop", 314).given(workspaceGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/workspaces//tasks//attachments/Not Found/addProject/projects");
        itest("randoop", 314).given(workspaceGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 314).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 314).given(workspaceGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//portfolio_memberships//goals/{goal_gid}/addSubgoal/projects");
        itest("randoop", 314).given(workspaceGid, "Server Error").checkEq(path, "/workspaces/Server Error/projects");
        itest("randoop", 314).given(workspaceGid, "Forbidden").checkEq(path, "/workspaces/Forbidden/projects");
        itest("randoop", 314).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 314).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 314).given(workspaceGid, "/workspaces/").checkEq(path, "/workspaces//workspaces//projects");
        itest("randoop", 314).given(workspaceGid, "0").checkEq(path, "/workspaces/0/projects");
        itest("randoop", 314).given(workspaceGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/projects");
        itest("evosuite", 314).given(workspaceGid, "value").checkEq(path, "/workspaces/value/projects");
        itest("randoop", 314).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/projects");
        itest("randoop", 314).given(workspaceGid, "POST").checkEq(path, "/workspaces/POST/projects");
        itest("randoop", 314).given(workspaceGid, "GET").checkEq(path, "/workspaces/GET/projects");
        itest("randoop", 314).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 314).given(workspaceGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/projects");
        itest("randoop", 314).given(workspaceGid, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/projects");
        itest("randoop", 314).given(workspaceGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/projects");
        itest("randoop", 314).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found/projects");
        itest("randoop", 314).given(workspaceGid, "").checkEq(path, "/workspaces//projects");
        itest("randoop", 314).given(workspaceGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: 200/projects");
        itest("randoop", 314).given(workspaceGid, "hi!").checkEq(path, "/workspaces/hi!/projects");
        itest("evosuite", 314).given(workspaceGid, "qHLnrPE0\"hog.ufbI3").checkEq(path, "/workspaces/qHLnrPE0\"hog.ufbI3/projects");
        CollectionRequest<Project> req = new CollectionRequest<Project>(this, Project.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("archived", archived);
        return req;
    }

    public CollectionRequest<Project> getProjectsForWorkspace(String workspaceGid, Boolean archived) throws IOException {
        return getProjectsForWorkspace(workspaceGid, archived, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get task count of a project
     * Get an object that holds task count fields. **All fields are excluded by default**. You must [opt in](/docs/input-output-options) using &#x60;opt_fields&#x60; to get any information from this endpoint.  This endpoint has an additional [rate limit](/docs/standard-rate-limits) and each field counts especially high against our [cost limits](/docs/cost-limits).  Milestones are just tasks, so they are included in the &#x60;num_tasks&#x60;, &#x60;num_incomplete_tasks&#x60;, and &#x60;num_completed_tasks&#x60; counts.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> getTaskCountsForProject(String projectGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/task_counts".replace("{project_gid}", projectGid);
        itest("evosuite", 341).given(projectGid, "%s is not NormalAnnotationExpr, it is %s").checkEq(path, "/projects/%s is not NormalAnnotationExpr, it is %s/task_counts");
        itest("randoop", 341).given(projectGid, "POST").checkEq(path, "/projects/POST/task_counts");
        itest("randoop", 341).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/task_counts");
        itest("randoop", 341).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/task_counts");
        itest("randoop", 341).given(projectGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/task_counts");
        itest("randoop", 341).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/task_counts");
        itest("randoop", 341).given(projectGid, "hi!").checkEq(path, "/projects/hi!/task_counts");
        itest("randoop", 341).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/task_counts");
        itest("randoop", 341).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/task_counts");
        itest("randoop", 341).given(projectGid, "/tags").checkEq(path, "/projects//tags/task_counts");
        itest("randoop", 341).given(projectGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: /portfolios//task_counts");
        itest("randoop", 341).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/task_counts");
        itest("randoop", 341).given(projectGid, "").checkEq(path, "/projects//task_counts");
        itest("randoop", 341).given(projectGid, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/task_counts");
        itest("evosuite", 341).given(projectGid, "com.google.api.client.util.Preconditions").checkEq(path, "/projects/com.google.api.client.util.Preconditions/task_counts");
        itest("randoop", 341).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/task_counts");
        itest("randoop", 341).given(projectGid, "0").checkEq(path, "/projects/0/task_counts");
        itest("randoop", 341).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/task_counts");
        itest("randoop", 341).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/task_counts");
        itest("randoop", 341).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/task_counts");
        itest("randoop", 341).given(projectGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/task_counts");
        itest("evosuite", 341).given(projectGid, "").checkEq(path, "/projects//task_counts");
        itest("randoop", 341).given(projectGid, "10").checkEq(path, "/projects/10/task_counts");
        itest("randoop", 341).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/task_counts");
        itest("randoop", 341).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/task_counts");
        itest("randoop", 341).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/task_counts");
        itest("randoop", 341).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/task_counts");
        itest("randoop", 341).given(projectGid, "/webhooks/NoAuthorizationError").checkEq(path, "/projects//webhooks/NoAuthorizationError/task_counts");
        itest("evosuite", 341).given(projectGid, "%PSK(<EVlY~ia^#H'4w").checkEq(path, "/projects/%PSK(<EVlY~ia^#H'4w/task_counts");
        itest("randoop", 341).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/task_counts");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<JsonElement> getTaskCountsForProject(String projectGid) throws IOException {
        return getTaskCountsForProject(projectGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Remove a custom field from a project
     * Removes a custom field setting from a project.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeCustomFieldSettingForProject(String projectGid, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/removeCustomFieldSetting".replace("{project_gid}", projectGid);
        itest("randoop", 364).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/removeCustomFieldSetting");
        itest("evosuite", 364).given(projectGid, "_eqSd5$CbkP=}wog").checkEq(path, "/projects/_eqSd5$CbkP=}wog/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "200").checkEq(path, "/projects/200/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "10").checkEq(path, "/projects/10/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/projects//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/organizations//teams").checkEq(path, "/projects//organizations//teams/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "0").checkEq(path, "/projects/0/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/removeCustomFieldSetting");
        itest("evosuite", 364).given(projectGid, "/projects/{project_gid}/removeFollowers").checkEq(path, "/projects//projects/{project_gid}/removeFollowers/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "100").checkEq(path, "/projects/100/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/removeCustomFieldSetting");
        itest("evosuite", 364).given(projectGid, "}u9JMt2").checkEq(path, "/projects/}u9JMt2/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "POST").checkEq(path, "/projects/POST/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "").checkEq(path, "/projects//removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/removeCustomFieldSetting");
        itest("evosuite", 364).given(projectGid, "{team_gid}").checkEq(path, "/projects/{team_gid}/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/removeCustomFieldSetting");
        itest("evosuite", 364).given(projectGid, "workspace").checkEq(path, "/projects/workspace/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/removeCustomFieldSetting");
        itest("randoop", 364).given(projectGid, "hi!").checkEq(path, "/projects/hi!/removeCustomFieldSetting");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty);
        return req;
    }

    public ItemRequest<JsonElement> removeCustomFieldSettingForProject(String projectGid) throws IOException {
        return removeCustomFieldSettingForProject(projectGid, false);
    }

    /**
     * Remove followers from a project
     * Removes the specified list of users from following the project, this will not affect project membership status. Returns the updated project record.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeFollowersForProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/removeFollowers".replace("{project_gid}", projectGid);
        itest("randoop", 385).given(projectGid, "hi!").checkEq(path, "/projects/hi!/removeFollowers");
        itest("randoop", 385).given(projectGid, "POST").checkEq(path, "/projects/POST/removeFollowers");
        itest("randoop", 385).given(projectGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200/removeFollowers");
        itest("randoop", 385).given(projectGid, "10").checkEq(path, "/projects/10/removeFollowers");
        itest("randoop", 385).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/removeFollowers");
        itest("randoop", 385).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/removeFollowers");
        itest("evosuite", 385).given(projectGid, "8,l;&f&l").checkEq(path, "/projects/8,l;&f&l/removeFollowers");
        itest("randoop", 385).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/removeFollowers");
        itest("randoop", 385).given(projectGid, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required/removeFollowers");
        itest("randoop", 385).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/removeFollowers");
        itest("evosuite", 385).given(projectGid, "$").checkEq(path, "/projects/$/removeFollowers");
        itest("randoop", 385).given(projectGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject/removeFollowers");
        itest("evosuite", 385).given(projectGid, "").checkEq(path, "/projects//removeFollowers");
        itest("randoop", 385).given(projectGid, "/tasks/200/addProject").checkEq(path, "/projects//tasks/200/addProject/removeFollowers");
        itest("randoop", 385).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/removeFollowers");
        itest("evosuite", 385).given(projectGid, "GET").checkEq(path, "/projects/GET/removeFollowers");
        itest("randoop", 385).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/removeFollowers");
        itest("randoop", 385).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeFollowers");
        itest("evosuite", 385).given(projectGid, "&").checkEq(path, "/projects/&/removeFollowers");
        itest("randoop", 385).given(projectGid, "/workspaces/").checkEq(path, "/projects//workspaces//removeFollowers");
        itest("randoop", 385).given(projectGid, "").checkEq(path, "/projects//removeFollowers");
        itest("randoop", 385).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/removeFollowers");
        itest("randoop", 385).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/removeFollowers");
        itest("randoop", 385).given(projectGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//portfolio_memberships//goals/{goal_gid}/addSubgoal/removeFollowers");
        itest("randoop", 385).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeFollowers");
        itest("randoop", 385).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/removeFollowers");
        itest("randoop", 385).given(projectGid, "200").checkEq(path, "/projects/200/removeFollowers");
        itest("randoop", 385).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeFollowers");
        itest("randoop", 385).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeFollowers");
        itest("evosuite", 385).given(projectGid, "-_.*").checkEq(path, "/projects/-_.*/removeFollowers");
        itest("randoop", 385).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeFollowers");
        itest("randoop", 385).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/removeFollowers");
        itest("randoop", 385).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/removeFollowers");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeFollowersForProject(String projectGid) throws IOException {
        return removeFollowersForProject(projectGid, null, false);
    }

    /**
     * Remove users from a project
     * Removes the specified list of users from members of the project. Returns the updated project record.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeMembersForProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/removeMembers".replace("{project_gid}", projectGid);
        itest("randoop", 407).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeMembers");
        itest("randoop", 407).given(projectGid, "/tags").checkEq(path, "/projects//tags/removeMembers");
        itest("randoop", 407).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/removeMembers");
        itest("randoop", 407).given(projectGid, "hi!").checkEq(path, "/projects/hi!/removeMembers");
        itest("randoop", 407).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/removeMembers");
        itest("randoop", 407).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/removeMembers");
        itest("randoop", 407).given(projectGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeMembers");
        itest("randoop", 407).given(projectGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals/removeMembers");
        itest("randoop", 407).given(projectGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//portfolio_memberships//goals/{goal_gid}/addSubgoal/removeMembers");
        itest("randoop", 407).given(projectGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeMembers");
        itest("randoop", 407).given(projectGid, "10").checkEq(path, "/projects/10/removeMembers");
        itest("randoop", 407).given(projectGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: /portfolios//removeMembers");
        itest("randoop", 407).given(projectGid, "").checkEq(path, "/projects//removeMembers");
        itest("randoop", 407).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/removeMembers");
        itest("randoop", 407).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/removeMembers");
        itest("evosuite", 407).given(projectGid, "NameExpr").checkEq(path, "/projects/NameExpr/removeMembers");
        itest("randoop", 407).given(projectGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/projects/com.asana.errors.InvalidRequestError: Invalid Request/removeMembers");
        itest("evosuite", 407).given(projectGid, "/projects").checkEq(path, "/projects//projects/removeMembers");
        itest("randoop", 407).given(projectGid, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required/removeMembers");
        itest("randoop", 407).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/removeMembers");
        itest("randoop", 407).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeMembers");
        itest("evosuite", 407).given(projectGid, "").checkEq(path, "/projects//removeMembers");
        itest("randoop", 407).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/removeMembers");
        itest("randoop", 407).given(projectGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200/removeMembers");
        itest("randoop", 407).given(projectGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/removeMembers");
        itest("randoop", 407).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/removeMembers");
        itest("randoop", 407).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeMembers");
        itest("evosuite", 407).given(projectGid, "/projects//addCustomFieldSetting").checkEq(path, "/projects//projects//addCustomFieldSetting/removeMembers");
        itest("randoop", 407).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/removeMembers");
        itest("randoop", 407).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/removeMembers");
        itest("randoop", 407).given(projectGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeMembers");
        itest("randoop", 407).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/removeMembers");
        itest("randoop", 407).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/removeMembers");
        itest("randoop", 407).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/removeMembers");
        itest("evosuite", 407).given(projectGid, "%s is not NormalAnnotationExpr, it is %s").checkEq(path, "/projects/%s is not NormalAnnotationExpr, it is %s/removeMembers");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeMembersForProject(String projectGid) throws IOException {
        return removeMembersForProject(projectGid, null, false);
    }

    /**
     * Update a project
     * A specific, existing project can be updated by making a PUT request on the URL for that project. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated project record.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Project> updateProject(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}".replace("{project_gid}", projectGid);
        itest("evosuite", 429).given(projectGid, "{team_gid}").checkEq(path, "/projects/{team_gid}");
        itest("randoop", 429).given(projectGid, "200").checkEq(path, "/projects/200");
        itest("randoop", 429).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 429).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 429).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced");
        itest("randoop", 429).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required");
        itest("evosuite", 429).given(projectGid, "").checkEq(path, "/projects/");
        itest("randoop", 429).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 429).given(projectGid, "com.asana.errors.ServerError: Server Error").checkEq(path, "/projects/com.asana.errors.ServerError: Server Error");
        itest("randoop", 429).given(projectGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 429).given(projectGid, "POST").checkEq(path, "/projects/POST");
        itest("randoop", 429).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden");
        itest("randoop", 429).given(projectGid, "GET").checkEq(path, "/projects/GET");
        itest("randoop", 429).given(projectGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject");
        itest("randoop", 429).given(projectGid, "/projects/Not Found/removeFollowers").checkEq(path, "/projects//projects/Not Found/removeFollowers");
        itest("randoop", 429).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 429).given(projectGid, "").checkEq(path, "/projects/");
        itest("randoop", 429).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 429).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 429).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError");
        itest("randoop", 429).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 429).given(projectGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 429).given(projectGid, "/tasks/200/addProject").checkEq(path, "/projects//tasks/200/addProject");
        itest("randoop", 429).given(projectGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 429).given(projectGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/projects//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 429).given(projectGid, "hi!").checkEq(path, "/projects/hi!");
        itest("randoop", 429).given(projectGid, "/tags").checkEq(path, "/projects//tags");
        itest("randoop", 429).given(projectGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 429).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 429).given(projectGid, "/organizations//teams").checkEq(path, "/projects//organizations//teams");
        itest("randoop", 429).given(projectGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 429).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request");
        itest("evosuite", 429).given(projectGid, "/user_task_lists/{user_task_list_gid}/tasks").checkEq(path, "/projects//user_task_lists/{user_task_list_gid}/tasks");
        itest("evosuite", 429).given(projectGid, "limit").checkEq(path, "/projects/limit");
        ItemRequest<Project> req = new ItemRequest<Project>(this, Project.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Project> updateProject(String projectGid) throws IOException {
        return updateProject(projectGid, null, false);
    }
}
