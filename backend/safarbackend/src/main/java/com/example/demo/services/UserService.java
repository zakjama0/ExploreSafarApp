package com.example.demo.services;


import com.example.demo.enums.RoleEnum;
import com.example.demo.models.NewUserDTO;
import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.models.UserDTO;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, RoleRepository roleRepository){
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
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

    public User saveUser(NewUserDTO newUserDTO){
        Optional<User> user = userRepository.findByEmail(newUserDTO.getEmail());
        if(user.isPresent()) {
            return null;
        }
        newUserDTO.setPassword(bCryptPasswordEncoder.encode(newUserDTO.getPassword()));
        User newUser = new User(newUserDTO.getName(), newUserDTO.getEmail(), newUserDTO.getPassword(), roleRepository.findByName(RoleEnum.USER).get());
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

    public User createAdministrator(NewUserDTO newUserDTO) {
        Optional<Role> optionalRole = roleRepository.findByName(RoleEnum.ADMIN);

        if (optionalRole.isEmpty()) {
            return null;
        }

        User newAdmin = new User(newUserDTO.getName(),
                                 newUserDTO.getEmail(),
                                 newUserDTO.getPassword(),
                                 optionalRole.get());

        return userRepository.save(newAdmin);
    }
}
