package com.example.BankSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.BankModel.BankModel;
import com.example.BankRepo.BankRepository;

@Service
public class BankUserDetailsService implements UserDetailsService{
	
	@Autowired
	BankRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		BankModel model=repo.findById(username).get();
		return new BankUserDetails(model);
	}

}
