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

public class PortfoliosBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public PortfoliosBase(Client client) {
        super(client);
    }

    /**
     * Add a custom field to a portfolio
     * Custom fields are associated with portfolios by way of custom field settings.  This method creates a setting for the portfolio.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addCustomFieldSettingForPortfolio(String portfolioGid, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/addCustomFieldSetting".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 30).given(portfolioGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//portfolio_memberships//goals/{goal_gid}/addSubgoal/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//goals/{goal_gid}/addSubgoal/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addCustomFieldSetting");
        itest("evosuite", 30).given(portfolioGid, "").checkEq(path, "/portfolios//addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolios/com.asana.errors.InvalidRequestError: Invalid Request/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "POST").checkEq(path, "/portfolios/POST/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/webhooks/NoAuthorizationError").checkEq(path, "/portfolios//webhooks/NoAuthorizationError/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/addCustomFieldSetting");
        itest("evosuite", 30).given(portfolioGid, "MS7]YGk#l").checkEq(path, "/portfolios/MS7]YGk#l/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "Forbidden").checkEq(path, "/portfolios/Forbidden/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "").checkEq(path, "/portfolios//addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/custom_fields//enum_options/insert").checkEq(path, "/portfolios//custom_fields//enum_options/insert/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/portfolios//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/portfolios//projects/Rate Limit Enforced/sections/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "10").checkEq(path, "/portfolios/10/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: 200/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "hi!").checkEq(path, "/portfolios/hi!/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/tags").checkEq(path, "/portfolios//tags/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/workspaces/").checkEq(path, "/portfolios//workspaces//addCustomFieldSetting");
        itest("evosuite", 30).given(portfolioGid, "/portfolios/workspace").checkEq(path, "/portfolios//portfolios/workspace/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "200").checkEq(path, "/portfolios/200/addCustomFieldSetting");
        itest("evosuite", 30).given(portfolioGid, "5p,kSO)dlw'u+").checkEq(path, "/portfolios/5p,kSO)dlw'u+/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: /portfolios//addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "0").checkEq(path, "/portfolios/0/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "Payment Required").checkEq(path, "/portfolios/Payment Required/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: Server Error/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "/tasks/200/addProject").checkEq(path, "/portfolios//tasks/200/addProject/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/addCustomFieldSetting");
        itest("randoop", 30).given(portfolioGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addCustomFieldSetting");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty);
        return req;
    }

    public ItemRequest<JsonElement> addCustomFieldSettingForPortfolio(String portfolioGid) throws IOException {
        return addCustomFieldSettingForPortfolio(portfolioGid, false);
    }

    /**
     * Add a portfolio item
     * Add an item to a portfolio. Returns an empty data block.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addItemForPortfolio(String portfolioGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/addItem".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 51).given(portfolioGid, "Payment Required").checkEq(path, "/portfolios/Payment Required/addItem");
        itest("randoop", 51).given(portfolioGid, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/addItem");
        itest("randoop", 51).given(portfolioGid, "/portfolios/Rate Limit Enforced/portfolio_memberships").checkEq(path, "/portfolios//portfolios/Rate Limit Enforced/portfolio_memberships/addItem");
        itest("randoop", 51).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addItem");
        itest("randoop", 51).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addItem");
        itest("randoop", 51).given(portfolioGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/addItem");
        itest("randoop", 51).given(portfolioGid, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/addItem");
        itest("evosuite", 51).given(portfolioGid, "tMc$#EP07{k^krqU").checkEq(path, "/portfolios/tMc$#EP07{k^krqU/addItem");
        itest("randoop", 51).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addItem");
        itest("evosuite", 51).given(portfolioGid, "gKwT=,1O").checkEq(path, "/portfolios/gKwT=,1O/addItem");
        itest("randoop", 51).given(portfolioGid, "/tags").checkEq(path, "/portfolios//tags/addItem");
        itest("evosuite", 51).given(portfolioGid, "").checkEq(path, "/portfolios//addItem");
        itest("randoop", 51).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/addItem");
        itest("randoop", 51).given(portfolioGid, "POST").checkEq(path, "/portfolios/POST/addItem");
        itest("randoop", 51).given(portfolioGid, "200").checkEq(path, "/portfolios/200/addItem");
        itest("evosuite", 51).given(portfolioGid, "{section_gid}").checkEq(path, "/portfolios/{section_gid}/addItem");
        itest("randoop", 51).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found/addItem");
        itest("evosuite", 51).given(portfolioGid, "/portfolios").checkEq(path, "/portfolios//portfolios/addItem");
        itest("randoop", 51).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/addItem");
        itest("evosuite", 51).given(portfolioGid, "/portfolios/,/ecB4mZB8,BjGF").checkEq(path, "/portfolios//portfolios/,/ecB4mZB8,BjGF/addItem");
        itest("randoop", 51).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addItem");
        itest("randoop", 51).given(portfolioGid, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/portfolios//workspaces//goals/{goal_gid}/subgoals/tasks/addItem");
        itest("randoop", 51).given(portfolioGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolios/com.asana.errors.AsanaError: hi!/addItem");
        itest("randoop", 51).given(portfolioGid, "10").checkEq(path, "/portfolios/10/addItem");
        itest("randoop", 51).given(portfolioGid, "0").checkEq(path, "/portfolios/0/addItem");
        itest("randoop", 51).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addItem");
        itest("randoop", 51).given(portfolioGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/addItem");
        itest("evosuite", 51).given(portfolioGid, "g7Y~").checkEq(path, "/portfolios/g7Y~/addItem");
        itest("randoop", 51).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/addItem");
        itest("randoop", 51).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found/addItem");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addItemForPortfolio(String portfolioGid) throws IOException {
        return addItemForPortfolio(portfolioGid, null, false);
    }

    /**
     * Add users to a portfolio
     * Adds the specified list of users as members of the portfolio. Returns the updated portfolio record.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> addMembersForPortfolio(String portfolioGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/addMembers".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 73).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/addMembers");
        itest("evosuite", 73).given(portfolioGid, "/portfolios/{portfolio_gid}/addItNm").checkEq(path, "/portfolios//portfolios/{portfolio_gid}/addItNm/addMembers");
        itest("randoop", 73).given(portfolioGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: 200/addMembers");
        itest("randoop", 73).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/addMembers");
        itest("randoop", 73).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addMembers");
        itest("randoop", 73).given(portfolioGid, "POST").checkEq(path, "/portfolios/POST/addMembers");
        itest("randoop", 73).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found/addMembers");
        itest("randoop", 73).given(portfolioGid, "/tags").checkEq(path, "/portfolios//tags/addMembers");
        itest("randoop", 73).given(portfolioGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: /portfolios//addMembers");
        itest("randoop", 73).given(portfolioGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/addMembers");
        itest("randoop", 73).given(portfolioGid, "/workspaces/").checkEq(path, "/portfolios//workspaces//addMembers");
        itest("randoop", 73).given(portfolioGid, "Payment Required").checkEq(path, "/portfolios/Payment Required/addMembers");
        itest("randoop", 73).given(portfolioGid, "/portfolios/").checkEq(path, "/portfolios//portfolios//addMembers");
        itest("randoop", 73).given(portfolioGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//portfolios//goals/{goal_gid}/subgoals/addMembers");
        itest("randoop", 73).given(portfolioGid, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/addMembers");
        itest("randoop", 73).given(portfolioGid, "0").checkEq(path, "/portfolios/0/addMembers");
        itest("randoop", 73).given(portfolioGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/addMembers");
        itest("randoop", 73).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/addMembers");
        itest("randoop", 73).given(portfolioGid, "").checkEq(path, "/portfolios//addMembers");
        itest("evosuite", 73).given(portfolioGid, "&!vff-b(1SX").checkEq(path, "/portfolios/&!vff-b(1SX/addMembers");
        itest("randoop", 73).given(portfolioGid, "100").checkEq(path, "/portfolios/100/addMembers");
        itest("randoop", 73).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addMembers");
        itest("randoop", 73).given(portfolioGid, "/projects/Not Found/removeFollowers").checkEq(path, "/portfolios//projects/Not Found/removeFollowers/addMembers");
        itest("randoop", 73).given(portfolioGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/portfolios//tasks//attachments/Not Found/addProject/addMembers");
        itest("randoop", 73).given(portfolioGid, "/organizations//teams").checkEq(path, "/portfolios//organizations//teams/addMembers");
        itest("randoop", 73).given(portfolioGid, "GET").checkEq(path, "/portfolios/GET/addMembers");
        itest("randoop", 73).given(portfolioGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolios/com.asana.errors.InvalidRequestError: Invalid Request/addMembers");
        itest("randoop", 73).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addMembers");
        itest("randoop", 73).given(portfolioGid, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/addMembers");
        itest("randoop", 73).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/addMembers");
        itest("evosuite", 73).given(portfolioGid, "").checkEq(path, "/portfolios//addMembers");
        itest("randoop", 73).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error/addMembers");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> addMembersForPortfolio(String portfolioGid) throws IOException {
        return addMembersForPortfolio(portfolioGid, null, false);
    }

    /**
     * Create a portfolio
     * Creates a new portfolio in the given workspace with the supplied name.  Note that portfolios created in the Asana UI may have some state (like the “Priority” custom field) which is automatically added to the portfolio when it is created. Portfolios created via our API will *not* be created with the same initial state to allow integrations to create their own starting state on a portfolio.
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Portfolio)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Portfolio> createPortfolio(List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios";
        ItemRequest<Portfolio> req = new ItemRequest<Portfolio>(this, Portfolio.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Portfolio> createPortfolio() throws IOException {
        return createPortfolio(null, false);
    }

    /**
     * Delete a portfolio
     * An existing portfolio can be deleted by making a DELETE request on the URL for that portfolio.  Returns an empty data record.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deletePortfolio(String portfolioGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 116).given(portfolioGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 116).given(portfolioGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 116).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("evosuite", 116).given(portfolioGid, "abE #z0S9$Qxst").checkEq(path, "/portfolios/abE #z0S9$Qxst");
        itest("evosuite", 116).given(portfolioGid, "/teams/%s/users").checkEq(path, "/portfolios//teams/%s/users");
        itest("randoop", 116).given(portfolioGid, "-1").checkEq(path, "/portfolios/-1");
        itest("randoop", 116).given(portfolioGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/portfolios//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 116).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 116).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 116).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 116).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 116).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert");
        itest("randoop", 116).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request");
        itest("randoop", 116).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced");
        itest("randoop", 116).given(portfolioGid, "Payment Required").checkEq(path, "/portfolios/Payment Required");
        itest("randoop", 116).given(portfolioGid, "").checkEq(path, "/portfolios/");
        itest("evosuite", 116).given(portfolioGid, "j`/>mH").checkEq(path, "/portfolios/j`/>mH");
        itest("randoop", 116).given(portfolioGid, "/tags").checkEq(path, "/portfolios//tags");
        itest("randoop", 116).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 116).given(portfolioGid, "&").checkEq(path, "/portfolios/&");
        itest("randoop", 116).given(portfolioGid, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old");
        itest("evosuite", 116).given(portfolioGid, ",/ecB4mZB8,BjGF").checkEq(path, "/portfolios/,/ecB4mZB8,BjGF");
        itest("randoop", 116).given(portfolioGid, "GET").checkEq(path, "/portfolios/GET");
        itest("randoop", 116).given(portfolioGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 116).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found");
        itest("evosuite", 116).given(portfolioGid, "KZ{-K/B[)DA>\"").checkEq(path, "/portfolios/KZ{-K/B[)DA>\"");
        itest("evosuite", 116).given(portfolioGid, "p+7-ppqeQ@V").checkEq(path, "/portfolios/p+7-ppqeQ@V");
        itest("randoop", 116).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 116).given(portfolioGid, "C5f\"=bP").checkEq(path, "/portfolios/C5f\"=bP");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deletePortfolio(String portfolioGid) throws IOException {
        return deletePortfolio(portfolioGid, null, false);
    }

    /**
     * Get portfolio items
     * Get a list of the items in compact form in a portfolio.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Project)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Project> getItemsForPortfolio(String portfolioGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/items".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/items");
        itest("randoop", 140).given(portfolioGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/items");
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/items");
        itest("randoop", 140).given(portfolioGid, "100").checkEq(path, "/portfolios/100/items");
        itest("randoop", 140).given(portfolioGid, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: Server Error/items");
        itest("evosuite", 140).given(portfolioGid, "t?Ks%WO]zQ]Pk").checkEq(path, "/portfolios/t?Ks%WO]zQ]Pk/items");
        itest("randoop", 140).given(portfolioGid, "POST").checkEq(path, "/portfolios/POST/items");
        itest("randoop", 140).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/items");
        itest("evosuite", 140).given(portfolioGid, "").checkEq(path, "/portfolios//items");
        itest("randoop", 140).given(portfolioGid, "Forbidden").checkEq(path, "/portfolios/Forbidden/items");
        itest("evosuite", 140).given(portfolioGid, "=ciN_ZzYv").checkEq(path, "/portfolios/=ciN_ZzYv/items");
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/items");
        itest("randoop", 140).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/items");
        itest("randoop", 140).given(portfolioGid, "").checkEq(path, "/portfolios//items");
        itest("randoop", 140).given(portfolioGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/items");
        itest("randoop", 140).given(portfolioGid, "/tags/Payment Required").checkEq(path, "/portfolios//tags/Payment Required/items");
        itest("randoop", 140).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found/items");
        itest("randoop", 140).given(portfolioGid, "GET").checkEq(path, "/portfolios/GET/items");
        itest("randoop", 140).given(portfolioGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/items");
        itest("randoop", 140).given(portfolioGid, "/webhooks/NoAuthorizationError").checkEq(path, "/portfolios//webhooks/NoAuthorizationError/items");
        itest("randoop", 140).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/items");
        itest("randoop", 140).given(portfolioGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//portfolios//goals/{goal_gid}/subgoals/items");
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/items");
        itest("randoop", 140).given(portfolioGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: 200/items");
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/items");
        itest("randoop", 140).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/items");
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/items");
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/items");
        itest("randoop", 140).given(portfolioGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/portfolios//projects/Rate Limit Enforced/sections/items");
        itest("randoop", 140).given(portfolioGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals/items");
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/items");
        itest("evosuite", 140).given(portfolioGid, "%s is not AnnotationExpr, it is %s").checkEq(path, "/portfolios/%s is not AnnotationExpr, it is %s/items");
        itest("randoop", 140).given(portfolioGid, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/items");
        itest("randoop", 140).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/items");
        itest("randoop", 140).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error/items");
        CollectionRequest<Project> req = new CollectionRequest<Project>(this, Project.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Project> getItemsForPortfolio(String portfolioGid) throws IOException {
        return getItemsForPortfolio(portfolioGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get a portfolio
     * Returns the complete portfolio record for a single portfolio.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Portfolio)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Portfolio> getPortfolio(String portfolioGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 164).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 164).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 164).given(portfolioGid, "{section_gid}").checkEq(path, "/portfolios/{section_gid}");
        itest("randoop", 164).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("evosuite", 164).given(portfolioGid, "/portfolios//portfolios/#pZ#rJ/removeMembers").checkEq(path, "/portfolios//portfolios//portfolios/#pZ#rJ/removeMembers");
        itest("evosuite", 164).given(portfolioGid, "=~~k>6*Un O-U1~^m',").checkEq(path, "/portfolios/=~~k>6*Un O-U1~^m',");
        itest("randoop", 164).given(portfolioGid, "0").checkEq(path, "/portfolios/0");
        itest("evosuite", 164).given(portfolioGid, "").checkEq(path, "/portfolios/");
        itest("randoop", 164).given(portfolioGid, "/tasks//attachments/Not Found/addProject").checkEq(path, "/portfolios//tasks//attachments/Not Found/addProject");
        itest("randoop", 164).given(portfolioGid, "10").checkEq(path, "/portfolios/10");
        itest("randoop", 164).given(portfolioGid, "hi!").checkEq(path, "/portfolios/hi!");
        itest("randoop", 164).given(portfolioGid, "/projects/Not Found/removeFollowers").checkEq(path, "/portfolios//projects/Not Found/removeFollowers");
        itest("randoop", 164).given(portfolioGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolios/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 164).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error");
        itest("evosuite", 164).given(portfolioGid, "/portfolios").checkEq(path, "/portfolios//portfolios");
        itest("randoop", 164).given(portfolioGid, "/tags").checkEq(path, "/portfolios//tags");
        itest("evosuite", 164).given(portfolioGid, "ExplicitConstructorInvocationStmt").checkEq(path, "/portfolios/ExplicitConstructorInvocationStmt");
        itest("randoop", 164).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 164).given(portfolioGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 164).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("evosuite", 164).given(portfolioGid, "0-<5Ts*x(P\"vb0").checkEq(path, "/portfolios/0-<5Ts*x(P\"vb0");
        itest("randoop", 164).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request");
        itest("randoop", 164).given(portfolioGid, "").checkEq(path, "/portfolios/");
        itest("randoop", 164).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 164).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError");
        itest("randoop", 164).given(portfolioGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 164).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found");
        itest("randoop", 164).given(portfolioGid, "Forbidden").checkEq(path, "/portfolios/Forbidden");
        itest("randoop", 164).given(portfolioGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 164).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 164).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 164).given(portfolioGid, "Payment Required").checkEq(path, "/portfolios/Payment Required");
        itest("randoop", 164).given(portfolioGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolios/com.asana.errors.AsanaError: hi!");
        itest("randoop", 164).given(portfolioGid, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found");
        itest("evosuite", 164).given(portfolioGid, "/portfolios/#pZ#rJ/removeMembers").checkEq(path, "/portfolios//portfolios/#pZ#rJ/removeMembers");
        itest("evosuite", 164).given(portfolioGid, "w\"i%").checkEq(path, "/portfolios/w\"i%");
        ItemRequest<Portfolio> req = new ItemRequest<Portfolio>(this, Portfolio.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Portfolio> getPortfolio(String portfolioGid) throws IOException {
        return getPortfolio(portfolioGid, null, false);
    }

    /**
     * Get multiple portfolios
     * Returns a list of the portfolios in compact representation that are owned by the current API user.
     * @param owner The user who owns the portfolio. Currently, API users can only get a list of portfolios that they themselves own. (required)
     * @param workspace The workspace or organization to filter portfolios on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Portfolio)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Portfolio> getPortfolios(String owner, String workspace, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios";
        CollectionRequest<Portfolio> req = new CollectionRequest<Portfolio>(this, Portfolio.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset).query("workspace", workspace).query("owner", owner);
        return req;
    }

    public CollectionRequest<Portfolio> getPortfolios(String owner, String workspace) throws IOException {
        return getPortfolios(owner, workspace, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Remove a custom field from a portfolio
     * Removes a custom field setting from a portfolio.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeCustomFieldSettingForPortfolio(String portfolioGid, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/removeCustomFieldSetting".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 214).given(portfolioGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//stories//goals/{goal_gid}/addSubgoal/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/tags/Payment Required").checkEq(path, "/portfolios//tags/Payment Required/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "0").checkEq(path, "/portfolios/0/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=GET&redirect_uri=Invalid%20Request&response_type=code&state=/tasks/200/addProject/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "hi!").checkEq(path, "/portfolios/hi!/removeCustomFieldSetting");
        itest("evosuite", 214).given(portfolioGid, "").checkEq(path, "/portfolios//removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//goals/{goal_gid}/addSubgoal/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/projects/Not Found/removeFollowers").checkEq(path, "/portfolios//projects/Not Found/removeFollowers/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces//removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeCustomFieldSetting");
        itest("evosuite", 214).given(portfolioGid, "'WcJt,u").checkEq(path, "/portfolios/'WcJt,u/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/tasks/200/addProject").checkEq(path, "/portfolios//tasks/200/addProject/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "Forbidden").checkEq(path, "/portfolios/Forbidden/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "POST").checkEq(path, "/portfolios/POST/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/workspaces/").checkEq(path, "/portfolios//workspaces//removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "10").checkEq(path, "/portfolios/10/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/portfolios/").checkEq(path, "/portfolios//portfolios//removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolios/com.asana.errors.InvalidRequestError: Invalid Request/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "").checkEq(path, "/portfolios//removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: 200/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "GET").checkEq(path, "/portfolios/GET/removeCustomFieldSetting");
        itest("evosuite", 214).given(portfolioGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/removeCustomFieldSetting");
        itest("randoop", 214).given(portfolioGid, "/tags").checkEq(path, "/portfolios//tags/removeCustomFieldSetting");
        itest("evosuite", 214).given(portfolioGid, "Y_;,Vz,Jh=.y+").checkEq(path, "/portfolios/Y_;,Vz,Jh=.y+/removeCustomFieldSetting");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty);
        return req;
    }

    public ItemRequest<JsonElement> removeCustomFieldSettingForPortfolio(String portfolioGid) throws IOException {
        return removeCustomFieldSettingForPortfolio(portfolioGid, false);
    }

    /**
     * Remove a portfolio item
     * Remove an item from a portfolio. Returns an empty data block.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeItemForPortfolio(String portfolioGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/removeItem".replace("{portfolio_gid}", portfolioGid);
        itest("evosuite", 235).given(portfolioGid, "/portfolios/&!vff-b(1SX/addMembers").checkEq(path, "/portfolios//portfolios/&!vff-b(1SX/addMembers/removeItem");
        itest("randoop", 235).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found/removeItem");
        itest("evosuite", 235).given(portfolioGid, "{portfolio_gid}").checkEq(path, "/portfolios/{portfolio_gid}/removeItem");
        itest("randoop", 235).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeItem");
        itest("randoop", 235).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/removeItem");
        itest("randoop", 235).given(portfolioGid, "Payment Required").checkEq(path, "/portfolios/Payment Required/removeItem");
        itest("randoop", 235).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/removeItem");
        itest("randoop", 235).given(portfolioGid, "200").checkEq(path, "/portfolios/200/removeItem");
        itest("evosuite", 235).given(portfolioGid, "@V").checkEq(path, "/portfolios/@V/removeItem");
        itest("randoop", 235).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/removeItem");
        itest("randoop", 235).given(portfolioGid, "").checkEq(path, "/portfolios//removeItem");
        itest("randoop", 235).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeItem");
        itest("randoop", 235).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/removeItem");
        itest("evosuite", 235).given(portfolioGid, "OR").checkEq(path, "/portfolios/OR/removeItem");
        itest("randoop", 235).given(portfolioGid, "/workspaces/").checkEq(path, "/portfolios//workspaces//removeItem");
        itest("randoop", 235).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//removeItem");
        itest("randoop", 235).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/removeItem");
        itest("randoop", 235).given(portfolioGid, "GET").checkEq(path, "/portfolios/GET/removeItem");
        itest("randoop", 235).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeItem");
        itest("evosuite", 235).given(portfolioGid, "lG=xn#rx9pJ8W").checkEq(path, "/portfolios/lG=xn#rx9pJ8W/removeItem");
        itest("randoop", 235).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/removeItem");
        itest("randoop", 235).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/removeItem");
        itest("evosuite", 235).given(portfolioGid, "7CS").checkEq(path, "/portfolios/7CS/removeItem");
        itest("randoop", 235).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/removeItem");
        itest("randoop", 235).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error/removeItem");
        itest("randoop", 235).given(portfolioGid, "10").checkEq(path, "/portfolios/10/removeItem");
        itest("randoop", 235).given(portfolioGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/portfolios//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/removeItem");
        itest("randoop", 235).given(portfolioGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeItem");
        itest("randoop", 235).given(portfolioGid, "POST").checkEq(path, "/portfolios/POST/removeItem");
        itest("randoop", 235).given(portfolioGid, "/custom_fields//enum_options/insert").checkEq(path, "/portfolios//custom_fields//enum_options/insert/removeItem");
        itest("randoop", 235).given(portfolioGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals/removeItem");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeItemForPortfolio(String portfolioGid) throws IOException {
        return removeItemForPortfolio(portfolioGid, null, false);
    }

    /**
     * Remove users from a portfolio
     * Removes the specified list of users from members of the portfolio. Returns the updated portfolio record.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> removeMembersForPortfolio(String portfolioGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/removeMembers".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 257).given(portfolioGid, "POST").checkEq(path, "/portfolios/POST/removeMembers");
        itest("randoop", 257).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//removeMembers");
        itest("randoop", 257).given(portfolioGid, "200").checkEq(path, "/portfolios/200/removeMembers");
        itest("randoop", 257).given(portfolioGid, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/removeMembers");
        itest("randoop", 257).given(portfolioGid, "/portfolios/").checkEq(path, "/portfolios//portfolios//removeMembers");
        itest("randoop", 257).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/removeMembers");
        itest("randoop", 257).given(portfolioGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeMembers");
        itest("randoop", 257).given(portfolioGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/removeMembers");
        itest("randoop", 257).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/removeMembers");
        itest("randoop", 257).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/removeMembers");
        itest("randoop", 257).given(portfolioGid, "").checkEq(path, "/portfolios//removeMembers");
        itest("randoop", 257).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/removeMembers");
        itest("evosuite", 257).given(portfolioGid, "_+Gl.LVG376&H%NO;").checkEq(path, "/portfolios/_+Gl.LVG376&H%NO;/removeMembers");
        itest("randoop", 257).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/removeMembers");
        itest("randoop", 257).given(portfolioGid, "/goals/Sync token invalid or too old").checkEq(path, "/portfolios//goals/Sync token invalid or too old/removeMembers");
        itest("randoop", 257).given(portfolioGid, "2").checkEq(path, "/portfolios/2/removeMembers");
        itest("randoop", 257).given(portfolioGid, "hi!").checkEq(path, "/portfolios/hi!/removeMembers");
        itest("evosuite", 257).given(portfolioGid, "/portfolios/t?Ks%WO]zQ]Pk/items").checkEq(path, "/portfolios//portfolios/t?Ks%WO]zQ]Pk/items/removeMembers");
        itest("randoop", 257).given(portfolioGid, "Sync token invalid or too old").checkEq(path, "/portfolios/Sync token invalid or too old/removeMembers");
        itest("randoop", 257).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/removeMembers");
        itest("randoop", 257).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error/removeMembers");
        itest("randoop", 257).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found/removeMembers");
        itest("randoop", 257).given(portfolioGid, "10").checkEq(path, "/portfolios/10/removeMembers");
        itest("evosuite", 257).given(portfolioGid, "#pZ#rJ").checkEq(path, "/portfolios/#pZ#rJ/removeMembers");
        itest("evosuite", 257).given(portfolioGid, "&!vff-b(1SX").checkEq(path, "/portfolios/&!vff-b(1SX/removeMembers");
        itest("evosuite", 257).given(portfolioGid, "/portfolios/urn:ietf:wg:oauth:2.0:oob/removeCustomFieldSetting").checkEq(path, "/portfolios//portfolios/urn:ietf:wg:oauth:2.0:oob/removeCustomFieldSetting/removeMembers");
        itest("randoop", 257).given(portfolioGid, "/tasks/200/addProject").checkEq(path, "/portfolios//tasks/200/addProject/removeMembers");
        itest("randoop", 257).given(portfolioGid, "GET").checkEq(path, "/portfolios/GET/removeMembers");
        itest("randoop", 257).given(portfolioGid, "/projects/Not Found/removeFollowers").checkEq(path, "/portfolios//projects/Not Found/removeFollowers/removeMembers");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> removeMembersForPortfolio(String portfolioGid) throws IOException {
        return removeMembersForPortfolio(portfolioGid, null, false);
    }

    /**
     * Update a portfolio
     * An existing portfolio can be updated by making a PUT request on the URL for that portfolio. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated portfolio record.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Portfolio)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Portfolio> updatePortfolio(String portfolioGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 279).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 279).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request");
        itest("randoop", 279).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 279).given(portfolioGid, "/tags").checkEq(path, "/portfolios//tags");
        itest("randoop", 279).given(portfolioGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//goals/{goal_gid}/addSubgoal");
        itest("randoop", 279).given(portfolioGid, "Forbidden").checkEq(path, "/portfolios/Forbidden");
        itest("randoop", 279).given(portfolioGid, "0").checkEq(path, "/portfolios/0");
        itest("randoop", 279).given(portfolioGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//portfolios//goals/{goal_gid}/subgoals");
        itest("evosuite", 279).given(portfolioGid, "/portfolios/{portfolio_id}/removeCustomFieldeting").checkEq(path, "/portfolios//portfolios/{portfolio_id}/removeCustomFieldeting");
        itest("randoop", 279).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("evosuite", 279).given(portfolioGid, "").checkEq(path, "/portfolios/");
        itest("randoop", 279).given(portfolioGid, "200").checkEq(path, "/portfolios/200");
        itest("evosuite", 279).given(portfolioGid, "DELETE").checkEq(path, "/portfolios/DELETE");
        itest("randoop", 279).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced");
        itest("randoop", 279).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("evosuite", 279).given(portfolioGid, "workspace").checkEq(path, "/portfolios/workspace");
        itest("randoop", 279).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError");
        itest("randoop", 279).given(portfolioGid, "Payment Required").checkEq(path, "/portfolios/Payment Required");
        itest("evosuite", 279).given(portfolioGid, "/workspaces/%s/tags").checkEq(path, "/portfolios//workspaces/%s/tags");
        itest("randoop", 279).given(portfolioGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("evosuite", 279).given(portfolioGid, "yTUF;!C|").checkEq(path, "/portfolios/yTUF;!C|");
        itest("randoop", 279).given(portfolioGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 279).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 279).given(portfolioGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 279).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found");
        itest("randoop", 279).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 279).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 279).given(portfolioGid, "10").checkEq(path, "/portfolios/10");
        itest("randoop", 279).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/");
        itest("randoop", 279).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error");
        itest("randoop", 279).given(portfolioGid, "").checkEq(path, "/portfolios/");
        ItemRequest<Portfolio> req = new ItemRequest<Portfolio>(this, Portfolio.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Portfolio> updatePortfolio(String portfolioGid) throws IOException {
        return updatePortfolio(portfolioGid, null, false);
    }
}
