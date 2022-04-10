package com.controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.String; 
import java.lang.NumberFormatException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;
import com.dao.JDBCcommand;


@Controller
public class AddFaculties {
	 JDBCcommand jdbccmd = new JDBCcommand(); 
	 
	 @RequestMapping(value= "addfaculty", method =RequestMethod.POST )
	public String addfacultyid(@RequestParam("Facultyidtoadd") String Facultyidtoadd, 
	@RequestParam("Facultynametoadd") String Facultynametoadd, ModelMap map) throws SQLException 
	{String page ="addfaculties";
	 
	{map.addAttribute("Facultyidtoadd", Facultyidtoadd); 
	 map.addAttribute("Facultynametoadd", Facultynametoadd); 
	
	 try {Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
    Statement st=conn.createStatement();
    int i=st.executeUpdate("insert into faculty (FacultyID, FacultyName) values ('"+Facultyidtoadd+"','"+Facultynametoadd+"')");
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

page = "faculty";

	return page;}}


		@RequestMapping(value= "deletefaculty", method =RequestMethod.POST )
		public String deletefaculty(@RequestParam("Facultyidtodelete") int Facultyidtodelete, ModelMap map) 
				throws SQLException
				
      	{String page ="addfaculties";
		 {map.addAttribute("Facultyidtodelete", Facultyidtodelete); 
		
		
		try {Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy1", "root", "12345678");
	     Statement st=conn.createStatement();
	
	     
	     int i=st.executeUpdate("DELETE FROM faculty_classes WHERE Faculty_FacultyID = '"+Facultyidtodelete+"';");
	     
	     		     		
	     int k =st.executeUpdate("DELETE FROM faculty WHERE facultyID = '"+Facultyidtodelete+"';");
	     
	     conn.close(); 
	     st.close(); }

	  catch(Exception e)
	  {System.out.print(e);
	  e.printStackTrace();
	  page = "error";
		return page;}
		
		
		
		   jdbccmd.update_Classes_Faculty_rev();
		   jdbccmd.update_Student_Classes_rev();
		   jdbccmd.update_Classes_Subject_rev();
		   jdbccmd.update_All_Table();  
		   jdbccmd.Classes_Faculty_rev();
		   jdbccmd.Student_Classes_rev();
		   jdbccmd.Classes_Subject_rev();   
		   jdbccmd.All_Table();
	     System.out.println("Data successfully deleted!");
		
	     page = "faculty";
		return page;} }  

	 

	 
	
}
