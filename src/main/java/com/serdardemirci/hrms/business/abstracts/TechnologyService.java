package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Technology;

import java.util.List;

public interface TechnologyService {
    DataResult<List<Technology>> getAllByResumeId(int resumeId);

    Result add(Technology technology);
}
