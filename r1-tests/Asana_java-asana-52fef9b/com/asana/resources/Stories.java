package com.asana.resources;

import com.asana.Client;
import com.asana.models.Story;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.StoriesBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Stories extends StoriesBase {

    public Stories(Client client) {
        super(client);
    }

    /**
     * Returns the compact records for all stories on the task.
     *
     * @param  task Globally unique identifier for the task.
     * @return Request object
     */
    public CollectionRequest<Story> findByTask(String task) {
        String path = String.format("/tasks/%s/stories", task);
        itest("evosuite", 22).given(task, null).checkEq(path, "/tasks/null/stories");
        return new CollectionRequest<Story>(this, Story.class, path, "GET");
    }

    /**
     * Returns the full record for a single story.
     *
     * @param  story Globally unique identifier for the story.
     * @return Request object
     */
    public ItemRequest<Story> findById(String story) {
        String path = String.format("/stories/%s", story);
        itest("dev", 34).given(story, "1").checkEq(path, "/stories/1");
        return new ItemRequest<Story>(this, Story.class, path, "GET");
    }

    /**
     * Adds a comment to a task. The comment will be authored by the
     * currently authenticated user, and timestamped when the server receives
     * the request.
     *
     * Returns the full record for the new story added to the task.
     *
     * @param  task Globally unique identifier for the task.
     * @return Request object
     */
    public ItemRequest<Story> createOnTask(String task) {
        String path = String.format("/tasks/%s/stories", task);
        itest("evosuite", 50).given(task, null).checkEq(path, "/tasks/null/stories");
        return new ItemRequest<Story>(this, Story.class, path, "POST");
    }

    /**
     * Updates the story and returns the full record for the updated story.
     * Only comment stories can have their text updated, and only comment stories and
     * attachment stories can be pinned. Only one of `text` and `html_text` can be specified.
     *
     * @param  story Globally unique identifier for the story.
     * @return Request object
     */
    public ItemRequest<Story> update(String story) {
        String path = String.format("/stories/%s", story);
        itest("evosuite", 64).given(story, "com.github.javaparser.ast.validator.TreeVisitorValidator").checkEq(path, "/stories/com.github.javaparser.ast.validator.TreeVisitorValidator");
        return new ItemRequest<Story>(this, Story.class, path, "PUT");
    }

    /**
     * Deletes a story. A user can only delete stories they have created. Returns an empty data record.
     *
     * @param  story Globally unique identifier for the story.
     * @return Request object
     */
    public ItemRequest<Story> delete(String story) {
        String path = String.format("/stories/%s", story);
        itest("evosuite", 76).given(story, "").checkEq(path, "/stories/");
        return new ItemRequest<Story>(this, Story.class, path, "DELETE");
    }
}
