package com.asana.resources;

import com.asana.Client;
import com.asana.models.Project;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.ProjectsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Projects extends ProjectsBase {

    public Projects(Client client) {
        super(client);
    }

    /**
     * Creates a new project in a workspace or team.
     *
     * Every project is required to be created in a specific workspace or
     * organization, and this cannot be changed once set. Note that you can use
     * the `workspace` parameter regardless of whether or not it is an
     * organization.
     *
     * If the workspace for your project _is_ an organization, you must also
     * supply a `team` to share the project with.
     *
     * Returns the full record of the newly created project.
     *
     * @return Request object
     */
    public ItemRequest<Project> create() {
        return new ItemRequest<Project>(this, Project.class, "/projects", "POST");
    }

    /**
     * If the workspace for your project _is_ an organization, you must also
     * supply a `team` to share the project with.
     *
     * Returns the full record of the newly created project.
     *
     * @param  workspace The workspace or organization to create the project in.
     * @return Request object
     */
    public ItemRequest<Project> createInWorkspace(String workspace) {
        String path = String.format("/workspaces/%s/projects", workspace);
        itest("randoop", 45).given(workspace, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/workspaces//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/projects");
        itest("randoop", 45).given(workspace, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//portfolio_memberships//goals/{goal_gid}/addSubgoal/projects");
        itest("randoop", 45).given(workspace, "Payment Required").checkEq(path, "/workspaces/Payment Required/projects");
        itest("randoop", 45).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 45).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/projects");
        itest("randoop", 45).given(workspace, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Server Error/projects");
        itest("randoop", 45).given(workspace, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/projects");
        itest("evosuite", 45).given(workspace, "HK2Z'\"clH,EG}L").checkEq(path, "/workspaces/HK2Z'\"clH,EG}L/projects");
        itest("randoop", 45).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("evosuite", 45).given(workspace, null).checkEq(path, "/workspaces/null/projects");
        itest("randoop", 45).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/projects");
        itest("randoop", 45).given(workspace, "/projects/Not Found/removeFollowers").checkEq(path, "/workspaces//projects/Not Found/removeFollowers/projects");
        itest("randoop", 45).given(workspace, "").checkEq(path, "/workspaces//projects");
        itest("randoop", 45).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 45).given(workspace, "10").checkEq(path, "/workspaces/10/projects");
        itest("randoop", 45).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/projects");
        itest("randoop", 45).given(workspace, "100").checkEq(path, "/workspaces/100/projects");
        itest("randoop", 45).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/projects");
        itest("randoop", 45).given(workspace, "/tasks//attachments/Not Found/addProject").checkEq(path, "/workspaces//tasks//attachments/Not Found/addProject/projects");
        itest("randoop", 45).given(workspace, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/workspaces//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/projects");
        itest("randoop", 45).given(workspace, "/tags").checkEq(path, "/workspaces//tags/projects");
        itest("randoop", 45).given(workspace, "200").checkEq(path, "/workspaces/200/projects");
        itest("randoop", 45).given(workspace, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/workspaces//workspaces//goals/{goal_gid}/subgoals/tasks/projects");
        itest("evosuite", 45).given(workspace, "/projects/%s/removeMembers").checkEq(path, "/workspaces//projects/%s/removeMembers/projects");
        itest("randoop", 45).given(workspace, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/projects");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Creates a project shared with the given team.
     *
     * Returns the full record of the newly created project.
     *
     * @param  team The team to create the project in.
     * @return Request object
     */
    public ItemRequest<Project> createInTeam(String team) {
        String path = String.format("/teams/%s/projects", team);
        itest("randoop", 59).given(team, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/projects");
        itest("randoop", 59).given(team, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/teams/com.asana.errors.InvalidTokenError: Sync token invalid or too old/projects");
        itest("randoop", 59).given(team, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/projects");
        itest("randoop", 59).given(team, "/tags/Payment Required").checkEq(path, "/teams//tags/Payment Required/projects");
        itest("randoop", 59).given(team, "NoAuthorizationError").checkEq(path, "/teams/NoAuthorizationError/projects");
        itest("randoop", 59).given(team, "/tasks/200/addProject").checkEq(path, "/teams//tasks/200/addProject/projects");
        itest("randoop", 59).given(team, "Invalid Request").checkEq(path, "/teams/Invalid Request/projects");
        itest("evosuite", 59).given(team, "").checkEq(path, "/teams//projects");
        itest("randoop", 59).given(team, "10").checkEq(path, "/teams/10/projects");
        itest("randoop", 59).given(team, "GET").checkEq(path, "/teams/GET/projects");
        itest("randoop", 59).given(team, "/webhooks/NoAuthorizationError").checkEq(path, "/teams//webhooks/NoAuthorizationError/projects");
        itest("randoop", 59).given(team, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/projects");
        itest("randoop", 59).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 59).given(team, "100").checkEq(path, "/teams/100/projects");
        itest("randoop", 59).given(team, "hi!").checkEq(path, "/teams/hi!/projects");
        itest("randoop", 59).given(team, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/projects");
        itest("randoop", 59).given(team, "").checkEq(path, "/teams//projects");
        itest("evosuite", 59).given(team, "/projects/%s/removeMembers").checkEq(path, "/teams//projects/%s/removeMembers/projects");
        itest("randoop", 59).given(team, "Payment Required").checkEq(path, "/teams/Payment Required/projects");
        itest("randoop", 59).given(team, "Not Found").checkEq(path, "/teams/Not Found/projects");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Returns the complete project record for a single project.
     *
     * @param  project The project to get.
     * @return Request object
     */
    public ItemRequest<Project> findById(String project) {
        String path = String.format("/projects/%s", project);
        itest("randoop", 71).given(project, "Forbidden").checkEq(path, "/projects/Forbidden");
        itest("randoop", 71).given(project, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 71).given(project, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 71).given(project, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/projects//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 71).given(project, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal");
        itest("randoop", 71).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 71).given(project, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 71).given(project, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 71).given(project, "").checkEq(path, "/projects/");
        itest("randoop", 71).given(project, "/organizations//teams").checkEq(path, "/projects//organizations//teams");
        itest("randoop", 71).given(project, "Payment Required").checkEq(path, "/projects/Payment Required");
        itest("evosuite", 71).given(project, "").checkEq(path, "/projects/");
        itest("randoop", 71).given(project, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("dev", 71).given(project, "1").checkEq(path, "/projects/1");
        itest("randoop", 71).given(project, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 71).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers");
        itest("randoop", 71).given(project, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 71).given(project, "/tasks/200/addProject").checkEq(path, "/projects//tasks/200/addProject");
        itest("randoop", 71).given(project, "Not Found").checkEq(path, "/projects/Not Found");
        itest("randoop", 71).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 71).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old");
        return new ItemRequest<Project>(this, Project.class, path, "GET");
    }

    /**
     * A specific, existing project can be updated by making a PUT request on the
     * URL for that project. Only the fields provided in the `data` block will be
     * updated; any unspecified fields will remain unchanged.
     *
     * When using this method, it is best to specify only those fields you wish
     * to change, or else you may overwrite changes made by another user since
     * you last retrieved the task.
     *
     * Returns the complete updated project record.
     *
     * @param  project The project to update.
     * @return Request object
     */
    public ItemRequest<Project> update(String project) {
        String path = String.format("/projects/%s", project);
        itest("randoop", 91).given(project, "hi!").checkEq(path, "/projects/hi!");
        itest("randoop", 91).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced");
        itest("randoop", 91).given(project, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 91).given(project, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 91).given(project, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 91).given(project, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 91).given(project, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 91).given(project, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 91).given(project, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!");
        itest("randoop", 91).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 91).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 91).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 91).given(project, "2").checkEq(path, "/projects/2");
        itest("randoop", 91).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError");
        itest("randoop", 91).given(project, "GET").checkEq(path, "/projects/GET");
        itest("evosuite", 91).given(project, null).checkEq(path, "/projects/null");
        itest("randoop", 91).given(project, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 91).given(project, "10").checkEq(path, "/projects/10");
        itest("evosuite", 91).given(project, "").checkEq(path, "/projects/");
        itest("randoop", 91).given(project, "Payment Required").checkEq(path, "/projects/Payment Required");
        itest("evosuite", 91).given(project, "&#%*~mw").checkEq(path, "/projects/&#%*~mw");
        return new ItemRequest<Project>(this, Project.class, path, "PUT");
    }

    /**
     * A specific, existing project can be deleted by making a DELETE request
     * on the URL for that project.
     *
     * Returns an empty data record.
     *
     * @param  project The project to delete.
     * @return Request object
     */
    public ItemRequest<Project> delete(String project) {
        String path = String.format("/projects/%s", project);
        itest("evosuite", 106).given(project, "Content-Disposition").checkEq(path, "/projects/Content-Disposition");
        itest("randoop", 106).given(project, "/tags").checkEq(path, "/projects//tags");
        itest("randoop", 106).given(project, "GET").checkEq(path, "/projects/GET");
        itest("randoop", 106).given(project, "/portfolios/").checkEq(path, "/projects//portfolios/");
        itest("randoop", 106).given(project, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("evosuite", 106).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers");
        itest("randoop", 106).given(project, "Payment Required").checkEq(path, "/projects/Payment Required");
        itest("randoop", 106).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old");
        itest("randoop", 106).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 106).given(project, "dd3h@,^uSt").checkEq(path, "/projects/dd3h@,^uSt");
        itest("randoop", 106).given(project, "/webhooks/NoAuthorizationError").checkEq(path, "/projects//webhooks/NoAuthorizationError");
        itest("randoop", 106).given(project, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required");
        itest("randoop", 106).given(project, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 106).given(project, "200").checkEq(path, "/projects/200");
        itest("randoop", 106).given(project, "/tasks/200/addProject").checkEq(path, "/projects//tasks/200/addProject");
        itest("randoop", 106).given(project, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections");
        itest("randoop", 106).given(project, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 106).given(project, "").checkEq(path, "/projects/");
        itest("randoop", 106).given(project, "POST").checkEq(path, "/projects/POST");
        itest("randoop", 106).given(project, "com.asana.errors.ServerError: Server Error").checkEq(path, "/projects/com.asana.errors.ServerError: Server Error");
        itest("randoop", 106).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found");
        itest("randoop", 106).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob");
        return new ItemRequest<Project>(this, Project.class, path, "DELETE");
    }

    /**
     * Returns the compact project records for some filtered set of projects.
     * Use one or more of the parameters provided to filter the projects returned.
     *
     * @return Request object
     */
    public CollectionRequest<Project> findAll() {
        return new CollectionRequest<Project>(this, Project.class, "/projects", "GET");
    }

    /**
     * Returns the compact project records for all projects in the workspace.
     *
     * @param  workspace The workspace or organization to find projects in.
     * @return Request object
     */
    public CollectionRequest<Project> findByWorkspace(String workspace) {
        String path = String.format("/workspaces/%s/projects", workspace);
        itest("randoop", 129).given(workspace, "/attachments/").checkEq(path, "/workspaces//attachments//projects");
        itest("randoop", 129).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/projects");
        itest("randoop", 129).given(workspace, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspaces/com.asana.errors.PremiumOnlyError: Payment Required/projects");
        itest("randoop", 129).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/projects");
        itest("randoop", 129).given(workspace, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/projects");
        itest("evosuite", 129).given(workspace, "/projects/%s/removeMembers").checkEq(path, "/workspaces//projects/%s/removeMembers/projects");
        itest("randoop", 129).given(workspace, "200").checkEq(path, "/workspaces/200/projects");
        itest("randoop", 129).given(workspace, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//stories//goals/{goal_gid}/addSubgoal/projects");
        itest("randoop", 129).given(workspace, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/projects");
        itest("randoop", 129).given(workspace, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/projects");
        itest("randoop", 129).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/projects");
        itest("randoop", 129).given(workspace, "/tags").checkEq(path, "/workspaces//tags/projects");
        itest("evosuite", 129).given(workspace, "").checkEq(path, "/workspaces//projects");
        itest("evosuite", 129).given(workspace, "/projects/com.asana.resources.ProjectStatuses/addCustomFieldSetting").checkEq(path, "/workspaces//projects/com.asana.resources.ProjectStatuses/addCustomFieldSetting/projects");
        itest("randoop", 129).given(workspace, "GET").checkEq(path, "/workspaces/GET/projects");
        itest("randoop", 129).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/projects");
        itest("randoop", 129).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/projects");
        itest("randoop", 129).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/projects");
        itest("randoop", 129).given(workspace, "/projects/Not Found/removeFollowers").checkEq(path, "/workspaces//projects/Not Found/removeFollowers/projects");
        itest("randoop", 129).given(workspace, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/projects");
        itest("randoop", 129).given(workspace, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Server Error/projects");
        itest("randoop", 129).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        itest("randoop", 129).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 129).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/projects");
        itest("randoop", 129).given(workspace, "").checkEq(path, "/workspaces//projects");
        itest("randoop", 129).given(workspace, "Payment Required").checkEq(path, "/workspaces/Payment Required/projects");
        itest("randoop", 129).given(workspace, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspaces/com.asana.errors.AsanaError: hi!/projects");
        itest("randoop", 129).given(workspace, "POST").checkEq(path, "/workspaces/POST/projects");
        return new CollectionRequest<Project>(this, Project.class, path, "GET");
    }

    /**
     * Returns the compact project records for all projects in the team.
     *
     * @param  team The team to find projects in.
     * @return Request object
     */
    public CollectionRequest<Project> findByTeam(String team) {
        String path = String.format("/teams/%s/projects", team);
        itest("randoop", 141).given(team, "/tags/Payment Required").checkEq(path, "/teams//tags/Payment Required/projects");
        itest("randoop", 141).given(team, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/projects");
        itest("randoop", 141).given(team, "Not Found").checkEq(path, "/teams/Not Found/projects");
        itest("randoop", 141).given(team, "10").checkEq(path, "/teams/10/projects");
        itest("randoop", 141).given(team, "").checkEq(path, "/teams//projects");
        itest("randoop", 141).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces//projects");
        itest("randoop", 141).given(team, "/goals/{goal_gid}/subgoals").checkEq(path, "/teams//goals/{goal_gid}/subgoals/projects");
        itest("randoop", 141).given(team, "Rate Limit Enforced").checkEq(path, "/teams/Rate Limit Enforced/projects");
        itest("randoop", 141).given(team, "/portfolios/").checkEq(path, "/teams//portfolios//projects");
        itest("randoop", 141).given(team, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//stories//goals/{goal_gid}/addSubgoal/projects");
        itest("randoop", 141).given(team, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: Server Error/projects");
        itest("randoop", 141).given(team, "200").checkEq(path, "/teams/200/projects");
        itest("evosuite", 141).given(team, "{Iy(PiMd!DJTyA").checkEq(path, "/teams/{Iy(PiMd!DJTyA/projects");
        itest("randoop", 141).given(team, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/teams//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/projects");
        itest("randoop", 141).given(team, "POST").checkEq(path, "/teams/POST/projects");
        itest("evosuite", 141).given(team, "(Pgv4U> ;Q").checkEq(path, "/teams/(Pgv4U> ;Q/projects");
        itest("randoop", 141).given(team, "Forbidden").checkEq(path, "/teams/Forbidden/projects");
        itest("randoop", 141).given(team, "Payment Required").checkEq(path, "/teams/Payment Required/projects");
        itest("randoop", 141).given(team, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("evosuite", 141).given(team, "").checkEq(path, "/teams//projects");
        itest("randoop", 141).given(team, "/workspaces/").checkEq(path, "/teams//workspaces//projects");
        itest("randoop", 141).given(team, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/projects");
        return new CollectionRequest<Project>(this, Project.class, path, "GET");
    }

    /**
     * Returns the compact task records for all tasks within the given project,
     * ordered by their priority within the project. Tasks can exist in more than one project at a time.
     *
     * @param  project The project in which to search for tasks.
     * @return Request object
     */
    public CollectionRequest<Project> tasks(String project) {
        String path = String.format("/projects/%s/tasks", project);
        itest("randoop", 154).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 154).given(project, "200").checkEq(path, "/projects/200/tasks");
        itest("randoop", 154).given(project, "Not Found").checkEq(path, "/projects/Not Found/tasks");
        itest("randoop", 154).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tasks");
        itest("randoop", 154).given(project, "Forbidden").checkEq(path, "/projects/Forbidden/tasks");
        itest("evosuite", 154).given(project, "#yA=ciN_").checkEq(path, "/projects/#yA=ciN_/tasks");
        itest("evosuite", 154).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers/tasks");
        itest("randoop", 154).given(project, "/attachments/").checkEq(path, "/projects//attachments//tasks");
        itest("randoop", 154).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/tasks");
        itest("randoop", 154).given(project, "GET").checkEq(path, "/projects/GET/tasks");
        itest("evosuite", 154).given(project, "").checkEq(path, "/projects//tasks");
        itest("randoop", 154).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/tasks");
        itest("randoop", 154).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//tasks");
        itest("evosuite", 154).given(project, "edYm)").checkEq(path, "/projects/edYm)/tasks");
        itest("randoop", 154).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/tasks");
        itest("randoop", 154).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/tasks");
        itest("randoop", 154).given(project, "-1").checkEq(path, "/projects/-1/tasks");
        itest("randoop", 154).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/tasks");
        itest("randoop", 154).given(project, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 154).given(project, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tasks");
        itest("randoop", 154).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tasks");
        itest("randoop", 154).given(project, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tasks");
        itest("randoop", 154).given(project, "").checkEq(path, "/projects//tasks");
        itest("randoop", 154).given(project, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required/tasks");
        itest("evosuite", 154).given(project, "POST").checkEq(path, "/projects/POST/tasks");
        return new CollectionRequest<Project>(this, Project.class, path, "GET");
    }

    /**
     * Adds the specified list of users as followers to the project. Followers are a subset of members, therefore if
     * the users are not already members of the project they will also become members as a result of this operation.
     * Returns the updated project record.
     *
     * @param  project The project to add followers to.
     * @return Request object
     */
    public ItemRequest<Project> addFollowers(String project) {
        String path = String.format("/projects/%s/addFollowers", project);
        itest("randoop", 168).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addFollowers");
        itest("randoop", 168).given(project, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/addFollowers");
        itest("randoop", 168).given(project, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addFollowers");
        itest("randoop", 168).given(project, "200").checkEq(path, "/projects/200/addFollowers");
        itest("randoop", 168).given(project, "/projects/Not Found/removeFollowers").checkEq(path, "/projects//projects/Not Found/removeFollowers/addFollowers");
        itest("randoop", 168).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/addFollowers");
        itest("randoop", 168).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/addFollowers");
        itest("randoop", 168).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addFollowers");
        itest("randoop", 168).given(project, "/tags/Payment Required").checkEq(path, "/projects//tags/Payment Required/addFollowers");
        itest("randoop", 168).given(project, "0").checkEq(path, "/projects/0/addFollowers");
        itest("evosuite", 168).given(project, "/projects/%s/rbovyMemb[rs").checkEq(path, "/projects//projects/%s/rbovyMemb[rs/addFollowers");
        itest("randoop", 168).given(project, "10").checkEq(path, "/projects/10/addFollowers");
        itest("randoop", 168).given(project, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/projects/com.asana.errors.InvalidRequestError: Invalid Request/addFollowers");
        itest("randoop", 168).given(project, "Not Found").checkEq(path, "/projects/Not Found/addFollowers");
        itest("randoop", 168).given(project, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error/addFollowers");
        itest("evosuite", 168).given(project, "dd3h@,^uSt").checkEq(path, "/projects/dd3h@,^uSt/addFollowers");
        itest("randoop", 168).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addFollowers");
        itest("randoop", 168).given(project, "Server Error").checkEq(path, "/projects/Server Error/addFollowers");
        itest("randoop", 168).given(project, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addFollowers");
        itest("randoop", 168).given(project, "/goals/Sync token invalid or too old").checkEq(path, "/projects//goals/Sync token invalid or too old/addFollowers");
        itest("randoop", 168).given(project, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addFollowers");
        itest("evosuite", 168).given(project, "ce<sI1A iWiezH(s+").checkEq(path, "/projects/ce<sI1A iWiezH(s+/addFollowers");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Removes the specified list of users from following the project, this will not affect project membership status.
     * Returns the updated project record.
     *
     * @param  project The project to remove followers from.
     * @return Request object
     */
    public ItemRequest<Project> removeFollowers(String project) {
        String path = String.format("/projects/%s/removeFollowers", project);
        itest("randoop", 181).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/removeFollowers");
        itest("randoop", 181).given(project, "/webhooks/NoAuthorizationError").checkEq(path, "/projects//webhooks/NoAuthorizationError/removeFollowers");
        itest("randoop", 181).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeFollowers");
        itest("evosuite", 181).given(project, "2G?*1|z:6YF").checkEq(path, "/projects/2G?*1|z:6YF/removeFollowers");
        itest("randoop", 181).given(project, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeFollowers");
        itest("randoop", 181).given(project, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: 200/removeFollowers");
        itest("randoop", 181).given(project, "Not Found").checkEq(path, "/projects/Not Found/removeFollowers");
        itest("randoop", 181).given(project, "10").checkEq(path, "/projects/10/removeFollowers");
        itest("randoop", 181).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/removeFollowers");
        itest("randoop", 181).given(project, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/removeFollowers");
        itest("randoop", 181).given(project, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/removeFollowers");
        itest("randoop", 181).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/removeFollowers");
        itest("randoop", 181).given(project, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeFollowers");
        itest("randoop", 181).given(project, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeFollowers");
        itest("randoop", 181).given(project, "hi!").checkEq(path, "/projects/hi!/removeFollowers");
        itest("randoop", 181).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeFollowers");
        itest("randoop", 181).given(project, "100").checkEq(path, "/projects/100/removeFollowers");
        itest("randoop", 181).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/removeFollowers");
        itest("randoop", 181).given(project, "POST").checkEq(path, "/projects/POST/removeFollowers");
        itest("randoop", 181).given(project, "/portfolios/").checkEq(path, "/projects//portfolios//removeFollowers");
        itest("evosuite", 181).given(project, "com.asana.resources.ProjectStatuses").checkEq(path, "/projects/com.asana.resources.ProjectStatuses/removeFollowers");
        itest("evosuite", 181).given(project, "/projects/%s/addMembers").checkEq(path, "/projects//projects/%s/addMembers/removeFollowers");
        itest("randoop", 181).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/removeFollowers");
        itest("randoop", 181).given(project, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//portfolio_memberships//goals/{goal_gid}/addSubgoal/removeFollowers");
        itest("evosuite", 181).given(project, "GET").checkEq(path, "/projects/GET/removeFollowers");
        itest("randoop", 181).given(project, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/removeFollowers");
        itest("randoop", 181).given(project, "Server Error").checkEq(path, "/projects/Server Error/removeFollowers");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Adds the specified list of users as members of the project. Returns the updated project record.
     *
     * @param  project The project to add members to.
     * @return Request object
     */
    public ItemRequest<Project> addMembers(String project) {
        String path = String.format("/projects/%s/addMembers", project);
        itest("randoop", 193).given(project, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addMembers");
        itest("randoop", 193).given(project, "POST").checkEq(path, "/projects/POST/addMembers");
        itest("randoop", 193).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addMembers");
        itest("randoop", 193).given(project, "/projects/Not Found/removeFollowers").checkEq(path, "/projects//projects/Not Found/removeFollowers/addMembers");
        itest("randoop", 193).given(project, "Not Found").checkEq(path, "/projects/Not Found/addMembers");
        itest("randoop", 193).given(project, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addMembers");
        itest("randoop", 193).given(project, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/addMembers");
        itest("randoop", 193).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addMembers");
        itest("randoop", 193).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/addMembers");
        itest("randoop", 193).given(project, "/portfolios/").checkEq(path, "/projects//portfolios//addMembers");
        itest("randoop", 193).given(project, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/addMembers");
        itest("randoop", 193).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/addMembers");
        itest("randoop", 193).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/addMembers");
        itest("evosuite", 193).given(project, "GET").checkEq(path, "/projects/GET/addMembers");
        itest("randoop", 193).given(project, "200").checkEq(path, "/projects/200/addMembers");
        itest("evosuite", 193).given(project, "/projects/%s/removeCustomFieldSetting").checkEq(path, "/projects//projects/%s/removeCustomFieldSetting/addMembers");
        itest("randoop", 193).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/addMembers");
        itest("evosuite", 193).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers/addMembers");
        itest("randoop", 193).given(project, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addMembers");
        itest("randoop", 193).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//addMembers");
        itest("randoop", 193).given(project, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addMembers");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Removes the specified list of members from the project. Returns the updated project record.
     *
     * @param  project The project to remove members from.
     * @return Request object
     */
    public ItemRequest<Project> removeMembers(String project) {
        String path = String.format("/projects/%s/removeMembers", project);
        itest("randoop", 205).given(project, "200").checkEq(path, "/projects/200/removeMembers");
        itest("randoop", 205).given(project, "").checkEq(path, "/projects//removeMembers");
        itest("randoop", 205).given(project, "10").checkEq(path, "/projects/10/removeMembers");
        itest("randoop", 205).given(project, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeMembers");
        itest("randoop", 205).given(project, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeMembers");
        itest("evosuite", 205).given(project, "=v~H+/").checkEq(path, "/projects/=v~H+//removeMembers");
        itest("randoop", 205).given(project, "Forbidden").checkEq(path, "/projects/Forbidden/removeMembers");
        itest("randoop", 205).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeMembers");
        itest("randoop", 205).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeMembers");
        itest("randoop", 205).given(project, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/removeMembers");
        itest("randoop", 205).given(project, "GET").checkEq(path, "/projects/GET/removeMembers");
        itest("evosuite", 205).given(project, "Content-Disposition").checkEq(path, "/projects/Content-Disposition/removeMembers");
        itest("evosuite", 205).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers/removeMembers");
        itest("randoop", 205).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/removeMembers");
        itest("randoop", 205).given(project, "POST").checkEq(path, "/projects/POST/removeMembers");
        itest("randoop", 205).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeMembers");
        itest("evosuite", 205).given(project, "#yA=ciN_").checkEq(path, "/projects/#yA=ciN_/removeMembers");
        itest("randoop", 205).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//removeMembers");
        itest("randoop", 205).given(project, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/projects/com.asana.errors.AsanaError: NoAuthorizationError/removeMembers");
        itest("randoop", 205).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/removeMembers");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Create a new custom field setting on the project.
     *
     * @param  project The project to associate the custom field with
     * @return Request object
     */
    public ItemRequest<Project> addCustomFieldSetting(String project) {
        String path = String.format("/projects/%s/addCustomFieldSetting", project);
        itest("randoop", 217).given(project, "hi!").checkEq(path, "/projects/hi!/addCustomFieldSetting");
        itest("randoop", 217).given(project, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/addCustomFieldSetting");
        itest("randoop", 217).given(project, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//stories//goals/{goal_gid}/addSubgoal/addCustomFieldSetting");
        itest("randoop", 217).given(project, "POST").checkEq(path, "/projects/POST/addCustomFieldSetting");
        itest("randoop", 217).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/addCustomFieldSetting");
        itest("evosuite", 217).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers/addCustomFieldSetting");
        itest("evosuite", 217).given(project, "com.asana.resources.ProjectStatuses").checkEq(path, "/projects/com.asana.resources.ProjectStatuses/addCustomFieldSetting");
        itest("randoop", 217).given(project, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addCustomFieldSetting");
        itest("randoop", 217).given(project, "Not Found").checkEq(path, "/projects/Not Found/addCustomFieldSetting");
        itest("randoop", 217).given(project, "Forbidden").checkEq(path, "/projects/Forbidden/addCustomFieldSetting");
        itest("randoop", 217).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addCustomFieldSetting");
        itest("evosuite", 217).given(project, "nJ^H(").checkEq(path, "/projects/nJ^H(/addCustomFieldSetting");
        itest("randoop", 217).given(project, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/addCustomFieldSetting");
        itest("randoop", 217).given(project, "10").checkEq(path, "/projects/10/addCustomFieldSetting");
        itest("randoop", 217).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addCustomFieldSetting");
        itest("randoop", 217).given(project, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/addCustomFieldSetting");
        itest("randoop", 217).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/addCustomFieldSetting");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Remove a custom field setting on the project.
     *
     * @param  project The project to associate the custom field with
     * @return Request object
     */
    public ItemRequest<Project> removeCustomFieldSetting(String project) {
        String path = String.format("/projects/%s/removeCustomFieldSetting", project);
        itest("evosuite", 229).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers/removeCustomFieldSetting");
        itest("evosuite", 229).given(project, "/projects/POST/tasks").checkEq(path, "/projects//projects/POST/tasks/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "/projects/Not Found/removeFollowers").checkEq(path, "/projects//projects/Not Found/removeFollowers/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "hi!").checkEq(path, "/projects/hi!/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "").checkEq(path, "/projects//removeCustomFieldSetting");
        itest("randoop", 229).given(project, "0").checkEq(path, "/projects/0/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "200").checkEq(path, "/projects/200/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "GET").checkEq(path, "/projects/GET/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "/organizations//teams").checkEq(path, "/projects//organizations//teams/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "10").checkEq(path, "/projects/10/removeCustomFieldSetting");
        itest("evosuite", 229).given(project, "").checkEq(path, "/projects//removeCustomFieldSetting");
        itest("randoop", 229).given(project, "/workspaces//addUser").checkEq(path, "/projects//workspaces//addUser/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "Server Error").checkEq(path, "/projects/Server Error/removeCustomFieldSetting");
        itest("randoop", 229).given(project, "100").checkEq(path, "/projects/100/removeCustomFieldSetting");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }
}
