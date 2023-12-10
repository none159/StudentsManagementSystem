package com.students;

import java.util.UUID;

public class Student {
   private String name;
   private String grade;
   private String classname;
   private String id;
   public Student(String name,String grade,String classname,String id) {
	  
	   this.name = name;
	   this.grade = grade;
	   this.classname =classname;
	   this.setId(id);
   }

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}

public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
   
}
