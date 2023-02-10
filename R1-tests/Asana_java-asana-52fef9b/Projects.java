package com.asana.resources;

import com.asana.Client;
import com.asana.models.Project;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.ProjectsBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 45).given(workspace, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/projects");
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
        new Here("Randoop", 59).given(team, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=404").checkEq(path, "/teams/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=404/projects");
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
        new Here("Unit", 71).given(project, "1").checkEq(path, "/projects/1");
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
        new Here("Randoop", 91).given(project, "Not Found").checkEq(path, "/projects/Not Found");
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
        new Here("Randoop", 106).given(project, "GET").checkEq(path, "/projects/GET");
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
        new Here("Randoop", 129).given(workspace, "").checkEq(path, "/workspaces//projects");
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
        new Here("Randoop", 141).given(team, "DELETE").checkEq(path, "/teams/DELETE/projects");
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
        new Here("Randoop", 154).given(project, "404").checkEq(path, "/projects/404/tasks");
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
        new Here("Randoop", 168).given(project, "com.asana.errors.RetryableAsanaError: Not Found").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Not Found/addFollowers");
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
        new Here("Randoop", 181).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/removeFollowers");
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
        new Here("Randoop", 193).given(project, "hi!").checkEq(path, "/projects/hi!/addMembers");
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
        new Here("Randoop", 205).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/removeMembers");
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
        new Here("Randoop", 217).given(project, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/projects/com.asana.errors.InvalidRequestError: Invalid Request/addCustomFieldSetting");
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
        new Here("Randoop", 229).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/removeCustomFieldSetting");
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }
}
