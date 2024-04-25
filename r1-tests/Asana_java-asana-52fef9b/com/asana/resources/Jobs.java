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
        itest("dev", 21).given(job, "1").checkEq(path, "/jobs/1");
        return new ItemRequest<Job>(this, Job.class, path, "GET");
    }
}
