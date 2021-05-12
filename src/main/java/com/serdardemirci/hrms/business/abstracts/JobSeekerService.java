package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    List<JobSeeker> getAll();
    void add(JobSeeker jobSeeker);
}
