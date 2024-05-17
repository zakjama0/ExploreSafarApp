package com.example.demo.controllers;

import com.example.demo.models.NewUserDTO;
import com.example.demo.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

    @PostMapping(value = "/register")
    public ResponseEntity<User> registerUser(@RequestBody NewUserDTO newUserDTO) {

    }
}
