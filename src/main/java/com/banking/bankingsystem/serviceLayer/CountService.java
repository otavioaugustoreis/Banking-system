package com.banking.bankingsystem.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.bankingsystem.entities.Count;
import com.banking.bankingsystem.repositories.CountRepository;

@Service
public class CountService  {
		
	@Autowired
	private CountRepository repository;
	

	public List<Count> findAll(){
		return repository.findAll();
	}
	
	
}
