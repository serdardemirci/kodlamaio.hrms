package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.entities.concretes.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {
    List<JobExperience> getAllByResumeIdOrderByEndedDateDesc(int resumeId);
}
