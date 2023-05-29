package com.agendexa.cerberus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agendexa.cerberus.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
