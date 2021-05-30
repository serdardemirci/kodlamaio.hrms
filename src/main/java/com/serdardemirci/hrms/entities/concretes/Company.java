package com.serdardemirci.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Table(name = "companies")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertises"})
public class Company extends User {

    @NotBlank(message = "Sirket adi alani bos birakilamaz!")
    @Column(name = "company_name", nullable = false)
    private String companyName;

    @NotBlank(message = "Web adres alani bos birakilamaz!")
    @Column(name = "website", nullable = false)
    private String website;

    @OneToMany( mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(referencedColumnName = "id")
    private List<PhoneNumber> phoneNumbers;

    @OneToMany(mappedBy = "company")
    private List<JobAdvertise> jobAdvertises;
}
