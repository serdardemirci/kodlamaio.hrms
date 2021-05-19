package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.JobSeekerService;
import com.serdardemirci.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekersController {

    @Autowired
    private JobSeekerService jobSeekerService;

    @GetMapping("/getall")
    public List<JobSeeker> getAll(){
        return this.jobSeekerService.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity<?> add(@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerService.add(jobSeeker);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerService.update(jobSeeker);
    }
}
