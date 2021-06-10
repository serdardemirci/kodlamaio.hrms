package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.CandidateService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Candidate;
import com.serdardemirci.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/candidates")
public class CandidatesController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/getAll")
    public DataResult<List<Candidate>> getAll(){
        return this.candidateService.getAll();
    }

    @PostMapping("/save")
    public Result add(@Valid @RequestBody Candidate candidate){
        return this.candidateService.add(candidate);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Candidate candidate){
        return this.candidateService.update(candidate);
    }

    @PostMapping("/findByEmail")
    public DataResult<User> findByEmail(@RequestParam String email){
        return this.candidateService.findByEmail(email);
    }
}
