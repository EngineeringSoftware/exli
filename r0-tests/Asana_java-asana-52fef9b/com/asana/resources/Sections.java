package com.asana.resources;

import com.asana.Client;
import com.asana.models.Section;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.SectionsBase;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Sections extends SectionsBase {

    public Sections(Client client) {
        super(client);
    }

    /**
     * Creates a new section in a project.
     *
     * Returns the full record of the newly created section.
     *
     * @param  project The project to create the section in
     * @return Request object
     */
    public ItemRequest<Section> createInProject(String project) {
        String path = String.format("/projects/%s/sections", project);
        itest("randoop", 24).given(project, "Not Found").checkEq(path, "/projects/Not Found/sections");
        itest("randoop", 24).given(project, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/projects//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects/sections");
        itest("evosuite", 24).given(project, "").checkEq(path, "/projects//sections");
        itest("randoop", 24).given(project, "").checkEq(path, "/projects//sections");
        itest("randoop", 24).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/sections");
        itest("evosuite", 24).given(project, "ud q00hZ/ q").checkEq(path, "/projects/ud q00hZ/ q/sections");
        itest("randoop", 24).given(project, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/sections");
        itest("randoop", 24).given(project, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/sections");
        itest("evosuite", 24).given(project, "\")}&L^!lvT").checkEq(path, "/projects/\")}&L^!lvT/sections");
        itest("randoop", 24).given(project, "10").checkEq(path, "/projects/10/sections");
        itest("randoop", 24).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/sections");
        itest("randoop", 24).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/sections");
        itest("randoop", 24).given(project, "com.asana.errors.RetryableAsanaError: NoAuthorizationError").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: NoAuthorizationError/sections");
        itest("evosuite", 24).given(project, "$vH,*m^").checkEq(path, "/projects/$vH,*m^/sections");
        itest("evosuite", 24).given(project, "%s is not MethodReferenceExpr, it is %s").checkEq(path, "/projects/%s is not MethodReferenceExpr, it is %s/sections");
        itest("randoop", 24).given(project, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/sections");
        itest("randoop", 24).given(project, "com.asana.errors.AsanaError: hi!").checkEq(path, "/projects/com.asana.errors.AsanaError: hi!/sections");
        itest("randoop", 24).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/sections");
        itest("randoop", 24).given(project, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/sections");
        itest("randoop", 24).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/sections");
        itest("randoop", 24).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/sections");
        return new ItemRequest<Section>(this, Section.class, path, "POST");
    }

    /**
     * Returns the compact records for all sections in the specified project.
     *
     * @param  project The project to get sections from.
     * @return Request object
     */
    public CollectionRequest<Section> findByProject(String project) {
        String path = String.format("/projects/%s/sections", project);
        itest("randoop", 36).given(project, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject").checkEq(path, "/projects//tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject/sections");
        itest("randoop", 36).given(project, "0").checkEq(path, "/projects/0/sections");
        itest("randoop", 36).given(project, "POST").checkEq(path, "/projects/POST/sections");
        itest("randoop", 36).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/sections");
        itest("randoop", 36).given(project, "/attachments/Not Found").checkEq(path, "/projects//attachments/Not Found/sections");
        itest("evosuite", 36).given(project, "0k2Eb(?*t1TR0(").checkEq(path, "/projects/0k2Eb(?*t1TR0(/sections");
        itest("randoop", 36).given(project, "Server Error").checkEq(path, "/projects/Server Error/sections");
        itest("randoop", 36).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/sections");
        itest("randoop", 36).given(project, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/projects//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/sections");
        itest("evosuite", 36).given(project, "").checkEq(path, "/projects//sections");
        itest("randoop", 36).given(project, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/projects/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/sections");
        itest("randoop", 36).given(project, "Payment Required").checkEq(path, "/projects/Payment Required/sections");
        itest("randoop", 36).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/sections");
        itest("randoop", 36).given(project, "Not Found").checkEq(path, "/projects/Not Found/sections");
        itest("randoop", 36).given(project, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/sections");
        itest("randoop", 36).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old/sections");
        itest("randoop", 36).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios//sections");
        itest("randoop", 36).given(project, "/goals/{goal_gid}/subgoals").checkEq(path, "/projects//goals/{goal_gid}/subgoals/sections");
        itest("randoop", 36).given(project, "com.asana.errors.RetryableAsanaError: /portfolios/").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: /portfolios//sections");
        itest("randoop", 36).given(project, "Rate Limit Enforced").checkEq(path, "/projects/Rate Limit Enforced/sections");
        itest("randoop", 36).given(project, "hi!").checkEq(path, "/projects/hi!/sections");
        itest("randoop", 36).given(project, "").checkEq(path, "/projects//sections");
        itest("evosuite", 36).given(project, "/projects/$vH,*m^/sections").checkEq(path, "/projects//projects/$vH,*m^/sections/sections");
        itest("randoop", 36).given(project, "/tags").checkEq(path, "/projects//tags/sections");
        itest("randoop", 36).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/sections");
        itest("randoop", 36).given(project, "/organizations//teams").checkEq(path, "/projects//organizations//teams/sections");
        itest("randoop", 36).given(project, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/sections");
        return new CollectionRequest<Section>(this, Section.class, path, "GET");
    }

    /**
     * Returns the complete record for a single section.
     *
     * @param  section The section to get.
     * @return Request object
     */
    public ItemRequest<Section> findById(String section) {
        String path = String.format("/sections/%s", section);
        itest("randoop", 48).given(section, "Forbidden").checkEq(path, "/sections/Forbidden");
        itest("randoop", 48).given(section, "com.asana.errors.AsanaError: hi!").checkEq(path, "/sections/com.asana.errors.AsanaError: hi!");
        itest("randoop", 48).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 48).given(section, "GET").checkEq(path, "/sections/GET");
        itest("evosuite", 48).given(section, "/projects//projects/$vH,*m^/sections/sections").checkEq(path, "/sections//projects//projects/$vH,*m^/sections/sections");
        itest("randoop", 48).given(section, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/sections/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 48).given(section, "0").checkEq(path, "/sections/0");
        itest("randoop", 48).given(section, "200").checkEq(path, "/sections/200");
        itest("randoop", 48).given(section, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 48).given(section, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/sections/com.asana.errors.InvalidRequestError: Invalid Request");
        itest("randoop", 48).given(section, "Sync token invalid or too old").checkEq(path, "/sections/Sync token invalid or too old");
        itest("randoop", 48).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 48).given(section, "/teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects").checkEq(path, "/sections//teams/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/projects");
        itest("evosuite", 48).given(section, null).checkEq(path, "/sections/null");
        itest("randoop", 48).given(section, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/sections//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 48).given(section, "/tags").checkEq(path, "/sections//tags");
        itest("randoop", 48).given(section, "/goals/{goal_gid}/subgoals").checkEq(path, "/sections//goals/{goal_gid}/subgoals");
        itest("randoop", 48).given(section, "/status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/sections//status_updates/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 48).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags");
        itest("evosuite", 48).given(section, "").checkEq(path, "/sections/");
        itest("randoop", 48).given(section, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("randoop", 48).given(section, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 48).given(section, "").checkEq(path, "/sections/");
        itest("evosuite", 48).given(section, "K2LwF.n").checkEq(path, "/sections/K2LwF.n");
        itest("randoop", 48).given(section, "/attachments/Not Found").checkEq(path, "/sections//attachments/Not Found");
        itest("randoop", 48).given(section, "NoAuthorizationError").checkEq(path, "/sections/NoAuthorizationError");
        return new ItemRequest<Section>(this, Section.class, path, "GET");
    }

    /**
     * A specific, existing section can be updated by making a PUT request on
     * the URL for that project. Only the fields provided in the `data` block
     * will be updated; any unspecified fields will remain unchanged. (note that
     * at this time, the only field that can be updated is the `name` field.)
     *
     * When using this method, it is best to specify only those fields you wish
     * to change, or else you may overwrite changes made by another user since
     * you last retrieved the task.
     *
     * Returns the complete updated section record.
     *
     * @param  section The section to update.
     * @return Request object
     */
    public ItemRequest<Section> update(String section) {
        String path = String.format("/sections/%s", section);
        itest("randoop", 69).given(section, "/portfolios/GET/removeMembers").checkEq(path, "/sections//portfolios/GET/removeMembers");
        itest("randoop", 69).given(section, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(path, "/sections//portfolio_memberships//goals/{goal_gid}/addSubgoal");
        itest("randoop", 69).given(section, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 69).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/portfolios/");
        itest("randoop", 69).given(section, "/project_statuses/Server Error").checkEq(path, "/sections//project_statuses/Server Error");
        itest("randoop", 69).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=10");
        itest("randoop", 69).given(section, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/sections//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories");
        itest("randoop", 69).given(section, "Rate Limit Enforced").checkEq(path, "/sections/Rate Limit Enforced");
        itest("evosuite", 69).given(section, "/sections//projects/%s/sections").checkEq(path, "/sections//sections//projects/%s/sections");
        itest("randoop", 69).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 69).given(section, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/sections/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 69).given(section, "10").checkEq(path, "/sections/10");
        itest("randoop", 69).given(section, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 69).given(section, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/sections//goals/{goal_gid}/addSubgoal");
        itest("randoop", 69).given(section, "/attachments/").checkEq(path, "/sections//attachments/");
        itest("randoop", 69).given(section, "Server Error").checkEq(path, "/sections/Server Error");
        itest("randoop", 69).given(section, "Payment Required").checkEq(path, "/sections/Payment Required");
        itest("evosuite", 69).given(section, "com.asana.resources.Sections").checkEq(path, "/sections/com.asana.resources.Sections");
        itest("randoop", 69).given(section, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 69).given(section, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/sections/com.asana.errors.PremiumOnlyError: Payment Required");
        itest("randoop", 69).given(section, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/sections/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 69).given(section, "Not Found").checkEq(path, "/sections/Not Found");
        itest("randoop", 69).given(section, "GET").checkEq(path, "/sections/GET");
        itest("randoop", 69).given(section, "com.asana.errors.InvalidTokenError: Sync token invalid or too old").checkEq(path, "/sections/com.asana.errors.InvalidTokenError: Sync token invalid or too old");
        itest("randoop", 69).given(section, "").checkEq(path, "/sections/");
        itest("randoop", 69).given(section, "/goals/{goal_gid}/subgoals").checkEq(path, "/sections//goals/{goal_gid}/subgoals");
        return new ItemRequest<Section>(this, Section.class, path, "PUT");
    }

    /**
     * A specific, existing section can be deleted by making a DELETE request
     * on the URL for that section.
     *
     * Note that sections must be empty to be deleted.
     *
     * The last remaining section in a board view cannot be deleted.
     *
     * Returns an empty data block.
     *
     * @param  section The section to delete.
     * @return Request object
     */
    public ItemRequest<Section> delete(String section) {
        String path = String.format("/sections/%s", section);
        itest("randoop", 88).given(section, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        itest("randoop", 88).given(section, "Not Found").checkEq(path, "/sections/Not Found");
        itest("randoop", 88).given(section, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject");
        itest("randoop", 88).given(section, "10").checkEq(path, "/sections/10");
        itest("randoop", 88).given(section, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/sections/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced");
        itest("randoop", 88).given(section, "/tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject").checkEq(path, "/sections//tasks/com.asana.errors.InvalidTokenError: Sync token invalid or too old/removeProject");
        itest("randoop", 88).given(section, "/attachments/Not Found").checkEq(path, "/sections//attachments/Not Found");
        itest("randoop", 88).given(section, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/sections/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 88).given(section, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 88).given(section, "").checkEq(path, "/sections/");
        itest("randoop", 88).given(section, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 88).given(section, "/goals/{goal_gid}/addSubgoal").checkEq(path, "/sections//goals/{goal_gid}/addSubgoal");
        itest("evosuite", 88).given(section, "").checkEq(path, "/sections/");
        itest("evosuite", 88).given(section, "v'AGykYV#B").checkEq(path, "/sections/v'AGykYV#B");
        itest("evosuite", 88).given(section, null).checkEq(path, "/sections/null");
        itest("randoop", 88).given(section, "/organizations//teams").checkEq(path, "/sections//organizations//teams");
        itest("randoop", 88).given(section, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/sections/com.asana.errors.RetryableAsanaError: Server Error");
        itest("randoop", 88).given(section, "Rate Limit Enforced").checkEq(path, "/sections/Rate Limit Enforced");
        itest("randoop", 88).given(section, "hi!").checkEq(path, "/sections/hi!");
        itest("evosuite", 88).given(section, "com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy$XmlMapEntriesIterator").checkEq(path, "/sections/com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy$XmlMapEntriesIterator");
        itest("randoop", 88).given(section, "/project_statuses/Server Error").checkEq(path, "/sections//project_statuses/Server Error");
        itest("evosuite", 88).given(section, "POST").checkEq(path, "/sections/POST");
        itest("randoop", 88).given(section, "Server Error").checkEq(path, "/sections/Server Error");
        itest("randoop", 88).given(section, "Sync token invalid or too old").checkEq(path, "/sections/Sync token invalid or too old");
        return new ItemRequest<Section>(this, Section.class, path, "DELETE");
    }

    /**
     * Add a task to a specific, existing section. This will remove the task from other sections of the project.
     *
     * The task will be inserted at the top of a section unless an `insert_before` or `insert_after` parameter is declared.
     *
     * This does not work for separators (tasks with the `resource_subtype` of section).
     *
     * @param  section The section in which to add the task
     * @return Request object
     */
    public ItemRequest<Section> addTask(String section) {
        String path = String.format("/sections/%s/addTask", section);
        itest("randoop", 104).given(section, "Rate Limit Enforced").checkEq(path, "/sections/Rate Limit Enforced/addTask");
        itest("randoop", 104).given(section, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(path, "/sections//tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories/addTask");
        itest("randoop", 104).given(section, "/goals/{goal_gid}/subgoals").checkEq(path, "/sections//goals/{goal_gid}/subgoals/addTask");
        itest("randoop", 104).given(section, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/sections/com.asana.errors.PremiumOnlyError: Payment Required/addTask");
        itest("randoop", 104).given(section, "/portfolios/").checkEq(path, "/sections//portfolios//addTask");
        itest("randoop", 104).given(section, "200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/200https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addTask");
        itest("randoop", 104).given(section, "").checkEq(path, "/sections//addTask");
        itest("randoop", 104).given(section, "/tags").checkEq(path, "/sections//tags/addTask");
        itest("randoop", 104).given(section, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/addTask");
        itest("randoop", 104).given(section, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/sections/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/addTask");
        itest("evosuite", 104).given(section, null).checkEq(path, "/sections/null/addTask");
        return new ItemRequest<Section>(this, Section.class, path, "POST");
    }

    /**
     * Move sections relative to each other in a board view. One of
     * `before_section` or `after_section` is required.
     *
     * Sections cannot be moved between projects.
     *
     * At this point in time, moving sections is not supported in list views, only board views.
     *
     * Returns an empty data block.
     *
     * @param  project The project in which to reorder the given section
     * @return Request object
     */
    public ItemRequest<Section> insertInProject(String project) {
        String path = String.format("/projects/%s/sections/insert", project);
        itest("randoop", 123).given(project, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/sections/insert");
        itest("randoop", 123).given(project, "com.asana.errors.RetryableAsanaError: Server Error").checkEq(path, "/projects/com.asana.errors.RetryableAsanaError: Server Error/sections/insert");
        itest("randoop", 123).given(project, "com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/com.asana.errors.AsanaError: https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/sections/insert");
        itest("randoop", 123).given(project, "Sync token invalid or too old").checkEq(path, "/projects/Sync token invalid or too old/sections/insert");
        itest("randoop", 123).given(project, "").checkEq(path, "/projects//sections/insert");
        itest("randoop", 123).given(project, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=Not%20Found/sections/insert");
        itest("randoop", 123).given(project, "/projects/Rate Limit Enforced/sections").checkEq(path, "/projects//projects/Rate Limit Enforced/sections/sections/insert");
        itest("evosuite", 123).given(project, "Yc4_ygWnpYn").checkEq(path, "/projects/Yc4_ygWnpYn/sections/insert");
        itest("randoop", 123).given(project, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=GET/sections/insert");
        itest("randoop", 123).given(project, "com.asana.errors.PremiumOnlyError: Payment Required").checkEq(path, "/projects/com.asana.errors.PremiumOnlyError: Payment Required/sections/insert");
        itest("evosuite", 123).given(project, " zv'$gX").checkEq(path, "/projects/ zv'$gX/sections/insert");
        itest("randoop", 123).given(project, "Forbidden").checkEq(path, "/projects/Forbidden/sections/insert");
        itest("randoop", 123).given(project, "10").checkEq(path, "/projects/10/sections/insert");
        itest("randoop", 123).given(project, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/projects/urn:ietf:wg:oauth:2.0:oob/sections/insert");
        itest("evosuite", 123).given(project, "H &yWx`zm8x.29_a@").checkEq(path, "/projects/H &yWx`zm8x.29_a@/sections/insert");
        itest("randoop", 123).given(project, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/projects/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state/sections/insert");
        itest("randoop", 123).given(project, "com.asana.errors.InvalidRequestError: Invalid Request").checkEq(path, "/projects/com.asana.errors.InvalidRequestError: Invalid Request/sections/insert");
        itest("randoop", 123).given(project, "200").checkEq(path, "/projects/200/sections/insert");
        itest("randoop", 123).given(project, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/projects/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/sections/insert");
        itest("evosuite", 123).given(project, "").checkEq(path, "/projects//sections/insert");
        itest("randoop", 123).given(project, "NoAuthorizationError").checkEq(path, "/projects/NoAuthorizationError/sections/insert");
        itest("randoop", 123).given(project, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/projects//portfolios//goals/{goal_gid}/subgoals/sections/insert");
        itest("randoop", 123).given(project, "/custom_fields//enum_options/insert").checkEq(path, "/projects//custom_fields//enum_options/insert/sections/insert");
        itest("randoop", 123).given(project, "Invalid Request").checkEq(path, "/projects/Invalid Request/sections/insert");
        return new ItemRequest<Section>(this, Section.class, path, "POST");
    }
}
