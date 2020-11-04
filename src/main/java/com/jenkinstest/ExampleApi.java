package com.jenkinstest;

import com.dto.request.LoginRequestFo;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class ExampleApi {

    private static final String LOGIN = "/authentication/api/login";

    private static String token;
    private static final Map<String, String> params = new HashMap<>();
    private String body;
    private static String auth;

    private ExampleApi() {}

    public static Response login() {
        LoginRequestFo login = new LoginRequestFo("perf3", "Password123");
        String domain = "https://onlinesit.securitybank.com:9443";
        return given()
                .config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()))
                .relaxedHTTPSValidation()
                .queryParams(params)
                .body(login)
                .auth().preemptive().oauth2(Objects.isNull(auth) ? "" : auth)
                .contentType("application/json")
                .post(format("%s%s", domain, LOGIN))
                .prettyPeek();
    }

}
