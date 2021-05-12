package com.serdardemirci.hrms.entities.concretes;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "jobs_seekers")
@NoArgsConstructor
public class JobSeeker extends Person {

}
