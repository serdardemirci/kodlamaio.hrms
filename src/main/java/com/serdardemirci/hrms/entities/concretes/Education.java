package com.serdardemirci.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "resume_edu")
@NoArgsConstructor
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume"})
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(targetEntity = Resume.class)
    @JoinColumn(name = "resume_id", referencedColumnName = "id")
    private Resume resume;

    @Column(name = "school_name")
    private String schoolName;

    @ManyToOne(targetEntity = Graduate.class)
    @JoinColumn(name = "graduate_id")
    private Graduate graduate;

    @Column(name = "school_department")
    private String schoolDepartment;

    @Column(name = "started_date")
    private LocalDate startedDate;

    @Column(name = "ended_date")
    private LocalDate endedDate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;
}
