package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Candidate;
import com.serdardemirci.hrms.entities.concretes.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
    Result add(Candidate candidate);

    ResponseEntity<?> update(Candidate candidate);

    DataResult<User> findByEmail(String email);
}
