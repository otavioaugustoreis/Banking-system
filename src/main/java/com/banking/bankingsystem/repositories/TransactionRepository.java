package com.banking.bankingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.bankingsystem.entities.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
