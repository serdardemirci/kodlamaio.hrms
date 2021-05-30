package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.JobAdvertiseService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.dto.concretes.JobAdvertiseConverter;
import com.serdardemirci.hrms.dto.concretes.JobAdvertiseGetDto;
import com.serdardemirci.hrms.dto.concretes.JobAdvertiseSetDto;
import com.serdardemirci.hrms.entities.concretes.City;
import com.serdardemirci.hrms.entities.concretes.Company;
import com.serdardemirci.hrms.entities.concretes.Job;
import com.serdardemirci.hrms.entities.concretes.JobAdvertise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/jobadvertise")
public class JobAdvertisesController {

    @Autowired private JobAdvertiseService jobAdvertiseService;
    @Autowired private JobAdvertiseConverter jobAdvertiseConverter;


    @GetMapping("/getall")
    DataResult<List<JobAdvertiseGetDto>> getAll(){
        DataResult<List<JobAdvertise>> jobAdvertises = this.jobAdvertiseService.getAll();
        List<JobAdvertiseGetDto> jobAdvertiseGetDtos = jobAdvertiseConverter.entityToDto(jobAdvertises.getData());
        return new SuccessDataResult(jobAdvertiseGetDtos);
    }

    @GetMapping("/getallsorted")
    DataResult<List<JobAdvertise>> getAllSorted(){
        return this.jobAdvertiseService.getAllSorted();
    }

    @PostMapping("/save")
    Result add(@Valid @RequestBody JobAdvertiseSetDto jobAdvertiseSetDto){
        return this.jobAdvertiseService.add(this.jobAdvertiseConverter.dtoToEntity(jobAdvertiseSetDto));
    }

    @PostMapping("/getallbycompanyid")
    DataResult<List<JobAdvertise>> getAllByCompanyId(@RequestParam int id){
        return this.jobAdvertiseService.getAllByCompanyId(id);
    }

    @PostMapping("/getallbycompanyname")
    DataResult<List<JobAdvertise>> getAllByCompanyName(@RequestParam String companyName){
        return this.jobAdvertiseService.getAllByCompanyName(companyName);
    }

    @PutMapping("/setvalueofactive")
    Result setValueOfActive(@RequestParam("id") int id, @RequestParam("active") boolean active){
        return this.jobAdvertiseService.setValueOfActive(id, active);
    }
}
