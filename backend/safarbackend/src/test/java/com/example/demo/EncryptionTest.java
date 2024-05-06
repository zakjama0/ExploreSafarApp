package com.example.demo;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class EncryptionTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String NAME = "John";
    private static final String EMAIL = "john@example.com";
    private static final String PASSWORD = "password";
    private long userId;

    @BeforeEach
    public void setUp() {
        User user = new User();
        user.setName(NAME);
        user.setEmail(EMAIL);
        user.setPassword(PASSWORD);
        userId = userRepository.save(user).getId();
    }

    @Test
    public void testUserDetailsAreDecryptedCorrectly() {
        User user = userRepository.findById(userId).orElseThrow();
        assertThat(user.getName()).isEqualTo(NAME);
        assertThat(user.getEmail()).isEqualTo(EMAIL);
        assertThat(user.getPassword()).isEqualTo(PASSWORD);
    }

    @Test
    public void testUserDetailsAreEncryptedCorrectly(){

        User user = jdbcTemplate.queryForObject(
                "SELECT * FROM users WHERE id = ?",
                (resultSet, i) -> {
                    User result = new User();
                    result.setId(resultSet.getLong("id"));
                    result.setName(resultSet.getString("name"));
                    result.setEmail(resultSet.getString("email"));
                    return result;
                },
                userId
        );

        assert user != null;
        assertThat(user.getName()).isNotEqualTo(NAME);
        assertThat(user.getEmail()).isNotEqualTo(EMAIL);
    }
}
