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

public class TagsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public TagsBase(Client client) {
        super(client);
    }

    /**
     * Create a tag
     * Creates a new tag in a workspace or organization.  Every tag is required to be created in a specific workspace or organization, and this cannot be changed once set. Note that you can use the workspace parameter regardless of whether or not it is an organization.  Returns the full record of the newly created tag.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Tag)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Tag> createTag(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tags";
        ItemRequest<Tag> req = new ItemRequest<Tag>(this, Tag.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Tag> createTag() throws IOException {
        return createTag(null, false);
    }

    /**
     * Create a tag in a workspace
     * Creates a new tag in a workspace or organization.  Every tag is required to be created in a specific workspace or organization, and this cannot be changed once set. Note that you can use the workspace parameter regardless of whether or not it is an organization.  Returns the full record of the newly created tag.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Tag)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Tag> createTagForWorkspace(String workspaceGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/tags".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 52).given(workspaceGid, "NoAuthorizationError").checkEq(path, "/workspaces/NoAuthorizationError/tags");
        itest("evosuite", 52).given(workspaceGid, "gUSN").checkEq(path, "/workspaces/gUSN/tags");
        itest("randoop", 52).given(workspaceGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//portfolios//goals/{goal_gid}/subgoals/tags");
        itest("randoop", 52).given(workspaceGid, "/workspaces/").checkEq(path, "/workspaces//workspaces//tags");
        itest("randoop", 52).given(workspaceGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tags");
        itest("randoop", 52).given(workspaceGid, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/tags");
        itest("randoop", 52).given(workspaceGid, "GET").checkEq(path, "/workspaces/GET/tags");
        itest("randoop", 52).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/tags");
        itest("randoop", 52).given(workspaceGid, "").checkEq(path, "/workspaces//tags");
        itest("randoop", 52).given(workspaceGid, "200").checkEq(path, "/workspaces/200/tags");
        itest("evosuite", 52).given(workspaceGid, "?bJ.[aE,'yRj|n&Mb7x").checkEq(path, "/workspaces/?bJ.[aE,'yRj|n&Mb7x/tags");
        itest("randoop", 52).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found/tags");
        itest("evosuite", 52).given(workspaceGid, "\"*8Rrv9ZCt").checkEq(path, "/workspaces/\"*8Rrv9ZCt/tags");
        itest("randoop", 52).given(workspaceGid, "Server Error").checkEq(path, "/workspaces/Server Error/tags");
        itest("randoop", 52).given(workspaceGid, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/tags");
        itest("randoop", 52).given(workspaceGid, "Forbidden").checkEq(path, "/workspaces/Forbidden/tags");
        itest("evosuite", 52).given(workspaceGid, "DELETE").checkEq(path, "/workspaces/DELETE/tags");
        itest("randoop", 52).given(workspaceGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tags");
        itest("randoop", 52).given(workspaceGid, "/portfolios/").checkEq(path, "/workspaces//portfolios//tags");
        itest("randoop", 52).given(workspaceGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/tags");
        itest("randoop", 52).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/tags");
        itest("randoop", 52).given(workspaceGid, "/goals/Sync token invalid or too old").checkEq(path, "/workspaces//goals/Sync token invalid or too old/tags");
        itest("evosuite", 52).given(workspaceGid, "").checkEq(path, "/workspaces//tags");
        itest("randoop", 52).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tags");
        itest("randoop", 52).given(workspaceGid, "hi!").checkEq(path, "/workspaces/hi!/tags");
        ItemRequest<Tag> req = new ItemRequest<Tag>(this, Tag.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Tag> createTagForWorkspace(String workspaceGid) throws IOException {
        return createTagForWorkspace(workspaceGid, null, false);
    }

    /**
     * Delete a tag
     * A specific, existing tag can be deleted by making a DELETE request on the URL for that tag.  Returns an empty data record.
     * @param tagGid Globally unique identifier for the tag. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteTag(String tagGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tags/{tag_gid}".replace("{tag_gid}", tagGid);
        itest("randoop", 76).given(tagGid, "Forbidden").checkEq(path, "/tags/Forbidden");
        itest("randoop", 76).given(tagGid, "NoAuthorizationError").checkEq(path, "/tags/NoAuthorizationError");
        itest("randoop", 76).given(tagGid, "0").checkEq(path, "/tags/0");
        itest("evosuite", 76).given(tagGid, "tBbP%dRStD#u").checkEq(path, "/tags/tBbP%dRStD#u");
        itest("randoop", 76).given(tagGid, "/portfolios/").checkEq(path, "/tags//portfolios/");
        itest("randoop", 76).given(tagGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tags/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 76).given(tagGid, "/attachments/").checkEq(path, "/tags//attachments/");
        itest("randoop", 76).given(tagGid, "/projects/Not Found/removeFollowers").checkEq(path, "/tags//projects/Not Found/removeFollowers");
        itest("randoop", 76).given(tagGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tags/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 76).given(tagGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tags//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("evosuite", 76).given(tagGid, "/workspaces/null/tags").checkEq(path, "/tags//workspaces/null/tags");
        itest("randoop", 76).given(tagGid, "Server Error").checkEq(path, "/tags/Server Error");
        itest("randoop", 76).given(tagGid, "10").checkEq(path, "/tags/10");
        itest("evosuite", 76).given(tagGid, "DELETE").checkEq(path, "/tags/DELETE");
        itest("randoop", 76).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 76).given(tagGid, "Not Found").checkEq(path, "/tags/Not Found");
        itest("randoop", 76).given(tagGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/tags/com.asana.errors.AsanaError: NoAuthorizationError");
        itest("randoop", 76).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("evosuite", 76).given(tagGid, "").checkEq(path, "/tags/");
        itest("evosuite", 76).given(tagGid, "GET").checkEq(path, "/tags/GET");
        itest("randoop", 76).given(tagGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 76).given(tagGid, "hi!").checkEq(path, "/tags/hi!");
        itest("evosuite", 76).given(tagGid, "]Q]=@N! ").checkEq(path, "/tags/]Q]=@N! ");
        itest("evosuite", 76).given(tagGid, "/tags").checkEq(path, "/tags//tags");
        itest("randoop", 76).given(tagGid, "Sync token invalid or too old").checkEq(path, "/tags/Sync token invalid or too old");
        itest("randoop", 76).given(tagGid, "").checkEq(path, "/tags/");
        itest("randoop", 76).given(tagGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tags//goals/{goal_gid}/addSubgoal");
        itest("randoop", 76).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 76).given(tagGid, "\":\"").checkEq(path, "/tags/\":\"");
        itest("randoop", 76).given(tagGid, "/custom_fields//enum_options/insert").checkEq(path, "/tags//custom_fields//enum_options/insert");
        itest("randoop", 76).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<JsonElement> deleteTag(String tagGid) throws IOException {
        return deleteTag(tagGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get a tag
     * Returns the complete tag record for a single tag.
     * @param tagGid Globally unique identifier for the tag. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Tag)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Tag> getTag(String tagGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tags/{tag_gid}".replace("{tag_gid}", tagGid);
        itest("randoop", 102).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 102).given(tagGid, "200").checkEq(path, "/tags/200");
        itest("randoop", 102).given(tagGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tags//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 102).given(tagGid, "hi!").checkEq(path, "/tags/hi!");
        itest("randoop", 102).given(tagGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tags//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 102).given(tagGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tags/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 102).given(tagGid, "10").checkEq(path, "/tags/10");
        itest("randoop", 102).given(tagGid, "/webhooks/NoAuthorizationError").checkEq(path, "/tags//webhooks/NoAuthorizationError");
        itest("randoop", 102).given(tagGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/tags//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 102).given(tagGid, "NoAuthorizationError").checkEq(path, "/tags/NoAuthorizationError");
        itest("randoop", 102).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 102).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 102).given(tagGid, "Invalid Request").checkEq(path, "/tags/Invalid Request");
        itest("evosuite", 102).given(tagGid, "wf>9J!`AV.").checkEq(path, "/tags/wf>9J!`AV.");
        itest("randoop", 102).given(tagGid, "Sync token invalid or too old").checkEq(path, "/tags/Sync token invalid or too old");
        itest("randoop", 102).given(tagGid, "Not Found").checkEq(path, "/tags/Not Found");
        itest("evosuite", 102).given(tagGid, "com.google.common.base.Joiner$2").checkEq(path, "/tags/com.google.common.base.Joiner$2");
        itest("randoop", 102).given(tagGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tags/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 102).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 102).given(tagGid, "gUSN").checkEq(path, "/tags/gUSN");
        itest("evosuite", 102).given(tagGid, "").checkEq(path, "/tags/");
        itest("randoop", 102).given(tagGid, "Payment Required").checkEq(path, "/tags/Payment Required");
        itest("randoop", 102).given(tagGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tags/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 102).given(tagGid, "Server Error").checkEq(path, "/tags/Server Error");
        itest("randoop", 102).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 102).given(tagGid, "").checkEq(path, "/tags/");
        itest("randoop", 102).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 102).given(tagGid, "/tags/Payment Required").checkEq(path, "/tags//tags/Payment Required");
        itest("randoop", 102).given(tagGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/tags//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        ItemRequest<Tag> req = new ItemRequest<Tag>(this, Tag.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<Tag> getTag(String tagGid) throws IOException {
        return getTag(tagGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get multiple tags
     * Returns the compact tag records for some filtered set of tags. Use one or more of the parameters provided to filter the tags returned.
     * @param workspace The workspace to filter tags on. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Tag)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Tag> getTags(String workspace, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tags";
        CollectionRequest<Tag> req = new CollectionRequest<Tag>(this, Tag.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("workspace", workspace);
        return req;
    }

    public CollectionRequest<Tag> getTags(String workspace) throws IOException {
        return getTags(workspace, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get a task&#x27;s tags
     * Get a compact representation of all of the tags the task has.
     * @param taskGid The task to operate on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Tag)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Tag> getTagsForTask(String taskGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/tags".replace("{task_gid}", taskGid);
        itest("randoop", 155).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/tags");
        itest("randoop", 155).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/tags");
        itest("evosuite", 155).given(taskGid, " * ").checkEq(path, "/tasks/ * /tags");
        itest("randoop", 155).given(taskGid, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/tags");
        itest("randoop", 155).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/tags");
        itest("randoop", 155).given(taskGid, "Server Error").checkEq(path, "/tasks/Server Error/tags");
        itest("randoop", 155).given(taskGid, "10").checkEq(path, "/tasks/10/tags");
        itest("randoop", 155).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/tags");
        itest("randoop", 155).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/tags");
        itest("randoop", 155).given(taskGid, "GET").checkEq(path, "/tasks/GET/tags");
        itest("randoop", 155).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tags");
        itest("evosuite", 155).given(taskGid, "").checkEq(path, "/tasks//tags");
        itest("evosuite", 155).given(taskGid, "/J?#J").checkEq(path, "/tasks//J?#J/tags");
        itest("randoop", 155).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/tags");
        itest("evosuite", 155).given(taskGid, "Ul").checkEq(path, "/tasks/Ul/tags");
        itest("randoop", 155).given(taskGid, "0").checkEq(path, "/tasks/0/tags");
        itest("randoop", 155).given(taskGid, "POST").checkEq(path, "/tasks/POST/tags");
        itest("evosuite", 155).given(taskGid, "\":\"").checkEq(path, "/tasks/\":\"/tags");
        itest("randoop", 155).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/tags");
        itest("randoop", 155).given(taskGid, "Forbidden").checkEq(path, "/tasks/Forbidden/tags");
        itest("randoop", 155).given(taskGid, "/tasks/GET").checkEq(path, "/tasks//tasks/GET/tags");
        itest("randoop", 155).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/tags");
        itest("randoop", 155).given(taskGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tasks/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tags");
        itest("randoop", 155).given(taskGid, "/organizations//teams").checkEq(path, "/tasks//organizations//teams/tags");
        itest("evosuite", 155).given(taskGid, "GET").checkEq(path, "/tasks/GET/tags");
        itest("randoop", 155).given(taskGid, "200").checkEq(path, "/tasks/200/tags");
        itest("randoop", 155).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/tags");
        itest("randoop", 155).given(taskGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tags");
        itest("randoop", 155).given(taskGid, "").checkEq(path, "/tasks//tags");
        itest("randoop", 155).given(taskGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: Server Error/tags");
        CollectionRequest<Tag> req = new CollectionRequest<Tag>(this, Tag.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Tag> getTagsForTask(String taskGid) throws IOException {
        return getTagsForTask(taskGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get tags in a workspace
     * Returns the compact tag records for some filtered set of tags. Use one or more of the parameters provided to filter the tags returned.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Tag)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Tag> getTagsForWorkspace(String workspaceGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/tags".replace("{workspace_gid}", workspaceGid);
        itest("randoop", 181).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/tags");
        itest("evosuite", 181).given(workspaceGid, "com.github.javaparser.ast.visitor.EqualsVisitor").checkEq(path, "/workspaces/com.github.javaparser.ast.visitor.EqualsVisitor/tags");
        itest("randoop", 181).given(workspaceGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tags");
        itest("randoop", 181).given(workspaceGid, "Forbidden").checkEq(path, "/workspaces/Forbidden/tags");
        itest("randoop", 181).given(workspaceGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tags");
        itest("randoop", 181).given(workspaceGid, "Sync token invalid or too old").checkEq(path, "/workspaces/Sync token invalid or too old/tags");
        itest("randoop", 181).given(workspaceGid, "com.asana.errors.ServerError: Server Error").checkEq(path, "/workspaces/com.asana.errors.ServerError: Server Error/tags");
        itest("randoop", 181).given(workspaceGid, "hi!").checkEq(path, "/workspaces/hi!/tags");
        itest("randoop", 181).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/tags");
        itest("randoop", 181).given(workspaceGid, "0").checkEq(path, "/workspaces/0/tags");
        itest("evosuite", 181).given(workspaceGid, "").checkEq(path, "/workspaces//tags");
        itest("randoop", 181).given(workspaceGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/workspaces//projects/Rate Limit Enforced/sections/tags");
        itest("randoop", 181).given(workspaceGid, "200").checkEq(path, "/workspaces/200/tags");
        itest("randoop", 181).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/tags");
        itest("randoop", 181).given(workspaceGid, "POST").checkEq(path, "/workspaces/POST/tags");
        itest("evosuite", 181).given(workspaceGid, "{task_gid}").checkEq(path, "/workspaces/{task_gid}/tags");
        itest("evosuite", 181).given(workspaceGid, "wf>9J!`AV.").checkEq(path, "/workspaces/wf>9J!`AV./tags");
        itest("randoop", 181).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found/tags");
        itest("randoop", 181).given(workspaceGid, "Server Error").checkEq(path, "/workspaces/Server Error/tags");
        itest("randoop", 181).given(workspaceGid, "Payment Required").checkEq(path, "/workspaces/Payment Required/tags");
        itest("randoop", 181).given(workspaceGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/tags");
        itest("randoop", 181).given(workspaceGid, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/tags");
        itest("randoop", 181).given(workspaceGid, "").checkEq(path, "/workspaces//tags");
        itest("randoop", 181).given(workspaceGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/workspaces//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/tags");
        itest("randoop", 181).given(workspaceGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/workspaces//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/tags");
        CollectionRequest<Tag> req = new CollectionRequest<Tag>(this, Tag.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Tag> getTagsForWorkspace(String workspaceGid) throws IOException {
        return getTagsForWorkspace(workspaceGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Update a tag
     * Updates the properties of a tag. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the tag.  Returns the complete updated tag record.
     * @param tagGid Globally unique identifier for the tag. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Tag)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Tag> updateTag(String tagGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tags/{tag_gid}".replace("{tag_gid}", tagGid);
        itest("randoop", 207).given(tagGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 207).given(tagGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tags/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 207).given(tagGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tags//goals/{goal_gid}/addSubgoal");
        itest("randoop", 207).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("randoop", 207).given(tagGid, "/attachments/Not Found").checkEq(path, "/tags//attachments/Not Found");
        itest("randoop", 207).given(tagGid, "Not Found").checkEq(path, "/tags/Not Found");
        itest("randoop", 207).given(tagGid, "10").checkEq(path, "/tags/10");
        itest("randoop", 207).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 207).given(tagGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tags/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 207).given(tagGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: 200");
        itest("evosuite", 207).given(tagGid, "portfolio").checkEq(path, "/tags/portfolio");
        itest("randoop", 207).given(tagGid, "/workspaces/").checkEq(path, "/tags//workspaces/");
        itest("randoop", 207).given(tagGid, "").checkEq(path, "/tags/");
        itest("evosuite", 207).given(tagGid, "workspace").checkEq(path, "/tags/workspace");
        itest("randoop", 207).given(tagGid, "Sync token invalid or too old").checkEq(path, "/tags/Sync token invalid or too old");
        itest("evosuite", 207).given(tagGid, "gUSN").checkEq(path, "/tags/gUSN");
        itest("evosuite", 207).given(tagGid, "DELETE").checkEq(path, "/tags/DELETE");
        itest("evosuite", 207).given(tagGid, "com.google.common.base.Ascii").checkEq(path, "/tags/com.google.common.base.Ascii");
        itest("randoop", 207).given(tagGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tags/com.asana.errors.AsanaError: hi!");
        itest("randoop", 207).given(tagGid, "GET").checkEq(path, "/tags/GET");
        itest("randoop", 207).given(tagGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/tags/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 207).given(tagGid, "/tags").checkEq(path, "/tags//tags");
        itest("randoop", 207).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 207).given(tagGid, "").checkEq(path, "/tags/");
        itest("randoop", 207).given(tagGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tags//projects/Rate Limit Enforced/sections");
        itest("randoop", 207).given(tagGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tags//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 207).given(tagGid, "0").checkEq(path, "/tags/0");
        itest("randoop", 207).given(tagGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tags/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 207).given(tagGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 207).given(tagGid, "NoAuthorizationError").checkEq(path, "/tags/NoAuthorizationError");
        itest("randoop", 207).given(tagGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        ItemRequest<Tag> req = new ItemRequest<Tag>(this, Tag.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<Tag> updateTag(String tagGid) throws IOException {
        return updateTag(tagGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
