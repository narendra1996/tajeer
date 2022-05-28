package com.cse.apis.tajeerapis.controller;

import com.cse.apis.tajeerapis.dto.*;
import com.cse.apis.tajeerapis.service.TajeerContractService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TajeerContractController {

    @Autowired
    TajeerContractService tajeerContractService;

    @PutMapping("/rent-contract")
    public ResponseEntity saveContract(@RequestBody SaveContractRequest contractRequest) throws JsonProcessingException {
        return tajeerContractService.saveContract(contractRequest);
    }

    @GetMapping("/rent-contract")
    public ResponseEntity getContract(@PathVariable String contractId) throws JsonProcessingException {
        return tajeerContractService.getContract(contractId);
    }

    @PutMapping("/close")
    public ResponseEntity closeContract(@RequestBody CloseContractRequest contractRequest) throws JsonProcessingException {
        return tajeerContractService.closeContract(contractRequest);
    }

    @PutMapping("/extend")
    public ResponseEntity extendContract(@RequestBody ExtendContractRequest extendRequest) throws JsonProcessingException {
        return tajeerContractService.extendContract(extendRequest);
    }

    @PutMapping("/rent-contract/{id}/cancel")
    public ResponseEntity cancelContract(@PathVariable("id") String id, @RequestBody CancellationRequest cancellationRequest)
            throws JsonProcessingException {
        return tajeerContractService.cancelContract(cancellationRequest, id);
    }

    @PutMapping("/rent-contract/suspend")
    public ResponseEntity suspendContract(@RequestBody SuspensionRequest suspensionRequest)
            throws JsonProcessingException {
        return tajeerContractService.suspendContract(suspensionRequest);
    }

    @PostMapping("/rent-contract/validate")
    public ResponseEntity validateContract(@RequestBody ValidationRequest validationRequest)
            throws JsonProcessingException {
        return tajeerContractService.validateContract(validationRequest);
    }

    @PutMapping("/rent-contract/validate")
    public ResponseEntity calculateContractPayment(@RequestBody ContractPaymentRequest contractPaymentRequest)
            throws JsonProcessingException {
        return tajeerContractService.calculateContractPayment(contractPaymentRequest);
    }

}
