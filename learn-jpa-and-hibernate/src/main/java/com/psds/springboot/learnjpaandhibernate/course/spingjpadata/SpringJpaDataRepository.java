package com.psds.springboot.learnjpaandhibernate.course.spingjpadata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psds.springboot.learnjpaandhibernate.course.Course;

public interface SpringJpaDataRepository extends JpaRepository<Course, Long> {
 
public Course findByNameC(String nameC);
	
	
	
}
