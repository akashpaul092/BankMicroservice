package com.example.BankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.example.BankJwt.BankUtils;
import com.example.BankModel.BankModel;
import com.example.BankRepo.BankRepository;
import com.example.BankSecurity.BankUserDetails;

@Service
public class BankLoginService {
	
	@Autowired
	AuthenticationManager authmanager;
	
	@Autowired
	BankUtils util;
	
	@Autowired
	BankRepository repo;

	
	
	public String registration(BankModel model) {

		try {
			org.springframework.security.core.Authentication auth = authmanager
					.authenticate(new UsernamePasswordAuthenticationToken(model.getUser_id(), model.getPassword()));
			System.out.println(auth.isAuthenticated());

			if (auth.isAuthenticated()) {
				BankUserDetails details = new BankUserDetails(model);
				String token = util.generatetoken(details);
				return token;
			}
			return "user not authenticated";

		} catch (Exception e) {
			e.printStackTrace();
			if (repo.findById(model.getUser_id()).isPresent()) {
				BankModel mdle = repo.findById(model.getUser_id()).get();

				if (!mdle.getPassword().equals(model.getPassword())) {
					return "email or password does not match";
				}
			}
			return "there is an error";

		}
	
	}
	
}
