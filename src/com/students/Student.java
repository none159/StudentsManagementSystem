package com.students;

import java.util.UUID;

public class Student {
   private UUID id;
   private String name;
   private String grade;
   public Student(UUID id,String name,String grade) {
	   this.id = id;
	   this.name = name;
	   this.grade = grade;
   }
public UUID getId() {
	return id;
}
public void setId(UUID id) {
	this.id = id;
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
@Override
public String toString() {
	return "ID : " + id +", NAME : " + name + ", GRADE : " + grade;
}
   
}
