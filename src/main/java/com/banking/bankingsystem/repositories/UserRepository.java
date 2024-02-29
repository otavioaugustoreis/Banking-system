package com.banking.bankingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bankingsystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
