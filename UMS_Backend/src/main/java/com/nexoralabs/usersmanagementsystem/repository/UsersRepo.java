package com.nexoralabs.usersmanagementsystem.repository;

import com.nexoralabs.usersmanagementsystem.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers, Integer> {

    Optional<OurUsers> findByEmail(String email);

    boolean existsByEmail(String email);
}
