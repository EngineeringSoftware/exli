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

public class UserTaskListsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public UserTaskListsBase(Client client) {
        super(client);
    }

    /**
     * Get a user task list
     * Returns the full record for a user task list.
     * @param userTaskListGid Globally unique identifier for the user task list. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(UserTaskList)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<UserTaskList> getUserTaskList(String userTaskListGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/user_task_lists/{user_task_list_gid}".replace("{user_task_list_gid}", userTaskListGid);
        itest("randoop", 31).given(userTaskListGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/user_task_lists//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 31).given(userTaskListGid, "GET").checkEq(path, "/user_task_lists/GET");
        itest("randoop", 31).given(userTaskListGid, "200").checkEq(path, "/user_task_lists/200");
        itest("randoop", 31).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 31).given(userTaskListGid, "Not Found").checkEq(path, "/user_task_lists/Not Found");
        itest("randoop", 31).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 31).given(userTaskListGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/user_task_lists/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("evosuite", 31).given(userTaskListGid, "Ul").checkEq(path, "/user_task_lists/Ul");
        itest("evosuite", 31).given(userTaskListGid, "GET").checkEq(path, "/user_task_lists/GET");
        itest("evosuite", 31).given(userTaskListGid, "\" IMEa'b:XN").checkEq(path, "/user_task_lists/\" IMEa'b:XN");
        itest("randoop", 31).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 31).given(userTaskListGid, "-q 1rWfa@\"L;F").checkEq(path, "/user_task_lists/-q 1rWfa@\"L;F");
        itest("randoop", 31).given(userTaskListGid, "").checkEq(path, "/user_task_lists/");
        itest("randoop", 31).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("evosuite", 31).given(userTaskListGid, "/users//W/user_task_list").checkEq(path, "/user_task_lists//users//W/user_task_list");
        itest("randoop", 31).given(userTaskListGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/user_task_lists//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 31).given(userTaskListGid, "Sync token invalid or too old").checkEq(path, "/user_task_lists/Sync token invalid or too old");
        itest("randoop", 31).given(userTaskListGid, "2").checkEq(path, "/user_task_lists/2");
        itest("randoop", 31).given(userTaskListGid, "Forbidden").checkEq(path, "/user_task_lists/Forbidden");
        itest("evosuite", 31).given(userTaskListGid, "][|]iwyf;rz>qSHNd").checkEq(path, "/user_task_lists/][|]iwyf;rz>qSHNd");
        itest("randoop", 31).given(userTaskListGid, "POST").checkEq(path, "/user_task_lists/POST");
        itest("randoop", 31).given(userTaskListGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/user_task_lists//projects/Rate Limit Enforced/sections");
        itest("randoop", 31).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 31).given(userTaskListGid, "hi!").checkEq(path, "/user_task_lists/hi!");
        itest("randoop", 31).given(userTaskListGid, "Server Error").checkEq(path, "/user_task_lists/Server Error");
        itest("randoop", 31).given(userTaskListGid, "NoAuthorizationError").checkEq(path, "/user_task_lists/NoAuthorizationError");
        itest("randoop", 31).given(userTaskListGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/user_task_lists//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 31).given(userTaskListGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/user_task_lists//goals/{goal_gid}/subgoals");
        itest("randoop", 31).given(userTaskListGid, "100").checkEq(path, "/user_task_lists/100");
        ItemRequest<UserTaskList> req = new ItemRequest<UserTaskList>(this, UserTaskList.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<UserTaskList> getUserTaskList(String userTaskListGid) throws IOException {
        return getUserTaskList(userTaskListGid, null, false);
    }

    /**
     * Get a user&#x27;s task list
     * Returns the full record for a user&#x27;s task list.
     * @param userGid A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (required)
     * @param workspace The workspace in which to get the user task list. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(UserTaskList)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<UserTaskList> getUserTaskListForUser(String userGid, String workspace, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/users/{user_gid}/user_task_list".replace("{user_gid}", userGid);
        itest("randoop", 54).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/user_task_list");
        itest("evosuite", 54).given(userGid, "").checkEq(path, "/users//user_task_list");
        itest("randoop", 54).given(userGid, "/workspaces//addUser").checkEq(path, "/users//workspaces//addUser/user_task_list");
        itest("randoop", 54).given(userGid, "/tags").checkEq(path, "/users//tags/user_task_list");
        itest("randoop", 54).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/user_task_list");
        itest("randoop", 54).given(userGid, "hi!").checkEq(path, "/users/hi!/user_task_list");
        itest("evosuite", 54).given(userGid, "/W").checkEq(path, "/users//W/user_task_list");
        itest("randoop", 54).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/user_task_list");
        itest("randoop", 54).given(userGid, "POST").checkEq(path, "/users/POST/user_task_list");
        itest("randoop", 54).given(userGid, "Invalid Request").checkEq(path, "/users/Invalid Request/user_task_list");
        itest("randoop", 54).given(userGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/users//tasks//attachments/Not Found/addProject/user_task_list");
        itest("randoop", 54).given(userGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/users/urn:ietf:wg:oauth:2.0:oob/user_task_list");
        itest("randoop", 54).given(userGid, "/tasks/200/addProject").checkEq(path, "/users//tasks/200/addProject/user_task_list");
        itest("randoop", 54).given(userGid, "NoAuthorizationError").checkEq(path, "/users/NoAuthorizationError/user_task_list");
        itest("evosuite", 54).given(userGid, ">").checkEq(path, "/users/>/user_task_list");
        itest("randoop", 54).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/user_task_list");
        itest("randoop", 54).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/user_task_list");
        itest("evosuite", 54).given(userGid, "n").checkEq(path, "/users/n/user_task_list");
        itest("randoop", 54).given(userGid, "Rate Limit Enforced").checkEq(path, "/users/Rate Limit Enforced/user_task_list");
        itest("randoop", 54).given(userGid, "Not Found").checkEq(path, "/users/Not Found/user_task_list");
        itest("randoop", 54).given(userGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/users//goals/{goal_gid}/addSubgoal/user_task_list");
        itest("randoop", 54).given(userGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/user_task_list");
        itest("randoop", 54).given(userGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/user_task_list");
        itest("randoop", 54).given(userGid, "").checkEq(path, "/users//user_task_list");
        itest("randoop", 54).given(userGid, "Server Error").checkEq(path, "/users/Server Error/user_task_list");
        itest("evosuite", 54).given(userGid, "{user_task_list_gid}").checkEq(path, "/users/{user_task_list_gid}/user_task_list");
        ItemRequest<UserTaskList> req = new ItemRequest<UserTaskList>(this, UserTaskList.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("workspace", workspace);
        return req;
    }

    public ItemRequest<UserTaskList> getUserTaskListForUser(String userGid, String workspace) throws IOException {
        return getUserTaskListForUser(userGid, workspace, null, false);
    }
}
