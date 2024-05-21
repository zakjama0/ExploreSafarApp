package com.example.demo.repositories;

import com.example.demo.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {


//    @Query(value = "SELECT t FROM tokens t "
//            + "INNER JOIN users u "
//            + "ON t.user_id = u.id "
//            + "WHERE u.id = :id "
//            + "AND (t.expired = false OR t.revoked = false);",
//            nativeQuery = true
//    )
    List<Token> findByUserId(Long userId);

    Optional<Token> findByToken(String token);
}
