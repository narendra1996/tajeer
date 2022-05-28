package com.cse.apis.tajeerapis.dto;

import lombok.Data;

@Data
public class SuspensionRequest {
    private Integer id;
    private Integer actualReturnBranchId;
    private Integer suspensionCode;
   private SuspensionPaymentDetails suspensionPaymentDetails;
    private ReturnStatus returnStatus;
}
