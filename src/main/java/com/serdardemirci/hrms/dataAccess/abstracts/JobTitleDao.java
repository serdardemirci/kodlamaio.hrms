package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
    List<JobTitle> findJobsByNameContaining(String name);
}
