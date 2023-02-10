package com.asana.resources;

import com.asana.Client;
import com.asana.models.ResourceWithSubtype;
import com.asana.models.User;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.UsersBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Unit", 35).given(user, "1").checkEq(path, "/users/1");
        new Here("Randoop", 35).given(user, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/users/urn:ietf:wg:oauth:2.0:oob");
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
        new Here("Randoop", 50).given(user, "Not Found").checkEq(path, "/users/Not Found/favorites");
        new Here("Randoop", 50).given(user, "NoAuthorizationError").checkEq(path, "/users/NoAuthorizationError/favorites");
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
        new Here("Randoop", 63).given(workspace, "POST").checkEq(path, "/workspaces/POST/users");
        new Here("Randoop", 63).given(workspace, "404").checkEq(path, "/workspaces/404/users");
        new Here("Randoop", 63).given(workspace, "/tasks/Not Found/removeProject").checkEq(path, "/workspaces//tasks/Not Found/removeProject/users");
        new Here("Randoop", 63).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/users");
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
