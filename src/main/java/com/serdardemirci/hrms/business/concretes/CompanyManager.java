package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.CompanyService;
import com.serdardemirci.hrms.dataAccess.abstracts.CompanyDao;
import com.serdardemirci.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> getAll() {
        return this.companyDao.findAll();
    }
}
