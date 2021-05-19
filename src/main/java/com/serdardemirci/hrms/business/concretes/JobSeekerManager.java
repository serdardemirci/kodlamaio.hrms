package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.adapter.abstracts.ValidatePersonService;
import com.serdardemirci.hrms.business.abstracts.JobSeekerService;
import com.serdardemirci.hrms.dataAccess.abstracts.JobSeekerDao;
import com.serdardemirci.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private ValidatePersonService validatePersonService;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, ValidatePersonService validatePersonService) {
        this.jobSeekerDao = jobSeekerDao;
        this.validatePersonService = validatePersonService;
    }

    @Override
    public List<JobSeeker> getAll() {
        return this.jobSeekerDao.findAll();
    }

    @Override
    public ResponseEntity<?> add(JobSeeker jobSeeker) {
        if(this.validatePersonService.validate(jobSeeker)){

            return ResponseEntity.ok(this.jobSeekerDao.save(jobSeeker));
        }
        return ResponseEntity.badRequest().body("Islem basarisiz");
    }

    @Override
    public ResponseEntity<?> update(JobSeeker jobSeeker) {
        JobSeeker updadetJobSeeker = this.jobSeekerDao.findJobSeekerById(jobSeeker.getId());
        if(updadetJobSeeker != null) {
            updadetJobSeeker.setPassword(jobSeeker.getPassword());
            if(jobSeeker.getEmail() != null){
                updadetJobSeeker.setEmail(jobSeeker.getEmail());
            }

            //updadetJobSeeker.setNationalIdentity(jobSeeker.getNationalIdentity());
            return ResponseEntity.ok(this.jobSeekerDao.save(updadetJobSeeker));
        }
        else{
            return ResponseEntity.badRequest().body("Kayit bulunamadi");
        }
    }
}
