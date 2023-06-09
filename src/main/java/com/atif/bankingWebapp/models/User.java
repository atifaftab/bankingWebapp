package com.atif.bankingWebapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Table
@NoArgsConstructor(force = true)
public class User implements Serializable {

    private static final long serialVersionUUID = -5023242037893805512L;

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long userId;
    @NonNull @Column(name="password")
    private String password;
    @NonNull @Column(name="active")
    private String active;
    @NonNull @Column(name="email")
    private String emailAdd;
    @NonNull @Column(name="first_name")
    private String nameFirst;
    @NonNull @Column(name="last_name")
    private String nameLast;
    @NonNull @Column(name="contact_num")
    private String contactNum;
    @NonNull @Column(name="dob")
    private String dob;
    @NonNull @Column(name="status")
    private String status;
    @NonNull @Column(name="account_no")
    private String accountNo;
    @NonNull @Column(name="current_balance")
    private String currentBalance;

    public User(String s, String active, String dob, String s1, String s2, String s3, String s4, long l, String s5, String s6, String status) {
    }
}
