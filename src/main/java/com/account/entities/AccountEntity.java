package com.account.entities;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;


public class AccountEntity {
	
	
	
	
	

	private String foreName;
	private String familyName;
	private String accNumber;
	
	
	
	public AccountEntity(String foreName, String familyName, String accNumber) {
		this.foreName = foreName;
		this.familyName = familyName;
		this.accNumber = accNumber;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public String getForeName() {
		return foreName;
	}
	public void setForeName(String foreName) {
		this.foreName = foreName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	

	
	@Override
	public String toString() {
		return "AccountEntity [id="   + ", foreName=" +  ", familyName=" +", accNumber="
				+ accNumber + "]";
	}

}
