package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    DataResult<List<Job>> getAll();

    Result add(Job job);

    DataResult<List<Job>> getByName(String name);
}
