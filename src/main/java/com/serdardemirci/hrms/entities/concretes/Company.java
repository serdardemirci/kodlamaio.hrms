package com.serdardemirci.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "companies")
@NoArgsConstructor
public class Company extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website")
    private String website;

    @OneToMany( mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = false)
    //@JoinColumn(referencedColumnName = "id")
    private List<PhoneNumber> phoneNumbers;
}
