package com.aquaticinformatics.aquarius.sdk.helpers;

import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning;
import com.google.gson.GsonBuilder;
import net.servicestack.client.*;
import net.servicestack.func.Func;
import net.servicestack.func.Predicate;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public class SdkServiceClient extends net.servicestack.client.JsonServiceClient {

    public static final String HttpScheme = "http";

    public static final String HttpsScheme = "https";

    private String endpointUrl;

    private final boolean _serializeNulls;

    private final IFieldNamer _fieldNamer;

    private final Map<Object, Type> _typeAdapters;

    private static Pattern unescapedQuotePattern;

    static {
        // A quote preceeded by an even number of backslashes
        unescapedQuotePattern = Pattern.compile("((?<!\\\\)(?:\\\\{2})*)(\\\")");
    }

    private SdkServiceClient(String baseUrl, Map<Object, Type> typeAdapters, IFieldNamer fieldNamer, boolean serializeNulls) {
        super(baseUrl);
        endpointUrl = baseUrl;
        _typeAdapters = typeAdapters;
        _fieldNamer = fieldNamer;
        _serializeNulls = serializeNulls;
    }

    public static SdkServiceClient Create(String server, String baseUrl, Map<Object, Type> typeAdapters, IFieldNamer fieldNamer) {
        return Create(server, baseUrl, typeAdapters, fieldNamer, false);
    }

    public static SdkServiceClient Create(String server, String baseUrl, Map<Object, Type> typeAdapters, IFieldNamer fieldNamer, boolean serializeNulls) {
        setUserAgent();
        server = resolveServerWithDefaultScheme(server, HttpScheme);
        return new SdkServiceClient(server + baseUrl, typeAdapters, fieldNamer, serializeNulls);
    }

    public static String resolveServerWithDefaultScheme(String server, String defaultScheme) {
        if (!server.startsWith("http")) {
            server = defaultScheme + "://" + server;
        }
        return server;
    }

    private static void setUserAgent() {
        buildUserAgentOnce();
        System.setProperty("http.agent", userAgent);
    }

    private static String userAgent = null;

    private static void buildUserAgentOnce() {
        if (userAgent != null) {
            return;
        }
        // TODO: Compose the agent dynamically from its dependencies. Until we figure that out, hack it in at build time via a Powershell script during the AppVeyor build.
        userAgent = "com.aquaticinformatics.aquarius.sdk:<<VERSION_PLACEHOLDER>>/net.servicestack.client:1.033";
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public String authenticate(String username, String password) {
        return post(new Provisioning.PostSession().setUsername(username).setEncryptedPassword(password));
    }

    public void logoff() {
        delete(new Provisioning.DeleteSession());
    }

    public void setAuthenticationToken(String authenticationToken) {
        RequestFilter = request -> request.setRequestProperty("X-Authentication-Token", authenticationToken);
    }

    public void setApiToken(String apiToken) {
        RequestFilter = request -> request.setRequestProperty(HttpHeaders.Authorization, "token " + apiToken);
    }

    @Override
    public GsonBuilder getGsonBuilder() {
        GsonBuilder gsonBuilder = super.getGsonBuilder();
        _fieldNamer.configure(gsonBuilder);
        if (_serializeNulls) {
            gsonBuilder.serializeNulls();
        }
        _typeAdapters.forEach((object, type) -> gsonBuilder.registerTypeAdapter(type, object));
        return gsonBuilder;
    }

    public <TResponse> TResponse postFileWithRequest(File fileToUpload, IReturn<TResponse> requestDto) {
        try (FileInputStream contentToUpload = new FileInputStream(fileToUpload.getPath())) {
            return postFileWithRequest(contentToUpload, fileToUpload.getName(), requestDto);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public <TResponse> TResponse postFileWithRequest(InputStream contentToUpload, String fileName, IReturn<TResponse> requestDto) {
        return postFileWithRequest(contentToUpload, fileName, requestDto, "upload");
    }

    public <TResponse> TResponse postFileWithRequest(InputStream contentToUpload, String fileName, IReturn<TResponse> requestDto, String fieldName) {
        return postFileWithRequest(contentToUpload, fileName, requestDto, fieldName, null);
    }

    public <TResponse> TResponse postFileWithRequest(InputStream contentToUpload, String fileName, IReturn<TResponse> requestDto, String fieldName, ArrayList<ContentPart> contentParts) {
        Route route = getRoute(requestDto);
        if (route == null) {
            throw new RuntimeException("No REST route found for " + requestDto.getClass().getName());
        }
        StringBuffer urlBuffer = new StringBuffer(this.endpointUrl);
        Map<String, String> queryParams = ResolveTemplateParameters(route, urlBuffer, requestDto);
        StringBuilder queryBuilder = new StringBuilder();
        queryParams.forEach((name, value) -> appendQueryParameter(queryBuilder, name, value));
        urlBuffer.append(queryBuilder.toString());
        String requestUrl = urlBuffer.toString();
        MultipartBuilder builder = new MultipartBuilder();
        if (contentParts != null) {
            contentParts.forEach(contentPart -> builder.addContentPart(contentPart));
        }
        builder.addFileContent(fieldName, fileName, contentToUpload);
        builder.finish();
        return send(requestUrl, HttpMethods.Post, builder.toByteArray(), builder.getContentType(), requestDto.getResponseType());
    }

    // The remaining overrides are required so that all requests are sent to routes that match the .NET SDK behaviour.
    // When a DTO has one-and-only-one @Route attribute (which is true for all AQTS public APIs, but not for all
    // possible ServiceStack consumers), then prefer the named route.
    // Else, fall back to the "/json/reply/{DtoClassName}" route.
    @Override
    public void setBaseUrl(String baseUrl) {
        this.endpointUrl = Utils.trimEnd(baseUrl, '/');
        super.setBaseUrl(baseUrl);
    }

    private static Pattern templateParameterPattern;

    static {
        templateParameterPattern = Pattern.compile("\\{(\\w+)\\}");
    }

    private Map<String, String> ResolveTemplateParameters(Route route, StringBuffer urlBuffer, Object requestDto) {
        ArrayList<Field> fields = Func.toList(Utils.getSerializableFields(requestDto.getClass()));
        try {
            Matcher m = templateParameterPattern.matcher(route.Path());
            while (m.find()) {
                String parameterName = m.group(1);
                new Here("Randoop", 191).given(m, "16.xml").checkEq(parameterName, "id");
                Field f = Func.first(fields, field -> field.getName().equalsIgnoreCase(parameterName));
                if (f == null) {
                    continue;
                }
                Object val = f.get(requestDto);
                if (val == null) {
                    continue;
                }
                m.appendReplacement(urlBuffer, URLEncoder.encode(Utils.stripQuotes(getGson().toJson(val)), "UTF-8"));
                fields.remove(f);
            }
            m.appendTail(urlBuffer);
        } catch (IllegalAccessException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return createJsvPropertyMap(requestDto, fields);
    }

    private Map<String, String> createJsvPropertyMap(Object requestDto, ArrayList<Field> fields) {
        Map<String, String> propertyMap = new HashMap<String, String>();
        try {
            for (Field f : fields) {
                Object val = f.get(requestDto);
                if (val == null) {
                    continue;
                }
                String name = f.getName();
                if (f.isAnnotationPresent(DataMember.class)) {
                    DataMember dataMember = f.getDeclaredAnnotation(DataMember.class);
                    String aliasedName = dataMember.Name();
                    if (aliasedName != null && !aliasedName.isEmpty()) {
                        name = aliasedName;
                    }
                }
                String value = removeUnescapedQuotes(getGson().toJson(val));
                propertyMap.put(name, value);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return propertyMap;
    }

    protected String removeUnescapedQuotes(String source) {
        if (!Utils.isNullOrEmpty(source)) {
            return unescapedQuotePattern.matcher(source).replaceAll("$1");
        }
        return source;
    }

    @Override
    public String createUrl(Object requestDto, Map<String, String> query) {
        return createUrl(requestDto, query, HttpMethods.Get);
    }

    public String createUrl(Object requestDto, String httpMethod) {
        return createUrl(requestDto, null, httpMethod);
    }

    public String createUrl(Object requestDto, Map<String, String> query, String httpMethod) {
        Route route = getRoute(requestDto);
        if (route == null) {
            return super.createUrl(requestDto, query);
        }
        StringBuffer urlBuffer = new StringBuffer(this.endpointUrl);
        StringBuilder queryBuilder = new StringBuilder();
        Map<String, String> propertyMap = ResolveTemplateParameters(route, urlBuffer, requestDto);
        if (httpMethod == HttpMethods.Get) {
            propertyMap.forEach((name, value) -> appendQueryParameter(queryBuilder, name, value));
            if (query != null) {
                query.forEach((key, val) -> appendQueryParameter(queryBuilder, key, val));
            }
        }
        urlBuffer.append(queryBuilder.toString());
        return urlBuffer.toString();
    }

    public Route getRoute(Object requestDto) {
        Class<?> requestDtoClass = requestDto.getClass();
        Route[] routes = requestDtoClass.getDeclaredAnnotationsByType(Route.class);
        if (routes.length != 1) {
            return null;
        }
        return routes[0];
    }

    private void appendQueryParameter(StringBuilder queryBuilder, String name, String value) {
        try {
            queryBuilder.append(queryBuilder.length() == 0 ? "?" : "&");
            queryBuilder.append(URLEncoder.encode(camelCase(name), "UTF-8"));
            queryBuilder.append("=");
            if (value != null) {
                queryBuilder.append(URLEncoder.encode(value, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String camelCase(String value) {
        return Utils.isNullOrEmpty(value) ? value : value.substring(0, 1).toLowerCase() + value.substring(1);
    }

    // Utils.combinePath(replyUrl, typeName(request)) => 6 usages
    @Override
    public <TResponse> TResponse post(IReturn<TResponse> request) {
        return send(createUrl(request, HttpMethods.Post), HttpMethods.Post, request, request.getResponseType());
    }

    @Override
    public void post(IReturnVoid request) {
        send(createUrl(request, HttpMethods.Post), HttpMethods.Post, request, IReturnVoid.class);
    }

    @Override
    public <TResponse> TResponse put(IReturn<TResponse> request) {
        return send(createUrl(request, HttpMethods.Put), HttpMethods.Put, request, request.getResponseType());
    }

    @Override
    public void put(IReturnVoid request) {
        send(createUrl(request, HttpMethods.Put), HttpMethods.Put, request, IReturnVoid.class);
    }

    @Override
    public void send(IReturnVoid request) {
        String httpMethod = GetSendMethod(request);
        send(createUrl(request, httpMethod), httpMethod, request, IReturnVoid.class);
    }

    @Override
    public <TResponse> TResponse sendRequest(Object request, Object responseClass) {
        String httpMethod = GetSendMethod(request);
        String url = createUrl(request, httpMethod);
        if (hasRequestBody(httpMethod)) {
            return send(url, httpMethod, request, responseClass);
        } else {
            return send(url, httpMethod, null, null, responseClass);
        }
    }

    // Other
    @Override
    public <TResponse> TResponse delete(IReturn<TResponse> request) {
        return send(createUrl(request, HttpMethods.Delete), HttpMethods.Delete, request.getResponseType());
    }

    @Override
    public void delete(IReturnVoid request) {
        send(createUrl(request, HttpMethods.Delete), HttpMethods.Delete, IReturnVoid.class);
    }

    @Override
    public <TResponse> TResponse delete(IReturn<TResponse> request, Map<String, String> queryParams) {
        return send(createUrl(request, queryParams, HttpMethods.Delete), HttpMethods.Delete, request.getResponseType());
    }
}
