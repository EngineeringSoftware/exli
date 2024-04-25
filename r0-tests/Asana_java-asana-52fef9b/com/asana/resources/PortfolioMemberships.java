package com.asana.resources;

import com.asana.Client;
import com.asana.models.PortfolioMembership;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.PortfolioMembershipsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class PortfolioMemberships extends PortfolioMembershipsBase {

    public PortfolioMemberships(Client client) {
        super(client);
    }

    /**
     * Returns the compact portfolio membership records for the portfolio. You must
     * specify `portfolio`, `portfolio` and `user`, or `workspace` and `user`.
     *
     * @return Request object
     */
    public CollectionRequest<PortfolioMembership> findAll() {
        return new CollectionRequest<PortfolioMembership>(this, PortfolioMembership.class, "/portfolio_memberships", "GET");
    }

    /**
     * Returns the compact portfolio membership records for the portfolio.
     *
     * @param  portfolio The portfolio for which to fetch memberships.
     * @return Request object
     */
    public CollectionRequest<PortfolioMembership> findByPortfolio(String portfolio) {
        String path = String.format("/portfolios/%s/portfolio_memberships", portfolio);
        itest("randoop", 33).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/portfolio_memberships");
        itest("randoop", 33).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/portfolio_memberships");
        itest("randoop", 33).given(portfolio, "/attachments/Not Found").checkEq(path, "/portfolios//attachments/Not Found/portfolio_memberships");
        itest("randoop", 33).given(portfolio, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals/portfolio_memberships");
        itest("randoop", 33).given(portfolio, "hi!").checkEq(path, "/portfolios/hi!/portfolio_memberships");
        itest("evosuite", 33).given(portfolio, "]F[JZJj-$LdGDk<").checkEq(path, "/portfolios/]F[JZJj-$LdGDk</portfolio_memberships");
        itest("evosuite", 33).given(portfolio, "GET").checkEq(path, "/portfolios/GET/portfolio_memberships");
        itest("randoop", 33).given(portfolio, "0").checkEq(path, "/portfolios/0/portfolio_memberships");
        itest("randoop", 33).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/portfolio_memberships");
        itest("randoop", 33).given(portfolio, "GET").checkEq(path, "/portfolios/GET/portfolio_memberships");
        itest("evosuite", 33).given(portfolio, ":[%dp%").checkEq(path, "/portfolios/:[%dp%/portfolio_memberships");
        itest("randoop", 33).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/portfolio_memberships");
        itest("evosuite", 33).given(portfolio, "").checkEq(path, "/portfolios//portfolio_memberships");
        itest("evosuite", 33).given(portfolio, "2r~EqF").checkEq(path, "/portfolios/2r~EqF/portfolio_memberships");
        itest("evosuite", 33).given(portfolio, "c(_ /").checkEq(path, "/portfolios/c(_ //portfolio_memberships");
        return new CollectionRequest<PortfolioMembership>(this, PortfolioMembership.class, path, "GET");
    }

    /**
     * Returns the portfolio membership record.
     *
     * @param  portfolioMembership Globally unique identifier for the portfolio membership.
     * @return Request object
     */
    public ItemRequest<PortfolioMembership> findById(String portfolioMembership) {
        String path = String.format("/portfolio_memberships/%s", portfolioMembership);
        itest("randoop", 45).given(portfolioMembership, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolio_memberships//goals/{goal_gid}/subgoals");
        itest("dev", 45).given(portfolioMembership, "1").checkEq(path, "/portfolio_memberships/1");
        itest("randoop", 45).given(portfolioMembership, "Not Found").checkEq(path, "/portfolio_memberships/Not Found");
        itest("evosuite", 45).given(portfolioMembership, "]F[JZJj-$LdGDk<").checkEq(path, "/portfolio_memberships/]F[JZJj-$LdGDk<");
        itest("randoop", 45).given(portfolioMembership, "hi!").checkEq(path, "/portfolio_memberships/hi!");
        itest("randoop", 45).given(portfolioMembership, "Server Error").checkEq(path, "/portfolio_memberships/Server Error");
        itest("randoop", 45).given(portfolioMembership, "0").checkEq(path, "/portfolio_memberships/0");
        itest("randoop", 45).given(portfolioMembership, "com.asana.errors.AsanaError: hi!").checkEq(path, "/portfolio_memberships/com.asana.errors.AsanaError: hi!");
        itest("randoop", 45).given(portfolioMembership, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolio_memberships/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 45).given(portfolioMembership, "com.asana.resources.PortfolioMemberships").checkEq(path, "/portfolio_memberships/com.asana.resources.PortfolioMemberships");
        itest("randoop", 45).given(portfolioMembership, "Forbidden").checkEq(path, "/portfolio_memberships/Forbidden");
        itest("randoop", 45).given(portfolioMembership, "com.asana.errors.ServerError: Server Error").checkEq(path, "/portfolio_memberships/com.asana.errors.ServerError: Server Error");
        itest("randoop", 45).given(portfolioMembership, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolio_memberships/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 45).given(portfolioMembership, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/portfolio_memberships/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 45).given(portfolioMembership, "10").checkEq(path, "/portfolio_memberships/10");
        itest("evosuite", 45).given(portfolioMembership, null).checkEq(path, "/portfolio_memberships/null");
        itest("randoop", 45).given(portfolioMembership, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolio_memberships/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 45).given(portfolioMembership, "").checkEq(path, "/portfolio_memberships/");
        itest("randoop", 45).given(portfolioMembership, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolio_memberships//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 45).given(portfolioMembership, "/attachments/Not Found").checkEq(path, "/portfolio_memberships//attachments/Not Found");
        return new ItemRequest<PortfolioMembership>(this, PortfolioMembership.class, path, "GET");
    }
}
