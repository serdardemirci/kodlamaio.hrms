package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.adapter.abstracts.ValidatePersonService;
import com.serdardemirci.hrms.business.abstracts.CandidateService;
import com.serdardemirci.hrms.core.utilities.results.ErrorResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessResult;
import com.serdardemirci.hrms.dataAccess.abstracts.CandidateDao;
import com.serdardemirci.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    private ValidatePersonService validatePersonService;

    @Autowired
    public CandidateManager(CandidateDao candidateDao,
                            @Qualifier("fakeMernis") ValidatePersonService validatePersonService) {
        this.candidateDao = candidateDao;
        this.validatePersonService = validatePersonService;
    }

    @Override
    public List<Candidate> getAll() {
        return this.candidateDao.findAll();
    }

    @Override
    public Result add(Candidate candidate) {
        if(this.validatePersonService.validate(candidate)){
            this.candidateDao.save(candidate);
            return new SuccessResult();
        }
        return new ErrorResult("Islem basarisiz");
    }

    @Override
    public ResponseEntity<?> update(Candidate candidate) {
        Candidate updadetCandidate = this.candidateDao.findJobSeekerById(candidate.getId());
        if(updadetCandidate != null) {
            updadetCandidate.setPassword(candidate.getPassword());
            if(candidate.getEmail() != null){
                updadetCandidate.setEmail(candidate.getEmail());
            }

            //updadetJobSeeker.setNationalIdentity(jobSeeker.getNationalIdentity());
            return ResponseEntity.ok(this.candidateDao.save(updadetCandidate));
        }
        else{
            return ResponseEntity.badRequest().body("Kayit bulunamadi");
        }
    }
}
