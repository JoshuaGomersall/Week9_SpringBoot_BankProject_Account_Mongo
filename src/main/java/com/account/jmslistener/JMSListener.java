package com.account.jmslistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.account.repo.AccountMongoRepo;
import com.qa.example.entities.AccountEntity;

@Component
public class JMSListener {

	@Autowired
	private AccountMongoRepo repository;

	@JmsListener(destination = "Account List", containerFactory = "myFactory")
	public void receiveMessage(AccountEntity entity) {
		repository.save(entity);
	}
}