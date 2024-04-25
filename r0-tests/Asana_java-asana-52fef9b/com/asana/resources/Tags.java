package com.asana.resources;

import com.asana.Client;
import com.asana.models.Tag;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.TagsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Tags extends TagsBase {

    public Tags(Client client) {
        super(client);
    }

    /**
     * Creates a new tag in a workspace or organization.
     *
     * Every tag is required to be created in a specific workspace or
     * organization, and this cannot be changed once set. Note that you can use
     * the `workspace` parameter regardless of whether or not it is an
     * organization.
     *
     * Returns the full record of the newly created tag.
     *
     * @return Request object
     */
    public ItemRequest<Tag> create() {
        return new ItemRequest<Tag>(this, Tag.class, "/tags", "POST");
    }

    /**
     * Creates a new tag in a workspace or organization.
     *
     * Every tag is required to be created in a specific workspace or
     * organization, and this cannot be changed once set. Note that you can use
     * the `workspace` parameter regardless of whether or not it is an
     * organization.
     *
     * Returns the full record of the newly created tag.
     *
     * @param  workspace The workspace or organization to create the tag in.
     * @return Request object
     */
    public ItemRequest<Tag> createInWorkspace(String workspace) {
        String path = String.format("/workspaces/%s/tags", workspace);
        itest("randoop", 46).given(workspace, "100").checkEq(path, "/workspaces/100/tags");
        itest("randoop", 46).given(workspace, "0").checkEq(path, "/workspaces/0/tags");
        itest("randoop", 46).given(workspace, "POST").checkEq(path, "/workspaces/POST/tags");
        itest("evosuite", 46).given(workspace, "").checkEq(path, "/workspaces//tags");
        itest("evosuite", 46).given(workspace, "nsUWl_2wctgc`").checkEq(path, "/workspaces/nsUWl_2wctgc`/tags");
        itest("randoop", 46).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/tags");
        itest("randoop", 46).given(workspace, "/portfolios/").checkEq(path, "/workspaces//portfolios//tags");
        itest("randoop", 46).given(workspace, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/workspaces//workspaces//goals/{goal_gid}/subgoals/tasks/tags");
        itest("evosuite", 46).given(workspace, "created_on.after").checkEq(path, "/workspaces/created_on.after/tags");
        itest("randoop", 46).given(workspace, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/workspaces/com.asana.errors.RetryableAsanaError: 200/tags");
        itest("randoop", 46).given(workspace, "").checkEq(path, "/workspaces//tags");
        itest("evosuite", 46).given(workspace, "8-i/iM,J *B0t6").checkEq(path, "/workspaces/8-i/iM,J *B0t6/tags");
        itest("randoop", 46).given(workspace, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tags");
        itest("randoop", 46).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/tags");
        itest("randoop", 46).given(workspace, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/tags");
        itest("randoop", 46).given(workspace, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspaces/com.asana.errors.AsanaError: hi!/tags");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tags");
        itest("randoop", 46).given(workspace, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/tags");
        itest("evosuite", 46).given(workspace, "/teams/{team_gid}/removeUser").checkEq(path, "/workspaces//teams/{team_gid}/removeUser/tags");
        itest("evosuite", 46).given(workspace, "/workspaces//tags").checkEq(path, "/workspaces//workspaces//tags/tags");
        itest("randoop", 46).given(workspace, "200").checkEq(path, "/workspaces/200/tags");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/tags");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/tags");
        itest("randoop", 46).given(workspace, "com.asana.errors.ServerError: Server Error").checkEq(path, "/workspaces/com.asana.errors.ServerError: Server Error/tags");
        itest("randoop", 46).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/tags");
        itest("evosuite", 46).given(workspace, null).checkEq(path, "/workspaces/null/tags");
        itest("evosuite", 46).given(workspace, "HEX_DIGITS").checkEq(path, "/workspaces/HEX_DIGITS/tags");
        itest("evosuite", 46).given(workspace, "V50C81;-l!JS/>X:J$").checkEq(path, "/workspaces/V50C81;-l!JS/>X:J$/tags");
        return new ItemRequest<Tag>(this, Tag.class, path, "POST");
    }

    /**
     * Returns the complete tag record for a single tag.
     *
     * @param  tag The tag to get.
     * @return Request object
     */
    public ItemRequest<Tag> findById(String tag) {
        String path = String.format("/tags/%s", tag);
        itest("randoop", 58).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 58).given(tag, "hi!").checkEq(path, "/tags/hi!");
        itest("randoop", 58).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Invalid%20Request").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Invalid%20Request");
        itest("randoop", 58).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("dev", 58).given(tag, "1").checkEq(path, "/tags/1");
        itest("randoop", 58).given(tag, "Forbidden").checkEq(path, "/tags/Forbidden");
        itest("randoop", 58).given(tag, "com.asana.errors.RetryableAsanaError: NoAuthorizationError").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: NoAuthorizationError");
        itest("randoop", 58).given(tag, "Payment Required").checkEq(path, "/tags/Payment Required");
        itest("randoop", 58).given(tag, "Rate Limit Enforced").checkEq(path, "/tags/Rate Limit Enforced");
        itest("randoop", 58).given(tag, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tags/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 58).given(tag, "JWS!JN").checkEq(path, "/tags/JWS!JN");
        itest("randoop", 58).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("evosuite", 58).given(tag, "").checkEq(path, "/tags/");
        itest("randoop", 58).given(tag, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tags/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 58).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 58).given(tag, "/tags").checkEq(path, "/tags//tags");
        itest("randoop", 58).given(tag, "/organizations//teams").checkEq(path, "/tags//organizations//teams");
        itest("randoop", 58).given(tag, "-1").checkEq(path, "/tags/-1");
        itest("randoop", 58).given(tag, "Not Found").checkEq(path, "/tags/Not Found");
        itest("randoop", 58).given(tag, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: /portfolios/");
        itest("evosuite", 58).given(tag, "GET").checkEq(path, "/tags/GET");
        itest("randoop", 58).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 58).given(tag, "GET").checkEq(path, "/tags/GET");
        itest("randoop", 58).given(tag, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tags//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 58).given(tag, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tags/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 58).given(tag, "/portfolios/").checkEq(path, "/tags//portfolios/");
        itest("randoop", 58).given(tag, "NoAuthorizationError").checkEq(path, "/tags/NoAuthorizationError");
        itest("randoop", 58).given(tag, "Invalid Request").checkEq(path, "/tags/Invalid Request");
        itest("randoop", 58).given(tag, "POST").checkEq(path, "/tags/POST");
        itest("randoop", 58).given(tag, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tags//projects/Rate Limit Enforced/sections");
        itest("randoop", 58).given(tag, "Sync token invalid or too old").checkEq(path, "/tags/Sync token invalid or too old");
        itest("evosuite", 58).given(tag, "POST").checkEq(path, "/tags/POST");
        itest("evosuite", 58).given(tag, "DELETE").checkEq(path, "/tags/DELETE");
        itest("evosuite", 58).given(tag, "x~}t").checkEq(path, "/tags/x~}t");
        return new ItemRequest<Tag>(this, Tag.class, path, "GET");
    }

    /**
     * Updates the properties of a tag. Only the fields provided in the `data`
     * block will be updated; any unspecified fields will remain unchanged.
     *
     * When using this method, it is best to specify only those fields you wish
     * to change, or else you may overwrite changes made by another user since
     * you last retrieved the task.
     *
     * Returns the complete updated tag record.
     *
     * @param  tag The tag to update.
     * @return Request object
     */
    public ItemRequest<Tag> update(String tag) {
        String path = String.format("/tags/%s", tag);
        itest("randoop", 77).given(tag, "Rate Limit Enforced").checkEq(path, "/tags/Rate Limit Enforced");
        itest("randoop", 77).given(tag, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 77).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 77).given(tag, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tags/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 77).given(tag, "").checkEq(path, "/tags/");
        itest("randoop", 77).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 77).given(tag, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tags/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 77).given(tag, "NoAuthorizationError").checkEq(path, "/tags/NoAuthorizationError");
        itest("randoop", 77).given(tag, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tags//projects/Rate Limit Enforced/sections");
        itest("randoop", 77).given(tag, "0").checkEq(path, "/tags/0");
        itest("randoop", 77).given(tag, "/tags").checkEq(path, "/tags//tags");
        itest("randoop", 77).given(tag, "100").checkEq(path, "/tags/100");
        itest("randoop", 77).given(tag, "10").checkEq(path, "/tags/10");
        itest("randoop", 77).given(tag, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/tags//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("evosuite", 77).given(tag, "=bp&").checkEq(path, "/tags/=bp&");
        itest("randoop", 77).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 77).given(tag, "/workspaces//teams/{team_gid}/removeUser/tags").checkEq(path, "/tags//workspaces//teams/{team_gid}/removeUser/tags");
        itest("evosuite", 77).given(tag, "transitive").checkEq(path, "/tags/transitive");
        itest("randoop", 77).given(tag, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tags/com.asana.errors.AsanaError: hi!");
        itest("randoop", 77).given(tag, "").checkEq(path, "/tags/");
        return new ItemRequest<Tag>(this, Tag.class, path, "PUT");
    }

    /**
     * A specific, existing tag can be deleted by making a DELETE request
     * on the URL for that tag.
     *
     * Returns an empty data record.
     *
     * @param  tag The tag to delete.
     * @return Request object
     */
    public ItemRequest<Tag> delete(String tag) {
        String path = String.format("/tags/%s", tag);
        itest("randoop", 92).given(tag, "").checkEq(path, "/tags/");
        itest("randoop", 92).given(tag, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 92).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 92).given(tag, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tags/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 92).given(tag, "/portfolios/GET/removeMembers").checkEq(path, "/tags//portfolios/GET/removeMembers");
        itest("randoop", 92).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 92).given(tag, "").checkEq(path, "/tags/");
        itest("evosuite", 92).given(tag, "POST").checkEq(path, "/tags/POST");
        itest("randoop", 92).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("evosuite", 92).given(tag, "/tags/%s").checkEq(path, "/tags//tags/%s");
        itest("randoop", 92).given(tag, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/tags/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 92).given(tag, "10").checkEq(path, "/tags/10");
        itest("randoop", 92).given(tag, "/project_statuses/Server Error").checkEq(path, "/tags//project_statuses/Server Error");
        itest("randoop", 92).given(tag, "200").checkEq(path, "/tags/200");
        itest("randoop", 92).given(tag, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tags/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 92).given(tag, "/tags/Payment Required").checkEq(path, "/tags//tags/Payment Required");
        itest("randoop", 92).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 92).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 92).given(tag, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/tags/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("evosuite", 92).given(tag, "}|r>r").checkEq(path, "/tags/}|r>r");
        itest("randoop", 92).given(tag, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 92).given(tag, "Rate Limit Enforced").checkEq(path, "/tags/Rate Limit Enforced");
        itest("randoop", 92).given(tag, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tags/com.asana.errors.RetryableAsanaError: 200");
        itest("evosuite", 92).given(tag, "JWS!N").checkEq(path, "/tags/JWS!N");
        itest("randoop", 92).given(tag, "Sync token invalid or too old").checkEq(path, "/tags/Sync token invalid or too old");
        itest("randoop", 92).given(tag, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tags/com.asana.errors.PremiumOnlyError: Payment Required");
        return new ItemRequest<Tag>(this, Tag.class, path, "DELETE");
    }

    /**
     * Returns the compact tag records for some filtered set of tags.
     * Use one or more of the parameters provided to filter the tags returned.
     *
     * @return Request object
     */
    public CollectionRequest<Tag> findAll() {
        return new CollectionRequest<Tag>(this, Tag.class, "/tags", "GET");
    }

    /**
     * Returns the compact tag records for all tags in the workspace.
     *
     * @param  workspace The workspace or organization to find tags in.
     * @return Request object
     */
    public CollectionRequest<Tag> findByWorkspace(String workspace) {
        String path = String.format("/workspaces/%s/tags", workspace);
        itest("randoop", 115).given(workspace, "POST").checkEq(path, "/workspaces/POST/tags");
        itest("randoop", 115).given(workspace, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/workspaces/urn:ietf:wg:oauth:2.0:oob/tags");
        itest("randoop", 115).given(workspace, "/tags/Payment Required").checkEq(path, "/workspaces//tags/Payment Required/tags");
        itest("randoop", 115).given(workspace, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/tags");
        itest("randoop", 115).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden/tags");
        itest("randoop", 115).given(workspace, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/workspaces/com.asana.errors.InvalidRequestError: Invalid Request/tags");
        itest("randoop", 115).given(workspace, "/custom_fields//enum_options/insert").checkEq(path, "/workspaces//custom_fields//enum_options/insert/tags");
        itest("randoop", 115).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/tags");
        itest("evosuite", 115).given(workspace, "DELETE").checkEq(path, "/workspaces/DELETE/tags");
        itest("evosuite", 115).given(workspace, "").checkEq(path, "/workspaces//tags");
        itest("randoop", 115).given(workspace, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/tags");
        itest("randoop", 115).given(workspace, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/tags");
        itest("randoop", 115).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/tags");
        itest("randoop", 115).given(workspace, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//portfolio_memberships//goals/{goal_gid}/addSubgoal/tags");
        itest("evosuite", 115).given(workspace, "CL96UBblz").checkEq(path, "/workspaces/CL96UBblz/tags");
        itest("evosuite", 115).given(workspace, "opt_fields").checkEq(path, "/workspaces/opt_fields/tags");
        itest("randoop", 115).given(workspace, "GET").checkEq(path, "/workspaces/GET/tags");
        itest("randoop", 115).given(workspace, "").checkEq(path, "/workspaces//tags");
        itest("randoop", 115).given(workspace, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspaces/com.asana.errors.PremiumOnlyError: Payment Required/tags");
        itest("randoop", 115).given(workspace, "10").checkEq(path, "/workspaces/10/tags");
        itest("randoop", 115).given(workspace, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/tags");
        itest("evosuite", 115).given(workspace, "P3mF6p\"").checkEq(path, "/workspaces/P3mF6p\"/tags");
        itest("evosuite", 115).given(workspace, "/workspaces/P3mF6p\"/tags").checkEq(path, "/workspaces//workspaces/P3mF6p\"/tags/tags");
        itest("randoop", 115).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/tags");
        itest("randoop", 115).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/tags");
        itest("evosuite", 115).given(workspace, "JWU!N").checkEq(path, "/workspaces/JWU!N/tags");
        return new CollectionRequest<Tag>(this, Tag.class, path, "GET");
    }
}
