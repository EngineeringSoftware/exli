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
        itest("evosuite", 21).given(project, "9^%#.").checkEq(path, "/projects/9^%#./custom_field_settings");
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
        itest("evosuite", 33).given(portfolio, "*Q%-3`:f:Oo'oO}P").checkEq(path, "/portfolios/*Q%-3`:f:Oo'oO}P/custom_field_settings");
        return new CollectionRequest<CustomFieldSetting>(this, CustomFieldSetting.class, path, "GET");
    }
}
