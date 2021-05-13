package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    void add(Employee employee);
}
