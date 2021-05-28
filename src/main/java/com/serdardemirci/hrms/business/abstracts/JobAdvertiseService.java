package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.JobAdvertise;

import java.util.List;

public interface JobAdvertiseService {
    DataResult<List<JobAdvertise>> getAll();
    DataResult<List<JobAdvertise>> getAllSorted();
    DataResult<List<JobAdvertise>> getAllByCompanyId(int id);
    DataResult<List<JobAdvertise>> getAllByCompanyName(String companyName);
    Result setValueOfActive(int id, boolean active);

    Result add(JobAdvertise jobAdvertise);


}
