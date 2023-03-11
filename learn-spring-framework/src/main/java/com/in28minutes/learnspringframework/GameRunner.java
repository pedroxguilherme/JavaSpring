package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GamingConsole;


public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		
		this.game = game;	
	}

	public void run() {
		System.out.println("Game running:" + this.game);
		this.game.down();
		this.game.up();
		this.game.left();
		this.game.right();
	}
	
	
	
	
	
	
	
	
	
	
	

}
