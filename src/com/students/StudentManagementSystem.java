package com.students;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentManagementSystem {
   private List<Student> students = new ArrayList<>();
   
   public void addStudents(Student student) {
	   students.add(student);
   }
   public void viewStudents() {
	   students.forEach(System.out::println);
   }
   public void updateStudent(String id,String newName,String newGrade) {
	for(Student s : students) {
		if(s.getId().toString().equals(id)) {
			s.setName(newName);
			s.setGrade(newGrade);
			break;
		}
	}   
   }
   public void deleteStudent(String id) {
	   students.removeIf(s-> s.getId().toString().equals(id) );
   }
   public Student searchStudentByName(String name) {
	   for(Student s : students) {
		   if(s.getName().equalsIgnoreCase(name)) {
			   return s;
		   }
	   }
	   return null;
   }
}
