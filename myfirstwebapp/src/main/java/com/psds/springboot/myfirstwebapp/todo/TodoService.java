package com.psds.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@SessionAttributes("name")
@Service
public class TodoService {
	
private static List<Todo> todos = new ArrayList<>();	
private static int counttodo = 0;

static {
	
	todos.add(new Todo(counttodo++, "psds20", "Java", LocalDate.now(), true));
	todos.add(new Todo(counttodo++, "psds20", "php", LocalDate.now().plusYears(2), false));
	
	
	
	
}


public List<Todo> findByUsername(String username){
	
	return todos;
	
	
}
public void addTodo(String username, String Descripiton, LocalDate targetDate, boolean done){
	Todo todo = new Todo(counttodo++, username, Descripiton, targetDate, done);
	todos.add(todo);
	
}
public void deleteById(int id) {
	
	Predicate<? super Todo> predicate = todo -> todo.getId() == id;
	todos.removeIf(predicate );
	
}
public Todo findById(int id) {
	Predicate<? super Todo> predicate = todo -> todo.getId() == id;
	Todo todo = todos.stream().filter(predicate).findFirst().get();
	return todo;
}
public void updateTodo(@Valid Todo todo) {
	deleteById(todo.getId());
	todos.add(todo);
	
	
	
	
}




}
