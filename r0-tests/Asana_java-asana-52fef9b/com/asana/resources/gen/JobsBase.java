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

public class JobsBase extends Resource {

    /**
     * @param client Parent client instance
     */
    public JobsBase(Client client) {
        super(client);
    }

    /**
     * Get a job by id
     * Returns the full record for a job.
     * @param jobGid Globally unique identifier for the job. (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest(Job)
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<Job> getJob(String jobGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/jobs/{job_gid}".replace("{job_gid}", jobGid);
        itest("randoop", 31).given(jobGid, "Forbidden").checkEq(path, "/jobs/Forbidden");
        itest("evosuite", 31).given(jobGid, "").checkEq(path, "/jobs/");
        itest("randoop", 31).given(jobGid, "Payment Required").checkEq(path, "/jobs/Payment Required");
        itest("randoop", 31).given(jobGid, "10").checkEq(path, "/jobs/10");
        itest("randoop", 31).given(jobGid, "/projects/Not Found/removeFollowers").checkEq(path, "/jobs//projects/Not Found/removeFollowers");
        itest("randoop", 31).given(jobGid, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("evosuite", 31).given(jobGid, "EOF").checkEq(path, "/jobs/EOF");
        itest("randoop", 31).given(jobGid, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/jobs/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 31).given(jobGid, "Server Error").checkEq(path, "/jobs/Server Error");
        itest("randoop", 31).given(jobGid, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/jobs//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 31).given(jobGid, "Invalid Request").checkEq(path, "/jobs/Invalid Request");
        itest("evosuite", 31).given(jobGid, "Eoh$mEN-sa$W").checkEq(path, "/jobs/Eoh$mEN-sa$W");
        itest("randoop", 31).given(jobGid, "Rate Limit Enforced").checkEq(path, "/jobs/Rate Limit Enforced");
        itest("randoop", 31).given(jobGid, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/jobs/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 31).given(jobGid, "/attachments/Not Found").checkEq(path, "/jobs//attachments/Not Found");
        itest("randoop", 31).given(jobGid, "/portfolios/GET/removeMembers").checkEq(path, "/jobs//portfolios/GET/removeMembers");
        itest("evosuite", 31).given(jobGid, "{job_gid}").checkEq(path, "/jobs/{job_gid}");
        itest("randoop", 31).given(jobGid, "/tags").checkEq(path, "/jobs//tags");
        itest("randoop", 31).given(jobGid, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/jobs/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 31).given(jobGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 31).given(jobGid, "/custom_fields//enum_options/insert").checkEq(path, "/jobs//custom_fields//enum_options/insert");
        itest("evosuite", 31).given(jobGid, "@*").checkEq(path, "/jobs/@*");
        itest("randoop", 31).given(jobGid, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 31).given(jobGid, "Not Found").checkEq(path, "/jobs/Not Found");
        itest("randoop", 31).given(jobGid, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("evosuite", 31).given(jobGid, "Sf/\"1K.").checkEq(path, "/jobs/Sf/\"1K.");
        itest("evosuite", 31).given(jobGid, "A4-X:`Xg }Zn)2-L/").checkEq(path, "/jobs/A4-X:`Xg }Zn)2-L/");
        itest("randoop", 31).given(jobGid, "/tags/Payment Required").checkEq(path, "/jobs//tags/Payment Required");
        itest("evosuite", 31).given(jobGid, "/jobs/@*").checkEq(path, "/jobs//jobs/@*");
        itest("randoop", 31).given(jobGid, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/jobs//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 31).given(jobGid, "").checkEq(path, "/jobs/");
        itest("randoop", 31).given(jobGid, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/jobs/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 31).given(jobGid, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/jobs/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 31).given(jobGid, "bHy_bWL@d{N8}V\";;p").checkEq(path, "/jobs/bHy_bWL@d{N8}V\";;p");
        itest("randoop", 31).given(jobGid, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/jobs//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("randoop", 31).given(jobGid, "hi!").checkEq(path, "/jobs/hi!");
        itest("randoop", 31).given(jobGid, "200").checkEq(path, "/jobs/200");
        itest("evosuite", 31).given(jobGid, "K2:RdD").checkEq(path, "/jobs/K2:RdD");
        ItemRequest<Job> req = new ItemRequest<Job>(this, Job.class, path, "GET").query("opt_pretty", optPretty).query("opt_fields", optFields);
        return req;
    }

    public ItemRequest<Job> getJob(String jobGid) throws IOException {
        return getJob(jobGid, null, false);
    }
}
