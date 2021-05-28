package com.serdardemirci.hrms.entities.concretes;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "candidates")
@NoArgsConstructor
public class Candidate extends Individual {

}
