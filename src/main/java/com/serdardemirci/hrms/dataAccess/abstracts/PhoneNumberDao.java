package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.entities.concretes.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneNumberDao extends JpaRepository<PhoneNumber, Integer> {
    List<PhoneNumber> findPhoneNumbersByCompanyId(int id);
}
