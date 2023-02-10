package com.asana.resources;

import com.asana.Client;
import com.asana.models.Job;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.JobsBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Randoop", 21).given(job, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=com.asana.errors.RateLimitEnforcedError:%20Rate%20Limit%20Enforced").checkEq(path, "/jobs/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=hi!&response_type=code&state=com.asana.errors.RateLimitEnforcedError:%20Rate%20Limit%20Enforced");
        new Here("Randoop", 21).given(job, "").checkEq(path, "/jobs/");
        new Here("Unit", 21).given(job, "1").checkEq(path, "/jobs/1");
        return new ItemRequest<Job>(this, Job.class, path, "GET");
    }
}
