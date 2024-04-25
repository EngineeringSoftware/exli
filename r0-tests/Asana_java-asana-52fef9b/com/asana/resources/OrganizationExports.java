package com.asana.resources;

import com.asana.Client;
import com.asana.models.OrganizationExport;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.OrganizationExportsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class OrganizationExports extends OrganizationExportsBase {

    public OrganizationExports(Client client) {
        super(client);
    }

    /**
     * Returns details of a previously-requested Organization export.
     *
     * @param  organizationExport Globally unique identifier for the Organization export.
     * @return Request object
     */
    public ItemRequest<OrganizationExport> findById(String organizationExport) {
        String path = String.format("/organization_exports/%s", organizationExport);
        itest("randoop", 21).given(organizationExport, "Sync token invalid or too old").checkEq(path, "/organization_exports/Sync token invalid or too old");
        itest("randoop", 21).given(organizationExport, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/organization_exports/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 21).given(organizationExport, "/tags").checkEq(path, "/organization_exports//tags");
        itest("randoop", 21).given(organizationExport, "Rate Limit Enforced").checkEq(path, "/organization_exports/Rate Limit Enforced");
        itest("randoop", 21).given(organizationExport, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/organization_exports/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 21).given(organizationExport, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/organization_exports/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 21).given(organizationExport, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/organization_exports/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 21).given(organizationExport, "").checkEq(path, "/organization_exports/");
        itest("randoop", 21).given(organizationExport, "Server Error").checkEq(path, "/organization_exports/Server Error");
        itest("randoop", 21).given(organizationExport, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/organization_exports//goals/{goal_gid}/addSubgoal");
        itest("randoop", 21).given(organizationExport, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/organization_exports/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 21).given(organizationExport, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/organization_exports/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 21).given(organizationExport, "hi!").checkEq(path, "/organization_exports/hi!");
        itest("randoop", 21).given(organizationExport, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/organization_exports/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 21).given(organizationExport, "com.asana.models.Tag").checkEq(path, "/organization_exports/com.asana.models.Tag");
        itest("randoop", 21).given(organizationExport, "Invalid Request").checkEq(path, "/organization_exports/Invalid Request");
        itest("randoop", 21).given(organizationExport, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/organization_exports/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 21).given(organizationExport, "/custom_fields//enum_options/insert").checkEq(path, "/organization_exports//custom_fields//enum_options/insert");
        itest("evosuite", 21).given(organizationExport, "POST").checkEq(path, "/organization_exports/POST");
        itest("randoop", 21).given(organizationExport, "Not Found").checkEq(path, "/organization_exports/Not Found");
        itest("randoop", 21).given(organizationExport, "").checkEq(path, "/organization_exports/");
        itest("randoop", 21).given(organizationExport, "100").checkEq(path, "/organization_exports/100");
        itest("randoop", 21).given(organizationExport, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/organization_exports/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("evosuite", 21).given(organizationExport, "0@EbX`t;\"]G").checkEq(path, "/organization_exports/0@EbX`t;\"]G");
        itest("randoop", 21).given(organizationExport, "Forbidden").checkEq(path, "/organization_exports/Forbidden");
        itest("randoop", 21).given(organizationExport, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/organization_exports/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 21).given(organizationExport, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/organization_exports//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        return new ItemRequest<OrganizationExport>(this, OrganizationExport.class, path, "GET");
    }

    /**
     * This method creates a request to export an Organization. Asana will complete the export at some
     * point after you create the request.
     *
     * @return Request object
     */
    public ItemRequest<OrganizationExport> create() {
        return new ItemRequest<OrganizationExport>(this, OrganizationExport.class, "/organization_exports", "POST");
    }
}
