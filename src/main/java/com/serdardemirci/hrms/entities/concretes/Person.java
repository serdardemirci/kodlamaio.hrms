package com.serdardemirci.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "persons")
@NoArgsConstructor
public class Person extends User{

    @Column(name = "first_name", length = 25, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 25, nullable = false)
    private String lastName;

    @Column(name = "national_identity", length = 11, unique = true, nullable = false)
    private String nationalIdentity;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;
}
