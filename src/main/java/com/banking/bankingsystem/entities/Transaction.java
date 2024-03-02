package com.banking.bankingsystem.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.banking.bankingsystem.enums.TipoTransacao;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_transacao")
public final  class Transaction implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fk_transacao")
	private Integer tipoTransacao;
	
	@Column(name = "nr_valor")
	private Double valor;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT" )
	@Column(name = "dh_inclusao")
	private Instant horaTransacao;
	
	@ManyToOne
	@JoinColumn(name = "fk_conta")
	private Count count;

	public Transaction(Long id, TipoTransacao tipoTransacao, Double valor, Instant horaTransacao, Count count) {
		this.id = id;
		this.tipoTransacao = tipoTransacao.getCode();
		this.valor = valor;
		this.horaTransacao = horaTransacao;
		this.count = count;
	}
	
	public Transaction(){
		
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(Integer tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Instant getHoraTransacao() {
		return horaTransacao;
	}

	public void setHoraTransacao(Instant horaTransacao) {
		this.horaTransacao = horaTransacao;
	}

	public Count getCount() {
		return count;
	}

	public void setCount(Count count) {
		this.count = count;
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
		Transaction other = (Transaction) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", tipoTransacao=" + tipoTransacao + ", valor=" + valor + ", horaTransacao="
				+ horaTransacao + ", count=" + count + "]";
	}
	
	
	
	
	
}
