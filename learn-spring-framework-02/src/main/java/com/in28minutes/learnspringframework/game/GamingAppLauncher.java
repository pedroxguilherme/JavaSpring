package com.in28minutes.learnspringframework.game;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;





@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncher {
	
	
	
	
	
	

	public static void main(String[] args) {

		
	try(var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)){
		
		
		
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
