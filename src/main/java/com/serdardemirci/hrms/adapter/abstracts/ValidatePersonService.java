package com.serdardemirci.hrms.adapter.abstracts;

import com.serdardemirci.hrms.entities.concretes.Individual;

public interface ValidatePersonService {
    boolean validate(Individual individual);
}
