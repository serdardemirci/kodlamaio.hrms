package com.serdardemirci.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "resumes")
@NoArgsConstructor
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(targetEntity = Candidate.class)
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;

    @Column(name = "github_link")
    private String githubLink;

    @Column(name = "linked_in_link")
    private String linkedInLink;

    @Column(name = "photo")
    private String photoLink;

    @Column(name = "description")
    private String description;

    @Column(name = "is_active")
    private boolean active;

    /*
    @OneToMany(mappedBy = "resume")
    private List<Language> languages;

    @OneToMany(mappedBy = "resume")
    private List<Technology> technologies;

    @OneToMany(mappedBy = "resume")
    private List<JobExperience> jobExperiences;

    @OneToMany(mappedBy = "resume")
    private List<Education> educations;
     */

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;
}
