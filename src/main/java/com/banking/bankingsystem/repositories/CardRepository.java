package com.banking.bankingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bankingsystem.entities.Card;

public interface CardRepository extends JpaRepository<Card, Long> {

}
