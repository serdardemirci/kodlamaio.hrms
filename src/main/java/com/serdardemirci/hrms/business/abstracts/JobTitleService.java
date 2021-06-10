package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    DataResult<List<JobTitle>> getAll();

    Result add(JobTitle jobTitle);

    DataResult<List<JobTitle>> getByName(String name);
}
