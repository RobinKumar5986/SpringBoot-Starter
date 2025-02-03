package com.SpringBoot.SpringStarter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee", uniqueConstraints = {
        @UniqueConstraint(columnNames = "e_mail")
})public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @Note: Auto incrementation of the primary key.
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "e_mail",nullable = false,unique = true) // @Note: email should not be null and must be unique.
    private String eMail;
}
