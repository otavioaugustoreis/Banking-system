package com.banking.bankingsystem.enums;



public enum TipoTransacao {
	BOLETO(1, "Boleto"),
	PIX(2, "Pix"),
	CARTAO_CREDITO(3, "Cartão de crédito"),
	CARTAO_DEBTO(4, "Cartão de débito");
	
	private int code;
	private String tipo;
	
	
	TipoTransacao(int code, String tipo){
		this.code = code;
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return  tipo;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TipoTransacao valueOf(int code) {
		for(TipoTransacao value : TipoTransacao.values()){
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Transaction code");
	}
}
