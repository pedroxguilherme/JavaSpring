package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) {
	
	
	
	
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


@Bean
public Person person(){		
	
	return new Person("Garry", 23);
	
}

@Bean
public Adress adress() {
	
	return new Adress("Av. Paulista","São Paulo");
	
	
}






}