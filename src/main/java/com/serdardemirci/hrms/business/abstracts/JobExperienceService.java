package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.JobExperience;

import java.util.List;

public interface JobExperienceService {
    DataResult<List<JobExperience>> getAllByResumeIdOrderByEndedDateDesc(int resumeId);
    Result add(JobExperience jobExperience);
}
