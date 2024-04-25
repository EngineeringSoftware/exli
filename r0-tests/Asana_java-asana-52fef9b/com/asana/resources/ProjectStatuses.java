package com.asana.resources;

import com.asana.Client;
import com.asana.models.ProjectStatus;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.ProjectStatusesBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class ProjectStatuses extends ProjectStatusesBase {

    public ProjectStatuses(Client client) {
        super(client);
    }

    /**
     * Creates a new status update on the project.
     *
     * Returns the full record of the newly created project status update.
     *
     * @param  project The project on which to create a status update.
     * @return Request object
     */
    public ItemRequest<ProjectStatus> createInProject(String project) {
        String path = String.format("/projects/%s/project_statuses", project);
        itest("randoop", 24).given(project, "POST").checkEq(path, "/projects/POST/project_statuses");
        itest("randoop", 24).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/project_statuses");
        itest("randoop", 24).given(project, "hi!").checkEq(path, "/projects/hi!/project_statuses");
        itest("randoop", 24).given(project, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/project_statuses");
        itest("randoop", 24).given(project, "/portfolios/").checkEq(path, "/projects//portfolios//project_statuses");
        itest("randoop", 24).given(project, "com.asana.errors.ServerError: Server Error").checkEq(path, "/projects/com.asana.errors.ServerError: Server Error/project_statuses");
        itest("randoop", 24).given(project, "10").checkEq(path, "/projects/10/project_statuses");
        itest("randoop", 24).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/project_statuses");
        itest("randoop", 24).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/project_statuses");
        itest("evosuite", 24).given(project, "ModuleDi&Wrective").checkEq(path, "/projects/ModuleDi&Wrective/project_statuses");
        itest("randoop", 24).given(project, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/project_statuses");
        itest("randoop", 24).given(project, "/organizations//teams").checkEq(path, "/projects//organizations//teams/project_statuses");
        itest("randoop", 24).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/project_statuses");
        itest("evosuite", 24).given(project, "_yh").checkEq(path, "/projects/_yh/project_statuses");
        itest("randoop", 24).given(project, "/workspaces/").checkEq(path, "/projects//workspaces//project_statuses");
        itest("randoop", 24).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/project_statuses");
        itest("randoop", 24).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/project_statuses");
        itest("randoop", 24).given(project, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/project_statuses");
        itest("evosuite", 24).given(project, "DELETE").checkEq(path, "/projects/DELETE/project_statuses");
        itest("randoop", 24).given(project, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required/project_statuses");
        itest("randoop", 24).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/project_statuses");
        itest("randoop", 24).given(project, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals/project_statuses");
        itest("randoop", 24).given(project, "/portfolios/GET/removeMembers").checkEq(path, "/projects//portfolios/GET/removeMembers/project_statuses");
        itest("randoop", 24).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/project_statuses");
        itest("evosuite", 24).given(project, "L#d+ UCk").checkEq(path, "/projects/L#d+ UCk/project_statuses");
        itest("evosuite", 24).given(project, null).checkEq(path, "/projects/null/project_statuses");
        itest("randoop", 24).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/project_statuses");
        return new ItemRequest<ProjectStatus>(this, ProjectStatus.class, path, "POST");
    }

    /**
     * Returns the compact project status update records for all updates on the project.
     *
     * @param  project The project to find status updates for.
     * @return Request object
     */
    public CollectionRequest<ProjectStatus> findByProject(String project) {
        String path = String.format("/projects/%s/project_statuses", project);
        itest("randoop", 36).given(project, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/project_statuses");
        itest("randoop", 36).given(project, "Not Found").checkEq(path, "/projects/Not Found/project_statuses");
        itest("randoop", 36).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/project_statuses");
        itest("evosuite", 36).given(project, "").checkEq(path, "/projects//project_statuses");
        itest("randoop", 36).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/project_statuses");
        itest("randoop", 36).given(project, "0").checkEq(path, "/projects/0/project_statuses");
        itest("randoop", 36).given(project, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/project_statuses");
        itest("randoop", 36).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/project_statuses");
        itest("randoop", 36).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/project_statuses");
        itest("randoop", 36).given(project, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200/project_statuses");
        itest("randoop", 36).given(project, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/projects/com.asana.errors.AsanaError: NoAuthorizationError/project_statuses");
        itest("evosuite", 36).given(project, "ModuleDi&Wrective").checkEq(path, "/projects/ModuleDi&Wrective/project_statuses");
        itest("randoop", 36).given(project, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//stories//goals/{goal_gid}/addSubgoal/project_statuses");
        itest("randoop", 36).given(project, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/project_statuses");
        itest("randoop", 36).given(project, "/tags").checkEq(path, "/projects//tags/project_statuses");
        itest("randoop", 36).given(project, "10").checkEq(path, "/projects/10/project_statuses");
        itest("evosuite", 36).given(project, null).checkEq(path, "/projects/null/project_statuses");
        itest("randoop", 36).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/project_statuses");
        itest("randoop", 36).given(project, "/tasks//attachments/Not Found/addProject").checkEq(path, "/projects//tasks//attachments/Not Found/addProject/project_statuses");
        itest("evosuite", 36).given(project, "DELETE").checkEq(path, "/projects/DELETE/project_statuses");
        return new CollectionRequest<ProjectStatus>(this, ProjectStatus.class, path, "GET");
    }

    /**
     * Returns the complete record for a single status update.
     *
     * @param  projectStatus The project status update to get.
     * @return Request object
     */
    public ItemRequest<ProjectStatus> findById(String projectStatus) {
        String path = String.format("/project_statuses/%s", projectStatus);
        itest("randoop", 48).given(projectStatus, "Not Found").checkEq(path, "/project_statuses/Not Found");
        itest("randoop", 48).given(projectStatus, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/project_statuses//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 48).given(projectStatus, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/project_statuses//goals/{goal_gid}/addSubgoal");
        itest("randoop", 48).given(projectStatus, "10").checkEq(path, "/project_statuses/10");
        itest("randoop", 48).given(projectStatus, "/projects/Rate Limit Enforced/sections").checkEq(path, "/project_statuses//projects/Rate Limit Enforced/sections");
        itest("randoop", 48).given(projectStatus, "GET").checkEq(path, "/project_statuses/GET");
        itest("randoop", 48).given(projectStatus, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/project_statuses/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 48).given(projectStatus, "Rate Limit Enforced").checkEq(path, "/project_statuses/Rate Limit Enforced");
        itest("randoop", 48).given(projectStatus, "Forbidden").checkEq(path, "/project_statuses/Forbidden");
        itest("evosuite", 48).given(projectStatus, "#!.D}lt").checkEq(path, "/project_statuses/#!.D}lt");
        itest("randoop", 48).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 48).given(projectStatus, "_yh").checkEq(path, "/project_statuses/_yh");
        itest("randoop", 48).given(projectStatus, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/project_statuses/com.asana.errors.AsanaError: NoAuthorizationError");
        itest("randoop", 48).given(projectStatus, "hi!").checkEq(path, "/project_statuses/hi!");
        itest("evosuite", 48).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=java.lang.String@0000000027&redirect_uri=java.lang.String@0000000029&response_type=java.lang.String@0000000031&state=java.lang.String@0000000029").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=java.lang.String@0000000027&redirect_uri=java.lang.String@0000000029&response_type=java.lang.String@0000000031&state=java.lang.String@0000000029");
        itest("randoop", 48).given(projectStatus, "Sync token invalid or too old").checkEq(path, "/project_statuses/Sync token invalid or too old");
        itest("randoop", 48).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 48).given(projectStatus, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/project_statuses//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 48).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("randoop", 48).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 48).given(projectStatus, "Invalid Request").checkEq(path, "/project_statuses/Invalid Request");
        itest("randoop", 48).given(projectStatus, "/tags/Payment Required").checkEq(path, "/project_statuses//tags/Payment Required");
        itest("randoop", 48).given(projectStatus, "NoAuthorizationError").checkEq(path, "/project_statuses/NoAuthorizationError");
        itest("randoop", 48).given(projectStatus, "Server Error").checkEq(path, "/project_statuses/Server Error");
        itest("randoop", 48).given(projectStatus, "Payment Required").checkEq(path, "/project_statuses/Payment Required");
        return new ItemRequest<ProjectStatus>(this, ProjectStatus.class, path, "GET");
    }

    /**
     * Deletes a specific, existing project status update.
     *
     * Returns an empty data record.
     *
     * @param  projectStatus The project status update to delete.
     * @return Request object
     */
    public ItemRequest<ProjectStatus> delete(String projectStatus) {
        String path = String.format("/project_statuses/%s", projectStatus);
        itest("evosuite", 62).given(projectStatus, "ModuleDi&Wrective").checkEq(path, "/project_statuses/ModuleDi&Wrective");
        itest("randoop", 62).given(projectStatus, "com.asana.errors.AsanaError: hi!").checkEq(path, "/project_statuses/com.asana.errors.AsanaError: hi!");
        itest("randoop", 62).given(projectStatus, "Sync token invalid or too old").checkEq(path, "/project_statuses/Sync token invalid or too old");
        itest("randoop", 62).given(projectStatus, "0").checkEq(path, "/project_statuses/0");
        itest("randoop", 62).given(projectStatus, "Not Found").checkEq(path, "/project_statuses/Not Found");
        itest("randoop", 62).given(projectStatus, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/project_statuses/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 62).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 62).given(projectStatus, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/project_statuses/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 62).given(projectStatus, "/webhooks/NoAuthorizationError").checkEq(path, "/project_statuses//webhooks/NoAuthorizationError");
        itest("randoop", 62).given(projectStatus, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/project_statuses/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 62).given(projectStatus, "").checkEq(path, "/project_statuses/");
        itest("randoop", 62).given(projectStatus, "Forbidden").checkEq(path, "/project_statuses/Forbidden");
        itest("randoop", 62).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 62).given(projectStatus, "n?5:k]!i").checkEq(path, "/project_statuses/n?5:k]!i");
        itest("randoop", 62).given(projectStatus, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/project_statuses/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 62).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 62).given(projectStatus, "Server Error").checkEq(path, "/project_statuses/Server Error");
        itest("evosuite", 62).given(projectStatus, "DELETE").checkEq(path, "/project_statuses/DELETE");
        itest("randoop", 62).given(projectStatus, "").checkEq(path, "/project_statuses/");
        itest("evosuite", 62).given(projectStatus, "IJBhM4^j*b`BTe,Vp").checkEq(path, "/project_statuses/IJBhM4^j*b`BTe,Vp");
        itest("randoop", 62).given(projectStatus, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/project_statuses//goals/{goal_gid}/addSubgoal");
        itest("randoop", 62).given(projectStatus, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        return new ItemRequest<ProjectStatus>(this, ProjectStatus.class, path, "DELETE");
    }
}
