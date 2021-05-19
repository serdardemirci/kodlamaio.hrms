package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.entities.concretes.Company;
import com.serdardemirci.hrms.entities.concretes.PhoneNumber;

import java.util.List;

public interface PhoneNumberService {
    List<PhoneNumber> getPhoneNumbersById(int id);
}
