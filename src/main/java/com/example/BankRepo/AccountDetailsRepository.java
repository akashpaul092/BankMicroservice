package com.example.BankRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.BankModel.AccountDetailsModel;

public interface AccountDetailsRepository extends JpaRepository<AccountDetailsModel, String>{

	
}
