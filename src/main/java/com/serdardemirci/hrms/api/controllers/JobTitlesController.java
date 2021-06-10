package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.JobTitleService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/jobTitles")
public class JobTitlesController {

    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping("/getAll")
    public DataResult<List<JobTitle>> getAll(){
        return this.jobTitleService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobTitle jobTitle){
        return this.jobTitleService.add(jobTitle);
    }

    @PostMapping("/getByName")
    public DataResult<List<JobTitle>> getByName(@RequestParam String name){
        return this.jobTitleService.getByName(name);
    }

}
