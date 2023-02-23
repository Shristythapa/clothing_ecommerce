package com.example.stuff.services;

import com.example.stuff.Entity.User;
import com.example.stuff.pojo.UserPojo;

import java.io.IOException;

public interface UserService {
    UserPojo save(UserPojo userPojo) throws IOException;
 boolean isUserPresent(String email);
 void sendEmail(String email, int myMessage);
 User getUserByEmail(String email);

}
