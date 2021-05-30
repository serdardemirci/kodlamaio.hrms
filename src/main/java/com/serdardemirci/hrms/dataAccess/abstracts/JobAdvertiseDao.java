package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.entities.concretes.JobAdvertise;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertiseDao extends JpaRepository<JobAdvertise, Integer> {
    List<JobAdvertise> getAllByActiveTrue();
    List<JobAdvertise> getAllByActiveTrue(Sort sort);
    List<JobAdvertise> getAllByCompanyId(int id);
    List<JobAdvertise> getAllByCompany_CompanyName(String companyName);
    List<JobAdvertise> getByCompany_CompanyNameContainsIgnoreCase(String companyName);
}
