package com.account.jmslistener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.account.entities.AccountEntity;
@Component
public class JMSListener {
	/*
	@JmsListener(destination = "valentineisaweapon", containerFactory = "myFactory")
    public void receiveMessage(AccountEntity entity) {
        System.out.println("Received <" + entity + ">");
    }
    */
}
