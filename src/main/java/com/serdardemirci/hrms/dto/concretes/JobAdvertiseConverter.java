package com.serdardemirci.hrms.dto.concretes;

import com.serdardemirci.hrms.entities.concretes.City;
import com.serdardemirci.hrms.entities.concretes.Company;
import com.serdardemirci.hrms.entities.concretes.JobTitle;
import com.serdardemirci.hrms.entities.concretes.JobAdvertise;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class JobAdvertiseConverter {

    public JobAdvertiseGetDto entityToDto(JobAdvertise jobAdvertise){
        JobAdvertiseGetDto dto = new JobAdvertiseGetDto();
        dto.setCompanyName(jobAdvertise.getCompany().getCompanyName());
        dto.setJobTitle(jobAdvertise.getJobTitle().getName());
        dto.setNumberOfOpenPosition(jobAdvertise.getNumberOfOpenPosition());
        dto.setCreatedAt(jobAdvertise.getCreatedAt());
        dto.setExpirationDate(jobAdvertise.getExpirationDate());

        return dto;
    }

    public JobAdvertise dtoToEntity(JobAdvertiseSetDto dto){
        JobAdvertise jobAdvertise = new JobAdvertise();
        jobAdvertise.setMaxSalary(dto.getMaxSalary());
        jobAdvertise.setMinSalary(dto.getMinSalary());
        jobAdvertise.setNumberOfOpenPosition(dto.getNumberOfOpenPosition());
        jobAdvertise.setJobDefinition(dto.getJobDefinition());
        jobAdvertise.setExpirationDate(dto.getExpirationDate());
        JobTitle jobTitle = new JobTitle();
        jobTitle.setId(dto.getJobTitleId());
        jobAdvertise.setJobTitle(jobTitle);
        City city = new City();
        city.setId(dto.getCityId());
        jobAdvertise.setCity(city);
        Company company = new Company();
        company.setId(dto.getCompanyId());
        jobAdvertise.setCompany(company);
        jobAdvertise.setActive(dto.isActive());

        return jobAdvertise;
    }

    public List<JobAdvertiseGetDto> entityToDto(List<JobAdvertise> jobAdvertises){
        return jobAdvertises.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }
}
