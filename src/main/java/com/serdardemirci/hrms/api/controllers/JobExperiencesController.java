package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.JobExperienceService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.JobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/jobExperiences")
public class JobExperiencesController {

    @Autowired
    private JobExperienceService jobExperienceService;

    @GetMapping("/getAllByResumeIdOrderByEndedDateDesc")
    DataResult<List<JobExperience>> getAllByResumeIdOrderByEndedDateDesc(int resumeId){
        return this.jobExperienceService.getAllByResumeIdOrderByEndedDateDesc(resumeId);
    }

    @PostMapping("/save")
    Result add(@Valid @RequestBody JobExperience jobExperience){
        return this.jobExperienceService.add(jobExperience);
    }
}
