package com.students;
import java.util.UUID;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	static  StudentManagementSystem sms = new StudentManagementSystem();
     static Scanner input = new Scanner(System.in);
     static int choice;
     static public void addstud(Connection connection) {
	     
	     System.out.println("Enter You're Name : ");
	     String name = input.next();
	     System.out.println("Enter You're Grade : ");
	     String grade = input.next();
	     System.out.println("Enter You're Class Name : ");
	     String classname = input.next();
	     System.out.println("Enter You're Student id (You can't change id): ");
	     String id = input.next();
	     sms.addStudents(new Student(name,grade,classname,id),connection);
	     choice=0;
}
     static public void updatestud(Connection connection) {
	 System.out.println("What's the name of Student you're trying to update : ");
     String oldname = input.next();
     System.out.println("What's the id of Student you're trying to update : ");
     String id = input.next();
     System.out.println("Enter You're new Name : ");
     String newname = input.next();
     System.out.println("Enter You're new Grade : ");
     String grade = input.next();
     System.out.println("Enter You're new Class Name : ");
     String classname = input.next();
     sms.updateStudent(oldname,newname,grade,classname,id,connection);
     choice = 0;
}
     static public void searchstud(Connection connection) {
    	 System.out.println("Enter Name you want to search for : ");
    	 String name = input.next();
    	  System.out.println("Enter You're Class Name : ");
 	     String classname = input.next();
 	    System.out.println("Enter You're id: ");
	     String id = input.next();
    	sms.searchStudentByName(name,classname,id,connection);
    	 choice=0;
     }
     static public void deletestud(Connection connection) {
    	 System.out.println("Enter name of student you want to delete : ");
    	 String name = input.next();
    	  System.out.println("Enter You're Class Name : ");
 	     String classname = input.next();
 	    System.out.println("Enter You're Student id : ");
	     String id = input.next();
    	 sms.deleteStudent(name,classname,id,connection);
    	 choice=0;
     }
     static public void viewstuds(Connection connection) {
    	 sms.viewStudents(connection);
    	 choice=0;
     }
	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		String username ="root";
		String url = "jdbc:mysql://localhost:3306/Students";
		String password="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,username,password);
		
		while(choice == 0) {
     System.out.print("Choose Fonctionality : \n 1 - Add Student \n 2 - Update Student \n 3 - Search For Student \n 4 - Delete Student \n 5 - View Students \n 6 - Quit \n");
     System.out.println("Choice : ");
     
      choice = input.nextInt();
     switch(choice) {
     case 0:
    	 break;
     case 1:
    	 addstud(connection);
    	 break;
     case 2 :
    	 updatestud(connection);
    	 break;
     case 3 :
    	  searchstud(connection);
    	  break;
     case 4 : 
    	 deletestud(connection);
    	 break;
     case 5 : 
    	 viewstuds(connection);
    	 break;
     case 6:
    	 System.out.println("Exiting programme....");
    	 input.close();
    	 System.exit(0);
    	 
    default:
    	System.out.println("Enter Valid Choice");
     }
     
		}
    
  
     
     
	}
	

}
