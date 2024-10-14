package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.entities.User;
import com.spring.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService service;

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user, Model model) {
		boolean isAuthenticate = service.authenticate(user.getEmail(), user.getPassword());
		if(isAuthenticate) {
			return "home";
		}else {
			model.addAttribute("error","Wrong email or password!");
			return "login";
		}
	}
}
