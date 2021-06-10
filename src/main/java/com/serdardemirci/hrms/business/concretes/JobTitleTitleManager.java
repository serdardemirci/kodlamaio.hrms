package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.JobTitleService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.dataAccess.abstracts.JobTitleDao;
import com.serdardemirci.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleTitleManager implements JobTitleService {

    @Autowired
    private JobTitleDao jobTitleDao;

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>
                (this.jobTitleDao.findAll(), "Data listed");
    }

    @Override
    public Result add(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessDataResult(jobTitle, "Data added");
    }

    @Override
    public DataResult<List<JobTitle>> getByName(String name) {
        return new SuccessDataResult<List<JobTitle>>
                (this.jobTitleDao.findJobsByNameContaining(name), "Data listed");
    }
}
