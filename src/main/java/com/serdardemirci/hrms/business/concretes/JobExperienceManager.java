package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.JobExperienceService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.core.utilities.results.SuccessResult;
import com.serdardemirci.hrms.dataAccess.abstracts.JobExperienceDao;
import com.serdardemirci.hrms.entities.concretes.JobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobExperienceManager implements JobExperienceService {

    @Autowired
    private JobExperienceDao jobExperienceDao;

    @Override
    public DataResult<List<JobExperience>> getAllByResumeIdOrderByEndedDateDesc(int resumeId) {
        return new SuccessDataResult<>(this.jobExperienceDao.getAllByResumeIdOrderByEndedDateDesc(resumeId));
    }

    @Override
    public Result add(JobExperience jobExperience) {
        this.jobExperienceDao.save(jobExperience);
        return new SuccessResult();
    }
}
