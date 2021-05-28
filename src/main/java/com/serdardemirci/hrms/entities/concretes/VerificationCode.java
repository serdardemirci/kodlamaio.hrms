package com.serdardemirci.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "verification_codes")
public class VerificationCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "is_used")
    private boolean isUsed;

    @JsonIgnore
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;


    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


}
