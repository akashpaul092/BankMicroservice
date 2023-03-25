package com.example.BankModel;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="onlylogin")
public class CustomerLoginModel {

	@Id
	@Column(name="user_id")
	private String  userID;
	@Column(name="password")
	private String password;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CustomerLoginModel(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
	public CustomerLoginModel() {
		super();
	}
	
	
	
}
