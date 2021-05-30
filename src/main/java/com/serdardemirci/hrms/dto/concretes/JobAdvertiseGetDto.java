package com.serdardemirci.hrms.dto.concretes;

import com.serdardemirci.hrms.entities.concretes.JobAdvertise;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class JobAdvertiseGetDto {

    private String companyName;
    private String jobTitle;
    private String numberOfOpenPosition;
    private Date createdAt;
    private LocalDate expirationDate;

}
