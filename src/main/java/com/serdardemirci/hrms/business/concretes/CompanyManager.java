package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.CompanyService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.dataAccess.abstracts.CompanyDao;
import com.serdardemirci.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> getAll() {
        return this.companyDao.findAll();
    }

    @Override
    public void add(Company company) {
        if(company.getPassword().equals(company.getRepeatedPassword())){
            this.companyDao.save(company);
        }
    }

    @Override
    public Company getPhoneNumberByCompanyId(int id) {
        return this.companyDao.findById(id).orElse(null);
        //select * from componies where (companies.id=id)
    }

    @Override
    public DataResult<Company> getByCompanyNameAndPhoneNumbers_PhoneNumber(
            String companyName,
            String phoneNumber) {
                return new SuccessDataResult<Company>(
                        this.companyDao.getByCompanyNameAndPhoneNumbers_PhoneNumber(
                                companyName,
                                phoneNumber),
                        "Islem basarili");
    }


}
