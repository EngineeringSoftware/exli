package com.asana.resources;

import com.asana.Client;
import com.asana.models.UserTaskList;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.UserTaskListsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class UserTaskLists extends UserTaskListsBase {

    public UserTaskLists(Client client) {
        super(client);
    }

    /**
     * Returns the full record for the user task list for the given user
     *
     * @param  user An identifier for the user. Can be one of an email address,
     * the globally unique identifier for the user, or the keyword `me`
     * to indicate the current user making the request.
     * @return Request object
     */
    public ItemRequest<UserTaskList> findByUser(String user) {
        String path = String.format("/users/%s/user_task_list", user);
        itest("evosuite", 24).given(user, "com.github.javaparser.ast.stmt.SwitchEntry$Type").checkEq(path, "/users/com.github.javaparser.ast.stmt.SwitchEntry$Type/user_task_list");
        itest("evosuite", 24).given(user, "=Y5^D&Ab{LZt").checkEq(path, "/users/=Y5^D&Ab{LZt/user_task_list");
        itest("randoop", 24).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//user_task_list");
        itest("randoop", 24).given(user, "").checkEq(path, "/users//user_task_list");
        itest("randoop", 24).given(user, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/user_task_list");
        itest("randoop", 24).given(user, "0").checkEq(path, "/users/0/user_task_list");
        itest("randoop", 24).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/user_task_list");
        itest("randoop", 24).given(user, "200").checkEq(path, "/users/200/user_task_list");
        itest("randoop", 24).given(user, "hi!").checkEq(path, "/users/hi!/user_task_list");
        itest("randoop", 24).given(user, "/attachments/Not Found").checkEq(path, "/users//attachments/Not Found/user_task_list");
        itest("evosuite", 24).given(user, "a<Xfo").checkEq(path, "/users/a<Xfo/user_task_list");
        itest("randoop", 24).given(user, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/user_task_list");
        itest("randoop", 24).given(user, "Forbidden").checkEq(path, "/users/Forbidden/user_task_list");
        itest("randoop", 24).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/user_task_list");
        itest("randoop", 24).given(user, "100").checkEq(path, "/users/100/user_task_list");
        itest("randoop", 24).given(user, "GET").checkEq(path, "/users/GET/user_task_list");
        itest("randoop", 24).given(user, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/users/com.asana.errors.InvalidRequestError: Invalid Request/user_task_list");
        itest("randoop", 24).given(user, "10").checkEq(path, "/users/10/user_task_list");
        itest("randoop", 24).given(user, "/attachments/").checkEq(path, "/users//attachments//user_task_list");
        itest("randoop", 24).given(user, "Not Found").checkEq(path, "/users/Not Found/user_task_list");
        itest("randoop", 24).given(user, "Rate Limit Enforced").checkEq(path, "/users/Rate Limit Enforced/user_task_list");
        itest("randoop", 24).given(user, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/user_task_list");
        itest("randoop", 24).given(user, "Sync token invalid or too old").checkEq(path, "/users/Sync token invalid or too old/user_task_list");
        itest("randoop", 24).given(user, "Payment Required").checkEq(path, "/users/Payment Required/user_task_list");
        itest("evosuite", 24).given(user, "lvTL(3#S3&/Y>").checkEq(path, "/users/lvTL(3#S3&/Y>/user_task_list");
        itest("randoop", 24).given(user, "/goals/{goal_gid}/subgoals").checkEq(path, "/users//goals/{goal_gid}/subgoals/user_task_list");
        itest("randoop", 24).given(user, "NoAuthorizationError").checkEq(path, "/users/NoAuthorizationError/user_task_list");
        return new ItemRequest<UserTaskList>(this, UserTaskList.class, path, "GET");
    }

    /**
     * Returns the full record for a user task list.
     *
     * @param  userTaskList Globally unique identifier for the user task list.
     * @return Request object
     */
    public ItemRequest<UserTaskList> findById(String userTaskList) {
        String path = String.format("/user_task_lists/%s", userTaskList);
        itest("evosuite", 36).given(userTaskList, null).checkEq(path, "/user_task_lists/null");
        itest("randoop", 36).given(userTaskList, "Payment Required").checkEq(path, "/user_task_lists/Payment Required");
        itest("randoop", 36).given(userTaskList, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/user_task_lists//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 36).given(userTaskList, "Not Found").checkEq(path, "/user_task_lists/Not Found");
        itest("randoop", 36).given(userTaskList, "NoAuthorizationError").checkEq(path, "/user_task_lists/NoAuthorizationError");
        itest("randoop", 36).given(userTaskList, "0").checkEq(path, "/user_task_lists/0");
        itest("randoop", 36).given(userTaskList, "/workspaces/").checkEq(path, "/user_task_lists//workspaces/");
        itest("evosuite", 36).given(userTaskList, "a<fo").checkEq(path, "/user_task_lists/a<fo");
        itest("randoop", 36).given(userTaskList, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/user_task_lists/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 36).given(userTaskList, "/organizations//teams").checkEq(path, "/user_task_lists//organizations//teams");
        itest("randoop", 36).given(userTaskList, "/workspaces//addUser").checkEq(path, "/user_task_lists//workspaces//addUser");
        itest("randoop", 36).given(userTaskList, "Invalid Request").checkEq(path, "/user_task_lists/Invalid Request");
        itest("randoop", 36).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 36).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 36).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 36).given(userTaskList, "@f:").checkEq(path, "/user_task_lists/@f:");
        itest("randoop", 36).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("evosuite", 36).given(userTaskList, "com.github.javaparser.ast.expr.ArrayAccessExpr").checkEq(path, "/user_task_lists/com.github.javaparser.ast.expr.ArrayAccessExpr");
        itest("randoop", 36).given(userTaskList, "10").checkEq(path, "/user_task_lists/10");
        itest("dev", 36).given(userTaskList, "1").checkEq(path, "/user_task_lists/1");
        itest("randoop", 36).given(userTaskList, "/tasks//attachments/Not Found/addProject").checkEq(path, "/user_task_lists//tasks//attachments/Not Found/addProject");
        itest("randoop", 36).given(userTaskList, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/user_task_lists/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 36).given(userTaskList, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/user_task_lists//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 36).given(userTaskList, "-1").checkEq(path, "/user_task_lists/-1");
        itest("randoop", 36).given(userTaskList, "").checkEq(path, "/user_task_lists/");
        itest("randoop", 36).given(userTaskList, "Sync token invalid or too old").checkEq(path, "/user_task_lists/Sync token invalid or too old");
        itest("randoop", 36).given(userTaskList, "POST").checkEq(path, "/user_task_lists/POST");
        itest("randoop", 36).given(userTaskList, "Server Error").checkEq(path, "/user_task_lists/Server Error");
        itest("randoop", 36).given(userTaskList, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/user_task_lists//portfolios//goals/{goal_gid}/subgoals");
        return new ItemRequest<UserTaskList>(this, UserTaskList.class, path, "GET");
    }

    /**
     * Returns the compact list of tasks in a user's My Tasks list. The returned
     * tasks will be in order within each assignee status group of `Inbox`,
     * `Today`, and `Upcoming`.
     *
     * **Note:** tasks in `Later` have a different ordering in the Asana web app
     * than the other assignee status groups; this endpoint will still return
     * them in list order in `Later` (differently than they show up in Asana,
     * but the same order as in Asana's mobile apps).
     *
     * **Note:** Access control is enforced for this endpoint as with all Asana
     * API endpoints, meaning a user's private tasks will be filtered out if the
     * API-authenticated user does not have access to them.
     *
     * **Note:** Both complete and incomplete tasks are returned by default
     * unless they are filtered out (for example, setting `completed_since=now`
     * will return only incomplete tasks, which is the default view for "My
     * Tasks" in Asana.)
     *
     * @param  userTaskList The user task list in which to search for tasks.
     * @return Request object
     */
    public CollectionRequest<UserTaskList> tasks(String userTaskList) {
        String path = String.format("/user_task_lists/%s/tasks", userTaskList);
        itest("randoop", 64).given(userTaskList, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/user_task_lists/urn:ietf:wg:oauth:2.0:oob/tasks");
        itest("randoop", 64).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("evosuite", 64).given(userTaskList, "CHARACTER_LITERAL").checkEq(path, "/user_task_lists/CHARACTER_LITERAL/tasks");
        itest("randoop", 64).given(userTaskList, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/user_task_lists/com.asana.errors.InvalidRequestError: Invalid Request/tasks");
        itest("evosuite", 64).given(userTaskList, "ZKA8]wlyKVym/7y1yI").checkEq(path, "/user_task_lists/ZKA8]wlyKVym/7y1yI/tasks");
        itest("evosuite", 64).given(userTaskList, "qFu!p\"8[D\"+dU F3").checkEq(path, "/user_task_lists/qFu!p\"8[D\"+dU F3/tasks");
        itest("randoop", 64).given(userTaskList, "hi!").checkEq(path, "/user_task_lists/hi!/tasks");
        itest("randoop", 64).given(userTaskList, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/user_task_lists/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tasks");
        itest("randoop", 64).given(userTaskList, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/user_task_lists/com.asana.errors.RetryableAsanaError: 200/tasks");
        itest("randoop", 64).given(userTaskList, "").checkEq(path, "/user_task_lists//tasks");
        itest("randoop", 64).given(userTaskList, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/user_task_lists/com.asana.errors.PremiumOnlyError: Payment Required/tasks");
        itest("evosuite", 64).given(userTaskList, "dp%q1`3_*}.#%Trf").checkEq(path, "/user_task_lists/dp%q1`3_*}.#%Trf/tasks");
        itest("evosuite", 64).given(userTaskList, "").checkEq(path, "/user_task_lists//tasks");
        itest("randoop", 64).given(userTaskList, "0").checkEq(path, "/user_task_lists/0/tasks");
        itest("randoop", 64).given(userTaskList, "Payment Required").checkEq(path, "/user_task_lists/Payment Required/tasks");
        itest("randoop", 64).given(userTaskList, "Sync token invalid or too old").checkEq(path, "/user_task_lists/Sync token invalid or too old/tasks");
        itest("randoop", 64).given(userTaskList, "/tasks//attachments/Not Found/addProject").checkEq(path, "/user_task_lists//tasks//attachments/Not Found/addProject/tasks");
        itest("randoop", 64).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 64).given(userTaskList, "200").checkEq(path, "/user_task_lists/200/tasks");
        itest("randoop", 64).given(userTaskList, "GET").checkEq(path, "/user_task_lists/GET/tasks");
        itest("randoop", 64).given(userTaskList, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/user_task_lists//portfolio_memberships//goals/{goal_gid}/addSubgoal/tasks");
        itest("randoop", 64).given(userTaskList, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/user_task_lists/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("randoop", 64).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/tasks");
        itest("randoop", 64).given(userTaskList, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/user_task_lists/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        return new CollectionRequest<UserTaskList>(this, UserTaskList.class, path, "GET");
    }
}
