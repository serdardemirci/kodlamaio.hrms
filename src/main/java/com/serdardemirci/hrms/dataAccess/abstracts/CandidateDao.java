package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateDao extends JpaRepository<Candidate, Integer> {
    Candidate findJobSeekerById(int id);
}
