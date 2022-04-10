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
public class AddClasses {
	
	
	
	
	 JDBCcommand jdbccmd = new JDBCcommand(); 
	 
	 @RequestMapping(value= "addClass", method =RequestMethod.POST )
	public String addclassid(@RequestParam("Classidtoadd") String Classidtoadd, 
			@RequestParam("Classnametoadd") String Classnametoadd, ModelMap map) throws SQLException 
	{String page ="addclasses";
	 
	{map.addAttribute("Classidtoadd", Classidtoadd); 
	 map.addAttribute("Classnametoadd", Classnametoadd); 
	
	 try {Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
     Statement st=conn.createStatement();
     int i=st.executeUpdate("insert into classes (ClassID, ClassName) values ('"+Classidtoadd+"','"+Classnametoadd+"')");
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

page = "classes";

	return page;}}


	@RequestMapping(value= "setupclassesforstudent", method =RequestMethod.POST )
	public String addsttocl(@RequestParam("Studentidforclassid") String Studentidforclassid, 
			@RequestParam("Classidforstudentid") String Classidforstudentid,    
			ModelMap map) throws SQLException 
	{String page ="addclasses";
	 {map.addAttribute("Studentidforclassid", Studentidforclassid); 
	map.addAttribute("Classidforstudentid", Classidforstudentid); 	 
	
	try {Class.forName("com.mysql.jdbc.Driver");
	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
     Statement st=conn.createStatement();
     int j=st.executeUpdate("insert into student_classes (Student_StudentID, st_Classes_ClassID) values ('"+Studentidforclassid+"','"+Classidforstudentid+"')");
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
	
page = "classes_student_rev"; 
	return page;} } 
	

	
	@RequestMapping(value= "setupclassesforsubject", method =RequestMethod.POST )
	public String addsbtocl(@RequestParam("Classidforsubjectid") String Classidforsubjectid, 
			@RequestParam("Subjectidforclassid") String Subjectidforclassid,    
			ModelMap map) throws SQLException 
	{String page ="addclasses";
	 {map.addAttribute("Classidforsubjectid", Classidforsubjectid); 
	map.addAttribute("Subjectidforclassid", Subjectidforclassid); 	 
	
	try {Class.forName("com.mysql.jdbc.Driver");
	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
     Statement st=conn.createStatement();
     int j=st.executeUpdate("insert into subject_classes (Subject_SubjectID, Classes_ClassID) values ('"+Subjectidforclassid+"','"+Classidforsubjectid+"')");
     conn.close(); 
     st.close(); }

  catch(Exception e)
  {System.out.print(e);
  e.printStackTrace();}
	
	   jdbccmd.update_Classes_Subject_rev();
	   jdbccmd.update_All_Table();  
	   jdbccmd.Classes_Subject_rev();
	   	jdbccmd.All_Table();
     System.out.println("Data is successfully inserted!");
	
page = "classes_subject_rev"; 
	return page;} } 
	
	
	
	@RequestMapping(value= "setupclassesforfaculty", method =RequestMethod.POST )
	public String addfatocl(@RequestParam("Classidforfacultyid") String Classidforfacultyid, 
			@RequestParam("Facultyidforclassid") String Facultyidforclassid,    
			ModelMap map) throws SQLException 
	{String page ="addclasses";
	 {map.addAttribute("Classidforfacultyid", Classidforfacultyid); 
	map.addAttribute("Facultyidforclassid", Facultyidforclassid); 	 
	
	try {Class.forName("com.mysql.jdbc.Driver");
	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
     Statement st=conn.createStatement();
     int j=st.executeUpdate("insert into faculty_classes (Faculty_FacultyID, Fc_Classes_ClassID) values ('"+Facultyidforclassid+"','"+Classidforfacultyid+"')");
     conn.close(); 
     st.close(); }

  catch(Exception e)
  {System.out.print(e);
  e.printStackTrace();}
	
	   jdbccmd.update_Classes_Faculty_rev();
	   jdbccmd.update_All_Table();  
	   jdbccmd.Classes_Faculty_rev();
	   jdbccmd.All_Table();
     System.out.println("Data is successfully inserted!");
	
page = "classes_faculty_rev"; 
	return page;} } 
		

	@RequestMapping(value= "deleteclass", method =RequestMethod.POST )
	public String deleteclass(@RequestParam("Classidtodelete") int Classidtodelete, ModelMap map)
			throws SQLException 
	{String page ="addclasses";
	 {map.addAttribute("Classidtodelete", Classidtodelete); 
	
	
	try {Class.forName("com.mysql.jdbc.Driver");
	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
     Statement st=conn.createStatement();
     int h=st.executeUpdate("DELETE FROM subject_classes WHERE Classes_ClassID = "+Classidtodelete+";");
     
     int i=st.executeUpdate("DELETE FROM faculty_classes WHERE Fc_Classes_ClassID = "+Classidtodelete+";");
     
     int j=st.executeUpdate("DELETE FROM student_classes WHERE st_Classes_ClassID = "+Classidtodelete+";");
     		     		
     int k =st.executeUpdate("DELETE FROM classes WHERE ClassID = "+Classidtodelete+";");
     
     conn.close(); 
     st.close(); }

  catch(Exception e)
  {System.out.print(e);
  e.printStackTrace();}
	
	   jdbccmd.update_Classes_Faculty_rev();
	   jdbccmd.update_Student_Classes_rev();
	   jdbccmd.update_Classes_Subject_rev();
	   jdbccmd.update_All_Table();  
	   jdbccmd.Classes_Faculty_rev();
	   jdbccmd.Student_Classes_rev();
	   jdbccmd.Classes_Subject_rev();   
	   jdbccmd.All_Table();
     System.out.println("Data successfully deleted!");
	
page = "classes"; 
	return page;} } 	
	
 




}

