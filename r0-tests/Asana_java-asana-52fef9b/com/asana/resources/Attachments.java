package com.asana.resources;

import com.asana.Client;
import com.asana.models.Attachment;
import com.asana.requests.CollectionRequest;
import com.asana.requests.ItemRequest;
import com.asana.resources.gen.AttachmentsBase;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import java.io.InputStream;
import java.util.UUID;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class Attachments extends AttachmentsBase {

    public Attachments(Client client) {
        super(client);
    }

    /**
     * Upload a file and attach it to a task
     *
     * @param task        Globally unique identifier for the task.
     * @param fileContent Content of the file to be uploaded
     * @param fileName    Name of the file to be uploaded
     * @param fileType    MIME type of the file to be uploaded
     * @return Request object
     */
    public ItemRequest<Attachment> createOnTask(String task, InputStream fileContent, String fileName, String fileType) {
        MultipartContent.Part part = new MultipartContent.Part().setContent(new InputStreamContent(fileType, fileContent)).setHeaders(new HttpHeaders().set("Content-Disposition", // TODO: escape fileName?
        String.format("form-data; name=\"file\"; filename=\"%s\"", fileName)));
        itest("randoop", 31).given(fileName, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").given(fileType, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").given(fileContent, "15.xml").checkEq(part, "29.xml");
        itest("randoop", 31).given(fileName, "GET").given(fileType, "com.asana.errors.PremiumOnlyError: Payment Required").given(fileContent, "11.xml").checkEq(part, "23.xml");
        itest("randoop", 31).given(fileName, "/tasks//attachments/Not Found/addProject").given(fileType, "").given(fileContent, "15.xml").checkEq(part, "17.xml");
        itest("evosuite", 31).given(fileName, "ARROW").given(fileType, ",NYxUMmC+n\"4#4QT-<").given(fileContent, "2.xml").checkEq(part, "4.xml");
        itest("randoop", 31).given(fileName, "Invalid Request").given(fileType, "GET").given(fileContent, "11.xml").checkEq(part, "28.xml");
        itest("randoop", 31).given(fileName, "0").given(fileType, "0").given(fileContent, "11.xml").checkEq(part, "14.xml");
        itest("randoop", 31).given(fileName, "/tags/Payment Required").given(fileType, "POST").given(fileContent, "25.xml").checkEq(part, "26.xml");
        itest("randoop", 31).given(fileName, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").given(fileType, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").given(fileContent, "9.xml").checkEq(part, "19.xml");
        itest("randoop", 31).given(fileName, "com.asana.errors.PremiumOnlyError: Payment Required").given(fileType, "NoAuthorizationError").given(fileContent, "9.xml").checkEq(part, "10.xml");
        itest("evosuite", 31).given(fileName, "POSTFIX_INCREMENT").given(fileType, null).given(fileContent, "2.xml").checkEq(part, "3.xml");
        itest("evosuite", 31).given(fileName, "EG/-").given(fileType, "EG/-").given(fileContent, "7.xml").checkEq(part, "8.xml");
        itest("randoop", 31).given(fileName, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").given(fileType, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/stories").given(fileContent, "11.xml").checkEq(part, "18.xml");
        itest("randoop", 31).given(fileName, "/portfolios/").given(fileType, "Not Found").given(fileContent, "9.xml").checkEq(part, "13.xml");
        itest("randoop", 31).given(fileName, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=com.asana.errors.InvalidTokenError:%20Sync%20token%20invalid%20or%20too%20old").given(fileType, "https://app.asana.com/-/oauth_authorize?client_id=NoAuthorizationError&redirect_uri=Sync%20token%20invalid%20or%20too%20old&response_type=code&state=200").given(fileContent, "11.xml").checkEq(part, "12.xml");
        itest("randoop", 31).given(fileName, "/webhooks/NoAuthorizationError").given(fileType, "/project_statuses/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").given(fileContent, "25.xml").checkEq(part, "31.xml");
        itest("dev", 31).given(fileName, "filename").given(fileType, "text/plain").given(fileContent, "0.xml").checkEq(part, "1.xml");
        itest("randoop", 31).given(fileName, "/tasks//attachments/Not Found/addProject").given(fileType, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=https://app.asana.com/-/oauth_authorize?client_id%3Dhi!%26redirect_uri%3DRate%2520Limit%2520Enforced%26response_type%3Dcode%26state%3DSync%2520token%2520invalid%2520or%2520too%2520old").given(fileContent, "15.xml").checkEq(part, "16.xml");
        itest("evosuite", 31).given(fileName, "").given(fileType, "").given(fileContent, "5.xml").checkEq(part, "6.xml");
        itest("randoop", 31).given(fileName, "GET").given(fileType, "/attachments/").given(fileContent, "9.xml").checkEq(part, "24.xml");
        itest("randoop", 31).given(fileName, "com.asana.errors.ServerError: Server Error").given(fileType, "POST").given(fileContent, "15.xml").checkEq(part, "30.xml");
        MultipartContent content = new MultipartContent().setMediaType(new HttpMediaType("multipart/form-data").setParameter("boundary", UUID.randomUUID().toString())).addPart(part);
        String path = String.format("/tasks/%s/attachments", task);
        itest("randoop", 41).given(task, "Rate Limit Enforced").checkEq(path, "/tasks/Rate Limit Enforced/attachments");
        itest("evosuite", 41).given(task, "").checkEq(path, "/tasks//attachments");
        itest("randoop", 41).given(task, "/tags").checkEq(path, "/tasks//tags/attachments");
        itest("randoop", 41).given(task, "GET").checkEq(path, "/tasks/GET/attachments");
        itest("randoop", 41).given(task, "/stories//goals/{goal_gid}/addSubgoal").checkEq(path, "/tasks//stories//goals/{goal_gid}/addSubgoal/attachments");
        itest("randoop", 41).given(task, "/portfolios/").checkEq(path, "/tasks//portfolios//attachments");
        itest("evosuite", 41).given(task, "EG/-").checkEq(path, "/tasks/EG/-/attachments");
        itest("randoop", 41).given(task, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert/attachments");
        itest("evosuite", 41).given(task, "POSTFIX_INCREMENT").checkEq(path, "/tasks/POSTFIX_INCREMENT/attachments");
        itest("randoop", 41).given(task, "/goals/Sync token invalid or too old").checkEq(path, "/tasks//goals/Sync token invalid or too old/attachments");
        itest("randoop", 41).given(task, "com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced").checkEq(path, "/tasks/com.asana.errors.RateLimitEnforcedError: Rate Limit Enforced/attachments");
        itest("randoop", 41).given(task, "Invalid Request").checkEq(path, "/tasks/Invalid Request/attachments");
        itest("dev", 41).given(task, "1").checkEq(path, "/tasks/1/attachments");
        itest("randoop", 41).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/attachments");
        itest("randoop", 41).given(task, "").checkEq(path, "/tasks//attachments");
        itest("randoop", 41).given(task, "NoAuthorizationError").checkEq(path, "/tasks/NoAuthorizationError/attachments");
        return new ItemRequest<Attachment>(this, Attachment.class, path, "POST").data(content);
    }

    /**
     * Returns the full record for a single attachment.
     *
     * @param  attachment Globally unique identifier for the attachment.
     * @return Request object
     */
    public ItemRequest<Attachment> findById(String attachment) {
        String path = String.format("/attachments/%s", attachment);
        itest("randoop", 54).given(attachment, "/organizations//teams").checkEq(path, "/attachments//organizations//teams");
        itest("randoop", 54).given(attachment, "Server Error").checkEq(path, "/attachments/Server Error");
        itest("randoop", 54).given(attachment, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 54).given(attachment, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Sync%20token%20invalid%20or%20too%20old");
        itest("randoop", 54).given(attachment, "/portfolios/").checkEq(path, "/attachments//portfolios/");
        itest("dev", 54).given(attachment, "1").checkEq(path, "/attachments/1");
        itest("randoop", 54).given(attachment, "com.asana.errors.RetryableAsanaError: 200").checkEq(path, "/attachments/com.asana.errors.RetryableAsanaError: 200");
        itest("randoop", 54).given(attachment, "/tags").checkEq(path, "/attachments//tags");
        itest("randoop", 54).given(attachment, "urn:ietf:wg:oauth:2.0:oob").checkEq(path, "/attachments/urn:ietf:wg:oauth:2.0:oob");
        itest("randoop", 54).given(attachment, "hi!").checkEq(path, "/attachments/hi!");
        itest("randoop", 54).given(attachment, "/goals/Sync token invalid or too old").checkEq(path, "/attachments//goals/Sync token invalid or too old");
        itest("randoop", 54).given(attachment, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error");
        itest("randoop", 54).given(attachment, "").checkEq(path, "/attachments/");
        itest("randoop", 54).given(attachment, "Invalid Request").checkEq(path, "/attachments/Invalid Request");
        itest("evosuite", 54).given(attachment, "IE'9O[\"[").checkEq(path, "/attachments/IE'9O[\"[");
        itest("randoop", 54).given(attachment, "10").checkEq(path, "/attachments/10");
        itest("evosuite", 54).given(attachment, "&r`br@`Wjtlvn$>27$").checkEq(path, "/attachments/&r`br@`Wjtlvn$>27$");
        itest("evosuite", 54).given(attachment, "d-,)[mh5").checkEq(path, "/attachments/d-,)[mh5");
        itest("evosuite", 54).given(attachment, "cvj}!S!nTnp0mFG").checkEq(path, "/attachments/cvj}!S!nTnp0mFG");
        itest("randoop", 54).given(attachment, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!");
        itest("evosuite", 54).given(attachment, "").checkEq(path, "/attachments/");
        itest("randoop", 54).given(attachment, "https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id&redirect_uri=/goals/%7Bgoal_gid%7D/addSubgoal&response_type=code&state");
        itest("randoop", 54).given(attachment, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found").checkEq(path, "/attachments/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=Rate%20Limit%20Enforced&response_type=code&state=Not%20Found");
        return new ItemRequest<Attachment>(this, Attachment.class, path, "GET");
    }

    /**
     * Returns the compact records for all attachments on the task.
     *
     * @param  task Globally unique identifier for the task.
     * @return Request object
     */
    public CollectionRequest<Attachment> findByTask(String task) {
        String path = String.format("/tasks/%s/attachments", task);
        itest("randoop", 66).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=200&response_type=code&state=Server%20Error/attachments");
        itest("randoop", 66).given(task, "/tags").checkEq(path, "/tasks//tags/attachments");
        itest("randoop", 66).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Not%20Found&redirect_uri&response_type=code&state=Sync%20token%20invalid%20or%20too%20old/attachments");
        itest("randoop", 66).given(task, "Payment Required").checkEq(path, "/tasks/Payment Required/attachments");
        itest("randoop", 66).given(task, "GET").checkEq(path, "/tasks/GET/attachments");
        itest("randoop", 66).given(task, "100").checkEq(path, "/tasks/100/attachments");
        itest("evosuite", 66).given(task, ",RRJ:S3Jd").checkEq(path, "/tasks/,RRJ:S3Jd/attachments");
        itest("randoop", 66).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=hi!/attachments");
        itest("randoop", 66).given(task, "").checkEq(path, "/tasks//attachments");
        itest("evosuite", 66).given(task, "-xOg9").checkEq(path, "/tasks/-xOg9/attachments");
        itest("evosuite", 66).given(task, "").checkEq(path, "/tasks//attachments");
        itest("randoop", 66).given(task, "/workspaces//goals/{goal_gid}/subgoals/tasks").checkEq(path, "/tasks//workspaces//goals/{goal_gid}/subgoals/tasks/attachments");
        itest("randoop", 66).given(task, "https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=Server%20Error&redirect_uri=hi!&response_type=code&state=/tags/attachments");
        itest("evosuite", 66).given(task, "$zDDYZ,41").checkEq(path, "/tasks/$zDDYZ,41/attachments");
        itest("evosuite", 66).given(task, "|dn.6v.Zw[rIC`@Z$:&").checkEq(path, "/tasks/|dn.6v.Zw[rIC`@Z$:&/attachments");
        itest("randoop", 66).given(task, "https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=0&redirect_uri=GET&response_type=code&state=/custom_fields//enum_options/insert/attachments");
        itest("randoop", 66).given(task, "/custom_fields//enum_options/insert").checkEq(path, "/tasks//custom_fields//enum_options/insert/attachments");
        itest("randoop", 66).given(task, "0").checkEq(path, "/tasks/0/attachments");
        itest("randoop", 66).given(task, "Not Found").checkEq(path, "/tasks/Not Found/attachments");
        itest("randoop", 66).given(task, "/attachments/").checkEq(path, "/tasks//attachments//attachments");
        itest("randoop", 66).given(task, "/portfolios//goals/{goal_gid}/subgoals").checkEq(path, "/tasks//portfolios//goals/{goal_gid}/subgoals/attachments");
        itest("evosuite", 66).given(task, "&r`br@`Wjtlvn$>27$").checkEq(path, "/tasks/&r`br@`Wjtlvn$>27$/attachments");
        itest("evosuite", 66).given(task, "PREFIX_DECREMENT").checkEq(path, "/tasks/PREFIX_DECREMENT/attachments");
        itest("randoop", 66).given(task, "POST").checkEq(path, "/tasks/POST/attachments");
        itest("randoop", 66).given(task, "https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject").checkEq(path, "/tasks/https://app.asana.com/-/oauth_authorize?client_id=hi!&redirect_uri=com.asana.errors.RetryableAsanaError:%20Server%20Error&response_type=code&state=/tasks//attachments/Not%20Found/addProject/attachments");
        itest("evosuite", 66).given(task, "GET").checkEq(path, "/tasks/GET/attachments");
        itest("randoop", 66).given(task, "200").checkEq(path, "/tasks/200/attachments");
        return new CollectionRequest<Attachment>(this, Attachment.class, path, "GET");
    }
}
