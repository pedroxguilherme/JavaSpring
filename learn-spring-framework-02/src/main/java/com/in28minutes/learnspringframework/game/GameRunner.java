package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole game;
	
	GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
		
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
