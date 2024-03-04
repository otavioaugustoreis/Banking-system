package com.banking.bankingsystem.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@Inheritance(strategy =  InheritanceType.JOINED)
public abstract class Card implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ds_validade")
	private LocalDate validade;
	
	@Column(name = "nr_numero")
	private Integer numeroCartao;
	
	@Column(name = "nr_cvv")
	private Integer cvv;
	
	
	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	private Count count;


	public Card(Long id, LocalDate validade, Integer numeroCartao, Integer cvv, Count count) {
		this.id = id;
		this.validade = validade;
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
		this.count = count;
	}
	
	public Card() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public Integer getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public Count getCount() {
		return count;
	}

	public void setCount(Count count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, numeroCartao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(id, other.id) && Objects.equals(numeroCartao, other.numeroCartao);
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", validade=" + validade + ", numeroCartao=" + numeroCartao + ", cvv=" + cvv
				+ ", count=" + count + "]";
	}
	
	
	
}
