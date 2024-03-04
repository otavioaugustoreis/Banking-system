package com.banking.bankingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.bankingsystem.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
