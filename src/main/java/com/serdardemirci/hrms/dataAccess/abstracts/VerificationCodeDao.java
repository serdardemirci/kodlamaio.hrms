package com.serdardemirci.hrms.dataAccess.abstracts;

import com.serdardemirci.hrms.entities.concretes.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeDao extends JpaRepository<VerificationCode,Long> {
}
