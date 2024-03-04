package com.banking.bankingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.bankingsystem.entities.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
