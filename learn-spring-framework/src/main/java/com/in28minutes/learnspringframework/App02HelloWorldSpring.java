package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		
		//1: LAUNCH SPRING CONTEXT
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: CONFIGURE THE THINGS THAT WE WANT SPRING MANAGE TO -
		// HELLOWORDCONFIGURATION - BEAN - @CONFIGURATION
		
		//3: RETRIEVING BEANS MANAGED BY SPRING
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
        System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person3"));
		
		

	}

}
