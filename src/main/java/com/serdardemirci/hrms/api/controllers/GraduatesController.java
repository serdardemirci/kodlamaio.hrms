package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.GraduateService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Graduate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/graduates")
public class GraduatesController {

    @Autowired
    private GraduateService graduateService;

    @GetMapping("/getAll")
    DataResult<List<Graduate>> getAll(){
        return this.graduateService.getAll();
    }

    @PostMapping("/save")
    Result add(@Valid @RequestBody Graduate graduate){
        return this.graduateService.add(graduate);
    }
}
