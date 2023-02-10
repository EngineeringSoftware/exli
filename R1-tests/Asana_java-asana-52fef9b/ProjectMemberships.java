package com.asana.resources;

import com.asana.Client;
import com.asana.models.ProjectMembership;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.ProjectMembershipsBase;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public class ProjectMemberships extends ProjectMembershipsBase {

    public ProjectMemberships(Client client) {
        super(client);
    }

    /**
     * Returns the compact project membership records for the project.
     *
     * @param  project The project for which to fetch memberships.
     * @return Request object
     */
    public CollectionRequest<ProjectMembership> findByProject(String project) {
        String path = String.format("/projects/%s/project_memberships", project);
        new Here("Randoop", 22).given(project, "Not Found").checkEq(path, "/projects/Not Found/project_memberships");
        return new CollectionRequest<ProjectMembership>(this, ProjectMembership.class, path, "GET");
    }

    /**
     * Returns the project membership record.
     *
     * @param  projectMembership Globally unique identifier for the project membership.
     * @return Request object
     */
    public ItemRequest<ProjectMembership> findById(String projectMembership) {
        String path = String.format("/project_memberships/%s", projectMembership);
        new Here("Unit", 34).given(projectMembership, "1").checkEq(path, "/project_memberships/1");
        return new ItemRequest<ProjectMembership>(this, ProjectMembership.class, path, "GET");
    }
}
