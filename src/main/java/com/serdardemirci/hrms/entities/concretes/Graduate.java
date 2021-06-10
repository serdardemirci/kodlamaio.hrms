package com.serdardemirci.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Table(name = "edu_graduates")
@NoArgsConstructor
public class Graduate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    @NotBlank
    private String description;

    //@OneToMany(mappedBy = "graduate")
    //private List<Education> educations;

}
