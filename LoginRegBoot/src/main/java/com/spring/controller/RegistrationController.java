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
public class RegistrationController {
	
	@Autowired
	UserService service;

	@GetMapping("/register")
	public String showRegisterForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute User user, Model model) {
		service.saveUser(user);
		System.out.println(user);
		return "redirect:/login";
	}
}
