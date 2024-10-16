package com.spring.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByEmail(String email);
}
