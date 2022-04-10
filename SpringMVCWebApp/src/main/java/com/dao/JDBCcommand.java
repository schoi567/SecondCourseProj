package com.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.control.ControlMain;
import com.sql.Classes;
import com.sql.Subject;


public class JDBCcommand {
	ControlMain CM = new ControlMain();  
		
 
	public void Classes_Subject_rev() throws SQLException {
		Statement stmt = null;
		Integer rs = null;		
		 String name,pass,url;  
         Connection conn = null;  
         try {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
             url="jdbc:mysql://localhost:3306/learnersacademy1";  
             name="root";  
             pass="12345678";  
             conn = DriverManager.getConnection(url,name,pass);  
             System.out.println("Connection created");  }  
             catch (Exception e) {  
             System.out.println(e.toString());  
         }  
		
		
		try {
		    stmt = conn.createStatement();
		    rs = stmt.executeUpdate("create table classes_subject_rev\r\n"
		    		+ "SELECT subject_classes.Classes_ClassID as classid, \r\n"
		    		+ "classes.classname as classname, \r\n"
		    		+ "subject_classes.Subject_SubjectID as subjectid, \r\n"
		    		+ "subject.SubjectName as subjectname\r\n"
		    		+ "from subject_classes\r\n"
		    		+ "LEFT outer JOIN subject ON \r\n"
		    		+ "subject_classes.Subject_SubjectID = subject.SubjectID\r\n"
		    		+ "LEFT outer JOIN classes ON \r\n"
		    		+ "subject_classes.Classes_ClassID = classes.classid\r\n"
		    		+ "Union \r\n"
		    		+ "SELECT subject_classes.Classes_ClassID as classid, \r\n"
		    		+ "classes.classname as classname, \r\n"
		    		+ "subject_classes.Subject_SubjectID as subjectid, \r\n"
		    		+ "subject.SubjectName as subjectname\r\n"
		    		+ "from subject_classes\r\n"
		    		+ "right outer JOIN subject ON \r\n"
		    		+ "subject_classes.Subject_SubjectID = subject.SubjectID\r\n"
		    		+ "right outer JOIN classes ON \r\n"
		    		+ "subject_classes.Classes_ClassID = classes.classid\r\n");

		    if (stmt.execute("create table classes_subject_rev\r\n"
		    		+ "SELECT subject_classes.Classes_ClassID as classid, \r\n"
		    		+ "classes.classname as classname, \r\n"
		    		+ "subject_classes.Subject_SubjectID as subjectid, \r\n"
		    		+ "subject.SubjectName as subjectname\r\n"
		    		+ "from subject_classes\r\n"
		    		+ "LEFT outer JOIN subject ON \r\n"
		    		+ "subject_classes.Subject_SubjectID = subject.SubjectID\r\n"
		    		+ "LEFT outer JOIN classes ON \r\n"
		    		+ "subject_classes.Classes_ClassID = classes.classid\r\n"
		    		+ "Union \r\n"
		    		+ "SELECT subject_classes.Classes_ClassID as classid, \r\n"
		    		+ "classes.classname as classname, \r\n"
		    		+ "subject_classes.Subject_SubjectID as subjectid, \r\n"
		    		+ "subject.SubjectName as subjectname\r\n"
		    		+ "from subject_classes\r\n"
		    		+ "right outer JOIN subject ON \r\n"
		    		+ "subject_classes.Subject_SubjectID = subject.SubjectID\r\n"
		    		+ "right outer JOIN classes ON \r\n"
		    		+ "subject_classes.Classes_ClassID = classes.classid\r\n"));
		    {System.out.println("Classes_Subject_rev() table for Classes and Faculty made");}
		    stmt.close(); 
		    conn.close(); 
		
		
		
		}	catch (SQLException ex){
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());}}
	
	
	
	public void update_Classes_Subject_rev() throws SQLException {
		Statement stmt = null;
		Integer rs = null;		
		 String name,pass,url;  
         Connection conn = null;  
         try {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
             url="jdbc:mysql://localhost:3306/learnersacademy1";  
             name="root";  
             pass="12345678";  
             conn = DriverManager.getConnection(url,name,pass);  
             System.out.println("Connection created");  }  
             catch (Exception e) {  
             System.out.println(e.toString());  
         }  
		
		
		try {
		    stmt = conn.createStatement();
		    rs = stmt.executeUpdate("drop table classes_subject_rev;");

		    if (stmt.execute("drop table classes_subject_rev;"));
		    {System.out.println("Classes_Subject_rev() table update started");}
		    stmt.close(); 
		    conn.close(); 
		
		
		
		}	catch (SQLException ex){
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());}}
	
	
	
	public void update_Classes_Faculty_rev() throws SQLException {
		Statement stmt = null;
		Integer rs = null;		
		 String name,pass,url;  
         Connection conn = null;  
         try {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
             url="jdbc:mysql://localhost:3306/learnersacademy1";  
             name="root";  
             pass="12345678";  
             conn = DriverManager.getConnection(url,name,pass);  
             System.out.println("Connection created");  }  
             catch (Exception e) {System.out.println(e.toString());   }  
		
		
		try {
		    stmt = conn.createStatement();
		    rs = stmt.executeUpdate("drop table classes_faculty_rev;");
		    if (stmt.execute("drop table classes_faculty_rev;"));	    
	    stmt.close(); 
	    conn.close(); 
	    {System.out.println("Classes_Faculty_rev() table for update");
		
		}}
		    
		
		
		catch (SQLException ex){
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());}}
	

	
	public void Classes_Faculty_rev() throws SQLException {
		Statement stmt = null;
		Integer rs = null;		
		 String name,pass,url;  
         Connection conn = null;  
         try {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
             url="jdbc:mysql://localhost:3306/learnersacademy1";  
             name="root";  
             pass="12345678";  
             conn = DriverManager.getConnection(url,name,pass);  
             System.out.println("Connection created");  }  
             catch (Exception e) {  
             System.out.println(e.toString());  
         }  
		
		
		try {
		    stmt = conn.createStatement();
		    rs = stmt.executeUpdate(
		    		"create table classes_faculty_rev\r\n"
		    		+ "SELECT faculty_classes.FC_Classes_ClassID as classid, \r\n"
		    		+ "classes.classname as classname, \r\n"
		    		+ "faculty_classes.Faculty_FacultyID as facultyid, \r\n"
		    		+ "faculty.facultyname as facultyname\r\n"
		    		+ "from faculty_classes\r\n"
		    		+ "LEFT outer JOIN faculty ON \r\n"
		    		+ "faculty_classes.Faculty_facultyID = faculty.FacultyID  \r\n"
		    		+ "LEFT outer JOIN classes ON \r\n"
		    		+ "faculty_classes.Fc_Classes_ClassID = classes.ClassID \r\n"
		    		+ "Union \r\n"
		    		+ "SELECT faculty_classes.FC_Classes_ClassID as classid, \r\n"
		    		+ "classes.classname as classname, \r\n"
		    		+ "faculty_classes.Faculty_FacultyID as facultyid, \r\n"
		    		+ "faculty.facultyname as facultyname\r\n"
		    		+ "from faculty_classes\r\n"
		    		+ "right outer JOIN faculty ON \r\n"
		    		+ "faculty_classes.Faculty_facultyID = faculty.FacultyID  \r\n"
		    		+ "right outer JOIN classes ON \r\n"
		    		+ "faculty_classes.Fc_Classes_ClassID = classes.classid \r\n");

		    if (stmt.execute(
	    		"create table classes_faculty_rev\r\n"
	    		+ "SELECT faculty_classes.FC_Classes_ClassID as classid, \r\n"
	    		+ "classes.classname as classname, \r\n"
	    		+ "faculty_classes.Faculty_FacultyID as facultyid, \r\n"
	    		+ "faculty.facultyname as facultyname\r\n"
	    		+ "from faculty_classes\r\n"
	    		+ "LEFT outer JOIN faculty ON \r\n"
	    		+ "LEFT outer JOIN classes ON \r\n"
	    		+ "faculty_classes.Fc_Classes_ClassID = classes.classid \r\n"
	    		+ "Union \r\n"
	    		+ "SELECT faculty_classes.FC_Classes_ClassID as classid, \r\n"
	    		+ "classes.classname as classname, \r\n"
	    		+ "faculty_classes.Faculty_FacultyID as facultyid, \r\n"
	    		+ "faculty.facultyname as facultyname\r\n"
	    		+ "from faculty_classes\r\n"
	    		+ "RIGHT outer JOIN faculty ON \r\n"		    		
	    		+ "faculty_classes.Faculty_facultyID = faculty.FacultyID  \r\n"
		    	+ "RIGHT outer JOIN classes ON \r\n"
	    		+ "faculty_classes.Fc_Classes_ClassID = classes.ClassID \r\n"))   		    	
	    {System.out.println("Classes_Faculty_rev() table for Classes and Faculty made");
	    
	    stmt.close(); 
	    conn.close(); }
		    
		}
		
		catch (SQLException ex){
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());}}
	
	
	public void Student_Classes_rev() throws SQLException {
		Statement stmt = null;
		Integer rs = null;		
		 String name,pass,url;  
         Connection conn = null;  
         try {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
             url="jdbc:mysql://localhost:3306/learnersacademy1";  
             name="root";  
             pass="12345678";  
             conn = DriverManager.getConnection(url,name,pass);  
             System.out.println("Connection created");  }  
             catch (Exception e) {  
             System.out.println(e.toString());  
         }  
		
		
		try {
		    stmt = conn.createStatement();
		    rs = stmt.executeUpdate(
		    		"create table classes_student_rev\r\n"
		    		+ "SELECT \r\n"
		    		+ "student_classes.st_classes_classid as classid, \r\n"
		    		+ "classes.classname as classname, student_classes.Student_StudentID as studentid, \r\n"
		    		+ "student.studentname as studentname\r\n"
		    		+ "from student_classes \r\n"
		    		+ "LEFT outer JOIN student ON student_classes.Student_StudentID  = student.studentid\r\n"
		    		+ "LEFT outer JOIN classes ON student_classes.st_Classes_classID  = classes.classid \r\n"
		    		+ "Union \r\n"
		    		+ "SELECT student_classes.st_classes_classid, \r\n"
		    		+ "classes.classname as classname, \r\n"
		    		+ "student_classes.Student_StudentID as studentid, \r\n"
		    		+ "student.studentname as studentname\r\n"
		    		+ "from student_classes \r\n"
		    		+ "right outer JOIN student ON student_classes.Student_StudentID = student.studentid\r\n"
		    		+ "right outer JOIN classes ON student_classes.st_Classes_classID = classes.classid");

		    if (stmt.execute(
		    		"create table classes_student_rev\r\n"
				    		+ "SELECT \r\n"
				    		+ "student_classes.st_classes_classid as classid, \r\n"
				    		+ "classes.classname as classname, student_classes.Student_StudentID as studentid, \r\n"
				    		+ "student.studentname as studentname\r\n"
				    		+ "from student_classes \r\n"
				    		+ "LEFT outer JOIN student ON student_classes.Student_StudentID  = student.studentid\r\n"
				    		+ "LEFT outer JOIN classes ON student_classes.st_Classes_classID  = classes.classid \r\n"
				    		+ "Union \r\n"
				    		+ "SELECT student_classes.st_classes_classid, \r\n"
				    		+ "classes.classname as classname, \r\n"
				    		+ "student_classes.Student_StudentID as studentid, \r\n"
				    		+ "student.studentname as studentname\r\n"
				    		+ "from student_classes \r\n"
				    		+ "right outer JOIN student ON student_classes.Student_StudentID = student.studentid\r\n"
				    		+ "right outer JOIN classes ON student_classes.st_Classes_classID = classes.classid"))   
		    	
		    {System.out.println("Student_Classes_rev table for Classes and Subjects made");}
		    stmt.close(); 
		    conn.close();     
		}
		
		catch (SQLException ex){
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());}}
	
	
	
	public void update_Student_Classes_rev() throws SQLException {
		Statement stmt = null;
		Integer rs = null;		
		 String name,pass,url;  
         Connection conn = null;  
         try {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
             url="jdbc:mysql://localhost:3306/learnersacademy1";  
             name="root";  
             pass="12345678";  
             conn = DriverManager.getConnection(url,name,pass);  
             System.out.println("Connection created");  }  
             catch (Exception e) {  
             System.out.println(e.toString());  }  
		
		
		try {
		    stmt = conn.createStatement();
		    rs = stmt.executeUpdate("drop table classes_student_rev;");

		    if (stmt.execute("drop table classes_student_rev;"))
		
		    {System.out.println("Student_Classes_rev table delete for update");}
		    stmt.close(); 
		    conn.close(); }
		
		 		catch (SQLException ex){
		 		    System.out.println("SQLException: " + ex.getMessage());
		 		    System.out.println("SQLState: " + ex.getSQLState());
		 		    System.out.println("VendorError: " + ex.getErrorCode());}}



		public void update_All_Table() throws SQLException {
			Statement stmt = null;
			Integer rs = null;		
			 String name,pass,url;  
	         Connection conn = null;  
	         try {  
	             Class.forName("com.mysql.cj.jdbc.Driver");  
	             url="jdbc:mysql://localhost:3306/learnersacademy1";  
	             name="root";  
	             pass="12345678";  
	             conn = DriverManager.getConnection(url,name,pass);  
	             System.out.println("Connection created");  }  
	             catch (Exception e) {  
	             System.out.println(e.toString());  
	         }  
			
			
			try {
			    stmt = conn.createStatement();
			    rs = stmt.executeUpdate("drop table All_Table;");

			    if (stmt.execute("drop table All_Table;"))   
			    	
			    {System.out.println("All_Table dropped for update");}}
			
			catch (SQLException ex){
			    System.out.println("SQLException: " + ex.getMessage());
			    System.out.println("SQLState: " + ex.getSQLState());
			    System.out.println("VendorError: " + ex.getErrorCode());
			}

		    stmt.close(); 
		    conn.close(); 
           System.out.println("Connection closed");  

		}



		public void All_Table() throws SQLException {
			Statement stmt = null;
			Integer rs = null;		
			 String name,pass,url;  
	         Connection conn = null;  
	         try {  
	             Class.forName("com.mysql.cj.jdbc.Driver");  
	             url="jdbc:mysql://localhost:3306/learnersacademy1";  
	             name="root";  
	             pass="12345678";  
	             conn = DriverManager.getConnection(url,name,pass);  
	             System.out.println("Connection created");  }  
	             catch (Exception e) {  
	             System.out.println(e.toString());  
	         }  
			
			
			try {
			    stmt = conn.createStatement();
			    rs = stmt.executeUpdate("create table All_Table\r\n"
			    		+ "SELECT classes_subject_rev.classid as classid, \r\n"
			    		+ "classes_subject_rev.classname as classname, \r\n"
			    		+ "classes_subject_rev.subjectid as subjectid,\r\n"
			    		+ "classes_subject_rev.subjectname as subjectname, \r\n"
			    		+ "classes_faculty_rev.facultyid as facultyid, \r\n"
			    		+ "classes_faculty_rev.facultyname as facultyname, \r\n"
			    		+ "classes_student_rev.studentid as studentid, \r\n"
			    		+ "classes_student_rev.studentname as studentname\r\n"
			    		+ "from classes_subject_rev\r\n"
			    		+ "LEFT outer JOIN classes_faculty_rev ON \r\n"
			    		+ "classes_subject_rev.classid = classes_faculty_rev.classid\r\n"
			    		+ "LEFT outer JOIN classes_student_rev ON \r\n"
			    		+ "classes_subject_rev.classid = classes_student_rev.classid\r\n"
			    		+ "union \r\n"
			    		+ "SELECT classes_subject_rev.classid as classid, \r\n"
			    		+ "classes_subject_rev.classname as classname, \r\n"
			    		+ "classes_subject_rev.subjectid as subjected,\r\n"
			    		+ "classes_subject_rev.subjectname as subjectname, \r\n"
			    		+ "classes_faculty_rev.facultyid as facultyid, \r\n"
			    		+ "classes_faculty_rev.facultyname as facultyname, \r\n"
			    		+ "classes_student_rev.studentid as studentid, \r\n"
			    		+ "classes_student_rev.studentname as studentname\r\n"
			    		+ "from classes_subject_rev\r\n"
			    		+ "right outer JOIN classes_faculty_rev ON \r\n"
			    		+ "classes_subject_rev.classid = classes_faculty_rev.classid\r\n"
			    		+ "right outer JOIN classes_student_rev ON \r\n"
			    		+ "classes_subject_rev.classid = classes_student_rev.classid\r\n"
			    		+ "\r\n"
			 );

			    if (stmt.execute("create table All_Table\r\n"
			    		+ "SELECT classes_subject_rev.classid as classid, \r\n"
			    		+ "classes_subject_rev.classname as classname, \r\n"
			    		+ "classes_subject_rev.subjectid as subjected,\r\n"
			    		+ "classes_subject_rev.subjectname as subjectname, \r\n"
			    		+ "classes_faculty_rev.facultyid as facultyid, \r\n"
			    		+ "classes_faculty_rev.facultyname as facultyname, \r\n"
			    		+ "classes_student_rev.studentid as studentid, \r\n"
			    		+ "classes_student_rev.studentname as studentname\r\n"
			    		+ "from classes_subject_rev\r\n"
			    		+ "LEFT outer JOIN classes_faculty_rev ON \r\n"
			    		+ "classes_subject_rev.classid = classes_faculty_rev.classid\r\n"
			    		+ "LEFT outer JOIN classes_student_rev ON \r\n"
			    		+ "classes_subject_rev.classid = classes_student_rev.classid\r\n"
			    		+ "union \r\n"
			    		+ "SELECT classes_subject_rev.classid as classid, \r\n"
			    		+ "classes_subject_rev.classname as classname, \r\n"
			    		+ "classes_subject_rev.subjectid as subjected,\r\n"
			    		+ "classes_subject_rev.subjectname as subjectname, \r\n"
			    		+ "classes_faculty_rev.facultyid as facultyid, \r\n"
			    		+ "classes_faculty_rev.facultyname as facultyname, \r\n"
			    		+ "classes_student_rev.studentid as studentid, \r\n"
			    		+ "classes_student_rev.studentname as studentname\r\n"
			    		+ "from classes_subject_rev\r\n"
			    		+ "right outer JOIN classes_faculty_rev ON \r\n"
			    		+ "classes_subject_rev.classid = classes_faculty_rev.classid\r\n"
			    		+ "right outer JOIN classes_student_rev ON \r\n"
			    		+ "classes_subject_rev.classid = classes_student_rev.classid\r\n"
			    		+ "\r\n"
			    		))   
			    	
			    {System.out.println("Table for all created");}    stmt.close(); 
			    conn.close(); }
			
			catch (SQLException ex){
			    System.out.println("SQLException: " + ex.getMessage());
			    System.out.println("SQLState: " + ex.getSQLState());
			    System.out.println("VendorError: " + ex.getErrorCode());
			}
		
		 
           System.out.println("Connection closed");  

		}

	
	
	
	
	
	
	
	

	
}









