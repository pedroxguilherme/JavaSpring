package com.psds.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
private Logger logger = LoggerFactory.getLogger(getClass());



@RequestMapping(value="login", method=RequestMethod.POST)
public String Gotowelcome(@RequestParam String name,@RequestParam String password ,ModelMap model) {
	model.put("name", name);
	model.put("password", password);
	logger.debug("Name:", name);
	
	
	
	logger.info("Printing in info level");
	
	return "welcome";
}	

@RequestMapping("login")
public String GotologinJsp() {
	
	
	logger.info("Printing in info level");
	return "login";
}	

	
	

}
