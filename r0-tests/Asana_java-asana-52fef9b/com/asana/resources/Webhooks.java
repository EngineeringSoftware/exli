package com.asana.resources;

import com.asana.Client;
import com.asana.models.Webhook;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.WebhooksBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Webhooks extends WebhooksBase {

    public Webhooks(Client client) {
        super(client);
    }

    /**
     * Establishing a webhook is a two-part process. First, a simple HTTP POST
     * similar to any other resource creation. Since you could have multiple
     * webhooks we recommend specifying a unique local id for each target.
     *
     * Next comes the confirmation handshake. When a webhook is created, we will
     * send a test POST to the `target` with an `X-Hook-Secret` header as
     * described in the
     * [Resthooks Security documentation](http://resthooks.org/docs/security/).
     * The target must respond with a `200 OK` and a matching `X-Hook-Secret`
     * header to confirm that this webhook subscription is indeed expected.
     *
     * If you do not acknowledge the webhook's confirmation handshake it will
     * fail to setup, and you will receive an error in response to your attempt
     * to create it. This means you need to be able to receive and complete the
     * webhook *while* the POST request is in-flight.
     *
     * @return Request object
     */
    public ItemRequest<Webhook> create() {
        return new ItemRequest<Webhook>(this, Webhook.class, "/webhooks", "POST");
    }

    /**
     * Returns the compact representation of all webhooks your app has
     * registered for the authenticated user in the given workspace.
     *
     * @return Request object
     */
    public CollectionRequest<Webhook> getAll() {
        return new CollectionRequest<Webhook>(this, Webhook.class, "/webhooks", "GET");
    }

    /**
     * Returns the full record for the given webhook.
     *
     * @param  webhook The webhook to get.
     * @return Request object
     */
    public ItemRequest<Webhook> getById(String webhook) {
        String path = String.format("/webhooks/%s", webhook);
        itest("randoop", 57).given(webhook, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 57).given(webhook, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 57).given(webhook, "/tasks//attachments/Not Found/addProject").checkEq(path, "/webhooks//tasks//attachments/Not Found/addProject");
        itest("randoop", 57).given(webhook, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/webhooks/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("evosuite", 57).given(webhook, "GET").checkEq(path, "/webhooks/GET");
        itest("evosuite", 57).given(webhook, "DELETE").checkEq(path, "/webhooks/DELETE");
        itest("randoop", 57).given(webhook, "com.asana.errors.AsanaError: hi!").checkEq(path, "/webhooks/com.asana.errors.AsanaError: hi!");
        itest("randoop", 57).given(webhook, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/webhooks/com.asana.errors.AsanaError: NoAuthorizationError");
        itest("evosuite", 57).given(webhook, ".").checkEq(path, "/webhooks/.");
        itest("dev", 57).given(webhook, "222").checkEq(path, "/webhooks/222");
        itest("randoop", 57).given(webhook, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/webhooks/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("evosuite", 57).given(webhook, "").checkEq(path, "/webhooks/");
        itest("randoop", 57).given(webhook, "Not Found").checkEq(path, "/webhooks/Not Found");
        itest("randoop", 57).given(webhook, "/tasks/200/addProject").checkEq(path, "/webhooks//tasks/200/addProject");
        itest("randoop", 57).given(webhook, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/webhooks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 57).given(webhook, "Invalid Request").checkEq(path, "/webhooks/Invalid Request");
        itest("randoop", 57).given(webhook, "/projects/Not Found/removeFollowers").checkEq(path, "/webhooks//projects/Not Found/removeFollowers");
        itest("randoop", 57).given(webhook, "/tags/Payment Required").checkEq(path, "/webhooks//tags/Payment Required");
        itest("randoop", 57).given(webhook, "Server Error").checkEq(path, "/webhooks/Server Error");
        itest("randoop", 57).given(webhook, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 57).given(webhook, "10").checkEq(path, "/webhooks/10");
        itest("randoop", 57).given(webhook, "Rate Limit Enforced").checkEq(path, "/webhooks/Rate Limit Enforced");
        return new ItemRequest<Webhook>(this, Webhook.class, path, "GET");
    }

    /**
     * This method permanently removes a webhook. Note that it may be possible
     * to receive a request that was already in flight after deleting the
     * webhook, but no further requests will be issued.
     *
     * @param  webhook The webhook to delete.
     * @return Request object
     */
    public ItemRequest<Webhook> deleteById(String webhook) {
        String path = String.format("/webhooks/%s", webhook);
        itest("randoop", 71).given(webhook, "/organizations//teams").checkEq(path, "/webhooks//organizations//teams");
        itest("randoop", 71).given(webhook, "/goals/{goal_gid}/subgoals").checkEq(path, "/webhooks//goals/{goal_gid}/subgoals");
        itest("randoop", 71).given(webhook, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/webhooks/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 71).given(webhook, "Server Error").checkEq(path, "/webhooks/Server Error");
        itest("randoop", 71).given(webhook, "NoAuthorizationError").checkEq(path, "/webhooks/NoAuthorizationError");
        itest("randoop", 71).given(webhook, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/webhooks/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("randoop", 71).given(webhook, "Not Found").checkEq(path, "/webhooks/Not Found");
        itest("evosuite", 71).given(webhook, ".").checkEq(path, "/webhooks/.");
        itest("evosuite", 71).given(webhook, "GET").checkEq(path, "/webhooks/GET");
        itest("dev", 71).given(webhook, "222").checkEq(path, "/webhooks/222");
        itest("randoop", 71).given(webhook, "").checkEq(path, "/webhooks/");
        itest("randoop", 71).given(webhook, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/webhooks//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 71).given(webhook, "hi!").checkEq(path, "/webhooks/hi!");
        itest("randoop", 71).given(webhook, "/projects/Not Found/removeFollowers").checkEq(path, "/webhooks//projects/Not Found/removeFollowers");
        itest("randoop", 71).given(webhook, "Rate Limit Enforced").checkEq(path, "/webhooks/Rate Limit Enforced");
        return new ItemRequest<Webhook>(this, Webhook.class, path, "DELETE");
    }
}
