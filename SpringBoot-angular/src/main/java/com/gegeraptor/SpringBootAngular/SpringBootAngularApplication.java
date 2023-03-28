package com.gegeraptor.SpringBootAngular;

import java.util.stream.Stream;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gegeraptor.SpringBootAngular.entities.Users;
import com.gegeraptor.SpringBootAngular.repositories.UserRepository;

@SpringBootApplication
public class SpringBootAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				Users users = new Users(name, name.toLowerCase() + "@domain.com");
				userRepository.save(users);
			});
			userRepository.findAll().forEach(System.out::println);
			};
		}
	}