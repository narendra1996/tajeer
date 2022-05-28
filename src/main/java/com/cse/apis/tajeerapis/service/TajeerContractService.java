package com.cse.apis.tajeerapis.service;


import com.cse.apis.tajeerapis.dto.*;
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

    @Value("${tajeer.close-contract.url}")
    private String tajeerCloseContractURL;

    @Value("${tajeer.extend-contract.url}")
    private String tajeerExtendContractURL;

    @Value("${tajeer.cancel-contract.url}")
    private String tajeerCancelContractURL;

    @Value("${tajeer.suspend-contract.url}")
    private String tajeerSuspendContractURL;

    @Value("${tajeer.validate-contract.url}")
    private String tajeerValidateContractURL;

    @Value("${tajeer.calculate-contract-payment.url}")
    private String tajeerContractPaymentURL;


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

    public ResponseEntity closeContract(CloseContractRequest closeContractRequest) throws JsonProcessingException {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.PUT);
        restTemplateRequest.setUrl(tajeerCloseContractURL);
        restTemplateRequest.setPayload(RestUtility.convertPojoToJson(closeContractRequest));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity extendContract(ExtendContractRequest extendRequest) throws JsonProcessingException {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.PUT);
        restTemplateRequest.setUrl(tajeerExtendContractURL);
        restTemplateRequest.setPayload(RestUtility.convertPojoToJson(extendRequest));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity cancelContract(CancellationRequest cancellationRequest, String id) throws JsonProcessingException {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.PUT);
        restTemplateRequest.setUrl(tajeerCancelContractURL.replace("contractNumber",id));
        restTemplateRequest.setPayload(RestUtility.convertPojoToJson(cancellationRequest));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity suspendContract(SuspensionRequest suspensionRequest) throws JsonProcessingException {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.PUT);
        restTemplateRequest.setUrl(tajeerSuspendContractURL);
        restTemplateRequest.setPayload(RestUtility.convertPojoToJson(suspensionRequest));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity validateContract(ValidationRequest validationRequest) throws JsonProcessingException {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.POST);
        restTemplateRequest.setUrl(tajeerValidateContractURL);
        restTemplateRequest.setPayload(RestUtility.convertPojoToJson(validationRequest));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity calculateContractPayment(ContractPaymentRequest contractPaymentRequest) throws JsonProcessingException {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.PUT);
        restTemplateRequest.setUrl(tajeerContractPaymentURL);
        restTemplateRequest.setPayload(RestUtility.convertPojoToJson(contractPaymentRequest));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }
}
