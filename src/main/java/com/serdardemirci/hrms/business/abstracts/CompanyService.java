package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.entities.concretes.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAll();
    void add(Company company);
    Company getPhoneNumberByCompanyId(int id);
    DataResult<Company> getByCompanyNameAndPhoneNumbers_PhoneNumber(String companyName, String phoneNumber);
}
