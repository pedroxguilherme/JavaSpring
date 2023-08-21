package com.psds.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psds.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.psds.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepoitory;
import com.psds.springboot.learnjpaandhibernate.course.spingjpadata.SpringJpaDataRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepoitory repository;
	
	@Autowired
	private SpringJpaDataRepository repository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.save(new Course(1, "Learn SpringBoot JPA","Psd"));
		repository.save(new Course(2, "Learn SpringFramework JPA","Psd"));
		repository.save(new Course(3, "Learn SpringJDBC JPA","Psds"));
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findByNameC("Psds"));
		
		
		
		
	
	}
	
	
	
	

}
