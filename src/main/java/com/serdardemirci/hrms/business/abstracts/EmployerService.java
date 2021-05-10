package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.entities.concretes.Employer;
import org.hibernate.resource.beans.container.internal.JpaCompliantLifecycleStrategy;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
}
