package com.psds.rest.webservices.restfulwebservices.helloworld;


import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private MessageSource messageSource;
	
	
	
	public HelloWorldController(MessageSource messageSource) {
	
		this.messageSource = messageSource;
	}

	//REQUEST METHODS
	
	//GET - RETRIVE DETAILS OF A RESOURCE
	//POST - CREATE A NEW RESOURCE
	//PUT - UPDATE AN EXISTINT RESOURCE
	//PATCH - UPDATE PART OF A RESOURCE
	//DELETE - DELETE A RESSOURCE
	
	@GetMapping(path="/hello-world")
	public String HelloWorld() {
		
		return "Hello World";
		
	}

	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello World");
		
	}
	
	@GetMapping(path="/hello-world-internalization")
	public String helloWorldBeanInternalization() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
		
		
	}
	
	//Path PARAMETER
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPathParameter(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello World %s", name));
		
	}
	

}
