package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.EmployerService;
import com.serdardemirci.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employer")
public class EmployersController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/getall")
    public List<Company> getAll(){
        return this.employerService.getAll();
    }
}
