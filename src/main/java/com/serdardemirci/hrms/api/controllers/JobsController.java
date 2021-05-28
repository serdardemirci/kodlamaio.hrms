package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.JobService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    @Autowired
    private JobService jobService;

    @GetMapping("/getall")
    public DataResult<List<Job>> getAll(){
        return this.jobService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Job job){
        return this.jobService.add(job);
    }

    @PostMapping("/getbyname")
    public DataResult<List<Job>> getByName(@RequestParam String name){
        return this.jobService.getByName(name);
    }

}
