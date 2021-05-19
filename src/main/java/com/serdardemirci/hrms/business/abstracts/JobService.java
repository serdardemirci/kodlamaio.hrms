package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();

    void add(Job job);

    List<Job> getByName(String name);
}
