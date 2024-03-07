package com.banking.bankingsystem.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bankingsystem.data.vo.v1.UserVO;
import com.banking.bankingsystem.serviceLayer.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private  UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserVO>> findAll(){
		List<UserVO> UserVO = service.findAll();
		return ResponseEntity.ok().body(UserVO);
	}
	
	
	
}
