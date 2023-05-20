package com.atif.bankingWebapp.services;

import com.atif.bankingWebapp.dto.UserDTO;
import com.atif.bankingWebapp.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUser();
    User saveUser(UserDTO user);
//
//    void deleteById(long id);
//
//    UserDTO getUserById(long id);
//
//    void updatUser(long id, UserDTO user);

}
