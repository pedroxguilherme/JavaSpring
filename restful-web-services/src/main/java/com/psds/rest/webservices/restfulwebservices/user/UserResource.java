package com.psds.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	private UserDaoService service;

	public UserResource(UserDaoService service) {
		
		this.service = service;
	}
	
	
	@GetMapping(path="/users")
	public List<User> retrieveAllUsers() {
		
		return service.FindAll();
	}

	@GetMapping(path="/users/{numero}")
	public User retrieveAllUsers(@PathVariable int numero) {
		
		return service.FindbyID(numero);
	}
	
	
	
}
