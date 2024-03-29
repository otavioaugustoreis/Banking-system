package com.banking.bankingsystem.test;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.banking.bankingsystem.Services.TransactionServiceLayer;
import com.banking.bankingsystem.entities.Card;
import com.banking.bankingsystem.entities.Count;
import com.banking.bankingsystem.entities.Credit;
import com.banking.bankingsystem.entities.Transaction;
import com.banking.bankingsystem.entities.User;
import com.banking.bankingsystem.enums.TipoConta;
import com.banking.bankingsystem.enums.TipoTransacao;
import com.banking.bankingsystem.repositories.CardRepository;
import com.banking.bankingsystem.repositories.CountRepository;
import com.banking.bankingsystem.repositories.TransactionRepository;
import com.banking.bankingsystem.repositories.UserRepository;


@Configuration
public class testConfig implements CommandLineRunner{

		@Autowired
		private UserRepository userRepository;
		
		@Autowired
		private CountRepository countRepository;
		
		
		@Autowired
		private TransactionRepository transactionRepository;
		
		@Autowired
		private CardRepository cardRepository;
		
		@Override
		public void run(String... args) throws Exception {

			
			User u1 = new User(null, "Otavio", "oaugusto265@gmail.com", "461.067.708.-32", "(11) 9507636503 ",Date.valueOf("2005-03-20"));
			User u2 = new User(null, "Artur", "artur@gmail.com", "461.067.708.-32", "(11) 9507636503",Date.valueOf("2005-03-20"));
			User u3 = new User(null, "João", "joaovitoraze31@gmail.com", "461.067.708.-32", "(11) 9507636503 ",Date.valueOf("2005-03-20"));
			
			userRepository.saveAll(Arrays.asList(u1,u2,u3));
			
			Count c1 = new Count(null, 12345, 1450.00, TipoConta.CONTA_POUPANCA, u1);
			Count c2 = new Count(null, 12345, 1450.00, TipoConta.CONTA_CORRENTE, u2);
			Count c3 = new Count(null, 12345, 1450.0, TipoConta.CONTA_CORRENTE, u3);
			
			countRepository.saveAll(Arrays.asList(c1,c2,c3));
			
			Transaction t1 =  new Transaction(null, TipoTransacao.PIX, 10.00 , Instant.parse("2019-06-20T19:53:07Z") ,c3);
			Transaction t2 =  new Transaction(null, TipoTransacao.PIX, 1500.00 , Instant.parse("2019-06-20T19:53:07Z") ,c1);
			Transaction t3 =  new Transaction(null, TipoTransacao.PIX, 159.00 , Instant.parse("2019-06-20T19:53:07Z") ,c2);
			
			transactionRepository.saveAll(Arrays.asList(t1,t2,t3));
			
			
			Card ca1 = new Credit(null, LocalDate.of(2004,3,5), 1234, 316, c1,LocalDate.of(2004,3,5));
			Card ca2 = new Credit(null, LocalDate.of(2003,3,5), 1236, 334, c1,LocalDate.of(2004,3,5));
			Card ca3 = new Credit(null, LocalDate.of(2002,3,5), 1237, 512, c1,LocalDate.of(2004,3,5));
			
			
			cardRepository.saveAll(Arrays.asList(ca1,ca2,ca3));
			
			TransactionServiceLayer.Transferir(t1);
		
	}
	
}
