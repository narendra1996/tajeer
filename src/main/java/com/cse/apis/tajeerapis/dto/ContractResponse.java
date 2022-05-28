package com.cse.apis.tajeerapis.dto;

import com.cse.apis.tajeerapis.pojo.*;

public class ContractResponse {

    private Integer id;
    private Integer contractNumber;
    private String contractSignDate;
    private Integer branchId;
    private String contractStartDate;
    private String contractEndDate;
    private Integer rentDuration;
    private Integer allowedLateHours;
    private Integer allowedKmPerDay;
    private Integer allowedKmPerHour;
    private Integer contractTypeCode;
    private RentStatus rentStatus;
    private Renter renter;
    private ExtraDriver extraDriver;
    private RentedDriver rentedDriver;
    private VehicleDetails vehicleDetails;
    private AuthorizationDetails authorizationDetails;
    private PaymentDetails paymentDetails;
    private Integer contractStateTypeCode;
    private Integer contractStatusCode;
    private String driveArea;
    private String plateNumber;
    private String driveAreaCode;
    private String fullFuelCost;
    private Integer rentPolicyId;
    private final String authorizedDriver = null;
    private final String plateNumberDTO = null;
    private final String extendedCoverage = null;
    private final String extendedCoverageId = null;
    private String receiveBranchId;
    private String returnBranchId;
    private final Integer numberOfExtraKms = null;
    private final  Integer workingBranchId = null;
    private PlateInfo plateInfo;
    private String formatedPlateNumber;
}
