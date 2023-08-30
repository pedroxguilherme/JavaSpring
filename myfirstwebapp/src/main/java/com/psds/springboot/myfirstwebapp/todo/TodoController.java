package com.psds.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class TodoController {
	
private TodoService todoService;	



public TodoController(TodoService todoService) {
	super();
	this.todoService = todoService;
}





@RequestMapping("todo-list")
public String goTodoList(ModelMap model) {
	
	  List<Todo> todos =  todoService.findByUsername("psds");

	  model.addAttribute("todos", todos);
	  
	  
      
	  return "todolist";
	  }
	
@RequestMapping(value="todo-add", method=RequestMethod.GET )
public String showNewTodoPage(ModelMap model ) {

	String username =(String) model.get("name");
	
	Todo todo = new Todo(0 ,username,"", LocalDate.now().plusYears(1), false);  
	model.put("todo", todo);
	  	  
	  	 
	  return "todoadd";
	
}

@RequestMapping(value="todo-add", method=RequestMethod.POST )
public String todoaddpost(ModelMap model, @Valid Todo todo, BindingResult result) {
String username =(String) model.get("name");
	
todoService.addTodo(username, todo.getDescription(), LocalDate.now(), false);  
if(result.hasErrors())	{
	
	return "todoadd";
}
	
	 
	  	  
	  	 
	  return "redirect:todo-list";
	
}
	
@RequestMapping("todo-delete")
public String DeleteTodo(@RequestParam int id) {
    todoService.deleteById(id);
	
	
	return "redirect:todo-list";
}



@RequestMapping(value="todo-update", method=RequestMethod.GET)
public String UpdateTodoGet(@RequestParam int id, ModelMap model) {
   
	Todo todo = todoService.findById(id);
	model.addAttribute("todo",todo);
	return "todoadd";
}

@RequestMapping(value="todo-update", method=RequestMethod.POST )
public String updateTodoPost(ModelMap model, @Valid Todo todo, BindingResult result) {
String username =(String) model.get("name");
	
todoService.updateTodo(todo); 
if(result.hasErrors())	{
	
	return "todoadd";
}
	
	 
	  	  
	  	 
	  return "redirect:todo-list";
	
}







	

}
