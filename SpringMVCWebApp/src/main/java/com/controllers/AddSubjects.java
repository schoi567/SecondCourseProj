package com.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.JDBCcommand;


@Controller
public class AddSubjects {
	 JDBCcommand jdbccmd = new JDBCcommand(); 
	 
	 @RequestMapping(value= "addsubject", method =RequestMethod.POST )
	public String addsubjectid(@RequestParam("Subjectidtoadd") String Subjectidtoadd, 
	@RequestParam("Subjectnametoadd") String Subjectnametoadd, ModelMap map) throws SQLException 
	{String page ="addsubjects";
	 
	{map.addAttribute("Subjectidtoadd", Subjectidtoadd); 
	 map.addAttribute("Subjectnametoadd", Subjectnametoadd); 
	
	 try {Class.forName("com.mysql.jdbc.Driver");
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
   Statement st=conn.createStatement();
   int i=st.executeUpdate("insert into subject (SubjectID, SubjectName) values ('"+Subjectidtoadd+"','"+Subjectnametoadd+"')");
   conn.close(); 
   st.close(); }  
	 
	 catch(Exception e)
	  {System.out.print(e);
	  e.printStackTrace();} 
 
	   jdbccmd.update_Student_Classes_rev();
	   jdbccmd.update_All_Table();  
	   jdbccmd.Student_Classes_rev(); 
	   jdbccmd.All_Table();
	     System.out.println("Data is successfully inserted!");

page = "subject";

	return page;}  }
	
	
	
	
	@RequestMapping(value= "deletesubject", method =RequestMethod.POST )
	public String deletesubject(@RequestParam("Subjectidtodelete") int Subjectidtodelete, ModelMap map) throws SQLException 
			
  	{String page ="addfaculties";
	 {map.addAttribute("Subjectidtodelete", Subjectidtodelete); 
	
	
	try {Class.forName("com.mysql.jdbc.Driver");
	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
     Statement st=conn.createStatement();

     
     int i=st.executeUpdate("DELETE FROM subject_classes WHERE Subject_SubjectID = '"+Subjectidtodelete+"';");
     
     		     		
     int k =st.executeUpdate("DELETE FROM subject WHERE subjectID = '"+Subjectidtodelete+"';");
     
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
	
     page = "subject";
	return page;} }  

 

	
	
 
	
	
	
	
	} 
	 
 
	 
  
	 

