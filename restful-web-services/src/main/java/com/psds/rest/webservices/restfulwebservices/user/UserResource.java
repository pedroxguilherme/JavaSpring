package com.psds.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {
	
	
	/*
	//RESPONSE STATUSES
	200 - SUCESS
	201 - CREATED
	204 - NO CONTENT
	401 - UNAUTHORIZED
	400 - BAD REQUEST(VALIDATION ERROR)
	404- RESORCE NOT FOUND
	500- SERVER ERROR
	
	*/
	
	
	
	private UserDaoService service;

	public UserResource(UserDaoService service) {
		
		this.service = service;
	}

	//GET METHOD
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		
		
		
		
		return service.FindAll();
	}
 

	//GET METHOD
	@GetMapping("/users/{id}")
	public User retrieveAllUsers(@PathVariable int id) {
		User user =service.findByID(id);
		if(user==null) {
			throw new UserNotFoundException("id:" + id);
			
			
		}
		
		return user; 
	}

	//POST METHOD
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);
		// users/ 4 => users/{id} => user.getID
		URI location = ServletUriComponentsBuilder.
				fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	//DELETE METHOD
	@DeleteMapping("/users/{id}")
	public void deleteUsers(@PathVariable int id) {
		service.deleteByID(id);
		
		
		
	}
	
	
	
}
