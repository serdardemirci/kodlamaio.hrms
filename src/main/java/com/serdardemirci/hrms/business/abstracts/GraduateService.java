package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.core.utilities.results.DataResult;
import com.serdardemirci.hrms.core.utilities.results.Result;
import com.serdardemirci.hrms.entities.concretes.Graduate;

import java.util.List;

public interface GraduateService {
    DataResult<List<Graduate>> getAll();
    Result add(Graduate graduate);


}
