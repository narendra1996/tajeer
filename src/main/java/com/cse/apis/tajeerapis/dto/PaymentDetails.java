package com.cse.apis.tajeerapis.dto;

import lombok.Data;

@Data
public class PaymentDetails {
    private Integer paymentMethodCode;
    private Integer discount;
    private Integer paid;
}
