package com.serdardemirci.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "job_advertises")
@NoArgsConstructor
public class JobAdvertise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "number_of_open_position", nullable = false)
    private int numberOfOpenPosition;

    @Column(name = "job_definition", nullable = false)
    @Type(type = "text")
    @Lob
    private String jobDefinition;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    //@JsonIgnoreProperties("id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    //@JsonIgnoreProperties("id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    //@JsonIgnoreProperties({"id", "website", "phoneNumbers"})
    private Company company;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @Column(name = "is_active", nullable = false)
    private boolean active;

}
