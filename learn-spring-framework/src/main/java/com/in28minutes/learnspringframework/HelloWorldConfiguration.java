package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age, Address adress) {
	
	
	
	
};

record Address(String street, String city) {
		
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
	
	return new Person("Garry", 23, address());
	
}

@Bean
public Address address() {
	
	return new Address("Av. Paulista","São Paulo");
	
	
}
@Bean(name = "person3")
public Person person2(){		
	
	return new Person("Garry", 23, new Address("Centro", "Franco da Rocha"));
	
}





}