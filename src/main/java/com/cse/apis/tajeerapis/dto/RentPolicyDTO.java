package com.cse.apis.tajeerapis.dto;

import com.cse.apis.tajeerapis.pojo.RentPolicy;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RentPolicyDTO implements Serializable {
    private List<RentPolicy> rentPolicies;

}
