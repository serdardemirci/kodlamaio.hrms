package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.JobSeekerService;
import com.serdardemirci.hrms.dataAccess.abstracts.JobSeekerDao;
import com.serdardemirci.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    @Autowired
    private JobSeekerDao jobSeekerDao;
    @Override
    public List<JobSeeker> getAll() {
        return this.jobSeekerDao.findAll();
    }

    @Override
    public void add(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
    }
}
