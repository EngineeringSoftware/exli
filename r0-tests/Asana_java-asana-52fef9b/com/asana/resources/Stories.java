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
        itest("randoop", 22).given(task, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/stories");
        itest("randoop", 22).given(task, "POST").checkEq(path, "/tasks/POST/stories");
        itest("randoop", 22).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/stories");
        itest("randoop", 22).given(task, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/stories");
        itest("evosuite", 22).given(task, "6qS201AdCP}bt3!fx}").checkEq(path, "/tasks/6qS201AdCP}bt3!fx}/stories");
        itest("randoop", 22).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/stories");
        itest("evosuite", 22).given(task, "/tasks/null/stories").checkEq(path, "/tasks//tasks/null/stories/stories");
        itest("randoop", 22).given(task, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/stories");
        itest("randoop", 22).given(task, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/stories");
        itest("randoop", 22).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/stories");
        itest("randoop", 22).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/stories");
        itest("evosuite", 22).given(task, "ArrayAccessExpr").checkEq(path, "/tasks/ArrayAccessExpr/stories");
        itest("randoop", 22).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/stories");
        itest("randoop", 22).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/stories");
        itest("evosuite", 22).given(task, "v4U> ;Q").checkEq(path, "/tasks/v4U> ;Q/stories");
        itest("randoop", 22).given(task, "10").checkEq(path, "/tasks/10/stories");
        itest("evosuite", 22).given(task, null).checkEq(path, "/tasks/null/stories");
        itest("randoop", 22).given(task, "").checkEq(path, "/tasks//stories");
        itest("randoop", 22).given(task, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//portfolio_memberships//goals/{goal_gid}/addSubgoal/stories");
        itest("randoop", 22).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/stories");
        itest("randoop", 22).given(task, "/workspaces/").checkEq(path, "/tasks//workspaces//stories");
        itest("randoop", 22).given(task, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/stories");
        itest("randoop", 22).given(task, "200").checkEq(path, "/tasks/200/stories");
        itest("evosuite", 22).given(task, "PUT").checkEq(path, "/tasks/PUT/stories");
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
        itest("randoop", 34).given(story, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/stories/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 34).given(story, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("evosuite", 34).given(story, "W\"wo!9W~Q9&?W").checkEq(path, "/stories/W\"wo!9W~Q9&?W");
        itest("randoop", 34).given(story, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/stories/com.asana.errors.RetryableAsanaError: 200");
        itest("evosuite", 34).given(story, " zv'$gX").checkEq(path, "/stories/ zv'$gX");
        itest("evosuite", 34).given(story, "com.gihub.javaparser.ast.visitor.VoidVisitorWithDefau}ts").checkEq(path, "/stories/com.gihub.javaparser.ast.visitor.VoidVisitorWithDefau}ts");
        itest("randoop", 34).given(story, "/portfolios/").checkEq(path, "/stories//portfolios/");
        itest("evosuite", 34).given(story, null).checkEq(path, "/stories/null");
        itest("randoop", 34).given(story, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 34).given(story, "GET").checkEq(path, "/stories/GET");
        itest("randoop", 34).given(story, "NoAuthorizationError").checkEq(path, "/stories/NoAuthorizationError");
        itest("randoop", 34).given(story, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 34).given(story, "/portfolios/GET/removeMembers").checkEq(path, "/stories//portfolios/GET/removeMembers");
        itest("randoop", 34).given(story, "Sync token invalid or too old").checkEq(path, "/stories/Sync token invalid or too old");
        itest("evosuite", 34).given(story, "/tasks/FOKQU]6p/stories").checkEq(path, "/stories//tasks/FOKQU]6p/stories");
        itest("randoop", 34).given(story, "/tasks/200/addProject").checkEq(path, "/stories//tasks/200/addProject");
        itest("randoop", 34).given(story, "Rate Limit Enforced").checkEq(path, "/stories/Rate Limit Enforced");
        itest("evosuite", 34).given(story, "POST").checkEq(path, "/stories/POST");
        itest("randoop", 34).given(story, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/stories/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 34).given(story, "/organizations//teams").checkEq(path, "/stories//organizations//teams");
        itest("randoop", 34).given(story, "/tasks//attachments/Not Found/addProject").checkEq(path, "/stories//tasks//attachments/Not Found/addProject");
        itest("randoop", 34).given(story, "/attachments/Not Found").checkEq(path, "/stories//attachments/Not Found");
        itest("randoop", 34).given(story, "").checkEq(path, "/stories/");
        itest("randoop", 34).given(story, "/projects/Rate Limit Enforced/sections").checkEq(path, "/stories//projects/Rate Limit Enforced/sections");
        itest("randoop", 34).given(story, "Not Found").checkEq(path, "/stories/Not Found");
        itest("evosuite", 34).given(story, "").checkEq(path, "/stories/");
        itest("randoop", 34).given(story, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 34).given(story, "/goals/{goal_gid}/subgoals").checkEq(path, "/stories//goals/{goal_gid}/subgoals");
        itest("dev", 34).given(story, "1").checkEq(path, "/stories/1");
        itest("randoop", 34).given(story, "Server Error").checkEq(path, "/stories/Server Error");
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
        itest("randoop", 50).given(task, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/stories");
        itest("evosuite", 50).given(task, "FOKQU]6p").checkEq(path, "/tasks/FOKQU]6p/stories");
        itest("randoop", 50).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/stories");
        itest("evosuite", 50).given(task, ")8c: !{T3Hv0d").checkEq(path, "/tasks/)8c: !{T3Hv0d/stories");
        itest("randoop", 50).given(task, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/stories");
        itest("randoop", 50).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/stories");
        itest("randoop", 50).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/stories");
        itest("randoop", 50).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/stories");
        itest("randoop", 50).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request/stories");
        itest("randoop", 50).given(task, "Forbidden").checkEq(path, "/tasks/Forbidden/stories");
        itest("randoop", 50).given(task, "").checkEq(path, "/tasks//stories");
        itest("evosuite", 50).given(task, "/stories/6qS201AdCP}bt3!fx}").checkEq(path, "/tasks//stories/6qS201AdCP}bt3!fx}/stories");
        itest("randoop", 50).given(task, "0").checkEq(path, "/tasks/0/stories");
        itest("randoop", 50).given(task, "/tags").checkEq(path, "/tasks//tags/stories");
        itest("evosuite", 50).given(task, "0Mo").checkEq(path, "/tasks/0Mo/stories");
        itest("randoop", 50).given(task, "/tags/Payment Required").checkEq(path, "/tasks//tags/Payment Required/stories");
        itest("randoop", 50).given(task, "/tasks//attachments/Not Found/addProject").checkEq(path, "/tasks//tasks//attachments/Not Found/addProject/stories");
        itest("evosuite", 50).given(task, null).checkEq(path, "/tasks/null/stories");
        itest("randoop", 50).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/stories");
        itest("randoop", 50).given(task, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/stories");
        itest("randoop", 50).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/stories");
        itest("randoop", 50).given(task, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/stories");
        itest("evosuite", 50).given(task, "g[Y![").checkEq(path, "/tasks/g[Y![/stories");
        itest("randoop", 50).given(task, "Not Found").checkEq(path, "/tasks/Not Found/stories");
        itest("randoop", 50).given(task, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/stories");
        itest("randoop", 50).given(task, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/stories");
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
        itest("evosuite", 64).given(story, "6qS201AdCP}bt3!fx}").checkEq(path, "/stories/6qS201AdCP}bt3!fx}");
        itest("randoop", 64).given(story, "").checkEq(path, "/stories/");
        itest("randoop", 64).given(story, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 64).given(story, "/webhooks/NoAuthorizationError").checkEq(path, "/stories//webhooks/NoAuthorizationError");
        itest("randoop", 64).given(story, "/portfolios/").checkEq(path, "/stories//portfolios/");
        itest("randoop", 64).given(story, "/tasks//attachments/Not Found/addProject").checkEq(path, "/stories//tasks//attachments/Not Found/addProject");
        itest("randoop", 64).given(story, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state");
        itest("randoop", 64).given(story, "Sync token invalid or too old").checkEq(path, "/stories/Sync token invalid or too old");
        itest("randoop", 64).given(story, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/stories/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("evosuite", 64).given(story, null).checkEq(path, "/stories/null");
        itest("evosuite", 64).given(story, "PUT").checkEq(path, "/stories/PUT");
        itest("randoop", 64).given(story, "Not Found").checkEq(path, "/stories/Not Found");
        itest("randoop", 64).given(story, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/stories//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 64).given(story, "com.asana.errors.AsanaError: hi!").checkEq(path, "/stories/com.asana.errors.AsanaError: hi!");
        itest("randoop", 64).given(story, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 64).given(story, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("evosuite", 64).given(story, "").checkEq(path, "/stories/");
        itest("randoop", 64).given(story, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 64).given(story, "Rate Limit Enforced").checkEq(path, "/stories/Rate Limit Enforced");
        itest("randoop", 64).given(story, "/attachments/Not Found").checkEq(path, "/stories//attachments/Not Found");
        itest("randoop", 64).given(story, "0").checkEq(path, "/stories/0");
        itest("randoop", 64).given(story, "hi!").checkEq(path, "/stories/hi!");
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
        itest("randoop", 76).given(story, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/stories/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 76).given(story, "1*3K?!Sx$").checkEq(path, "/stories/1*3K?!Sx$");
        itest("randoop", 76).given(story, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/stories//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 76).given(story, "?rc:").checkEq(path, "/stories/?rc:");
        itest("randoop", 76).given(story, "/tags/Payment Required").checkEq(path, "/stories//tags/Payment Required");
        itest("randoop", 76).given(story, "10").checkEq(path, "/stories/10");
        itest("randoop", 76).given(story, "POST").checkEq(path, "/stories/POST");
        itest("randoop", 76).given(story, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/stories/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 76).given(story, "hi!").checkEq(path, "/stories/hi!");
        itest("randoop", 76).given(story, "Sync token invalid or too old").checkEq(path, "/stories/Sync token invalid or too old");
        itest("randoop", 76).given(story, "").checkEq(path, "/stories/");
        itest("randoop", 76).given(story, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 76).given(story, "aW~A").checkEq(path, "/stories/aW~A");
        itest("evosuite", 76).given(story, "").checkEq(path, "/stories/");
        itest("randoop", 76).given(story, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/stories//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 76).given(story, "Forbidden").checkEq(path, "/stories/Forbidden");
        itest("randoop", 76).given(story, "Rate Limit Enforced").checkEq(path, "/stories/Rate Limit Enforced");
        itest("randoop", 76).given(story, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/stories/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 76).given(story, "NoAuthorizationError").checkEq(path, "/stories/NoAuthorizationError");
        itest("randoop", 76).given(story, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/stories//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 76).given(story, "0").checkEq(path, "/stories/0");
        return new ItemRequest<Story>(this, Story.class, path, "DELETE");
    }
}
