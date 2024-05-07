package com.example.demo.security;

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

    private final UserRepository userRepository;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EncryptionTest(UserRepository userRepository, JdbcTemplate jdbcTemplate){
        this.userRepository = userRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String NAME = "John";
    private static final String EMAIL = "john@example.com";
    private static final String PASSWORD = "password";

    private static final String NEW_NAME = "Steve";
    private static final String NEW_EMAIL = "steve@example.com";

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

    @Test
    public void testEditedUsersDetailsAreDecryptedCorrectly(){

        User userToEdit = userRepository.findById(userId).orElseThrow();
        userToEdit.setName(NEW_NAME);
        userToEdit.setEmail(NEW_EMAIL);
        userRepository.save(userToEdit);

        User editedUser = userRepository.findById(userId).orElseThrow();
        assertThat(editedUser.getName()).isEqualTo(NEW_NAME);
        assertThat(editedUser.getEmail()).isEqualTo(NEW_EMAIL);
    }

    @Test
    public void testEditedUsersDetailsAreEncryptedCorrectly(){

        User userToEdit = userRepository.findById(userId).orElseThrow();
        userToEdit.setName(NEW_NAME);
        userToEdit.setEmail(NEW_EMAIL);
        userRepository.save(userToEdit);

        User editedUser = jdbcTemplate.queryForObject(
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

        assert editedUser != null;
        assertThat(editedUser.getName()).isNotEqualTo(NAME);
        assertThat(editedUser.getEmail()).isNotEqualTo(EMAIL);
    }
}
