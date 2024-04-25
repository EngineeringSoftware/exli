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

public class CustomFieldSettingsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public CustomFieldSettingsBase(Client client) {
        super(client);
    }

    /**
     * Get a portfolio&#x27;s custom fields
     * Returns a list of all of the custom fields settings on a portfolio, in compact form.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(CustomFieldSetting)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<CustomFieldSetting> getCustomFieldSettingsForPortfolio(String portfolioGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/custom_field_settings".replace("{portfolio_gid}", portfolioGid);
        itest("randoop", 33).given(portfolioGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/portfolios//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "YH2#ilAgyW").checkEq(path, "/portfolios/YH2#ilAgyW/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, ">7FA96xO'Rd=(x3!").checkEq(path, "/portfolios/>7FA96xO'Rd=(x3!/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "200").checkEq(path, "/portfolios/200/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "/portfolios/GET/removeMembers").checkEq(path, "/portfolios//portfolios/GET/removeMembers/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "Rate Limit Enforced").checkEq(path, "/portfolios/Rate Limit Enforced/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/portfolios//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "").checkEq(path, "/portfolios//custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "/portfolios/").checkEq(path, "/portfolios//portfolios//custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/portfolios/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "Forbidden").checkEq(path, "/portfolios/Forbidden/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "tags.not").checkEq(path, "/portfolios/tags.not/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "com.asana.errors.AsanaError: NoAuthorizationError").checkEq(path, "/portfolios/com.asana.errors.AsanaError: NoAuthorizationError/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "POST").checkEq(path, "/portfolios/POST/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "uvpCrcPhhNHZ").checkEq(path, "/portfolios/uvpCrcPhhNHZ/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/portfolios/com.asana.errors.PremiumOnlyError: Payment Required/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "GET").checkEq(path, "/portfolios/GET/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/portfolios//projects/Rate Limit Enforced/sections/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/portfolios/urn:ietf:wg:oauth:2.0:oob/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "{g;&aYu").checkEq(path, "/portfolios/{g;&aYu/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "0").checkEq(path, "/portfolios/0/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "rko2Q~>{ Lhqhrm,.").checkEq(path, "/portfolios/rko2Q~>{ Lhqhrm,./custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "I").checkEq(path, "/portfolios/I/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/portfolios/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "hi!").checkEq(path, "/portfolios/hi!/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "/custom_fields//enum_options/insert").checkEq(path, "/portfolios//custom_fields//enum_options/insert/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "Server Error").checkEq(path, "/portfolios/Server Error/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "/tags").checkEq(path, "/portfolios//tags/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "A9xv%~-?@\"wR").checkEq(path, "/portfolios/A9xv%~-?@\"wR/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/portfolios/com.asana.errors.InvalidTokenError: Sync token invalid or too old/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "Not Found").checkEq(path, "/portfolios/Not Found/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/custom_field_settings");
        itest("evosuite", 33).given(portfolioGid, "/portfolios/>7FA96xO'Rd=(x3!/custom_field_settings").checkEq(path, "/portfolios//portfolios/>7FA96xO'Rd=(x3!/custom_field_settings/custom_field_settings");
        itest("randoop", 33).given(portfolioGid, "NoAuthorizationError").checkEq(path, "/portfolios/NoAuthorizationError/custom_field_settings");
        CollectionRequest<CustomFieldSetting> req = new CollectionRequest<CustomFieldSetting>(this, CustomFieldSetting.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<CustomFieldSetting> getCustomFieldSettingsForPortfolio(String portfolioGid) throws IOException {
        return getCustomFieldSettingsForPortfolio(portfolioGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get a project&#x27;s custom fields
     * Returns a list of all of the custom fields settings on a project, in compact form. Note that, as in all queries to collections which return compact representation, &#x60;opt_fields&#x60; can be used to include more data than is returned in the compact representation. See the [getting started guide on input/output options](https://developers.asana.com/docs/#input-output-options) for more information.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(CustomFieldSetting)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<CustomFieldSetting> getCustomFieldSettingsForProject(String projectGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/custom_field_settings".replace("{project_gid}", projectGid);
        itest("randoop", 59).given(projectGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/custom_field_settings");
        itest("randoop", 59).given(projectGid, "hi!").checkEq(path, "/projects/hi!/custom_field_settings");
        itest("randoop", 59).given(projectGid, "GET").checkEq(path, "/projects/GET/custom_field_settings");
        itest("evosuite", 59).given(projectGid, "NOT_EQUALS").checkEq(path, "/projects/NOT_EQUALS/custom_field_settings");
        itest("randoop", 59).given(projectGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/custom_field_settings");
        itest("randoop", 59).given(projectGid, "Invalid Request").checkEq(path, "/projects/Invalid Request/custom_field_settings");
        itest("randoop", 59).given(projectGid, "Payment Required").checkEq(path, "/projects/Payment Required/custom_field_settings");
        itest("randoop", 59).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/custom_field_settings");
        itest("randoop", 59).given(projectGid, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//portfolio_memberships//goals/{goal_gid}/addSubgoal/custom_field_settings");
        itest("evosuite", 59).given(projectGid, "/projects/{project_gid}/custom_field_settings").checkEq(path, "/projects//projects/{project_gid}/custom_field_settings/custom_field_settings");
        itest("randoop", 59).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200/custom_field_settings");
        itest("randoop", 59).given(projectGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/custom_field_settings");
        itest("randoop", 59).given(projectGid, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/custom_field_settings");
        itest("randoop", 59).given(projectGid, "").checkEq(path, "/projects//custom_field_settings");
        itest("randoop", 59).given(projectGid, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/custom_field_settings");
        itest("randoop", 59).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/custom_field_settings");
        itest("randoop", 59).given(projectGid, "Not Found").checkEq(path, "/projects/Not Found/custom_field_settings");
        itest("evosuite", 59).given(projectGid, "qw?$Cy").checkEq(path, "/projects/qw?$Cy/custom_field_settings");
        itest("randoop", 59).given(projectGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//goals/{goal_gid}/addSubgoal/custom_field_settings");
        itest("randoop", 59).given(projectGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/custom_field_settings");
        itest("randoop", 59).given(projectGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/projects//stories//goals/{goal_gid}/addSubgoal/custom_field_settings");
        itest("randoop", 59).given(projectGid, "100").checkEq(path, "/projects/100/custom_field_settings");
        itest("evosuite", 59).given(projectGid, "5e)xxP@.6rgE").checkEq(path, "/projects/5e)xxP@.6rgE/custom_field_settings");
        itest("evosuite", 59).given(projectGid, "c6V`bwT<<:Gy").checkEq(path, "/projects/c6V`bwT<<:Gy/custom_field_settings");
        itest("randoop", 59).given(projectGid, "200").checkEq(path, "/projects/200/custom_field_settings");
        itest("randoop", 59).given(projectGid, "/tags").checkEq(path, "/projects//tags/custom_field_settings");
        itest("randoop", 59).given(projectGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/custom_field_settings");
        itest("randoop", 59).given(projectGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/projects//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/custom_field_settings");
        itest("randoop", 59).given(projectGid, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/custom_field_settings");
        itest("evosuite", 59).given(projectGid, "").checkEq(path, "/projects//custom_field_settings");
        itest("randoop", 59).given(projectGid, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/custom_field_settings");
        CollectionRequest<CustomFieldSetting> req = new CollectionRequest<CustomFieldSetting>(this, CustomFieldSetting.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<CustomFieldSetting> getCustomFieldSettingsForProject(String projectGid) throws IOException {
        return getCustomFieldSettingsForProject(projectGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
