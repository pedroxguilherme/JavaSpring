package com.in28minutes.learnspringframework.exemples.business;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;





@Configuration
@ComponentScan

public class RealInjectionLauncher {
	


	
	
	

	public static void main(String[] args) {

		
	try(var context = new AnnotationConfigApplicationContext( RealInjectionLauncher.class)){
		
		
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		
		
		
	
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
