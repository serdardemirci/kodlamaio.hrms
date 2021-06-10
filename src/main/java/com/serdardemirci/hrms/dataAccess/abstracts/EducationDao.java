package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.entities.concretes.Education;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.chrono.IsoChronology;
import java.util.Date;
import java.util.List;

public interface EducationDao extends JpaRepository<Education, Integer> {
    //List<Education> getAllByEndedDate(Sort sort);
    //List<Education> getAllByEndedDate_Chronology (Sort sort);
    //List<Education> getAllByEndedDate_Chronology(IsoChronology endedDate_chronology);
    List<Education> getAllByResumeIdOrderByEndedDateDesc(int resumeId);
    //List<Education> getAllByOrderByEndedDateNullAndEndedDateDesc();
    //List<Education> getAllByOrderByEndedDateIsNullOrEndedDateDesc();
}
