package com.cse.apis.tajeerapis.service;

import com.cse.apis.tajeerapis.utility.RestClientTemplate;
import com.cse.apis.tajeerapis.utility.RestTemplateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TajeerLookupService {

    @Autowired
    RestClientTemplate restClient;

    @Value("${tajeer.lookup.authorization-type}")
    private String lookupAuthorizationTypeURL;

    @Value("${tajeer.lookup.contract-status}")
    private String lookupContractStatusURL;

    @Value("${tajeer.lookup.contract-type}")
    private String lookupContractTypeURL;

    @Value("${tajeer.lookup.external-authorization-countries}")
    private String lookupExternalAuthorizationCountriesURL;

    @Value("${tajeer.lookup.fuel-type}")
    private String lookupFuelTypeURL;

    @Value("${tajeer.lookup.id-type}")
    private String lookupIdTypeURL;

    @Value("${tajeer.lookup.payment-method}")
    private String lookupPaymentMethodURL;

    @Value("${tajeer.lookup.yakeen-nationality}")
    private String lookupYakeenNationalityURL;

    @Value("${tajeer.lookup.gccNationality}")
    private String lookupgccNationalityURL;

    @Value("${tajeer.lookup.closure-reasons}")
    private String lookupClosureReasonsURL;

    @Value("${tajeer.lookup.closure-reason}")
    private String lookupClosureReasonURL;

    @Value("${tajeer.lookup.suspension-reasons}")
    private String lookupSuspensionReasonsURL;

    public ResponseEntity lookUpAuthorizationTypes()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupAuthorizationTypeURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpContractStatuses()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupContractStatusURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpContractTypes()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupContractTypeURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookupExternalAuthorizationCountries()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupExternalAuthorizationCountriesURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpFuelTypes()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupFuelTypeURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpIdTypes()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupIdTypeURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpPaymentMethods()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupPaymentMethodURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpYakeenNationality()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupYakeenNationalityURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpGccNationality()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupgccNationalityURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpClosureReasons()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupClosureReasonsURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpClosureReason(String closureReasonId)
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupClosureReasonURL.replace("closure-reason-id",closureReasonId));
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }

    public ResponseEntity lookUpSuspensionReasons()
    {
        RestTemplateRequest restTemplateRequest = new RestTemplateRequest();
        restTemplateRequest.setHttpMethod(HttpMethod.GET);
        restTemplateRequest.setUrl(lookupSuspensionReasonsURL);
        restTemplateRequest.setResponseClass(String.class);
        return restClient.invokeSecureRestAPI(restTemplateRequest);
    }


}
