package com.banking.bankingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.bankingsystem.entities.Count;

@Repository
public interface CountRepository extends JpaRepository<Count, Long> {

}
