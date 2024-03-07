package com.banking.bankingsystem.Services;

import com.banking.bankingsystem.entities.Count;
import com.banking.bankingsystem.entities.Transaction;

public class CountServiceLayer {

	public static void Transferir(Transaction transaction) {
		Count count = transaction.getCount();
		Double newSaldo = count.getSaldo() - transaction.getValor();
		
		try {
													
			if(transaction.getTipoTransacao().getCode() == 1){
				if(verificarSaldo(count, transaction)) {
					
					
				Double saldoAtual =  count.getSaldo();
					
				count.setSaldo(newSaldo);
				
				System.out.println("Sua Trânsferencia foi executada com sucesso no valor de " + newSaldo + " e seu saldo atual é: " + saldoAtual);
					
				}
			}
			
			if(transaction.getTipoTransacao().getCode() == 2){
				if(verificarSaldo(count, transaction)) {
					count.setSaldo(newSaldo);
					
					System.out.println("Sua Trânsferencia foi executada com sucesso no valor de " + newSaldo + " e seu saldo atual é: " + 0);
				}
			}
			
			if(transaction.getTipoTransacao().getCode() == 3){
				if(verificarSaldo(count, transaction)) {
					count.setSaldo(newSaldo);
					
					System.out.println("Sua Trânsferencia foi executada com sucesso no valor de " + newSaldo + " e seu saldo atual é: " + 0);
				}
			}
			
			if(transaction.getTipoTransacao().getCode() == 4){
				if(verificarSaldo(count, transaction)) {
					count.setSaldo(newSaldo);
					
					System.out.println("Sua Trânsferencia foi executada com sucesso no valor de " + newSaldo + " e seu saldo atual é: " + 0);
				}
			}
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static Boolean verificarSaldo(Count count, Transaction transaction) {
		
		if(count.getSaldo() < transaction.getValor()) {
			System.out.println("Saldo Insuficiente");
			return false;
		}	
		return true;
	}

}
