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
        itest("evosuite", 45).given(workspace, "HK2Z'\"clH,EG}L").checkEq(path, "/workspaces/HK2Z'\"clH,EG}L/projects");
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
        itest("evosuite", 59).given(team, "").checkEq(path, "/teams//projects");
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
        itest("dev", 71).given(project, "1").checkEq(path, "/projects/1");
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
        itest("evosuite", 106).given(project, "").checkEq(path, "/projects/");
        itest("evosuite", 106).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers");
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
        itest("evosuite", 129).given(workspace, "/projects/com.asana.resources.ProjectStatuses/addCustomFieldSetting").checkEq(path, "/workspaces//projects/com.asana.resources.ProjectStatuses/addCustomFieldSetting/projects");
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
        itest("evosuite", 141).given(team, "{Iy(PiMd!DJTyA").checkEq(path, "/teams/{Iy(PiMd!DJTyA/projects");
        itest("evosuite", 141).given(team, "(Pgv4U> ;Q").checkEq(path, "/teams/(Pgv4U> ;Q/projects");
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
        itest("evosuite", 168).given(project, "/projects/%s/rbovyMemb[rs").checkEq(path, "/projects//projects/%s/rbovyMemb[rs/addFollowers");
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
        itest("evosuite", 181).given(project, "com.asana.resources.ProjectStatuses").checkEq(path, "/projects/com.asana.resources.ProjectStatuses/removeFollowers");
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
        itest("evosuite", 193).given(project, "GET").checkEq(path, "/projects/GET/addMembers");
        itest("evosuite", 193).given(project, "/projects/%s/removeCustomFieldSetting").checkEq(path, "/projects//projects/%s/removeCustomFieldSetting/addMembers");
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
        itest("evosuite", 205).given(project, "/projects/%s/removeMembers").checkEq(path, "/projects//projects/%s/removeMembers/removeMembers");
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
        itest("evosuite", 217).given(project, "com.asana.resources.ProjectStatuses").checkEq(path, "/projects/com.asana.resources.ProjectStatuses/addCustomFieldSetting");
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
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }
}
