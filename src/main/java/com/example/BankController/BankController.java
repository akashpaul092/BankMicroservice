package com.example.BankController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankModel.BankModel;
import com.example.BankService.BankLoginService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/Admin")
public class BankController {
	
	@Autowired
	BankLoginService service;

	@PostMapping("/login")
	public String registration(@RequestBody BankModel model) {
		return service.registration(model);
	}
	
}
