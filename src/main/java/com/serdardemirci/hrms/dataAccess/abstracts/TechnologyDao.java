package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechnologyDao extends JpaRepository<Technology, Integer> {

    List<Technology> getAllByResumeId(int resumeId);
}
