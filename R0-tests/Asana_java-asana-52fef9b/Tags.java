package com.asana.resources;

import com.asana.Client;
import com.asana.models.Tag;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.TagsBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 46).given(workspace, "hi!").checkEq(path, "/workspaces/hi!/tags");
        new Here("Randoop", 46).given(workspace, "Server Error").checkEq(path, "/workspaces/Server Error/tags");
        new Here("Randoop", 46).given(workspace, "DELETE").checkEq(path, "/workspaces/DELETE/tags");
        new Here("Randoop", 46).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden/tags");
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
        new Here("Randoop", 58).given(tag, "200").checkEq(path, "/tags/200");
        new Here("Randoop", 58).given(tag, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/tags/urn:ietf:wg:oauth:2.0:oob");
        new Here("Unit", 58).given(tag, "1").checkEq(path, "/tags/1");
        new Here("Randoop", 58).given(tag, "").checkEq(path, "/tags/");
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
        new Here("Randoop", 77).given(tag, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tags/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        new Here("Randoop", 77).given(tag, "Payment Required").checkEq(path, "/tags/Payment Required");
        new Here("Randoop", 77).given(tag, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=com.asana.errors.RateLimitEnforcedError:%20Rate%20Limit%20Enforced").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=com.asana.errors.RateLimitEnforcedError:%20Rate%20Limit%20Enforced");
        new Here("Randoop", 77).given(tag, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error").checkEq(path, "/tags/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error");
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
        new Here("Randoop", 92).given(tag, "Server Error").checkEq(path, "/tags/Server Error");
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
        new Here("Randoop", 115).given(workspace, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/workspaces/com.asana.errors.InvalidRequestError: Invalid Request/tags");
        new Here("Randoop", 115).given(workspace, "Forbidden").checkEq(path, "/workspaces/Forbidden/tags");
        new Here("Randoop", 115).given(workspace, "POST").checkEq(path, "/workspaces/POST/tags");
        return new CollectionRequest<Tag>(this, Tag.class, path, "GET");
    }
}
