package com.asana.resources;

import com.asana.Client;
import com.asana.models.Team;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.TeamsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Teams extends TeamsBase {

    public Teams(Client client) {
        super(client);
    }

    /**
     * Returns the full record for a single team.
     *
     * @param  team Globally unique identifier for the team.
     * @return Request object
     */
    public ItemRequest<Team> findById(String team) {
        String path = String.format("/teams/%s", team);
        itest("evosuite", 22).given(team, "POST").checkEq(path, "/teams/POST");
        itest("randoop", 22).given(team, "10").checkEq(path, "/teams/10");
        itest("randoop", 22).given(team, "NoAuthorizationError").checkEq(path, "/teams/NoAuthorizationError");
        itest("randoop", 22).given(team, "/tags").checkEq(path, "/teams//tags");
        itest("randoop", 22).given(team, "GET").checkEq(path, "/teams/GET");
        itest("evosuite", 22).given(team, "H").checkEq(path, "/teams/H");
        itest("randoop", 22).given(team, "Forbidden").checkEq(path, "/teams/Forbidden");
        itest("randoop", 22).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 22).given(team, "j4f84?h{dT``").checkEq(path, "/teams/j4f84?h{dT``");
        itest("randoop", 22).given(team, "").checkEq(path, "/teams/");
        itest("evosuite", 22).given(team, "com.github.javaparser.ast.stmt.LocalClassDeclarationStmt").checkEq(path, "/teams/com.github.javaparser.ast.stmt.LocalClassDeclarationStmt");
        itest("randoop", 22).given(team, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("dev", 22).given(team, "1").checkEq(path, "/teams/1");
        itest("randoop", 22).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 22).given(team, "hi!").checkEq(path, "/teams/hi!");
        itest("randoop", 22).given(team, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: 200");
        itest("evosuite", 22).given(team, null).checkEq(path, "/teams/null");
        itest("randoop", 22).given(team, "/custom_fields//enum_options/insert").checkEq(path, "/teams//custom_fields//enum_options/insert");
        itest("randoop", 22).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 22).given(team, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/teams//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 22).given(team, "Invalid Request").checkEq(path, "/teams/Invalid Request");
        itest("randoop", 22).given(team, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/teams/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 22).given(team, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 22).given(team, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//goals/{goal_gid}/addSubgoal");
        itest("randoop", 22).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 22).given(team, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject").checkEq(path, "/teams//tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject");
        itest("randoop", 22).given(team, "200").checkEq(path, "/teams/200");
        itest("evosuite", 22).given(team, "%s cannot be cast to %s").checkEq(path, "/teams/%s cannot be cast to %s");
        itest("evosuite", 22).given(team, "\"-z`nRa'.S HT^%q5").checkEq(path, "/teams/\"-z`nRa'.S HT^%q5");
        itest("randoop", 22).given(team, "/organizations//teams").checkEq(path, "/teams//organizations//teams");
        itest("randoop", 22).given(team, "Rate Limit Enforced").checkEq(path, "/teams/Rate Limit Enforced");
        itest("randoop", 22).given(team, "Not Found").checkEq(path, "/teams/Not Found");
        return new ItemRequest<Team>(this, Team.class, path, "GET");
    }

    /**
     * Returns the compact records for all teams in the organization visible to
     * the authorized user.
     *
     * @param  organization Globally unique identifier for the workspace or organization.
     * @return Request object
     */
    public CollectionRequest<Team> findByOrganization(String organization) {
        String path = String.format("/organizations/%s/teams", organization);
        itest("randoop", 35).given(organization, "/tags").checkEq(path, "/organizations//tags/teams");
        itest("randoop", 35).given(organization, "200").checkEq(path, "/organizations/200/teams");
        itest("randoop", 35).given(organization, "Rate Limit Enforced").checkEq(path, "/organizations/Rate Limit Enforced/teams");
        itest("randoop", 35).given(organization, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/teams");
        itest("randoop", 35).given(organization, "Invalid Request").checkEq(path, "/organizations/Invalid Request/teams");
        itest("randoop", 35).given(organization, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/teams");
        itest("randoop", 35).given(organization, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//teams");
        itest("randoop", 35).given(organization, "/custom_fields//enum_options/insert").checkEq(path, "/organizations//custom_fields//enum_options/insert/teams");
        itest("randoop", 35).given(organization, "/tasks/200/addProject").checkEq(path, "/organizations//tasks/200/addProject/teams");
        itest("randoop", 35).given(organization, "/goals/Sync token invalid or too old").checkEq(path, "/organizations//goals/Sync token invalid or too old/teams");
        itest("evosuite", 35).given(organization, "GET").checkEq(path, "/organizations/GET/teams");
        itest("randoop", 35).given(organization, "hi!").checkEq(path, "/organizations/hi!/teams");
        itest("randoop", 35).given(organization, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/organizations/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/teams");
        itest("randoop", 35).given(organization, "Sync token invalid or too old").checkEq(path, "/organizations/Sync token invalid or too old/teams");
        itest("randoop", 35).given(organization, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/organizations//portfolios//goals/{goal_gid}/subgoals/teams");
        itest("randoop", 35).given(organization, "10").checkEq(path, "/organizations/10/teams");
        itest("evosuite", 35).given(organization, "mbhr1:I?m:Pezv7e:J").checkEq(path, "/organizations/mbhr1:I?m:Pezv7e:J/teams");
        itest("randoop", 35).given(organization, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/organizations/urn:ietf:wg:oauth:2.0:oob/teams");
        itest("evosuite", 35).given(organization, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/organizations/urn:ietf:wg:oauth:2.0:oob/teams");
        itest("evosuite", 35).given(organization, "").checkEq(path, "/organizations//teams");
        itest("evosuite", 35).given(organization, "oFnk").checkEq(path, "/organizations/oFnk/teams");
        itest("randoop", 35).given(organization, "NoAuthorizationError").checkEq(path, "/organizations/NoAuthorizationError/teams");
        itest("randoop", 35).given(organization, "Server Error").checkEq(path, "/organizations/Server Error/teams");
        itest("randoop", 35).given(organization, "/workspaces/").checkEq(path, "/organizations//workspaces//teams");
        itest("randoop", 35).given(organization, "POST").checkEq(path, "/organizations/POST/teams");
        itest("evosuite", 35).given(organization, "H").checkEq(path, "/organizations/H/teams");
        return new CollectionRequest<Team>(this, Team.class, path, "GET");
    }

    /**
     * Returns the compact records for all teams to which user is assigned.
     *
     * @param  user An identifier for the user. Can be one of an email address,
     * the globally unique identifier for the user, or the keyword `me`
     * to indicate the current user making the request.
     * @return Request object
     */
    public CollectionRequest<Team> findByUser(String user) {
        String path = String.format("/users/%s/teams", user);
        itest("evosuite", 49).given(user, "Type must be in the 'maintype/subtype; parameter=value' format").checkEq(path, "/users/Type must be in the 'maintype/subtype; parameter=value' format/teams");
        itest("randoop", 49).given(user, "GET").checkEq(path, "/users/GET/teams");
        itest("evosuite", 49).given(user, "GET").checkEq(path, "/users/GET/teams");
        itest("randoop", 49).given(user, "200").checkEq(path, "/users/200/teams");
        itest("randoop", 49).given(user, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/users//stories//goals/{goal_gid}/addSubgoal/teams");
        itest("randoop", 49).given(user, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/teams");
        itest("randoop", 49).given(user, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/teams");
        itest("randoop", 49).given(user, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/users/urn:ietf:wg:oauth:2.0:oob/teams");
        itest("randoop", 49).given(user, "Rate Limit Enforced").checkEq(path, "/users/Rate Limit Enforced/teams");
        itest("randoop", 49).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/teams");
        itest("randoop", 49).given(user, "NoAuthorizationError").checkEq(path, "/users/NoAuthorizationError/teams");
        itest("randoop", 49).given(user, "").checkEq(path, "/users//teams");
        itest("randoop", 49).given(user, "Sync token invalid or too old").checkEq(path, "/users/Sync token invalid or too old/teams");
        itest("randoop", 49).given(user, "Forbidden").checkEq(path, "/users/Forbidden/teams");
        itest("randoop", 49).given(user, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/users//portfolios/Rate Limit Enforced/portfolio_memberships/teams");
        itest("randoop", 49).given(user, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/users//goals/{goal_gid}/addSubgoal/teams");
        itest("randoop", 49).given(user, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/users/com.asana.errors.InvalidRequestError: Invalid Request/teams");
        itest("randoop", 49).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/teams");
        itest("randoop", 49).given(user, "Invalid Request").checkEq(path, "/users/Invalid Request/teams");
        itest("evosuite", 49).given(user, "@/!xVxb.{k]aEVal-6").checkEq(path, "/users/@/!xVxb.{k]aEVal-6/teams");
        itest("evosuite", 49).given(user, "H").checkEq(path, "/users/H/teams");
        itest("randoop", 49).given(user, "/attachments/Not Found").checkEq(path, "/users//attachments/Not Found/teams");
        return new CollectionRequest<Team>(this, Team.class, path, "GET");
    }

    /**
     * Returns the compact records for all users that are members of the team.
     *
     * @param  team Globally unique identifier for the team.
     * @return Request object
     */
    public CollectionRequest<Team> users(String team) {
        String path = String.format("/teams/%s/users", team);
        itest("randoop", 61).given(team, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/users");
        itest("evosuite", 61).given(team, "com.asana.resources.ProjectStatuses").checkEq(path, "/teams/com.asana.resources.ProjectStatuses/users");
        itest("randoop", 61).given(team, "").checkEq(path, "/teams//users");
        itest("randoop", 61).given(team, "/attachments/Not Found").checkEq(path, "/teams//attachments/Not Found/users");
        itest("evosuite", 61).given(team, "VarType").checkEq(path, "/teams/VarType/users");
        itest("randoop", 61).given(team, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//portfolio_memberships//goals/{goal_gid}/addSubgoal/users");
        itest("randoop", 61).given(team, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/teams/com.asana.errors.InvalidRequestError: Invalid Request/users");
        itest("randoop", 61).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/users");
        itest("randoop", 61).given(team, "/goals/{goal_gid}/subgoals").checkEq(path, "/teams//goals/{goal_gid}/subgoals/users");
        itest("evosuite", 61).given(team, "[").checkEq(path, "/teams/[/users");
        itest("randoop", 61).given(team, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/users");
        itest("randoop", 61).given(team, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/users");
        itest("randoop", 61).given(team, "Payment Required").checkEq(path, "/teams/Payment Required/users");
        itest("randoop", 61).given(team, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/teams//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/users");
        itest("evosuite", 61).given(team, "POST").checkEq(path, "/teams/POST/users");
        itest("randoop", 61).given(team, "/tasks//attachments/Not Found/addProject").checkEq(path, "/teams//tasks//attachments/Not Found/addProject/users");
        itest("randoop", 61).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/users");
        itest("randoop", 61).given(team, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/teams/urn:ietf:wg:oauth:2.0:oob/users");
        itest("randoop", 61).given(team, "0").checkEq(path, "/teams/0/users");
        itest("evosuite", 61).given(team, "H").checkEq(path, "/teams/H/users");
        itest("randoop", 61).given(team, "POST").checkEq(path, "/teams/POST/users");
        itest("randoop", 61).given(team, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/teams/com.asana.errors.InvalidTokenError: Sync token invalid or too old/users");
        itest("evosuite", 61).given(team, "/users/%s/teams").checkEq(path, "/teams//users/%s/teams/users");
        itest("randoop", 61).given(team, "Server Error").checkEq(path, "/teams/Server Error/users");
        itest("evosuite", 61).given(team, null).checkEq(path, "/teams/null/users");
        itest("randoop", 61).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/users");
        itest("randoop", 61).given(team, "Rate Limit Enforced").checkEq(path, "/teams/Rate Limit Enforced/users");
        itest("randoop", 61).given(team, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/teams/com.asana.errors.RetryableAsanaError: 200/users");
        itest("randoop", 61).given(team, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/teams/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/users");
        itest("randoop", 61).given(team, "/projects/Rate Limit Enforced/sections").checkEq(path, "/teams//projects/Rate Limit Enforced/sections/users");
        itest("randoop", 61).given(team, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/teams/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/users");
        itest("evosuite", 61).given(team, "GET").checkEq(path, "/teams/GET/users");
        itest("evosuite", 61).given(team, "hc.jdvAfD{ eHsz").checkEq(path, "/teams/hc.jdvAfD{ eHsz/users");
        itest("randoop", 61).given(team, "/webhooks/NoAuthorizationError").checkEq(path, "/teams//webhooks/NoAuthorizationError/users");
        itest("randoop", 61).given(team, "hi!").checkEq(path, "/teams/hi!/users");
        itest("randoop", 61).given(team, "GET").checkEq(path, "/teams/GET/users");
        return new CollectionRequest<Team>(this, Team.class, path, "GET");
    }

    /**
     * The user making this call must be a member of the team in order to add others.
     * The user to add must exist in the same organization as the team in order to be added.
     * The user to add can be referenced by their globally unique user ID or their email address.
     * Returns the full user record for the added user.
     *
     * @param  team Globally unique identifier for the team.
     * @return Request object
     */
    public ItemRequest<Team> addUser(String team) {
        String path = String.format("/teams/%s/addUser", team);
        itest("randoop", 76).given(team, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addUser");
        itest("randoop", 76).given(team, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/teams/com.asana.errors.InvalidRequestError: Invalid Request/addUser");
        itest("randoop", 76).given(team, "com.asana.errors.ServerError: Server Error").checkEq(path, "/teams/com.asana.errors.ServerError: Server Error/addUser");
        itest("randoop", 76).given(team, "Forbidden").checkEq(path, "/teams/Forbidden/addUser");
        itest("randoop", 76).given(team, "Server Error").checkEq(path, "/teams/Server Error/addUser");
        itest("randoop", 76).given(team, "10").checkEq(path, "/teams/10/addUser");
        itest("evosuite", 76).given(team, "com.github.javaparser.printer.DefaultPrettyPrinterVisitor").checkEq(path, "/teams/com.github.javaparser.printer.DefaultPrettyPrinterVisitor/addUser");
        itest("randoop", 76).given(team, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old/addUser");
        itest("evosuite", 76).given(team, "com.github.javaparser.ast.stmt.LocalClassDeclarationStmt").checkEq(path, "/teams/com.github.javaparser.ast.stmt.LocalClassDeclarationStmt/addUser");
        itest("randoop", 76).given(team, "").checkEq(path, "/teams//addUser");
        itest("evosuite", 76).given(team, "com.asana.resources.gen.PortfolioMembershipsBase").checkEq(path, "/teams/com.asana.resources.gen.PortfolioMembershipsBase/addUser");
        itest("randoop", 76).given(team, "Invalid Request").checkEq(path, "/teams/Invalid Request/addUser");
        itest("randoop", 76).given(team, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/teams//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addUser");
        itest("evosuite", 76).given(team, "").checkEq(path, "/teams//addUser");
        itest("evosuite", 76).given(team, "H").checkEq(path, "/teams/H/addUser");
        itest("randoop", 76).given(team, "Not Found").checkEq(path, "/teams/Not Found/addUser");
        itest("randoop", 76).given(team, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addUser");
        itest("evosuite", 76).given(team, "%s cannot be cast to %s").checkEq(path, "/teams/%s cannot be cast to %s/addUser");
        itest("evosuite", 76).given(team, "/teams/%s/addUser").checkEq(path, "/teams//teams/%s/addUser/addUser");
        return new ItemRequest<Team>(this, Team.class, path, "POST");
    }

    /**
     * The user to remove can be referenced by their globally unique user ID or their email address.
     * Removes the user from the specified team. Returns an empty data record.
     *
     * @param  team Globally unique identifier for the team.
     * @return Request object
     */
    public ItemRequest<Team> removeUser(String team) {
        String path = String.format("/teams/%s/removeUser", team);
        itest("randoop", 89).given(team, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/removeUser");
        itest("randoop", 89).given(team, "Server Error").checkEq(path, "/teams/Server Error/removeUser");
        itest("randoop", 89).given(team, "Payment Required").checkEq(path, "/teams/Payment Required/removeUser");
        itest("randoop", 89).given(team, "POST").checkEq(path, "/teams/POST/removeUser");
        itest("randoop", 89).given(team, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/teams//goals/{goal_gid}/addSubgoal/removeUser");
        itest("evosuite", 89).given(team, "~gv72~HH7p").checkEq(path, "/teams/~gv72~HH7p/removeUser");
        itest("randoop", 89).given(team, "Not Found").checkEq(path, "/teams/Not Found/removeUser");
        itest("randoop", 89).given(team, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/teams/urn:ietf:wg:oauth:2.0:oob/removeUser");
        itest("evosuite", 89).given(team, "GET").checkEq(path, "/teams/GET/removeUser");
        itest("randoop", 89).given(team, "NoAuthorizationError").checkEq(path, "/teams/NoAuthorizationError/removeUser");
        itest("randoop", 89).given(team, "200").checkEq(path, "/teams/200/removeUser");
        itest("randoop", 89).given(team, "/projects/Not Found/removeFollowers").checkEq(path, "/teams//projects/Not Found/removeFollowers/removeUser");
        itest("evosuite", 89).given(team, "H").checkEq(path, "/teams/H/removeUser");
        itest("randoop", 89).given(team, "0").checkEq(path, "/teams/0/removeUser");
        itest("randoop", 89).given(team, "/custom_fields//enum_options/insert").checkEq(path, "/teams//custom_fields//enum_options/insert/removeUser");
        itest("randoop", 89).given(team, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/teams//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeUser");
        itest("randoop", 89).given(team, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeUser");
        itest("randoop", 89).given(team, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/removeUser");
        itest("randoop", 89).given(team, "Invalid Request").checkEq(path, "/teams/Invalid Request/removeUser");
        return new ItemRequest<Team>(this, Team.class, path, "POST");
    }
}
