package com.example.demo;


import com.example.demo.encryptor.StringCryptoConverter;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EncryptionTest {

    @Autowired
    UserRepository userRepository;

    private static final Logger logger = (Logger) LoggerFactory.getLogger(StringCryptoConverter.class);

    private static final String NAME = "John";
    private static final String EMAIL = "john@example.com";
    private static final String PASSWORD = "password";
    private long id;

    @BeforeEach
    public void setUp() {
        User user = new User();
        user.setName(NAME);
        user.setEmail(EMAIL);
        user.setPassword(PASSWORD);
        id = userRepository.save(user).getId();
    }

    @Test
    public void readDecrypted() {
        User user = userRepository.findById(id).get();
        assertThat(user.getName()).isEqualTo(NAME);
        assertThat(user.getEmail()).isEqualTo(EMAIL);
        assertThat(user.getPassword()).isEqualTo(PASSWORD);
    }
}
