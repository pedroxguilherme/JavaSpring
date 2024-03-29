package com.in28minutes.learnspringframework.exemples.xml;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;






@Configuration
@ComponentScan
public class XmlInjection {
	
	
	

	public static void main(String[] args) {

		
	try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
		
		
		
		
		
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(System.out::println);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		context.getBean(GameRunner.class).run();
		
		
		
		
		
	}
		
		
		
		
	
		
		

	}



}
