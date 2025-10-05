package com.example.hellospringboot;

import org.springframework.data.jpa.repository.JpaRepository;

// This interface grants CRUD methods for User objects automatically
public interface UserRepository extends JpaRepository<User, Long> {
    // No code needed, JpaRepository gives us all CRUD methods
}
