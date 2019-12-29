package com.datageeks.dao;

import java.io.Serializable;

public class User implements Serializable{

	private String loginId = null;
	private String firstName = null;
	private String lastName = null;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String loginId, String firstName, String lastName) {
		super();
		this.loginId = loginId;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
