package com.in28minutes.learnspringframework;

public class GameRunner {
	
	GamingConsole game;
	
	GameRunner(GamingConsole game) {
		
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
