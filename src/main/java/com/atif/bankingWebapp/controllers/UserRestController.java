package com.atif.bankingWebapp.controllers;

import com.atif.bankingWebapp.models.User;
import com.atif.bankingWebapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class UserRestController {

    @Autowired
    UserService service;


    @GetMapping("/simpleString")
    public String simpleString(){
        return "Yesssss";
    }

    @GetMapping("/getUser")
    public List<User> getUser(){

        return service.getUser();

    }

//    @GetMapping()
//    public String thingsget(){
//
//        return "Yesss working";
//
//    }

    @PostMapping("/registration")
    public void createUser(@RequestBody User user){
        service.saveUser(user);
    }


    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable long id){
        return service.getUserById(id);
    }
}
