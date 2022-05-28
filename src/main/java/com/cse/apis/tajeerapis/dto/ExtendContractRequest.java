package com.cse.apis.tajeerapis.dto;

import lombok.Data;

@Data
public class ExtendContractRequest {
    private Integer id;
    private Integer contractNumber;
    private Integer workingBranchId;
    private Integer renterOTPValue;
    private Integer otpValue;
    private String contractEndDate;
    private PaymentDetails paymentDetails;
}
