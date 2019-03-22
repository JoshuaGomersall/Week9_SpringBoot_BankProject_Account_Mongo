package com.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.account.jmslistener.JMSListener;
import com.account.repo.AccountMongoRepo;
import com.qa.example.entities.AccountEntity;

@SpringBootApplication
public class AccountMongoApplication implements CommandLineRunner{
	
	@Autowired
	private AccountMongoRepo repository;
	
	public static void main(String[] args) {
		SpringApplication.run(AccountMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}

}
