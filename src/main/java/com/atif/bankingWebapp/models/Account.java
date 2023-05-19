package com.atif.bankingWebapp.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@Table
@NoArgsConstructor(force = true)
public class Account {

    private static final long serialVersionUUID = -5023242037893805512L;

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private long accountId;
    @NonNull @Column(name="balance")
    private String balance;
    @Column(name="active")
    private String active;
    @NonNull @Column(name="role")
    private String role;
    @NonNull @Column(name = "user_id")
    private long userId;
}
