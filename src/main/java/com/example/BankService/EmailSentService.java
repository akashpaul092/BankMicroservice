package com.example.BankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.BankModel.AccountDetailsModel;
import com.example.BankRepo.AccountDetailsRepository;

@Service
public class EmailSentService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	 
    @Value
    ("${spring.mail.username}") private String sender;
    
    @Autowired
    AccountDetailsRepository repo;

	
    public String sendSimpleMail(String id)
    {
 
        try {
        	if(repo.findById(id).isPresent()) {
        		AccountDetailsModel accountDetailsModel=repo.findById(id).get();
        		
        		String details="Name: "+accountDetailsModel.getName()+"\n"+
        				"User Id: "+accountDetailsModel.getUser_id()+"\n"+
        				"Account No: "+accountDetailsModel.getAccount_number()+"\n"+
        				"IFSC: "+accountDetailsModel.getIfsc()+"\n"+
        				"Branch Code: "+accountDetailsModel.getBranch_code()+"\n"+
        				"Approve Date: "+accountDetailsModel.getDate()+"\n\n\n"
        				+ "Use User Id as username for login";

 
            SimpleMailMessage mailMessage = new SimpleMailMessage();
 
            mailMessage.setFrom(sender);
            mailMessage.setTo(accountDetailsModel.getEmail());
            mailMessage.setText(details);
            mailMessage.setSubject("Account Details From YML Bank");
 
            javaMailSender.send(mailMessage);
            
            return "Mail Sent Successfully...";
        	}
        	else {
        		return "Email does not exist";
        	}
        }
 
        catch (Exception e) {
            return "Internal error";
        }
    }
}
