package com.atif.bankingWebapp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

@Data
@NoArgsConstructor(force = true)
public class UserDTO implements Serializable{
    private long id;
    private String userPassword;
    private String active;
    private String emailAdd;
    private String nameFirst;
    private String nameLast;
    private String contactNum;
    private String dob;
    private String status;
    private String accountNo;
    private String currentBalance;
}
