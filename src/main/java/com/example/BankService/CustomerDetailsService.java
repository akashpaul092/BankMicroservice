package com.example.BankService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankModel.CustomerDetailsModel;
import com.example.BankRepo.CustomerDetailsRepository;
@Service
public class CustomerDetailsService {
	
	@Autowired
	CustomerDetailsRepository repo;
	
	public String approved(String id) {
		repo.updatetoapproved(id);
		return "approved";
	}
	
	public String disapproved(String id) {
		repo.updatetodisapproved(id);
		return "disapproved";
	}
	
	public List<CustomerDetailsModel> getall() {
		return  repo.findAll();
	}

}
