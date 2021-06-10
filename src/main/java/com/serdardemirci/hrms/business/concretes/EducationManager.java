package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.EducationService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.core.utilities.results.SuccessResult;
import com.serdardemirci.hrms.dataAccess.abstracts.EducationDao;
import com.serdardemirci.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.IsoChronology;
import java.util.List;

@Service
public class EducationManager implements EducationService {

    @Autowired
    private EducationDao educationDao;

    @Override
    public DataResult<List<Education>> getAll() {
        return new SuccessDataResult<>(this.educationDao.findAll());
    }

    @Override
    public DataResult<List<Education>> getAllByResumeIdOrderByEndedDateDesc(int resumeId) {
        //Sort sort = Sort.by(Sort.Direction.DESC, "endedDate");
        //Chronology chronology = new ChronoLocalDate().atTime(LocalDate.now());
        //IsoChronology isoChronology = IsoChronology.INSTANCE;
        return new SuccessDataResult<>(this.educationDao.getAllByResumeIdOrderByEndedDateDesc(resumeId));
    }

    @Override
    public Result add(Education education) {
        this.educationDao.save(education);
        return new SuccessResult();
    }
}
