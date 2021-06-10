package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.TechnologyService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.core.utilities.results.SuccessResult;
import com.serdardemirci.hrms.dataAccess.abstracts.TechnologyDao;
import com.serdardemirci.hrms.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {

    @Autowired
    private TechnologyDao technologyDao;

    @Override
    public DataResult<List<Technology>> getAllByResumeId(int resumeId) {
        return new SuccessDataResult<>(this.technologyDao.getAllByResumeId(resumeId));
    }

    @Override
    public Result add(Technology technology) {
        this.technologyDao.save(technology);
        return new SuccessResult();
    }
}
