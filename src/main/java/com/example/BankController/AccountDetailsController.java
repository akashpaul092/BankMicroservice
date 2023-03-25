package com.example.BankController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankModel.AccountDetailsModel;
import com.example.BankService.AccountDetailsService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/customer/account/details")
public class AccountDetailsController {

	@Autowired
	AccountDetailsService service;
	
	@GetMapping("/create/{id}")
	public String createAccount( @PathVariable("id") String id) {
		return service.createAccount(id);
	}
	
	@GetMapping("/allaccounts")
	public List<AccountDetailsModel> getallAccount(){
		return service.getallAccount();
	}
	
}
