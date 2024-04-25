package com.asana.resources;

import com.asana.Client;
import com.asana.models.CustomFieldSetting;
import com.asana.requests.CollectionRequest;
import com.asana.resources.gen.CustomFieldSettingsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class CustomFieldSettings extends CustomFieldSettingsBase {

    public CustomFieldSettings(Client client) {
        super(client);
    }

    /**
     * Returns a list of all of the custom fields settings on a project.
     *
     * @param  project The ID of the project for which to list custom field settings
     * @return Request object
     */
    public CollectionRequest<CustomFieldSetting> findByProject(String project) {
        String path = String.format("/projects/%s/custom_field_settings", project);
        itest("randoop", 21).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/custom_field_settings");
        itest("randoop", 21).given(project, "/organizations//teams").checkEq(path, "/projects//organizations//teams/custom_field_settings");
        itest("evosuite", 21).given(project, "/projects/9^%#./custom_field_settings").checkEq(path, "/projects//projects/9^%#./custom_field_settings/custom_field_settings");
        itest("randoop", 21).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/custom_field_settings");
        itest("randoop", 21).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/custom_field_settings");
        itest("randoop", 21).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/custom_field_settings");
        itest("randoop", 21).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10/custom_field_settings");
        itest("randoop", 21).given(project, "GET").checkEq(path, "/projects/GET/custom_field_settings");
        itest("evosuite", 21).given(project, "com.github.javaparser.ast.validator.TreeVisitorValidator").checkEq(path, "/projects/com.github.javaparser.ast.validator.TreeVisitorValidator/custom_field_settings");
        itest("randoop", 21).given(project, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/custom_field_settings");
        itest("evosuite", 21).given(project, "9^%#.").checkEq(path, "/projects/9^%#./custom_field_settings");
        itest("evosuite", 21).given(project, "Q`FF.%S OFVM84H3").checkEq(path, "/projects/Q`FF.%S OFVM84H3/custom_field_settings");
        itest("evosuite", 21).given(project, "").checkEq(path, "/projects//custom_field_settings");
        itest("randoop", 21).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/custom_field_settings");
        itest("randoop", 21).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/custom_field_settings");
        itest("evosuite", 21).given(project, "/portfolios/%s/custom_field_settings").checkEq(path, "/projects//portfolios/%s/custom_field_settings/custom_field_settings");
        itest("randoop", 21).given(project, "Server Error").checkEq(path, "/projects/Server Error/custom_field_settings");
        itest("randoop", 21).given(project, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/custom_field_settings");
        itest("randoop", 21).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/custom_field_settings");
        itest("evosuite", 21).given(project, null).checkEq(path, "/projects/null/custom_field_settings");
        itest("randoop", 21).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/workspaces//custom_field_settings");
        itest("randoop", 21).given(project, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/projects/com.asana.errors.InvalidRequestError: Invalid Request/custom_field_settings");
        itest("randoop", 21).given(project, "").checkEq(path, "/projects//custom_field_settings");
        itest("randoop", 21).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/custom_field_settings");
        itest("randoop", 21).given(project, "/tags").checkEq(path, "/projects//tags/custom_field_settings");
        return new CollectionRequest<CustomFieldSetting>(this, CustomFieldSetting.class, path, "GET");
    }

    /**
     * Returns a list of all of the custom fields settings on a portfolio.
     *
     * @param  portfolio The ID of the portfolio for which to list custom field settings
     * @return Request object
     */
    public CollectionRequest<CustomFieldSetting> findByPortfolio(String portfolio) {
        String path = String.format("/portfolios/%s/custom_field_settings", portfolio);
        itest("randoop", 33).given(portfolio, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/portfolios/com.asana.errors.RetryableAsanaError: Server Error/custom_field_settings");
        itest("randoop", 33).given(portfolio, "/goals/{goal_gid}/subgoals").checkEq(path, "/portfolios//goals/{goal_gid}/subgoals/custom_field_settings");
        itest("randoop", 33).given(portfolio, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/custom_field_settings");
        itest("evosuite", 33).given(portfolio, "").checkEq(path, "/portfolios//custom_field_settings");
        itest("randoop", 33).given(portfolio, "").checkEq(path, "/portfolios//custom_field_settings");
        itest("evosuite", 33).given(portfolio, "GET").checkEq(path, "/portfolios/GET/custom_field_settings");
        itest("evosuite", 33).given(portfolio, "vGBPCpwn2r").checkEq(path, "/portfolios/vGBPCpwn2r/custom_field_settings");
        itest("evosuite", 33).given(portfolio, "|Y").checkEq(path, "/portfolios/|Y/custom_field_settings");
        itest("randoop", 33).given(portfolio, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/portfolios//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/custom_field_settings");
        itest("randoop", 33).given(portfolio, "200").checkEq(path, "/portfolios/200/custom_field_settings");
        itest("randoop", 33).given(portfolio, "/tags").checkEq(path, "/portfolios//tags/custom_field_settings");
        itest("randoop", 33).given(portfolio, "Payment Required").checkEq(path, "/portfolios/Payment Required/custom_field_settings");
        itest("randoop", 33).given(portfolio, "10").checkEq(path, "/portfolios/10/custom_field_settings");
        itest("randoop", 33).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/custom_field_settings");
        itest("randoop", 33).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/custom_field_settings");
        itest("evosuite", 33).given(portfolio, "+:Z^B51}1a<+[|hs,").checkEq(path, "/portfolios/+:Z^B51}1a<+[|hs,/custom_field_settings");
        itest("evosuite", 33).given(portfolio, "*Q%-3`:f:Oo'oO}P").checkEq(path, "/portfolios/*Q%-3`:f:Oo'oO}P/custom_field_settings");
        itest("randoop", 33).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/custom_field_settings");
        itest("evosuite", 33).given(portfolio, "RIGHT").checkEq(path, "/portfolios/RIGHT/custom_field_settings");
        itest("randoop", 33).given(portfolio, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/custom_field_settings");
        itest("randoop", 33).given(portfolio, "Forbidden").checkEq(path, "/portfolios/Forbidden/custom_field_settings");
        itest("randoop", 33).given(portfolio, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required/custom_field_settings");
        return new CollectionRequest<CustomFieldSetting>(this, CustomFieldSetting.class, path, "GET");
    }
}
