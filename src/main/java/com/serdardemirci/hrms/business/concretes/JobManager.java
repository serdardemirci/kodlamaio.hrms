package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.JobService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.core.utilities.results.SuccessResult;
import com.serdardemirci.hrms.dataAccess.abstracts.JobDao;
import com.serdardemirci.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>
                (this.jobDao.findAll(), "Data listed");
    }

    @Override
    public Result add(Job job) {
        this.jobDao.save(job);
        return new SuccessDataResult(job, "Data added");
    }

    @Override
    public DataResult<List<Job>> getByName(String name) {
        return new SuccessDataResult<List<Job>>
                (this.jobDao.findJobsByNameContaining(name), "Data listed");
    }
}
