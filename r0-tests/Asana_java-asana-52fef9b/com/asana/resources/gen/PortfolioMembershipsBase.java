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

public class PortfolioMembershipsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public PortfolioMembershipsBase(Client client) {
        super(client);
    }

    /**
     * Get a portfolio membership
     * Returns the complete portfolio record for a single portfolio membership.
     * @param portfolioMembershipGid  (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(PortfolioMembership)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<PortfolioMembership> getPortfolioMembership(String portfolioMembershipGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolio_memberships/{portfolio_membership_gid}".replace("{portfolio_membership_gid}", portfolioMembershipGid);
        itest("randoop", 31).given(portfolioMembershipGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/portfolio_memberships//portfolios//goals/{goal_gid}/subgoals");
        itest("evosuite", 31).given(portfolioMembershipGid, "limit").checkEq(path, "/portfolio_memberships/limit");
        itest("randoop", 31).given(portfolioMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/portfolio_memberships/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 31).given(portfolioMembershipGid, "com.asana.errors.ServerError: Server Error").checkEq(path, "/portfolio_memberships/com.asana.errors.ServerError: Server Error");
        itest("randoop", 31).given(portfolioMembershipGid, "/custom_fields//enum_options/insert").checkEq(path, "/portfolio_memberships//custom_fields//enum_options/insert");
        itest("randoop", 31).given(portfolioMembershipGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolio_memberships//goals/{goal_gid}/subgoals");
        itest("randoop", 31).given(portfolioMembershipGid, "Payment Required").checkEq(path, "/portfolio_memberships/Payment Required");
        itest("randoop", 31).given(portfolioMembershipGid, "Forbidden").checkEq(path, "/portfolio_memberships/Forbidden");
        itest("evosuite", 31).given(portfolioMembershipGid, "8jw6/r_=oFRikWR").checkEq(path, "/portfolio_memberships/8jw6/r_=oFRikWR");
        itest("randoop", 31).given(portfolioMembershipGid, "Invalid Request").checkEq(path, "/portfolio_memberships/Invalid Request");
        itest("randoop", 31).given(portfolioMembershipGid, "200").checkEq(path, "/portfolio_memberships/200");
        itest("randoop", 31).given(portfolioMembershipGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolio_memberships/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 31).given(portfolioMembershipGid, "Not Found").checkEq(path, "/portfolio_memberships/Not Found");
        itest("randoop", 31).given(portfolioMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolio_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 31).given(portfolioMembershipGid, "0").checkEq(path, "/portfolio_memberships/0");
        itest("randoop", 31).given(portfolioMembershipGid, "").checkEq(path, "/portfolio_memberships/");
        itest("randoop", 31).given(portfolioMembershipGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolio_memberships/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 31).given(portfolioMembershipGid, "/portfolio_memberships").checkEq(path, "/portfolio_memberships//portfolio_memberships");
        itest("randoop", 31).given(portfolioMembershipGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/portfolio_memberships/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 31).given(portfolioMembershipGid, "/attachments/Not Found").checkEq(path, "/portfolio_memberships//attachments/Not Found");
        itest("randoop", 31).given(portfolioMembershipGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolio_memberships//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 31).given(portfolioMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/portfolio_memberships/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("evosuite", 31).given(portfolioMembershipGid, "=ciN_ZzYv").checkEq(path, "/portfolio_memberships/=ciN_ZzYv");
        itest("randoop", 31).given(portfolioMembershipGid, "Rate Limit Enforced").checkEq(path, "/portfolio_memberships/Rate Limit Enforced");
        itest("randoop", 31).given(portfolioMembershipGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolio_memberships/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("evosuite", 31).given(portfolioMembershipGid, "6(=M<9aeSC ").checkEq(path, "/portfolio_memberships/6(=M<9aeSC ");
        itest("randoop", 31).given(portfolioMembershipGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 31).given(portfolioMembershipGid, "/tags").checkEq(path, "/portfolio_memberships//tags");
        ItemRequest<PortfolioMembership> req = new ItemRequest<PortfolioMembership>(this, PortfolioMembership.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<PortfolioMembership> getPortfolioMembership(String portfolioMembershipGid) throws IOException {
        return getPortfolioMembership(portfolioMembershipGid, null, false);
    }

    /**
     * Get multiple portfolio memberships
     * Returns a list of portfolio memberships in compact representation. You must specify &#x60;portfolio&#x60;, &#x60;portfolio&#x60; and &#x60;user&#x60;, or &#x60;workspace&#x60; and &#x60;user&#x60;.
     * @param user A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (optional)
     * @param workspace The workspace to filter results on. (optional)
     * @param portfolio The portfolio to filter results on. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(PortfolioMembership)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<PortfolioMembership> getPortfolioMemberships(String user, String workspace, String portfolio, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolio_memberships";
        CollectionRequest<PortfolioMembership> req = new CollectionRequest<PortfolioMembership>(this, PortfolioMembership.class, path, "GET").query("portfolio", portfolio).query("workspace", workspace).query("user", user).query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<PortfolioMembership> getPortfolioMemberships(String user, String workspace, String portfolio) throws IOException {
        return getPortfolioMemberships(user, workspace, portfolio, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get memberships from a portfolio
     * Returns the compact portfolio membership records for the portfolio.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param user A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(PortfolioMembership)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<PortfolioMembership> getPortfolioMembershipsForPortfolio(String portfolioGid, String user, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/portfolio_memberships".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 87).given(portfolioGid, "/tags/Payment Required").checkEq(path, "/portfolios//tags/Payment Required/portfolio_memberships");
        itest("evosuite", 87).given(portfolioGid, "-6(?=s<9aeS% ").checkEq(path, "/portfolios/-6(?=s<9aeS% /portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "/webhooks/NoAuthorizationError").checkEq(path, "/portfolios//webhooks/NoAuthorizationError/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//goals/{goal_gid}/addSubgoal/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "200").checkEq(path, "/portfolios/200/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "/portfolios/").checkEq(path, "/portfolios//portfolios//portfolio_memberships");
        itest("evosuite", 87).given(portfolioGid, "S.6rY-]oEk<@").checkEq(path, "/portfolios/S.6rY-]oEk<@/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "hi!").checkEq(path, "/portfolios/hi!/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals/portfolio_memberships");
        itest("evosuite", 87).given(portfolioGid, "CURRENT").checkEq(path, "/portfolios/CURRENT/portfolio_memberships");
        itest("evosuite", 87).given(portfolioGid, "}|C\u0001vi C?vgfEykgM").checkEq(path, "/portfolios/}|C\u0001vi C?vgfEykgM/portfolio_memberships");
        itest("evosuite", 87).given(portfolioGid, "GET").checkEq(path, "/portfolios/GET/portfolio_memberships");
        itest("evosuite", 87).given(portfolioGid, "").checkEq(path, "/portfolios//portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "10").checkEq(path, "/portfolios/10/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "0").checkEq(path, "/portfolios/0/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "").checkEq(path, "/portfolios//portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/portfolios//stories//goals/{goal_gid}/addSubgoal/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/portfolio_memberships");
        itest("evosuite", 87).given(portfolioGid, "/teams/{team_gid}/removeUser").checkEq(path, "/portfolios//teams/{team_gid}/removeUser/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "Forbidden").checkEq(path, "/portfolios/Forbidden/portfolio_memberships");
        itest("evosuite", 87).given(portfolioGid, "Ul").checkEq(path, "/portfolios/Ul/portfolio_memberships");
        itest("randoop", 87).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error/portfolio_memberships");
        CollectionRequest<PortfolioMembership> req = new CollectionRequest<PortfolioMembership>(this, PortfolioMembership.class, path, "GET").query("user", user).query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<PortfolioMembership> getPortfolioMembershipsForPortfolio(String portfolioGid, String user) throws IOException {
        return getPortfolioMembershipsForPortfolio(portfolioGid, user, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
