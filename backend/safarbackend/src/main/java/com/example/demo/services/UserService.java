package com.example.demo.services;


import com.example.demo.models.User;
import com.example.demo.models.UserDTO;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(long id){
        return userRepository.findById(id);
    }

    public User getUserByEmail(String email) {
        List<User> users = getAllUsers();
        for(User user : users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public User saveUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        User newUser = new User(user.getName(), user.getEmail(), user.getPassword());
        return userRepository.save(newUser);
    }

    public Optional<User> updateUser(Long id, UserDTO userDTO){

        Optional<User> userToUpdate = userRepository.findById(id);

        if(userToUpdate.isPresent()) {
            userToUpdate.get().setName(userDTO.getName());
            userToUpdate.get().setEmail(userDTO.getEmail());
            userToUpdate.get().setPassword(userDTO.getPassword());
            userRepository.save(userToUpdate.get());
        }

        return userToUpdate;
    }
}
