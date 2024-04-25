package com.asana.resources;

import com.asana.Client;
import com.asana.models.ProjectMembership;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.ProjectMembershipsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class ProjectMemberships extends ProjectMembershipsBase {

    public ProjectMemberships(Client client) {
        super(client);
    }

    /**
     * Returns the compact project membership records for the project.
     *
     * @param  project The project for which to fetch memberships.
     * @return Request object
     */
    public CollectionRequest<ProjectMembership> findByProject(String project) {
        String path = String.format("/projects/%s/project_memberships", project);
        itest("randoop", 22).given(project, "hi!").checkEq(path, "/projects/hi!/project_memberships");
        itest("randoop", 22).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/project_memberships");
        itest("evosuite", 22).given(project, "").checkEq(path, "/projects//project_memberships");
        itest("evosuite", 22).given(project, "ZIF-wNf6").checkEq(path, "/projects/ZIF-wNf6/project_memberships");
        itest("randoop", 22).given(project, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/project_memberships");
        itest("evosuite", 22).given(project, "LBRACE").checkEq(path, "/projects/LBRACE/project_memberships");
        itest("evosuite", 22).given(project, "/projects/ZIF-wNf6/project_memberships").checkEq(path, "/projects//projects/ZIF-wNf6/project_memberships/project_memberships");
        itest("evosuite", 22).given(project, "GET").checkEq(path, "/projects/GET/project_memberships");
        itest("randoop", 22).given(project, "200").checkEq(path, "/projects/200/project_memberships");
        itest("randoop", 22).given(project, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/projects/com.asana.errors.InvalidTokenError: Sync token invalid or too old/project_memberships");
        itest("randoop", 22).given(project, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/project_memberships");
        itest("randoop", 22).given(project, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/project_memberships");
        itest("randoop", 22).given(project, "/attachments/").checkEq(path, "/projects//attachments//project_memberships");
        itest("evosuite", 22).given(project, "%s is not TextBlockLiteralExpr, it is %s").checkEq(path, "/projects/%s is not TextBlockLiteralExpr, it is %s/project_memberships");
        itest("randoop", 22).given(project, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/project_memberships");
        itest("evosuite", 22).given(project, null).checkEq(path, "/projects/null/project_memberships");
        itest("evosuite", 22).given(project, "%~$sRBCKw").checkEq(path, "/projects/%~$sRBCKw/project_memberships");
        itest("randoop", 22).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/project_memberships");
        itest("randoop", 22).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/project_memberships");
        itest("randoop", 22).given(project, "").checkEq(path, "/projects//project_memberships");
        itest("evosuite", 22).given(project, "/projects/LBRACE/project_memberships").checkEq(path, "/projects//projects/LBRACE/project_memberships/project_memberships");
        itest("randoop", 22).given(project, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/project_memberships");
        itest("evosuite", 22).given(project, "`").checkEq(path, "/projects/`/project_memberships");
        itest("randoop", 22).given(project, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/project_memberships");
        itest("randoop", 22).given(project, "/tags").checkEq(path, "/projects//tags/project_memberships");
        itest("randoop", 22).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/project_memberships");
        itest("randoop", 22).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/project_memberships");
        itest("randoop", 22).given(project, "com.asana.errors.ServerError: Server Error").checkEq(path, "/projects/com.asana.errors.ServerError: Server Error/project_memberships");
        itest("randoop", 22).given(project, "GET").checkEq(path, "/projects/GET/project_memberships");
        itest("randoop", 22).given(project, "Not Found").checkEq(path, "/projects/Not Found/project_memberships");
        itest("evosuite", 22).given(project, "/project_memberships/|+l0v").checkEq(path, "/projects//project_memberships/|+l0v/project_memberships");
        itest("randoop", 22).given(project, "/webhooks/NoAuthorizationError").checkEq(path, "/projects//webhooks/NoAuthorizationError/project_memberships");
        return new CollectionRequest<ProjectMembership>(this, ProjectMembership.class, path, "GET");
    }

    /**
     * Returns the project membership record.
     *
     * @param  projectMembership Globally unique identifier for the project membership.
     * @return Request object
     */
    public ItemRequest<ProjectMembership> findById(String projectMembership) {
        String path = String.format("/project_memberships/%s", projectMembership);
        itest("randoop", 34).given(projectMembership, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 34).given(projectMembership, "/project_statuses/Server Error").checkEq(path, "/project_memberships//project_statuses/Server Error");
        itest("randoop", 34).given(projectMembership, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 34).given(projectMembership, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/project_memberships/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 34).given(projectMembership, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 34).given(projectMembership, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject").checkEq(path, "/project_memberships//tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject");
        itest("randoop", 34).given(projectMembership, "/tasks/200/addProject").checkEq(path, "/project_memberships//tasks/200/addProject");
        itest("randoop", 34).given(projectMembership, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/project_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 34).given(projectMembership, "/portfolios/").checkEq(path, "/project_memberships//portfolios/");
        itest("evosuite", 34).given(projectMembership, "q.R|P>rM{p~!J $b=").checkEq(path, "/project_memberships/q.R|P>rM{p~!J $b=");
        itest("randoop", 34).given(projectMembership, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 34).given(projectMembership, "hi!").checkEq(path, "/project_memberships/hi!");
        itest("evosuite", 34).given(projectMembership, "}8u{!+CK9E`").checkEq(path, "/project_memberships/}8u{!+CK9E`");
        itest("randoop", 34).given(projectMembership, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/project_memberships//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 34).given(projectMembership, "/attachments/Not Found").checkEq(path, "/project_memberships//attachments/Not Found");
        itest("evosuite", 34).given(projectMembership, "P^1_X,+ehgU").checkEq(path, "/project_memberships/P^1_X,+ehgU");
        itest("evosuite", 34).given(projectMembership, "GET").checkEq(path, "/project_memberships/GET");
        itest("randoop", 34).given(projectMembership, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/project_memberships/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 34).given(projectMembership, "NoAuthorizationError").checkEq(path, "/project_memberships/NoAuthorizationError");
        itest("randoop", 34).given(projectMembership, "0").checkEq(path, "/project_memberships/0");
        itest("randoop", 34).given(projectMembership, "Server Error").checkEq(path, "/project_memberships/Server Error");
        itest("randoop", 34).given(projectMembership, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 34).given(projectMembership, "Rate Limit Enforced").checkEq(path, "/project_memberships/Rate Limit Enforced");
        itest("dev", 34).given(projectMembership, "1").checkEq(path, "/project_memberships/1");
        itest("randoop", 34).given(projectMembership, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/project_memberships/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 34).given(projectMembership, "/tasks//attachments/Not Found/addProject").checkEq(path, "/project_memberships//tasks//attachments/Not Found/addProject");
        itest("randoop", 34).given(projectMembership, "GET").checkEq(path, "/project_memberships/GET");
        itest("randoop", 34).given(projectMembership, "Invalid Request").checkEq(path, "/project_memberships/Invalid Request");
        itest("randoop", 34).given(projectMembership, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/project_memberships/urn:ietf:wg:oauth:2.0:oob");
        itest("evosuite", 34).given(projectMembership, "|+l0v").checkEq(path, "/project_memberships/|+l0v");
        itest("randoop", 34).given(projectMembership, "10").checkEq(path, "/project_memberships/10");
        itest("randoop", 34).given(projectMembership, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/project_memberships/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("evosuite", 34).given(projectMembership, "pua r;E*L8mX").checkEq(path, "/project_memberships/pua r;E*L8mX");
        itest("randoop", 34).given(projectMembership, "").checkEq(path, "/project_memberships/");
        return new ItemRequest<ProjectMembership>(this, ProjectMembership.class, path, "GET");
    }
}
