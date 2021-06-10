package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.EducationService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/educations")
public class EducationsController {

    @Autowired
    private EducationService educationService;

    @GetMapping("/getAll")
    DataResult<List<Education>> getAll(){
        return this.educationService.getAll();
    }

    @GetMapping("/getAllByResumeIdOrderByEndedDateDesc")
    DataResult<List<Education>> getAllByResumeIdOrderByEndedDateDesc(int resumeId){
        return this.educationService.getAllByResumeIdOrderByEndedDateDesc(resumeId);
    }

    @PostMapping("/save")
    Result add(@Valid @RequestBody Education education){
        return this.educationService.add(education);
    }
}
