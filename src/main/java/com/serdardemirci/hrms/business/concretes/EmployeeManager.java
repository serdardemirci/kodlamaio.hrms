package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.EmployeeService;
import com.serdardemirci.hrms.dataAccess.abstracts.EmployeeDao;
import com.serdardemirci.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAll() {
        return this.employeeDao.findAll();
    }

    @Override
    public void add(Employee employee) {
        this.employeeDao.save(employee);
    }
}
