package com.example.ussample.resources;

import com.example.ussample.entites.User;
import com.example.ussample.services.UserService;
import com.example.ussample.validations.AgeChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;

@RestController
@RequestMapping("/")
public class UserResource {

    @Autowired
    private UserService userService;
    @GetMapping
    public String helloWordl()
    {
        return "Hello world";
    }



    @PostMapping()
            public User addUser(@RequestBody @Valid User user)
    {

    User a=userService.addUser(user);
        return a;

    }
}
