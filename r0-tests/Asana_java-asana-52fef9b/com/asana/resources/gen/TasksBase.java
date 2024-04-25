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

public class TasksBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public TasksBase(Client client) {
        super(client);
    }

    /**
     * Set dependencies for a task
     * Marks a set of tasks as dependencies of this task, if they are not already dependencies. *A task can have at most 15 dependencies*.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addDependenciesForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/addDependencies".replace("{task_gid}", taskGid);
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addDependencies");
        itest("randoop", 31).given(taskGid, "POST").checkEq(path, "/tasks/POST/addDependencies");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/addDependencies");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addDependencies");
        itest("evosuite", 31).given(taskGid, "Cw9'R)S\"]iMHt)?/%").checkEq(path, "/tasks/Cw9'R)S\"]iMHt)?/%/addDependencies");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addDependencies");
        itest("randoop", 31).given(taskGid, "200").checkEq(path, "/tasks/200/addDependencies");
        itest("randoop", 31).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/addDependencies");
        itest("evosuite", 31).given(taskGid, "Hh6y.I").checkEq(path, "/tasks/Hh6y.I/addDependencies");
        itest("randoop", 31).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/addDependencies");
        itest("randoop", 31).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/addDependencies");
        itest("evosuite", 31).given(taskGid, "").checkEq(path, "/tasks//addDependencies");
        itest("randoop", 31).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/addDependencies");
        itest("randoop", 31).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/addDependencies");
        itest("randoop", 31).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/addDependencies");
        itest("evosuite", 31).given(taskGid, "5ff]<*-9W:vJUI#9#T").checkEq(path, "/tasks/5ff]<*-9W:vJUI#9#T/addDependencies");
        itest("randoop", 31).given(taskGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/addDependencies");
        itest("randoop", 31).given(taskGid, "10").checkEq(path, "/tasks/10/addDependencies");
        itest("randoop", 31).given(taskGid, "").checkEq(path, "/tasks//addDependencies");
        itest("randoop", 31).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/addDependencies");
        itest("evosuite", 31).given(taskGid, "com.github.javaparser.ast.expr.ClassExpr").checkEq(path, "/tasks/com.github.javaparser.ast.expr.ClassExpr/addDependencies");
        itest("evosuite", 31).given(taskGid, "WDN-]r\t=yqj(}&A").checkEq(path, "/tasks/WDN-]r\t=yqj(}&A/addDependencies");
        itest("evosuite", 31).given(taskGid, "7J5Ocz+))/,1").checkEq(path, "/tasks/7J5Ocz+))/,1/addDependencies");
        itest("randoop", 31).given(taskGid, "GET").checkEq(path, "/tasks/GET/addDependencies");
        itest("evosuite", 31).given(taskGid, "6/;$BMgxM4o]S(R").checkEq(path, "/tasks/6/;$BMgxM4o]S(R/addDependencies");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addDependencies");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addDependenciesForTask(String taskGid) throws IOException {
        return addDependenciesForTask(taskGid, null, false);
    }

    /**
     * Set dependents for a task
     * Marks a set of tasks as dependents of this task, if they are not already dependents. *A task can have at most 30 dependents*.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> addDependentsForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/addDependents".replace("{task_gid}", taskGid);
        itest("randoop", 53).given(taskGid, "/portfolios/").checkEq(path, "/tasks//portfolios//addDependents");
        itest("randoop", 53).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addDependents");
        itest("randoop", 53).given(taskGid, "200").checkEq(path, "/tasks/200/addDependents");
        itest("randoop", 53).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/addDependents");
        itest("evosuite", 53).given(taskGid, "n%4/j2P3jw-=").checkEq(path, "/tasks/n%4/j2P3jw-=/addDependents");
        itest("randoop", 53).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addDependents");
        itest("randoop", 53).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/addDependents");
        itest("randoop", 53).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addDependents");
        itest("evosuite", 53).given(taskGid, "<skipped>").checkEq(path, "/tasks/<skipped>/addDependents");
        itest("randoop", 53).given(taskGid, "GET").checkEq(path, "/tasks/GET/addDependents");
        itest("randoop", 53).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/addDependents");
        itest("randoop", 53).given(taskGid, "/tags").checkEq(path, "/tasks//tags/addDependents");
        itest("randoop", 53).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/addDependents");
        itest("randoop", 53).given(taskGid, "").checkEq(path, "/tasks//addDependents");
        itest("randoop", 53).given(taskGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/addDependents");
        itest("randoop", 53).given(taskGid, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/addDependents");
        itest("randoop", 53).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/addDependents");
        itest("randoop", 53).given(taskGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/addDependents");
        itest("randoop", 53).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/addDependents");
        itest("randoop", 53).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/addDependents");
        itest("randoop", 53).given(taskGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addDependents");
        itest("evosuite", 53).given(taskGid, "").checkEq(path, "/tasks//addDependents");
        itest("randoop", 53).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/addDependents");
        itest("randoop", 53).given(taskGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/addDependents");
        itest("randoop", 53).given(taskGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addDependents");
        itest("randoop", 53).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addDependents");
        itest("evosuite", 53).given(taskGid, "created_by.not").checkEq(path, "/tasks/created_by.not/addDependents");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public CollectionRequest<Task> addDependentsForTask(String taskGid) throws IOException {
        return addDependentsForTask(taskGid, null, false);
    }

    /**
     * Add followers to a task
     * Adds followers to a task. Returns an empty data block. Each task can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated task record, described above.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addFollowersForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/addFollowers".replace("{task_gid}", taskGid);
        itest("randoop", 75).given(taskGid, "/projects/Not Found/removeFollowers").checkEq(path, "/tasks//projects/Not Found/removeFollowers/addFollowers");
        itest("randoop", 75).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addFollowers");
        itest("randoop", 75).given(taskGid, "").checkEq(path, "/tasks//addFollowers");
        itest("randoop", 75).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addFollowers");
        itest("randoop", 75).given(taskGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/tasks/com.asana.errors.InvalidRequestError: Invalid Request/addFollowers");
        itest("randoop", 75).given(taskGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/tasks//workspaces//goals/{goal_gid}/subgoals/tasks/addFollowers");
        itest("randoop", 75).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/addFollowers");
        itest("randoop", 75).given(taskGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addFollowers");
        itest("randoop", 75).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addFollowers");
        itest("randoop", 75).given(taskGid, "0").checkEq(path, "/tasks/0/addFollowers");
        itest("randoop", 75).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/addFollowers");
        itest("randoop", 75).given(taskGid, "GET").checkEq(path, "/tasks/GET/addFollowers");
        itest("evosuite", 75).given(taskGid, "").checkEq(path, "/tasks//addFollowers");
        itest("randoop", 75).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/addFollowers");
        itest("randoop", 75).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addFollowers");
        itest("evosuite", 75).given(taskGid, "proj*cts.all").checkEq(path, "/tasks/proj*cts.all/addFollowers");
        itest("randoop", 75).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addFollowers");
        itest("randoop", 75).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/addFollowers");
        itest("randoop", 75).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addFollowers");
        itest("randoop", 75).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addFollowers");
        itest("randoop", 75).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/addFollowers");
        itest("randoop", 75).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/addFollowers");
        itest("evosuite", 75).given(taskGid, "L*~RJc<o").checkEq(path, "/tasks/L*~RJc<o/addFollowers");
        itest("randoop", 75).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/addFollowers");
        itest("randoop", 75).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/addFollowers");
        itest("randoop", 75).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/addFollowers");
        itest("randoop", 75).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/addFollowers");
        itest("randoop", 75).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/addFollowers");
        itest("randoop", 75).given(taskGid, "POST").checkEq(path, "/tasks/POST/addFollowers");
        itest("randoop", 75).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addFollowers");
        itest("randoop", 75).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/addFollowers");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addFollowersForTask(String taskGid) throws IOException {
        return addFollowersForTask(taskGid, null, false);
    }

    /**
     * Add a project to a task
     * Adds the task to the specified project, in the optional location specified. If no location arguments are given, the task will be added to the end of the project.  &#x60;addProject&#x60; can also be used to reorder a task within a project or section that already contains it.  At most one of &#x60;insert_before&#x60;, &#x60;insert_after&#x60;, or &#x60;section&#x60; should be specified. Inserting into a section in an non-order-dependent way can be done by specifying section, otherwise, to insert within a section in a particular place, specify &#x60;insert_before&#x60; or &#x60;insert_after&#x60; and a task within the section to anchor the position of this task.  Returns an empty data block.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addProjectForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/addProject".replace("{task_gid}", taskGid);
        itest("evosuite", 97).given(taskGid, "http.method").checkEq(path, "/tasks/http.method/addProject");
        itest("randoop", 97).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addProject");
        itest("randoop", 97).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addProject");
        itest("randoop", 97).given(taskGid, "0").checkEq(path, "/tasks/0/addProject");
        itest("randoop", 97).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/addProject");
        itest("evosuite", 97).given(taskGid, "com.github.javaparser.ast.validator.ReservedKeywordValidator").checkEq(path, "/tasks/com.github.javaparser.ast.validator.ReservedKeywordValidator/addProject");
        itest("randoop", 97).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addProject");
        itest("randoop", 97).given(taskGid, "POST").checkEq(path, "/tasks/POST/addProject");
        itest("evosuite", 97).given(taskGid, "#!Mjo").checkEq(path, "/tasks/#!Mjo/addProject");
        itest("randoop", 97).given(taskGid, "/goals/Sync token invalid or too old").checkEq(path, "/tasks//goals/Sync token invalid or too old/addProject");
        itest("evosuite", 97).given(taskGid, "'_Il{FD").checkEq(path, "/tasks/'_Il{FD/addProject");
        itest("randoop", 97).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/addProject");
        itest("randoop", 97).given(taskGid, "").checkEq(path, "/tasks//addProject");
        itest("randoop", 97).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addProject");
        itest("randoop", 97).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addProject");
        itest("randoop", 97).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addProject");
        itest("randoop", 97).given(taskGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/addProject");
        itest("randoop", 97).given(taskGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/addProject");
        itest("randoop", 97).given(taskGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addProject");
        itest("randoop", 97).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/addProject");
        itest("randoop", 97).given(taskGid, "10").checkEq(path, "/tasks/10/addProject");
        itest("randoop", 97).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addProject");
        itest("randoop", 97).given(taskGid, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/addProject");
        itest("randoop", 97).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/addProject");
        itest("randoop", 97).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//addProject");
        itest("randoop", 97).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addProject");
        itest("randoop", 97).given(taskGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/tasks//tasks//attachments/Not Found/addProject/addProject");
        itest("randoop", 97).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/addProject");
        itest("randoop", 97).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/addProject");
        itest("randoop", 97).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error/addProject");
        itest("evosuite", 97).given(taskGid, "").checkEq(path, "/tasks//addProject");
        itest("randoop", 97).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/addProject");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addProjectForTask(String taskGid) throws IOException {
        return addProjectForTask(taskGid, null, false);
    }

    /**
     * Add a tag to a task
     * Adds a tag to a task. Returns an empty data block.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addTagForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/addTag".replace("{task_gid}", taskGid);
        itest("randoop", 119).given(taskGid, "/tags").checkEq(path, "/tasks//tags/addTag");
        itest("randoop", 119).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/addTag");
        itest("randoop", 119).given(taskGid, "").checkEq(path, "/tasks//addTag");
        itest("evosuite", 119).given(taskGid, "").checkEq(path, "/tasks//addTag");
        itest("randoop", 119).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/addTag");
        itest("randoop", 119).given(taskGid, "GET").checkEq(path, "/tasks/GET/addTag");
        itest("randoop", 119).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/addTag");
        itest("evosuite", 119).given(taskGid, "/tasks/{task_gid}/subtasks").checkEq(path, "/tasks//tasks/{task_gid}/subtasks/addTag");
        itest("randoop", 119).given(taskGid, "200").checkEq(path, "/tasks/200/addTag");
        itest("randoop", 119).given(taskGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addTag");
        itest("randoop", 119).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addTag");
        itest("randoop", 119).given(taskGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: 200/addTag");
        itest("randoop", 119).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addTag");
        itest("randoop", 119).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/addTag");
        itest("randoop", 119).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addTag");
        itest("evosuite", 119).given(taskGid, "/tasks/&AdukK}[j-1G6M54ygl/removeProject").checkEq(path, "/tasks//tasks/&AdukK}[j-1G6M54ygl/removeProject/addTag");
        itest("randoop", 119).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/addTag");
        itest("randoop", 119).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addTag");
        itest("randoop", 119).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addTag");
        itest("randoop", 119).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/addTag");
        itest("randoop", 119).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/addTag");
        itest("randoop", 119).given(taskGid, "10").checkEq(path, "/tasks/10/addTag");
        itest("randoop", 119).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addTag");
        itest("randoop", 119).given(taskGid, "/projects/Not Found/removeFollowers").checkEq(path, "/tasks//projects/Not Found/removeFollowers/addTag");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addTagForTask(String taskGid) throws IOException {
        return addTagForTask(taskGid, null, false);
    }

    /**
     * Create a subtask
     * Creates a new subtask and adds it to the parent task. Returns the full record for the newly created subtask.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Task> createSubtaskForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/subtasks".replace("{task_gid}", taskGid);
        itest("randoop", 141).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/subtasks");
        itest("randoop", 141).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/subtasks");
        itest("evosuite", 141).given(taskGid, "~c").checkEq(path, "/tasks/~c/subtasks");
        itest("randoop", 141).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/subtasks");
        itest("evosuite", 141).given(taskGid, "@9").checkEq(path, "/tasks/@9/subtasks");
        itest("randoop", 141).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/subtasks");
        itest("randoop", 141).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/subtasks");
        itest("randoop", 141).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/subtasks");
        itest("randoop", 141).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/subtasks");
        itest("randoop", 141).given(taskGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/tasks/com.asana.errors.AsanaError: NoAuthorizationError/subtasks");
        itest("randoop", 141).given(taskGid, "100").checkEq(path, "/tasks/100/subtasks");
        itest("randoop", 141).given(taskGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/subtasks");
        itest("randoop", 141).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error/subtasks");
        itest("randoop", 141).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/subtasks");
        itest("evosuite", 141).given(taskGid, "/tasks/com.github.javaparser.ast.body.CallableDeclaration/dependents").checkEq(path, "/tasks//tasks/com.github.javaparser.ast.body.CallableDeclaration/dependents/subtasks");
        itest("evosuite", 141).given(taskGid, "VX7h.8y.(G]mF~c").checkEq(path, "/tasks/VX7h.8y.(G]mF~c/subtasks");
        itest("evosuite", 141).given(taskGid, "GET").checkEq(path, "/tasks/GET/subtasks");
        itest("randoop", 141).given(taskGid, "10").checkEq(path, "/tasks/10/subtasks");
        itest("randoop", 141).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/subtasks");
        itest("randoop", 141).given(taskGid, "0").checkEq(path, "/tasks/0/subtasks");
        itest("randoop", 141).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/subtasks");
        itest("randoop", 141).given(taskGid, "/attachments/").checkEq(path, "/tasks//attachments//subtasks");
        itest("evosuite", 141).given(taskGid, "").checkEq(path, "/tasks//subtasks");
        itest("evosuite", 141).given(taskGid, "/tasks/{task_gid}/duplicate").checkEq(path, "/tasks//tasks/{task_gid}/duplicate/subtasks");
        itest("evosuite", 141).given(taskGid, "created_at.before").checkEq(path, "/tasks/created_at.before/subtasks");
        itest("randoop", 141).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/subtasks");
        itest("randoop", 141).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/subtasks");
        itest("evosuite", 141).given(taskGid, "@").checkEq(path, "/tasks/@/subtasks");
        itest("randoop", 141).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/subtasks");
        itest("randoop", 141).given(taskGid, "GET").checkEq(path, "/tasks/GET/subtasks");
        itest("randoop", 141).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/subtasks");
        itest("randoop", 141).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/subtasks");
        itest("randoop", 141).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/subtasks");
        ItemRequest<Task> req = new ItemRequest<Task>(this, Task.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Task> createSubtaskForTask(String taskGid) throws IOException {
        return createSubtaskForTask(taskGid, null, false);
    }

    /**
     * Create a task
     * Creating a new task is as easy as POSTing to the &#x60;/tasks&#x60; endpoint with a data block containing the fields you’d like to set on the task. Any unspecified fields will take on default values.  Every task is required to be created in a specific workspace, and this workspace cannot be changed once set. The workspace need not be set explicitly if you specify &#x60;projects&#x60; or a &#x60;parent&#x60; task instead.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Task> createTask(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks";
        ItemRequest<Task> req = new ItemRequest<Task>(this, Task.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Task> createTask() throws IOException {
        return createTask(null, false);
    }

    /**
     * Delete a task
     * A specific, existing task can be deleted by making a DELETE request on the URL for that task. Deleted tasks go into the “trash” of the user making the delete request. Tasks can be recovered from the trash within a period of 30 days; afterward they are completely removed from the system.  Returns an empty data record.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}".replace("{task_gid}", taskGid);
        itest("evosuite", 184).given(taskGid, "POST").checkEq(path, "/tasks/POST");
        itest("randoop", 184).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden");
        itest("randoop", 184).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 184).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError");
        itest("randoop", 184).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 184).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required");
        itest("randoop", 184).given(taskGid, "/attachments/").checkEq(path, "/tasks//attachments/");
        itest("randoop", 184).given(taskGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals");
        itest("randoop", 184).given(taskGid, "200").checkEq(path, "/tasks/200");
        itest("randoop", 184).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 184).given(taskGid, "DPO^").checkEq(path, "/tasks/DPO^");
        itest("randoop", 184).given(taskGid, "hi!").checkEq(path, "/tasks/hi!");
        itest("evosuite", 184).given(taskGid, "x#[e~_\"|6:{2[=v2n").checkEq(path, "/tasks/x#[e~_\"|6:{2[=v2n");
        itest("evosuite", 184).given(taskGid, ">=").checkEq(path, "/tasks/>=");
        itest("randoop", 184).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 184).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 184).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request");
        itest("randoop", 184).given(taskGid, "GET").checkEq(path, "/tasks/GET");
        itest("randoop", 184).given(taskGid, "POST").checkEq(path, "/tasks/POST");
        itest("randoop", 184).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("evosuite", 184).given(taskGid, "Ala4").checkEq(path, "/tasks/Ala4");
        itest("evosuite", 184).given(taskGid, "oJqmL 6r+9%r6").checkEq(path, "/tasks/oJqmL 6r+9%r6");
        itest("randoop", 184).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteTask(String taskGid) throws IOException {
        return deleteTask(taskGid, null, false);
    }

    /**
     * Duplicate a task
     * Creates and returns a job that will asynchronously handle the duplication.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Job)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Job> duplicateTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/duplicate".replace("{task_gid}", taskGid);
        itest("randoop", 206).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error/duplicate");
        itest("randoop", 206).given(taskGid, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/duplicate");
        itest("randoop", 206).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/duplicate");
        itest("randoop", 206).given(taskGid, "10").checkEq(path, "/tasks/10/duplicate");
        itest("randoop", 206).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/duplicate");
        itest("evosuite", 206).given(taskGid, "").checkEq(path, "/tasks//duplicate");
        itest("randoop", 206).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/duplicate");
        itest("randoop", 206).given(taskGid, "GET").checkEq(path, "/tasks/GET/duplicate");
        itest("randoop", 206).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/duplicate");
        itest("randoop", 206).given(taskGid, "POST").checkEq(path, "/tasks/POST/duplicate");
        itest("randoop", 206).given(taskGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/duplicate");
        itest("randoop", 206).given(taskGid, "/tags").checkEq(path, "/tasks//tags/duplicate");
        itest("randoop", 206).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/duplicate");
        itest("randoop", 206).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/duplicate");
        itest("randoop", 206).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/duplicate");
        itest("randoop", 206).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/duplicate");
        itest("randoop", 206).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/duplicate");
        itest("randoop", 206).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/duplicate");
        itest("randoop", 206).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/duplicate");
        itest("evosuite", 206).given(taskGid, "1QIi<h74Xf'O`Z").checkEq(path, "/tasks/1QIi<h74Xf'O`Z/duplicate");
        itest("randoop", 206).given(taskGid, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/tasks//portfolios/Rate Limit Enforced/portfolio_memberships/duplicate");
        itest("randoop", 206).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/duplicate");
        itest("randoop", 206).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/duplicate");
        itest("randoop", 206).given(taskGid, "").checkEq(path, "/tasks//duplicate");
        itest("randoop", 206).given(taskGid, "/tasks/GET").checkEq(path, "/tasks//tasks/GET/duplicate");
        itest("randoop", 206).given(taskGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/duplicate");
        itest("evosuite", 206).given(taskGid, "finallyBlock").checkEq(path, "/tasks/finallyBlock/duplicate");
        itest("evosuite", 206).given(taskGid, "/tasks/BuC/projects").checkEq(path, "/tasks//tasks/BuC/projects/duplicate");
        itest("randoop", 206).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/duplicate");
        ItemRequest<Job> req = new ItemRequest<Job>(this, Job.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Job> duplicateTask(String taskGid) throws IOException {
        return duplicateTask(taskGid, null, false);
    }

    /**
     * Get dependencies from a task
     * Returns the compact representations of all of the dependencies of a task.
     * @param taskGid The task to operate on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> getDependenciesForTask(String taskGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/dependencies".replace("{task_gid}", taskGid);
        itest("randoop", 230).given(taskGid, "/tasks/200/addProject").checkEq(path, "/tasks//tasks/200/addProject/dependencies");
        itest("randoop", 230).given(taskGid, "/attachments/").checkEq(path, "/tasks//attachments//dependencies");
        itest("randoop", 230).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/dependencies");
        itest("randoop", 230).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/dependencies");
        itest("randoop", 230).given(taskGid, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/dependencies");
        itest("randoop", 230).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/dependencies");
        itest("evosuite", 230).given(taskGid, "JJ~~092~G|\u0006Yg6,J").checkEq(path, "/tasks/JJ~~092~G|\u0006Yg6,J/dependencies");
        itest("randoop", 230).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/dependencies");
        itest("randoop", 230).given(taskGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: 200/dependencies");
        itest("evosuite", 230).given(taskGid, "48uw9HpK").checkEq(path, "/tasks/48uw9HpK/dependencies");
        itest("evosuite", 230).given(taskGid, "%*W@/jd?.?9vF4k").checkEq(path, "/tasks/%*W@/jd?.?9vF4k/dependencies");
        itest("randoop", 230).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/dependencies");
        itest("randoop", 230).given(taskGid, "").checkEq(path, "/tasks//dependencies");
        itest("randoop", 230).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/dependencies");
        itest("randoop", 230).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/dependencies");
        itest("randoop", 230).given(taskGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/dependencies");
        itest("evosuite", 230).given(taskGid, "_d~8~").checkEq(path, "/tasks/_d~8~/dependencies");
        itest("randoop", 230).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/dependencies");
        itest("randoop", 230).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/dependencies");
        itest("randoop", 230).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/dependencies");
        itest("evosuite", 230).given(taskGid, "").checkEq(path, "/tasks//dependencies");
        itest("randoop", 230).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/dependencies");
        itest("randoop", 230).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/dependencies");
        itest("evosuite", 230).given(taskGid, "/tasks/com.github.javaparser.metamodel.SwitchExprMetaModel/removeTag").checkEq(path, "/tasks//tasks/com.github.javaparser.metamodel.SwitchExprMetaModel/removeTag/dependencies");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Task> getDependenciesForTask(String taskGid) throws IOException {
        return getDependenciesForTask(taskGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get dependents from a task
     * Returns the compact representations of all of the dependents of a task.
     * @param taskGid The task to operate on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> getDependentsForTask(String taskGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/dependents".replace("{task_gid}", taskGid);
        itest("randoop", 256).given(taskGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/tasks/com.asana.errors.InvalidRequestError: Invalid Request/dependents");
        itest("randoop", 256).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/dependents");
        itest("randoop", 256).given(taskGid, "GET").checkEq(path, "/tasks/GET/dependents");
        itest("evosuite", 256).given(taskGid, "completed").checkEq(path, "/tasks/completed/dependents");
        itest("evosuite", 256).given(taskGid, "text").checkEq(path, "/tasks/text/dependents");
        itest("randoop", 256).given(taskGid, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/tasks//portfolios/Rate Limit Enforced/portfolio_memberships/dependents");
        itest("randoop", 256).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/dependents");
        itest("randoop", 256).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error/dependents");
        itest("evosuite", 256).given(taskGid, "").checkEq(path, "/tasks//dependents");
        itest("randoop", 256).given(taskGid, "POST").checkEq(path, "/tasks/POST/dependents");
        itest("randoop", 256).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/dependents");
        itest("randoop", 256).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/dependents");
        itest("randoop", 256).given(taskGid, "/portfolios/").checkEq(path, "/tasks//portfolios//dependents");
        itest("randoop", 256).given(taskGid, "com.asana.errors.RetryableAsanaError: NoAuthorizationError").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: NoAuthorizationError/dependents");
        itest("randoop", 256).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/dependents");
        itest("randoop", 256).given(taskGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/dependents");
        itest("randoop", 256).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/dependents");
        itest("randoop", 256).given(taskGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/dependents");
        itest("evosuite", 256).given(taskGid, "com.github.javaparser.ast.body.CallableDeclaration").checkEq(path, "/tasks/com.github.javaparser.ast.body.CallableDeclaration/dependents");
        itest("evosuite", 256).given(taskGid, "\"03pIxw&?lBs").checkEq(path, "/tasks/\"03pIxw&?lBs/dependents");
        itest("evosuite", 256).given(taskGid, "+vI,YMTFQa,5S]'u3").checkEq(path, "/tasks/+vI,YMTFQa,5S]'u3/dependents");
        itest("randoop", 256).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/dependents");
        itest("evosuite", 256).given(taskGid, "cr`atkaued_by.not").checkEq(path, "/tasks/cr`atkaued_by.not/dependents");
        itest("randoop", 256).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/dependents");
        itest("randoop", 256).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//dependents");
        itest("randoop", 256).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/dependents");
        itest("randoop", 256).given(taskGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/dependents");
        itest("evosuite", 256).given(taskGid, "projects.all").checkEq(path, "/tasks/projects.all/dependents");
        itest("randoop", 256).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/dependents");
        itest("randoop", 256).given(taskGid, "").checkEq(path, "/tasks//dependents");
        itest("randoop", 256).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/dependents");
        itest("randoop", 256).given(taskGid, "10").checkEq(path, "/tasks/10/dependents");
        itest("randoop", 256).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/dependents");
        itest("evosuite", 256).given(taskGid, "projec(Uts.al{").checkEq(path, "/tasks/projec(Uts.al{/dependents");
        itest("randoop", 256).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/dependents");
        itest("randoop", 256).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/dependents");
        itest("randoop", 256).given(taskGid, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/dependents");
        itest("randoop", 256).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/dependents");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Task> getDependentsForTask(String taskGid) throws IOException {
        return getDependentsForTask(taskGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get subtasks from a task
     * Returns a compact representation of all of the subtasks of a task.
     * @param taskGid The task to operate on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> getSubtasksForTask(String taskGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/subtasks".replace("{task_gid}", taskGid);
        itest("randoop", 282).given(taskGid, "200").checkEq(path, "/tasks/200/subtasks");
        itest("randoop", 282).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/subtasks");
        itest("randoop", 282).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/subtasks");
        itest("randoop", 282).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/subtasks");
        itest("evosuite", 282).given(taskGid, "/tasks/{task_gid}").checkEq(path, "/tasks//tasks/{task_gid}/subtasks");
        itest("randoop", 282).given(taskGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/subtasks");
        itest("randoop", 282).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//goals/%7Bgoal_gid%7D/subgoals").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//goals/%7Bgoal_gid%7D/subgoals/subtasks");
        itest("randoop", 282).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/subtasks");
        itest("evosuite", 282).given(taskGid, "/tasks/n%4/j2P3jw-=/addDependents").checkEq(path, "/tasks//tasks/n%4/j2P3jw-=/addDependents/subtasks");
        itest("randoop", 282).given(taskGid, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/subtasks");
        itest("randoop", 282).given(taskGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/subtasks");
        itest("randoop", 282).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/subtasks");
        itest("randoop", 282).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/subtasks");
        itest("randoop", 282).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/subtasks");
        itest("randoop", 282).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/subtasks");
        itest("randoop", 282).given(taskGid, "/portfolios/").checkEq(path, "/tasks//portfolios//subtasks");
        itest("randoop", 282).given(taskGid, "").checkEq(path, "/tasks//subtasks");
        itest("evosuite", 282).given(taskGid, "projects.all").checkEq(path, "/tasks/projects.all/subtasks");
        itest("randoop", 282).given(taskGid, "POST").checkEq(path, "/tasks/POST/subtasks");
        itest("evosuite", 282).given(taskGid, "[fY").checkEq(path, "/tasks/[fY/subtasks");
        itest("randoop", 282).given(taskGid, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/subtasks");
        itest("evosuite", 282).given(taskGid, "").checkEq(path, "/tasks//subtasks");
        itest("randoop", 282).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/subtasks");
        itest("randoop", 282).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/subtasks");
        itest("randoop", 282).given(taskGid, "/tags").checkEq(path, "/tasks//tags/subtasks");
        itest("randoop", 282).given(taskGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/subtasks");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Task> getSubtasksForTask(String taskGid) throws IOException {
        return getSubtasksForTask(taskGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get a task
     * Returns the complete task record for a single task.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Task> getTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}".replace("{task_gid}", taskGid);
        itest("evosuite", 306).given(taskGid, "").checkEq(path, "/tasks/");
        itest("randoop", 306).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 306).given(taskGid, "10").checkEq(path, "/tasks/10");
        itest("randoop", 306).given(taskGid, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert");
        itest("randoop", 306).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("evosuite", 306).given(taskGid, "CkuoE?jJ5,*M.f").checkEq(path, "/tasks/CkuoE?jJ5,*M.f");
        itest("evosuite", 306).given(taskGid, "ZFq").checkEq(path, "/tasks/ZFq");
        itest("evosuite", 306).given(taskGid, "assignee.not").checkEq(path, "/tasks/assignee.not");
        itest("randoop", 306).given(taskGid, "/tasks/200/addProject").checkEq(path, "/tasks//tasks/200/addProject");
        itest("randoop", 306).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error");
        itest("randoop", 306).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError");
        itest("randoop", 306).given(taskGid, "GET").checkEq(path, "/tasks/GET");
        itest("evosuite", 306).given(taskGid, "/tasks/text/dependents").checkEq(path, "/tasks//tasks/text/dependents");
        itest("randoop", 306).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 306).given(taskGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError");
        itest("randoop", 306).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 306).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced");
        itest("randoop", 306).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 306).given(taskGid, "hi!").checkEq(path, "/tasks/hi!");
        itest("randoop", 306).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 306).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request");
        itest("randoop", 306).given(taskGid, "").checkEq(path, "/tasks/");
        itest("randoop", 306).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal");
        itest("randoop", 306).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found");
        itest("randoop", 306).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 306).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 306).given(taskGid, "/tasks//addDependents").checkEq(path, "/tasks//tasks//addDependents");
        itest("randoop", 306).given(taskGid, "/workspaces/").checkEq(path, "/tasks//workspaces/");
        itest("randoop", 306).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        ItemRequest<Task> req = new ItemRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Task> getTask(String taskGid) throws IOException {
        return getTask(taskGid, null, false);
    }

    /**
     * Get multiple tasks
     * Returns the compact task records for some filtered set of tasks. Use one or more of the parameters provided to filter the tasks returned. You must specify a &#x60;project&#x60; or &#x60;tag&#x60; if you do not specify &#x60;assignee&#x60; and &#x60;workspace&#x60;.  For more complex task retrieval, use [workspaces/{workspace_gid}/tasks/search](/docs/search-tasks-in-a-workspace).
     * @param modifiedSince Only return tasks that have been modified since the given time.  *Note: A task is considered “modified” if any of its properties change, or associations between it and other objects are modified (e.g.  a task being added to a project). A task is not considered modified just because another object it is associated with (e.g. a subtask) is modified. Actions that count as modifying the task include assigning, renaming, completing, and adding stories.* (optional)
     * @param completedSince Only return tasks that are either incomplete or that have been completed since this time. (optional)
     * @param workspace The workspace to filter tasks on. *Note: If you specify &#x60;workspace&#x60;, you must also specify the &#x60;assignee&#x60; to filter on.* (optional)
     * @param section The section to filter tasks on. *Note: Currently, this is only supported in board views.* (optional)
     * @param project The project to filter tasks on. (optional)
     * @param assignee The assignee to filter tasks on. *Note: If you specify &#x60;assignee&#x60;, you must also specify the &#x60;workspace&#x60; to filter on.* (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> getTasks(OffsetDateTime modifiedSince, OffsetDateTime completedSince, String workspace, String section, String project, String assignee, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks";
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("assignee", assignee).query("project", project).query("section", section).query("workspace", workspace).query("completed_since", completedSince).query("modified_since", modifiedSince);
        return req;
    }

    public CollectionRequest<Task> getTasks(OffsetDateTime modifiedSince, OffsetDateTime completedSince, String workspace, String section, String project, String assignee) throws IOException {
        return getTasks(modifiedSince, completedSince, workspace, section, project, assignee, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get tasks from a project
     * Returns the compact task records for all tasks within the given project, ordered by their priority within the project. Tasks can exist in more than one project at a time.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> getTasksForProject(String projectGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/tasks".replace("{project_gid}", projectGid);
        itest("evosuite", 367).given(projectGid, "/tasks/1QIi<h74Xf'O`Z/duplicate").checkEq(path, "/projects//tasks/1QIi<h74Xf'O`Z/duplicate/tasks");
        itest("randoop", 367).given(projectGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/projects//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/tasks");
        itest("randoop", 367).given(projectGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tasks");
        itest("evosuite", 367).given(projectGid, ".qf=;/XQ[h5$3WB);kd").checkEq(path, "/projects/.qf=;/XQ[h5$3WB);kd/tasks");
        itest("randoop", 367).given(projectGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/tasks");
        itest("evosuite", 367).given(projectGid, "'2j*^}8]]").checkEq(path, "/projects/'2j*^}8]]/tasks");
        itest("randoop", 367).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/tasks");
        itest("randoop", 367).given(projectGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("randoop", 367).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/tasks");
        itest("evosuite", 367).given(projectGid, "QEb19sG\"i4=|_?%").checkEq(path, "/projects/QEb19sG\"i4=|_?%/tasks");
        itest("randoop", 367).given(projectGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 367).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/tasks");
        itest("randoop", 367).given(projectGid, "/tags").checkEq(path, "/projects//tags/tasks");
        itest("randoop", 367).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/tasks");
        itest("randoop", 367).given(projectGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject/tasks");
        itest("randoop", 367).given(projectGid, "Server Error").checkEq(path, "/projects/Server Error/tasks");
        itest("randoop", 367).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/tasks");
        itest("evosuite", 367).given(projectGid, "").checkEq(path, "/projects//tasks");
        itest("randoop", 367).given(projectGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks");
        itest("randoop", 367).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks");
        itest("randoop", 367).given(projectGid, "").checkEq(path, "/projects//tasks");
        itest("randoop", 367).given(projectGid, "POST").checkEq(path, "/projects/POST/tasks");
        itest("randoop", 367).given(projectGid, "/workspaces/").checkEq(path, "/projects//workspaces//tasks");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Task> getTasksForProject(String projectGid) throws IOException {
        return getTasksForProject(projectGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get tasks from a section
     * *Board view only*: Returns the compact section records for all tasks within the given section.
     * @param sectionGid The globally unique identifier for the section. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> getTasksForSection(String sectionGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/sections/{section_gid}/tasks".replace("{section_gid}", sectionGid);
        itest("randoop", 393).given(sectionGid, "/attachments/Not Found").checkEq(path, "/sections//attachments/Not Found/tasks");
        itest("randoop", 393).given(sectionGid, "/portfolios/").checkEq(path, "/sections//portfolios//tasks");
        itest("randoop", 393).given(sectionGid, "/webhooks/NoAuthorizationError").checkEq(path, "/sections//webhooks/NoAuthorizationError/tasks");
        itest("randoop", 393).given(sectionGid, "GET").checkEq(path, "/sections/GET/tasks");
        itest("randoop", 393).given(sectionGid, "POST").checkEq(path, "/sections/POST/tasks");
        itest("randoop", 393).given(sectionGid, "/tags/Payment Required").checkEq(path, "/sections//tags/Payment Required/tasks");
        itest("randoop", 393).given(sectionGid, "NoAuthorizationError").checkEq(path, "/sections/NoAuthorizationError/tasks");
        itest("randoop", 393).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/tasks");
        itest("randoop", 393).given(sectionGid, "200").checkEq(path, "/sections/200/tasks");
        itest("randoop", 393).given(sectionGid, "").checkEq(path, "/sections//tasks");
        itest("evosuite", 393).given(sectionGid, "%WL<y").checkEq(path, "/sections/%WL<y/tasks");
        itest("randoop", 393).given(sectionGid, "Server Error").checkEq(path, "/sections/Server Error/tasks");
        itest("randoop", 393).given(sectionGid, "Sync token invalid or too old").checkEq(path, "/sections/Sync token invalid or too old/tasks");
        itest("randoop", 393).given(sectionGid, "0").checkEq(path, "/sections/0/tasks");
        itest("randoop", 393).given(sectionGid, "Rate Limit Enforced").checkEq(path, "/sections/Rate Limit Enforced/tasks");
        itest("randoop", 393).given(sectionGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/sections/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tasks");
        itest("randoop", 393).given(sectionGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("evosuite", 393).given(sectionGid, "/tasks/{task_gid}/addProject").checkEq(path, "/sections//tasks/{task_gid}/addProject/tasks");
        itest("randoop", 393).given(sectionGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/sections/urn:ietf:wg:oauth:2.0:oob/tasks");
        itest("evosuite", 393).given(sectionGid, "Qe'Tdr^3:ed`a1").checkEq(path, "/sections/Qe'Tdr^3:ed`a1/tasks");
        itest("evosuite", 393).given(sectionGid, "/tasks//tasks/{task_gid}").checkEq(path, "/sections//tasks//tasks/{task_gid}/tasks");
        itest("evosuite", 393).given(sectionGid, "").checkEq(path, "/sections//tasks");
        itest("randoop", 393).given(sectionGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/sections//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 393).given(sectionGid, "Invalid Request").checkEq(path, "/sections/Invalid Request/tasks");
        itest("randoop", 393).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("randoop", 393).given(sectionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks");
        itest("randoop", 393).given(sectionGid, "Not Found").checkEq(path, "/sections/Not Found/tasks");
        itest("evosuite", 393).given(sectionGid, "com.github.javaparser.ast.visitor.NoCommentEqualsVisitor").checkEq(path, "/sections/com.github.javaparser.ast.visitor.NoCommentEqualsVisitor/tasks");
        itest("randoop", 393).given(sectionGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/sections//projects/Rate Limit Enforced/sections/tasks");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Task> getTasksForSection(String sectionGid) throws IOException {
        return getTasksForSection(sectionGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get tasks from a tag
     * Returns the compact task records for all tasks with the given tag. Tasks can have more than one tag at a time.
     * @param tagGid Globally unique identifier for the tag. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> getTasksForTag(String tagGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tags/{tag_gid}/tasks".replace("{tag_gid}", tagGid);
        itest("randoop", 419).given(tagGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tags//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("randoop", 419).given(tagGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: 200/tasks");
        itest("randoop", 419).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 419).given(tagGid, "Payment Required").checkEq(path, "/tags/Payment Required/tasks");
        itest("randoop", 419).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/tasks");
        itest("randoop", 419).given(tagGid, "Forbidden").checkEq(path, "/tags/Forbidden/tasks");
        itest("randoop", 419).given(tagGid, "/tags").checkEq(path, "/tags//tags/tasks");
        itest("randoop", 419).given(tagGid, "GET").checkEq(path, "/tags/GET/tasks");
        itest("randoop", 419).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks");
        itest("randoop", 419).given(tagGid, "").checkEq(path, "/tags//tasks");
        itest("randoop", 419).given(tagGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tags//goals/{goal_gid}/addSubgoal/tasks");
        itest("randoop", 419).given(tagGid, "Invalid Request").checkEq(path, "/tags/Invalid Request/tasks");
        itest("randoop", 419).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/tasks");
        itest("randoop", 419).given(tagGid, "NoAuthorizationError").checkEq(path, "/tags/NoAuthorizationError/tasks");
        itest("evosuite", 419).given(tagGid, "#N0N/8wU(g/]|JbB+").checkEq(path, "/tags/#N0N/8wU(g/]|JbB+/tasks");
        itest("randoop", 419).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/tasks");
        itest("randoop", 419).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("randoop", 419).given(tagGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tags/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("randoop", 419).given(tagGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tags/com.asana.errors.AsanaError: hi!/tasks");
        itest("evosuite", 419).given(tagGid, "projects.all").checkEq(path, "/tags/projects.all/tasks");
        itest("randoop", 419).given(tagGid, "Server Error").checkEq(path, "/tags/Server Error/tasks");
        itest("evosuite", 419).given(tagGid, "OTNjje").checkEq(path, "/tags/OTNjje/tasks");
        itest("evosuite", 419).given(tagGid, "").checkEq(path, "/tags//tasks");
        itest("randoop", 419).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("evosuite", 419).given(tagGid, "assignee").checkEq(path, "/tags/assignee/tasks");
        itest("randoop", 419).given(tagGid, "/attachments/Not Found").checkEq(path, "/tags//attachments/Not Found/tasks");
        itest("randoop", 419).given(tagGid, "10").checkEq(path, "/tags/10/tasks");
        itest("randoop", 419).given(tagGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tags//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Task> getTasksForTag(String tagGid) throws IOException {
        return getTasksForTag(tagGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get tasks from a user task list
     * Returns the compact list of tasks in a user’s My Tasks list. *Note: Access control is enforced for this endpoint as with all Asana API endpoints, meaning a user’s private tasks will be filtered out if the API-authenticated user does not have access to them.* *Note: Both complete and incomplete tasks are returned by default unless they are filtered out (for example, setting &#x60;completed_since&#x3D;now&#x60; will return only incomplete tasks, which is the default view for “My Tasks” in Asana.)*
     * @param userTaskListGid Globally unique identifier for the user task list. (required)
     * @param completedSince Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*.  (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> getTasksForUserTaskList(String userTaskListGid, String completedSince, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/user_task_lists/{user_task_list_gid}/tasks".replace("{user_task_list_gid}", userTaskListGid);
        itest("randoop", 446).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("evosuite", 446).given(userTaskListGid, "").checkEq(path, "/user_task_lists//tasks");
        itest("evosuite", 446).given(userTaskListGid, "BuC").checkEq(path, "/user_task_lists/BuC/tasks");
        itest("randoop", 446).given(userTaskListGid, "").checkEq(path, "/user_task_lists//tasks");
        itest("evosuite", 446).given(userTaskListGid, "=|(w_W+GrjF`EY32_]").checkEq(path, "/user_task_lists/=|(w_W+GrjF`EY32_]/tasks");
        itest("randoop", 446).given(userTaskListGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/user_task_lists/com.asana.errors.PremiumOnlyError: Payment Required/tasks");
        itest("randoop", 446).given(userTaskListGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/user_task_lists/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("evosuite", 446).given(userTaskListGid, "http.method").checkEq(path, "/user_task_lists/http.method/tasks");
        itest("randoop", 446).given(userTaskListGid, "/attachments/Not Found").checkEq(path, "/user_task_lists//attachments/Not Found/tasks");
        itest("randoop", 446).given(userTaskListGid, "NoAuthorizationError").checkEq(path, "/user_task_lists/NoAuthorizationError/tasks");
        itest("randoop", 446).given(userTaskListGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/user_task_lists//workspaces//goals/{goal_gid}/subgoals/tasks/tasks");
        itest("randoop", 446).given(userTaskListGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/user_task_lists//tasks//attachments/Not Found/addProject/tasks");
        itest("evosuite", 446).given(userTaskListGid, "z").checkEq(path, "/user_task_lists/z/tasks");
        itest("randoop", 446).given(userTaskListGid, "0").checkEq(path, "/user_task_lists/0/tasks");
        itest("evosuite", 446).given(userTaskListGid, "Z:q#d").checkEq(path, "/user_task_lists/Z:q#d/tasks");
        itest("randoop", 446).given(userTaskListGid, "/goals/Sync token invalid or too old").checkEq(path, "/user_task_lists//goals/Sync token invalid or too old/tasks");
        itest("randoop", 446).given(userTaskListGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/user_task_lists/urn:ietf:wg:oauth:2.0:oob/tasks");
        itest("randoop", 446).given(userTaskListGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/user_task_lists//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks");
        itest("randoop", 446).given(userTaskListGid, "Forbidden").checkEq(path, "/user_task_lists/Forbidden/tasks");
        itest("randoop", 446).given(userTaskListGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/user_task_lists/com.asana.errors.RetryableAsanaError: /portfolios//tasks");
        itest("randoop", 446).given(userTaskListGid, "Not Found").checkEq(path, "/user_task_lists/Not Found/tasks");
        itest("randoop", 446).given(userTaskListGid, "POST").checkEq(path, "/user_task_lists/POST/tasks");
        itest("randoop", 446).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 446).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject/tasks");
        itest("randoop", 446).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks");
        itest("evosuite", 446).given(userTaskListGid, "&AdukK}[j-1G6M54ygl").checkEq(path, "/user_task_lists/&AdukK}[j-1G6M54ygl/tasks");
        itest("randoop", 446).given(userTaskListGid, "/tags/Payment Required").checkEq(path, "/user_task_lists//tags/Payment Required/tasks");
        itest("randoop", 446).given(userTaskListGid, "Rate Limit Enforced").checkEq(path, "/user_task_lists/Rate Limit Enforced/tasks");
        itest("randoop", 446).given(userTaskListGid, "GET").checkEq(path, "/user_task_lists/GET/tasks");
        itest("randoop", 446).given(userTaskListGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/user_task_lists/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/tasks");
        itest("randoop", 446).given(userTaskListGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/user_task_lists/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("completed_since", completedSince).query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Task> getTasksForUserTaskList(String userTaskListGid, String completedSince) throws IOException {
        return getTasksForUserTaskList(userTaskListGid, completedSince, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Unlink dependencies from a task
     * Unlinks a set of dependencies from this task.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> removeDependenciesForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/removeDependencies".replace("{task_gid}", taskGid);
        itest("evosuite", 471).given(taskGid, "").checkEq(path, "/tasks//removeDependencies");
        itest("randoop", 471).given(taskGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/tasks/com.asana.errors.AsanaError: NoAuthorizationError/removeDependencies");
        itest("randoop", 471).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/removeDependencies");
        itest("randoop", 471).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeDependencies");
        itest("randoop", 471).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeDependencies");
        itest("randoop", 471).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeDependencies");
        itest("randoop", 471).given(taskGid, "").checkEq(path, "/tasks//removeDependencies");
        itest("randoop", 471).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/removeDependencies");
        itest("randoop", 471).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeDependencies");
        itest("randoop", 471).given(taskGid, "POST").checkEq(path, "/tasks/POST/removeDependencies");
        itest("randoop", 471).given(taskGid, "0").checkEq(path, "/tasks/0/removeDependencies");
        itest("evosuite", 471).given(taskGid, "iQ? ]=V").checkEq(path, "/tasks/iQ? ]=V/removeDependencies");
        itest("randoop", 471).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeDependencies");
        itest("evosuite", 471).given(taskGid, "}'xYefv43,vo").checkEq(path, "/tasks/}'xYefv43,vo/removeDependencies");
        itest("randoop", 471).given(taskGid, "/tags").checkEq(path, "/tasks//tags/removeDependencies");
        itest("randoop", 471).given(taskGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/removeDependencies");
        itest("randoop", 471).given(taskGid, "100").checkEq(path, "/tasks/100/removeDependencies");
        itest("randoop", 471).given(taskGid, "GET").checkEq(path, "/tasks/GET/removeDependencies");
        itest("randoop", 471).given(taskGid, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/removeDependencies");
        itest("randoop", 471).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/removeDependencies");
        itest("randoop", 471).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/removeDependencies");
        itest("randoop", 471).given(taskGid, "/project_statuses/Server Error").checkEq(path, "/tasks//project_statuses/Server Error/removeDependencies");
        itest("randoop", 471).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeDependencies");
        itest("randoop", 471).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/removeDependencies");
        itest("evosuite", 471).given(taskGid, "S.:S#K<&").checkEq(path, "/tasks/S.:S#K<&/removeDependencies");
        itest("randoop", 471).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/removeDependencies");
        itest("evosuite", 471).given(taskGid, "h.N<`3POMP").checkEq(path, "/tasks/h.N<`3POMP/removeDependencies");
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public CollectionRequest<JsonElement> removeDependenciesForTask(String taskGid) throws IOException {
        return removeDependenciesForTask(taskGid, null, false);
    }

    /**
     * Unlink dependents from a task
     * Unlinks a set of dependents from this task.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<JsonElement> removeDependentsForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/removeDependents".replace("{task_gid}", taskGid);
        itest("randoop", 493).given(taskGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: 200/removeDependents");
        itest("randoop", 493).given(taskGid, "/tags").checkEq(path, "/tasks//tags/removeDependents");
        itest("randoop", 493).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/removeDependents");
        itest("evosuite", 493).given(taskGid, "@L6q?&4HA").checkEq(path, "/tasks/@L6q?&4HA/removeDependents");
        itest("randoop", 493).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/removeDependents");
        itest("randoop", 493).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/removeDependents");
        itest("randoop", 493).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeDependents");
        itest("randoop", 493).given(taskGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/removeDependents");
        itest("randoop", 493).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeDependents");
        itest("evosuite", 493).given(taskGid, "Ul").checkEq(path, "/tasks/Ul/removeDependents");
        itest("randoop", 493).given(taskGid, "/workspaces/").checkEq(path, "/tasks//workspaces//removeDependents");
        itest("randoop", 493).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeDependents");
        itest("randoop", 493).given(taskGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/removeDependents");
        itest("randoop", 493).given(taskGid, "10").checkEq(path, "/tasks/10/removeDependents");
        itest("randoop", 493).given(taskGid, "POST").checkEq(path, "/tasks/POST/removeDependents");
        itest("randoop", 493).given(taskGid, "").checkEq(path, "/tasks//removeDependents");
        itest("randoop", 493).given(taskGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeDependents");
        itest("randoop", 493).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/removeDependents");
        itest("randoop", 493).given(taskGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/removeDependents");
        itest("evosuite", 493).given(taskGid, "").checkEq(path, "/tasks//removeDependents");
        itest("randoop", 493).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/removeDependents");
        itest("randoop", 493).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/removeDependents");
        itest("randoop", 493).given(taskGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/removeDependents");
        itest("randoop", 493).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/removeDependents");
        itest("randoop", 493).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeDependents");
        CollectionRequest<JsonElement> req = new CollectionRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public CollectionRequest<JsonElement> removeDependentsForTask(String taskGid) throws IOException {
        return removeDependentsForTask(taskGid, null, false);
    }

    /**
     * Remove followers from a task
     * Removes each of the specified followers from the task if they are following. Returns the complete, updated record for the affected task.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeFollowerForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/removeFollowers".replace("{task_gid}", taskGid);
        itest("randoop", 515).given(taskGid, "100").checkEq(path, "/tasks/100/removeFollowers");
        itest("evosuite", 515).given(taskGid, "com.asana.resources.gen.WorkspacesBase").checkEq(path, "/tasks/com.asana.resources.gen.WorkspacesBase/removeFollowers");
        itest("evosuite", 515).given(taskGid, "hIq$p{8b7xQUp0;*").checkEq(path, "/tasks/hIq$p{8b7xQUp0;*/removeFollowers");
        itest("randoop", 515).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeFollowers");
        itest("randoop", 515).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/removeFollowers");
        itest("evosuite", 515).given(taskGid, "projec(Uts.al{").checkEq(path, "/tasks/projec(Uts.al{/removeFollowers");
        itest("randoop", 515).given(taskGid, "200").checkEq(path, "/tasks/200/removeFollowers");
        itest("randoop", 515).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/removeFollowers");
        itest("evosuite", 515).given(taskGid, "").checkEq(path, "/tasks//removeFollowers");
        itest("randoop", 515).given(taskGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/removeFollowers");
        itest("randoop", 515).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/removeFollowers");
        itest("randoop", 515).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/removeFollowers");
        itest("randoop", 515).given(taskGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//stories//goals/{goal_gid}/addSubgoal/removeFollowers");
        itest("randoop", 515).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/removeFollowers");
        itest("randoop", 515).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/removeFollowers");
        itest("randoop", 515).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/removeFollowers");
        itest("randoop", 515).given(taskGid, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/removeFollowers");
        itest("randoop", 515).given(taskGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeFollowers");
        itest("evosuite", 515).given(taskGid, "/tasks/sFt<zVEF{dp/setParent").checkEq(path, "/tasks//tasks/sFt<zVEF{dp/setParent/removeFollowers");
        itest("randoop", 515).given(taskGid, "/attachments/").checkEq(path, "/tasks//attachments//removeFollowers");
        itest("randoop", 515).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/removeFollowers");
        itest("randoop", 515).given(taskGid, "/tasks/200/addProject").checkEq(path, "/tasks//tasks/200/addProject/removeFollowers");
        itest("randoop", 515).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/removeFollowers");
        itest("randoop", 515).given(taskGid, "GET").checkEq(path, "/tasks/GET/removeFollowers");
        itest("randoop", 515).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeFollowers");
        itest("randoop", 515).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeFollowers");
        itest("randoop", 515).given(taskGid, "/workspaces//addUser").checkEq(path, "/tasks//workspaces//addUser/removeFollowers");
        itest("randoop", 515).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeFollowers");
        itest("evosuite", 515).given(taskGid, "-BU8%bPz/lCSLn%J[kb").checkEq(path, "/tasks/-BU8%bPz/lCSLn%J[kb/removeFollowers");
        itest("randoop", 515).given(taskGid, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/removeFollowers");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeFollowerForTask(String taskGid) throws IOException {
        return removeFollowerForTask(taskGid, null, false);
    }

    /**
     * Remove a project from a task
     * Removes the task from the specified project. The task will still exist in the system, but it will not be in the project anymore.  Returns an empty data block.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeProjectForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/removeProject".replace("{task_gid}", taskGid);
        itest("randoop", 537).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/removeProject");
        itest("randoop", 537).given(taskGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/removeProject");
        itest("randoop", 537).given(taskGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeProject");
        itest("randoop", 537).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/removeProject");
        itest("randoop", 537).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/removeProject");
        itest("randoop", 537).given(taskGid, "-1").checkEq(path, "/tasks/-1/removeProject");
        itest("evosuite", 537).given(taskGid, "VhrLd}q").checkEq(path, "/tasks/VhrLd}q/removeProject");
        itest("randoop", 537).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeProject");
        itest("randoop", 537).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/removeProject");
        itest("randoop", 537).given(taskGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeProject");
        itest("randoop", 537).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeProject");
        itest("randoop", 537).given(taskGid, "10").checkEq(path, "/tasks/10/removeProject");
        itest("randoop", 537).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/removeProject");
        itest("randoop", 537).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeProject");
        itest("randoop", 537).given(taskGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/removeProject");
        itest("evosuite", 537).given(taskGid, "'2j*j\"8- ").checkEq(path, "/tasks/'2j*j\"8- /removeProject");
        itest("evosuite", 537).given(taskGid, "sFt<zVEF{dp").checkEq(path, "/tasks/sFt<zVEF{dp/removeProject");
        itest("evosuite", 537).given(taskGid, "/portfolios/{portfolio_gid}/addMembers").checkEq(path, "/tasks//portfolios/{portfolio_gid}/addMembers/removeProject");
        itest("randoop", 537).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/removeProject");
        itest("randoop", 537).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/removeProject");
        itest("randoop", 537).given(taskGid, "0").checkEq(path, "/tasks/0/removeProject");
        itest("randoop", 537).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/removeProject");
        itest("randoop", 537).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/removeProject");
        itest("randoop", 537).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/removeProject");
        itest("evosuite", 537).given(taskGid, "").checkEq(path, "/tasks//removeProject");
        itest("randoop", 537).given(taskGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/removeProject");
        itest("randoop", 537).given(taskGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject");
        itest("randoop", 537).given(taskGid, "").checkEq(path, "/tasks//removeProject");
        itest("evosuite", 537).given(taskGid, "&AdukK}[j-1G6M54ygl").checkEq(path, "/tasks/&AdukK}[j-1G6M54ygl/removeProject");
        itest("randoop", 537).given(taskGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/tasks/com.asana.errors.InvalidRequestError: Invalid Request/removeProject");
        itest("randoop", 537).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error/removeProject");
        itest("randoop", 537).given(taskGid, "/tags").checkEq(path, "/tasks//tags/removeProject");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeProjectForTask(String taskGid) throws IOException {
        return removeProjectForTask(taskGid, null, false);
    }

    /**
     * Remove a tag from a task
     * Removes a tag from a task. Returns an empty data block.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeTagForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/removeTag".replace("{task_gid}", taskGid);
        itest("randoop", 559).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/removeTag");
        itest("randoop", 559).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeTag");
        itest("evosuite", 559).given(taskGid, "/tasks").checkEq(path, "/tasks//tasks/removeTag");
        itest("randoop", 559).given(taskGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//stories//goals/{goal_gid}/addSubgoal/removeTag");
        itest("evosuite", 559).given(taskGid, "").checkEq(path, "/tasks//removeTag");
        itest("randoop", 559).given(taskGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeTag");
        itest("randoop", 559).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/removeTag");
        itest("randoop", 559).given(taskGid, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/removeTag");
        itest("evosuite", 559).given(taskGid, "POST").checkEq(path, "/tasks/POST/removeTag");
        itest("randoop", 559).given(taskGid, "/portfolios/").checkEq(path, "/tasks//portfolios//removeTag");
        itest("randoop", 559).given(taskGid, "").checkEq(path, "/tasks//removeTag");
        itest("randoop", 559).given(taskGid, "/tags").checkEq(path, "/tasks//tags/removeTag");
        itest("evosuite", 559).given(taskGid, "com.github.javaparser.metamodel.SwitchExprMetaModel").checkEq(path, "/tasks/com.github.javaparser.metamodel.SwitchExprMetaModel/removeTag");
        itest("randoop", 559).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/removeTag");
        itest("randoop", 559).given(taskGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/removeTag");
        itest("randoop", 559).given(taskGid, "0").checkEq(path, "/tasks/0/removeTag");
        itest("randoop", 559).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeTag");
        itest("randoop", 559).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/removeTag");
        itest("randoop", 559).given(taskGid, "200").checkEq(path, "/tasks/200/removeTag");
        itest("randoop", 559).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeTag");
        itest("randoop", 559).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeTag");
        itest("randoop", 559).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/removeTag");
        itest("randoop", 559).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeTag");
        itest("randoop", 559).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/removeTag");
        itest("randoop", 559).given(taskGid, "GET").checkEq(path, "/tasks/GET/removeTag");
        itest("randoop", 559).given(taskGid, "/workspaces/").checkEq(path, "/tasks//workspaces//removeTag");
        itest("randoop", 559).given(taskGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/removeTag");
        itest("randoop", 559).given(taskGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeTag");
        itest("randoop", 559).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/removeTag");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeTagForTask(String taskGid) throws IOException {
        return removeTagForTask(taskGid, null, false);
    }

    /**
     * Search tasks in a workspace
     * To mirror the functionality of the Asana web app&#x27;s advanced search feature, the Asana API has a task search endpoint that allows you to build complex filters to find and retrieve the exact data you need. #### Premium access Like the Asana web product&#x27;s advance search feature, this search endpoint will only be available to premium Asana users. A user is premium if any of the following is true:  - The workspace in which the search is being performed is a premium workspace - The user is a member of a premium team inside the workspace  Even if a user is only a member of a premium team inside a non-premium workspace, search will allow them to find data anywhere in the workspace, not just inside the premium team. Making a search request using credentials of a non-premium user will result in a &#x60;402 Payment Required&#x60; error. #### Pagination Search results are not stable; repeating the same query multiple times may return the data in a different order, even if the data do not change. Because of this, the traditional [pagination](https://developers.asana.com/docs/#pagination) available elsewhere in the Asana API is not available here. However, you can paginate manually by sorting the search results by their creation time and then modifying each subsequent query to exclude data you have already seen. Page sizes are limited to a maximum of 100 items, and can be specified by the &#x60;limit&#x60; query parameter. #### Eventual consistency Changes in Asana (regardless of whether they’re made though the web product or the API) are forwarded to our search infrastructure to be indexed. This process can take between 10 and 60 seconds to complete under normal operation, and longer during some production incidents. Making a change to a task that would alter its presence in a particular search query will not be reflected immediately. This is also true of the advanced search feature in the web product. #### Rate limits You may receive a &#x60;429 Too Many Requests&#x60; response if you hit any of our [rate limits](https://developers.asana.com/docs/#rate-limits). #### Custom field parameters | Parameter name | Custom field type | Accepted type | |---|---|---| | custom_fields.{gid}.is_set | All | Boolean | | custom_fields.{gid}.value | Text | String | | custom_fields.{gid}.value | Number | Number | | custom_fields.{gid}.value | Enum | Enum option ID | | custom_fields.{gid}.starts_with | Text only | String | | custom_fields.{gid}.ends_with | Text only | String | | custom_fields.{gid}.contains | Text only | String | | custom_fields.{gid}.less_than | Number only | Number | | custom_fields.{gid}.greater_than | Number only | Number |   For example, if the gid of the custom field is 12345, these query parameter to find tasks where it is set would be &#x60;custom_fields.12345.is_set&#x3D;true&#x60;. To match an exact value for an enum custom field, use the gid of the desired enum option and not the name of the enum option: &#x60;custom_fields.12345.value&#x3D;67890&#x60;.  Searching for multiple exact matches of a custom field is not supported.  *Note: If you specify &#x60;projects.any&#x60; and &#x60;sections.any&#x60;, you will receive tasks for the project **and** tasks for the section. If you&#x27;re looking for only tasks in a section, omit the &#x60;projects.any&#x60; from the request.*
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param sortAscending Default &#x60;false&#x60; (optional)
     * @param sortBy One of &#x60;due_date&#x60;, &#x60;created_at&#x60;, &#x60;completed_at&#x60;, &#x60;likes&#x60;, or &#x60;modified_at&#x60;, defaults to &#x60;modified_at&#x60; (optional)
     * @param isSubtask Filter to subtasks (optional)
     * @param completed Filter to completed tasks (optional)
     * @param hasAttachment Filter to tasks with attachments (optional)
     * @param isBlocked Filter to tasks with incomplete dependencies (optional)
     * @param isBlocking Filter to incomplete tasks with dependents (optional)
     * @param modifiedAtAfter ISO 8601 datetime string (optional)
     * @param modifiedAtBefore ISO 8601 datetime string (optional)
     * @param dueOn ISO 8601 date string or &#x60;null&#x60; (optional)
     * @param modifiedOn ISO 8601 date string or &#x60;null&#x60; (optional)
     * @param modifiedOnAfter ISO 8601 date string (optional)
     * @param modifiedOnBefore ISO 8601 date string (optional)
     * @param completedAtAfter ISO 8601 datetime string (optional)
     * @param completedAtBefore ISO 8601 datetime string (optional)
     * @param completedOn ISO 8601 date string or &#x60;null&#x60; (optional)
     * @param completedOnAfter ISO 8601 date string (optional)
     * @param completedOnBefore ISO 8601 date string (optional)
     * @param createdAtAfter ISO 8601 datetime string (optional)
     * @param dueOnAfter ISO 8601 date string (optional)
     * @param createdAtBefore ISO 8601 datetime string (optional)
     * @param createdOn ISO 8601 date string or &#x60;null&#x60; (optional)
     * @param createdOnAfter ISO 8601 date string (optional)
     * @param createdOnBefore ISO 8601 date string (optional)
     * @param startOn ISO 8601 date string or &#x60;null&#x60; (optional)
     * @param startOnAfter ISO 8601 date string (optional)
     * @param startOnBefore ISO 8601 date string (optional)
     * @param dueAtAfter ISO 8601 datetime string (optional)
     * @param dueAtBefore ISO 8601 datetime string (optional)
     * @param dueOnBefore ISO 8601 date string (optional)
     * @param commentedOnByNot Comma-separated list of user identifiers (optional)
     * @param likedByNot Comma-separated list of user identifiers (optional)
     * @param assignedByNot Comma-separated list of user identifiers (optional)
     * @param assignedByAny Comma-separated list of user identifiers (optional)
     * @param createdByNot Comma-separated list of user identifiers (optional)
     * @param createdByAny Comma-separated list of user identifiers (optional)
     * @param followersNot Comma-separated list of user identifiers (optional)
     * @param teamsAny Comma-separated list of team IDs (optional)
     * @param tagsAll Comma-separated list of tag IDs (optional)
     * @param tagsNot Comma-separated list of tag IDs (optional)
     * @param tagsAny Comma-separated list of tag IDs (optional)
     * @param sectionsAll Comma-separated list of section or column IDs (optional)
     * @param sectionsNot Comma-separated list of section or column IDs (optional)
     * @param sectionsAny Comma-separated list of section or column IDs (optional)
     * @param projectsAll Comma-separated list of project IDs (optional)
     * @param projectsNot Comma-separated list of project IDs (optional)
     * @param projectsAny Comma-separated list of project IDs (optional)
     * @param portfoliosAny Comma-separated list of portfolio IDs (optional)
     * @param assigneeNot Comma-separated list of user identifiers (optional)
     * @param assigneeAny Comma-separated list of user identifiers (optional)
     * @param resourceSubtype Filters results by the task&#x27;s resource_subtype (optional)
     * @param text Performs full-text search on both task name and description (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Task> searchTasksForWorkspace(String workspaceGid, Boolean sortAscending, String sortBy, Boolean isSubtask, Boolean completed, Boolean hasAttachment, Boolean isBlocked, Boolean isBlocking, OffsetDateTime modifiedAtAfter, OffsetDateTime modifiedAtBefore, LocalDate dueOn, LocalDate modifiedOn, LocalDate modifiedOnAfter, LocalDate modifiedOnBefore, OffsetDateTime completedAtAfter, OffsetDateTime completedAtBefore, LocalDate completedOn, LocalDate completedOnAfter, LocalDate completedOnBefore, OffsetDateTime createdAtAfter, LocalDate dueOnAfter, OffsetDateTime createdAtBefore, LocalDate createdOn, LocalDate createdOnAfter, LocalDate createdOnBefore, LocalDate startOn, LocalDate startOnAfter, LocalDate startOnBefore, OffsetDateTime dueAtAfter, OffsetDateTime dueAtBefore, LocalDate dueOnBefore, String commentedOnByNot, String likedByNot, String assignedByNot, String assignedByAny, String createdByNot, String createdByAny, String followersNot, String teamsAny, String tagsAll, String tagsNot, String tagsAny, String sectionsAll, String sectionsNot, String sectionsAny, String projectsAll, String projectsNot, String projectsAny, String portfoliosAny, String assigneeNot, String assigneeAny, String resourceSubtype, String text, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/tasks/search".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 633).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/tasks/search");
        itest("randoop", 633).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks/search");
        itest("evosuite", 633).given(workspaceGid, "VlCUfQT;n+").checkEq(path, "/workspaces/VlCUfQT;n+/tasks/search");
        itest("evosuite", 633).given(workspaceGid, "#X.QD").checkEq(path, "/workspaces/#X.QD/tasks/search");
        itest("randoop", 633).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found/tasks/search");
        itest("randoop", 633).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/tasks/search");
        itest("randoop", 633).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks/search");
        itest("randoop", 633).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/tasks/search");
        itest("randoop", 633).given(workspaceGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tasks/search");
        CollectionRequest<Task> req = new CollectionRequest<Task>(this, Task.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("text", text).query("resource_subtype", resourceSubtype).query("assignee.any", assigneeAny).query("assignee.not", assigneeNot).query("portfolios.any", portfoliosAny).query("projects.any", projectsAny).query("projects.not", projectsNot).query("projects.all", projectsAll).query("sections.any", sectionsAny).query("sections.not", sectionsNot).query("sections.all", sectionsAll).query("tags.any", tagsAny).query("tags.not", tagsNot).query("tags.all", tagsAll).query("teams.any", teamsAny).query("followers.not", followersNot).query("created_by.any", createdByAny).query("created_by.not", createdByNot).query("assigned_by.any", assignedByAny).query("assigned_by.not", assignedByNot).query("liked_by.not", likedByNot).query("commented_on_by.not", commentedOnByNot).query("due_on.before", dueOnBefore).query("due_on.after", dueOnAfter).query("due_on", dueOn).query("due_at.before", dueAtBefore).query("due_at.after", dueAtAfter).query("start_on.before", startOnBefore).query("start_on.after", startOnAfter).query("start_on", startOn).query("created_on.before", createdOnBefore).query("created_on.after", createdOnAfter).query("created_on", createdOn).query("created_at.before", createdAtBefore).query("created_at.after", createdAtAfter).query("completed_on.before", completedOnBefore).query("completed_on.after", completedOnAfter).query("completed_on", completedOn).query("completed_at.before", completedAtBefore).query("completed_at.after", completedAtAfter).query("modified_on.before", modifiedOnBefore).query("modified_on.after", modifiedOnAfter).query("modified_on", modifiedOn).query("modified_at.before", modifiedAtBefore).query("modified_at.after", modifiedAtAfter).query("is_blocking", isBlocking).query("is_blocked", isBlocked).query("has_attachment", hasAttachment).query("completed", completed).query("is_subtask", isSubtask).query("sort_by", sortBy).query("sort_ascending", sortAscending);
        return req;
    }

    public CollectionRequest<Task> searchTasksForWorkspace(String workspaceGid, Boolean sortAscending, String sortBy, Boolean isSubtask, Boolean completed, Boolean hasAttachment, Boolean isBlocked, Boolean isBlocking, OffsetDateTime modifiedAtAfter, OffsetDateTime modifiedAtBefore, LocalDate dueOn, LocalDate modifiedOn, LocalDate modifiedOnAfter, LocalDate modifiedOnBefore, OffsetDateTime completedAtAfter, OffsetDateTime completedAtBefore, LocalDate completedOn, LocalDate completedOnAfter, LocalDate completedOnBefore, OffsetDateTime createdAtAfter, LocalDate dueOnAfter, OffsetDateTime createdAtBefore, LocalDate createdOn, LocalDate createdOnAfter, LocalDate createdOnBefore, LocalDate startOn, LocalDate startOnAfter, LocalDate startOnBefore, OffsetDateTime dueAtAfter, OffsetDateTime dueAtBefore, LocalDate dueOnBefore, String commentedOnByNot, String likedByNot, String assignedByNot, String assignedByAny, String createdByNot, String createdByAny, String followersNot, String teamsAny, String tagsAll, String tagsNot, String tagsAny, String sectionsAll, String sectionsNot, String sectionsAny, String projectsAll, String projectsNot, String projectsAny, String portfoliosAny, String assigneeNot, String assigneeAny, String resourceSubtype, String text) throws IOException {
        return searchTasksForWorkspace(workspaceGid, sortAscending, sortBy, isSubtask, completed, hasAttachment, isBlocked, isBlocking, modifiedAtAfter, modifiedAtBefore, dueOn, modifiedOn, modifiedOnAfter, modifiedOnBefore, completedAtAfter, completedAtBefore, completedOn, completedOnAfter, completedOnBefore, createdAtAfter, dueOnAfter, createdAtBefore, createdOn, createdOnAfter, createdOnBefore, startOn, startOnAfter, startOnBefore, dueAtAfter, dueAtBefore, dueOnBefore, commentedOnByNot, likedByNot, assignedByNot, assignedByAny, createdByNot, createdByAny, followersNot, teamsAny, tagsAll, tagsNot, tagsAny, sectionsAll, sectionsNot, sectionsAny, projectsAll, projectsNot, projectsAny, portfoliosAny, assigneeNot, assigneeAny, resourceSubtype, text, null, false);
    }

    /**
     * Set the parent of a task
     * parent, or no parent task at all. Returns an empty data block. When using &#x60;insert_before&#x60; and &#x60;insert_after&#x60;, at most one of those two options can be specified, and they must already be subtasks of the parent.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Task> setParentForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/setParent".replace("{task_gid}", taskGid);
        itest("randoop", 707).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/setParent");
        itest("evosuite", 707).given(taskGid, "$V@htq7L[").checkEq(path, "/tasks/$V@htq7L[/setParent");
        itest("evosuite", 707).given(taskGid, "").checkEq(path, "/tasks//setParent");
        itest("randoop", 707).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/setParent");
        itest("randoop", 707).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/setParent");
        itest("randoop", 707).given(taskGid, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/setParent");
        itest("randoop", 707).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//setParent");
        itest("randoop", 707).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/setParent");
        itest("randoop", 707).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/setParent");
        itest("randoop", 707).given(taskGid, "/tasks/200/addProject").checkEq(path, "/tasks//tasks/200/addProject/setParent");
        itest("evosuite", 707).given(taskGid, "d{)N`qI#,gw;R!").checkEq(path, "/tasks/d{)N`qI#,gw;R!/setParent");
        itest("randoop", 707).given(taskGid, "/tags").checkEq(path, "/tasks//tags/setParent");
        itest("randoop", 707).given(taskGid, "100").checkEq(path, "/tasks/100/setParent");
        itest("randoop", 707).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/setParent");
        itest("randoop", 707).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/setParent");
        itest("randoop", 707).given(taskGid, "200").checkEq(path, "/tasks/200/setParent");
        itest("evosuite", 707).given(taskGid, "@9").checkEq(path, "/tasks/@9/setParent");
        itest("randoop", 707).given(taskGid, "").checkEq(path, "/tasks//setParent");
        itest("randoop", 707).given(taskGid, "0").checkEq(path, "/tasks/0/setParent");
        itest("evosuite", 707).given(taskGid, "projects.all").checkEq(path, "/tasks/projects.all/setParent");
        itest("randoop", 707).given(taskGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/setParent");
        itest("randoop", 707).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/setParent");
        itest("randoop", 707).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error/setParent");
        itest("evosuite", 707).given(taskGid, "sFt<zVEF{dp").checkEq(path, "/tasks/sFt<zVEF{dp/setParent");
        itest("randoop", 707).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/setParent");
        itest("randoop", 707).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/setParent");
        ItemRequest<Task> req = new ItemRequest<Task>(this, Task.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Task> setParentForTask(String taskGid) throws IOException {
        return setParentForTask(taskGid, null, false);
    }

    /**
     * Update a task
     * A specific, existing task can be updated by making a PUT request on the URL for that task. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated task record.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Task)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Task> updateTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}".replace("{task_gid}", taskGid);
        itest("randoop", 729).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced");
        itest("randoop", 729).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 729).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob");
        itest("evosuite", 729).given(taskGid, "/tasks/{task_gid}").checkEq(path, "/tasks//tasks/{task_gid}");
        itest("randoop", 729).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!");
        itest("randoop", 729).given(taskGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections");
        itest("randoop", 729).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found");
        itest("randoop", 729).given(taskGid, "0").checkEq(path, "/tasks/0");
        itest("evosuite", 729).given(taskGid, "projects.any").checkEq(path, "/tasks/projects.any");
        itest("randoop", 729).given(taskGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("evosuite", 729).given(taskGid, "com.github.jauaparser.ParserConfiguration$UnicodeEscaBeProcessor").checkEq(path, "/tasks/com.github.jauaparser.ParserConfiguration$UnicodeEscaBeProcessor");
        itest("randoop", 729).given(taskGid, "/tags").checkEq(path, "/tasks//tags");
        itest("randoop", 729).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old");
        itest("randoop", 729).given(taskGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 729).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden");
        itest("randoop", 729).given(taskGid, "/projects/Not Found/removeFollowers").checkEq(path, "/tasks//projects/Not Found/removeFollowers");
        itest("randoop", 729).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 729).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required");
        itest("randoop", 729).given(taskGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 729).given(taskGid, "hi!").checkEq(path, "/tasks/hi!");
        itest("randoop", 729).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("evosuite", 729).given(taskGid, "/tasks//removeTag").checkEq(path, "/tasks//tasks//removeTag");
        itest("evosuite", 729).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 729).given(taskGid, "/portfolios/").checkEq(path, "/tasks//portfolios/");
        itest("randoop", 729).given(taskGid, "").checkEq(path, "/tasks/");
        itest("randoop", 729).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error");
        itest("randoop", 729).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request");
        itest("randoop", 729).given(taskGid, "POST").checkEq(path, "/tasks/POST");
        itest("evosuite", 729).given(taskGid, "modified_on.after").checkEq(path, "/tasks/modified_on.after");
        itest("randoop", 729).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal");
        itest("randoop", 729).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        ItemRequest<Task> req = new ItemRequest<Task>(this, Task.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Task> updateTask(String taskGid) throws IOException {
        return updateTask(taskGid, null, false);
    }
}
