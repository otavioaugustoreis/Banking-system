package com.banking.bankingsystem.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_debit")
public final class Debit extends Card implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Debit(){
		
	}
	

	public Debit(Long id, LocalDate validade, Integer numeroCartao, Integer cvv, Count count) {
		super(id,validade,numeroCartao,cvv,count);
	}
	

}
