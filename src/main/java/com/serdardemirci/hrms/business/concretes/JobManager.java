package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.JobService;
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
    public List<Job> getAll() {
        return this.jobDao.findAll();
    }
}
