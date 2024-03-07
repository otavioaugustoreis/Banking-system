package com.banking.bankingsystem.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.bankingsystem.data.vo.v1.UserVO;
import com.banking.bankingsystem.mapper.DozerMapper;
import com.banking.bankingsystem.repositories.UserRepository;

@Service
public class UserService  {
		
	@Autowired
	private UserRepository repository;
	
	
	public List<UserVO> findAll(){
		return DozerMapper.parseListObject(repository.findAll(), UserVO.class);
	}
	
	
}
