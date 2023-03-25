package com.example.BankRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.BankModel.BankModel;
public interface BankRepository extends JpaRepository<BankModel, String>{

	
}
