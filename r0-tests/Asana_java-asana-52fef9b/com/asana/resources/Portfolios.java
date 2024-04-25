package com.asana.resources;

import com.asana.Client;
import com.asana.models.Portfolio;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.PortfoliosBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Portfolios extends PortfoliosBase {

    public Portfolios(Client client) {
        super(client);
    }

    /**
     * Creates a new portfolio in the given workspace with the supplied name.
     *
     * Note that portfolios created in the Asana UI may have some state
     * (like the "Priority" custom field) which is automatically added to the
     * portfolio when it is created. Portfolios created via our API will **not**
     * be created with the same initial state to allow integrations to create
     * their own starting state on a portfolio.
     *
     * @return Request object
     */
    public ItemRequest<Portfolio> create() {
        return new ItemRequest<Portfolio>(this, Portfolio.class, "/portfolios", "POST");
    }

    /**
     * Returns the complete record for a single portfolio.
     *
     * @param  portfolio The portfolio to get.
     * @return Request object
     */
    public ItemRequest<Portfolio> findById(String portfolio) {
        String path = String.format("/portfolios/%s", portfolio);
        itest("randoop", 38).given(portfolio, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 38).given(portfolio, "/tags").checkEq(path, "/portfolios//tags");
        itest("randoop", 38).given(portfolio, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found");
        itest("randoop", 38).given(portfolio, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 38).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 38).given(portfolio, "").checkEq(path, "/portfolios/");
        itest("randoop", 38).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 38).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden");
        itest("randoop", 38).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("evosuite", 38).given(portfolio, "g,R;E5.oR\"^\"UD").checkEq(path, "/portfolios/g,R;E5.oR\"^\"UD");
        itest("randoop", 38).given(portfolio, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 38).given(portfolio, "/goals/Sync token invalid or too old").checkEq(path, "/portfolios//goals/Sync token invalid or too old");
        itest("dev", 38).given(portfolio, "1").checkEq(path, "/portfolios/1");
        itest("evosuite", 38).given(portfolio, "").checkEq(path, "/portfolios/");
        itest("randoop", 38).given(portfolio, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 38).given(portfolio, "GET").checkEq(path, "/portfolios/GET");
        itest("randoop", 38).given(portfolio, "2").checkEq(path, "/portfolios/2");
        itest("randoop", 38).given(portfolio, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 38).given(portfolio, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old");
        itest("randoop", 38).given(portfolio, "200").checkEq(path, "/portfolios/200");
        itest("randoop", 38).given(portfolio, "Server Error").checkEq(path, "/portfolios/Server Error");
        itest("randoop", 38).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 38).given(portfolio, "0").checkEq(path, "/portfolios/0");
        itest("evosuite", 38).given(portfolio, "g}.{TYH").checkEq(path, "/portfolios/g}.{TYH");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "GET");
    }

    /**
     * An existing portfolio can be updated by making a PUT request on the
     * URL for that portfolio. Only the fields provided in the `data` block will be
     * updated; any unspecified fields will remain unchanged.
     *
     * Returns the complete updated portfolio record.
     *
     * @param  portfolio The portfolio to update.
     * @return Request object
     */
    public ItemRequest<Portfolio> update(String portfolio) {
        String path = String.format("/portfolios/%s", portfolio);
        itest("randoop", 54).given(portfolio, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 54).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden");
        itest("randoop", 54).given(portfolio, "/tasks//attachments/Not Found/addProject").checkEq(path, "/portfolios//tasks//attachments/Not Found/addProject");
        itest("evosuite", 54).given(portfolio, "").checkEq(path, "/portfolios/");
        itest("evosuite", 54).given(portfolio, "/portfolios/DELETE/removeItem").checkEq(path, "/portfolios//portfolios/DELETE/removeItem");
        itest("evosuite", 54).given(portfolio, "com.github.javaparser.ast.stmt").checkEq(path, "/portfolios/com.github.javaparser.ast.stmt");
        itest("evosuite", 54).given(portfolio, null).checkEq(path, "/portfolios/null");
        itest("randoop", 54).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found");
        itest("evosuite", 54).given(portfolio, "%~$sRBCKw").checkEq(path, "/portfolios/%~$sRBCKw");
        itest("evosuite", 54).given(portfolio, "gkR;E.oR\"^\"UX").checkEq(path, "/portfolios/gkR;E.oR\"^\"UX");
        itest("randoop", 54).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 54).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 54).given(portfolio, "Payment Required").checkEq(path, "/portfolios/Payment Required");
        itest("randoop", 54).given(portfolio, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 54).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 54).given(portfolio, "").checkEq(path, "/portfolios/");
        itest("randoop", 54).given(portfolio, "10").checkEq(path, "/portfolios/10");
        itest("randoop", 54).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request");
        itest("randoop", 54).given(portfolio, "GET").checkEq(path, "/portfolios/GET");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "PUT");
    }

    /**
     * An existing portfolio can be deleted by making a DELETE request
     * on the URL for that portfolio.
     *
     * Returns an empty data record.
     *
     * @param  portfolio The portfolio to delete.
     * @return Request object
     */
    public ItemRequest<Portfolio> delete(String portfolio) {
        String path = String.format("/portfolios/%s", portfolio);
        itest("randoop", 69).given(portfolio, "100").checkEq(path, "/portfolios/100");
        itest("randoop", 69).given(portfolio, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 69).given(portfolio, "/tasks//attachments/Not Found/addProject").checkEq(path, "/portfolios//tasks//attachments/Not Found/addProject");
        itest("randoop", 69).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 69).given(portfolio, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError");
        itest("evosuite", 69).given(portfolio, "").checkEq(path, "/portfolios/");
        itest("randoop", 69).given(portfolio, "/tags").checkEq(path, "/portfolios//tags");
        itest("randoop", 69).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request");
        itest("randoop", 69).given(portfolio, "10").checkEq(path, "/portfolios/10");
        itest("randoop", 69).given(portfolio, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 69).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 69).given(portfolio, "").checkEq(path, "/portfolios/");
        itest("randoop", 69).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found");
        itest("randoop", 69).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 69).given(portfolio, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//goals/{goal_gid}/addSubgoal");
        itest("evosuite", 69).given(portfolio, "POST").checkEq(path, "/portfolios/POST");
        itest("randoop", 69).given(portfolio, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old");
        itest("randoop", 69).given(portfolio, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolios/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 69).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 69).given(portfolio, "POST").checkEq(path, "/portfolios/POST");
        itest("evosuite", 69).given(portfolio, "Yc4_ygWnpYn").checkEq(path, "/portfolios/Yc4_ygWnpYn");
        itest("evosuite", 69).given(portfolio, "VOLATILE").checkEq(path, "/portfolios/VOLATILE");
        itest("randoop", 69).given(portfolio, "Server Error").checkEq(path, "/portfolios/Server Error");
        itest("randoop", 69).given(portfolio, "GET").checkEq(path, "/portfolios/GET");
        itest("randoop", 69).given(portfolio, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "DELETE");
    }

    /**
     * Returns a list of the portfolios in compact representation that are owned
     * by the current API user.
     *
     * @return Request object
     */
    public CollectionRequest<Portfolio> findAll() {
        return new CollectionRequest<Portfolio>(this, Portfolio.class, "/portfolios", "GET");
    }

    /**
     * Get a list of the items in compact form in a portfolio.
     *
     * @param  portfolio The portfolio from which to get the list of items.
     * @return Request object
     */
    public CollectionRequest<Resource> getItems(String portfolio) {
        String path = String.format("/portfolios/%s/items", portfolio);
        itest("randoop", 92).given(portfolio, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolios/com.asana.errors.AsanaError: hi!/items");
        itest("randoop", 92).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/items");
        itest("randoop", 92).given(portfolio, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/items");
        itest("randoop", 92).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/items");
        itest("randoop", 92).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/items");
        itest("randoop", 92).given(portfolio, "/tasks/200/addProject").checkEq(path, "/portfolios//tasks/200/addProject/items");
        itest("randoop", 92).given(portfolio, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/items");
        itest("randoop", 92).given(portfolio, "hi!").checkEq(path, "/portfolios/hi!/items");
        itest("evosuite", 92).given(portfolio, "DELETE").checkEq(path, "/portfolios/DELETE/items");
        itest("randoop", 92).given(portfolio, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//portfolio_memberships//goals/{goal_gid}/addSubgoal/items");
        itest("randoop", 92).given(portfolio, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/items");
        itest("evosuite", 92).given(portfolio, "").checkEq(path, "/portfolios//items");
        itest("randoop", 92).given(portfolio, "Server Error").checkEq(path, "/portfolios/Server Error/items");
        itest("randoop", 92).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/items");
        itest("randoop", 92).given(portfolio, "POST").checkEq(path, "/portfolios/POST/items");
        itest("randoop", 92).given(portfolio, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/items");
        itest("randoop", 92).given(portfolio, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/items");
        itest("randoop", 92).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/items");
        itest("randoop", 92).given(portfolio, "Payment Required").checkEq(path, "/portfolios/Payment Required/items");
        itest("randoop", 92).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/items");
        itest("randoop", 92).given(portfolio, "200").checkEq(path, "/portfolios/200/items");
        itest("evosuite", 92).given(portfolio, "`zm8x.29_a@C").checkEq(path, "/portfolios/`zm8x.29_a@C/items");
        itest("randoop", 92).given(portfolio, "").checkEq(path, "/portfolios//items");
        itest("randoop", 92).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/items");
        itest("randoop", 92).given(portfolio, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/items");
        return new CollectionRequest<Resource>(this, Resource.class, path, "GET");
    }

    /**
     * Add an item to a portfolio.
     *
     * Returns an empty data block.
     *
     * @param  portfolio The portfolio to which to add an item.
     * @return Request object
     */
    public ItemRequest<Portfolio> addItem(String portfolio) {
        String path = String.format("/portfolios/%s/addItem", portfolio);
        itest("randoop", 106).given(portfolio, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/addItem");
        itest("randoop", 106).given(portfolio, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addItem");
        itest("randoop", 106).given(portfolio, "/custom_fields//enum_options/insert").checkEq(path, "/portfolios//custom_fields//enum_options/insert/addItem");
        itest("evosuite", 106).given(portfolio, " ;!kk=>CZ<wrA").checkEq(path, "/portfolios/ ;!kk=>CZ<wrA/addItem");
        itest("randoop", 106).given(portfolio, "").checkEq(path, "/portfolios//addItem");
        itest("randoop", 106).given(portfolio, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//portfolios//goals/{goal_gid}/subgoals/addItem");
        itest("randoop", 106).given(portfolio, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/addItem");
        itest("randoop", 106).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addItem");
        itest("randoop", 106).given(portfolio, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addItem");
        itest("randoop", 106).given(portfolio, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addItem");
        itest("evosuite", 106).given(portfolio, "Q7%4k[P7H$hUc}").checkEq(path, "/portfolios/Q7%4k[P7H$hUc}/addItem");
        itest("randoop", 106).given(portfolio, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/addItem");
        itest("randoop", 106).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addItem");
        itest("randoop", 106).given(portfolio, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addItem");
        itest("randoop", 106).given(portfolio, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolios/com.asana.errors.InvalidRequestError: Invalid Request/addItem");
        itest("randoop", 106).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/addItem");
        itest("randoop", 106).given(portfolio, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//stories//goals/{goal_gid}/addSubgoal/addItem");
        itest("evosuite", 106).given(portfolio, "/portfolios//teams/%s/users").checkEq(path, "/portfolios//portfolios//teams/%s/users/addItem");
        itest("evosuite", 106).given(portfolio, "gkR;E.oR\"^\"UX").checkEq(path, "/portfolios/gkR;E.oR\"^\"UX/addItem");
        itest("evosuite", 106).given(portfolio, "32_]prx0H").checkEq(path, "/portfolios/32_]prx0H/addItem");
        itest("randoop", 106).given(portfolio, "/tasks/GET").checkEq(path, "/portfolios//tasks/GET/addItem");
        itest("randoop", 106).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/addItem");
        itest("randoop", 106).given(portfolio, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addItem");
        itest("randoop", 106).given(portfolio, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addItem");
        itest("evosuite", 106).given(portfolio, "/workspaces/%s/tags").checkEq(path, "/portfolios//workspaces/%s/tags/addItem");
        itest("randoop", 106).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/addItem");
        itest("randoop", 106).given(portfolio, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/portfolios//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/addItem");
        itest("randoop", 106).given(portfolio, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals/addItem");
        itest("randoop", 106).given(portfolio, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//goals/{goal_gid}/addSubgoal/addItem");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST");
    }

    /**
     * Remove an item to a portfolio.
     *
     * Returns an empty data block.
     *
     * @param  portfolio The portfolio from which to remove the item.
     * @return Request object
     */
    public ItemRequest<Portfolio> removeItem(String portfolio) {
        String path = String.format("/portfolios/%s/removeItem", portfolio);
        itest("randoop", 120).given(portfolio, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required/removeItem");
        itest("randoop", 120).given(portfolio, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: Server Error/removeItem");
        itest("evosuite", 120).given(portfolio, "DELETE").checkEq(path, "/portfolios/DELETE/removeItem");
        itest("randoop", 120).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeItem");
        itest("randoop", 120).given(portfolio, "").checkEq(path, "/portfolios//removeItem");
        itest("randoop", 120).given(portfolio, "/project_statuses/Server Error").checkEq(path, "/portfolios//project_statuses/Server Error/removeItem");
        itest("randoop", 120).given(portfolio, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeItem");
        itest("randoop", 120).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeItem");
        itest("randoop", 120).given(portfolio, "/tags/Payment Required").checkEq(path, "/portfolios//tags/Payment Required/removeItem");
        itest("evosuite", 120).given(portfolio, "s*vwZ").checkEq(path, "/portfolios/s*vwZ/removeItem");
        itest("randoop", 120).given(portfolio, "/portfolios/").checkEq(path, "/portfolios//portfolios//removeItem");
        itest("randoop", 120).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/removeItem");
        itest("evosuite", 120).given(portfolio, "CHARACTER_LITERAL").checkEq(path, "/portfolios/CHARACTER_LITERAL/removeItem");
        itest("randoop", 120).given(portfolio, "GET").checkEq(path, "/portfolios/GET/removeItem");
        itest("randoop", 120).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/removeItem");
        itest("randoop", 120).given(portfolio, "POST").checkEq(path, "/portfolios/POST/removeItem");
        itest("randoop", 120).given(portfolio, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeItem");
        itest("evosuite", 120).given(portfolio, "/teams/%s/users").checkEq(path, "/portfolios//teams/%s/users/removeItem");
        itest("randoop", 120).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeItem");
        itest("randoop", 120).given(portfolio, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/removeItem");
        itest("randoop", 120).given(portfolio, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/portfolios//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/removeItem");
        itest("evosuite", 120).given(portfolio, "").checkEq(path, "/portfolios//removeItem");
        itest("evosuite", 120).given(portfolio, "BkR;1.o\"^]UX").checkEq(path, "/portfolios/BkR;1.o\"^]UX/removeItem");
        itest("evosuite", 120).given(portfolio, null).checkEq(path, "/portfolios/null/removeItem");
        itest("randoop", 120).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeItem");
        itest("randoop", 120).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/removeItem");
        itest("randoop", 120).given(portfolio, "hi!").checkEq(path, "/portfolios/hi!/removeItem");
        itest("randoop", 120).given(portfolio, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolios/com.asana.errors.AsanaError: hi!/removeItem");
        itest("evosuite", 120).given(portfolio, "POST").checkEq(path, "/portfolios/POST/removeItem");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST");
    }

    /**
     * Adds the specified list of users as members of the portfolio. Returns the updated portfolio record.
     *
     * @param  portfolio The portfolio to add members to.
     * @return Request object
     */
    public ItemRequest<Portfolio> addMembers(String portfolio) {
        String path = String.format("/portfolios/%s/addMembers", portfolio);
        itest("evosuite", 132).given(portfolio, "DWj").checkEq(path, "/portfolios/DWj/addMembers");
        itest("randoop", 132).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addMembers");
        itest("randoop", 132).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addMembers");
        itest("randoop", 132).given(portfolio, "Server Error").checkEq(path, "/portfolios/Server Error/addMembers");
        itest("randoop", 132).given(portfolio, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolios/com.asana.errors.AsanaError: hi!/addMembers");
        itest("randoop", 132).given(portfolio, "hi!").checkEq(path, "/portfolios/hi!/addMembers");
        itest("randoop", 132).given(portfolio, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required/addMembers");
        itest("randoop", 132).given(portfolio, "/projects/Not Found/removeFollowers").checkEq(path, "/portfolios//projects/Not Found/removeFollowers/addMembers");
        itest("randoop", 132).given(portfolio, "GET").checkEq(path, "/portfolios/GET/addMembers");
        itest("randoop", 132).given(portfolio, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addMembers");
        itest("randoop", 132).given(portfolio, "/projects/Rate Limit Enforced/sections").checkEq(path, "/portfolios//projects/Rate Limit Enforced/sections/addMembers");
        itest("randoop", 132).given(portfolio, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//goals/{goal_gid}/addSubgoal/addMembers");
        itest("randoop", 132).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addMembers");
        itest("randoop", 132).given(portfolio, "com.asana.errors.ServerError: Server Error").checkEq(path, "/portfolios/com.asana.errors.ServerError: Server Error/addMembers");
        itest("randoop", 132).given(portfolio, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/addMembers");
        itest("randoop", 132).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/addMembers");
        itest("randoop", 132).given(portfolio, "/portfolios/").checkEq(path, "/portfolios//portfolios//addMembers");
        itest("randoop", 132).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addMembers");
        itest("randoop", 132).given(portfolio, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/addMembers");
        itest("evosuite", 132).given(portfolio, "POST").checkEq(path, "/portfolios/POST/addMembers");
        itest("randoop", 132).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/addMembers");
        itest("randoop", 132).given(portfolio, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addMembers");
        itest("randoop", 132).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/addMembers");
        itest("randoop", 132).given(portfolio, "/tasks//attachments/Not Found/addProject").checkEq(path, "/portfolios//tasks//attachments/Not Found/addProject/addMembers");
        itest("randoop", 132).given(portfolio, "").checkEq(path, "/portfolios//addMembers");
        itest("randoop", 132).given(portfolio, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals/addMembers");
        itest("randoop", 132).given(portfolio, "POST").checkEq(path, "/portfolios/POST/addMembers");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST");
    }

    /**
     * Removes the specified list of members from the portfolio. Returns the updated portfolio record.
     *
     * @param  portfolio The portfolio to remove members from.
     * @return Request object
     */
    public ItemRequest<Portfolio> removeMembers(String portfolio) {
        String path = String.format("/portfolios/%s/removeMembers", portfolio);
        itest("randoop", 144).given(portfolio, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeMembers");
        itest("evosuite", 144).given(portfolio, "/portfolios/%s/custom_field_settings").checkEq(path, "/portfolios//portfolios/%s/custom_field_settings/removeMembers");
        itest("randoop", 144).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/removeMembers");
        itest("randoop", 144).given(portfolio, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required/removeMembers");
        itest("randoop", 144).given(portfolio, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolios/com.asana.errors.AsanaError: hi!/removeMembers");
        itest("randoop", 144).given(portfolio, "/custom_fields//enum_options/insert").checkEq(path, "/portfolios//custom_fields//enum_options/insert/removeMembers");
        itest("randoop", 144).given(portfolio, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/portfolios//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/removeMembers");
        itest("randoop", 144).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeMembers");
        itest("randoop", 144).given(portfolio, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/removeMembers");
        itest("randoop", 144).given(portfolio, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/removeMembers");
        itest("randoop", 144).given(portfolio, "Payment Required").checkEq(path, "/portfolios/Payment Required/removeMembers");
        itest("randoop", 144).given(portfolio, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/removeMembers");
        itest("randoop", 144).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/removeMembers");
        itest("randoop", 144).given(portfolio, "hi!").checkEq(path, "/portfolios/hi!/removeMembers");
        itest("randoop", 144).given(portfolio, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/removeMembers");
        itest("randoop", 144).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/removeMembers");
        itest("randoop", 144).given(portfolio, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//portfolio_memberships//goals/{goal_gid}/addSubgoal/removeMembers");
        itest("evosuite", 144).given(portfolio, "gkR;1.ox\"^]UX").checkEq(path, "/portfolios/gkR;1.ox\"^]UX/removeMembers");
        itest("randoop", 144).given(portfolio, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/removeMembers");
        itest("evosuite", 144).given(portfolio, "").checkEq(path, "/portfolios//removeMembers");
        itest("randoop", 144).given(portfolio, "Server Error").checkEq(path, "/portfolios/Server Error/removeMembers");
        itest("randoop", 144).given(portfolio, "").checkEq(path, "/portfolios//removeMembers");
        itest("randoop", 144).given(portfolio, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeMembers");
        itest("randoop", 144).given(portfolio, "GET").checkEq(path, "/portfolios/GET/removeMembers");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST");
    }

    /**
     * Get the custom field settings on a portfolio.
     *
     * @param  portfolio The portfolio from which to get the custom field settings.
     * @return Request object
     */
    public CollectionRequest<Portfolio> customFieldSettings(String portfolio) {
        String path = String.format("/portfolios/%s/custom_field_settings", portfolio);
        itest("randoop", 156).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/custom_field_settings");
        itest("randoop", 156).given(portfolio, "0").checkEq(path, "/portfolios/0/custom_field_settings");
        itest("randoop", 156).given(portfolio, "10").checkEq(path, "/portfolios/10/custom_field_settings");
        itest("randoop", 156).given(portfolio, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/custom_field_settings");
        itest("randoop", 156).given(portfolio, "Server Error").checkEq(path, "/portfolios/Server Error/custom_field_settings");
        itest("randoop", 156).given(portfolio, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/custom_field_settings");
        itest("randoop", 156).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/custom_field_settings");
        itest("randoop", 156).given(portfolio, "").checkEq(path, "/portfolios//custom_field_settings");
        itest("randoop", 156).given(portfolio, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolios/com.asana.errors.AsanaError: hi!/custom_field_settings");
        itest("randoop", 156).given(portfolio, "POST").checkEq(path, "/portfolios/POST/custom_field_settings");
        itest("randoop", 156).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/custom_field_settings");
        itest("randoop", 156).given(portfolio, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/custom_field_settings");
        itest("randoop", 156).given(portfolio, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//goals/{goal_gid}/addSubgoal/custom_field_settings");
        itest("randoop", 156).given(portfolio, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/custom_field_settings");
        itest("randoop", 156).given(portfolio, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//portfolios//goals/{goal_gid}/subgoals/custom_field_settings");
        itest("randoop", 156).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/custom_field_settings");
        itest("randoop", 156).given(portfolio, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/custom_field_settings");
        itest("evosuite", 156).given(portfolio, "$QEy?635s+$%qRD369").checkEq(path, "/portfolios/$QEy?635s+$%qRD369/custom_field_settings");
        itest("randoop", 156).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/custom_field_settings");
        itest("randoop", 156).given(portfolio, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/custom_field_settings");
        itest("evosuite", 156).given(portfolio, "/portfolios/32_]prx0H/addItem").checkEq(path, "/portfolios//portfolios/32_]prx0H/addItem/custom_field_settings");
        itest("randoop", 156).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/custom_field_settings");
        itest("randoop", 156).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/custom_field_settings");
        itest("randoop", 156).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/custom_field_settings");
        return new CollectionRequest<Portfolio>(this, Portfolio.class, path, "GET");
    }

    /**
     * Create a new custom field setting on the portfolio. Returns the full
     * record for the new custom field setting.
     *
     * @param  portfolio The portfolio onto which to add the custom field.
     * @return Request object
     */
    public ItemRequest<Portfolio> addCustomFieldSetting(String portfolio) {
        String path = String.format("/portfolios/%s/addCustomFieldSetting", portfolio);
        itest("randoop", 169).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/addCustomFieldSetting");
        itest("evosuite", 169).given(portfolio, "gkR;E.oR\"^\"UX").checkEq(path, "/portfolios/gkR;E.oR\"^\"UX/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: 200/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "/organizations//teams").checkEq(path, "/portfolios//organizations//teams/addCustomFieldSetting");
        itest("evosuite", 169).given(portfolio, null).checkEq(path, "/portfolios/null/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "/tasks//attachments/Not Found/addProject").checkEq(path, "/portfolios//tasks//attachments/Not Found/addProject/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "").checkEq(path, "/portfolios//addCustomFieldSetting");
        itest("evosuite", 169).given(portfolio, "MEa'b:XN[rY>| '%C").checkEq(path, "/portfolios/MEa'b:XN[rY>| '%C/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "GET").checkEq(path, "/portfolios/GET/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "10").checkEq(path, "/portfolios/10/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "POST").checkEq(path, "/portfolios/POST/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "200").checkEq(path, "/portfolios/200/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "/webhooks/NoAuthorizationError").checkEq(path, "/portfolios//webhooks/NoAuthorizationError/addCustomFieldSetting");
        itest("evosuite", 169).given(portfolio, "NQjr\"").checkEq(path, "/portfolios/NQjr\"/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "hi!").checkEq(path, "/portfolios/hi!/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolios/com.asana.errors.AsanaError: hi!/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "Server Error").checkEq(path, "/portfolios/Server Error/addCustomFieldSetting");
        itest("randoop", 169).given(portfolio, "Payment Required").checkEq(path, "/portfolios/Payment Required/addCustomFieldSetting");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST");
    }

    /**
     * Remove a custom field setting on the portfolio. Returns an empty data
     * block.
     *
     * @param  portfolio The portfolio from which to remove the custom field.
     * @return Request object
     */
    public ItemRequest<Portfolio> removeCustomFieldSetting(String portfolio) {
        String path = String.format("/portfolios/%s/removeCustomFieldSetting", portfolio);
        itest("randoop", 182).given(portfolio, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: Server Error/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "hi!").checkEq(path, "/portfolios/hi!/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "0").checkEq(path, "/portfolios/0/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeCustomFieldSetting");
        itest("evosuite", 182).given(portfolio, "gkR;E.oR\"^\"bUX").checkEq(path, "/portfolios/gkR;E.oR\"^\"bUX/removeCustomFieldSetting");
        itest("evosuite", 182).given(portfolio, "/portfolios/OR/removeItem").checkEq(path, "/portfolios//portfolios/OR/removeItem/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "/tags").checkEq(path, "/portfolios//tags/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: 200/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "Payment Required").checkEq(path, "/portfolios/Payment Required/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "POST").checkEq(path, "/portfolios/POST/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeCustomFieldSetting");
        itest("randoop", 182).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/removeCustomFieldSetting");
        itest("evosuite", 182).given(portfolio, null).checkEq(path, "/portfolios/null/removeCustomFieldSetting");
        itest("evosuite", 182).given(portfolio, "assignee.not").checkEq(path, "/portfolios/assignee.not/removeCustomFieldSetting");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST");
    }
}
