package com.banking.bankingsystem.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_credit")
public final class Credit extends Card implements Serializable {
	
	@Column(name = "ds_vencimento")
	private LocalDate vencimento;
	
	private static final long serialVersionUID = 1L;
	
	public Credit(){
		
	}	

	public Credit(Long id, LocalDate validade, Integer numeroCartao, Integer cvv, Count count, LocalDate vencimento) {
		super(id,validade,numeroCartao,cvv,count);
		this.vencimento = vencimento;
	}
	
}
