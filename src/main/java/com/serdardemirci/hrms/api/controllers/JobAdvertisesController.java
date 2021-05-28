package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.JobAdvertiseService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.JobAdvertise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jobadvertise")
public class JobAdvertisesController {

    @Autowired
    private JobAdvertiseService jobAdvertiseService;

    @GetMapping("/getall")
    DataResult<List<JobAdvertise>> getAll(){
        return this.jobAdvertiseService.getAll();
    }

    @GetMapping("/getallsorted")
    DataResult<List<JobAdvertise>> getAllSorted(){
        return this.jobAdvertiseService.getAllSorted();
    }

    @PostMapping("/save")
    Result add(@RequestBody JobAdvertise jobAdvertise){
        return this.jobAdvertiseService.add(jobAdvertise);
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
