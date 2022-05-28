package com.cse.apis.tajeerapis.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class RentPolicy implements Serializable {
    private Integer id;
    private String shortName;
    private String earlyReturnPolicy;
    private String accidentsAndFaultReportingPolicy;
    private String contractExtensionPolicy;
    private String fuelReturnPolicy;
    private Integer numberOfDaysToExtendBeforeContractEndDate;
    private String faultReporingPolicy;
    private String faultReporingPolicyByPhone;
    private String accidentsReportingPolicyByPhone;
    private String contractExtensionPolicyByPhone;
    private String notes;
    private Boolean active;
    private Boolean defaultPolicy;
    private Boolean newPolicy;
    private String policyDate;
}
