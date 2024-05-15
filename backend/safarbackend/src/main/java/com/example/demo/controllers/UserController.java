package com.example.demo.controllers;

import com.example.demo.models.NewUserDTO;
import com.example.demo.models.User;
import com.example.demo.models.UserDTO;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
    public ResponseEntity<List<User>> getAllCustomers(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getCustomerById(@PathVariable Long id){
        Optional<User> User = userService.getUserById(id);
        if(User.isPresent()){
            return new ResponseEntity<>(User.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<User> addCustomer(@RequestBody NewUserDTO newUserDTO){
        User newCustomer = userService.saveUser(newUserDTO);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<User> updateCustomer(@PathVariable Long id, @RequestBody UserDTO userDTO){
        Optional<User> updatedCustomer = userService.updateUser(id, userDTO);
        if (updatedCustomer.isPresent()){
            return new ResponseEntity<>(updatedCustomer.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    
}
