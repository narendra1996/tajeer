package com.cse.apis.tajeerapis.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RestClientTemplate {

    @Value("${tajeer.app-id}")
    private String tajeerAppId;

    @Value("${tajeer.app-key}")
    private String tajeerAppKey;

    @Value("${tajeer.auth.token}")
    private String tajeerAuthToken;

    private final String APP_ID =  "app-id";
    private final String APP_KEY = "app-key";
    private final String AUTHORIZATION = "Authorization";

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(){
        this.restTemplate = new RestTemplate();
    }

    public ResponseEntity invokeSecureRestAPI(RestTemplateRequest restTemplateRequest)
    {
        ResponseEntity response = null;
        HttpHeaders headers = getAuthHeaders();
        final HttpEntity httpEntity = new HttpEntity<>(restTemplateRequest.getPayload(), headers);
        String url = UriComponentsBuilder.fromHttpUrl(restTemplateRequest.getUrl().trim()).queryParams(restTemplateRequest.getQueryParams()).toUriString();
        response = restTemplate.exchange(url,restTemplateRequest.getHttpMethod(),httpEntity,restTemplateRequest.getResponseClass());
        return  response;

    }


    private HttpHeaders getAuthHeaders()
    {
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(APP_ID,tajeerAppId);
        headers.set(APP_KEY,tajeerAppKey);
        headers.set(AUTHORIZATION,tajeerAuthToken);
        return headers;
    }

}
