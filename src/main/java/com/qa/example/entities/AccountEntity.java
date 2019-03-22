package com.qa.example.entities;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;


public class AccountEntity {

	private Long id;
	private String foreName;
	private String familyName;
	private String accNumber;
	
	public AccountEntity() {
		
	}
	
	
	public AccountEntity(Long id, String foreName, String familyName, String accNumber) {
		this.id=id;
		this.foreName = foreName;
		this.familyName = familyName;
		this.accNumber = accNumber;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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
