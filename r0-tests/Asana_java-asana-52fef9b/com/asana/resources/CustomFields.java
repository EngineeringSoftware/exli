package com.asana.resources;

import com.asana.Client;
import com.asana.models.CustomField;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.CustomFieldsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class CustomFields extends CustomFieldsBase {

    public CustomFields(Client client) {
        super(client);
    }

    /**
     * Creates a new custom field in a workspace. Every custom field is required to be created in a specific workspace, and this workspace cannot be changed once set.
     *
     * A custom field's `name` must be unique within a workspace and not conflict with names of existing task properties such as 'Due Date' or 'Assignee'. A custom field's `type` must be one of  'text', 'enum', or 'number'.
     *
     * Returns the full record of the newly created custom field.
     *
     * @return Request object
     */
    public ItemRequest<CustomField> create() {
        return new ItemRequest<CustomField>(this, CustomField.class, "/custom_fields", "POST");
    }

    /**
     * Returns the complete definition of a custom field's metadata.
     *
     * @param  customField Globally unique identifier for the custom field.
     * @return Request object
     */
    public ItemRequest<CustomField> findById(String customField) {
        String path = String.format("/custom_fields/%s", customField);
        itest("randoop", 36).given(customField, "/attachments/").checkEq(path, "/custom_fields//attachments/");
        itest("randoop", 36).given(customField, "200").checkEq(path, "/custom_fields/200");
        itest("randoop", 36).given(customField, "NoAuthorizationError").checkEq(path, "/custom_fields/NoAuthorizationError");
        itest("randoop", 36).given(customField, "/tags").checkEq(path, "/custom_fields//tags");
        itest("evosuite", 36).given(customField, "max_retries").checkEq(path, "/custom_fields/max_retries");
        itest("evosuite", 36).given(customField, "POST").checkEq(path, "/custom_fields/POST");
        itest("randoop", 36).given(customField, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 36).given(customField, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 36).given(customField, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 36).given(customField, "/tags/Payment Required").checkEq(path, "/custom_fields//tags/Payment Required");
        itest("evosuite", 36).given(customField, "Aj%VAjU`K").checkEq(path, "/custom_fields/Aj%VAjU`K");
        itest("randoop", 36).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 36).given(customField, "/goals/{goal_gid}/subgoals").checkEq(path, "/custom_fields//goals/{goal_gid}/subgoals");
        itest("evosuite", 36).given(customField, "com.github.javaparser.resolution.types.ResolvedWildcard").checkEq(path, "/custom_fields/com.github.javaparser.resolution.types.ResolvedWildcard");
        itest("evosuite", 36).given(customField, "7$G.lD.Zgq)vZ2j#kt").checkEq(path, "/custom_fields/7$G.lD.Zgq)vZ2j#kt");
        itest("randoop", 36).given(customField, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/custom_fields/urn:ietf:wg:oauth:2.0:oob");
        itest("evosuite", 36).given(customField, "/custom_fields").checkEq(path, "/custom_fields//custom_fields");
        itest("randoop", 36).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 36).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 36).given(customField, "/tasks/{task_gid}/duplicate").checkEq(path, "/custom_fields//tasks/{task_gid}/duplicate");
        itest("randoop", 36).given(customField, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 36).given(customField, "/goals/Sync token invalid or too old").checkEq(path, "/custom_fields//goals/Sync token invalid or too old");
        itest("randoop", 36).given(customField, "hi!").checkEq(path, "/custom_fields/hi!");
        itest("randoop", 36).given(customField, "").checkEq(path, "/custom_fields/");
        itest("randoop", 36).given(customField, "/portfolios/").checkEq(path, "/custom_fields//portfolios/");
        itest("randoop", 36).given(customField, "/webhooks/NoAuthorizationError").checkEq(path, "/custom_fields//webhooks/NoAuthorizationError");
        itest("randoop", 36).given(customField, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/custom_fields//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 36).given(customField, "Not Found").checkEq(path, "/custom_fields/Not Found");
        itest("randoop", 36).given(customField, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/custom_fields/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 36).given(customField, "POST").checkEq(path, "/custom_fields/POST");
        itest("evosuite", 36).given(customField, "").checkEq(path, "/custom_fields/");
        return new ItemRequest<CustomField>(this, CustomField.class, path, "GET");
    }

    /**
     * Returns a list of the compact representation of all of the custom fields in a workspace.
     *
     * @param  workspace The workspace or organization to find custom field definitions in.
     * @return Request object
     */
    public CollectionRequest<CustomField> findByWorkspace(String workspace) {
        String path = String.format("/workspaces/%s/custom_fields", workspace);
        itest("randoop", 48).given(workspace, "com.asana.errors.AsanaError: hi!").checkEq(path, "/workspaces/com.asana.errors.AsanaError: hi!/custom_fields");
        itest("randoop", 48).given(workspace, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/custom_fields");
        itest("randoop", 48).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/custom_fields");
        itest("randoop", 48).given(workspace, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/custom_fields");
        itest("randoop", 48).given(workspace, "/attachments/Not Found").checkEq(path, "/workspaces//attachments/Not Found/custom_fields");
        itest("randoop", 48).given(workspace, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/workspaces/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/custom_fields");
        itest("randoop", 48).given(workspace, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/workspaces//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/custom_fields");
        itest("randoop", 48).given(workspace, "").checkEq(path, "/workspaces//custom_fields");
        itest("evosuite", 48).given(workspace, "\"|Q<R.dpk'EK").checkEq(path, "/workspaces/\"|Q<R.dpk'EK/custom_fields");
        itest("randoop", 48).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/custom_fields");
        itest("randoop", 48).given(workspace, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/workspaces//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/custom_fields");
        itest("evosuite", 48).given(workspace, "/custom_fields").checkEq(path, "/workspaces//custom_fields/custom_fields");
        itest("evosuite", 48).given(workspace, "POST").checkEq(path, "/workspaces/POST/custom_fields");
        itest("randoop", 48).given(workspace, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/custom_fields");
        itest("randoop", 48).given(workspace, "POST").checkEq(path, "/workspaces/POST/custom_fields");
        itest("randoop", 48).given(workspace, "/webhooks/NoAuthorizationError").checkEq(path, "/workspaces//webhooks/NoAuthorizationError/custom_fields");
        itest("randoop", 48).given(workspace, "GET").checkEq(path, "/workspaces/GET/custom_fields");
        itest("randoop", 48).given(workspace, "Rate Limit Enforced").checkEq(path, "/workspaces/Rate Limit Enforced/custom_fields");
        itest("randoop", 48).given(workspace, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/custom_fields");
        itest("randoop", 48).given(workspace, "0").checkEq(path, "/workspaces/0/custom_fields");
        itest("randoop", 48).given(workspace, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/custom_fields");
        itest("randoop", 48).given(workspace, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/workspaces//portfolio_memberships//goals/{goal_gid}/addSubgoal/custom_fields");
        itest("evosuite", 48).given(workspace, "GET").checkEq(path, "/workspaces/GET/custom_fields");
        return new CollectionRequest<CustomField>(this, CustomField.class, path, "GET");
    }

    /**
     * A specific, existing custom field can be updated by making a PUT request on the URL for that custom field. Only the fields provided in the `data` block will be updated; any unspecified fields will remain unchanged
     *
     * When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the custom field.
     *
     * An enum custom field's `enum_options` cannot be updated with this endpoint. Instead see "Work With Enum Options" for information on how to update `enum_options`.
     *
     * Locked custom fields can only be updated by the user who locked the field.
     *
     * Returns the complete updated custom field record.
     *
     * @param  customField Globally unique identifier for the custom field.
     * @return Request object
     */
    public ItemRequest<CustomField> update(String customField) {
        String path = String.format("/custom_fields/%s", customField);
        itest("evosuite", 68).given(customField, "/portfolios/%s/removeMembers").checkEq(path, "/custom_fields//portfolios/%s/removeMembers");
        itest("randoop", 68).given(customField, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/custom_fields/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 68).given(customField, "Invalid Request").checkEq(path, "/custom_fields/Invalid Request");
        itest("randoop", 68).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 68).given(customField, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/custom_fields/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 68).given(customField, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 68).given(customField, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/custom_fields//workspaces//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 68).given(customField, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/custom_fields/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 68).given(customField, "NoAuthorizationError").checkEq(path, "/custom_fields/NoAuthorizationError");
        itest("randoop", 68).given(customField, "200").checkEq(path, "/custom_fields/200");
        itest("randoop", 68).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 68).given(customField, "Aj%VAjU`K").checkEq(path, "/custom_fields/Aj%VAjU`K");
        itest("randoop", 68).given(customField, "Sync token invalid or too old").checkEq(path, "/custom_fields/Sync token invalid or too old");
        itest("randoop", 68).given(customField, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 68).given(customField, "POST").checkEq(path, "/custom_fields/POST");
        itest("randoop", 68).given(customField, "GET").checkEq(path, "/custom_fields/GET");
        itest("randoop", 68).given(customField, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 68).given(customField, "/portfolios/").checkEq(path, "/custom_fields//portfolios/");
        itest("randoop", 68).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("evosuite", 68).given(customField, null).checkEq(path, "/custom_fields/null");
        itest("randoop", 68).given(customField, "10").checkEq(path, "/custom_fields/10");
        itest("randoop", 68).given(customField, "").checkEq(path, "/custom_fields/");
        itest("randoop", 68).given(customField, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 68).given(customField, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/custom_fields//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        return new ItemRequest<CustomField>(this, CustomField.class, path, "PUT");
    }

    /**
     * A specific, existing custom field can be deleted by making a DELETE request on the URL for that custom field.
     *
     * Locked custom fields can only be deleted by the user who locked the field.
     *
     * Returns an empty data record.
     *
     * @param  customField Globally unique identifier for the custom field.
     * @return Request object
     */
    public ItemRequest<CustomField> delete(String customField) {
        String path = String.format("/custom_fields/%s", customField);
        itest("randoop", 84).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 84).given(customField, "Sync token invalid or too old").checkEq(path, "/custom_fields/Sync token invalid or too old");
        itest("randoop", 84).given(customField, "Rate Limit Enforced").checkEq(path, "/custom_fields/Rate Limit Enforced");
        itest("evosuite", 84).given(customField, "Aj%VAjU`K").checkEq(path, "/custom_fields/Aj%VAjU`K");
        itest("randoop", 84).given(customField, "0").checkEq(path, "/custom_fields/0");
        itest("randoop", 84).given(customField, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/custom_fields//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 84).given(customField, "10").checkEq(path, "/custom_fields/10");
        itest("randoop", 84).given(customField, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/custom_fields//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 84).given(customField, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/custom_fields/urn:ietf:wg:oauth:2.0:oob");
        itest("evosuite", 84).given(customField, "(}++Vi\"").checkEq(path, "/custom_fields/(}++Vi\"");
        itest("randoop", 84).given(customField, "POST").checkEq(path, "/custom_fields/POST");
        itest("randoop", 84).given(customField, "Payment Required").checkEq(path, "/custom_fields/Payment Required");
        itest("randoop", 84).given(customField, "/projects/Rate Limit Enforced/sections").checkEq(path, "/custom_fields//projects/Rate Limit Enforced/sections");
        itest("randoop", 84).given(customField, "Server Error").checkEq(path, "/custom_fields/Server Error");
        itest("randoop", 84).given(customField, "").checkEq(path, "/custom_fields/");
        itest("randoop", 84).given(customField, "Forbidden").checkEq(path, "/custom_fields/Forbidden");
        itest("evosuite", 84).given(customField, null).checkEq(path, "/custom_fields/null");
        itest("randoop", 84).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 84).given(customField, "/portfolios/%s/removeMembers").checkEq(path, "/custom_fields//portfolios/%s/removeMembers");
        itest("randoop", 84).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 84).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 84).given(customField, "com.asana.errors.AsanaError: hi!").checkEq(path, "/custom_fields/com.asana.errors.AsanaError: hi!");
        itest("randoop", 84).given(customField, "hi!").checkEq(path, "/custom_fields/hi!");
        itest("evosuite", 84).given(customField, "j:/NSeh,x").checkEq(path, "/custom_fields/j:/NSeh,x");
        return new ItemRequest<CustomField>(this, CustomField.class, path, "DELETE");
    }

    /**
     * Creates an enum option and adds it to this custom field's list of enum options. A custom field can have at most 50 enum options (including disabled options). By default new enum options are inserted at the end of a custom field's list.
     *
     * Locked custom fields can only have enum options added by the user who locked the field.
     *
     * Returns the full record of the newly created enum option.
     *
     * @param  customField Globally unique identifier for the custom field.
     * @return Request object
     */
    public ItemRequest<CustomField> createEnumOption(String customField) {
        String path = String.format("/custom_fields/%s/enum_options", customField);
        itest("randoop", 100).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/enum_options");
        itest("randoop", 100).given(customField, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/custom_fields//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/enum_options");
        itest("evosuite", 100).given(customField, "/custom_fields").checkEq(path, "/custom_fields//custom_fields/enum_options");
        itest("randoop", 100).given(customField, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/custom_fields//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/enum_options");
        itest("randoop", 100).given(customField, "/portfolios/").checkEq(path, "/custom_fields//portfolios//enum_options");
        itest("randoop", 100).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/enum_options");
        itest("randoop", 100).given(customField, "10").checkEq(path, "/custom_fields/10/enum_options");
        itest("evosuite", 100).given(customField, "Aj%VAjU`K").checkEq(path, "/custom_fields/Aj%VAjU`K/enum_options");
        itest("evosuite", 100).given(customField, "GET").checkEq(path, "/custom_fields/GET/enum_options");
        itest("randoop", 100).given(customField, "Server Error").checkEq(path, "/custom_fields/Server Error/enum_options");
        itest("randoop", 100).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/enum_options");
        itest("randoop", 100).given(customField, "com.asana.errors.AsanaError: hi!").checkEq(path, "/custom_fields/com.asana.errors.AsanaError: hi!/enum_options");
        itest("randoop", 100).given(customField, "").checkEq(path, "/custom_fields//enum_options");
        itest("evosuite", 100).given(customField, "/custom_fields/%s/enum_options/insert").checkEq(path, "/custom_fields//custom_fields/%s/enum_options/insert/enum_options");
        itest("randoop", 100).given(customField, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/custom_fields/urn:ietf:wg:oauth:2.0:oob/enum_options");
        itest("randoop", 100).given(customField, "POST").checkEq(path, "/custom_fields/POST/enum_options");
        itest("randoop", 100).given(customField, "/tasks/200/addProject").checkEq(path, "/custom_fields//tasks/200/addProject/enum_options");
        itest("randoop", 100).given(customField, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/enum_options");
        itest("randoop", 100).given(customField, "Payment Required").checkEq(path, "/custom_fields/Payment Required/enum_options");
        itest("randoop", 100).given(customField, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/custom_fields//portfolio_memberships//goals/{goal_gid}/addSubgoal/enum_options");
        itest("randoop", 100).given(customField, "Not Found").checkEq(path, "/custom_fields/Not Found/enum_options");
        itest("randoop", 100).given(customField, "/organizations//teams").checkEq(path, "/custom_fields//organizations//teams/enum_options");
        itest("randoop", 100).given(customField, "NoAuthorizationError").checkEq(path, "/custom_fields/NoAuthorizationError/enum_options");
        itest("randoop", 100).given(customField, "Rate Limit Enforced").checkEq(path, "/custom_fields/Rate Limit Enforced/enum_options");
        return new ItemRequest<CustomField>(this, CustomField.class, path, "POST");
    }

    /**
     * Moves a particular enum option to be either before or after another specified enum option in the custom field.
     *
     * Locked custom fields can only be reordered by the user who locked the field.
     *
     * @param  customField Globally unique identifier for the custom field.
     * @return Request object
     */
    public ItemRequest<CustomField> insertEnumOption(String customField) {
        String path = String.format("/custom_fields/%s/enum_options/insert", customField);
        itest("randoop", 114).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/enum_options/insert");
        itest("evosuite", 114).given(customField, "").checkEq(path, "/custom_fields//enum_options/insert");
        itest("randoop", 114).given(customField, "/attachments/").checkEq(path, "/custom_fields//attachments//enum_options/insert");
        itest("randoop", 114).given(customField, "/attachments/Not Found").checkEq(path, "/custom_fields//attachments/Not Found/enum_options/insert");
        itest("randoop", 114).given(customField, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/enum_options/insert");
        itest("randoop", 114).given(customField, "0").checkEq(path, "/custom_fields/0/enum_options/insert");
        itest("evosuite", 114).given(customField, "GET").checkEq(path, "/custom_fields/GET/enum_options/insert");
        itest("randoop", 114).given(customField, "/tags/Payment Required").checkEq(path, "/custom_fields//tags/Payment Required/enum_options/insert");
        itest("randoop", 114).given(customField, "Sync token invalid or too old").checkEq(path, "/custom_fields/Sync token invalid or too old/enum_options/insert");
        itest("randoop", 114).given(customField, "10").checkEq(path, "/custom_fields/10/enum_options/insert");
        itest("randoop", 114).given(customField, "").checkEq(path, "/custom_fields//enum_options/insert");
        itest("evosuite", 114).given(customField, "mcl\"OwoEBfS3u").checkEq(path, "/custom_fields/mcl\"OwoEBfS3u/enum_options/insert");
        itest("randoop", 114).given(customField, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/custom_fields/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/enum_options/insert");
        itest("randoop", 114).given(customField, "/webhooks/NoAuthorizationError").checkEq(path, "/custom_fields//webhooks/NoAuthorizationError/enum_options/insert");
        itest("randoop", 114).given(customField, "/tags").checkEq(path, "/custom_fields//tags/enum_options/insert");
        itest("randoop", 114).given(customField, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/custom_fields//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/enum_options/insert");
        itest("randoop", 114).given(customField, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/custom_fields/com.asana.errors.PremiumOnlyError: Payment Required/enum_options/insert");
        itest("randoop", 114).given(customField, "hi!").checkEq(path, "/custom_fields/hi!/enum_options/insert");
        itest("randoop", 114).given(customField, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/enum_options/insert");
        itest("randoop", 114).given(customField, "Not Found").checkEq(path, "/custom_fields/Not Found/enum_options/insert");
        itest("randoop", 114).given(customField, "Invalid Request").checkEq(path, "/custom_fields/Invalid Request/enum_options/insert");
        itest("randoop", 114).given(customField, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: 200/enum_options/insert");
        return new ItemRequest<CustomField>(this, CustomField.class, path, "POST");
    }
}
