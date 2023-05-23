package com.dream11.enitity;

import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "ID")
    @NonNull
    private int userId;

    @NonNull
    private String firstName;

    private String lastName;

    private long phoneNumber;

    @Email
    private String gmailId;

}
