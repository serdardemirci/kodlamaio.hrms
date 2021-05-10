package com.serdardemirci.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "jobs_seekers")
@NoArgsConstructor
public class JobSeeker extends User {

    @Column(name = "first_name", length = 25)
    private String firstName;

    @Column(name = "last_name", length = 25)
    private String lastName;

    @Column(name = "national_identity", length = 11, unique = true)
    private String identityNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    public JobSeeker(String email, String password, boolean isVerified, String firstName, String lastName, String identityNumber, LocalDate dateOfBirth) {
        super(email, password, isVerified);
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.dateOfBirth = dateOfBirth;
    }
}
