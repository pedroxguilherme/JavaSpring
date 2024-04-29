package com.psds.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController2 {

private TodoRepository todoRepository;	



public TodoController2(TodoRepository todoRepository, TodoService todoService) {
	super();
	this.todoRepository = todoRepository;
	
}




@RequestMapping("todo-list")
public String goTodoList(ModelMap model) {
	  String username =getLoggedinUsername(model);
	  List<Todo> todos =  todoRepository.findByUsername(username);

	  model.addAttribute("todos", todos);
	  
	  
      
	  return "todolist";
	  }
	
@RequestMapping(value="todo-add", method=RequestMethod.GET )
public String showNewTodoPage(ModelMap model ) {

	String username =getLoggedinUsername(model);
	
	Todo todo = new Todo(0 ,username,"", LocalDate.now().plusYears(1), false);  
	model.put("todo", todo);
	  	  
	  	 
	  return "todoadd";
	
}





private String getLoggedinUsername(ModelMap model) {
	return (String) model.get("name");
}

@RequestMapping(value="todo-add", method=RequestMethod.POST )
public String todoaddpost(ModelMap model, @Valid Todo todo, BindingResult result) {

	if(result.hasErrors())	{
	
	return "todoadd";
}
String username =getLoggedinUsername(model);	
todo.setUsername(username);
todoRepository.save(todo);

//todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);  	 

	  	 
	  return "redirect:todo-list";
	
}
	
@RequestMapping("todo-delete")
public String DeleteTodo(@RequestParam int id) {
    todoRepository.deleteById(id);
	
	
	return "redirect:todo-list";
}



@RequestMapping(value="todo-update", method=RequestMethod.GET)
public String UpdateTodoGet(@RequestParam int id, ModelMap model) {
   
	Todo todo = todoRepository.findById(id).get();
	model.addAttribute("todo",todo);
	return "todoadd";
}

@RequestMapping(value="todo-update", method=RequestMethod.POST )
public String updateTodoPost(ModelMap model, @Valid Todo todo, BindingResult result) {

	

if(result.hasErrors())	{
	
	return "todoadd";
}
	
String username =getLoggedinUsername(model);	
todo.setUsername(username);
todoRepository.save(todo);

	  	  
	  	 
	  return "redirect:todo-list";
	
}







	

}
