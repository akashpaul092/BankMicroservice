package com.example.BankRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.BankModel.CustomerDetailsModel;

import jakarta.transaction.Transactional;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsModel, String>{

	@Transactional
	@Modifying
	@Query(value="UPDATE login t SET t.approve=1 ,t.email_sent=1 where t.id=?",nativeQuery = true)
	void updatetoapproved(String id);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE login t SET t.approve=-1 where t.id=?",nativeQuery = true)
	void updatetodisapproved(String id);
}
