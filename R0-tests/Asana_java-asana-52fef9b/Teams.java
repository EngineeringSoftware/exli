package com.asana.resources;

import com.asana.Client;
import com.asana.models.Team;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.TeamsBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 22).given(team, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/teams/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        new Here("Randoop", 22).given(team, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old");
        new Here("Unit", 22).given(team, "1").checkEq(path, "/teams/1");
        new Here("Randoop", 22).given(team, "").checkEq(path, "/teams/");
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
        new Here("Randoop", 35).given(organization, "Payment Required").checkEq(path, "/organizations/Payment Required/teams");
        new Here("Randoop", 35).given(organization, "Sync token invalid or too old").checkEq(path, "/organizations/Sync token invalid or too old/teams");
        new Here("Randoop", 35).given(organization, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/organizations/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/teams");
        new Here("Randoop", 35).given(organization, "").checkEq(path, "/organizations//teams");
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
        new Here("Randoop", 49).given(user, "GET").checkEq(path, "/users/GET/teams");
        new Here("Randoop", 49).given(user, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/users/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/teams");
        new Here("Randoop", 49).given(user, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=404").checkEq(path, "/users/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=404/teams");
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
        new Here("Randoop", 61).given(team, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=404").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=404/users");
        new Here("Randoop", 61).given(team, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/teams/com.asana.errors.InvalidRequestError: Invalid Request/users");
        new Here("Randoop", 61).given(team, "").checkEq(path, "/teams//users");
        new Here("Randoop", 61).given(team, "POST").checkEq(path, "/teams/POST/users");
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
        new Here("Randoop", 76).given(team, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error/addUser");
        new Here("Randoop", 76).given(team, "").checkEq(path, "/teams//addUser");
        new Here("Randoop", 76).given(team, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old/addUser");
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
        new Here("Randoop", 89).given(team, "Not Found").checkEq(path, "/teams/Not Found/removeUser");
        new Here("Randoop", 89).given(team, "Sync token invalid or too old").checkEq(path, "/teams/Sync token invalid or too old/removeUser");
        return new ItemRequest<Team>(this, Team.class, path, "POST");
    }
}
