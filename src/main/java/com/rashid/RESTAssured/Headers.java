package com.rashid.RESTAssured;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.ContentType;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Headers {
    private final static String URL = "https://postman-echo.com/";
    public static void  getJSONInfo() throws JsonProcessingException {
        List<Headers> users =
                given()

                        .when()
                        .contentType(ContentType.JSON)
                        .get(URL  + "get")
                        .then().log().all()

                        .extract().body().jsonPath().getList("headers", Headers.class);

    }

    public static void main(String[] args) throws JsonProcessingException {
        getJSONInfo();
    }




    @JsonProperty("x-forwarded-proto")
    public String xForwardedProto;
    @JsonProperty("x-forwarded-port")
    public String xForwardedPort;
    public String host;
    @JsonProperty("x-amzn-trace-id")
    public String xAmznTraceId;
    @JsonProperty("user-agent")
    public String userAgent;
    public String accept;
    @JsonProperty("postman-token")
    public String postmanToken;
    @JsonProperty("accept-encoding")
    public String acceptEncoding;

    public Headers(String xForwardedProto, String xForwardedPort, String host, String xAmznTraceId, String userAgent, String accept, String postmanToken, String acceptEncoding) {
        this.xForwardedProto = xForwardedProto;
        this.xForwardedPort = xForwardedPort;
        this.host = host;
        this.xAmznTraceId = xAmznTraceId;
        this.userAgent = userAgent;
        this.accept = accept;
        this.postmanToken = postmanToken;
        this.acceptEncoding = acceptEncoding;
    }

    public String getxForwardedProto() {
        return xForwardedProto;
    }

    public String getxForwardedPort() {
        return xForwardedPort;
    }

    public String getHost() {
        return host;
    }

    public String getxAmznTraceId() {
        return xAmznTraceId;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getAccept() {
        return accept;
    }

    public String getPostmanToken() {
        return postmanToken;
    }

    public String getAcceptEncoding() {
        return acceptEncoding;
    }
}
