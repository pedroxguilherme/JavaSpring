package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Adress address) {
	
	
	
	
};

record Adress(String street, String city) {
		
}




@Configuration
public class HelloWorldConfiguration {
	
@Bean
public String name(){
	
	return "Blasky";
}

@Bean
public int age() {
return 25;	
}	

@Primary
@Bean
public Person person(){		
	
	return new Person("Garry", 23, adress());
	
}

@Bean
public Adress adress() {
	
	return new Adress("Av. Paulista","São Paulo");
	
	
}

@Bean(name = "person3")
public Person person2(){		
	
	return new Person("Garry", 23, new Adress("Centro", "Franco da Rocha"));
	
}




}