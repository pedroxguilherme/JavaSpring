package com.psds.springboot.myfirstwebapp.login;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("name")
@Controller
public class WelcomeController {
	
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String GotoWelcomePge(ModelMap model) {
		
		
		model.put("name", getLoggedinUsername());
		
		return "welcome";
		
	}
	private String getLoggedinUsername() {
	 Authentication authentication = SecurityContextHolder.
			 getContext().
			 getAuthentication();
	 return authentication.getName();
		
	}
	
	
}
