package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.JobAdvertiseService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.core.utilities.results.SuccessResult;
import com.serdardemirci.hrms.dataAccess.abstracts.JobAdvertiseDao;
import com.serdardemirci.hrms.entities.concretes.JobAdvertise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertiseManager implements JobAdvertiseService {

    @Autowired
    private JobAdvertiseDao jobAdvertiseDao;

    @Override
    public DataResult<List<JobAdvertise>> getAll() {
        return new SuccessDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getAllByActiveTrue());
    }

    @Override
    public DataResult<List<JobAdvertise>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC, "createdAt");
        return new SuccessDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getAllByActiveTrue(sort));
    }

    @Override
    public DataResult<List<JobAdvertise>> getAllByCompanyId(int id) {
        return new SuccessDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getAllByCompanyId(id));
    }

    @Override
    public DataResult<List<JobAdvertise>> getAllByCompanyName(String companyName) {
        return new SuccessDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getByCompany_CompanyNameContainsIgnoreCase(companyName));
    }

    @Override
    public Result add(JobAdvertise jobAdvertise) {
        this.jobAdvertiseDao.save(jobAdvertise);
        return new SuccessResult();
    }

    @Override
    public Result setValueOfActive(int id, boolean active){
        JobAdvertise tempJobAdvertise = this.jobAdvertiseDao.findById(id).orElse(null);
        tempJobAdvertise.setActive(active);
        this.jobAdvertiseDao.save(tempJobAdvertise);
        return new SuccessResult("Güncellendi");
    }
}
