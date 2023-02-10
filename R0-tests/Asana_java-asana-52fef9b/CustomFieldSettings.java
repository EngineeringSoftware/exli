package com.asana.resources;

import com.asana.Client;
import com.asana.models.CustomFieldSetting;
import com.asana.requests.CollectionRequest;
import com.asana.resources.gen.CustomFieldSettingsBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 21).given(project, "DELETE").checkEq(path, "/projects/DELETE/custom_field_settings");
        new Here("Randoop", 21).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/custom_field_settings");
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
        new Here("Randoop", 33).given(portfolio, "Invalid Request").checkEq(path, "/portfolios/Invalid Request/custom_field_settings");
        new Here("Randoop", 33).given(portfolio, "Not Found").checkEq(path, "/portfolios/Not Found/custom_field_settings");
        new Here("Randoop", 33).given(portfolio, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Invalid%20Request").checkEq(path, "/portfolios/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Invalid%20Request/custom_field_settings");
        return new CollectionRequest<CustomFieldSetting>(this, CustomFieldSetting.class, path, "GET");
    }
}
