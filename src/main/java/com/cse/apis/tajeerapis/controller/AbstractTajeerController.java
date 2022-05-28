package com.cse.apis.tajeerapis.controller;

import com.cse.apis.tajeerapis.dto.RentPolicyDTO;
import com.cse.apis.tajeerapis.service.TajeerAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AbstractTajeerController {

    @Autowired
    TajeerAPIService tajeerAPIService;


    @GetMapping("/rent-policies")
    public ResponseEntity getAllRentPolicies()
    {
        return tajeerAPIService.getTajeerRentPolicies();
    }

    @GetMapping("/branches")
    public ResponseEntity getAllBranches()
    {
        return tajeerAPIService.getAllAccountBranches();
    }

    @GetMapping("/all-extended-coverage")
    public ResponseEntity getAllExtendedCoverages()
    {
        return tajeerAPIService.getAllExtendedCoverages();
    }

}
