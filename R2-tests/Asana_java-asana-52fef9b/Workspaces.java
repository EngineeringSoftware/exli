package com.asana.resources;

import com.asana.Client;
import com.asana.models.*;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.WorkspacesBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public class Workspaces extends WorkspacesBase {

    public Workspaces(Client client) {
        super(client);
    }

    public CollectionRequest<Task> taskTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        new Here("Randoop", 15).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error/typeahead");
        CollectionRequest<Task> request = new CollectionRequest<>(this, Task.class, path, "GET");
        return request.query("type", "task");
    }

    public CollectionRequest<User> userTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        new Here("Randoop", 21).given(workspace, "200").checkEq(path, "/workspaces/200/typeahead");
        CollectionRequest<User> request = new CollectionRequest<>(this, User.class, path, "GET");
        return request.query("type", "user");
    }

    public CollectionRequest<Project> projectTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        new Here("Randoop", 27).given(workspace, "com.asana.errors.RetryableAsanaError: Not Found").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: Not Found/typeahead");
        CollectionRequest<Project> request = new CollectionRequest<>(this, Project.class, path, "GET");
        return request.query("type", "project");
    }

    public CollectionRequest<Tag> tagTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        new Here("Randoop", 33).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found/typeahead");
        CollectionRequest<Tag> request = new CollectionRequest<>(this, Tag.class, path, "GET");
        return request.query("type", "tag");
    }

    /**
     * Returns the full workspace record for a single workspace.
     *
     * @param  workspace Globally unique identifier for the workspace or organization.
     * @return Request object
     */
    public ItemRequest<Workspace> findById(String workspace) {
        String path = String.format("/workspaces/%s", workspace);
        new Here("Unit", 46).given(workspace, "1").checkEq(path, "/workspaces/1");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "GET");
    }

    /**
     * Returns the compact records for all workspaces visible to the authorized user.
     *
     * @return Request object
     */
    public CollectionRequest<Workspace> findAll() {
        return new CollectionRequest<Workspace>(this, Workspace.class, "/workspaces", "GET");
    }

    /**
     * A specific, existing workspace can be updated by making a PUT request on
     * the URL for that workspace. Only the fields provided in the data block
     * will be updated; any unspecified fields will remain unchanged.
     *
     * Currently the only field that can be modified for a workspace is its `name`.
     *
     * Returns the complete, updated workspace record.
     *
     * @param  workspace The workspace to update.
     * @return Request object
     */
    public ItemRequest<Workspace> update(String workspace) {
        String path = String.format("/workspaces/%s", workspace);
        new Here("Randoop", 74).given(workspace, "hi!").checkEq(path, "/workspaces/hi!");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "PUT");
    }

    /**
     * Retrieves objects in the workspace based on an auto-completion/typeahead
     * search algorithm. This feature is meant to provide results quickly, so do
     * not rely on this API to provide extremely accurate search results. The
     * result set is limited to a single page of results with a maximum size,
     * so you won't be able to fetch large numbers of results.
     *
     * @param  workspace The workspace to fetch objects from.
     * @return Request object
     */
    public CollectionRequest<ResourceWithSubtype> typeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        new Here("Randoop", 90).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden/typeahead");
        return new CollectionRequest<ResourceWithSubtype>(this, ResourceWithSubtype.class, path, "GET");
    }

    /**
     * The user can be referenced by their globally unique user ID or their email address.
     * Returns the full user record for the invited user.
     *
     * @param  workspace The workspace or organization to invite the user to.
     * @return Request object
     */
    public ItemRequest<Workspace> addUser(String workspace) {
        String path = String.format("/workspaces/%s/addUser", workspace);
        new Here("Randoop", 103).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=com.asana.errors.RateLimitEnforcedError:%20Rate%20Limit%20Enforced").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=com.asana.errors.RateLimitEnforcedError:%20Rate%20Limit%20Enforced/addUser");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "POST");
    }

    /**
     * The user making this call must be an admin in the workspace.
     * Returns an empty data record.
     *
     * @param  workspace The workspace or organization to invite the user to.
     * @return Request object
     */
    public ItemRequest<Workspace> removeUser(String workspace) {
        String path = String.format("/workspaces/%s/removeUser", workspace);
        new Here("Randoop", 116).given(workspace, "Not Found").checkEq(path, "/workspaces/Not Found/removeUser");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "POST");
    }
}
