package com.asana.dispatcher;

import com.google.api.client.http.*;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.common.base.Joiner;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class MockDispatcher extends Dispatcher {

    public class Call {

        public LowLevelHttpRequest request;

        public LowLevelHttpResponse response;

        public Map<String, List<String>> headers;

        public String requestBody;

        public JsonElement parsedRequestBody;

        public Call(LowLevelHttpRequest request, LowLevelHttpResponse response, String requestBody, Map<String, List<String>> headers) {
            this.request = request;
            this.response = response;
            this.requestBody = requestBody;
            this.headers = headers;
            try {
                this.parsedRequestBody = new JsonParser().parse(requestBody);
            } catch (Exception e) {
            }
        }
    }

    private HttpTransport transport;

    private HashMap<String, LinkedList<MockLowLevelHttpResponse>> responses;

    public ArrayList<Call> calls;

    public ArrayList<Integer> sleepCalls;

    public MockDispatcher() {
        this.calls = new ArrayList<Call>();
        this.sleepCalls = new ArrayList<Integer>();
        this.responses = new HashMap<String, LinkedList<MockLowLevelHttpResponse>>();
        this.transport = new MockHttpTransport() {

            @Override
            public LowLevelHttpRequest buildRequest(final String method, final String url) throws IOException {
                return new MockLowLevelHttpRequest() {

                    @Override
                    public LowLevelHttpResponse execute() throws IOException {
                        String key = formatRequestKey(method, url);
                        if (responses.containsKey(key) && responses.get(key).size() > 0) {
                            LowLevelHttpResponse response = responses.get(key).removeFirst();
                            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                            if (this.getStreamingContent() != null) {
                                this.getStreamingContent().writeTo(buffer);
                            }
                            calls.add(new Call(this, response, buffer.toString(), this.getHeaders()));
                            return response;
                        } else {
                            throw new IOException("No response registered for " + key);
                        }
                    }
                };
            }
        };
    }

    public HttpRequest buildRequest(String method, GenericUrl url, HttpContent content) throws IOException {
        return this.transport.createRequestFactory().buildRequest(method, url, content);
    }

    public void sleep(long millis) {
        this.sleepCalls.add(new Integer((int) millis));
    }

    public MockHttpResponse registerResponse(String method, String path) {
        MockHttpResponse response = new MockHttpResponse();
        String key = formatRequestKey(method, path);
        if (!responses.containsKey(key)) {
            responses.put(key, new LinkedList<MockLowLevelHttpResponse>());
        }
        responses.get(key).add(response);
        return response;
    }

    public class MockHttpResponse extends MockLowLevelHttpResponse {

        public MockHttpResponse code(int statusCode) {
            return (MockHttpResponse) super.setStatusCode(statusCode);
        }

        public MockHttpResponse content(String content) {
            return (MockHttpResponse) super.setContent(content);
        }

        public MockHttpResponse header(String name, String value) {
            return (MockHttpResponse) super.addHeader(name, value);
        }
    }

    private String formatRequestKey(String method, String path) {
        String[] components = path.split("\\?");
        itest("randoop", 106).given(path, "").checkEq(components, new String[] { "" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?offset=a&limit=2").checkEq(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=2" });
        itest("evosuite", 106).given(path, "/tasks/{task_gid}/dependents").checkEq(components, new String[] { "/tasks/{task_gid}/dependents" });
        itest("evosuite", 106).given(path, "?^JO+p?!_(LTo:|AS").checkEq(components, new String[] { "", "^JO+p", "!_(LTo:|AS" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?limit=5&offset=a").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=5&offset=a" });
        itest("dev", 106).given(path, "http://app/events?resource=1&limit=50&sync=b").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=b" });
        itest("evosuite", 106).given(path, ")Iq!b`Ae=m[4+L*").checkEq(components, new String[] { ")Iq!b`Ae=m[4+L*" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?opt_fields=foo&offset=a&limit=1").checkEq(components, new String[] { "http://app/projects/1/tasks", "opt_fields=foo&offset=a&limit=1" });
        itest("dev", 106).given(path, "http://app/events?resource=1&sync=a&limit=50").checkEq(components, new String[] { "http://app/events", "resource=1&sync=a&limit=50" });
        itest("evosuite", 106).given(path, "com.github.javaparser.metamodel.ForEachStmtMetaModel").checkEq(components, new String[] { "com.github.javaparser.metamodel.ForEachStmtMetaModel" });
        itest("evosuite", 106).given(path, "fEykgMP@/k?").checkEq(components, new String[] { "fEykgMP@/k" });
        itest("dev", 106).given(path, "http://app/tasks/1001").checkEq(components, new String[] { "http://app/tasks/1001" });
        itest("randoop", 106).given(path, "Server Error").checkEq(components, new String[] { "Server Error" });
        itest("dev", 106).given(path, "http://app/users/1").checkEq(components, new String[] { "http://app/users/1" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?limit=2").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=2" });
        itest("randoop", 106).given(path, "/goals/{goal_gid}/addSubgoal").checkEq(components, new String[] { "/goals/{goal_gid}/addSubgoal" });
        itest("evosuite", 106).given(path, "gmy<X6(`F").checkEq(components, new String[] { "gmy<X6(`F" });
        itest("dev", 106).given(path, "http://app/tasks/1").checkEq(components, new String[] { "http://app/tasks/1" });
        itest("dev", 106).given(path, "http://app/users/me?opt_fields=name,notes").checkEq(components, new String[] { "http://app/users/me", "opt_fields=name,notes" });
        itest("randoop", 106).given(path, "Payment Required").checkEq(components, new String[] { "Payment Required" });
        itest("dev", 106).given(path, "http://app/user_task_lists/1").checkEq(components, new String[] { "http://app/user_task_lists/1" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?limit=2&offset=a").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=2&offset=a" });
        itest("randoop", 106).given(path, "/portfolio_memberships//goals/{goal_gid}/addSubgoal").checkEq(components, new String[] { "/portfolio_memberships//goals/{goal_gid}/addSubgoal" });
        itest("dev", 106).given(path, "http://app/users/me?opt_pretty=true").checkEq(components, new String[] { "http://app/users/me", "opt_pretty=true" });
        itest("randoop", 106).given(path, "/organizations//teams").checkEq(components, new String[] { "/organizations//teams" });
        itest("dev", 106).given(path, "http://app/events?resource=1&sync=a").checkEq(components, new String[] { "http://app/events", "resource=1&sync=a" });
        itest("dev", 106).given(path, "http://app/tags/1").checkEq(components, new String[] { "http://app/tags/1" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?offset=a&limit=1").checkEq(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=1" });
        itest("randoop", 106).given(path, "200").checkEq(components, new String[] { "200" });
        itest("dev", 106).given(path, "http://app/events?resource=1&limit=50").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?limit=2&opt_fields=foo").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=2&opt_fields=foo" });
        itest("dev", 106).given(path, "http://app/events?resource=1&limit=50&sync=a").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=a" });
        itest("evosuite", 106).given(path, "AG+g{`xmOMIKE").checkEq(components, new String[] { "AG+g{`xmOMIKE" });
        itest("dev", 106).given(path, "http://app/teams/1").checkEq(components, new String[] { "http://app/teams/1" });
        itest("dev", 106).given(path, "http://app/jobs/1").checkEq(components, new String[] { "http://app/jobs/1" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks").checkEq(components, new String[] { "http://app/projects/1/tasks" });
        itest("evosuite", 106).given(path, "?bqBLA>Ssx1`k|Qb").checkEq(components, new String[] { "", "bqBLA>Ssx1`k|Qb" });
        itest("dev", 106).given(path, "http://app/project_memberships/1").checkEq(components, new String[] { "http://app/project_memberships/1" });
        itest("dev", 106).given(path, "http://app/projects/1").checkEq(components, new String[] { "http://app/projects/1" });
        itest("dev", 106).given(path, "http://app/webhooks").checkEq(components, new String[] { "http://app/webhooks" });
        itest("evosuite", 106).given(path, "").checkEq(components, new String[] { "" });
        itest("dev", 106).given(path, "http://app/tasks/1/attachments").checkEq(components, new String[] { "http://app/tasks/1/attachments" });
        itest("evosuite", 106).given(path, "q://q:6q").checkEq(components, new String[] { "q://q:6q" });
        itest("randoop", 106).given(path, "/custom_fields//enum_options/insert").checkEq(components, new String[] { "/custom_fields//enum_options/insert" });
        itest("dev", 106).given(path, "http://app/users/me").checkEq(components, new String[] { "http://app/users/me" });
        itest("dev", 106).given(path, "http://app/webhooks?limit=50&workspace=1337").checkEq(components, new String[] { "http://app/webhooks", "limit=50&workspace=1337" });
        itest("randoop", 106).given(path, "Sync token invalid or too old").checkEq(components, new String[] { "Sync token invalid or too old" });
        itest("evosuite", 106).given(path, "f<7t<0%a0b1y://Z5>n1:6").checkEq(components, new String[] { "f<7t<0%a0b1y://Z5>n1:6" });
        itest("randoop", 106).given(path, "NoAuthorizationError").checkEq(components, new String[] { "NoAuthorizationError" });
        itest("dev", 106).given(path, "http://app/tasks").checkEq(components, new String[] { "http://app/tasks" });
        itest("randoop", 106).given(path, "/tags/Payment Required").checkEq(components, new String[] { "/tags/Payment Required" });
        itest("dev", 106).given(path, "http://app/portfolio_memberships/1").checkEq(components, new String[] { "http://app/portfolio_memberships/1" });
        itest("randoop", 106).given(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").checkEq(components, new String[] { "/tasks/https://app.asana.com/-/oauth_authorize", "client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories" });
        itest("randoop", 106).given(path, "/tags").checkEq(components, new String[] { "/tags" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?limit=50").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=50" });
        itest("dev", 106).given(path, "http://app/tasks?workspace=14916&assignee=me").checkEq(components, new String[] { "http://app/tasks", "workspace=14916&assignee=me" });
        itest("randoop", 106).given(path, "/stories//goals/{goal_gid}/addSubgoal").checkEq(components, new String[] { "/stories//goals/{goal_gid}/addSubgoal" });
        itest("randoop", 106).given(path, "GET").checkEq(components, new String[] { "GET" });
        itest("dev", 106).given(path, "http://app/attachments/1").checkEq(components, new String[] { "http://app/attachments/1" });
        itest("evosuite", 106).given(path, "https://app.asana.com/api/1.0/portfolios/0-%3C5Ts*x(P%22vb0?opt_pretty=java.lang.Boolean@0000730477").checkEq(components, new String[] { "https://app.asana.com/api/1.0/portfolios/0-%3C5Ts*x(P%22vb0", "opt_pretty=java.lang.Boolean@0000730477" });
        itest("evosuite", 106).given(path, "{").checkEq(components, new String[] { "{" });
        itest("dev", 106).given(path, "http://app/webhooks?workspace=1337&limit=50").checkEq(components, new String[] { "http://app/webhooks", "workspace=1337&limit=50" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?offset=a&limit=5").checkEq(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=5" });
        itest("evosuite", 106).given(path, "?").checkEq(components, new String[] {});
        itest("dev", 106).given(path, "http://app/events?resource=1&limit=50&sync=invalid").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=invalid" });
        itest("dev", 106).given(path, "http://app/portfolios/1").checkEq(components, new String[] { "http://app/portfolios/1" });
        itest("evosuite", 106).given(path, "}~;v+p6*ewCs51xvr").checkEq(components, new String[] { "}~;v+p6*ewCs51xvr" });
        itest("dev", 106).given(path, "http://app/tasks/1?opt_fields=gid,name,attachments.name").checkEq(components, new String[] { "http://app/tasks/1", "opt_fields=gid,name,attachments.name" });
        itest("randoop", 106).given(path, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(components, new String[] { "https://app.asana.com/-/oauth_authorize", "client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!" });
        itest("randoop", 106).given(path, "/projects/Not Found/removeFollowers").checkEq(components, new String[] { "/projects/Not Found/removeFollowers" });
        itest("dev", 106).given(path, "http://app/events?resource=1&limit=50&sync=c").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=c" });
        itest("evosuite", 106).given(path, "<!29#*d").checkEq(components, new String[] { "<!29#*d" });
        itest("randoop", 106).given(path, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(components, new String[] { "https://app.asana.com/-/oauth_authorize", "client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?opt_fields=foo&limit=2").checkEq(components, new String[] { "http://app/projects/1/tasks", "opt_fields=foo&limit=2" });
        itest("evosuite", 106).given(path, "COMPONENT_TYPE").checkEq(components, new String[] { "COMPONENT_TYPE" });
        itest("evosuite", 106).given(path, ";Gn~8wn%1e?6Xj").checkEq(components, new String[] { ";Gn~8wn%1e", "6Xj" });
        itest("evosuite", 106).given(path, "No response registered for ").checkEq(components, new String[] { "No response registered for " });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?limit=1&offset=a").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=1&offset=a" });
        itest("dev", 106).given(path, "http://app/stories/1").checkEq(components, new String[] { "http://app/stories/1" });
        itest("dev", 106).given(path, "http://app/projects/1/tasks?limit=1&offset=a&opt_fields=foo").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=1&offset=a&opt_fields=foo" });
        itest("dev", 106).given(path, "http://app/workspaces/1").checkEq(components, new String[] { "http://app/workspaces/1" });
        itest("dev", 106).given(path, "http://app/events?resource=1&limit=50&sync=d").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=d" });
        itest("dev", 106).given(path, "http://app/webhooks/222").checkEq(components, new String[] { "http://app/webhooks/222" });
        itest("evosuite", 106).given(path, "com.github.javaparser.ast.stmt.LocalClassDeclarationStmt").checkEq(components, new String[] { "com.github.javaparser.ast.stmt.LocalClassDeclarationStmt" });
        String result = method + ":" + components[0];
        if (components.length == 2 && components[1].length() > 0) {
            String[] params = components[1].split("&");
            itest("randoop", 109).given(components, new String[] { "/tasks/https://app.asana.com/-/oauth_authorize", "client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories" }).checkEq(params, new String[] { "client_id=Server%20Error", "redirect_uri=hi!", "response_type=code", "state=hi!/stories" });
            itest("dev", 109).given(components, new String[] { "http://app/users/me", "opt_pretty=true" }).checkEq(params, new String[] { "opt_pretty=true" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=2&offset=a" }).checkEq(params, new String[] { "limit=2", "offset=a" });
            itest("dev", 109).given(components, new String[] { "http://app/tasks", "workspace=14916&assignee=me" }).checkEq(params, new String[] { "workspace=14916", "assignee=me" });
            itest("dev", 109).given(components, new String[] { "http://app/events", "resource=1&sync=a&limit=50" }).checkEq(params, new String[] { "resource=1", "sync=a", "limit=50" });
            itest("dev", 109).given(components, new String[] { "http://app/users/me", "opt_fields=name,notes" }).checkEq(params, new String[] { "opt_fields=name,notes" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=50" }).checkEq(params, new String[] { "limit=50" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "opt_fields=foo&limit=2" }).checkEq(params, new String[] { "opt_fields=foo", "limit=2" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=1" }).checkEq(params, new String[] { "offset=a", "limit=1" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=1&offset=a" }).checkEq(params, new String[] { "limit=1", "offset=a" });
            itest("randoop", 109).given(components, new String[] { "https://app.asana.com/-/oauth_authorize", "client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!" }).checkEq(params, new String[] { "client_id=Server%20Error", "redirect_uri=hi!", "response_type=code", "state=hi!" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=1&offset=a&opt_fields=foo" }).checkEq(params, new String[] { "limit=1", "offset=a", "opt_fields=foo" });
            itest("dev", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=c" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=c" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=2" }).checkEq(params, new String[] { "limit=2" });
            itest("dev", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=d" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=d" });
            itest("dev", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=b" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=b" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=5" }).checkEq(params, new String[] { "offset=a", "limit=5" });
            itest("dev", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=a" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=a" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=2&opt_fields=foo" }).checkEq(params, new String[] { "limit=2", "opt_fields=foo" });
            itest("dev", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50" }).checkEq(params, new String[] { "resource=1", "limit=50" });
            itest("evosuite", 109).given(components, new String[] { ";Gn~8wn%1e", "6Xj" }).checkEq(params, new String[] { "6Xj" });
            itest("evosuite", 109).given(components, new String[] { "https://app.asana.com/api/1.0/portfolios/0-%3C5Ts*x(P%22vb0", "opt_pretty=java.lang.Boolean@0000730477" }).checkEq(params, new String[] { "opt_pretty=java.lang.Boolean@0000730477" });
            itest("randoop", 109).given(components, new String[] { "https://app.asana.com/-/oauth_authorize", "client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags" }).checkEq(params, new String[] { "client_id=Server%20Error", "redirect_uri=hi!", "response_type=code", "state=/tags" });
            itest("dev", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=invalid" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=invalid" });
            itest("dev", 109).given(components, new String[] { "http://app/tasks/1", "opt_fields=gid,name,attachments.name" }).checkEq(params, new String[] { "opt_fields=gid,name,attachments.name" });
            itest("evosuite", 109).given(components, new String[] { "", "bqBLA>Ssx1`k|Qb" }).checkEq(params, new String[] { "bqBLA>Ssx1`k|Qb" });
            itest("dev", 109).given(components, new String[] { "http://app/webhooks", "workspace=1337&limit=50" }).checkEq(params, new String[] { "workspace=1337", "limit=50" });
            itest("dev", 109).given(components, new String[] { "http://app/webhooks", "limit=50&workspace=1337" }).checkEq(params, new String[] { "limit=50", "workspace=1337" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=2" }).checkEq(params, new String[] { "offset=a", "limit=2" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "opt_fields=foo&offset=a&limit=1" }).checkEq(params, new String[] { "opt_fields=foo", "offset=a", "limit=1" });
            itest("dev", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=5&offset=a" }).checkEq(params, new String[] { "limit=5", "offset=a" });
            itest("dev", 109).given(components, new String[] { "http://app/events", "resource=1&sync=a" }).checkEq(params, new String[] { "resource=1", "sync=a" });
            Arrays.sort(params);
            result += "?" + Joiner.on("&").join(params);
        }
        return result;
    }
}
