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
        itest("dev", 38).given(portfolio, "1").checkEq(path, "/portfolios/1");
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
        itest("evosuite", 54).given(portfolio, "").checkEq(path, "/portfolios/");
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
        itest("evosuite", 69).given(portfolio, "Yc4_ygWnpYn").checkEq(path, "/portfolios/Yc4_ygWnpYn");
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
        itest("evosuite", 92).given(portfolio, "`zm8x.29_a@C").checkEq(path, "/portfolios/`zm8x.29_a@C/items");
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
        itest("evosuite", 106).given(portfolio, " ;!kk=>CZ<wrA").checkEq(path, "/portfolios/ ;!kk=>CZ<wrA/addItem");
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
        itest("evosuite", 120).given(portfolio, null).checkEq(path, "/portfolios/null/removeItem");
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
        itest("evosuite", 132).given(portfolio, "POST").checkEq(path, "/portfolios/POST/addMembers");
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
        itest("evosuite", 144).given(portfolio, "/portfolios/%s/custom_field_settings").checkEq(path, "/portfolios//portfolios/%s/custom_field_settings/removeMembers");
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
        itest("evosuite", 156).given(portfolio, "/portfolios/32_]prx0H/addItem").checkEq(path, "/portfolios//portfolios/32_]prx0H/addItem/custom_field_settings");
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
        itest("evosuite", 169).given(portfolio, "NQjr\"").checkEq(path, "/portfolios/NQjr\"/addCustomFieldSetting");
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
        itest("evosuite", 182).given(portfolio, "/portfolios/OR/removeItem").checkEq(path, "/portfolios//portfolios/OR/removeItem/removeCustomFieldSetting");
        return new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST");
    }
}
