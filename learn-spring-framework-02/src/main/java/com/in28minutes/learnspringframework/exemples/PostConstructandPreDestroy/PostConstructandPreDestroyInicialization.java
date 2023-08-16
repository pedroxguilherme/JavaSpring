package com.in28minutes.learnspringframework.exemples.PostConstructandPreDestroy;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

	@Component
	class SomeClass { 
	private SomeDependency someDependency;
		
	
	SomeClass(SomeDependency someDepency){
	super();	
	this.someDependency = someDepency;	
	System.out.println("Todas dependencias estão prontas");	
	
	}
	
	@PostConstruct
	public void inicializar() {
		
	someDependency.ready();
	
	}
	@PreDestroy
	public void Destroy() {
		
		someDependency.destroy();
		
		}
	
	
	
	
	
	}


	
	@Component
	class SomeDependency {
	
		public void ready() {
			System.out.println("Dependency Ready");
			
		}

		public void destroy() {
			System.out.println("Cleanup");
			
		} 
	
		
		
	}









@Configuration
@ComponentScan
public class PostConstructandPreDestroyInicialization {
	
	
		

	
	
	
	
	

	public static void main(String[] args) {

		
	try(var context = new AnnotationConfigApplicationContext(PostConstructandPreDestroyInicialization.class)){
		
		
	    System.out.println(context.getBean(SomeClass.class));
		
		
		
		
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(C -> System.out.println(C));
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
