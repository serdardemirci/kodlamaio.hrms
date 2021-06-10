package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.PhoneNumberService;
import com.serdardemirci.hrms.entities.concretes.Company;
import com.serdardemirci.hrms.entities.concretes.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/phoneNumbers")
public class PhoneNumbersController {

    @Autowired
    private PhoneNumberService phoneNumberService;

    @GetMapping("/getPhoneNumbersByUserId")
    List<PhoneNumber> getPhoneNumbersByUserId(int id){
        return this.phoneNumberService.getPhoneNumbersById(id);
    }
}
