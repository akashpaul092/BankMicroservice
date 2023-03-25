package com.example.BankRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankModel.CustomerLoginModel;

public interface CustomerLoginRepository  extends JpaRepository<CustomerLoginModel, String>{

}
