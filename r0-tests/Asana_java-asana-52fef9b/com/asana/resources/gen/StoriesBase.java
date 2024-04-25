package com.asana.resources.gen;

import com.asana.Client;
import com.asana.resources.Resource;
import com.asana.requests.ItemRequest;
import com.asana.requests.CollectionRequest;
import com.asana.models.*;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class StoriesBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public StoriesBase(Client client) {
        super(client);
    }

    /**
     * Create a story on a task
     * Adds a story to a task. This endpoint currently only allows for comment stories to be created. The comment will be authored by the currently authenticated user, and timestamped when the server receives the request.  Returns the full record for the new story added to the task.
     * @param taskGid The task to operate on. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Story)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Story> createStoryForTask(String taskGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/stories".replace("{task_gid}", taskGid);
        itest("randoop", 31).given(taskGid, "/tags").checkEq(path, "/tasks//tags/stories");
        itest("randoop", 31).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/stories");
        itest("randoop", 31).given(taskGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/tasks//workspaces//goals/{goal_gid}/subgoals/tasks/stories");
        itest("randoop", 31).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/stories");
        itest("randoop", 31).given(taskGid, "200").checkEq(path, "/tasks/200/stories");
        itest("randoop", 31).given(taskGid, "10").checkEq(path, "/tasks/10/stories");
        itest("randoop", 31).given(taskGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/stories");
        itest("randoop", 31).given(taskGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tasks//webhooks/NoAuthorizationError/stories");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/stories");
        itest("randoop", 31).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/stories");
        itest("randoop", 31).given(taskGid, "2").checkEq(path, "/tasks/2/stories");
        itest("evosuite", 31).given(taskGid, "DELETE").checkEq(path, "/tasks/DELETE/stories");
        itest("evosuite", 31).given(taskGid, "}|R2>P1kc'r'pPrOw,").checkEq(path, "/tasks/}|R2>P1kc'r'pPrOw,/stories");
        itest("randoop", 31).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/stories");
        itest("randoop", 31).given(taskGid, "POST").checkEq(path, "/tasks/POST/stories");
        itest("randoop", 31).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/stories");
        itest("randoop", 31).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/stories");
        itest("randoop", 31).given(taskGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/stories");
        itest("randoop", 31).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/stories");
        itest("randoop", 31).given(taskGid, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/stories");
        itest("randoop", 31).given(taskGid, "GET").checkEq(path, "/tasks/GET/stories");
        itest("randoop", 31).given(taskGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/stories");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/stories");
        itest("evosuite", 31).given(taskGid, "mrO]{_MB").checkEq(path, "/tasks/mrO]{_MB/stories");
        itest("randoop", 31).given(taskGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/stories");
        itest("randoop", 31).given(taskGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/stories");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/stories");
        itest("randoop", 31).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/stories");
        itest("randoop", 31).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/stories");
        itest("randoop", 31).given(taskGid, "/projects/Not Found/removeFollowers").checkEq(path, "/tasks//projects/Not Found/removeFollowers/stories");
        itest("randoop", 31).given(taskGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/stories");
        itest("randoop", 31).given(taskGid, "").checkEq(path, "/tasks//stories");
        itest("evosuite", 31).given(taskGid, "2jT|N,B=E1)5)m").checkEq(path, "/tasks/2jT|N,B=E1)5)m/stories");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/stories");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/stories");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 31).given(taskGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tasks//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/stories");
        itest("randoop", 31).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/stories");
        itest("randoop", 31).given(taskGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tasks/urn:ietf:wg:oauth:2.0:oob/stories");
        itest("randoop", 31).given(taskGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 31).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/stories");
        itest("randoop", 31).given(taskGid, "Sync token invalid or too old").checkEq(path, "/tasks/Sync token invalid or too old/stories");
        itest("evosuite", 31).given(taskGid, "").checkEq(path, "/tasks//stories");
        ItemRequest<Story> req = new ItemRequest<Story>(this, Story.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Story> createStoryForTask(String taskGid) throws IOException {
        return createStoryForTask(taskGid, null, false);
    }

    /**
     * Delete a story
     * Deletes a story. A user can only delete stories they have created.  Returns an empty data record.
     * @param storyGid Globally unique identifier for the story. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteStory(String storyGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/stories/{story_gid}".replace("{story_gid}", storyGid);
        itest("randoop", 53).given(storyGid, "Invalid Request").checkEq(path, "/stories/Invalid Request");
        itest("randoop", 53).given(storyGid, "").checkEq(path, "/stories/");
        itest("randoop", 53).given(storyGid, "GET").checkEq(path, "/stories/GET");
        itest("randoop", 53).given(storyGid, "10").checkEq(path, "/stories/10");
        itest("randoop", 53).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 53).given(storyGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/stories//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 53).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 53).given(storyGid, "NoAuthorizationError").checkEq(path, "/stories/NoAuthorizationError");
        itest("evosuite", 53).given(storyGid, "").checkEq(path, "/stories/");
        itest("randoop", 53).given(storyGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/stories/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 53).given(storyGid, "100").checkEq(path, "/stories/100");
        itest("randoop", 53).given(storyGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/stories/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 53).given(storyGid, "D").checkEq(path, "/stories/D");
        itest("evosuite", 53).given(storyGid, "(rQg/W7H.v%j").checkEq(path, "/stories/(rQg/W7H.v%j");
        itest("randoop", 53).given(storyGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/stories/urn:ietf:wg:oauth:2.0:oob");
        itest("evosuite", 53).given(storyGid, "opt_pretty").checkEq(path, "/stories/opt_pretty");
        itest("randoop", 53).given(storyGid, "POST").checkEq(path, "/stories/POST");
        itest("randoop", 53).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 53).given(storyGid, "hi!").checkEq(path, "/stories/hi!");
        itest("evosuite", 53).given(storyGid, "a%#$,@").checkEq(path, "/stories/a%#$,@");
        itest("randoop", 53).given(storyGid, "Not Found").checkEq(path, "/stories/Not Found");
        itest("randoop", 53).given(storyGid, "Rate Limit Enforced").checkEq(path, "/stories/Rate Limit Enforced");
        itest("randoop", 53).given(storyGid, "Forbidden").checkEq(path, "/stories/Forbidden");
        itest("randoop", 53).given(storyGid, "/custom_fields//enum_options/insert").checkEq(path, "/stories//custom_fields//enum_options/insert");
        itest("randoop", 53).given(storyGid, "/webhooks/NoAuthorizationError").checkEq(path, "/stories//webhooks/NoAuthorizationError");
        itest("randoop", 53).given(storyGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/stories//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 53).given(storyGid, "Server Error").checkEq(path, "/stories/Server Error");
        itest("randoop", 53).given(storyGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/stories//goals/{goal_gid}/subgoals");
        itest("randoop", 53).given(storyGid, "/portfolios/").checkEq(path, "/stories//portfolios/");
        itest("randoop", 53).given(storyGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/stories//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 53).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 53).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 53).given(storyGid, "200").checkEq(path, "/stories/200");
        itest("evosuite", 53).given(storyGid, "mrO]{_MB").checkEq(path, "/stories/mrO]{_MB");
        itest("randoop", 53).given(storyGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/stories//projects/Rate Limit Enforced/sections");
        itest("randoop", 53).given(storyGid, "/attachments/Not Found").checkEq(path, "/stories//attachments/Not Found");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteStory(String storyGid) throws IOException {
        return deleteStory(storyGid, null, false);
    }

    /**
     * Get stories from a task
     * Returns the compact records for all stories on the task.
     * @param taskGid The task to operate on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Story)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Story> getStoriesForTask(String taskGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/stories".replace("{task_gid}", taskGid);
        itest("randoop", 77).given(taskGid, "10").checkEq(path, "/tasks/10/stories");
        itest("evosuite", 77).given(taskGid, "").checkEq(path, "/tasks//stories");
        itest("evosuite", 77).given(taskGid, "/stories/}FgHy0b}Mk]Mp;62f").checkEq(path, "/tasks//stories/}FgHy0b}Mk]Mp;62f/stories");
        itest("randoop", 77).given(taskGid, "/portfolios/").checkEq(path, "/tasks//portfolios//stories");
        itest("randoop", 77).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/stories");
        itest("randoop", 77).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/stories");
        itest("randoop", 77).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/stories");
        itest("randoop", 77).given(taskGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/stories");
        itest("randoop", 77).given(taskGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/stories");
        itest("randoop", 77).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error/stories");
        itest("randoop", 77).given(taskGid, "100").checkEq(path, "/tasks/100/stories");
        itest("randoop", 77).given(taskGid, "GET").checkEq(path, "/tasks/GET/stories");
        itest("randoop", 77).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/stories");
        itest("randoop", 77).given(taskGid, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert/stories");
        itest("randoop", 77).given(taskGid, "POST").checkEq(path, "/tasks/POST/stories");
        itest("randoop", 77).given(taskGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/stories");
        itest("evosuite", 77).given(taskGid, "%s is not MarkerAnnotationExpr, it is %s").checkEq(path, "/tasks/%s is not MarkerAnnotationExpr, it is %s/stories");
        itest("randoop", 77).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/stories");
        itest("randoop", 77).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/stories");
        itest("randoop", 77).given(taskGid, "/goals/Sync token invalid or too old").checkEq(path, "/tasks//goals/Sync token invalid or too old/stories");
        itest("evosuite", 77).given(taskGid, "a%#$,@").checkEq(path, "/tasks/a%#$,@/stories");
        itest("randoop", 77).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/stories");
        itest("randoop", 77).given(taskGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/tasks//tasks//attachments/Not Found/addProject/stories");
        itest("randoop", 77).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 77).given(taskGid, "(Iom%lp5PhD^0yT*").checkEq(path, "/tasks/(Iom%lp5PhD^0yT*/stories");
        itest("randoop", 77).given(taskGid, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/stories");
        itest("evosuite", 77).given(taskGid, "GET").checkEq(path, "/tasks/GET/stories");
        itest("randoop", 77).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/stories");
        itest("evosuite", 77).given(taskGid, "Ul").checkEq(path, "/tasks/Ul/stories");
        itest("randoop", 77).given(taskGid, "200").checkEq(path, "/tasks/200/stories");
        itest("randoop", 77).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/stories");
        CollectionRequest<Story> req = new CollectionRequest<Story>(this, Story.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Story> getStoriesForTask(String taskGid) throws IOException {
        return getStoriesForTask(taskGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get a story
     * Returns the full record for a single story.
     * @param storyGid Globally unique identifier for the story. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Story)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Story> getStory(String storyGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/stories/{story_gid}".replace("{story_gid}", storyGid);
        itest("evosuite", 103).given(storyGid, "").checkEq(path, "/stories/");
        itest("randoop", 103).given(storyGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/stories/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 103).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 103).given(storyGid, "POST").checkEq(path, "/stories/POST");
        itest("evosuite", 103).given(storyGid, "}FgHy0b}Mk]Mp;62f").checkEq(path, "/stories/}FgHy0b}Mk]Mp;62f");
        itest("randoop", 103).given(storyGid, "/tags/Payment Required").checkEq(path, "/stories//tags/Payment Required");
        itest("randoop", 103).given(storyGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 103).given(storyGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/stories/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 103).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 103).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 103).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 103).given(storyGid, "Invalid Request").checkEq(path, "/stories/Invalid Request");
        itest("randoop", 103).given(storyGid, "GET").checkEq(path, "/stories/GET");
        itest("evosuite", 103).given(storyGid, "com.google.api.client.http.HttpRequestFactory").checkEq(path, "/stories/com.google.api.client.http.HttpRequestFactory");
        itest("randoop", 103).given(storyGid, "/custom_fields//enum_options/insert").checkEq(path, "/stories//custom_fields//enum_options/insert");
        itest("randoop", 103).given(storyGid, "").checkEq(path, "/stories/");
        itest("randoop", 103).given(storyGid, "200").checkEq(path, "/stories/200");
        itest("randoop", 103).given(storyGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/stories//workspaces//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 103).given(storyGid, "/tags").checkEq(path, "/stories//tags");
        itest("evosuite", 103).given(storyGid, "l`/2~wyU?6*8)").checkEq(path, "/stories/l`/2~wyU?6*8)");
        itest("evosuite", 103).given(storyGid, "y8Hy").checkEq(path, "/stories/y8Hy");
        itest("evosuite", 103).given(storyGid, "@V").checkEq(path, "/stories/@V");
        itest("evosuite", 103).given(storyGid, "Sf/\"1K.").checkEq(path, "/stories/Sf/\"1K.");
        itest("randoop", 103).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 103).given(storyGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/stories/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 103).given(storyGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/stories/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 103).given(storyGid, "Payment Required").checkEq(path, "/stories/Payment Required");
        itest("randoop", 103).given(storyGid, "Forbidden").checkEq(path, "/stories/Forbidden");
        itest("randoop", 103).given(storyGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/stories//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 103).given(storyGid, "Rate Limit Enforced").checkEq(path, "/stories/Rate Limit Enforced");
        ItemRequest<Story> req = new ItemRequest<Story>(this, Story.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<Story> getStory(String storyGid) throws IOException {
        return getStory(storyGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Update a story
     * Updates the story and returns the full record for the updated story. Only comment stories can have their text updated, and only comment stories and attachment stories can be pinned. Only one of &#x60;text&#x60; and &#x60;html_text&#x60; can be specified.
     * @param storyGid Globally unique identifier for the story. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Story)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Story> updateStory(String storyGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/stories/{story_gid}".replace("{story_gid}", storyGid);
        itest("randoop", 127).given(storyGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/stories/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 127).given(storyGid, "{task_gid}").checkEq(path, "/stories/{task_gid}");
        itest("randoop", 127).given(storyGid, "Invalid Request").checkEq(path, "/stories/Invalid Request");
        itest("evosuite", 127).given(storyGid, "@V").checkEq(path, "/stories/@V");
        itest("randoop", 127).given(storyGid, "GET").checkEq(path, "/stories/GET");
        itest("randoop", 127).given(storyGid, "POST").checkEq(path, "/stories/POST");
        itest("evosuite", 127).given(storyGid, "Ewyx)").checkEq(path, "/stories/Ewyx)");
        itest("randoop", 127).given(storyGid, "0").checkEq(path, "/stories/0");
        itest("randoop", 127).given(storyGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/stories//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 127).given(storyGid, "200").checkEq(path, "/stories/200");
        itest("randoop", 127).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 127).given(storyGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/stories//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 127).given(storyGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/stories//tasks//attachments/Not Found/addProject");
        itest("randoop", 127).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 127).given(storyGid, "/webhooks/NoAuthorizationError").checkEq(path, "/stories//webhooks/NoAuthorizationError");
        itest("randoop", 127).given(storyGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 127).given(storyGid, "hi!").checkEq(path, "/stories/hi!");
        itest("randoop", 127).given(storyGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/stories/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 127).given(storyGid, "").checkEq(path, "/stories/");
        itest("evosuite", 127).given(storyGid, "PUT").checkEq(path, "/stories/PUT");
        itest("randoop", 127).given(storyGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/stories/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 127).given(storyGid, "Not Found").checkEq(path, "/stories/Not Found");
        itest("randoop", 127).given(storyGid, "Forbidden").checkEq(path, "/stories/Forbidden");
        itest("randoop", 127).given(storyGid, "Payment Required").checkEq(path, "/stories/Payment Required");
        itest("randoop", 127).given(storyGid, "/projects/Not Found/removeFollowers").checkEq(path, "/stories//projects/Not Found/removeFollowers");
        itest("randoop", 127).given(storyGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/stories//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 127).given(storyGid, "").checkEq(path, "/stories/");
        ItemRequest<Story> req = new ItemRequest<Story>(this, Story.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Story> updateStory(String storyGid) throws IOException {
        return updateStory(storyGid, null, false);
    }
}
