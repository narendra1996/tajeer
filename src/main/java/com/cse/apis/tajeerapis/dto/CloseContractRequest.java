package com.cse.apis.tajeerapis.dto;

import lombok.Data;

@Data
public class CloseContractRequest {
    private Integer id;
    private Integer actualReturnBranchId;
    private Integer closureCode;
    private String contractActualEndDate;
    private Integer mainClosureCode;
    private ClosurePaymentDetails closurePaymentDetails;
    private ReturnStatus returnStatus;
}
