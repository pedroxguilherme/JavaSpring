package com.psds.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
@SessionAttributes("name")
@Controller
public class WelcomeController {
	
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String GotoWelcomePge(ModelMap model) {
		
		
		model.put("name", "psds");
		
		return "welcome";
		
	}
}
