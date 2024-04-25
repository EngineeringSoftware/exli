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

public class WebhooksBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public WebhooksBase(Client client) {
        super(client);
    }

    /**
     * Establish a webhook
     * Establishing a webhook is a two-part process. First, a simple HTTP POST request initiates the creation similar to creating any other resource.  Next, in the middle of this request comes the confirmation handshake. When a webhook is created, we will send a test POST to the target with an &#x60;X-Hook-Secret&#x60; header. The target must respond with a &#x60;200 OK&#x60; or &#x60;204 No Content&#x60; and a matching &#x60;X-Hook-Secret&#x60; header to confirm that this webhook subscription is indeed expected. We strongly recommend storing this secret to be used to verify future webhook event signatures.  The POST request to create the webhook will then return with the status of the request. If you do not acknowledge the webhook’s confirmation handshake it will fail to setup, and you will receive an error in response to your attempt to create it. This means you need to be able to receive and complete the webhook *while* the POST request is in-flight (in other words, have a server that can handle requests asynchronously).  Invalid hostnames like localhost will recieve a 403 Forbidden status code.  &#x60;&#x60;&#x60; # Request curl -H \&quot;Authorization: Bearer &lt;personal_access_token&gt;\&quot; \\ -X POST https://app.asana.com/api/1.0/webhooks \\ -d \&quot;resource&#x3D;8675309\&quot; \\ -d \&quot;target&#x3D;https://example.com/receive-webhook/7654\&quot; &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; # Handshake sent to https://example.com/ POST /receive-webhook/7654 X-Hook-Secret: b537207f20cbfa02357cf448134da559e8bd39d61597dcd5631b8012eae53e81 &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; # Handshake response sent by example.com HTTP/1.1 200 X-Hook-Secret: b537207f20cbfa02357cf448134da559e8bd39d61597dcd5631b8012eae53e81 &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; # Response HTTP/1.1 201 {   \&quot;data\&quot;: {     \&quot;gid\&quot;: \&quot;43214\&quot;,     \&quot;resource\&quot;: {       \&quot;gid\&quot;: \&quot;8675309\&quot;,       \&quot;name\&quot;: \&quot;Bugs\&quot;     },     \&quot;target\&quot;: \&quot;https://example.com/receive-webhook/7654\&quot;,     \&quot;active\&quot;: false,     \&quot;last_success_at\&quot;: null,     \&quot;last_failure_at\&quot;: null,     \&quot;last_failure_content\&quot;: null   } } &#x60;&#x60;&#x60;
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Webhook)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Webhook> createWebhook(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/webhooks";
        ItemRequest<Webhook> req = new ItemRequest<Webhook>(this, Webhook.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Webhook> createWebhook() throws IOException {
        return createWebhook(null, false);
    }

    /**
     * Delete a webhook
     * This method *permanently* removes a webhook. Note that it may be possible to receive a request that was already in flight after deleting the webhook, but no further requests will be issued.
     * @param webhookGid Globally unique identifier for the webhook. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteWebhook(String webhookGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/webhooks/{webhook_gid}".replace("{webhook_gid}", webhookGid);
        itest("randoop", 52).given(webhookGid, "").checkEq(path, "/webhooks/");
        itest("randoop", 52).given(webhookGid, "/tags").checkEq(path, "/webhooks//tags");
        itest("randoop", 52).given(webhookGid, "Sync token invalid or too old").checkEq(path, "/webhooks/Sync token invalid or too old");
        itest("randoop", 52).given(webhookGid, "/projects/Not Found/removeFollowers").checkEq(path, "/webhooks//projects/Not Found/removeFollowers");
        itest("evosuite", 52).given(webhookGid, "[p{ASCII}&&[^p{Cntrl} ;/=[]()<>@,:\"?=]]+").checkEq(path, "/webhooks/[p{ASCII}&&[^p{Cntrl} ;/=[]()<>@,:\"?=]]+");
        itest("randoop", 52).given(webhookGid, "hi!").checkEq(path, "/webhooks/hi!");
        itest("evosuite", 52).given(webhookGid, " @,f{W/=0").checkEq(path, "/webhooks/ @,f{W/=0");
        itest("evosuite", 52).given(webhookGid, "EQ:uF").checkEq(path, "/webhooks/EQ:uF");
        itest("randoop", 52).given(webhookGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/webhooks//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 52).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 52).given(webhookGid, "/webhooks/pZ#rJ#").checkEq(path, "/webhooks//webhooks/pZ#rJ#");
        itest("evosuite", 52).given(webhookGid, "opt_fields").checkEq(path, "/webhooks/opt_fields");
        itest("randoop", 52).given(webhookGid, "Payment Required").checkEq(path, "/webhooks/Payment Required");
        itest("randoop", 52).given(webhookGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/webhooks/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 52).given(webhookGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/webhooks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 52).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 52).given(webhookGid, "/organizations//teams").checkEq(path, "/webhooks//organizations//teams");
        itest("evosuite", 52).given(webhookGid, "GET").checkEq(path, "/webhooks/GET");
        itest("randoop", 52).given(webhookGid, "/attachments/Not Found").checkEq(path, "/webhooks//attachments/Not Found");
        itest("randoop", 52).given(webhookGid, "POST").checkEq(path, "/webhooks/POST");
        itest("randoop", 52).given(webhookGid, "NoAuthorizationError").checkEq(path, "/webhooks/NoAuthorizationError");
        itest("randoop", 52).given(webhookGid, "/webhooks/NoAuthorizationError").checkEq(path, "/webhooks//webhooks/NoAuthorizationError");
        itest("randoop", 52).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 52).given(webhookGid, "FieldAccessExpr").checkEq(path, "/webhooks/FieldAccessExpr");
        itest("randoop", 52).given(webhookGid, "Forbidden").checkEq(path, "/webhooks/Forbidden");
        itest("randoop", 52).given(webhookGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/webhooks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("evosuite", 52).given(webhookGid, "/webhooks/FieldAccessExpr").checkEq(path, "/webhooks//webhooks/FieldAccessExpr");
        itest("randoop", 52).given(webhookGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/webhooks/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 52).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 52).given(webhookGid, "200").checkEq(path, "/webhooks/200");
        itest("randoop", 52).given(webhookGid, "Rate Limit Enforced").checkEq(path, "/webhooks/Rate Limit Enforced");
        itest("randoop", 52).given(webhookGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/webhooks/com.asana.errors.AsanaError: hi!");
        itest("randoop", 52).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 52).given(webhookGid, "GET").checkEq(path, "/webhooks/GET");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteWebhook(String webhookGid) throws IOException {
        return deleteWebhook(webhookGid, null, false);
    }

    /**
     * Get a webhook
     * Returns the full record for the given webhook.
     * @param webhookGid Globally unique identifier for the webhook. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Webhook)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Webhook> getWebhook(String webhookGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/webhooks/{webhook_gid}".replace("{webhook_gid}", webhookGid);
        itest("randoop", 74).given(webhookGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/webhooks//portfolios//goals/{goal_gid}/subgoals");
        itest("evosuite", 74).given(webhookGid, "\"}Qp(R&").checkEq(path, "/webhooks/\"}Qp(R&");
        itest("randoop", 74).given(webhookGid, "/portfolios/").checkEq(path, "/webhooks//portfolios/");
        itest("randoop", 74).given(webhookGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/webhooks/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 74).given(webhookGid, "100").checkEq(path, "/webhooks/100");
        itest("randoop", 74).given(webhookGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/webhooks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 74).given(webhookGid, "").checkEq(path, "/webhooks/");
        itest("randoop", 74).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 74).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("evosuite", 74).given(webhookGid, "pZ#rJ#").checkEq(path, "/webhooks/pZ#rJ#");
        itest("randoop", 74).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 74).given(webhookGid, "Sync token invalid or too old").checkEq(path, "/webhooks/Sync token invalid or too old");
        itest("randoop", 74).given(webhookGid, "Payment Required").checkEq(path, "/webhooks/Payment Required");
        itest("randoop", 74).given(webhookGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/webhooks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 74).given(webhookGid, "GET").checkEq(path, "/webhooks/GET");
        itest("randoop", 74).given(webhookGid, "/projects/Not Found/removeFollowers").checkEq(path, "/webhooks//projects/Not Found/removeFollowers");
        itest("evosuite", 74).given(webhookGid, "yG").checkEq(path, "/webhooks/yG");
        itest("randoop", 74).given(webhookGid, "/tags").checkEq(path, "/webhooks//tags");
        itest("evosuite", 74).given(webhookGid, "").checkEq(path, "/webhooks/");
        itest("randoop", 74).given(webhookGid, "Server Error").checkEq(path, "/webhooks/Server Error");
        itest("randoop", 74).given(webhookGid, "10").checkEq(path, "/webhooks/10");
        itest("evosuite", 74).given(webhookGid, "Ul").checkEq(path, "/webhooks/Ul");
        itest("randoop", 74).given(webhookGid, "GET").checkEq(path, "/webhooks/GET");
        itest("evosuite", 74).given(webhookGid, "[,ENwTZ").checkEq(path, "/webhooks/[,ENwTZ");
        itest("randoop", 74).given(webhookGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/webhooks/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 74).given(webhookGid, "Not Found").checkEq(path, "/webhooks/Not Found");
        itest("evosuite", 74).given(webhookGid, "page_size").checkEq(path, "/webhooks/page_size");
        ItemRequest<Webhook> req = new ItemRequest<Webhook>(this, Webhook.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Webhook> getWebhook(String webhookGid) throws IOException {
        return getWebhook(webhookGid, null, false);
    }

    /**
     * Get multiple webhooks
     * Get the compact representation of all webhooks your app has registered for the authenticated user in the given workspace.
     * @param resource Only return webhooks for the given resource. (optional)
     * @param workspace The workspace to query for webhooks in. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Webhook)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Webhook> getWebhooks(String resource, String workspace, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/webhooks";
        CollectionRequest<Webhook> req = new CollectionRequest<Webhook>(this, Webhook.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("workspace", workspace).query("resource", resource);
        return req;
    }

    public CollectionRequest<Webhook> getWebhooks(String resource, String workspace) throws IOException {
        return getWebhooks(resource, workspace, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Update a webhook
     * An existing webhook&#x27;s filters can be updated by making a PUT request on the URL for that webhook. Note that the webhook&#x27;s previous &#x60;filters&#x60; array will be completely overwritten by the &#x60;filters&#x60; sent in the PUT request.
     * @param webhookGid Globally unique identifier for the webhook. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Webhook)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Webhook> updateWebhook(String webhookGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/webhooks/{webhook_gid}".replace("{webhook_gid}", webhookGid);
        itest("randoop", 125).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 125).given(webhookGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/webhooks/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 125).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 125).given(webhookGid, "NoAuthorizationError").checkEq(path, "/webhooks/NoAuthorizationError");
        itest("randoop", 125).given(webhookGid, "Sync token invalid or too old").checkEq(path, "/webhooks/Sync token invalid or too old");
        itest("randoop", 125).given(webhookGid, "Server Error").checkEq(path, "/webhooks/Server Error");
        itest("randoop", 125).given(webhookGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/webhooks/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 125).given(webhookGid, "/attachments/Not Found").checkEq(path, "/webhooks//attachments/Not Found");
        itest("randoop", 125).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("randoop", 125).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 125).given(webhookGid, "200").checkEq(path, "/webhooks/200");
        itest("randoop", 125).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 125).given(webhookGid, "GET").checkEq(path, "/webhooks/GET");
        itest("randoop", 125).given(webhookGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/webhooks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 125).given(webhookGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/webhooks//workspaces//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 125).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 125).given(webhookGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/webhooks//tasks//attachments/Not Found/addProject");
        itest("randoop", 125).given(webhookGid, "hi!").checkEq(path, "/webhooks/hi!");
        itest("randoop", 125).given(webhookGid, "Not Found").checkEq(path, "/webhooks/Not Found");
        itest("evosuite", 125).given(webhookGid, "z.s}PU^VkB").checkEq(path, "/webhooks/z.s}PU^VkB");
        itest("randoop", 125).given(webhookGid, "0").checkEq(path, "/webhooks/0");
        itest("randoop", 125).given(webhookGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/webhooks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 125).given(webhookGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/webhooks//goals/{goal_gid}/addSubgoal");
        itest("evosuite", 125).given(webhookGid, "/webhooks/{webhook_gid}").checkEq(path, "/webhooks//webhooks/{webhook_gid}");
        itest("randoop", 125).given(webhookGid, "").checkEq(path, "/webhooks/");
        itest("randoop", 125).given(webhookGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/webhooks/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 125).given(webhookGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/webhooks//portfolios//goals/{goal_gid}/subgoals");
        itest("evosuite", 125).given(webhookGid, "opt_fields").checkEq(path, "/webhooks/opt_fields");
        itest("randoop", 125).given(webhookGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/webhooks/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 125).given(webhookGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        ItemRequest<Webhook> req = new ItemRequest<Webhook>(this, Webhook.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Webhook> updateWebhook(String webhookGid) throws IOException {
        return updateWebhook(webhookGid, null, false);
    }
}
