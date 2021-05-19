package com.serdardemirci.hrms.adapter.abstracts;

import com.serdardemirci.hrms.entities.concretes.JobSeeker;
import com.serdardemirci.hrms.entities.concretes.Person;
import com.serdardemirci.hrms.entities.concretes.User;

public interface ValidatePersonService {
    boolean validate(Person person);
}
