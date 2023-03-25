package com.example.BankModel;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="accountdetails")
public class AccountDetailsModel {
	
	@Id
	@Column(name="id")
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="user_id")
	private String user_id;
	@Column(name="account_number")
	private String account_number;
	@Column(name="total_amount")
	private long total_amount;
	@Column(name="ifsc")
	private String ifsc;
	@Column(name="branch_code")
	private String branch_code;
	@Column(name="phone_no")
	private String phone_no;
	@Column(name="email")
	private String email;
	@Column(name="pan")
	private String pan;
	@Column(name="addhar")
	private String addhar;
	@Column(name="date")
	private String date;
	
	
	public long getTotalAmount() {
		return total_amount;
	}
	public void setTotalAmount(long totalAmount) {
		this.total_amount = totalAmount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAddhar() {
		return addhar;
	}
	public void setAddhar(String addhar) {
		this.addhar = addhar;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public AccountDetailsModel(String id, String name, String user_id, String account_number, long totalAmount,
			String ifsc, String branch_code, String phone_no, String email, String pan, String addhar, String date) {
		super();
		this.id = id;
		this.name = name;
		this.user_id = user_id;
		this.account_number = account_number;
		this.total_amount = totalAmount;
		this.ifsc = ifsc;
		this.branch_code = branch_code;
		this.phone_no = phone_no;
		this.email = email;
		this.pan = pan;
		this.addhar = addhar;
		this.date = date;
	}
	public AccountDetailsModel() {
		super();
	}
	
	
	

}
