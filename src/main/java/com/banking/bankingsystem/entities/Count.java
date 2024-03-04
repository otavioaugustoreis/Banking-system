package com.banking.bankingsystem.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.banking.bankingsystem.enums.TipoConta;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_count")
public  class Count implements Serializable {
		

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(name = "nr_conta")
	private Integer numeroConta;
	
	@Column(name = "nr_saldo")
	private Double saldo;
	
	private Integer tipoConta;
	
	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	private User user;
	
	@JsonIgnore
	@OneToMany(mappedBy = "count")
	private List<Transaction> transaction = new ArrayList<>();
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "count")
	private List<Card> count = new ArrayList<>();
	
	public Count() {
		
	}
	
	
	public Count(Long id, Integer numeroConta, Double saldo, TipoConta tipoConta, User user) {
		super();
		this.id = id;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.tipoConta = tipoConta.getCode();
		this.user = user;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Integer getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(Integer tipoConta) {
		this.tipoConta = tipoConta;
	}


	public User getUser() {
		return user;
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Count other = (Count) obj;
		return Objects.equals(id, other.id);
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Count [id=" + id + ", numeroConta=" + numeroConta + ", saldo=" + saldo + ", tipoConta=" + tipoConta
				+ ", user=" + user + "]";
	}
		
}
