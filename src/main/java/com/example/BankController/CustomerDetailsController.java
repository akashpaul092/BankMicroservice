package com.example.BankController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankModel.CustomerDetailsModel;
import com.example.BankService.CustomerDetailsService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerDetailsController {
	
	@Autowired
	CustomerDetailsService service;
	
	@GetMapping("/approval/{id}")
	public String approval(@PathVariable("id") String id) {
	   return 	service.approved(id);
	}
	
	@GetMapping("/disapproval/{id}")
	public String disapproval(@PathVariable("id") String id) {
	   return 	service.disapproved(id);
	}
	
	@GetMapping("/all")
	public List<CustomerDetailsModel> alldetail(){
	  return	service.getall();
	  
	}
	
	@GetMapping("/error")
	public String errror() {
		return "error";
	}
}
