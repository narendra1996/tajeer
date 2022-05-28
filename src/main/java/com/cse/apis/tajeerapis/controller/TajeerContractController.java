package com.cse.apis.tajeerapis.controller;

import com.cse.apis.tajeerapis.dto.SaveContractRequest;
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


}
