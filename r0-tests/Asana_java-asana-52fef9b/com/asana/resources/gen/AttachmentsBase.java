package com.asana.resources.gen;

import com.asana.Client;
import com.asana.resources.Resource;
import com.asana.requests.ItemRequest;
import com.asana.requests.CollectionRequest;
import com.asana.models.*;
import java.io.File;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class AttachmentsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public AttachmentsBase(Client client) {
        super(client);
    }

    /**
     * Delete an attachment
     * Deletes a specific, existing attachment.  Returns an empty data record.
     * @param attachmentGid Globally unique identifier for the attachment. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(JsonElement)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<JsonElement> deleteAttachment(String attachmentGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/attachments/{attachment_gid}".replace("{attachment_gid}", attachmentGid);
        itest("randoop", 32).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200");
        itest("randoop", 32).given(attachmentGid, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/attachments/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 32).given(attachmentGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/attachments//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 32).given(attachmentGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/attachments//portfolios//goals/{goal_gid}/subgoals");
        itest("randoop", 32).given(attachmentGid, "Forbidden").checkEq(path, "/attachments/Forbidden");
        itest("randoop", 32).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 32).given(attachmentGid, "team").checkEq(path, "/attachments/team");
        itest("randoop", 32).given(attachmentGid, "POST").checkEq(path, "/attachments/POST");
        itest("evosuite", 32).given(attachmentGid, "G?").checkEq(path, "/attachments/G?");
        itest("randoop", 32).given(attachmentGid, "Server Error").checkEq(path, "/attachments/Server Error");
        itest("evosuite", 32).given(attachmentGid, "5zl$I{QQ4Qz_D").checkEq(path, "/attachments/5zl$I{QQ4Qz_D");
        itest("randoop", 32).given(attachmentGid, "100").checkEq(path, "/attachments/100");
        itest("randoop", 32).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("evosuite", 32).given(attachmentGid, "I|>t[e~~.").checkEq(path, "/attachments/I|>t[e~~.");
        itest("randoop", 32).given(attachmentGid, "10").checkEq(path, "/attachments/10");
        itest("randoop", 32).given(attachmentGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/attachments//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 32).given(attachmentGid, "/attachments/Not Found").checkEq(path, "/attachments//attachments/Not Found");
        itest("randoop", 32).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 32).given(attachmentGid, "").checkEq(path, "/attachments/");
        itest("randoop", 32).given(attachmentGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/attachments/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 32).given(attachmentGid, "-Z(gbYc8&").checkEq(path, "/attachments/-Z(gbYc8&");
        itest("randoop", 32).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 32).given(attachmentGid, "hi!").checkEq(path, "/attachments/hi!");
        itest("randoop", 32).given(attachmentGid, "0").checkEq(path, "/attachments/0");
        itest("randoop", 32).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 32).given(attachmentGid, "'@V;zJ.&0!").checkEq(path, "/attachments/'@V;zJ.&0!");
        itest("randoop", 32).given(attachmentGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/attachments/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 32).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        ItemRequest<JsonElement> req = new ItemRequest<JsonElement>(this, JsonElement.class, path, "DELETE").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<JsonElement> deleteAttachment(String attachmentGid) throws IOException {
        return deleteAttachment(attachmentGid, null, false);
    }

    /**
     * Get an attachment
     * Get the full record for a single attachment.
     * @param attachmentGid Globally unique identifier for the attachment. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Attachment)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Attachment> getAttachment(String attachmentGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/attachments/{attachment_gid}".replace("{attachment_gid}", attachmentGid);
        itest("randoop", 54).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 54).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 54).given(attachmentGid, "10").checkEq(path, "/attachments/10");
        itest("randoop", 54).given(attachmentGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/attachments//goals/{goal_gid}/subgoals");
        itest("randoop", 54).given(attachmentGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/attachments//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 54).given(attachmentGid, "/tags").checkEq(path, "/attachments//tags");
        itest("randoop", 54).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 54).given(attachmentGid, "NoAuthorizationError").checkEq(path, "/attachments/NoAuthorizationError");
        itest("randoop", 54).given(attachmentGid, "Invalid Request").checkEq(path, "/attachments/Invalid Request");
        itest("randoop", 54).given(attachmentGid, "Not Found").checkEq(path, "/attachments/Not Found");
        itest("evosuite", 54).given(attachmentGid, "").checkEq(path, "/attachments/");
        itest("randoop", 54).given(attachmentGid, "/webhooks/NoAuthorizationError").checkEq(path, "/attachments//webhooks/NoAuthorizationError");
        itest("randoop", 54).given(attachmentGid, "200").checkEq(path, "/attachments/200");
        itest("evosuite", 54).given(attachmentGid, "BL[TLCJy,").checkEq(path, "/attachments/BL[TLCJy,");
        itest("evosuite", 54).given(attachmentGid, "multipart/form-data").checkEq(path, "/attachments/multipart/form-data");
        itest("evosuite", 54).given(attachmentGid, "M}8y8@]!gYD").checkEq(path, "/attachments/M}8y8@]!gYD");
        itest("randoop", 54).given(attachmentGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/attachments/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 54).given(attachmentGid, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/attachments//stories//goals/{goal_gid}/addSubgoal");
        itest("randoop", 54).given(attachmentGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/attachments//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 54).given(attachmentGid, "").checkEq(path, "/attachments/");
        itest("randoop", 54).given(attachmentGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/attachments//goals/{goal_gid}/addSubgoal");
        itest("randoop", 54).given(attachmentGid, "/projects/Not Found/removeFollowers").checkEq(path, "/attachments//projects/Not Found/removeFollowers");
        itest("randoop", 54).given(attachmentGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/attachments/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 54).given(attachmentGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 54).given(attachmentGid, "com.github.javaparser.ast.visitor.HashCodeVisitor").checkEq(path, "/attachments/com.github.javaparser.ast.visitor.HashCodeVisitor");
        itest("evosuite", 54).given(attachmentGid, ">|w").checkEq(path, "/attachments/>|w");
        itest("randoop", 54).given(attachmentGid, "com.asana.errors.ServerError: Server Error").checkEq(path, "/attachments/com.asana.errors.ServerError: Server Error");
        itest("randoop", 54).given(attachmentGid, "/custom_fields//enum_options/insert").checkEq(path, "/attachments//custom_fields//enum_options/insert");
        itest("randoop", 54).given(attachmentGid, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/attachments//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 54).given(attachmentGid, "Forbidden").checkEq(path, "/attachments/Forbidden");
        itest("randoop", 54).given(attachmentGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/attachments/com.asana.errors.AsanaError: hi!");
        ItemRequest<Attachment> req = new ItemRequest<Attachment>(this, Attachment.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Attachment> getAttachment(String attachmentGid) throws IOException {
        return getAttachment(attachmentGid, null, false);
    }

    /**
     * Get attachments for a task
     * Returns the compact records for all attachments on the task.
     * @param taskGid The task to operate on. (required)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest(Attachment)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<Attachment> getAttachmentsForTask(String taskGid, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/tasks/{task_gid}/attachments".replace("{task_gid}", taskGid);
        itest("randoop", 78).given(taskGid, "GET").checkEq(path, "/tasks/GET/attachments");
        itest("randoop", 78).given(taskGid, "/attachments/").checkEq(path, "/tasks//attachments//attachments");
        itest("randoop", 78).given(taskGid, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert/attachments");
        itest("randoop", 78).given(taskGid, "/projects/Rate Limit Enforced/sections").checkEq(path, "/tasks//projects/Rate Limit Enforced/sections/attachments");
        itest("randoop", 78).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/attachments");
        itest("randoop", 78).given(taskGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/tasks//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/attachments");
        itest("evosuite", 78).given(taskGid, "page_size").checkEq(path, "/tasks/page_size/attachments");
        itest("evosuite", 78).given(taskGid, ",RRJ:S3Jd").checkEq(path, "/tasks/,RRJ:S3Jd/attachments");
        itest("randoop", 78).given(taskGid, "/portfolios/").checkEq(path, "/tasks//portfolios//attachments");
        itest("randoop", 78).given(taskGid, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/attachments");
        itest("randoop", 78).given(taskGid, "0").checkEq(path, "/tasks/0/attachments");
        itest("randoop", 78).given(taskGid, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: /portfolios//attachments");
        itest("randoop", 78).given(taskGid, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/tasks/com.asana.errors.RetryableAsanaError: 200/attachments");
        itest("randoop", 78).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/attachments");
        itest("evosuite", 78).given(taskGid, "DELETE").checkEq(path, "/tasks/DELETE/attachments");
        itest("randoop", 78).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/attachments");
        itest("randoop", 78).given(taskGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/attachments");
        itest("randoop", 78).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/attachments");
        itest("evosuite", 78).given(taskGid, "s").checkEq(path, "/tasks/s/attachments");
        itest("evosuite", 78).given(taskGid, "$zDDYZ,41").checkEq(path, "/tasks/$zDDYZ,41/attachments");
        itest("randoop", 78).given(taskGid, "/goals/{goal_gid}/subgoals").checkEq(path, "/tasks//goals/{goal_gid}/subgoals/attachments");
        itest("evosuite", 78).given(taskGid, "e0`P?").checkEq(path, "/tasks/e0`P?/attachments");
        itest("evosuite", 78).given(taskGid, "G?").checkEq(path, "/tasks/G?/attachments");
        itest("randoop", 78).given(taskGid, "com.asana.errors.AsanaError: hi!").checkEq(path, "/tasks/com.asana.errors.AsanaError: hi!/attachments");
        itest("randoop", 78).given(taskGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/tasks/com.asana.errors.PremiumOnlyError: Payment Required/attachments");
        itest("evosuite", 78).given(taskGid, "aL7umq/ :Z").checkEq(path, "/tasks/aL7umq/ :Z/attachments");
        itest("randoop", 78).given(taskGid, "Not Found").checkEq(path, "/tasks/Not Found/attachments");
        itest("randoop", 78).given(taskGid, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//goals/{goal_gid}/addSubgoal/attachments");
        itest("randoop", 78).given(taskGid, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/attachments");
        itest("randoop", 78).given(taskGid, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/attachments");
        itest("randoop", 78).given(taskGid, "10").checkEq(path, "/tasks/10/attachments");
        itest("randoop", 78).given(taskGid, "hi!").checkEq(path, "/tasks/hi!/attachments");
        itest("randoop", 78).given(taskGid, "Payment Required").checkEq(path, "/tasks/Payment Required/attachments");
        itest("randoop", 78).given(taskGid, "Invalid Request").checkEq(path, "/tasks/Invalid Request/attachments");
        itest("randoop", 78).given(taskGid, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/attachments");
        itest("evosuite", 78).given(taskGid, "opt_fields").checkEq(path, "/tasks/opt_fields/attachments");
        itest("randoop", 78).given(taskGid, "/attachments/Not Found").checkEq(path, "/tasks//attachments/Not Found/attachments");
        itest("randoop", 78).given(taskGid, "POST").checkEq(path, "/tasks/POST/attachments");
        CollectionRequest<Attachment> req = new CollectionRequest<Attachment>(this, Attachment.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields).query("limit", limit).query("offset", offset);
        return req;
    }

    public CollectionRequest<Attachment> getAttachmentsForTask(String taskGid) throws IOException {
        return getAttachmentsForTask(taskGid, null, (int) Client.DEFAULTS.get("page_size"), null, false);
    }
}
