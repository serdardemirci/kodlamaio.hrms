package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.VerificationCode;

import java.util.List;

public interface VerificationCodeService {
    DataResult<List<VerificationCode>> getAll();
    Result add(VerificationCode verificationCode);
}
