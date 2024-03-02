package com.banking.bankingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bankingsystem.entities.Count;

public interface CountRepository extends JpaRepository<Count, Long> {

}
