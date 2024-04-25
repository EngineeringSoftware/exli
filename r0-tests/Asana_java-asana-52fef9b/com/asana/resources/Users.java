package com.asana.resources;

import com.asana.Client;
import com.asana.models.ResourceWithSubtype;
import com.asana.models.User;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.UsersBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Users extends UsersBase {

    public Users(Client client) {
        super(client);
    }

    /**
     * Returns the full user record for the currently authenticated user.
     *
     * @return Request object
     */
    public ItemRequest<User> me() {
        return new ItemRequest<User>(this, User.class, "/users/me", "GET");
    }

    /**
     * Returns the full user record for the single user with the provided ID.
     *
     * @param  user An identifier for the user. Can be one of an email address,
     * the globally unique identifier for the user, or the keyword `me`
     * to indicate the current user making the request.
     * @return Request object
     */
    public ItemRequest<User> findById(String user) {
        String path = String.format("/users/%s", user);
        itest("randoop", 35).given(user, "Not Found").checkEq(path, "/users/Not Found");
        itest("randoop", 35).given(user, "200").checkEq(path, "/users/200");
        itest("randoop", 35).given(user, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("evosuite", 35).given(user, "QB=O)>5Z3").checkEq(path, "/users/QB=O)>5Z3");
        itest("randoop", 35).given(user, "/attachments/Not Found").checkEq(path, "/users//attachments/Not Found");
        itest("randoop", 35).given(user, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/users/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 35).given(user, "/custom_fields//enum_options/insert").checkEq(path, "/users//custom_fields//enum_options/insert");
        itest("evosuite", 35).given(user, "}01LM").checkEq(path, "/users/}01LM");
        itest("randoop", 35).given(user, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/users/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 35).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 35).given(user, "GET").checkEq(path, "/users/GET");
        itest("randoop", 35).given(user, "0").checkEq(path, "/users/0");
        itest("randoop", 35).given(user, "GET").checkEq(path, "/users/GET");
        itest("evosuite", 35).given(user, "Ts@!Fm^=8").checkEq(path, "/users/Ts@!Fm^=8");
        itest("evosuite", 35).given(user, "").checkEq(path, "/users/");
        itest("randoop", 35).given(user, "Payment Required").checkEq(path, "/users/Payment Required");
        itest("randoop", 35).given(user, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/users//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 35).given(user, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 35).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("dev", 35).given(user, "1").checkEq(path, "/users/1");
        itest("randoop", 35).given(user, "/portfolios/").checkEq(path, "/users//portfolios/");
        itest("randoop", 35).given(user, "Server Error").checkEq(path, "/users/Server Error");
        itest("randoop", 35).given(user, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 35).given(user, "POST").checkEq(path, "/users/POST");
        return new ItemRequest<User>(this, User.class, path, "GET");
    }

    /**
     * Returns all of a user's favorites in the given workspace, of the given type.
     * Results are given in order (The same order as Asana's sidebar).
     *
     * @param  user An identifier for the user. Can be one of an email address,
     * the globally unique identifier for the user, or the keyword `me`
     * to indicate the current user making the request.
     * @return Request object
     */
    public CollectionRequest<ResourceWithSubtype> getUserFavorites(String user) {
        String path = String.format("/users/%s/favorites", user);
        itest("randoop", 50).given(user, "Sync token invalid or too old").checkEq(path, "/users/Sync token invalid or too old/favorites");
        itest("evosuite", 50).given(user, "com.github.javaparser.ast.stmt").checkEq(path, "/users/com.github.javaparser.ast.stmt/favorites");
        itest("evosuite", 50).given(user, "GET").checkEq(path, "/users/GET/favorites");
        itest("randoop", 50).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/favorites");
        itest("randoop", 50).given(user, "POST").checkEq(path, "/users/POST/favorites");
        itest("evosuite", 50).given(user, null).checkEq(path, "/users/null/favorites");
        itest("randoop", 50).given(user, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/favorites");
        itest("randoop", 50).given(user, "/attachments/Not Found").checkEq(path, "/users//attachments/Not Found/favorites");
        itest("randoop", 50).given(user, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/favorites");
        itest("randoop", 50).given(user, "Invalid Request").checkEq(path, "/users/Invalid Request/favorites");
        itest("randoop", 50).given(user, "hi!").checkEq(path, "/users/hi!/favorites");
        itest("evosuite", 50).given(user, "CHARACTER_LITERAL").checkEq(path, "/users/CHARACTER_LITERAL/favorites");
        itest("evosuite", 50).given(user, "WyKTQAPpvh6)nk").checkEq(path, "/users/WyKTQAPpvh6)nk/favorites");
        itest("randoop", 50).given(user, "/portfolios/GET/removeMembers").checkEq(path, "/users//portfolios/GET/removeMembers/favorites");
        itest("randoop", 50).given(user, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/users//portfolios//goals/{goal_gid}/subgoals/favorites");
        itest("evosuite", 50).given(user, "com.asana.resources.Users").checkEq(path, "/users/com.asana.resources.Users/favorites");
        itest("randoop", 50).given(user, "Not Found").checkEq(path, "/users/Not Found/favorites");
        itest("randoop", 50).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/favorites");
        itest("randoop", 50).given(user, "").checkEq(path, "/users//favorites");
        itest("randoop", 50).given(user, "com.asana.errors.ServerError: Server Error").checkEq(path, "/users/com.asana.errors.ServerError: Server Error/favorites");
        itest("randoop", 50).given(user, "Server Error").checkEq(path, "/users/Server Error/favorites");
        itest("randoop", 50).given(user, "com.asana.errors.AsanaError: hi!").checkEq(path, "/users/com.asana.errors.AsanaError: hi!/favorites");
        itest("randoop", 50).given(user, "Payment Required").checkEq(path, "/users/Payment Required/favorites");
        itest("evosuite", 50).given(user, "f").checkEq(path, "/users/f/favorites");
        itest("randoop", 50).given(user, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/users/com.asana.errors.RetryableAsanaError: 200/favorites");
        itest("randoop", 50).given(user, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/favorites");
        itest("randoop", 50).given(user, "Forbidden").checkEq(path, "/users/Forbidden/favorites");
        itest("randoop", 50).given(user, "/tasks//attachments/Not Found/addProject").checkEq(path, "/users//tasks//attachments/Not Found/addProject/favorites");
        itest("randoop", 50).given(user, "/goals/Sync token invalid or too old").checkEq(path, "/users//goals/Sync token invalid or too old/favorites");
        itest("randoop", 50).given(user, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//favorites");
        return new CollectionRequest<ResourceWithSubtype>(this, ResourceWithSubtype.class, path, "GET");
    }

    /**
     * Returns the user records for all users in the specified workspace or
     * organization.
     *
     * @param  workspace The workspace in which to get users.
     * @return Request object
     */
    public CollectionRequest<User> findByWorkspace(String workspace) {
        String path = String.format("/workspaces/%s/users", workspace);
        itest("randoop", 63).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/users");
        itest("evosuite", 63).given(workspace, "xP7:Z").checkEq(path, "/workspaces/xP7:Z/users");
        itest("randoop", 63).given(workspace, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/workspaces/com.asana.errors.InvalidRequestError: Invalid Request/users");
        itest("randoop", 63).given(workspace, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/users");
        itest("randoop", 63).given(workspace, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/users");
        itest("randoop", 63).given(workspace, "200").checkEq(path, "/workspaces/200/users");
        itest("randoop", 63).given(workspace, "/tags/Payment Required").checkEq(path, "/workspaces//tags/Payment Required/users");
        itest("evosuite", 63).given(workspace, "GET").checkEq(path, "/workspaces/GET/users");
        itest("randoop", 63).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/users");
        itest("randoop", 63).given(workspace, "/tasks//attachments/Not Found/addProject").checkEq(path, "/workspaces//tasks//attachments/Not Found/addProject/users");
        itest("evosuite", 63).given(workspace, "QB=O)>5Z3").checkEq(path, "/workspaces/QB=O)>5Z3/users");
        itest("randoop", 63).given(workspace, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//goals/{goal_gid}/addSubgoal/users");
        itest("randoop", 63).given(workspace, "/attachments/").checkEq(path, "/workspaces//attachments//users");
        itest("evosuite", 63).given(workspace, "`;r\u0002U >%(b").checkEq(path, "/workspaces/`;r\u0002U >%(b/users");
        itest("randoop", 63).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/users");
        itest("randoop", 63).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/users");
        itest("randoop", 63).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/users");
        itest("randoop", 63).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/users");
        itest("randoop", 63).given(workspace, "POST").checkEq(path, "/workspaces/POST/users");
        itest("randoop", 63).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found/users");
        itest("evosuite", 63).given(workspace, "/users/me").checkEq(path, "/workspaces//users/me/users");
        itest("evosuite", 63).given(workspace, "xP7Z").checkEq(path, "/workspaces/xP7Z/users");
        itest("randoop", 63).given(workspace, "Payment Required").checkEq(path, "/workspaces/Payment Required/users");
        itest("evosuite", 63).given(workspace, "").checkEq(path, "/workspaces//users");
        itest("randoop", 63).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/users");
        return new CollectionRequest<User>(this, User.class, path, "GET");
    }

    /**
     * Returns the user records for all users in all workspaces and organizations
     * accessible to the authenticated user. Accepts an optional workspace ID
     * parameter.
     *
     * @return Request object
     */
    public CollectionRequest<User> findAll() {
        return new CollectionRequest<User>(this, User.class, "/users", "GET");
    }
}
