package com.serdardemirci.hrms.adapter.concretes;

import com.serdardemirci.hrms.adapter.abstracts.ValidatePersonService;
import com.serdardemirci.hrms.entities.concretes.Individual;
import org.springframework.stereotype.Service;

@Service("fakeMernis")
public class FakePersonValidate implements ValidatePersonService {
    @Override
    public boolean validate(Individual individual) {
        return true;
    }
}
