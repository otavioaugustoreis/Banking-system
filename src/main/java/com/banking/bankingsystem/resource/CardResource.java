package com.banking.bankingsystem.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bankingsystem.entities.Card;
import com.banking.bankingsystem.serviceLayer.CardService;

@RestController
@RequestMapping(value = "/cards")
public class CardResource {
	
	@Autowired
	private  CardService service;
	// usar produces = MedaiType.APPLICATION_JSON_VALUE = diz que o cara reproduz um JSON
	@GetMapping
	public ResponseEntity<List<Card>> findAll(){
		List<Card> user = service.findAll();
		return ResponseEntity.ok().body(user);
	}
}
