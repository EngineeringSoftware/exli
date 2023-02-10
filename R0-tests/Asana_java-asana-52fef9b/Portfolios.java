package com.asana.resources;

import com.asana.Client;
import com.asana.models.Portfolio;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.PortfoliosBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 38).given(portfolio, "").checkEq(path, "/portfolios/");
        new Here("Unit", 38).given(portfolio, "1").checkEq(path, "/portfolios/1");
        new Here("Randoop", 38).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found");
        new Here("Randoop", 38).given(portfolio, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced");
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
        new Here("Randoop", 54).given(portfolio, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced");
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
        new Here("Randoop", 69).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Invalid%20Request").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Invalid%20Request");
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
        new Here("Randoop", 92).given(portfolio, "").checkEq(path, "/portfolios//items");
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
        new Here("Randoop", 106).given(portfolio, "/tasks/Not Found/removeProject").checkEq(path, "/portfolios//tasks/Not Found/removeProject/addItem");
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
        new Here("Randoop", 120).given(portfolio, "200").checkEq(path, "/portfolios/200/removeItem");
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
        new Here("Randoop", 132).given(portfolio, "").checkEq(path, "/portfolios//addMembers");
        new Here("Randoop", 132).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error/addMembers");
        new Here("Randoop", 132).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/addMembers");
        new Here("Randoop", 132).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/addMembers");
        new Here("Randoop", 132).given(portfolio, "Server Error").checkEq(path, "/portfolios/Server Error/addMembers");
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
        new Here("Randoop", 144).given(portfolio, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolios/com.asana.errors.InvalidRequestError: Invalid Request/removeMembers");
        new Here("Randoop", 144).given(portfolio, "200").checkEq(path, "/portfolios/200/removeMembers");
        new Here("Randoop", 144).given(portfolio, "/tasks/Not Found/removeProject").checkEq(path, "/portfolios//tasks/Not Found/removeProject/removeMembers");
        new Here("Randoop", 144).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/removeMembers");
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
        new Here("Randoop", 156).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/custom_field_settings");
        new Here("Randoop", 156).given(portfolio, "com.asana.errors.RetryableAsanaError: Not Found").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: Not Found/custom_field_settings");
        new Here("Randoop", 156).given(portfolio, "GET").checkEq(path, "/portfolios/GET/custom_field_settings");
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
        new Here("Randoop", 169).given(portfolio, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addCustomFieldSetting");
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
        new Here("Randoop", 182).given(portfolio, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolios/com.asana.errors.InvalidRequestError: Invalid Request/removeCustomFieldSetting");
        new Here("Randoop", 182).given(portfolio, "DELETE").checkEq(path, "/portfolios/DELETE/removeCustomFieldSetting");
        new Here("Randoop", 182).given(portfolio, "").checkEq(path, "/portfolios//removeCustomFieldSetting");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST");
    }
}
