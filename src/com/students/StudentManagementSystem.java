package com.students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentManagementSystem {
   private List<Student> students = new ArrayList<>();
   
   public void addStudents(Student student,Connection connection) {
	   students.add(student);
	   try {
		Statement statement = connection.createStatement();
		int resultSet = statement.executeUpdate(String.format("insert into student(name,grade,class,studentid) values('%s','%s','%s','%s')",student.getName(),student.getGrade(),student.getClass(),student.getId()));
		 if(resultSet != 0) {
		    	System.out.println("*Addition Successful*");
		    }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void viewStudents(Connection connection) {
	   students.forEach(System.out::println);
	   try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM student;");
			while(resultSet.next()) {
				System.out.print("\n id : " +resultSet.getInt(1)+"\n name : "+resultSet.getString(2)+"\n grade : "+resultSet.getString(3)+"\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   public void updateStudent(String name,String newName,String newGrade,String newClass,String id,Connection connection) {
	/*for(Student s : students) {
		if(s.getId().toString().equals(id)) {
			s.setName(newName);
			s.setGrade(newGrade);
			break;
		}}*/
	   try {
			Statement statement = connection.createStatement();
			int resultSet = statement.executeUpdate(String.format("UPDATE student SET name='%s' , grade='%s' , class='%s' where name='%s' and studentid='%s' ;",newName,newGrade,name,newClass,id));
			 if(resultSet != 0) {
			    	System.out.println("*Update Successful*");
			    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
   }
   public void deleteStudent(String name,String classname,String id ,Connection connection) {
	 //  students.removeIf(s-> s.getId().toString().equals(id) );
	   try {
			Statement statement = connection.createStatement();
			int resultSet = statement.executeUpdate(String.format("DELETE from student where name='%s' and classname='%s' and studentid='%s';",name,classname,id));
		    if(resultSet != 0) {
		    	System.out.println("*Deletion Successful*");
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   public void searchStudentByName(String name,String classname,String id,Connection connection) {
	  /* for(Student s : students) {
		   if(s.getName().equalsIgnoreCase(name)) {
			   return s;
		   }}*/
	   try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(String.format("SELECT * FROM student where name='%s' and class='%s' and studentid='%s'",name,classname,id));
			while(resultSet.next()) {
				System.out.println("\n id : " +resultSet.getInt(1)+"\n name : "+resultSet.getString(2)+"\n grade : "+resultSet.getString(3)+"\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

   }

