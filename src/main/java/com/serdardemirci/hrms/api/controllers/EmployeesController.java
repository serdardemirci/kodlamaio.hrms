package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.EmployeeService;
import com.serdardemirci.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getall")
    public List<Employee> getAll(){
        return this.employeeService.getAll();
    }

    @PostMapping("/save")
    public void add(@Valid @RequestBody Employee employee){
        this.employeeService.add(employee);
    }
}
