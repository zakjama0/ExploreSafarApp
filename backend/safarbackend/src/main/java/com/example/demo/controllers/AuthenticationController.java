package com.example.demo.controllers;

import ch.qos.logback.core.model.Model;
import com.example.demo.models.LoginUserDTO;
import com.example.demo.models.NewUserDTO;
import com.example.demo.models.User;
import com.example.demo.models.UserDTO;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
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

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
