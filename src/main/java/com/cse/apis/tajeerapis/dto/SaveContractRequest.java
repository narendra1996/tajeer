package com.cse.apis.tajeerapis.dto;

import com.cse.apis.tajeerapis.pojo.*;
import lombok.Data;

@Data
public class SaveContractRequest {

    private Renter renter;
    private PaymentDetails paymentDetails;
    private VehicleDetails vehicleDetails;
    private RentStatus rentStatus;
    private Integer workingBranchId;
    private Integer rentPolicyId;
    private RentedDriver rentedDriver;
    private ExtraDriver extraDriver;
    private Integer extendedCoverageId;
    private String contractStartDate;
    private String contractEndDate;
    private AuthorizationDetails authorizationDetails;
    private AdditionalServices additionalServices;
    private Integer allowedKmPerHour;
    private Integer receiveBranchId;
    private Integer returnBranchId;
    private Integer allowedKmPerDay;
    private Integer contractTypeCode;
    private Integer allowedLateHours;


}
