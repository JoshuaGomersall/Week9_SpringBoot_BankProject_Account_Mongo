package com.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.account.entities.AccountEntity;
import com.account.repo.AccountMongoRepo;

@SpringBootApplication
public class AccountMongoApplication implements CommandLineRunner{
	
	@Autowired
	private AccountMongoRepo repository;
	
	public static void main(String[] args) {
		SpringApplication.run(AccountMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		repository.save(new AccountEntity("Joe", "Schmidt","b123456"));
		repository.save(new AccountEntity("Jordan", "Goldman","a654321"));
		for(AccountEntity entity : repository.findAll()) {
			System.out.println(entity);
		}
		
		
	}

}
