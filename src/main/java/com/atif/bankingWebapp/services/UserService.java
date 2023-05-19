package com.atif.bankingWebapp.services;

import com.atif.bankingWebapp.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> getUser();
    void saveUser(User user);

    void deleteById(long id);
}
