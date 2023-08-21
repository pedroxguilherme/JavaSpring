package com.psds.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Course {

@Id
private long id;
//@Column(name="nameC")
private String nameC;
private String author;


public Course() {
	
}

public Course(long id, String nameC, String author) {
	super();
	this.id = id;
	this.nameC = nameC;
	this.author = author;
}




public long getId() {
	return id;
}

public String getNameC() {
	return nameC;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
public void setId(long id) {
	this.id = id;
}
public void setNameC(String nameC) {
	this.nameC = nameC;
}

@Override
public String toString() {
	return "Courses [id=" + id + ", nameC=" + nameC + ", author=" + author + "]";
}



	
	

}
