package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.PhoneNumberService;
import com.serdardemirci.hrms.dataAccess.abstracts.CompanyDao;
import com.serdardemirci.hrms.dataAccess.abstracts.PhoneNumberDao;
import com.serdardemirci.hrms.entities.concretes.Company;
import com.serdardemirci.hrms.entities.concretes.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneNumberManager implements PhoneNumberService {
    @Autowired
    private PhoneNumberDao phoneNumberDao;

    @Override
    public List<PhoneNumber> getPhoneNumbersById(int id) {
        return this.phoneNumberDao.findPhoneNumbersByCompanyId(id);
    }
}
