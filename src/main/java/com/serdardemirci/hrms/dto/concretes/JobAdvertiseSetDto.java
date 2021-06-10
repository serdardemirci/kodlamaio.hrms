package com.serdardemirci.hrms.dto.concretes;

import lombok.Data;

import java.time.LocalDate;

@Data
public class JobAdvertiseSetDto {

    private int maxSalary;
    private int minSalary;
    private String numberOfOpenPosition;
    private String jobDefinition;
    private LocalDate expirationDate;
    private int jobTitleId;
    private int cityId;
    private int companyId;
    private boolean active;

}
