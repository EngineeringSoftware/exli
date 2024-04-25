package com.asana.resources;

import com.asana.Client;
import com.asana.models.Job;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.JobsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Jobs extends JobsBase {

    public Jobs(Client client) {
        super(client);
    }

    /**
     * Returns the complete job record for a single job.
     *
     * @param  job The job to get.
     * @return Request object
     */
    public ItemRequest<Job> findById(String job) {
        String path = String.format("/jobs/%s", job);
        itest("randoop", 21).given(job, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/jobs/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 21).given(job, "Sync token invalid or too old").checkEq(path, "/jobs/Sync token invalid or too old");
        itest("randoop", 21).given(job, "").checkEq(path, "/jobs/");
        itest("evosuite", 21).given(job, "@JsonPolymorphicTypeMap must have at least one @TypeDef").checkEq(path, "/jobs/@JsonPolymorphicTypeMap must have at least one @TypeDef");
        itest("dev", 21).given(job, "1").checkEq(path, "/jobs/1");
        itest("randoop", 21).given(job, "Invalid Request").checkEq(path, "/jobs/Invalid Request");
        itest("evosuite", 21).given(job, "").checkEq(path, "/jobs/");
        itest("randoop", 21).given(job, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/jobs//workspaces//goals/{goal_gid}/subgoals/tasks");
        itest("randoop", 21).given(job, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 21).given(job, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/jobs/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found");
        itest("randoop", 21).given(job, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/jobs/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 21).given(job, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET");
        itest("evosuite", 21).given(job, "PGm=M34eK.kD").checkEq(path, "/jobs/PGm=M34eK.kD");
        itest("randoop", 21).given(job, "POST").checkEq(path, "/jobs/POST");
        itest("randoop", 21).given(job, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 21).given(job, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/jobs/urn:ietf:wg:oauth:2.0:oob");
        itest("evosuite", 21).given(job, "5d").checkEq(path, "/jobs/5d");
        itest("evosuite", 21).given(job, "/jobs/@JsonPolymorphicTypeMap must have at least one @TypeDef").checkEq(path, "/jobs//jobs/@JsonPolymorphicTypeMap must have at least one @TypeDef");
        itest("randoop", 21).given(job, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 21).given(job, "Rate Limit Enforced").checkEq(path, "/jobs/Rate Limit Enforced");
        itest("evosuite", 21).given(job, "workspace").checkEq(path, "/jobs/workspace");
        itest("randoop", 21).given(job, "Server Error").checkEq(path, "/jobs/Server Error");
        itest("randoop", 21).given(job, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/jobs//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 21).given(job, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/jobs//project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("randoop", 21).given(job, "Payment Required").checkEq(path, "/jobs/Payment Required");
        return new ItemRequest<Job>(this, Job.class, path, "GET");
    }
}
