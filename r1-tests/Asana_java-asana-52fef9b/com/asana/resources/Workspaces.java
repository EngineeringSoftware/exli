package com.asana.resources;

import com.asana.Client;
import com.asana.models.*;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.WorkspacesBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Workspaces extends WorkspacesBase {

    public Workspaces(Client client) {
        super(client);
    }

    public CollectionRequest<Task> taskTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("evosuite", 15).given(workspace, "/workspaces/qVK7OEdAz&g").checkEq(path, "/workspaces//workspaces/qVK7OEdAz&g/typeahead");
        itest("evosuite", 15).given(workspace, "EXTENDED_TYPE").checkEq(path, "/workspaces/EXTENDED_TYPE/typeahead");
        CollectionRequest<Task> request = new CollectionRequest<>(this, Task.class, path, "GET");
        return request.query("type", "task");
    }

    public CollectionRequest<User> userTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("evosuite", 21).given(workspace, "0B").checkEq(path, "/workspaces/0B/typeahead");
        CollectionRequest<User> request = new CollectionRequest<>(this, User.class, path, "GET");
        return request.query("type", "user");
    }

    public CollectionRequest<Project> projectTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("randoop", 27).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/typeahead");
        itest("evosuite", 27).given(workspace, "").checkEq(path, "/workspaces//typeahead");
        CollectionRequest<Project> request = new CollectionRequest<>(this, Project.class, path, "GET");
        return request.query("type", "project");
    }

    public CollectionRequest<Tag> tagTypeahead(String workspace) {
        String path = String.format("/workspaces/%s/typeahead", workspace);
        itest("evosuite", 33).given(workspace, "com.github.javaparser.ast.comments.JavadocComment").checkEq(path, "/workspaces/com.github.javaparser.ast.comments.JavadocComment/typeahead");
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
        itest("dev", 46).given(workspace, "1").checkEq(path, "/workspaces/1");
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
        itest("evosuite", 74).given(workspace, "/workspaces/com.github.javaparser.ast.comments.JavadocComment/typeahead").checkEq(path, "/workspaces//workspaces/com.github.javaparser.ast.comments.JavadocComment/typeahead");
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
        itest("evosuite", 90).given(workspace, "com.asana.resources.Tasks").checkEq(path, "/workspaces/com.asana.resources.Tasks/typeahead");
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
        itest("evosuite", 103).given(workspace, "~(_VS?").checkEq(path, "/workspaces/~(_VS?/addUser");
        itest("evosuite", 103).given(workspace, "").checkEq(path, "/workspaces//addUser");
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
        itest("evosuite", 116).given(workspace, "f<Zi").checkEq(path, "/workspaces/f<Zi/removeUser");
        itest("evosuite", 116).given(workspace, "~(VS?").checkEq(path, "/workspaces/~(VS?/removeUser");
        return new ItemRequest<Workspace>(this, Workspace.class, path, "POST");
    }
}
