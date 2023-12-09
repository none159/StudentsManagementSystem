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
     static public void addstud() {
	     UUID id = UUID.randomUUID();
	     System.out.println("Enter You're Name : ");
	     String name = input.next();
	     System.out.println("Enter You're Grade : ");
	     String grade = input.next();
	     sms.addStudents(new Student(id,name,grade));
	     choice=0;
}
     static public void updatestud() {
	 System.out.println("What's the id of Student you're trying to update : ");
     String id = input.next();
     System.out.println("Enter You're new Name : ");
     String name = input.next();
     System.out.println("Enter You're new Grade : ");
     String grade = input.next();
     sms.updateStudent(id,name,grade);
     choice = 0;
}
     static public void searchstud() {
    	 System.out.println("Enter Name you want to search for : ");
    	 String name = input.next();
    	 if(sms.searchStudentByName(name)!= null) {
    	 System.out.println(sms.searchStudentByName(name));
    	 }
    	 else {
    		 System.out.println("Not Found");
    	 }
    	 choice=0;
     }
     static public void deletestud() {
    	 System.out.println("Enter id of student you want to delete : ");
    	 String id = input.next();
    	 sms.deleteStudent(id);
    	 choice=0;
     }
     static public void viewstuds() {
    	 sms.viewStudents();
    	 choice=0;
     }
	public static void main(String[] args)  {
		String username ="root";
		String url = "jdbc:mysql://localhost:3306/Students";
		String password="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(choice == 0) {
     System.out.print("Choose Fonctionality : \n 1 - Add Student \n 2 - Update Student \n 3 - Search For Student \n 4 - Delete Student \n 5 - View Students \n 6 - Quit \n");
     System.out.println("Choice : ");
     
      choice = input.nextInt();
     switch(choice) {
     case 0:
    	 break;
     case 1:
    	 addstud();
    	 break;
     case 2 :
    	 updatestud();
    	 break;
     case 3 :
    	  searchstud();
    	  break;
     case 4 : 
    	 deletestud();
    	 break;
     case 5 : 
    	 viewstuds();
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
