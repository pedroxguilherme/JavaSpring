package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.GamingConsole;

public class SuperContraGame implements GamingConsole {

public void up() {
		
		System.out.println("UP");
		
	}
	public void down () {
		System.out.println("Crounch");
		
	}
	public void left() {
		System.out.println("go to the left side");
	}
    public void right() {
    	System.out.println("shoot a bullet");
    }	

}
