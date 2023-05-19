package com.atif.bankingWebapp.controllers;

import com.atif.bankingWebapp.models.Account;
import com.atif.bankingWebapp.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountRestController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/getUser")
    public List<Account> getUser(){

        return accountRepository.findAll();

    }

    @PostMapping(name = "/addUser")
    public void createUser(Account account){
        accountRepository.save(account);
    }
}
