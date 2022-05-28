package com.cse.apis.tajeerapis.controller;


import com.cse.apis.tajeerapis.service.TajeerLookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TajeerLookupServicesController {

    @Autowired
    TajeerLookupService tajeerLookupService;


    @GetMapping("/lookups/authorization-type")
    public ResponseEntity lookUpAuthorizationTypes()
    {
        return tajeerLookupService.lookUpAuthorizationTypes();
    }

    @GetMapping("/lookups/contract-status")
    public ResponseEntity lookUpContractStatuses()
    {
        return tajeerLookupService.lookUpContractStatuses();
    }

    @GetMapping("/lookups/contract-type")
    public ResponseEntity lookUpContractTypes()
    {
        return tajeerLookupService.lookUpContractTypes();
    }

    @GetMapping("/lookups/external-authorization-countries")
    public ResponseEntity lookupExternalAuthorizationCountries()
    {
        return tajeerLookupService.lookupExternalAuthorizationCountries();
    }

    @GetMapping("/lookups/fuel-type")
    public ResponseEntity lookUpFuelTypes()
    {
        return tajeerLookupService.lookUpFuelTypes();
    }

    @GetMapping("/lookups/id-type")
    public ResponseEntity lookUpIdTypes()
    {
        return tajeerLookupService.lookUpIdTypes();
    }

    @GetMapping("/lookups/payment-method")
    public ResponseEntity lookUpPaymentMethods()
    {
        return tajeerLookupService.lookUpPaymentMethods();
    }

    @GetMapping("/lookups/yakeen-nationality")
    public ResponseEntity lookUpYakeenNationality()
    {
        return tajeerLookupService.lookUpYakeenNationality();
    }

    @GetMapping("/lookups/gccNationality")
    public ResponseEntity lookUpGccNationality()
    {
        return tajeerLookupService.lookUpGccNationality();
    }

    @GetMapping("/lookups/closure-reasons")
    public ResponseEntity lookUpClosureReasons()
    {
        return tajeerLookupService.lookUpClosureReasons();
    }


    @GetMapping("/lookups/closure-reasons/{closure-reason-id}")
    public ResponseEntity lookUpClosureReasons(@PathVariable("closure-reason-id") String closureReasonId)
    {
        return tajeerLookupService.lookUpClosureReason(closureReasonId);
    }

    @GetMapping("/lookups/suspension-reasons")
    public ResponseEntity lookUpSuspensionReasons()
    {
        return tajeerLookupService.lookUpSuspensionReasons();
    }

}
