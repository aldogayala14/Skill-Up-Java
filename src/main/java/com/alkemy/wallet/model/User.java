package com.alkemy.wallet.model;

<<<<<<< HEAD
import lombok.Data;
=======


import lombok.Data;

>>>>>>> 1a79b388bb929dd14ec024a346f5246876cc74e6
import lombok.NoArgsConstructor;



import lombok.NoArgsConstructor;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;



@Entity
@Data

@Table(name="USERS")
<<<<<<< HEAD
@Data
@SQLDelete(sql = "UPDATE users SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
@NoArgsConstructor
@Entity
=======
@NoArgsConstructor
@SQLDelete(sql = "UPDATE users SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
>>>>>>> 1a79b388bb929dd14ec024a346f5246876cc74e6
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "id")
    private Role roleId;


    @Column(name = "CREATED_DATE", updatable = false)
    @CreationTimestamp
    private Timestamp creationDate;
    @UpdateTimestamp
    private Timestamp updateDate;


    private boolean deleted = Boolean.FALSE;


    public User(String firstName, String lastName, String email, String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.creationDate = Timestamp.valueOf(LocalDateTime.now());
    }
}

