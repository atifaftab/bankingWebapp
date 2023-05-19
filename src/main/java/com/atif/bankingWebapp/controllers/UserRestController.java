package com.atif.bankingWebapp.controllers;

import com.atif.bankingWebapp.models.User;
import com.atif.bankingWebapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class UserRestController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/simpleString")
    public String simpleString(){
        return "Yesssss";
    }

    @GetMapping("/getUser")
    public List<User> getUser(){

        return userRepository.findAll();

    }

//    @GetMapping()
//    public String thingsget(){
//
//        return "Yesss working";
//
//    }

    @PostMapping(name = "/addUser")
    public void createUser(User user){
        userRepository.save(user);
    }
}
