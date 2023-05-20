package com.atif.bankingWebapp.controllers;

import com.atif.bankingWebapp.dto.UserDTO;
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

//    @GetMapping("/getUser")
//    public List<UserDTO> getUser(){
//        return service.getUser();
//
//    }

//    @GetMapping()
//    public String thingsget(){
//
//        return "Yesss working";
//
//    }

    @PostMapping("/registration")
    public void createUser(@RequestBody UserDTO user){
        service.saveUser(user);
    }


//    @DeleteMapping("/deleteById/{id}")
//    public void deleteById(@PathVariable long id){
//        service.deleteById(id);
//    }
//
//    @GetMapping("/getUserById/{id}")
//    public UserDTO getUserById(@PathVariable long id){
//        return service.getUserById(id);
//    }
//
//    @PutMapping("/updateUserById/{id}")
//    public void updateUserById(@PathVariable long id, @RequestBody UserDTO user){
//        //user.setUserId(id);
//        service.updatUser(id, user);
//    }
}
