package com.banking.bankingsystem.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.bankingsystem.entities.Transaction;
import com.banking.bankingsystem.repositories.TransactionRepository;

@Service
public class TransactionService  {
		
	@Autowired
	private TransactionRepository repository;
	

	public List<Transaction> findAll(){
		return repository.findAll();
	}
	
	
}
