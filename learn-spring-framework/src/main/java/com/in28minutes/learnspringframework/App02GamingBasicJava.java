package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App02GamingBasicJava {

	public static void main(String[] args) {

		
	try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
		
		
		
		context.getBean(GamingConsole.class).down();
		context.getBean(GameRunner.class).run();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
