package com.psds.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
private static List<Todo> todos = new ArrayList<>();	


static {
	
	todos.add(new Todo(1, "psds", "Java", LocalDate.now(), true));
	todos.add(new Todo(2, "psds", "php", LocalDate.now().plusYears(2), false));
	
	
	
	
}


public List<Todo> findByUsername(String username){
	
	return todos;
	
	
	
}





}
