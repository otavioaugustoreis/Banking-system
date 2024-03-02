package com.banking.bankingsystem.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bankingsystem.entities.Count;
import com.banking.bankingsystem.serviceLayer.CountService;

@RestController
@RequestMapping(value = "/counts")
public class CountResource {
	
	@Autowired
	private  CountService service;
	
	@GetMapping
	public ResponseEntity<List<Count>> findAll(){
		List<Count> user = service.findAll();
		return ResponseEntity.ok().body(user);
	}
}
