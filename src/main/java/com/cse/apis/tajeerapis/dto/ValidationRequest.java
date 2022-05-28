package com.cse.apis.tajeerapis.dto;

import lombok.Data;

@Data
public class ValidationRequest {
    private Integer workingBranchId;
    private String contractEndDate;
    private VehicleDetails vehicleDetails;
}
