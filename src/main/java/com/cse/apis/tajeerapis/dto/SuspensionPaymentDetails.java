package com.cse.apis.tajeerapis.dto;

import lombok.Data;

@Data
public class SuspensionPaymentDetails {
    private Integer paymentMethodCode;
    private Double oilChangeCost;
    private Double discount;
    private Double paid;
    private Double sparePartsCost;
    private Double damageCost;
}
