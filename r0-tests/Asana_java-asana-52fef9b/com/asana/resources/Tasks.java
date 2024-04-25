package com.asana.resources;

import com.asana.Client;
import com.asana.models.Job;
import com.asana.models.Task;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.TasksBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Tasks extends TasksBase {

    public Tasks(Client client) {
        super(client);
    }

    /**
     * Creating a new task is as easy as POSTing to the `/tasks` endpoint
     * with a data block containing the fields you'd like to set on the task.
     * Any unspecified fields will take on default values.
     *
     * Every task is required to be created in a specific workspace, and this
     * workspace cannot be changed once set. The workspace need not be set
     * explicitly if you specify `projects` or a `parent` task instead.
     *
     * `projects` can be a comma separated list of projects, or just a single
     * project the task should belong to.
     *
     * @return Request object
     */
    public ItemRequest<Task> create() {
        return new ItemRequest<Task>(this, Task.class, "/tasks", "POST");
    }

    /**
     * Creating a new task is as easy as POSTing to the `/tasks` endpoint
     * with a data block containing the fields you'd like to set on the task.
     * Any unspecified fields will take on default values.
     *
     * Every task is required to be created in a specific workspace, and this
     * workspace cannot be changed once set. The workspace need not be set
     * explicitly if you specify a `project` or a `parent` task instead.
     *
     * @param  workspace The workspace to create a task in.
     * @return Request object
     */
    public ItemRequest<Task> createInWorkspace(String workspace) {
        String path = String.format("/workspaces/%s/tasks", workspace);
        itest("randoop", 48).given(workspace, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("evosuite", 48).given(workspace, "h").checkEq(path, "/workspaces/h/tasks");
        itest("randoop", 48).given(workspace, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 48).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/tasks");
        itest("randoop", 48).given(workspace, "/tags/Payment Required").checkEq(path, "/workspaces//tags/Payment Required/tasks");
        itest("randoop", 48).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/tasks");
        itest("randoop", 48).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/tasks");
        itest("randoop", 48).given(workspace, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks");
        itest("randoop", 48).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden/tasks");
        itest("randoop", 48).given(workspace, "0").checkEq(path, "/workspaces/0/tasks");
        itest("randoop", 48).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/tasks");
        itest("evosuite", 48).given(workspace, null).checkEq(path, "/workspaces/null/tasks");
        itest("randoop", 48).given(workspace, "Payment Required").checkEq(path, "/workspaces/Payment Required/tasks");
        itest("randoop", 48).given(workspace, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tasks");
        itest("randoop", 48).given(workspace, "/custom_fields//enum_options/insert").checkEq(path, "/workspaces//custom_fields//enum_options/insert/tasks");
        itest("randoop", 48).given(workspace, "").checkEq(path, "/workspaces//tasks");
        itest("randoop", 48).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/tasks");
        itest("evosuite", 48).given(workspace, "DELETE").checkEq(path, "/workspaces/DELETE/tasks");
        itest("randoop", 48).given(workspace, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/tasks");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Returns the complete task record for a single task.
     *
     * @param  task The task to get.
     * @return Request object
     */
    public ItemRequest<Task> findById(String task) {
        String path = String.format("/tasks/%s", task);
        itest("randoop", 60).given(task, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections");
        itest("randoop", 60).given(task, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error");
        itest("evosuite", 60).given(task, "").checkEq(path, "/tasks/");
        itest("randoop", 60).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 60).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 60).given(task, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/tasks/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 60).given(task, "0").checkEq(path, "/tasks/0");
        itest("randoop", 60).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required");
        itest("randoop", 60).given(task, "10").checkEq(path, "/tasks/10");
        itest("randoop", 60).given(task, "/attachments/").checkEq(path, "/tasks//attachments/");
        itest("randoop", 60).given(task, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 60).given(task, "").checkEq(path, "/tasks/");
        itest("evosuite", 60).given(task, "adT3l@kk]jGDF").checkEq(path, "/tasks/adT3l@kk]jGDF");
        itest("evosuite", 60).given(task, "").checkEq(path, "/tasks/");
        itest("evosuite", 60).given(task, null).checkEq(path, "/tasks/null");
        itest("evosuite", 60).given(task, "z.s}PU^VkB").checkEq(path, "/tasks/z.s}PU^VkB");
        itest("randoop", 60).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 60).given(task, "/tasks//attachments/Not Found/addProject").checkEq(path, "/tasks//tasks//attachments/Not Found/addProject");
        itest("randoop", 60).given(task, "hi!").checkEq(path, "/tasks/hi!");
        itest("evosuite", 60).given(task, "sFt<zVEF{dp").checkEq(path, "/tasks/sFt<zVEF{dp");
        itest("randoop", 60).given(task, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals");
        itest("randoop", 60).given(task, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old");
        itest("randoop", 60).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced");
        itest("randoop", 60).given(task, "Server Error").checkEq(path, "/tasks/Server Error");
        itest("dev", 60).given(task, "1").checkEq(path, "/tasks/1");
        return new ItemRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * A specific, existing task can be updated by making a PUT request on the
     * URL for that task. Only the fields provided in the `data` block will be
     * updated; any unspecified fields will remain unchanged.
     *
     * When using this method, it is best to specify only those fields you wish
     * to change, or else you may overwrite changes made by another user since
     * you last retrieved the task.
     *
     * Returns the complete updated task record.
     *
     * @param  task The task to update.
     * @return Request object
     */
    public ItemRequest<Task> update(String task) {
        String path = String.format("/tasks/%s", task);
        itest("randoop", 80).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request");
        itest("randoop", 80).given(task, "/projects/Not Found/removeFollowers").checkEq(path, "/tasks//projects/Not Found/removeFollowers");
        itest("randoop", 80).given(task, "/tags").checkEq(path, "/tasks//tags");
        itest("randoop", 80).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden");
        itest("randoop", 80).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 80).given(task, "200").checkEq(path, "/tasks/200");
        itest("randoop", 80).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 80).given(task, "https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject");
        itest("randoop", 80).given(task, "POST").checkEq(path, "/tasks/POST");
        itest("randoop", 80).given(task, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found");
        itest("randoop", 80).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 80).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 80).given(task, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections");
        itest("randoop", 80).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 80).given(task, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 80).given(task, "").checkEq(path, "/tasks/");
        itest("randoop", 80).given(task, "0").checkEq(path, "/tasks/0");
        itest("evosuite", 80).given(task, "qMc+F").checkEq(path, "/tasks/qMc+F");
        itest("evosuite", 80).given(task, "").checkEq(path, "/tasks/");
        itest("randoop", 80).given(task, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal");
        itest("randoop", 80).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 80).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError");
        itest("randoop", 80).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 80).given(task, "/organizations//teams").checkEq(path, "/tasks//organizations//teams");
        itest("evosuite", 80).given(task, "https://app.asana.com/-/oauth_token").checkEq(path, "/tasks/https://app.asana.com/-/oauth_token");
        itest("randoop", 80).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required");
        itest("dev", 80).given(task, "1").checkEq(path, "/tasks/1");
        itest("evosuite", 80).given(task, "R!zK2:RdDiHJfD6 96").checkEq(path, "/tasks/R!zK2:RdDiHJfD6 96");
        itest("dev", 80).given(task, "1001").checkEq(path, "/tasks/1001");
        itest("randoop", 80).given(task, "2").checkEq(path, "/tasks/2");
        itest("randoop", 80).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        return new ItemRequest<Task>(this, Task.class, path, "PUT");
    }

    /**
     * A specific, existing task can be deleted by making a DELETE request on the
     * URL for that task. Deleted tasks go into the "trash" of the user making
     * the delete request. Tasks can be recovered from the trash within a period
     * of 30 days; afterward they are completely removed from the system.
     *
     * Returns an empty data record.
     *
     * @param  task The task to delete.
     * @return Request object
     */
    public ItemRequest<Task> delete(String task) {
        String path = String.format("/tasks/%s", task);
        itest("randoop", 97).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 97).given(task, ".5w2").checkEq(path, "/tasks/.5w2");
        itest("randoop", 97).given(task, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals");
        itest("randoop", 97).given(task, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found");
        itest("randoop", 97).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 97).given(task, "l15").checkEq(path, "/tasks/l15");
        itest("randoop", 97).given(task, "/attachments/").checkEq(path, "/tasks//attachments/");
        itest("randoop", 97).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 97).given(task, "/workspaces/").checkEq(path, "/tasks//workspaces/");
        itest("randoop", 97).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 97).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("evosuite", 97).given(task, "GET").checkEq(path, "/tasks/GET");
        itest("randoop", 97).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 97).given(task, "GET").checkEq(path, "/tasks/GET");
        itest("evosuite", 97).given(task, "/workspaces/%s/tasks/search").checkEq(path, "/tasks//workspaces/%s/tasks/search");
        itest("randoop", 97).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request");
        itest("randoop", 97).given(task, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required");
        itest("evosuite", 97).given(task, "w$zDDY").checkEq(path, "/tasks/w$zDDY");
        itest("dev", 97).given(task, "1").checkEq(path, "/tasks/1");
        itest("randoop", 97).given(task, "10").checkEq(path, "/tasks/10");
        itest("randoop", 97).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError");
        itest("randoop", 97).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 97).given(task, "").checkEq(path, "/tasks/");
        itest("randoop", 97).given(task, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert");
        itest("randoop", 97).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 97).given(task, "Not Found").checkEq(path, "/tasks/Not Found");
        itest("randoop", 97).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        return new ItemRequest<Task>(this, Task.class, path, "DELETE");
    }

    /**
     * Returns the compact task records for all tasks within the given project,
     * ordered by their priority within the project.
     *
     * @param  project The project in which to search for tasks.
     * @return Request object
     */
    public CollectionRequest<Task> findByProject(String project) {
        String path = String.format("/projects/%s/tasks", project);
        itest("randoop", 110).given(project, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject/tasks");
        itest("randoop", 110).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/tasks");
        itest("randoop", 110).given(project, "com.asana.errors.ServerError: Server Error").checkEq(path, "/projects/com.asana.errors.ServerError: Server Error/tasks");
        itest("randoop", 110).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/tasks");
        itest("evosuite", 110).given(project, "#PbPZdH").checkEq(path, "/projects/#PbPZdH/tasks");
        itest("randoop", 110).given(project, "100").checkEq(path, "/projects/100/tasks");
        itest("randoop", 110).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("randoop", 110).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks");
        itest("randoop", 110).given(project, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/tasks");
        itest("evosuite", 110).given(project, "M9_Py\u0002").checkEq(path, "/projects/M9_Py\u0002/tasks");
        itest("randoop", 110).given(project, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//portfolio_memberships//goals/{goal_gid}/addSubgoal/tasks");
        itest("randoop", 110).given(project, "/projects/Not Found/removeFollowers").checkEq(path, "/projects//projects/Not Found/removeFollowers/tasks");
        itest("randoop", 110).given(project, "10").checkEq(path, "/projects/10/tasks");
        itest("randoop", 110).given(project, "/organizations//teams").checkEq(path, "/projects//organizations//teams/tasks");
        itest("randoop", 110).given(project, "hi!").checkEq(path, "/projects/hi!/tasks");
        itest("dev", 110).given(project, "1").checkEq(path, "/projects/1/tasks");
        itest("evosuite", 110).given(project, "POST").checkEq(path, "/projects/POST/tasks");
        itest("randoop", 110).given(project, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/tasks");
        itest("randoop", 110).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/tasks");
        itest("randoop", 110).given(project, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("randoop", 110).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/tasks");
        itest("randoop", 110).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/tasks");
        itest("randoop", 110).given(project, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 110).given(project, "Server Error").checkEq(path, "/projects/Server Error/tasks");
        itest("evosuite", 110).given(project, "R!zK2:RdDiHJfD6 96").checkEq(path, "/projects/R!zK2:RdDiHJfD6 96/tasks");
        itest("randoop", 110).given(project, "GET").checkEq(path, "/projects/GET/tasks");
        itest("randoop", 110).given(project, "").checkEq(path, "/projects//tasks");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Returns the compact task records for all tasks with the given tag.
     *
     * @param  tag The tag in which to search for tasks.
     * @return Request object
     */
    public CollectionRequest<Task> findByTag(String tag) {
        String path = String.format("/tags/%s/tasks", tag);
        itest("randoop", 122).given(tag, "/portfolios/GET/removeMembers").checkEq(path, "/tags//portfolios/GET/removeMembers/tasks");
        itest("randoop", 122).given(tag, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: Server Error/tasks");
        itest("evosuite", 122).given(tag, "SM&5Slm\"k1l,1qM").checkEq(path, "/tags/SM&5Slm\"k1l,1qM/tasks");
        itest("randoop", 122).given(tag, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tags//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/tasks");
        itest("randoop", 122).given(tag, "").checkEq(path, "/tags//tasks");
        itest("randoop", 122).given(tag, "Forbidden").checkEq(path, "/tags/Forbidden/tasks");
        itest("randoop", 122).given(tag, "Payment Required").checkEq(path, "/tags/Payment Required/tasks");
        itest("evosuite", 122).given(tag, null).checkEq(path, "/tags/null/tasks");
        itest("randoop", 122).given(tag, "Server Error").checkEq(path, "/tags/Server Error/tasks");
        itest("randoop", 122).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/tasks");
        itest("randoop", 122).given(tag, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: /portfolios//tasks");
        itest("evosuite", 122).given(tag, "GET").checkEq(path, "/tags/GET/tasks");
        itest("evosuite", 122).given(tag, "M").checkEq(path, "/tags/M/tasks");
        itest("randoop", 122).given(tag, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tags//projects/Rate Limit Enforced/sections/tasks");
        itest("randoop", 122).given(tag, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/tags/com.asana.errors.InvalidRequestError: Invalid Request/tasks");
        itest("randoop", 122).given(tag, "NoAuthorizationError").checkEq(path, "/tags/NoAuthorizationError/tasks");
        itest("randoop", 122).given(tag, "Rate Limit Enforced").checkEq(path, "/tags/Rate Limit Enforced/tasks");
        itest("randoop", 122).given(tag, "Not Found").checkEq(path, "/tags/Not Found/tasks");
        itest("evosuite", 122).given(tag, "io.opencensus.trace.export.AutoValue_SampledSpanStore_PerSpanNameSummary").checkEq(path, "/tags/io.opencensus.trace.export.AutoValue_SampledSpanStore_PerSpanNameSummary/tasks");
        itest("randoop", 122).given(tag, "hi!").checkEq(path, "/tags/hi!/tasks");
        itest("randoop", 122).given(tag, "/goals/Sync token invalid or too old").checkEq(path, "/tags//goals/Sync token invalid or too old/tasks");
        itest("randoop", 122).given(tag, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: 200/tasks");
        itest("randoop", 122).given(tag, "200").checkEq(path, "/tags/200/tasks");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * <b>Board view only:</b> Returns the compact section records for all tasks within the given section.
     *
     * @param  section The section in which to search for tasks.
     * @return Request object
     */
    public CollectionRequest<Task> findBySection(String section) {
        String path = String.format("/sections/%s/tasks", section);
        itest("randoop", 134).given(section, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("evosuite", 134).given(section, "R!zK2:RdDiHfD6 96").checkEq(path, "/sections/R!zK2:RdDiHfD6 96/tasks");
        itest("randoop", 134).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//tasks");
        itest("randoop", 134).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("randoop", 134).given(section, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 134).given(section, "10").checkEq(path, "/sections/10/tasks");
        itest("randoop", 134).given(section, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/sections//portfolio_memberships//goals/{goal_gid}/addSubgoal/tasks");
        itest("randoop", 134).given(section, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/sections/com.asana.errors.RetryableAsanaError: /portfolios//tasks");
        itest("randoop", 134).given(section, "/tags/Payment Required").checkEq(path, "/sections//tags/Payment Required/tasks");
        itest("randoop", 134).given(section, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/tasks");
        itest("randoop", 134).given(section, "Invalid Request").checkEq(path, "/sections/Invalid Request/tasks");
        itest("randoop", 134).given(section, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/sections/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks");
        itest("randoop", 134).given(section, "POST").checkEq(path, "/sections/POST/tasks");
        itest("randoop", 134).given(section, "200").checkEq(path, "/sections/200/tasks");
        itest("evosuite", 134).given(section, "").checkEq(path, "/sections//tasks");
        itest("randoop", 134).given(section, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/sections/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("randoop", 134).given(section, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/sections//goals/{goal_gid}/addSubgoal/tasks");
        itest("randoop", 134).given(section, "/portfolios/").checkEq(path, "/sections//portfolios//tasks");
        itest("randoop", 134).given(section, "Payment Required").checkEq(path, "/sections/Payment Required/tasks");
        itest("randoop", 134).given(section, "Forbidden").checkEq(path, "/sections/Forbidden/tasks");
        itest("randoop", 134).given(section, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/sections//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/tasks");
        itest("evosuite", 134).given(section, "/tasks/{task_gid}/addProject").checkEq(path, "/sections//tasks/{task_gid}/addProject/tasks");
        itest("randoop", 134).given(section, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/sections//portfolios/Rate Limit Enforced/portfolio_memberships/tasks");
        itest("evosuite", 134).given(section, "YU3e@2-Za'V+#").checkEq(path, "/sections/YU3e@2-Za'V+#/tasks");
        itest("randoop", 134).given(section, "GET").checkEq(path, "/sections/GET/tasks");
        itest("randoop", 134).given(section, "NoAuthorizationError").checkEq(path, "/sections/NoAuthorizationError/tasks");
        itest("randoop", 134).given(section, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/sections//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
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
    public CollectionRequest<Task> findByUserTaskList(String userTaskList) {
        String path = String.format("/user_task_lists/%s/tasks", userTaskList);
        itest("randoop", 162).given(userTaskList, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/user_task_lists//goals/{goal_gid}/addSubgoal/tasks");
        itest("randoop", 162).given(userTaskList, "").checkEq(path, "/user_task_lists//tasks");
        itest("randoop", 162).given(userTaskList, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/user_task_lists/urn:ietf:wg:oauth:2.0:oob/tasks");
        itest("randoop", 162).given(userTaskList, "Rate Limit Enforced").checkEq(path, "/user_task_lists/Rate Limit Enforced/tasks");
        itest("randoop", 162).given(userTaskList, "/projects/Not Found/removeFollowers").checkEq(path, "/user_task_lists//projects/Not Found/removeFollowers/tasks");
        itest("evosuite", 162).given(userTaskList, "R!zK2:RdDiHJfD6 96").checkEq(path, "/user_task_lists/R!zK2:RdDiHJfD6 96/tasks");
        itest("randoop", 162).given(userTaskList, "200").checkEq(path, "/user_task_lists/200/tasks");
        itest("randoop", 162).given(userTaskList, "GET").checkEq(path, "/user_task_lists/GET/tasks");
        itest("randoop", 162).given(userTaskList, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/user_task_lists/com.asana.errors.RetryableAsanaError: 200/tasks");
        itest("randoop", 162).given(userTaskList, "NoAuthorizationError").checkEq(path, "/user_task_lists/NoAuthorizationError/tasks");
        itest("randoop", 162).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/tasks");
        itest("randoop", 162).given(userTaskList, "Not Found").checkEq(path, "/user_task_lists/Not Found/tasks");
        itest("randoop", 162).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/tasks");
        itest("evosuite", 162).given(userTaskList, "/workspaces/%s/tasks/search").checkEq(path, "/user_task_lists//workspaces/%s/tasks/search/tasks");
        itest("randoop", 162).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 162).given(userTaskList, "hi!").checkEq(path, "/user_task_lists/hi!/tasks");
        itest("evosuite", 162).given(userTaskList, "").checkEq(path, "/user_task_lists//tasks");
        itest("randoop", 162).given(userTaskList, "Server Error").checkEq(path, "/user_task_lists/Server Error/tasks");
        itest("randoop", 162).given(userTaskList, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/user_task_lists/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Returns the compact task records for some filtered set of tasks. Use one
     * or more of the parameters provided to filter the tasks returned. You must
     * specify a `project`, `section`, `tag`, or `user_task_list` if you do not
     * specify `assignee` and `workspace`.
     *
     * @return Request object
     */
    public CollectionRequest<Task> findAll() {
        return new CollectionRequest<Task>(this, Task.class, "/tasks", "GET");
    }

    /**
     * Returns the compact task records for all tasks with the given tag.
     * Tasks can have more than one tag at a time.
     *
     * @param  tag The tag to fetch tasks from.
     * @return Request object
     */
    public CollectionRequest<Task> getTasksWithTag(String tag) {
        String path = String.format("/tags/%s/tasks", tag);
        itest("evosuite", 188).given(tag, "/tasks/z.s}PU^VkB/stories").checkEq(path, "/tags//tasks/z.s}PU^VkB/stories/tasks");
        itest("evosuite", 188).given(tag, "Cv8Q").checkEq(path, "/tags/Cv8Q/tasks");
        itest("randoop", 188).given(tag, "Server Error").checkEq(path, "/tags/Server Error/tasks");
        itest("randoop", 188).given(tag, "100").checkEq(path, "/tags/100/tasks");
        itest("evosuite", 188).given(tag, "b$N\"_lO*`6B=mLc; ").checkEq(path, "/tags/b$N\"_lO*`6B=mLc; /tasks");
        itest("randoop", 188).given(tag, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/tags/com.asana.errors.InvalidRequestError: Invalid Request/tasks");
        itest("randoop", 188).given(tag, "200").checkEq(path, "/tags/200/tasks");
        itest("evosuite", 188).given(tag, "l15").checkEq(path, "/tags/l15/tasks");
        itest("evosuite", 188).given(tag, "").checkEq(path, "/tags//tasks");
        itest("randoop", 188).given(tag, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tags/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tasks");
        itest("randoop", 188).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 188).given(tag, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tags//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("randoop", 188).given(tag, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks");
        itest("randoop", 188).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/tasks");
        itest("randoop", 188).given(tag, "/custom_fields//enum_options/insert").checkEq(path, "/tags//custom_fields//enum_options/insert/tasks");
        itest("randoop", 188).given(tag, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tags//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks");
        itest("randoop", 188).given(tag, "/tags").checkEq(path, "/tags//tags/tasks");
        itest("randoop", 188).given(tag, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tags//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/tasks");
        itest("randoop", 188).given(tag, "NoAuthorizationError").checkEq(path, "/tags/NoAuthorizationError/tasks");
        itest("randoop", 188).given(tag, "Payment Required").checkEq(path, "/tags/Payment Required/tasks");
        itest("evosuite", 188).given(tag, "adT3l@kk]jGDF").checkEq(path, "/tags/adT3l@kk]jGDF/tasks");
        itest("randoop", 188).given(tag, "Forbidden").checkEq(path, "/tags/Forbidden/tasks");
        itest("randoop", 188).given(tag, "Not Found").checkEq(path, "/tags/Not Found/tasks");
        itest("randoop", 188).given(tag, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tags/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("randoop", 188).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks");
        itest("randoop", 188).given(tag, "GET").checkEq(path, "/tags/GET/tasks");
        itest("randoop", 188).given(tag, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tags//goals/{goal_gid}/addSubgoal/tasks");
        itest("randoop", 188).given(tag, "Rate Limit Enforced").checkEq(path, "/tags/Rate Limit Enforced/tasks");
        itest("evosuite", 188).given(tag, null).checkEq(path, "/tags/null/tasks");
        itest("randoop", 188).given(tag, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tags/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("randoop", 188).given(tag, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tags/com.asana.errors.PremiumOnlyError: Payment Required/tasks");
        itest("randoop", 188).given(tag, "").checkEq(path, "/tags//tasks");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * The search endpoint allows you to build complex queries to find and fetch exactly the data you need from Asana. For a more comprehensive description of all the query parameters and limitations of this endpoint, see our [long-form documentation](/developers/documentation/getting-started/search-api) for this feature.
     *
     * @param  workspace The workspace or organization in which to search for tasks.
     * @return Request object
     */
    public CollectionRequest<Task> searchInWorkspace(String workspace) {
        String path = String.format("/workspaces/%s/tasks/search", workspace);
        itest("randoop", 200).given(workspace, "GET").checkEq(path, "/workspaces/GET/tasks/search");
        itest("randoop", 200).given(workspace, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Server Error/tasks/search");
        itest("randoop", 200).given(workspace, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/tasks/search");
        itest("randoop", 200).given(workspace, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tasks/search");
        itest("randoop", 200).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks/search");
        itest("evosuite", 200).given(workspace, "$").checkEq(path, "/workspaces/$/tasks/search");
        itest("randoop", 200).given(workspace, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks/search");
        itest("randoop", 200).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/tasks/search");
        itest("randoop", 200).given(workspace, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks/search");
        itest("randoop", 200).given(workspace, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/tasks/search");
        itest("randoop", 200).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/tasks/search");
        itest("randoop", 200).given(workspace, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks/search");
        itest("randoop", 200).given(workspace, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: 200/tasks/search");
        itest("evosuite", 200).given(workspace, "R!zK2:RdDiHJfD6 96").checkEq(path, "/workspaces/R!zK2:RdDiHJfD6 96/tasks/search");
        itest("randoop", 200).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks/search");
        itest("randoop", 200).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/tasks/search");
        itest("randoop", 200).given(workspace, "10").checkEq(path, "/workspaces/10/tasks/search");
        itest("randoop", 200).given(workspace, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspaces/com.asana.errors.PremiumOnlyError: Payment Required/tasks/search");
        itest("evosuite", 200).given(workspace, "").checkEq(path, "/workspaces//tasks/search");
        itest("randoop", 200).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/tasks/search");
        itest("evosuite", 200).given(workspace, "JJ~~092~G|\u0006Yg6,J").checkEq(path, "/workspaces/JJ~~092~G|\u0006Yg6,J/tasks/search");
        itest("randoop", 200).given(workspace, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//stories//goals/{goal_gid}/addSubgoal/tasks/search");
        itest("randoop", 200).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks/search");
        itest("randoop", 200).given(workspace, "/tags").checkEq(path, "/workspaces//tags/tasks/search");
        itest("randoop", 200).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/tasks/search");
        itest("randoop", 200).given(workspace, "200").checkEq(path, "/workspaces/200/tasks/search");
        itest("randoop", 200).given(workspace, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks/search");
        itest("randoop", 200).given(workspace, "").checkEq(path, "/workspaces//tasks/search");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Returns the compact representations of all of the dependencies of a task.
     *
     * @param  task The task to get dependencies on.
     * @return Request object
     */
    public ItemRequest<Task> dependencies(String task) {
        String path = String.format("/tasks/%s/dependencies", task);
        itest("randoop", 212).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/dependencies");
        itest("randoop", 212).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/dependencies");
        itest("evosuite", 212).given(task, "88eoP&g%0>_#/>w").checkEq(path, "/tasks/88eoP&g%0>_#/>w/dependencies");
        itest("randoop", 212).given(task, "").checkEq(path, "/tasks//dependencies");
        itest("randoop", 212).given(task, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/dependencies");
        itest("randoop", 212).given(task, "Not Found").checkEq(path, "/tasks/Not Found/dependencies");
        itest("randoop", 212).given(task, "Server Error").checkEq(path, "/tasks/Server Error/dependencies");
        itest("randoop", 212).given(task, "POST").checkEq(path, "/tasks/POST/dependencies");
        itest("randoop", 212).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/dependencies");
        itest("randoop", 212).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/dependencies");
        itest("evosuite", 212).given(task, "4{uxSe^A=\"$B$s//").checkEq(path, "/tasks/4{uxSe^A=\"$B$s///dependencies");
        itest("randoop", 212).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/dependencies");
        itest("randoop", 212).given(task, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/dependencies");
        itest("evosuite", 212).given(task, "GET").checkEq(path, "/tasks/GET/dependencies");
        itest("randoop", 212).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/dependencies");
        itest("randoop", 212).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/dependencies");
        itest("randoop", 212).given(task, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/dependencies");
        itest("randoop", 212).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request/dependencies");
        itest("evosuite", 212).given(task, "R!zK2:RdDiHJfD6 96").checkEq(path, "/tasks/R!zK2:RdDiHJfD6 96/dependencies");
        itest("evosuite", 212).given(task, "( d!fJ_l2Y\"'k").checkEq(path, "/tasks/( d!fJ_l2Y\"'k/dependencies");
        itest("randoop", 212).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/dependencies");
        itest("randoop", 212).given(task, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/dependencies");
        return new ItemRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Returns the compact representations of all of the dependents of a task.
     *
     * @param  task The task to get dependents on.
     * @return Request object
     */
    public ItemRequest<Task> dependents(String task) {
        String path = String.format("/tasks/%s/dependents", task);
        itest("randoop", 224).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/dependents");
        itest("randoop", 224).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/dependents");
        itest("randoop", 224).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/dependents");
        itest("randoop", 224).given(task, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/dependents");
        itest("randoop", 224).given(task, "").checkEq(path, "/tasks//dependents");
        itest("randoop", 224).given(task, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/dependents");
        itest("randoop", 224).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/dependents");
        itest("evosuite", 224).given(task, "INCR").checkEq(path, "/tasks/INCR/dependents");
        itest("evosuite", 224).given(task, ":;{h=&'Mr").checkEq(path, "/tasks/:;{h=&'Mr/dependents");
        itest("randoop", 224).given(task, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/dependents");
        itest("randoop", 224).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/dependents");
        itest("randoop", 224).given(task, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/dependents");
        itest("randoop", 224).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/dependents");
        itest("randoop", 224).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/dependents");
        itest("evosuite", 224).given(task, "/workspaces/%s/tasks/search").checkEq(path, "/tasks//workspaces/%s/tasks/search/dependents");
        itest("evosuite", 224).given(task, null).checkEq(path, "/tasks/null/dependents");
        itest("randoop", 224).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/dependents");
        itest("randoop", 224).given(task, "GET").checkEq(path, "/tasks/GET/dependents");
        itest("evosuite", 224).given(task, "GET").checkEq(path, "/tasks/GET/dependents");
        itest("randoop", 224).given(task, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/dependents");
        itest("randoop", 224).given(task, "/attachments/").checkEq(path, "/tasks//attachments//dependents");
        itest("evosuite", 224).given(task, "/user_task_lists/%s/tasks").checkEq(path, "/tasks//user_task_lists/%s/tasks/dependents");
        itest("randoop", 224).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/dependents");
        itest("evosuite", 224).given(task, "/tasks//subtasks").checkEq(path, "/tasks//tasks//subtasks/dependents");
        itest("randoop", 224).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/dependents");
        itest("randoop", 224).given(task, "Not Found").checkEq(path, "/tasks/Not Found/dependents");
        itest("randoop", 224).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/dependents");
        return new ItemRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Marks a set of tasks as dependencies of this task, if they are not
     * already dependencies. *A task can have at most 15 dependencies.*
     *
     * @param  task The task to add dependencies to.
     * @return Request object
     */
    public ItemRequest<Task> addDependencies(String task) {
        String path = String.format("/tasks/%s/addDependencies", task);
        itest("randoop", 237).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addDependencies");
        itest("randoop", 237).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addDependencies");
        itest("evosuite", 237).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/addDependencies");
        itest("randoop", 237).given(task, "hi!").checkEq(path, "/tasks/hi!/addDependencies");
        itest("randoop", 237).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addDependencies");
        itest("evosuite", 237).given(task, "wD1X?2`N'56}").checkEq(path, "/tasks/wD1X?2`N'56}/addDependencies");
        itest("randoop", 237).given(task, "").checkEq(path, "/tasks//addDependencies");
        itest("randoop", 237).given(task, "10").checkEq(path, "/tasks/10/addDependencies");
        itest("randoop", 237).given(task, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addDependencies");
        itest("randoop", 237).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/addDependencies");
        itest("randoop", 237).given(task, "0").checkEq(path, "/tasks/0/addDependencies");
        itest("randoop", 237).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addDependencies");
        itest("randoop", 237).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addDependencies");
        itest("randoop", 237).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/addDependencies");
        itest("randoop", 237).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request/addDependencies");
        itest("randoop", 237).given(task, "/tags").checkEq(path, "/tasks//tags/addDependencies");
        itest("randoop", 237).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addDependencies");
        itest("evosuite", 237).given(task, "/tasks/http.method/addProject").checkEq(path, "/tasks//tasks/http.method/addProject/addDependencies");
        itest("randoop", 237).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/addDependencies");
        itest("randoop", 237).given(task, "Not Found").checkEq(path, "/tasks/Not Found/addDependencies");
        itest("randoop", 237).given(task, "POST").checkEq(path, "/tasks/POST/addDependencies");
        itest("evosuite", 237).given(task, "").checkEq(path, "/tasks//addDependencies");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Marks a set of tasks as dependents of this task, if they are not already
     * dependents. *A task can have at most 30 dependents.*
     *
     * @param  task The task to add dependents to.
     * @return Request object
     */
    public ItemRequest<Task> addDependents(String task) {
        String path = String.format("/tasks/%s/addDependents", task);
        itest("randoop", 250).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/addDependents");
        itest("evosuite", 250).given(task, "R!zK2RDi1Jf. 96").checkEq(path, "/tasks/R!zK2RDi1Jf. 96/addDependents");
        itest("randoop", 250).given(task, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/addDependents");
        itest("randoop", 250).given(task, "10").checkEq(path, "/tasks/10/addDependents");
        itest("randoop", 250).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/addDependents");
        itest("randoop", 250).given(task, "hi!").checkEq(path, "/tasks/hi!/addDependents");
        itest("randoop", 250).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addDependents");
        itest("randoop", 250).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addDependents");
        itest("randoop", 250).given(task, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/addDependents");
        itest("randoop", 250).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addDependents");
        itest("evosuite", 250).given(task, "").checkEq(path, "/tasks//addDependents");
        itest("randoop", 250).given(task, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert/addDependents");
        itest("randoop", 250).given(task, "GET").checkEq(path, "/tasks/GET/addDependents");
        itest("randoop", 250).given(task, "https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject/addDependents");
        itest("randoop", 250).given(task, "2").checkEq(path, "/tasks/2/addDependents");
        itest("randoop", 250).given(task, "Not Found").checkEq(path, "/tasks/Not Found/addDependents");
        itest("randoop", 250).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addDependents");
        itest("randoop", 250).given(task, "").checkEq(path, "/tasks//addDependents");
        itest("evosuite", 250).given(task, "GET").checkEq(path, "/tasks/GET/addDependents");
        itest("randoop", 250).given(task, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/addDependents");
        itest("randoop", 250).given(task, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addDependents");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Unlinks a set of dependencies from this task.
     *
     * @param  task The task to remove dependencies from.
     * @return Request object
     */
    public ItemRequest<Task> removeDependencies(String task) {
        String path = String.format("/tasks/%s/removeDependencies", task);
        itest("randoop", 262).given(task, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeDependencies");
        itest("evosuite", 262).given(task, "Vi*kVE.").checkEq(path, "/tasks/Vi*kVE./removeDependencies");
        itest("randoop", 262).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeDependencies");
        itest("randoop", 262).given(task, "0").checkEq(path, "/tasks/0/removeDependencies");
        itest("randoop", 262).given(task, "200").checkEq(path, "/tasks/200/removeDependencies");
        itest("randoop", 262).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/removeDependencies");
        itest("randoop", 262).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/removeDependencies");
        itest("randoop", 262).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/removeDependencies");
        itest("evosuite", 262).given(task, null).checkEq(path, "/tasks/null/removeDependencies");
        itest("evosuite", 262).given(task, ".Rj;6R\"x b,dv5d(x{2").checkEq(path, "/tasks/.Rj;6R\"x b,dv5d(x{2/removeDependencies");
        itest("randoop", 262).given(task, "/tags").checkEq(path, "/tasks//tags/removeDependencies");
        itest("randoop", 262).given(task, "GET").checkEq(path, "/tasks/GET/removeDependencies");
        itest("randoop", 262).given(task, "10").checkEq(path, "/tasks/10/removeDependencies");
        itest("randoop", 262).given(task, "hi!").checkEq(path, "/tasks/hi!/removeDependencies");
        itest("evosuite", 262).given(task, "").checkEq(path, "/tasks//removeDependencies");
        itest("randoop", 262).given(task, "").checkEq(path, "/tasks//removeDependencies");
        itest("randoop", 262).given(task, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/removeDependencies");
        itest("randoop", 262).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeDependencies");
        itest("evosuite", 262).given(task, "tTB<@h*P[Vtna").checkEq(path, "/tasks/tTB<@h*P[Vtna/removeDependencies");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Unlinks a set of dependents from this task.
     *
     * @param  task The task to remove dependents from.
     * @return Request object
     */
    public ItemRequest<Task> removeDependents(String task) {
        String path = String.format("/tasks/%s/removeDependents", task);
        itest("randoop", 274).given(task, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/removeDependents");
        itest("randoop", 274).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeDependents");
        itest("randoop", 274).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/removeDependents");
        itest("randoop", 274).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/removeDependents");
        itest("evosuite", 274).given(task, "/tasks/s({+vD/addTag").checkEq(path, "/tasks//tasks/s({+vD/addTag/removeDependents");
        itest("evosuite", 274).given(task, "fqhwtHad83").checkEq(path, "/tasks/fqhwtHad83/removeDependents");
        itest("randoop", 274).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/removeDependents");
        itest("randoop", 274).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/removeDependents");
        itest("evosuite", 274).given(task, "R!zK2:RdDiHJfD6 96").checkEq(path, "/tasks/R!zK2:RdDiHJfD6 96/removeDependents");
        itest("randoop", 274).given(task, "200").checkEq(path, "/tasks/200/removeDependents");
        itest("randoop", 274).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeDependents");
        itest("randoop", 274).given(task, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeDependents");
        itest("randoop", 274).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/removeDependents");
        itest("randoop", 274).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces//removeDependents");
        itest("randoop", 274).given(task, "Not Found").checkEq(path, "/tasks/Not Found/removeDependents");
        itest("evosuite", 274).given(task, "l$AQ").checkEq(path, "/tasks/l$AQ/removeDependents");
        itest("randoop", 274).given(task, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/removeDependents");
        itest("randoop", 274).given(task, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/removeDependents");
        itest("randoop", 274).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/removeDependents");
        itest("evosuite", 274).given(task, "/sections//tasks").checkEq(path, "/tasks//sections//tasks/removeDependents");
        itest("randoop", 274).given(task, "0").checkEq(path, "/tasks/0/removeDependents");
        itest("randoop", 274).given(task, "POST").checkEq(path, "/tasks/POST/removeDependents");
        itest("randoop", 274).given(task, "").checkEq(path, "/tasks//removeDependents");
        itest("randoop", 274).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/removeDependents");
        itest("randoop", 274).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//removeDependents");
        itest("randoop", 274).given(task, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/removeDependents");
        itest("evosuite", 274).given(task, "GET").checkEq(path, "/tasks/GET/removeDependents");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Adds each of the specified followers to the task, if they are not already
     * following. Returns the complete, updated record for the affected task.
     *
     * @param  task The task to add followers to.
     * @return Request object
     */
    public ItemRequest<Task> addFollowers(String task) {
        String path = String.format("/tasks/%s/addFollowers", task);
        itest("randoop", 287).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addFollowers");
        itest("randoop", 287).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/addFollowers");
        itest("randoop", 287).given(task, "Not Found").checkEq(path, "/tasks/Not Found/addFollowers");
        itest("randoop", 287).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addFollowers");
        itest("randoop", 287).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request/addFollowers");
        itest("randoop", 287).given(task, "/tags").checkEq(path, "/tasks//tags/addFollowers");
        itest("randoop", 287).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addFollowers");
        itest("randoop", 287).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addFollowers");
        itest("randoop", 287).given(task, "").checkEq(path, "/tasks//addFollowers");
        itest("evosuite", 287).given(task, "/user_task_lists//tasks//subtasks/tasks/insert").checkEq(path, "/tasks//user_task_lists//tasks//subtasks/tasks/insert/addFollowers");
        itest("randoop", 287).given(task, "100").checkEq(path, "/tasks/100/addFollowers");
        itest("randoop", 287).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addFollowers");
        itest("randoop", 287).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addFollowers");
        itest("randoop", 287).given(task, "200").checkEq(path, "/tasks/200/addFollowers");
        itest("randoop", 287).given(task, "hi!").checkEq(path, "/tasks/hi!/addFollowers");
        itest("evosuite", 287).given(task, "R!zK2RDi1Jf. 96").checkEq(path, "/tasks/R!zK2RDi1Jf. 96/addFollowers");
        itest("evosuite", 287).given(task, "s({+vD").checkEq(path, "/tasks/s({+vD/addFollowers");
        itest("randoop", 287).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addFollowers");
        itest("evosuite", 287).given(task, "/tasks").checkEq(path, "/tasks//tasks/addFollowers");
        itest("randoop", 287).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addFollowers");
        itest("evosuite", 287).given(task, ")KNnsUWl_2wct").checkEq(path, "/tasks/)KNnsUWl_2wct/addFollowers");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Removes each of the specified followers from the task if they are
     * following. Returns the complete, updated record for the affected task.
     *
     * @param  task The task to remove followers from.
     * @return Request object
     */
    public ItemRequest<Task> removeFollowers(String task) {
        String path = String.format("/tasks/%s/removeFollowers", task);
        itest("randoop", 300).given(task, "/portfolios/").checkEq(path, "/tasks//portfolios//removeFollowers");
        itest("randoop", 300).given(task, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/removeFollowers");
        itest("randoop", 300).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/removeFollowers");
        itest("randoop", 300).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeFollowers");
        itest("evosuite", 300).given(task, "xO!52,?gqGtHSdg:_-").checkEq(path, "/tasks/xO!52,?gqGtHSdg:_-/removeFollowers");
        itest("randoop", 300).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeFollowers");
        itest("randoop", 300).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/removeFollowers");
        itest("randoop", 300).given(task, "/workspaces/").checkEq(path, "/tasks//workspaces//removeFollowers");
        itest("randoop", 300).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeFollowers");
        itest("randoop", 300).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeFollowers");
        itest("randoop", 300).given(task, "").checkEq(path, "/tasks//removeFollowers");
        itest("randoop", 300).given(task, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeFollowers");
        itest("evosuite", 300).given(task, "").checkEq(path, "/tasks//removeFollowers");
        itest("randoop", 300).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeFollowers");
        itest("randoop", 300).given(task, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/removeFollowers");
        itest("evosuite", 300).given(task, "l").checkEq(path, "/tasks/l/removeFollowers");
        itest("randoop", 300).given(task, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/removeFollowers");
        itest("randoop", 300).given(task, "Not Found").checkEq(path, "/tasks/Not Found/removeFollowers");
        itest("randoop", 300).given(task, "0").checkEq(path, "/tasks/0/removeFollowers");
        itest("evosuite", 300).given(task, "/user_task_lists//tasks//subtasks/tasks/insert").checkEq(path, "/tasks//user_task_lists//tasks//subtasks/tasks/insert/removeFollowers");
        itest("randoop", 300).given(task, "200").checkEq(path, "/tasks/200/removeFollowers");
        itest("randoop", 300).given(task, "/portfolios/GET/removeMembers").checkEq(path, "/tasks//portfolios/GET/removeMembers/removeFollowers");
        itest("randoop", 300).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/removeFollowers");
        itest("randoop", 300).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/removeFollowers");
        itest("randoop", 300).given(task, "hi!").checkEq(path, "/tasks/hi!/removeFollowers");
        itest("randoop", 300).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/removeFollowers");
        itest("randoop", 300).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/removeFollowers");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Returns a compact representation of all of the projects the task is in.
     *
     * @param  task The task to get projects on.
     * @return Request object
     */
    public CollectionRequest<Task> projects(String task) {
        String path = String.format("/tasks/%s/projects", task);
        itest("randoop", 312).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/projects");
        itest("randoop", 312).given(task, "GET").checkEq(path, "/tasks/GET/projects");
        itest("randoop", 312).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 312).given(task, "/workspaces/").checkEq(path, "/tasks//workspaces//projects");
        itest("randoop", 312).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 312).given(task, "hi!").checkEq(path, "/tasks/hi!/projects");
        itest("evosuite", 312).given(task, "GET").checkEq(path, "/tasks/GET/projects");
        itest("randoop", 312).given(task, "/tasks//attachments/Not Found/addProject").checkEq(path, "/tasks//tasks//attachments/Not Found/addProject/projects");
        itest("randoop", 312).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("evosuite", 312).given(task, "").checkEq(path, "/tasks//projects");
        itest("evosuite", 312).given(task, "BuC").checkEq(path, "/tasks/BuC/projects");
        itest("randoop", 312).given(task, "/projects/Not Found/removeFollowers").checkEq(path, "/tasks//projects/Not Found/removeFollowers/projects");
        itest("randoop", 312).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/projects");
        itest("evosuite", 312).given(task, null).checkEq(path, "/tasks/null/projects");
        itest("randoop", 312).given(task, "").checkEq(path, "/tasks//projects");
        itest("evosuite", 312).given(task, "|B9vjn").checkEq(path, "/tasks/|B9vjn/projects");
        itest("randoop", 312).given(task, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/projects");
        itest("evosuite", 312).given(task, "$O(Kr|g-GY").checkEq(path, "/tasks/$O(Kr|g-GY/projects");
        itest("randoop", 312).given(task, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: 200/projects");
        itest("randoop", 312).given(task, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/projects");
        itest("randoop", 312).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/projects");
        itest("randoop", 312).given(task, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/projects");
        itest("randoop", 312).given(task, "0").checkEq(path, "/tasks/0/projects");
        itest("randoop", 312).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/projects");
        itest("randoop", 312).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/projects");
        itest("randoop", 312).given(task, "Not Found").checkEq(path, "/tasks/Not Found/projects");
        itest("evosuite", 312).given(task, "POST").checkEq(path, "/tasks/POST/projects");
        itest("randoop", 312).given(task, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/projects");
        itest("randoop", 312).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//projects");
        itest("randoop", 312).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces//projects");
        itest("randoop", 312).given(task, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/projects");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Adds the task to the specified project, in the optional location
     * specified. If no location arguments are given, the task will be added to
     * the end of the project.
     *
     * `addProject` can also be used to reorder a task within a project or section that
     * already contains it.
     *
     * At most one of `insert_before`, `insert_after`, or `section` should be
     * specified. Inserting into a section in an non-order-dependent way can be
     * done by specifying `section`, otherwise, to insert within a section in a
     * particular place, specify `insert_before` or `insert_after` and a task
     * within the section to anchor the position of this task.
     *
     * Returns an empty data block.
     *
     * @param  task The task to add to a project.
     * @return Request object
     */
    public ItemRequest<Task> addProject(String task) {
        String path = String.format("/tasks/%s/addProject", task);
        itest("randoop", 337).given(task, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/addProject");
        itest("randoop", 337).given(task, "POST").checkEq(path, "/tasks/POST/addProject");
        itest("evosuite", 337).given(task, null).checkEq(path, "/tasks/null/addProject");
        itest("evosuite", 337).given(task, "https://app.asana.com/-/oauth_token").checkEq(path, "/tasks/https://app.asana.com/-/oauth_token/addProject");
        itest("randoop", 337).given(task, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: /portfolios//addProject");
        itest("randoop", 337).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/addProject");
        itest("randoop", 337).given(task, "/attachments/").checkEq(path, "/tasks//attachments//addProject");
        itest("randoop", 337).given(task, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/addProject");
        itest("randoop", 337).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addProject");
        itest("randoop", 337).given(task, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/addProject");
        itest("evosuite", 337).given(task, "http.method").checkEq(path, "/tasks/http.method/addProject");
        itest("randoop", 337).given(task, "").checkEq(path, "/tasks//addProject");
        itest("randoop", 337).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/addProject");
        itest("randoop", 337).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/addProject");
        itest("randoop", 337).given(task, "/tasks/200/addProject").checkEq(path, "/tasks//tasks/200/addProject/addProject");
        itest("randoop", 337).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addProject");
        itest("randoop", 337).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addProject");
        itest("evosuite", 337).given(task, "<@*mT]").checkEq(path, "/tasks/<@*mT]/addProject");
        itest("randoop", 337).given(task, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/addProject");
        itest("randoop", 337).given(task, "200").checkEq(path, "/tasks/200/addProject");
        itest("randoop", 337).given(task, "0").checkEq(path, "/tasks/0/addProject");
        itest("evosuite", 337).given(task, "/tasks/%s/addDependents").checkEq(path, "/tasks//tasks/%s/addDependents/addProject");
        itest("randoop", 337).given(task, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/addProject");
        itest("randoop", 337).given(task, "10").checkEq(path, "/tasks/10/addProject");
        itest("evosuite", 337).given(task, "l15").checkEq(path, "/tasks/l15/addProject");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Removes the task from the specified project. The task will still exist
     * in the system, but it will not be in the project anymore.
     *
     * Returns an empty data block.
     *
     * @param  task The task to remove from a project.
     * @return Request object
     */
    public ItemRequest<Task> removeProject(String task) {
        String path = String.format("/tasks/%s/removeProject", task);
        itest("randoop", 352).given(task, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/removeProject");
        itest("randoop", 352).given(task, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert/removeProject");
        itest("randoop", 352).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/removeProject");
        itest("evosuite", 352).given(task, "/tasks/{task_gid}/projects").checkEq(path, "/tasks//tasks/{task_gid}/projects/removeProject");
        itest("randoop", 352).given(task, "10").checkEq(path, "/tasks/10/removeProject");
        itest("randoop", 352).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeProject");
        itest("evosuite", 352).given(task, "R!zK2:RdDiHJfD6 96").checkEq(path, "/tasks/R!zK2:RdDiHJfD6 96/removeProject");
        itest("randoop", 352).given(task, "200").checkEq(path, "/tasks/200/removeProject");
        itest("randoop", 352).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/removeProject");
        itest("randoop", 352).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/removeProject");
        itest("evosuite", 352).given(task, "").checkEq(path, "/tasks//removeProject");
        itest("randoop", 352).given(task, "").checkEq(path, "/tasks//removeProject");
        itest("randoop", 352).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/removeProject");
        itest("randoop", 352).given(task, "POST").checkEq(path, "/tasks/POST/removeProject");
        itest("randoop", 352).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeProject");
        itest("randoop", 352).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//removeProject");
        itest("randoop", 352).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeProject");
        itest("randoop", 352).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeProject");
        itest("randoop", 352).given(task, "Not Found").checkEq(path, "/tasks/Not Found/removeProject");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Returns a compact representation of all of the tags the task has.
     *
     * @param  task The task to get tags on.
     * @return Request object
     */
    public CollectionRequest<Task> tags(String task) {
        String path = String.format("/tasks/%s/tags", task);
        itest("randoop", 364).given(task, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/tags");
        itest("randoop", 364).given(task, "POST").checkEq(path, "/tasks/POST/tags");
        itest("evosuite", 364).given(task, "x").checkEq(path, "/tasks/x/tags");
        itest("randoop", 364).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces//tags");
        itest("randoop", 364).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tags");
        itest("randoop", 364).given(task, "200").checkEq(path, "/tasks/200/tags");
        itest("evosuite", 364).given(task, "RM").checkEq(path, "/tasks/RM/tags");
        itest("randoop", 364).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/tags");
        itest("randoop", 364).given(task, "100").checkEq(path, "/tasks/100/tags");
        itest("randoop", 364).given(task, "/projects/Not Found/removeFollowers").checkEq(path, "/tasks//projects/Not Found/removeFollowers/tags");
        itest("randoop", 364).given(task, "10").checkEq(path, "/tasks/10/tags");
        itest("evosuite", 364).given(task, null).checkEq(path, "/tasks/null/tags");
        itest("randoop", 364).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/tags");
        itest("randoop", 364).given(task, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/tags");
        itest("randoop", 364).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tags");
        itest("randoop", 364).given(task, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/tags");
        itest("randoop", 364).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/tags");
        itest("randoop", 364).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request/tags");
        itest("randoop", 364).given(task, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/tags");
        itest("evosuite", 364).given(task, "GET").checkEq(path, "/tasks/GET/tags");
        itest("randoop", 364).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/tags");
        itest("randoop", 364).given(task, "").checkEq(path, "/tasks//tags");
        itest("randoop", 364).given(task, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/tags");
        itest("randoop", 364).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/tags");
        itest("randoop", 364).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/tags");
        itest("randoop", 364).given(task, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tags");
        itest("randoop", 364).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//tags");
        itest("randoop", 364).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tags");
        itest("randoop", 364).given(task, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/tags");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Adds a tag to a task. Returns an empty data block.
     *
     * @param  task The task to add a tag to.
     * @return Request object
     */
    public ItemRequest<Task> addTag(String task) {
        String path = String.format("/tasks/%s/addTag", task);
        itest("randoop", 376).given(task, "").checkEq(path, "/tasks//addTag");
        itest("randoop", 376).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addTag");
        itest("randoop", 376).given(task, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert/addTag");
        itest("evosuite", 376).given(task, "s({+vD").checkEq(path, "/tasks/s({+vD/addTag");
        itest("evosuite", 376).given(task, "").checkEq(path, "/tasks//addTag");
        itest("randoop", 376).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/addTag");
        itest("randoop", 376).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addTag");
        itest("randoop", 376).given(task, "/tasks//attachments/Not Found/addProject").checkEq(path, "/tasks//tasks//attachments/Not Found/addProject/addTag");
        itest("evosuite", 376).given(task, "/tasks/%s/removeDependents").checkEq(path, "/tasks//tasks/%s/removeDependents/addTag");
        itest("randoop", 376).given(task, "hi!").checkEq(path, "/tasks/hi!/addTag");
        itest("randoop", 376).given(task, "GET").checkEq(path, "/tasks/GET/addTag");
        itest("randoop", 376).given(task, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/addTag");
        itest("randoop", 376).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addTag");
        itest("randoop", 376).given(task, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/addTag");
        itest("randoop", 376).given(task, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/addTag");
        itest("randoop", 376).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/addTag");
        itest("randoop", 376).given(task, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/addTag");
        itest("randoop", 376).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addTag");
        itest("randoop", 376).given(task, "100").checkEq(path, "/tasks/100/addTag");
        itest("evosuite", 376).given(task, "").checkEq(path, "/tasks//addTag");
        itest("evosuite", 376).given(task, "/tasks/%s/addTag").checkEq(path, "/tasks//tasks/%s/addTag/addTag");
        itest("randoop", 376).given(task, "200").checkEq(path, "/tasks/200/addTag");
        itest("randoop", 376).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/addTag");
        itest("randoop", 376).given(task, "Not Found").checkEq(path, "/tasks/Not Found/addTag");
        itest("randoop", 376).given(task, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/addTag");
        itest("randoop", 376).given(task, "/portfolios/").checkEq(path, "/tasks//portfolios//addTag");
        itest("randoop", 376).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addTag");
        itest("randoop", 376).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addTag");
        itest("randoop", 376).given(task, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/addTag");
        itest("randoop", 376).given(task, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addTag");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Removes a tag from the task. Returns an empty data block.
     *
     * @param  task The task to remove a tag from.
     * @return Request object
     */
    public ItemRequest<Task> removeTag(String task) {
        String path = String.format("/tasks/%s/removeTag", task);
        itest("randoop", 388).given(task, "Server Error").checkEq(path, "/tasks/Server Error/removeTag");
        itest("randoop", 388).given(task, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeTag");
        itest("randoop", 388).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/removeTag");
        itest("randoop", 388).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeTag");
        itest("randoop", 388).given(task, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/removeTag");
        itest("evosuite", 388).given(task, "io.opencensus.trace.export.AutoValue_SampledSpanStore_PerSpanNameSummary").checkEq(path, "/tasks/io.opencensus.trace.export.AutoValue_SampledSpanStore_PerSpanNameSummary/removeTag");
        itest("randoop", 388).given(task, "").checkEq(path, "/tasks//removeTag");
        itest("evosuite", 388).given(task, "/tasks//tasks/http.method/addProject/addDependencies").checkEq(path, "/tasks//tasks//tasks/http.method/addProject/addDependencies/removeTag");
        itest("randoop", 388).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeTag");
        itest("evosuite", 388).given(task, "").checkEq(path, "/tasks//removeTag");
        itest("randoop", 388).given(task, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/removeTag");
        itest("randoop", 388).given(task, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/removeTag");
        itest("randoop", 388).given(task, "10").checkEq(path, "/tasks/10/removeTag");
        itest("randoop", 388).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeTag");
        itest("randoop", 388).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/removeTag");
        itest("randoop", 388).given(task, "Not Found").checkEq(path, "/tasks/Not Found/removeTag");
        itest("randoop", 388).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeTag");
        itest("randoop", 388).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/removeTag");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Returns a compact representation of all of the subtasks of a task.
     *
     * @param  task The task to get the subtasks of.
     * @return Request object
     */
    public CollectionRequest<Task> subtasks(String task) {
        String path = String.format("/tasks/%s/subtasks", task);
        itest("randoop", 400).given(task, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/subtasks");
        itest("randoop", 400).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/subtasks");
        itest("randoop", 400).given(task, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/subtasks");
        itest("randoop", 400).given(task, "2").checkEq(path, "/tasks/2/subtasks");
        itest("randoop", 400).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/subtasks");
        itest("randoop", 400).given(task, "").checkEq(path, "/tasks//subtasks");
        itest("evosuite", 400).given(task, "R!zK2:RdDiHJfD6 96").checkEq(path, "/tasks/R!zK2:RdDiHJfD6 96/subtasks");
        itest("randoop", 400).given(task, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/subtasks");
        itest("randoop", 400).given(task, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/subtasks");
        itest("randoop", 400).given(task, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/subtasks");
        itest("randoop", 400).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/subtasks");
        itest("randoop", 400).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/subtasks");
        itest("randoop", 400).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/subtasks");
        itest("randoop", 400).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/subtasks");
        itest("randoop", 400).given(task, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/subtasks");
        itest("evosuite", 400).given(task, "com.google.api.client.auth.oauth2.Credential$Builder").checkEq(path, "/tasks/com.google.api.client.auth.oauth2.Credential$Builder/subtasks");
        itest("evosuite", 400).given(task, "zjcX'}").checkEq(path, "/tasks/zjcX'}/subtasks");
        itest("randoop", 400).given(task, "GET").checkEq(path, "/tasks/GET/subtasks");
        itest("evosuite", 400).given(task, "PUT").checkEq(path, "/tasks/PUT/subtasks");
        itest("randoop", 400).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//subtasks");
        itest("randoop", 400).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/subtasks");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Creates a new subtask and adds it to the parent task. Returns the full record
     * for the newly created subtask.
     *
     * @param  task The task to add a subtask to.
     * @return Request object
     */
    public ItemRequest<Task> addSubtask(String task) {
        String path = String.format("/tasks/%s/subtasks", task);
        itest("randoop", 413).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/subtasks");
        itest("randoop", 413).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/subtasks");
        itest("randoop", 413).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/subtasks");
        itest("randoop", 413).given(task, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/subtasks");
        itest("randoop", 413).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/subtasks");
        itest("evosuite", 413).given(task, "%s is not ArrayInitializerExpr, it is %s").checkEq(path, "/tasks/%s is not ArrayInitializerExpr, it is %s/subtasks");
        itest("randoop", 413).given(task, "10").checkEq(path, "/tasks/10/subtasks");
        itest("randoop", 413).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/subtasks");
        itest("randoop", 413).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/subtasks");
        itest("evosuite", 413).given(task, null).checkEq(path, "/tasks/null/subtasks");
        itest("randoop", 413).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request/subtasks");
        itest("randoop", 413).given(task, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/subtasks");
        itest("evosuite", 413).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/subtasks");
        itest("evosuite", 413).given(task, "").checkEq(path, "/tasks//subtasks");
        itest("randoop", 413).given(task, "100").checkEq(path, "/tasks/100/subtasks");
        itest("randoop", 413).given(task, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/subtasks");
        itest("randoop", 413).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/subtasks");
        itest("randoop", 413).given(task, "hi!").checkEq(path, "/tasks/hi!/subtasks");
        itest("evosuite", 413).given(task, "GET").checkEq(path, "/tasks/GET/subtasks");
        itest("randoop", 413).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/subtasks");
        itest("randoop", 413).given(task, "/tags").checkEq(path, "/tasks//tags/subtasks");
        itest("evosuite", 413).given(task, "R!zK2:RdDiHJfD6 96").checkEq(path, "/tasks/R!zK2:RdDiHJfD6 96/subtasks");
        itest("evosuite", 413).given(task, "Q7:']ott5gd8?/").checkEq(path, "/tasks/Q7:']ott5gd8?//subtasks");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Returns a compact representation of all of the stories on the task.
     *
     * @param  task The task containing the stories to get.
     * @return Request object
     */
    public CollectionRequest<Task> stories(String task) {
        String path = String.format("/tasks/%s/stories", task);
        itest("randoop", 425).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//stories");
        itest("evosuite", 425).given(task, "x").checkEq(path, "/tasks/x/stories");
        itest("randoop", 425).given(task, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/stories");
        itest("randoop", 425).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/stories");
        itest("randoop", 425).given(task, "/projects/Not Found/removeFollowers").checkEq(path, "/tasks//projects/Not Found/removeFollowers/stories");
        itest("randoop", 425).given(task, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/stories");
        itest("randoop", 425).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/stories");
        itest("randoop", 425).given(task, "").checkEq(path, "/tasks//stories");
        itest("randoop", 425).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/stories");
        itest("randoop", 425).given(task, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/tasks/com.asana.errors.InvalidRequestError: Invalid Request/stories");
        itest("evosuite", 425).given(task, "uZG`0[#fT").checkEq(path, "/tasks/uZG`0[#fT/stories");
        itest("evosuite", 425).given(task, "z.s}PU^VkB").checkEq(path, "/tasks/z.s}PU^VkB/stories");
        itest("randoop", 425).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/stories");
        itest("randoop", 425).given(task, "10").checkEq(path, "/tasks/10/stories");
        itest("randoop", 425).given(task, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/stories");
        itest("randoop", 425).given(task, "200").checkEq(path, "/tasks/200/stories");
        itest("evosuite", 425).given(task, "9O~<0:F9qK").checkEq(path, "/tasks/9O~<0:F9qK/stories");
        itest("randoop", 425).given(task, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/stories");
        itest("randoop", 425).given(task, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/stories");
        itest("randoop", 425).given(task, "/tasks/GET").checkEq(path, "/tasks//tasks/GET/stories");
        itest("randoop", 425).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/stories");
        itest("randoop", 425).given(task, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: 200/stories");
        itest("randoop", 425).given(task, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/stories");
        return new CollectionRequest<Task>(this, Task.class, path, "GET");
    }

    /**
     * Adds a comment to a task. The comment will be authored by the
     * currently authenticated user, and timestamped when the server receives
     * the request.
     *
     * Returns the full record for the new story added to the task.
     *
     * @param  task Globally unique identifier for the task.
     * @return Request object
     */
    public ItemRequest<Task> addComment(String task) {
        String path = String.format("/tasks/%s/stories", task);
        itest("randoop", 441).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/stories");
        itest("randoop", 441).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/stories");
        itest("randoop", 441).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/stories");
        itest("randoop", 441).given(task, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/stories");
        itest("evosuite", 441).given(task, "/tasks/%s/tags").checkEq(path, "/tasks//tasks/%s/tags/stories");
        itest("evosuite", 441).given(task, "").checkEq(path, "/tasks//stories");
        itest("randoop", 441).given(task, "GET").checkEq(path, "/tasks/GET/stories");
        itest("evosuite", 441).given(task, "R!zK2:RdDiHJfD6 96").checkEq(path, "/tasks/R!zK2:RdDiHJfD6 96/stories");
        itest("randoop", 441).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/stories");
        itest("randoop", 441).given(task, "/portfolios/").checkEq(path, "/tasks//portfolios//stories");
        itest("randoop", 441).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/stories");
        itest("randoop", 441).given(task, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/stories");
        itest("randoop", 441).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/stories");
        itest("randoop", 441).given(task, "10").checkEq(path, "/tasks/10/stories");
        itest("randoop", 441).given(task, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/stories");
        itest("randoop", 441).given(task, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/stories");
        itest("randoop", 441).given(task, "").checkEq(path, "/tasks//stories");
        itest("randoop", 441).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request/stories");
        itest("randoop", 441).given(task, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/stories");
        itest("randoop", 441).given(task, "POST").checkEq(path, "/tasks/POST/stories");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }

    /**
     * Insert or reorder tasks in a user's My Tasks list. If the task was not
     * assigned to the owner of the user task list it will be reassigned when
     * this endpoint is called. If neither `insert_before` nor `insert_after`
     * are provided the task will be inserted at the top of the assignee's
     * inbox.
     *
     * Returns an empty data block.
     *
     * @param  userTaskList Globally unique identifier for the user task list.
     * @return Request object
     */
    public ItemRequest<Task> insertInUserTaskList(String userTaskList) {
        String path = String.format("/user_task_lists/%s/tasks/insert", userTaskList);
        itest("evosuite", 459).given(userTaskList, "/tasks//subtasks").checkEq(path, "/user_task_lists//tasks//subtasks/tasks/insert");
        itest("evosuite", 459).given(userTaskList, "/tasks/%s/removeTag").checkEq(path, "/user_task_lists//tasks/%s/removeTag/tasks/insert");
        itest("randoop", 459).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks/insert");
        itest("randoop", 459).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/tasks/insert");
        itest("randoop", 459).given(userTaskList, "/tasks//attachments/Not Found/addProject").checkEq(path, "/user_task_lists//tasks//attachments/Not Found/addProject/tasks/insert");
        itest("randoop", 459).given(userTaskList, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/user_task_lists/com.asana.errors.RetryableAsanaError: 200/tasks/insert");
        itest("randoop", 459).given(userTaskList, "hi!").checkEq(path, "/user_task_lists/hi!/tasks/insert");
        itest("randoop", 459).given(userTaskList, "/goals/{goal_gid}/subgoals").checkEq(path, "/user_task_lists//goals/{goal_gid}/subgoals/tasks/insert");
        itest("randoop", 459).given(userTaskList, "/attachments/Not Found").checkEq(path, "/user_task_lists//attachments/Not Found/tasks/insert");
        itest("randoop", 459).given(userTaskList, "/attachments/").checkEq(path, "/user_task_lists//attachments//tasks/insert");
        itest("randoop", 459).given(userTaskList, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/user_task_lists//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks/insert");
        itest("randoop", 459).given(userTaskList, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/user_task_lists/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks/insert");
        itest("randoop", 459).given(userTaskList, "/custom_fields//enum_options/insert").checkEq(path, "/user_task_lists//custom_fields//enum_options/insert/tasks/insert");
        itest("randoop", 459).given(userTaskList, "").checkEq(path, "/user_task_lists//tasks/insert");
        itest("randoop", 459).given(userTaskList, "Payment Required").checkEq(path, "/user_task_lists/Payment Required/tasks/insert");
        itest("randoop", 459).given(userTaskList, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/user_task_lists//stories//goals/{goal_gid}/addSubgoal/tasks/insert");
        itest("randoop", 459).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/tasks/insert");
        itest("randoop", 459).given(userTaskList, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks/insert");
        itest("randoop", 459).given(userTaskList, "/tasks/200/addProject").checkEq(path, "/user_task_lists//tasks/200/addProject/tasks/insert");
        itest("evosuite", 459).given(userTaskList, "").checkEq(path, "/user_task_lists//tasks/insert");
        itest("randoop", 459).given(userTaskList, "Not Found").checkEq(path, "/user_task_lists/Not Found/tasks/insert");
        itest("randoop", 459).given(userTaskList, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/user_task_lists/com.asana.errors.PremiumOnlyError: Payment Required/tasks/insert");
        itest("randoop", 459).given(userTaskList, "100").checkEq(path, "/user_task_lists/100/tasks/insert");
        itest("randoop", 459).given(userTaskList, "/portfolios/").checkEq(path, "/user_task_lists//portfolios//tasks/insert");
        itest("randoop", 459).given(userTaskList, "-1").checkEq(path, "/user_task_lists/-1/tasks/insert");
        itest("evosuite", 459).given(userTaskList, "/tags/%s/tasks").checkEq(path, "/user_task_lists//tags/%s/tasks/tasks/insert");
        return new ItemRequest<Task>(this, Task.class, path, "POST");
    }
}
