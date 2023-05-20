//package com.atif.bankingWebapp.dto.mapper;
//
//import com.atif.bankingWebapp.dto.UserDTO;
//import com.atif.bankingWebapp.models.User;
//
//import java.util.function.Function;
//
//public class DTOToUserMapper implements Function<UserDTO, User> {
//
//    @Override
//    public User apply(UserDTO user) {
//        return new User(
//                user.getUserId(),
//                user.getActive(),
//                user.getEmailAdd(),
//                user.getNameFirst(),
//                user.getNameLast(),
//                user.getContactNum(),
//                user.getDob(),
//                user.getStatus(),
//                user.getAccountNo(),
//                user.getCurrent_balance()
//        );
//    }
//}
