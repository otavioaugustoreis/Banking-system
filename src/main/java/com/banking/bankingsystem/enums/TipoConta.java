package com.banking.bankingsystem.enums;



public enum TipoConta {
	CONTA_CORRENTE(1),
	CONTA_POUPANCA(2);
	
	private int code;
	
	TipoConta(int code){
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TipoConta valueOf(int code) {
		for(TipoConta value : TipoConta.values()){
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
