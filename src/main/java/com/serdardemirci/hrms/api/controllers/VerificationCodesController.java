package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.VerificationCodeService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/verificationcodes")
public class VerificationCodesController {

    @Autowired
    private VerificationCodeService verificationCodeService;

    @GetMapping("/getall")
    DataResult<List<VerificationCode>> getAll(){
        return this.verificationCodeService.getAll();
    }

    @PostMapping("/save")
    Result add(VerificationCode verificationCode){
        //verificationCode.setCreatedAt(LocalDateTime.now());
                //.valueOf(LocalDateTime.now()));
        return this.verificationCodeService.add(verificationCode);
    }
}
