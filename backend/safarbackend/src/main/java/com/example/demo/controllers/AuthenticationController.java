package com.example.demo.controllers;

import com.example.demo.models.NewUserDTO;
import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<User> registerUser(@RequestBody NewUserDTO newUserDTO) {
        Optional<User> user = userService.saveUser(newUserDTO);
        if(user.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(user.get(), HttpStatus.CREATED);
    }
}
