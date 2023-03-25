package com.example.BankModel;


import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="bank")
public class BankModel {
	
	@Id
	@Column(name="user_id")
	private String user_id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public BankModel(String user_id, String email, String password, String role) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public BankModel() {
		super();
	}
	@Override
	public String toString() {
		return "BankModel [user_id=" + user_id + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
	

}
