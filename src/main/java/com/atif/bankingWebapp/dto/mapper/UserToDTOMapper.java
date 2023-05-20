//package com.atif.bankingWebapp.dto.mapper;
//
//import com.atif.bankingWebapp.dto.UserDTO;
//import com.atif.bankingWebapp.models.User;
//import org.springframework.stereotype.Service;
//
//import java.util.function.Function;
//
//@Service
//public class UserToDTOMapper implements Function<User, UserDTO> {
//
//    @Override
//    public UserDTO apply(User user) {
//        return new UserDTO(
//                user.getUserId(),
//                user.getActive(),
//                user.getEmailAdd(),
//                user.getNameFirst(),
//                user.getNameLast(),
//                user.getContactNum(),
//                user.getDob(),
//                user.getStatus(),
//                user.getAccountNo(),
//                user.getCurrentBalance()
//        );
//    }
//}
