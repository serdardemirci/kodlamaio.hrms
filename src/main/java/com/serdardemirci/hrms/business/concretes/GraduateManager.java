package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.GraduateService;
import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.core.utilities.results.SuccessDataResult;
import com.serdardemirci.hrms.core.utilities.results.SuccessResult;
import com.serdardemirci.hrms.dataAccess.abstracts.GraduateDao;
import com.serdardemirci.hrms.entities.concretes.Graduate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraduateManager implements GraduateService {

    @Autowired
    private GraduateDao graduateDao;


    @Override
    public DataResult<List<Graduate>> getAll() {
        return new SuccessDataResult<>(this.graduateDao.findAll());
    }

    @Override
    public Result add(Graduate graduate) {
        this.graduateDao.save(graduate);
        return new SuccessResult("Graduate added");
    }
}
