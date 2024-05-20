package com.example.demo.services;

import com.example.demo.auth.AuthenticationRequest;
import com.example.demo.auth.AuthenticationResponse;
import com.example.demo.auth.RegisterRequest;
import com.example.demo.enums.Role;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthenticationResponse register(RegisterRequest request) {
         var user = User.builder()
                 .name(request.getName())
                 .email(request.getEmail())
                 .password(passwordEncoder.encode(request.getPassword()))
                 .role(Role.USER)
                 .build();

         userRepository.save(user);
         var jwtToken = jwtService.generateToken(user);
         return AuthenticationResponse.builder()
                 .token(jwtToken)
                 .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
    }
}
