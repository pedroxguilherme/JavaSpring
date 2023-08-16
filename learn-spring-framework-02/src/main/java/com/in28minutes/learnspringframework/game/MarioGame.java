package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MarioGame implements GamingConsole {
	


	
	public void up() {
		
		System.out.println("JUMP");
		
	}
	public void down () {
		System.out.println("Enter in a hole");
		
	}
	public void left() {
		System.out.println("go to the left side");
	}
    public void right() {
    	System.out.println("go to the right side");
    }	
     

	
	

	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
