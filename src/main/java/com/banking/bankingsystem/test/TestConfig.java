package com.banking.bankingsystem.test;


import java.sql.Date;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.banking.bankingsystem.entities.User;
import com.banking.bankingsystem.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "Otavio", "oaugusto265@gmail.com", "461.067.708.-32", "Otavio Augusto ",Date.valueOf("2005-03-20"));
		User u2 = new User(null, "Otavio", "oaugusto265@gmail.com", "461.067.708.-32", "Otavio Augusto ",Date.valueOf("2005-03-20"));
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
