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
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

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
        new Here("Unit", 106).given(path, "http://app/events?resource=1&limit=50").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50" });
        new Here("Unit", 106).given(path, "http://app/workspaces/1").checkEq(components, new String[] { "http://app/workspaces/1" });
        new Here("Unit", 106).given(path, "http://app/events?resource=1&sync=a").checkEq(components, new String[] { "http://app/events", "resource=1&sync=a" });
        new Here("Unit", 106).given(path, "http://app/events?resource=1&limit=50&sync=d").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=d" });
        new Here("Unit", 106).given(path, "http://app/events?resource=1&limit=50&sync=a").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=a" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?opt_fields=foo&offset=a&limit=1").checkEq(components, new String[] { "http://app/projects/1/tasks", "opt_fields=foo&offset=a&limit=1" });
        new Here("Unit", 106).given(path, "http://app/webhooks/222").checkEq(components, new String[] { "http://app/webhooks/222" });
        new Here("Unit", 106).given(path, "http://app/tasks/1/attachments").checkEq(components, new String[] { "http://app/tasks/1/attachments" });
        new Here("Unit", 106).given(path, "http://app/projects/1").checkEq(components, new String[] { "http://app/projects/1" });
        new Here("Unit", 106).given(path, "http://app/webhooks?workspace=1337&limit=50").checkEq(components, new String[] { "http://app/webhooks", "workspace=1337&limit=50" });
        new Here("Unit", 106).given(path, "http://app/user_task_lists/1").checkEq(components, new String[] { "http://app/user_task_lists/1" });
        new Here("Unit", 106).given(path, "http://app/jobs/1").checkEq(components, new String[] { "http://app/jobs/1" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?offset=a&limit=2").checkEq(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=2" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?limit=1&offset=a&opt_fields=foo").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=1&offset=a&opt_fields=foo" });
        new Here("Unit", 106).given(path, "http://app/events?resource=1&sync=a&limit=50").checkEq(components, new String[] { "http://app/events", "resource=1&sync=a&limit=50" });
        new Here("Randoop", 106).given(path, "").checkEq(components, new String[] { "" });
        new Here("Unit", 106).given(path, "http://app/events?resource=1&limit=50&sync=c").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=c" });
        new Here("Unit", 106).given(path, "http://app/users/me?opt_pretty=true").checkEq(components, new String[] { "http://app/users/me", "opt_pretty=true" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks").checkEq(components, new String[] { "http://app/projects/1/tasks" });
        new Here("Unit", 106).given(path, "http://app/webhooks?limit=50&workspace=1337").checkEq(components, new String[] { "http://app/webhooks", "limit=50&workspace=1337" });
        new Here("Unit", 106).given(path, "http://app/portfolios/1").checkEq(components, new String[] { "http://app/portfolios/1" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?opt_fields=foo&limit=2").checkEq(components, new String[] { "http://app/projects/1/tasks", "opt_fields=foo&limit=2" });
        new Here("Randoop", 106).given(path, "https://app.asana.com/api/1.0/webhooks/Sync%20token%20invalid%20or%20too%20old?opt_pretty=false").checkEq(components, new String[] { "https://app.asana.com/api/1.0/webhooks/Sync%20token%20invalid%20or%20too%20old", "opt_pretty=false" });
        new Here("Unit", 106).given(path, "http://app/webhooks").checkEq(components, new String[] { "http://app/webhooks" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?limit=2&opt_fields=foo").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=2&opt_fields=foo" });
        new Here("Unit", 106).given(path, "http://app/users/me").checkEq(components, new String[] { "http://app/users/me" });
        new Here("Unit", 106).given(path, "http://app/tasks?workspace=14916&assignee=me").checkEq(components, new String[] { "http://app/tasks", "workspace=14916&assignee=me" });
        new Here("Unit", 106).given(path, "http://app/project_memberships/1").checkEq(components, new String[] { "http://app/project_memberships/1" });
        new Here("Unit", 106).given(path, "http://app/users/me?opt_fields=name,notes").checkEq(components, new String[] { "http://app/users/me", "opt_fields=name,notes" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?limit=2").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=2" });
        new Here("Unit", 106).given(path, "http://app/tasks/1?opt_fields=gid,name,attachments.name").checkEq(components, new String[] { "http://app/tasks/1", "opt_fields=gid,name,attachments.name" });
        new Here("Unit", 106).given(path, "http://app/users/1").checkEq(components, new String[] { "http://app/users/1" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?offset=a&limit=5").checkEq(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=5" });
        new Here("Unit", 106).given(path, "http://app/portfolio_memberships/1").checkEq(components, new String[] { "http://app/portfolio_memberships/1" });
        new Here("Unit", 106).given(path, "http://app/events?resource=1&limit=50&sync=b").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=b" });
        new Here("Unit", 106).given(path, "http://app/tasks/1").checkEq(components, new String[] { "http://app/tasks/1" });
        new Here("Unit", 106).given(path, "http://app/events?resource=1&limit=50&sync=invalid").checkEq(components, new String[] { "http://app/events", "resource=1&limit=50&sync=invalid" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?limit=2&offset=a").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=2&offset=a" });
        new Here("Unit", 106).given(path, "http://app/teams/1").checkEq(components, new String[] { "http://app/teams/1" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?limit=5&offset=a").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=5&offset=a" });
        new Here("Unit", 106).given(path, "http://app/tasks/1001").checkEq(components, new String[] { "http://app/tasks/1001" });
        new Here("Unit", 106).given(path, "http://app/stories/1").checkEq(components, new String[] { "http://app/stories/1" });
        new Here("Unit", 106).given(path, "http://app/tasks").checkEq(components, new String[] { "http://app/tasks" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?offset=a&limit=1").checkEq(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=1" });
        new Here("Unit", 106).given(path, "http://app/attachments/1").checkEq(components, new String[] { "http://app/attachments/1" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?limit=1&offset=a").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=1&offset=a" });
        new Here("Unit", 106).given(path, "http://app/projects/1/tasks?limit=50").checkEq(components, new String[] { "http://app/projects/1/tasks", "limit=50" });
        new Here("Unit", 106).given(path, "http://app/tags/1").checkEq(components, new String[] { "http://app/tags/1" });
        String result = method + ":" + components[0];
        if (components.length == 2 && components[1].length() > 0) {
            String[] params = components[1].split("&");
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "opt_fields=foo&limit=2" }).checkEq(params, new String[] { "opt_fields=foo", "limit=2" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=1&offset=a&opt_fields=foo" }).checkEq(params, new String[] { "limit=1", "offset=a", "opt_fields=foo" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "opt_fields=foo&offset=a&limit=1" }).checkEq(params, new String[] { "opt_fields=foo", "offset=a", "limit=1" });
            new Here("Unit", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=invalid" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=invalid" });
            new Here("Unit", 109).given(components, new String[] { "http://app/users/me", "opt_fields=name,notes" }).checkEq(params, new String[] { "opt_fields=name,notes" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=1&offset=a" }).checkEq(params, new String[] { "limit=1", "offset=a" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=50" }).checkEq(params, new String[] { "limit=50" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=2" }).checkEq(params, new String[] { "offset=a", "limit=2" });
            new Here("Unit", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=b" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=b" });
            new Here("Unit", 109).given(components, new String[] { "http://app/events", "resource=1&sync=a" }).checkEq(params, new String[] { "resource=1", "sync=a" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=2&opt_fields=foo" }).checkEq(params, new String[] { "limit=2", "opt_fields=foo" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=5" }).checkEq(params, new String[] { "offset=a", "limit=5" });
            new Here("Unit", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=d" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=d" });
            new Here("Unit", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=c" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=c" });
            new Here("Unit", 109).given(components, new String[] { "http://app/tasks/1", "opt_fields=gid,name,attachments.name" }).checkEq(params, new String[] { "opt_fields=gid,name,attachments.name" });
            new Here("Unit", 109).given(components, new String[] { "http://app/webhooks", "limit=50&workspace=1337" }).checkEq(params, new String[] { "limit=50", "workspace=1337" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "offset=a&limit=1" }).checkEq(params, new String[] { "offset=a", "limit=1" });
            new Here("Unit", 109).given(components, new String[] { "http://app/tasks", "workspace=14916&assignee=me" }).checkEq(params, new String[] { "workspace=14916", "assignee=me" });
            new Here("Unit", 109).given(components, new String[] { "http://app/webhooks", "workspace=1337&limit=50" }).checkEq(params, new String[] { "workspace=1337", "limit=50" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=2&offset=a" }).checkEq(params, new String[] { "limit=2", "offset=a" });
            new Here("Unit", 109).given(components, new String[] { "http://app/events", "resource=1&sync=a&limit=50" }).checkEq(params, new String[] { "resource=1", "sync=a", "limit=50" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=2" }).checkEq(params, new String[] { "limit=2" });
            new Here("Unit", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50" }).checkEq(params, new String[] { "resource=1", "limit=50" });
            new Here("Unit", 109).given(components, new String[] { "http://app/projects/1/tasks", "limit=5&offset=a" }).checkEq(params, new String[] { "limit=5", "offset=a" });
            new Here("Unit", 109).given(components, new String[] { "http://app/events", "resource=1&limit=50&sync=a" }).checkEq(params, new String[] { "resource=1", "limit=50", "sync=a" });
            new Here("Unit", 109).given(components, new String[] { "http://app/users/me", "opt_pretty=true" }).checkEq(params, new String[] { "opt_pretty=true" });
            new Here("Randoop", 109).given(components, new String[] { "https://app.asana.com/api/1.0/webhooks/Sync%20token%20invalid%20or%20too%20old", "opt_pretty=false" }).checkEq(params, new String[] { "opt_pretty=false" });
            Arrays.sort(params);
            result += "?" + Joiner.on("&").join(params);
        }
        return result;
    }
}
