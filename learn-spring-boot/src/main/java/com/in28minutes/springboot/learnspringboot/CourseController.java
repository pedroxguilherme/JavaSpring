package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	
@RequestMapping("/courses")	
	public List<Course> ReturnCourse(){
		return Arrays.asList(
		new Course (1, "learn Java", "in28minutes"),		
		new Course (2, "learn python", "in28minutews")
				
				);
				
				
		
		
		
	}
	
	
	
	
	

}
