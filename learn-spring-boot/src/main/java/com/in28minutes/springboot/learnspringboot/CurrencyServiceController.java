package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {
	
@Autowired	
CurrencyServiceConfiguration configuration;	
	
	
	
@RequestMapping("/currency-service")	
	public CurrencyServiceConfiguration ReturnConfiguration(){
return configuration;
}
				
				
		
		
		
	}
	
	
	
	
	


