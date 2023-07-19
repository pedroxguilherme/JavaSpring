package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		
		
		
		
		
		
		  
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		// Game is a dependency
		
		var gameRunner = new GameRunner(game);
		//gameRunner injecting  a dependency
		
		gameRunner.run();
		
		
		
		

	}



}
