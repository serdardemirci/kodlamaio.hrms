package com.serdardemirci.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "companies")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertises"})
public class Company extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website")
    private String website;

    @OneToMany( mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = false)
    //@JoinColumn(referencedColumnName = "id")
    private List<PhoneNumber> phoneNumbers;

    @OneToMany(mappedBy = "company")
    private List<JobAdvertise> jobAdvertises;
}
