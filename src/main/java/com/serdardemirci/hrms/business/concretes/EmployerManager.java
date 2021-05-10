package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.EmployerService;
import com.serdardemirci.hrms.dataAccess.abstracts.EmployerDao;
import com.serdardemirci.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private EmployerDao employerDao;

    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }
}
