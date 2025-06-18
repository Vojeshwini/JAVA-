package com.java.xworkz.dto;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ParachutDto {
    private String parachutType;
    private boolean n_reusable;
    private String deploymentType;
    private String manufacturedBy;
    private long n_capacity;
    private long n_cost;
//    private String created_by=LoginConstant.SYSTEM.toString();
//    private Timestamp created_time=Timestamp.valueOf(LocalDateTime);


//    public ParachutDto(String parachutType, boolean nReusable, String deploymentType, String manufacturedBy, long nCapacity, long nCost) {
//    }

}



