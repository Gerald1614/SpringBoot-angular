package com.gegeraptor.SpringBootAngular.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gegeraptor.SpringBootAngular.entities.Users;
import com.gegeraptor.SpringBootAngular.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	private UserRepository userRepository = null;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<Users> getUsers() {
		return (List<Users>) userRepository.findAll();
	}
	
	@PostMapping("/users")
	void addUser(@RequestBody Users users) {
		userRepository.save(users);
	}
}
