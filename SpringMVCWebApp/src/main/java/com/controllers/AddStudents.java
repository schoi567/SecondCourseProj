package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.JDBCcommand;


@Controller
public class AddStudents {
	 JDBCcommand jdbccmd = new JDBCcommand(); 
	 
	 @RequestMapping(value= "addstudent", method =RequestMethod.POST )
	public String addstudentid(@RequestParam("Studentidtoadd") String Studentidtoadd, 
	@RequestParam("Studentnametoadd") String Studentnametoadd, ModelMap map) throws SQLException  
	{String page ="addstudents";
	 
	{map.addAttribute("Studentidtoadd", Studentidtoadd); 
	 map.addAttribute("Studentnametoadd", Studentnametoadd); 
	
	 try {Class.forName("com.mysql.jdbc.Driver");
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
   Statement st=conn.createStatement();
   int i=st.executeUpdate("insert into student (StudentID, StudentName) values ('"+Studentidtoadd+"','"+Studentnametoadd+"')");
 
   conn.close(); 
   st.close(); }   
	 catch(SQLException e)
	  {System.out.print(e);
	  e.printStackTrace();
	  
	  } 

	 

	 
	 catch(Exception e)
	  {System.out.print(e);
	  e.printStackTrace();} 
 
	   jdbccmd.update_Student_Classes_rev();
	   jdbccmd.update_All_Table();  
	   jdbccmd.Student_Classes_rev(); 
	   jdbccmd.All_Table();
	     System.out.println("Data is successfully inserted!");

page = "student";

	return page;}  
	} 
	 
 
		
		@RequestMapping(value= "deletestudent", method =RequestMethod.POST )
		public String deletestudent(@RequestParam("Studentidtodelete") int Studentidtodelete, ModelMap map) throws SQLException 
				
	  	{String page ="addfaculties";
		 {map.addAttribute("Studentidtodelete", Studentidtodelete); 
		
		
		try {Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
	     Statement st=conn.createStatement();

	     
	     int i=st.executeUpdate("DELETE FROM student_classes WHERE Student_StudentID = '"+Studentidtodelete+"';");
	     
	     		     		
	     int k =st.executeUpdate("DELETE FROM student WHERE StudentID = '"+Studentidtodelete+"';");
	     
	     conn.close(); 
	     st.close(); }

	  catch(Exception e)
	  {System.out.print(e);
	  e.printStackTrace();
	  page = "Error";
		return page;
	  
	  }
		
		
		   jdbccmd.update_Classes_Faculty_rev();
		   jdbccmd.update_Student_Classes_rev();
		   jdbccmd.update_Classes_Subject_rev();
		   jdbccmd.update_All_Table();  
		   jdbccmd.Classes_Faculty_rev();
		   jdbccmd.Student_Classes_rev();
		   jdbccmd.Classes_Subject_rev();   
		   jdbccmd.All_Table();
	     System.out.println("Data successfully deleted!");
		
	     page = "student";
		return page;} }  

  
	 

}
