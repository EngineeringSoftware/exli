package com.asana.resources;

import com.asana.Client;
import com.asana.models.OrganizationExport;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.OrganizationExportsBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 21).given(organizationExport, "Sync token invalid or too old").checkEq(path, "/organization_exports/Sync token invalid or too old");
        new Here("Randoop", 21).given(organizationExport, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error").checkEq(path, "/organization_exports/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Server%20Error");
        new Here("Randoop", 21).given(organizationExport, "Server Error").checkEq(path, "/organization_exports/Server Error");
        new Here("Randoop", 21).given(organizationExport, "404").checkEq(path, "/organization_exports/404");
        new Here("Randoop", 21).given(organizationExport, "Forbidden").checkEq(path, "/organization_exports/Forbidden");
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
