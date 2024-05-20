package com.example.demo.services;


import com.example.demo.models.User;
import com.example.demo.models.UserDTO;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(long id){
        return userRepository.findById(id);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

//    public Optional<User> saveUser(NewUserDTO newUserDTO){
//        Optional<User> user = userRepository.findByEmail(newUserDTO.getEmail());
//        if(user.isPresent()) {
//            return Optional.empty();
//        }
//        newUserDTO.setPassword(bCryptPasswordEncoder.encode(newUserDTO.getPassword()));
//        User newUser = new User(newUserDTO.getName(), newUserDTO.getEmail(), newUserDTO.getPassword(), roleRepository.findByName(RoleEnum.USER).get());
//        return Optional.of(userRepository.save(newUser));
//    }

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

//    public User createAdministrator(NewUserDTO newUserDTO) {
//        Optional<Role> optionalRole = roleRepository.findByName(RoleEnum.ADMIN);
//
//        if (optionalRole.isEmpty()) {
//            return null;
//        }
//
//        User newAdmin = new User(newUserDTO.getName(),
//                                 newUserDTO.getEmail(),
//                                 newUserDTO.getPassword(),
//                                 optionalRole.get());
//
//        return userRepository.save(newAdmin);
//    }
}
