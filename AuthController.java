package com.example.e_commerce.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.e_commerce.website.model.User;
import com.example.e_commerce.website.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepo;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userRepo.save(user);
        return "User registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody User loginRequest) {

        User existingUser = userRepo.findByUsername(loginRequest.getUsername());

        if (existingUser != null && existingUser.getPassword().equals(loginRequest.getPassword())) {
            return "Login success";
        }

        return "Invalid username or password";
    }

}
