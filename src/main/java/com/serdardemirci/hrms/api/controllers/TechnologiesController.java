package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.TechnologyService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/technologies")
public class TechnologiesController {

    @Autowired
    private TechnologyService technologyService;

    @GetMapping("/getAllByResumeId")
    DataResult<List<Technology>> getAllByResumeId(int resumeId){
        return this.technologyService.getAllByResumeId(resumeId);
    }

    @PostMapping("/save")
    Result add(@Valid @RequestBody Technology technology){
        return this.technologyService.add(technology);
    }
}
