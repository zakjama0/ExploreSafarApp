package com.example.demo;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class PasswordEncoderTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String NAME = "John";
    private static final String EMAIL = "john@example.com";
    private static final String PASSWORD = "password";

    private static final String NEW_NAME = "Steve";
    private static final String NEW_EMAIL = "steve@example.com";

    private long userId = 1;

    @BeforeEach
    public void setUp() {
        User user = new User();
        user.setName(NAME);
        user.setEmail(EMAIL);
        user.setPassword(PASSWORD);
        userService.saveUser(user);
    }

//    @Test
//    public void testPasswordHasBeenHashed
}
