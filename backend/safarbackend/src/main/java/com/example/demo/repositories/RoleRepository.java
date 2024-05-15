package com.example.demo.repositories;

import com.example.demo.enums.RoleEnum;
import com.example.demo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleEnum name);
}
