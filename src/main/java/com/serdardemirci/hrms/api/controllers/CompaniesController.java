package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.CompanyService;
import com.serdardemirci.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/getall")
    public List<Company> getAll(){
        return this.companyService.getAll();
    }
}
