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

public class CustomFieldsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public CustomFieldsBase(Client client) {
        super(client);
    }

    /**
     * Create a custom field
     * Creates a new custom field in a workspace. Every custom field is required to be created in a specific workspace, and this workspace cannot be changed once set.  A custom field’s name must be unique within a workspace and not conflict with names of existing task properties such as ‘Due Date’ or ‘Assignee’. A custom field’s type must be one of ‘text’, ‘enum’, or ‘number’.  Returns the full record of the newly created custom field.
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(CustomField)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<CustomField> createCustomField(String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/custom_fields";
        ItemRequest<CustomField> req = new ItemRequest<CustomField>(this, CustomField.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<CustomField> createCustomField() throws IOException {
        return createCustomField(null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Create an enum option
     * Creates an enum option and adds it to this custom field’s list of enum options. A custom field can have at most 50 enum options (including disabled options). By default new enum options are inserted at the end of a custom field’s list. Locked custom fields can only have enum options added by the user who locked the field. Returns the full record of the newly created enum option.
     * @param customFieldGid Globally unique identifier for the custom field. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> createEnumOptionForCustomField(String customFieldGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/custom_fields/{custom_field_gid}/enum_options".replace("{custom_field_gid}", customFieldGid);
        itest("randoop", 58).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/enum_options");
        itest("randoop", 58).given(customFieldGid, "/organizations//teams").checkEq(path, "/custom_fields//organizations//teams/enum_options");
        itest("randoop", 58).given(customFieldGid, "hi!").checkEq(path, "/custom_fields/hi!/enum_options");
        itest("randoop", 58).given(customFieldGid, "/custom_fields//enum_options/insert").checkEq(path, "/custom_fields//custom_fields//enum_options/insert/enum_options");
        itest("randoop", 58).given(customFieldGid, "").checkEq(path, "/custom_fields//enum_options");
        itest("randoop", 58).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/enum_options");
        itest("evosuite", 58).given(customFieldGid, "com.google.common.reflect.Types$NativeTypeVariableEquals").checkEq(path, "/custom_fields/com.google.common.reflect.Types$NativeTypeVariableEquals/enum_options");
        itest("randoop", 58).given(customFieldGid, "GET").checkEq(path, "/custom_fields/GET/enum_options");
        itest("randoop", 58).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/enum_options");
        itest("randoop", 58).given(customFieldGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/custom_fields/com.asana.errors.PremiumOnlyError: Payment Required/enum_options");
        itest("randoop", 58).given(customFieldGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/custom_fields/urn:ietf:wg:oauth:2.0:oob/enum_options");
        itest("randoop", 58).given(customFieldGid, "Payment Required").checkEq(path, "/custom_fields/Payment Required/enum_options");
        itest("randoop", 58).given(customFieldGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: 200/enum_options");
        itest("randoop", 58).given(customFieldGid, "Not Found").checkEq(path, "/custom_fields/Not Found/enum_options");
        itest("evosuite", 58).given(customFieldGid, "|/-%V/oOt=v1Z^6*d'").checkEq(path, "/custom_fields/|/-%V/oOt=v1Z^6*d'/enum_options");
        itest("randoop", 58).given(customFieldGid, "POST").checkEq(path, "/custom_fields/POST/enum_options");
        itest("evosuite", 58).given(customFieldGid, "GET").checkEq(path, "/custom_fields/GET/enum_options");
        itest("randoop", 58).given(customFieldGid, "NoAuthorizationError").checkEq(path, "/custom_fields/NoAuthorizationError/enum_options");
        itest("randoop", 58).given(customFieldGid, "0").checkEq(path, "/custom_fields/0/enum_options");
        itest("randoop", 58).given(customFieldGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/enum_options");
        itest("randoop", 58).given(customFieldGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/custom_fields//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/enum_options");
        itest("randoop", 58).given(customFieldGid, "Server Error").checkEq(path, "/custom_fields/Server Error/enum_options");
        itest("evosuite", 58).given(customFieldGid, "POST").checkEq(path, "/custom_fields/POST/enum_options");
        itest("randoop", 58).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/enum_options");
        itest("randoop", 58).given(customFieldGid, "200").checkEq(path, "/custom_fields/200/enum_options");
        itest("randoop", 58).given(customFieldGid, "/webhooks/NoAuthorizationError").checkEq(path, "/custom_fields//webhooks/NoAuthorizationError/enum_options");
        itest("randoop", 58).given(customFieldGid, "Invalid Request").checkEq(path, "/custom_fields/Invalid Request/enum_options");
        itest("randoop", 58).given(customFieldGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/custom_fields//goals/{goal_gid}/addSubgoal/enum_options");
        itest("evosuite", 58).given(customFieldGid, "{workspace_gid}").checkEq(path, "/custom_fields/{workspace_gid}/enum_options");
        itest("randoop", 58).given(customFieldGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/custom_fields/com.asana.errors.AsanaError: hi!/enum_options");
        itest("randoop", 58).given(customFieldGid, "Rate Limit Enforced").checkEq(path, "/custom_fields/Rate Limit Enforced/enum_options");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public ItemRequest<JsonElement> createEnumOptionForCustomField(String customFieldGid) throws IOException {
        return createEnumOptionForCustomField(customFieldGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Delete a custom field
     * A specific, existing custom field can be deleted by making a DELETE request on the URL for that custom field. Locked custom fields can only be deleted by the user who locked the field. Returns an empty data record.
     * @param customFieldGid Globally unique identifier for the custom field. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteCustomField(String customFieldGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/custom_fields/{custom_field_gid}".replace("{custom_field_gid}", customFieldGid);
        itest("evosuite", 82).given(customFieldGid, "/custom_fields/{custom_field_gid}/enum_options").checkEq(path, "/custom_fields//custom_fields/{custom_field_gid}/enum_options");
        itest("evosuite", 82).given(customFieldGid, "&8FTM |hWx0fZ;}(aP").checkEq(path, "/custom_fields/&8FTM |hWx0fZ;}(aP");
        itest("randoop", 82).given(customFieldGid, "/attachments/Not Found").checkEq(path, "/custom_fields//attachments/Not Found");
        itest("randoop", 82).given(customFieldGid, "/tags/Payment Required").checkEq(path, "/custom_fields//tags/Payment Required");
        itest("randoop", 82).given(customFieldGid, "/attachments/").checkEq(path, "/custom_fields//attachments/");
        itest("randoop", 82).given(customFieldGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/custom_fields//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 82).given(customFieldGid, "Invalid Request").checkEq(path, "/custom_fields/Invalid Request");
        itest("randoop", 82).given(customFieldGid, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject").checkEq(path, "/custom_fields//tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject");
        itest("randoop", 82).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 82).given(customFieldGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/custom_fields/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 82).given(customFieldGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: Server Error");
        itest("evosuite", 82).given(customFieldGid, "/custom_fields/Z!@0tihUpEx;_!u").checkEq(path, "/custom_fields//custom_fields/Z!@0tihUpEx;_!u");
        itest("randoop", 82).given(customFieldGid, "0").checkEq(path, "/custom_fields/0");
        itest("evosuite", 82).given(customFieldGid, "1yk]m}.hYqp_LwS(3#").checkEq(path, "/custom_fields/1yk]m}.hYqp_LwS(3#");
        itest("randoop", 82).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 82).given(customFieldGid, "NoAuthorizationError").checkEq(path, "/custom_fields/NoAuthorizationError");
        itest("randoop", 82).given(customFieldGid, "GET").checkEq(path, "/custom_fields/GET");
        itest("randoop", 82).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 82).given(customFieldGid, "Rate Limit Enforced").checkEq(path, "/custom_fields/Rate Limit Enforced");
        itest("randoop", 82).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 82).given(customFieldGid, "").checkEq(path, "/custom_fields/");
        itest("randoop", 82).given(customFieldGid, "/webhooks/NoAuthorizationError").checkEq(path, "/custom_fields//webhooks/NoAuthorizationError");
        itest("randoop", 82).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 82).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 82).given(customFieldGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: 200");
        itest("evosuite", 82).given(customFieldGid, "user").checkEq(path, "/custom_fields/user");
        itest("randoop", 82).given(customFieldGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/custom_fields//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 82).given(customFieldGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/custom_fields//projects/Rate Limit Enforced/sections");
        itest("evosuite", 82).given(customFieldGid, "").checkEq(path, "/custom_fields/");
        itest("randoop", 82).given(customFieldGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/custom_fields//tasks//attachments/Not Found/addProject");
        itest("randoop", 82).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 82).given(customFieldGid, "hi!").checkEq(path, "/custom_fields/hi!");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteCustomField(String customFieldGid) throws IOException {
        return deleteCustomField(customFieldGid, null, false);
    }

    /**
     * Get a custom field
     * Get the complete definition of a custom field’s metadata.  Since custom fields can be defined for one of a number of types, and these types have different data and behaviors, there are fields that are relevant to a particular type. For instance, as noted above, enum_options is only relevant for the enum type and defines the set of choices that the enum could represent. The examples below show some of these type-specific custom field definitions.
     * @param customFieldGid Globally unique identifier for the custom field. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(CustomField)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<CustomField> getCustomField(String customFieldGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/custom_fields/{custom_field_gid}".replace("{custom_field_gid}", customFieldGid);
        itest("randoop", 104).given(customFieldGid, "hi!").checkEq(path, "/custom_fields/hi!");
        itest("randoop", 104).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 104).given(customFieldGid, "/webhooks/NoAuthorizationError").checkEq(path, "/custom_fields//webhooks/NoAuthorizationError");
        itest("randoop", 104).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 104).given(customFieldGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/custom_fields/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 104).given(customFieldGid, "/attachments/Not Found").checkEq(path, "/custom_fields//attachments/Not Found");
        itest("evosuite", 104).given(customFieldGid, "page_size").checkEq(path, "/custom_fields/page_size");
        itest("randoop", 104).given(customFieldGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/custom_fields//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 104).given(customFieldGid, "10").checkEq(path, "/custom_fields/10");
        itest("randoop", 104).given(customFieldGid, "Sync token invalid or too old").checkEq(path, "/custom_fields/Sync token invalid or too old");
        itest("randoop", 104).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 104).given(customFieldGid, "Server Error").checkEq(path, "/custom_fields/Server Error");
        itest("randoop", 104).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 104).given(customFieldGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/custom_fields//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 104).given(customFieldGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/custom_fields/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 104).given(customFieldGid, "/portfolios/").checkEq(path, "/custom_fields//portfolios/");
        itest("evosuite", 104).given(customFieldGid, "com.google.api.client.util.ByteCountingOutputStream").checkEq(path, "/custom_fields/com.google.api.client.util.ByteCountingOutputStream");
        itest("randoop", 104).given(customFieldGid, "GET").checkEq(path, "/custom_fields/GET");
        itest("randoop", 104).given(customFieldGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/custom_fields//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 104).given(customFieldGid, "/tasks/GET").checkEq(path, "/custom_fields//tasks/GET");
        itest("randoop", 104).given(customFieldGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/custom_fields/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 104).given(customFieldGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/custom_fields/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 104).given(customFieldGid, "NoAuthorizationError").checkEq(path, "/custom_fields/NoAuthorizationError");
        itest("evosuite", 104).given(customFieldGid, "").checkEq(path, "/custom_fields/");
        itest("randoop", 104).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 104).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 104).given(customFieldGid, "/attachments/").checkEq(path, "/custom_fields//attachments/");
        itest("randoop", 104).given(customFieldGid, "200").checkEq(path, "/custom_fields/200");
        itest("randoop", 104).given(customFieldGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 104).given(customFieldGid, "Forbidden").checkEq(path, "/custom_fields/Forbidden");
        itest("evosuite", 104).given(customFieldGid, "com.asana.resources.gen.CustomFieldsBase").checkEq(path, "/custom_fields/com.asana.resources.gen.CustomFieldsBase");
        itest("randoop", 104).given(customFieldGid, "/tags").checkEq(path, "/custom_fields//tags");
        itest("randoop", 104).given(customFieldGid, "").checkEq(path, "/custom_fields/");
        itest("evosuite", 104).given(customFieldGid, "com.github.javaparser.ast.stmt.CatchClause").checkEq(path, "/custom_fields/com.github.javaparser.ast.stmt.CatchClause");
        itest("evosuite", 104).given(customFieldGid, "T").checkEq(path, "/custom_fields/T");
        itest("randoop", 104).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 104).given(customFieldGid, "Payment Required").checkEq(path, "/custom_fields/Payment Required");
        itest("evosuite", 104).given(customFieldGid, "Z!@0tihUpEx;_!u").checkEq(path, "/custom_fields/Z!@0tihUpEx;_!u");
        itest("randoop", 104).given(customFieldGid, "0").checkEq(path, "/custom_fields/0");
        itest("randoop", 104).given(customFieldGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/custom_fields/com.asana.errors.PremiumOnlyError: Payment Required");
        ItemRequest<CustomField> req = new ItemRequest<CustomField>(this, CustomField.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<CustomField> getCustomField(String customFieldGid) throws IOException {
        return getCustomField(customFieldGid, null, false);
    }

    /**
     * Get a workspace&#x27;s custom fields
     * Returns a list of the compact representation of all of the custom fields in a workspace.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(CustomField)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<CustomField> getCustomFieldsForWorkspace(String workspaceGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/workspaces/{workspace_gid}/custom_fields".replace("{workspace_gid}", workspaceGid);
        itest("evosuite", 128).given(workspaceGid, "offset").checkEq(path, "/workspaces/offset/custom_fields");
        itest("randoop", 128).given(workspaceGid, "/portfolios/").checkEq(path, "/workspaces//portfolios//custom_fields");
        itest("randoop", 128).given(workspaceGid, "Invalid Request").checkEq(path, "/workspaces/Invalid Request/custom_fields");
        itest("randoop", 128).given(workspaceGid, "/custom_fields//enum_options/insert").checkEq(path, "/workspaces//custom_fields//enum_options/insert/custom_fields");
        itest("randoop", 128).given(workspaceGid, "POST").checkEq(path, "/workspaces/POST/custom_fields");
        itest("randoop", 128).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/custom_fields");
        itest("randoop", 128).given(workspaceGid, "/workspaces/").checkEq(path, "/workspaces//workspaces//custom_fields");
        itest("randoop", 128).given(workspaceGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/workspaces/com.asana.errors.InvalidTokenError: Sync token invalid or too old/custom_fields");
        itest("randoop", 128).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/custom_fields");
        itest("randoop", 128).given(workspaceGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/workspaces//projects/Rate Limit Enforced/sections/custom_fields");
        itest("evosuite", 128).given(workspaceGid, "@qW)dS").checkEq(path, "/workspaces/@qW)dS/custom_fields");
        itest("randoop", 128).given(workspaceGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/workspaces//goals/{goal_gid}/subgoals/custom_fields");
        itest("randoop", 128).given(workspaceGid, "").checkEq(path, "/workspaces//custom_fields");
        itest("randoop", 128).given(workspaceGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/workspaces/com.asana.errors.PremiumOnlyError: Payment Required/custom_fields");
        itest("randoop", 128).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/custom_fields");
        itest("evosuite", 128).given(workspaceGid, "workspace").checkEq(path, "/workspaces/workspace/custom_fields");
        itest("randoop", 128).given(workspaceGid, "0").checkEq(path, "/workspaces/0/custom_fields");
        itest("randoop", 128).given(workspaceGid, "Not Found").checkEq(path, "/workspaces/Not Found/custom_fields");
        itest("randoop", 128).given(workspaceGid, "10").checkEq(path, "/workspaces/10/custom_fields");
        itest("evosuite", 128).given(workspaceGid, "").checkEq(path, "/workspaces//custom_fields");
        itest("randoop", 128).given(workspaceGid, "200").checkEq(path, "/workspaces/200/custom_fields");
        itest("randoop", 128).given(workspaceGid, "Server Error").checkEq(path, "/workspaces/Server Error/custom_fields");
        itest("randoop", 128).given(workspaceGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/workspaces/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/custom_fields");
        itest("randoop", 128).given(workspaceGid, "/tasks/200/addProject").checkEq(path, "/workspaces//tasks/200/addProject/custom_fields");
        itest("randoop", 128).given(workspaceGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/workspaces/com.asana.errors.InvalidRequestError: Invalid Request/custom_fields");
        itest("evosuite", 128).given(workspaceGid, "jHq(XX[+ F>zg").checkEq(path, "/workspaces/jHq(XX[+ F>zg/custom_fields");
        itest("randoop", 128).given(workspaceGid, "Payment Required").checkEq(path, "/workspaces/Payment Required/custom_fields");
        CollectionRequest<CustomField> req = new CollectionRequest<CustomField>(this, CustomField.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<CustomField> getCustomFieldsForWorkspace(String workspaceGid) throws IOException {
        return getCustomFieldsForWorkspace(workspaceGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Reorder a custom field&#x27;s enum
     * Moves a particular enum option to be either before or after another specified enum option in the custom field. Locked custom fields can only be reordered by the user who locked the field.
     * @param customFieldGid Globally unique identifier for the custom field. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> insertEnumOptionForCustomField(String customFieldGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/custom_fields/{custom_field_gid}/enum_options/insert".replace("{custom_field_gid}", customFieldGid);
        itest("randoop", 152).given(customFieldGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/custom_fields/urn:ietf:wg:oauth:2.0:oob/enum_options/insert");
        itest("evosuite", 152).given(customFieldGid, "P7cSXu)4TrBY,?P]{=").checkEq(path, "/custom_fields/P7cSXu)4TrBY,?P]{=/enum_options/insert");
        itest("evosuite", 152).given(customFieldGid, "/custom_fields//custom_fields/com.asana.resources.gen.CustomFieldsBase").checkEq(path, "/custom_fields//custom_fields//custom_fields/com.asana.resources.gen.CustomFieldsBase/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "10").checkEq(path, "/custom_fields/10/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/custom_fields//goals/{goal_gid}/addSubgoal/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "POST").checkEq(path, "/custom_fields/POST/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "/attachments/Not Found").checkEq(path, "/custom_fields//attachments/Not Found/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "Not Found").checkEq(path, "/custom_fields/Not Found/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/custom_fields/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "200").checkEq(path, "/custom_fields/200/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/custom_fields//portfolios/Rate Limit Enforced/portfolio_memberships/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "hi!").checkEq(path, "/custom_fields/hi!/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "Invalid Request").checkEq(path, "/custom_fields/Invalid Request/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "Forbidden").checkEq(path, "/custom_fields/Forbidden/enum_options/insert");
        itest("evosuite", 152).given(customFieldGid, "/custom_fields//portfolios/%s/removeMembers").checkEq(path, "/custom_fields//custom_fields//portfolios/%s/removeMembers/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "").checkEq(path, "/custom_fields//enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/custom_fields//portfolios//goals/{goal_gid}/subgoals/enum_options/insert");
        itest("evosuite", 152).given(customFieldGid, "zz#VV").checkEq(path, "/custom_fields/zz#VV/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/custom_fields/com.asana.errors.InvalidRequestError: Invalid Request/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "/tags").checkEq(path, "/custom_fields//tags/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/enum_options/insert");
        itest("evosuite", 152).given(customFieldGid, "").checkEq(path, "/custom_fields//enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "Rate Limit Enforced").checkEq(path, "/custom_fields/Rate Limit Enforced/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/enum_options/insert");
        itest("evosuite", 152).given(customFieldGid, "Ul").checkEq(path, "/custom_fields/Ul/enum_options/insert");
        itest("randoop", 152).given(customFieldGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/custom_fields/com.asana.errors.AsanaError: NoAuthorizationError/enum_options/insert");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> insertEnumOptionForCustomField(String customFieldGid) throws IOException {
        return insertEnumOptionForCustomField(customFieldGid, null, false);
    }

    /**
     * Update a custom field
     * A specific, existing custom field can be updated by making a PUT request on the URL for that custom field. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the custom field. A custom field’s &#x60;type&#x60; cannot be updated. An enum custom field’s &#x60;enum_options&#x60; cannot be updated with this endpoint. Instead see “Work With Enum Options” for information on how to update &#x60;enum_options&#x60;. Locked custom fields can only be updated by the user who locked the field. Returns the complete updated custom field record.
     * @param customFieldGid Globally unique identifier for the custom field. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(CustomField)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<CustomField> updateCustomField(String customFieldGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/custom_fields/{custom_field_gid}".replace("{custom_field_gid}", customFieldGid);
        itest("randoop", 174).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 174).given(customFieldGid, "/workspaces/").checkEq(path, "/custom_fields//workspaces/");
        itest("randoop", 174).given(customFieldGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/custom_fields//goals/{goal_gid}/addSubgoal");
        itest("randoop", 174).given(customFieldGid, "POST").checkEq(path, "/custom_fields/POST");
        itest("randoop", 174).given(customFieldGid, "Sync token invalid or too old").checkEq(path, "/custom_fields/Sync token invalid or too old");
        itest("randoop", 174).given(customFieldGid, "").checkEq(path, "/custom_fields/");
        itest("randoop", 174).given(customFieldGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/custom_fields/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 174).given(customFieldGid, "Not Found").checkEq(path, "/custom_fields/Not Found");
        itest("randoop", 174).given(customFieldGid, "200").checkEq(path, "/custom_fields/200");
        itest("randoop", 174).given(customFieldGid, "Invalid Request").checkEq(path, "/custom_fields/Invalid Request");
        itest("evosuite", 174).given(customFieldGid, "GET").checkEq(path, "/custom_fields/GET");
        itest("randoop", 174).given(customFieldGid, "/custom_fields//enum_options/insert").checkEq(path, "/custom_fields//custom_fields//enum_options/insert");
        itest("evosuite", 174).given(customFieldGid, "/custom_fields/").checkEq(path, "/custom_fields//custom_fields/");
        itest("randoop", 174).given(customFieldGid, "Payment Required").checkEq(path, "/custom_fields/Payment Required");
        itest("evosuite", 174).given(customFieldGid, "").checkEq(path, "/custom_fields/");
        itest("evosuite", 174).given(customFieldGid, "/custom_fields/com.asana.resources.gen.CustomFieldsBase").checkEq(path, "/custom_fields//custom_fields/com.asana.resources.gen.CustomFieldsBase");
        itest("randoop", 174).given(customFieldGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/custom_fields/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("evosuite", 174).given(customFieldGid, "mQBB6!j").checkEq(path, "/custom_fields/mQBB6!j");
        itest("randoop", 174).given(customFieldGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/custom_fields/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 174).given(customFieldGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/custom_fields/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("evosuite", 174).given(customFieldGid, "PUT").checkEq(path, "/custom_fields/PUT");
        itest("randoop", 174).given(customFieldGid, "Rate Limit Enforced").checkEq(path, "/custom_fields/Rate Limit Enforced");
        itest("randoop", 174).given(customFieldGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/custom_fields//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 174).given(customFieldGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/custom_fields//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 174).given(customFieldGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/custom_fields/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 174).given(customFieldGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/custom_fields/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 174).given(customFieldGid, "hi!").checkEq(path, "/custom_fields/hi!");
        ItemRequest<CustomField> req = new ItemRequest<CustomField>(this, CustomField.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<CustomField> updateCustomField(String customFieldGid) throws IOException {
        return updateCustomField(customFieldGid, null, false);
    }

    /**
     * Update an enum option
     * Updates an existing enum option. Enum custom fields require at least one enabled enum option. Locked custom fields can only be updated by the user who locked the field. Returns the full record of the updated enum option.
     * @param enumOptionGid Globally unique identifier for the enum option. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> updateEnumOption(String enumOptionGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/enum_options/{enum_option_gid}".replace("{enum_option_gid}", enumOptionGid);
        itest("randoop", 196).given(enumOptionGid, "0").checkEq(path, "/enum_options/0");
        itest("randoop", 196).given(enumOptionGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/enum_options/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 196).given(enumOptionGid, "/workspaces/").checkEq(path, "/enum_options//workspaces/");
        itest("randoop", 196).given(enumOptionGid, "Sync token invalid or too old").checkEq(path, "/enum_options/Sync token invalid or too old");
        itest("randoop", 196).given(enumOptionGid, "hi!").checkEq(path, "/enum_options/hi!");
        itest("randoop", 196).given(enumOptionGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/enum_options//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 196).given(enumOptionGid, "$%4pj2pXD/vID").checkEq(path, "/enum_options/$%4pj2pXD/vID");
        itest("evosuite", 196).given(enumOptionGid, "|/-%V/oOt=v1Z^6*d'").checkEq(path, "/enum_options/|/-%V/oOt=v1Z^6*d'");
        itest("randoop", 196).given(enumOptionGid, "NoAuthorizationError").checkEq(path, "/enum_options/NoAuthorizationError");
        itest("randoop", 196).given(enumOptionGid, "200").checkEq(path, "/enum_options/200");
        itest("randoop", 196).given(enumOptionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/enum_options/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 196).given(enumOptionGid, "").checkEq(path, "/enum_options/");
        itest("randoop", 196).given(enumOptionGid, "/custom_fields//enum_options/insert").checkEq(path, "/enum_options//custom_fields//enum_options/insert");
        itest("randoop", 196).given(enumOptionGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/enum_options//tasks//attachments/Not Found/addProject");
        itest("evosuite", 196).given(enumOptionGid, "com.asana.resources.gen.CustomFieldsBase").checkEq(path, "/enum_options/com.asana.resources.gen.CustomFieldsBase");
        itest("randoop", 196).given(enumOptionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/enum_options/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 196).given(enumOptionGid, "{custom_field_gid}").checkEq(path, "/enum_options/{custom_field_gid}");
        itest("randoop", 196).given(enumOptionGid, "/tags/Payment Required").checkEq(path, "/enum_options//tags/Payment Required");
        itest("randoop", 196).given(enumOptionGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/enum_options/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 196).given(enumOptionGid, "/attachments/Not Found").checkEq(path, "/enum_options//attachments/Not Found");
        itest("randoop", 196).given(enumOptionGid, "Forbidden").checkEq(path, "/enum_options/Forbidden");
        itest("randoop", 196).given(enumOptionGid, "/tags").checkEq(path, "/enum_options//tags");
        itest("randoop", 196).given(enumOptionGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/enum_options//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 196).given(enumOptionGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/enum_options/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 196).given(enumOptionGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/enum_options/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 196).given(enumOptionGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/enum_options/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("evosuite", 196).given(enumOptionGid, "zz#VV").checkEq(path, "/enum_options/zz#VV");
        itest("evosuite", 196).given(enumOptionGid, "3M- 4wF$91Jt,<ZeH&").checkEq(path, "/enum_options/3M- 4wF$91Jt,<ZeH&");
        itest("randoop", 196).given(enumOptionGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/enum_options/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 196).given(enumOptionGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/enum_options//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> updateEnumOption(String enumOptionGid) throws IOException {
        return updateEnumOption(enumOptionGid, null, false);
    }
}
