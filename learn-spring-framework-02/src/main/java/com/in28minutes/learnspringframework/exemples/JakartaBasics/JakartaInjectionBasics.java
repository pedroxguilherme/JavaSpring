package com.in28minutes.learnspringframework.exemples.JakartaBasics;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;





	

//@Component
 @Named
	class SomeClass { 
	private SomeDependency someDependency;

	
    //@Autowired
	@Inject
	public void setSomeDependency(SomeDependency someDependency) {
		this.someDependency = someDependency;
	}
		
	public SomeDependency getSomeDependency() {
		return someDependency;
	}


	
	
	
	
	
	
	}


	
	//@Component
    @Named
	class SomeDependency {
	
		
		
		
	}









@Configuration
@ComponentScan
public class JakartaInjectionBasics {
	
	
		

	
	
	
	
	

	public static void main(String[] args) {

		
	try(var context = new AnnotationConfigApplicationContext(JakartaInjectionBasics.class)){
		
		
	    
		
		System.out.println(context.getBean(SomeClass.class).getSomeDependency());
		

		
		
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(System.out::println);
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
