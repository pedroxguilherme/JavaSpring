package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements GamingConsole {
	
	



	
	public void up() {
		
		System.out.println("GO UP");
		
	}
	public void down () {
		System.out.println("GO DOWN");
		
	}
	public void left() {
		System.out.println("GO LEFT");
	}
    public void right() {
    	System.out.println("GO RIGHT");
    }	
     

	
	

	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
