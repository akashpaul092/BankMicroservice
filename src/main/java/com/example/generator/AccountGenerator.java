package com.example.generator;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class AccountGenerator {


	public String idgenerator(){
		
		Random random=new Random();
		String a="";
		
		
		for(int i=0;i<=4;i++) {
			char ch=(char) (random.nextInt(26)+65);
			a=a+ch;
		}
		
		int b=1000*(1+random.nextInt(9))+100*(1+random.nextInt(9))+10*(1+random.nextInt(9))+(1+random.nextInt(9));
		char c=(char) (random.nextInt(26)+65);
		
		
		
		return (a+b+c);
	}
	
	public String ifscCode() {
		return "YML9876543";
	}
	
	public String accountNumber() {
		
		Random random=new Random();
		String a="";
		
		
		for (int i=0;i<8;i++) {
			a=a+random.nextInt(10);
		}
		
		String ac=ifscCode().substring(3)+a;
		return ac;

	}
	
	public String branchCode() {
		return "358765";
	}
	
}
