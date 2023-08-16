package com.in28minutes.learnspringframework.exemples;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;





@Configuration
@ComponentScan
public class InjectionAppLauncher {
	
@Component
class YourBussinnesClass{
	
	Dependency1 dependency1;
	Dependency2 dependency2;
	

	
	
	public YourBussinnesClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor injector: ");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
		
	}





	/*
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}
	*/
	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
		
		
	}
	
	
	
	
}	
	

	
@Component	
class Dependency1{
	
	
	
	
}
@Component	
class Dependency2{
	
	
	
	
}	
	
	

	
	
	

	public static void main(String[] args) {

		
	try(var context = new AnnotationConfigApplicationContext(InjectionAppLauncher.class)){
		
		System.out.println(context.getBean(YourBussinnesClass.class).toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
