package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Education;

import java.util.List;

public interface EducationService {
    DataResult<List<Education>> getAll();
    DataResult<List<Education>> getAllByResumeIdOrderByEndedDateDesc(int resumeId);
    Result add(Education education);
}
