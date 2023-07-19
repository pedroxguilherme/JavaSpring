package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;



@Configuration
public class GamingConfiguration {

	
@Bean
public GamingConsole GamingConsole() {
	var game = new PacmanGame();
	
	
	return game;
}
	
	
	
	
	
@Bean
public GameRunner GameRunner() {
	
var GameRunner = new GameRunner(GamingConsole());
	
	
	
	return null;
	
}


	
	
	



}
