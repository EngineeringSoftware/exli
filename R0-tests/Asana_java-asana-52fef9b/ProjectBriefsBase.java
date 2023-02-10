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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public class ProjectBriefsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public ProjectBriefsBase(Client client) {
        super(client);
    }

    /**
     * Create a project brief
     * Creates a new project brief.  Returns the full record of the newly created project brief.
     * @param projectGid Globally unique identifier for the project. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> createProjectBrief(String projectGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/projects/{project_gid}/project_briefs".replace("{project_gid}", projectGid);
        new Here("Randoop", 31).given(projectGid, "DELETE").checkEq(path, "/projects/DELETE/project_briefs");
        new Here("Randoop", 31).given(projectGid, "Forbidden").checkEq(path, "/projects/Forbidden/project_briefs");
        new Here("Randoop", 31).given(projectGid, "POST").checkEq(path, "/projects/POST/project_briefs");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "POST").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> createProjectBrief(String projectGid) throws IOException {
        return createProjectBrief(projectGid, null, false);
    }

    /**
     * Delete a project brief
     * Deletes a specific, existing project brief.  Returns an empty data record.
     * @param projectBriefGid Globally unique identifier for the project brief. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteProjectBrief(String projectBriefGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_briefs/{project_brief_gid}".replace("{project_brief_gid}", projectBriefGid);
        new Here("Randoop", 53).given(projectBriefGid, "com.asana.errors.RetryableAsanaError: Not Found").checkEq(path, "/project_briefs/com.asana.errors.RetryableAsanaError: Not Found");
        new Here("Randoop", 53).given(projectBriefGid, "200").checkEq(path, "/project_briefs/200");
        new Here("Randoop", 53).given(projectBriefGid, "404").checkEq(path, "/project_briefs/404");
        new Here("Randoop", 53).given(projectBriefGid, "Invalid Request").checkEq(path, "/project_briefs/Invalid Request");
        new Here("Randoop", 53).given(projectBriefGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/project_briefs/com.asana.errors.InvalidRequestError: Invalid Request");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteProjectBrief(String projectBriefGid) throws IOException {
        return deleteProjectBrief(projectBriefGid, null, false);
    }

    /**
     * Get a project brief
     * Get the full record for a project brief.
     * @param projectBriefGid Globally unique identifier for the project brief. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> getProjectBrief(String projectBriefGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_briefs/{project_brief_gid}".replace("{project_brief_gid}", projectBriefGid);
        new Here("Randoop", 75).given(projectBriefGid, "Sync token invalid or too old").checkEq(path, "/project_briefs/Sync token invalid or too old");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> getProjectBrief(String projectBriefGid) throws IOException {
        return getProjectBrief(projectBriefGid, null, false);
    }

    /**
     * Update a project brief
     * An existing project brief can be updated by making a PUT request on the URL for that project brief. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated project brief record.
     * @param projectBriefGid Globally unique identifier for the project brief. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> updateProjectBrief(String projectBriefGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/project_briefs/{project_brief_gid}".replace("{project_brief_gid}", projectBriefGid);
        new Here("Randoop", 97).given(projectBriefGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Invalid%20Request").checkEq(path, "/project_briefs/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=Invalid%20Request");
        new Here("Randoop", 97).given(projectBriefGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/project_briefs/urn:ietf:wg:oauth:2.0:oob");
        new Here("Randoop", 97).given(projectBriefGid, "").checkEq(path, "/project_briefs/");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "PUT").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> updateProjectBrief(String projectBriefGid) throws IOException {
        return updateProjectBrief(projectBriefGid, null, false);
    }
}
