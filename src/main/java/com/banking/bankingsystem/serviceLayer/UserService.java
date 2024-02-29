package com.banking.bankingsystem.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.bankingsystem.entities.User;
import com.banking.bankingsystem.repositories.UserRepository;

@Service
public class UserService  {
		
	@Autowired
	private UserRepository repository;
	
	
	// Aqui ele faz a conversão dos dados
	public List<User> findAll(){
		return repository.findAll();
	}
	
	
}
