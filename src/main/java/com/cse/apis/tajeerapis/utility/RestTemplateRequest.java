package com.cse.apis.tajeerapis.utility;

import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;

import java.util.Map;

@Data
public class RestTemplateRequest {
    private String url;
    private HttpMethod httpMethod;
    private Class<?> responseClass;
    private String payload;
    private MultiValueMap queryParams;


//    public RestTemplateRequest(String url, HttpMethod httpMethod, Class<?> responseClass, String payload, MultiValueMap params) {
//        this.url = url;
//        this.httpMethod = httpMethod;
//        this.responseClass = responseClass;
//        this.payload = payload;
//        this.queryParams = params;
//    }
}
