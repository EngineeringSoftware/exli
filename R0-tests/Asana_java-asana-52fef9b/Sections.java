package com.asana.resources;

import com.asana.Client;
import com.asana.models.Section;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.SectionsBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public class Sections extends SectionsBase {

    public Sections(Client client) {
        super(client);
    }

    /**
     * Creates a new section in a project.
     *
     * Returns the full record of the newly created section.
     *
     * @param  project The project to create the section in
     * @return Request object
     */
    public ItemRequest<Section> createInProject(String project) {
        String path = String.format("/projects/%s/sections", project);
        new Here("Randoop", 24).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/sections");
        return new ItemRequest<Section>(this, Section.class, path, "POST");
    }

    /**
     * Returns the compact records for all sections in the specified project.
     *
     * @param  project The project to get sections from.
     * @return Request object
     */
    public CollectionRequest<Section> findByProject(String project) {
        String path = String.format("/projects/%s/sections", project);
        new Here("Randoop", 36).given(project, "DELETE").checkEq(path, "/projects/DELETE/sections");
        new Here("Randoop", 36).given(project, "").checkEq(path, "/projects//sections");
        return new CollectionRequest<Section>(this, Section.class, path, "GET");
    }

    /**
     * Returns the complete record for a single section.
     *
     * @param  section The section to get.
     * @return Request object
     */
    public ItemRequest<Section> findById(String section) {
        String path = String.format("/sections/%s", section);
        new Here("Randoop", 48).given(section, "com.asana.errors.RetryableAsanaError: Not Found").checkEq(path, "/sections/com.asana.errors.RetryableAsanaError: Not Found");
        return new ItemRequest<Section>(this, Section.class, path, "GET");
    }

    /**
     * A specific, existing section can be updated by making a PUT request on
     * the URL for that project. Only the fields provided in the `data` block
     * will be updated; any unspecified fields will remain unchanged. (note that
     * at this time, the only field that can be updated is the `name` field.)
     *
     * When using this method, it is best to specify only those fields you wish
     * to change, or else you may overwrite changes made by another user since
     * you last retrieved the task.
     *
     * Returns the complete updated section record.
     *
     * @param  section The section to update.
     * @return Request object
     */
    public ItemRequest<Section> update(String section) {
        String path = String.format("/sections/%s", section);
        new Here("Randoop", 69).given(section, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error");
        new Here("Randoop", 69).given(section, "").checkEq(path, "/sections/");
        new Here("Randoop", 69).given(section, "200").checkEq(path, "/sections/200");
        new Here("Randoop", 69).given(section, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/sections/urn:ietf:wg:oauth:2.0:oob");
        return new ItemRequest<Section>(this, Section.class, path, "PUT");
    }

    /**
     * A specific, existing section can be deleted by making a DELETE request
     * on the URL for that section.
     *
     * Note that sections must be empty to be deleted.
     *
     * The last remaining section in a board view cannot be deleted.
     *
     * Returns an empty data block.
     *
     * @param  section The section to delete.
     * @return Request object
     */
    public ItemRequest<Section> delete(String section) {
        String path = String.format("/sections/%s", section);
        new Here("Randoop", 88).given(section, "").checkEq(path, "/sections/");
        new Here("Randoop", 88).given(section, "DELETE").checkEq(path, "/sections/DELETE");
        new Here("Randoop", 88).given(section, "hi!").checkEq(path, "/sections/hi!");
        new Here("Randoop", 88).given(section, "Sync token invalid or too old").checkEq(path, "/sections/Sync token invalid or too old");
        new Here("Randoop", 88).given(section, "Server Error").checkEq(path, "/sections/Server Error");
        new Here("Randoop", 88).given(section, "Not Found").checkEq(path, "/sections/Not Found");
        new Here("Randoop", 88).given(section, "/tasks/Not Found/removeProject").checkEq(path, "/sections//tasks/Not Found/removeProject");
        return new ItemRequest<Section>(this, Section.class, path, "DELETE");
    }

    /**
     * Add a task to a specific, existing section. This will remove the task from other sections of the project.
     *
     * The task will be inserted at the top of a section unless an `insert_before` or `insert_after` parameter is declared.
     *
     * This does not work for separators (tasks with the `resource_subtype` of section).
     *
     * @param  section The section in which to add the task
     * @return Request object
     */
    public ItemRequest<Section> addTask(String section) {
        String path = String.format("/sections/%s/addTask", section);
        new Here("Randoop", 104).given(section, "Not Found").checkEq(path, "/sections/Not Found/addTask");
        new Here("Randoop", 104).given(section, "404").checkEq(path, "/sections/404/addTask");
        new Here("Randoop", 104).given(section, "NoAuthorizationError").checkEq(path, "/sections/NoAuthorizationError/addTask");
        new Here("Randoop", 104).given(section, "Server Error").checkEq(path, "/sections/Server Error/addTask");
        new Here("Randoop", 104).given(section, "Sync token invalid or too old").checkEq(path, "/sections/Sync token invalid or too old/addTask");
        new Here("Randoop", 104).given(section, "").checkEq(path, "/sections//addTask");
        new Here("Randoop", 104).given(section, "Forbidden").checkEq(path, "/sections/Forbidden/addTask");
        return new ItemRequest<Section>(this, Section.class, path, "POST");
    }

    /**
     * Move sections relative to each other in a board view. One of
     * `before_section` or `after_section` is required.
     *
     * Sections cannot be moved between projects.
     *
     * At this point in time, moving sections is not supported in list views, only board views.
     *
     * Returns an empty data block.
     *
     * @param  project The project in which to reorder the given section
     * @return Request object
     */
    public ItemRequest<Section> insertInProject(String project) {
        String path = String.format("/projects/%s/sections/insert", project);
        new Here("Randoop", 123).given(project, "Not Found").checkEq(path, "/projects/Not Found/sections/insert");
        new Here("Randoop", 123).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/sections/insert");
        return new ItemRequest<Section>(this, Section.class, path, "POST");
    }
}
