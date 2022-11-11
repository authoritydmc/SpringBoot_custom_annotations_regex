package com.example.ussample.services;

import com.example.ussample.entites.User;
import com.example.ussample.repos.UserRepo;
import com.example.ussample.resources.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    public User addUser(User user)
    {

        userRepo.save(user);
        return  user;
    }
}
