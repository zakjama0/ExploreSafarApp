package com.example.demo.services;

import com.example.demo.enums.RoleEnum;
import com.example.demo.models.LoginUserDTO;
import com.example.demo.models.NewUserDTO;
import com.example.demo.models.User;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            UserRepository userRepository,
            RoleRepository roleRepository,
            AuthenticationManager authenticationManager
    ) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public User signup(NewUserDTO newUserDTO){
        User user = new User(
                newUserDTO.getName(),
                newUserDTO.getEmail(),
                passwordEncoder.encode(newUserDTO.getPassword()),
                roleRepository.findByName(RoleEnum.USER).get()
        );

        return userRepository.save(user);
    }

    public User authenticate(LoginUserDTO loginUserDTO) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginUserDTO.getEmail(),
                        loginUserDTO.getPassword()
                )
        );

        return userRepository.findByEmail(loginUserDTO.getEmail()).orElseThrow();
    }
}
