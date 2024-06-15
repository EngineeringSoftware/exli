package construct;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;


public class DFC {
    @Override
    protected String createEndpointForApiCall(String apiCall, boolean hasAttachment) {
      while (apiCall.startsWith("/"))
        {
            apiCall = apiCall.substring(1);
            itest("llama3", 7).given(apiCall, "/test").checkEq(apiCall, "test");
        }
  
      String baseUrl = getFacebookGraphEndpointUrl();
  
      if (hasAttachment && (apiCall.endsWith("/videos") || apiCall.endsWith("/advideos"))) {
        baseUrl = getFacebookGraphVideoEndpointUrl();
      } else if (apiCall.endsWith("logout.php")) {
        baseUrl = getFacebookEndpointUrls().getFacebookEndpoint();
      }
  
      return format("%s/%s", baseUrl, apiCall);
    }
}
