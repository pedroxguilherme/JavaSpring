package com.in28minutes.learnspringframework.exemples.lazy;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;






@Configuration
@ComponentScan
public class LazyInicialization {
	
	@Component
	class ClassA { 

		

	}
    @Lazy
	@Component
	class ClassB { 

	private ClassA classA;	
	
	 ClassB(ClassA classA){
		 
	System.out.println("Alguma inicializacao");	 
	 this.classA = classA;
	 }
    void doSomething(){
    	System.out.println("Doing Something");
    }
		

	}
	
	
	
	

	public static void main(String[] args) {

		
	try(var context = new AnnotationConfigApplicationContext(LazyInicialization.class)){
		
		
		System.out.println(
				context.getBean(ClassB.class));
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
