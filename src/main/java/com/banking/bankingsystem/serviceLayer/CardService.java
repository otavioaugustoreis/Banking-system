package com.banking.bankingsystem.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.bankingsystem.entities.Card;
import com.banking.bankingsystem.repositories.CardRepository;

@Service
public class CardService  {
		
	@Autowired
	private CardRepository repository;
	

	public List<Card> findAll(){
		return repository.findAll();
	}
	
	
}
