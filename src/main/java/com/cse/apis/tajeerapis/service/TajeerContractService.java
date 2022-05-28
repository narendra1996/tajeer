package com.cse.apis.tajeerapis.service;


import com.cse.apis.tajeerapis.dto.SaveContractRequest;
import com.cse.apis.tajeerapis.utility.RestClientTemplate;
import com.cse.apis.tajeerapis.utility.RestTemplateRequest;
import com.cse.apis.tajeerapis.utility.RestUtility;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TajeerContractService {

    @Autowired
    RestClientTemplate restClient;

    @Value("${tajeer.save-contract.url}")
    private String tajeerSaveContractURL;

    @Value("${tajeer.get-contract.url}")
    private String tajeerGetContractURL;




    public ResponseEntity saveContract(SaveContractRequest contract) throws JsonProcessingException {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.POST);
        restTemplateRequest.setUrl(tajeerSaveContractURL);
        restTemplateRequest.setPayload(RestUtility.convertPojoToJson(contract));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity getContract(String contractId)
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.POST);
        restTemplateRequest.setUrl(tajeerGetContractURL.replace("contractId",contractId));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }
}
