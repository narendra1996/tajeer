package com.cse.apis.tajeerapis.service;


import com.cse.apis.tajeerapis.dto.RentPolicyDTO;
import com.cse.apis.tajeerapis.utility.RestClientTemplate;
import com.cse.apis.tajeerapis.utility.RestTemplateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TajeerAPIService {

    @Autowired
    RestClientTemplate restClient;

    @Value("${tajeer.get.rent-poilicies}")
    private String getRentPoliciesURL;

    @Value("${tajeer.get.branches}")
    private String getAccountBranchesURL;

    @Value("${tajeer.get.all.extended.coverage}")
    private String getExtendedCoverages;


    public ResponseEntity getTajeerRentPolicies()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(getRentPoliciesURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }


    public ResponseEntity getAllAccountBranches()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(getAccountBranchesURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity getAllExtendedCoverages()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(getExtendedCoverages);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }




}
