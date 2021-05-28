package com.serdardemirci.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employees")
@NoArgsConstructor
public class Employee extends Individual {
}
