package com.cse.apis.tajeerapis.dto;

import lombok.Data;

@Data
public class ClosurePaymentDetails {
    private Integer paymentMethodCode;
    private Integer oilChangeCost;
    private Integer discount;
    private Integer paid;
}
