package com.in28minutes.learnspringframework.exemples.prototype;


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






@Configuration
@ComponentScan
public class PrototypeInicialization {
	
	@Component
	class NormalClass { 

		

	}
    @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Component
	class PrototypeClass { 

    }
		

	
	
	
	
	

	public static void main(String[] args) {

		
	try(var context = new AnnotationConfigApplicationContext(PrototypeInicialization.class)){
		
		
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
		
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
