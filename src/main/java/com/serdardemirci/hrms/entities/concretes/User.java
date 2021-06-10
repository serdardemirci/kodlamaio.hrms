package com.serdardemirci.hrms.entities.concretes;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private int id;

    @Email(message = "Gecerli Email adresi giriniz!")
    @NotBlank(message = "Email alani bos birakilamaz!")
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Size(min = 6, max = 26, message = "Sifreniz 6 ile 26 karakter arasinda olmalidir!")
    @Column(name = "password", nullable = false)
    private String password;

    @Size(min = 6, max = 26, message = "Sifreniz 6 ile 26 karakter arasinda olmalidir!")
    @Transient
    private String repeatedPassword;

    @Column(name = "is_verified", nullable = false)
    private boolean isVerified;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

}
