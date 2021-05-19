package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.PhoneNumberService;
import com.serdardemirci.hrms.entities.concretes.Company;
import com.serdardemirci.hrms.entities.concretes.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/phonenumbers")
public class PhoneNumbersController {

    @Autowired
    private PhoneNumberService phoneNumberService;

    @GetMapping("/getphonenumbersbyuserid")
    List<PhoneNumber> getPhoneNumbersByUserId(int id){
        return this.phoneNumberService.getPhoneNumbersById(id);
    }
}
