package com.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserRepository;
import com.spring.entities.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public void saveUser(User user ) {
		repository.save(user);
	}
	
	public boolean authenticate(String email, String password) {
		Optional<User> user = repository.findByEmail(email);
		return user.isPresent() && user.get().getPassword().equals(password);
	}

}
