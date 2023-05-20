package com.atif.bankingWebapp.services.impl;

import com.atif.bankingWebapp.dto.UserDTO;
//import com.atif.bankingWebapp.dto.mapper.UserToDTOMapper;
import com.atif.bankingWebapp.models.User;
import com.atif.bankingWebapp.repositories.UserRepository;
import com.atif.bankingWebapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    Gson gson = new Gson();


//    private final UserToDTOMapper userToDTOMapper;
//
//    public UserServiceImpl(UserToDTOMapper userToDTOMapper) {
//        this.userToDTOMapper = userToDTOMapper;
//    }

//    @Override
//    public List<UserDTO> getUser() {
//        return userRepository.findAll()
//                .stream()
//                .map(userToDTOMapper)
//                .toList();
//    }


    @Override
    public List<UserDTO> getAllUser() {
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> userList = userRepository.findAll();

        for (User user : userList) {
            UserDTO userDTO = gson.fromJson(gson.toJson(user), UserDTO.class);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }


    @Override
    public User saveUser(UserDTO userDTO) {

        User user = gson.fromJson(gson.toJson(userDTO), User.class);

        user.setPassword(userDTO.getUserPassword());
        addingUser(user);
        return null;
    }

    //    @Override
//    public void deleteById(long id) {
//        userRepository.deleteById(id);
//    }
//
////    @Override
////    public UserDTO getUserById(long id){
////        return userRepository.findById(id)
////                .map(userToDTOMapper)
////                .get();
////    }
//
//    @Override
//    public void updatUser(long id,UserDTO userDTO) {
//        User user = userRepository.findById(id)
//                .get();
//        userRepository.save(user);
//    }
//
    private void addingUser(User user) {
        userRepository.save(user);
    }

}
