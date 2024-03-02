package com.banking.bankingsystem.enums;



public enum TipoTransacao {
	BOLETO(1),
	PIX(2),
	CARTAO_CREDITO(3),
	CARTAO_DEBTO(4);
	
	private int code;
	
	TipoTransacao(int code){
		this.code = code;
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
