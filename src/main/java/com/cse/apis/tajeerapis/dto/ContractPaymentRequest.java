package com.cse.apis.tajeerapis.dto;

import lombok.Data;

@Data
public class ContractPaymentRequest {
    private Integer id;
    private Integer actualReturnBranchId;
    private Integer odometerReading;
    private Integer availableFuel;
    private Double sparePartsCost;
    private Double damageCost;
    private Double oilChangeCost;
    private Double paid;
    private Double discount;
    private String contractActualEndDate;

}
