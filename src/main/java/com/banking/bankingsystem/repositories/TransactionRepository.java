package com.banking.bankingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bankingsystem.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
