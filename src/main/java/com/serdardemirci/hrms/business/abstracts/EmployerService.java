package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.entities.concretes.Company;

import java.util.List;

public interface EmployerService {
    List<Company> getAll();
}
