package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.entities.concretes.Graduate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GraduateDao extends JpaRepository<Graduate, Integer> {

}
