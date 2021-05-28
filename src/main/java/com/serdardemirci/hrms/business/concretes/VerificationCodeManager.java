package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.VerificationCodeService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.core.utilities.results.SuccessResult;
import com.serdardemirci.hrms.dataAccess.abstracts.VerificationCodeDao;
import com.serdardemirci.hrms.entities.concretes.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerificationCodeManager implements VerificationCodeService {

    @Autowired
    private VerificationCodeDao verificationCodeDao;

    @Override
    public DataResult<List<VerificationCode>> getAll() {
        return new SuccessDataResult(this.verificationCodeDao.findAll());
    }

    @Override
    public Result add(VerificationCode verificationCode) {
        this.verificationCodeDao.save(verificationCode);
        return new SuccessResult();
    }
}
