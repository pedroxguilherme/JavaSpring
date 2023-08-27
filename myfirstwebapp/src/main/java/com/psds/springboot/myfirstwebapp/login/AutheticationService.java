package com.psds.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AutheticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equals("psds20");
		boolean isValidPassword = password.equals("123456");
		
		return isValidUsername  && isValidPassword;
	}
	
	
	

}
