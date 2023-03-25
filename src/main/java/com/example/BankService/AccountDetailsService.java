package com.example.BankService;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankModel.AccountDetailsModel;
import com.example.BankModel.CustomerDetailsModel;
import com.example.BankModel.CustomerLoginModel;
import com.example.BankRepo.AccountDetailsRepository;
import com.example.BankRepo.CustomerDetailsRepository;
import com.example.BankRepo.CustomerLoginRepository;
import com.example.generator.AccountGenerator;


@Service
public class AccountDetailsService {

	@Autowired
    AccountDetailsRepository repo;
	
	@Autowired
	CustomerDetailsRepository customerRepository;
	
	@Autowired
	AccountGenerator generator;
	
	@Autowired
	CustomerLoginRepository customerLoginRepository;
	
	public String createAccount(String id ) {
		if(customerRepository.findById(id).isPresent()) {
			
			CustomerDetailsModel customerModel=customerRepository.findById(id).get();
			
			if(customerModel.getApprove()==1) {
				AccountDetailsModel model=new AccountDetailsModel();
				CustomerLoginModel mdl=new CustomerLoginModel();
				LocalDate date = LocalDate.now();

				model.setId(customerModel.getId());
				model.setName(customerModel.getName());
				String accountId=generator.idgenerator();
				model.setUser_id(accountId);
				model.setAccount_number(generator.accountNumber());
				model.setTotalAmount(1000);
				model.setIfsc(generator.ifscCode());
				model.setBranch_code(generator.branchCode());
				model.setPhone_no(customerModel.getPhone_no());
				model.setEmail(customerModel.getEmail());
				model.setPan(customerModel.getPancard());
				model.setAddhar(customerModel.getAddharcard());
				model.setDate(date.toString());
				
				mdl.setUserID(accountId);
				mdl.setPassword(customerModel.getPassword());
				
				customerLoginRepository.save(mdl);
				repo.save(model);
				
				return "Account created";

			}
			return "waiting";
			
			
		}else {
	
		return "Account not created";
		}
	}
	
	public List<AccountDetailsModel> getallAccount(){
		
		return repo.findAll();
	}
}
