package com.example.BankController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankService.EmailSentService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/email")
public class EmailSentController {
	
	@Autowired
	EmailSentService service;
	
	@GetMapping("/sent/{id}")
	public String emailsent(@PathVariable("id") String id) {
		return service.sendSimpleMail(id);
	}

}
