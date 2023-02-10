package com.visenze.visearch;

import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Client config for http connection timeouts, max connections, etc.
 */
public class ClientConfig {

    public static final int DEFAULT_CONNECTION_TIMEOUT = 5 * 1000;

    public static final int DEFAULT_SOCKET_TIMEOUT = 30 * 1000;

    public static final int DEFAULT_MAX_CONNECTIONS = 50;

    public static final String DEFAULT_USER_AGENT = getDefaultUserAgent();

    public static final String DEFAULT_XREQUEST_WITH = getDefaultXRequestWith();

    private int connectionTimeout = DEFAULT_CONNECTION_TIMEOUT;

    private int socketTimeout = DEFAULT_SOCKET_TIMEOUT;

    private int maxConnection = DEFAULT_MAX_CONNECTIONS;

    private String userAgent = DEFAULT_USER_AGENT;

    public static String getDefaultUserAgent() {
        String version = ViSearch.VISEACH_JAVA_SDK_VERSION;
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String javaVMName = System.getProperty("java.vm.name");
        String javaVMVersion = System.getProperty("java.vm.version");
        String javaVersion = System.getProperty("java.version");
        String language = System.getProperty("user.language");
        String defaultUserAgent = String.format("visearch-java-sdk/%s ", version);
        new Here("Unit", 34).given(version, "1.11.7").checkEq(defaultUserAgent, "visearch-java-sdk/1.11.7 ");
        defaultUserAgent += String.format("%s/%s ", osName, osVersion);
        new Here("Unit", 35).given(osVersion, "5.4.0-86-generic").given(osName, "Linux").given(defaultUserAgent, "visearch-java-sdk/1.11.7 ").checkEq(defaultUserAgent, "visearch-java-sdk/1.11.7 Linux/5.4.0-86-generic ");
        defaultUserAgent += String.format("%s/%s/%s/%s", javaVMName, javaVMVersion, javaVersion, language);
        new Here("Unit", 36).given(javaVMName, "OpenJDK 64-Bit Server VM").given(javaVersion, "1.8.0_302").given(language, "en").given(javaVMVersion, "25.302-b08").given(defaultUserAgent, "visearch-java-sdk/1.11.7 Linux/5.4.0-86-generic ").checkEq(defaultUserAgent, "visearch-java-sdk/1.11.7 Linux/5.4.0-86-generic OpenJDK 64-Bit Server VM/25.302-b08/1.8.0_302/en");
        return defaultUserAgent;
    }

    public static String getDefaultXRequestWith() {
        String version = ViSearch.VISEACH_JAVA_SDK_VERSION;
        String xRequestWith = String.format("visearch-java-sdk/%s", version);
        new Here("Unit", 42).given(version, "1.11.7").checkEq(xRequestWith, "visearch-java-sdk/1.11.7");
        return xRequestWith;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public int getMaxConnection() {
        return maxConnection;
    }

    public void setMaxConnection(int maxConnection) {
        this.maxConnection = maxConnection;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
