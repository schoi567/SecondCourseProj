package com.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.reactive.TransactionSynchronizationManager;
import com.dao.JDBCcommand;

import com.sql.Classes;
import com.sql.Faculty;
import com.sql.Student;
import com.sql.Subject;
public class Setup {
	
	public void Startdb() throws SQLException {
		Statement stmt = null;
		  Integer rs = null;		
		 String name,pass,url;  
         Connection conn = null;  
         try {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
             url="jdbc:mysql://localhost:3306";  
             name="root";  
             pass="12345678";  
             conn = DriverManager.getConnection(url,name,pass);  
             System.out.println("Connection created");  }  
             catch (Exception e) {  
             System.out.println(e.toString());  
         }  
		
		
		try {
		    stmt = conn.createStatement();
		    rs = stmt.executeUpdate("create schema learnersacademy1;");


		
		}
		
		catch (SQLException ex){
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    stmt.close();
		    conn.close();
		    System.out.println("Connection closed");  return; 
		    
		} 
	
		Setuptables(); 
		 stmt.close();  conn.close();

		}

	
	public void Setuptables() throws SQLException  { 

	try {Configuration configuration = new Configuration().configure(); 
	configuration.addAnnotatedClass(com.sql.Classes.class);
	configuration.addAnnotatedClass(com.sql.Subject.class);
	configuration.addAnnotatedClass(com.sql.Student.class);
	configuration.addAnnotatedClass(com.sql.Faculty.class);
	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory = configuration.buildSessionFactory(builder.build());
	Session session= factory.openSession(); 
	Transaction transaction = session.beginTransaction(); 		
	
	//Adding Subjects
	Subject Science = new Subject ("Science");
	Subject Computer_Science = new Subject ("Computer_Science");
	Subject History = new Subject ("History");
	Subject Economics = new Subject ("Economics");
	Subject Business = new Subject ("Business");
	Subject Engineering = new Subject ("Engineering");	
	Subject Art = new Subject ("Art");
	Subject English = new Subject ("English");	
	Subject Foreign_Language = new Subject ("Foreign_Language ");	
	
	//Adding Classes	
 
	
    Classes Biology_101 = new Classes("Biology_101"); 
	Classes Chemistry_101 = new Classes("Chemistry_101"); 
	Classes Physics_101 = new Classes("Physics_101"); 		
	Classes Algorithm_101 = new Classes("Algorithm_101"); 		
	Classes Data_Science_101 = new Classes("Data_Science_101"); 
	Classes Art_History_101 = new Classes("Art_History_101"); 
	Classes American_History_101 = new Classes("American_History_101"); 		
	Classes MicroEconomics_101 = new Classes("MicroEconomics_101"); 		
	Classes MacroEconomics_101 = new Classes("MacroEconomics_101"); 
	Classes Accounting_101 = new Classes("Acscounting_101"); 
	Classes Finance_101 = new Classes("Finance_101"); 		
	Classes Biomedical_Engineering_101 = new Classes("Biomedical_Engineering_101"); 	
	Classes Civil_Engineering_101 = new Classes("Civil_Engineering_101"); 	
	Classes Drawing_101 = new Classes("Drawing_101"); 
	Classes English_101 = new Classes("English_101"); 
	Classes Spanish_101 = new Classes("Spanish_101"); 		
	Classes French_101 = new Classes("French_101");	
	Classes Chinese_101 = new Classes("Chinese_101"); 
	Classes Japanese_101 = new Classes("Japanese_101"); 
	Classes Hindi_101 = new Classes("Hindi_101"); 		

	//Adding Students 	
	Student st1 = new Student("Maiy Mnc");
	Student st2 = new Student("Ryan Haugland");
	Student st3 = new Student("Mina Lee");
	Student st4 = new Student("Jongsuk Mun");
	Student st5 = new Student("Jaeyoung Heo");
	Student st6 = new Student("Tae Hee Lee");
	Student st7 = new Student("Sejong Ryu");
	Student st8 = new Student("Martha Allred");
	Student st9 = new Student("Maiy Mnc");
	Student st10 = new Student("Sundar Pichai");
	Student st11 = new Student("Tom Hank");
	Student st12 = new Student("Tammy Bragg");
	Student st13 = new Student("Barry Cha");	
	Student st14 = new Student("Anna Choe");
	Student st15 = new Student("Soo Min Choi");
	Student st16 = new Student("Joe Davis");	
	Student st17 = new Student("Steven Decker");
	Student st18 = new Student("Ashley Dudley");
	Student st19 = new Student("Alexis Dunn");
	Student st20 = new Student("Tony Green");
	Student st21 = new Student("Gary Hall");
	Student st22 = new Student("Dan Hamby");
	Student st23 = new Student("Tina Hegwood");
	Student st24 = new Student("Becky Holloway");
	Student st25 = new Student("Daehwa Hong");
	Student st26 = new Student("Regina Joiner");
	Student st27 = new Student("Mary Jackson");
	Student st28 = new Student("Jinseong Jeon");
	Student st29 = new Student("Aaron Ji");
	Student st30 = new Student("Sam Jung");
	Student st31 = new Student("John Kim");
	Student st32 = new Student("Aneesh Patel");
	Student st33 = new Student("Chulwook Ji");
	Student st34 = new Student("Sungwook Kim");
	Student st35 = new Student("Kukryeol Kwon");
	Student st36 = new Student("Tae Won Kwon");
	Student st37 = new Student("Gook Jin Lee");
	Student st38 = new Student("Linda Lester");
	Student st39 = new Student("Gyeounwoo Lim");
	Student st40 = new Student("Je Woo Lim");	

	//Adding faculties 	
	Faculty f1 = new Faculty("Dipen Patel");
	Faculty f2 = new Faculty("Anand Giridharadas");
	Faculty f3 = new Faculty("Angel Phillips");

	
	Science.getClasses().add(Biology_101); 
	Science.getClasses().add(Physics_101); 
	Science.getClasses().add(Chemistry_101); 	
	Computer_Science.getClasses().add(Algorithm_101); 
	Computer_Science.getClasses().add(Data_Science_101); 	
	History.getClasses().add(Art_History_101); 
	History.getClasses().add(American_History_101);
	Economics.getClasses().add(MicroEconomics_101); 
	Economics.getClasses().add(MacroEconomics_101);
	Business.getClasses().add(Accounting_101); 
	Business.getClasses().add(Finance_101); 
	Engineering.getClasses().add(Biomedical_Engineering_101); 
	Engineering.getClasses().add(Civil_Engineering_101); 	
	Art.getClasses().add(Drawing_101); 	 
	English.getClasses().add(English_101); 	 	
	Foreign_Language.getClasses().add(Spanish_101); 	
	Foreign_Language.getClasses().add(French_101); 	
	Foreign_Language.getClasses().add(Chinese_101); 	
	Foreign_Language.getClasses().add(Japanese_101); 	
	Foreign_Language.getClasses().add(Hindi_101); 	
	
	// registering student enrollment to classes	
	st1.getSt_Classes().add(Biology_101); 
	st1.getSt_Classes().add(Physics_101); 
	st1.getSt_Classes().add(Chemistry_101); 	

	st2.getSt_Classes().add(Physics_101); 
	st2.getSt_Classes().add(Chemistry_101); 	
	st2.getSt_Classes().add(Algorithm_101); 
	
	st3.getSt_Classes().add(Chemistry_101); 	
	st3.getSt_Classes().add(Algorithm_101); 
	st3.getSt_Classes().add(Data_Science_101); 	
		
	st4.getSt_Classes().add(Algorithm_101); 
	st4.getSt_Classes().add(Data_Science_101); 
	st4.getSt_Classes().add(Art_History_101); 
	
	st5.getSt_Classes().add(Data_Science_101); 
	st5.getSt_Classes().add(Art_History_101); 
	st5.getSt_Classes().add(American_History_101); 
	
	st6.getSt_Classes().add(Art_History_101); 
	st6.getSt_Classes().add(American_History_101); 
	st6.getSt_Classes().add(MicroEconomics_101); 
	
	st7.getSt_Classes().add(American_History_101); 
	st7.getSt_Classes().add(MicroEconomics_101); 
	st7.getSt_Classes().add(MacroEconomics_101); 
	
	st8.getSt_Classes().add(MicroEconomics_101); 
	st8.getSt_Classes().add(MacroEconomics_101); 
	st8.getSt_Classes().add(Accounting_101); 
	
	st9.getSt_Classes().add(MicroEconomics_101); 
	st9.getSt_Classes().add(Finance_101); 
	st9.getSt_Classes().add(Accounting_101);
	
	st10.getSt_Classes().add(Biomedical_Engineering_101); 
	st10.getSt_Classes().add(Finance_101); 
	st10.getSt_Classes().add(Accounting_101);
	
	st11.getSt_Classes().add(Finance_101);
	st11.getSt_Classes().add(Biomedical_Engineering_101);  
	st11.getSt_Classes().add(Civil_Engineering_101);
	
	st12.getSt_Classes().add(Biomedical_Engineering_101);  
	st12.getSt_Classes().add(Civil_Engineering_101);	
	st12.getSt_Classes().add(Drawing_101);	
	  
	st13.getSt_Classes().add(Civil_Engineering_101);	
	st13.getSt_Classes().add(Drawing_101);	
	st13.getSt_Classes().add(English_101); 
		
	st14.getSt_Classes().add(Drawing_101);	
	st14.getSt_Classes().add(English_101); 
	st14.getSt_Classes().add(Spanish_101);	
		
	st15.getSt_Classes().add(English_101); 
	st15.getSt_Classes().add(Spanish_101);	
	st15.getSt_Classes().add(French_101);	
	 
	st16.getSt_Classes().add(Spanish_101);	
	st16.getSt_Classes().add(French_101);	
	st16.getSt_Classes().add(Chinese_101); 	
		
	st17.getSt_Classes().add(French_101);	
	st17.getSt_Classes().add(Chinese_101);
	st17.getSt_Classes().add(Japanese_101);
	
	st18.getSt_Classes().add(Chinese_101);
	st18.getSt_Classes().add(Japanese_101);
	st18.getSt_Classes().add(Hindi_101);
	
	st19.getSt_Classes().add(Biology_101); 
	st19.getSt_Classes().add(Physics_101); 
	st19.getSt_Classes().add(Chemistry_101); 	

	st20.getSt_Classes().add(Physics_101); 
	st20.getSt_Classes().add(Chemistry_101); 	
	st20.getSt_Classes().add(Algorithm_101); 
	
	st21.getSt_Classes().add(Chemistry_101); 	
	st21.getSt_Classes().add(Algorithm_101); 
	st21.getSt_Classes().add(Data_Science_101); 	
		
	st22.getSt_Classes().add(Algorithm_101); 
	st22.getSt_Classes().add(Data_Science_101); 
	st22.getSt_Classes().add(Art_History_101); 
	
	st23.getSt_Classes().add(Data_Science_101); 
	st23.getSt_Classes().add(Art_History_101); 
	st23.getSt_Classes().add(American_History_101); 
	
	st24.getSt_Classes().add(Art_History_101); 
	st24.getSt_Classes().add(American_History_101); 
	st24.getSt_Classes().add(MicroEconomics_101); 
	
	st25.getSt_Classes().add(American_History_101); 
	st25.getSt_Classes().add(MicroEconomics_101); 
	st25.getSt_Classes().add(MacroEconomics_101); 
	
	st26.getSt_Classes().add(MicroEconomics_101); 
	st26.getSt_Classes().add(MacroEconomics_101); 
	st26.getSt_Classes().add(Accounting_101); 
	
	st27.getSt_Classes().add(MicroEconomics_101); 
	st27.getSt_Classes().add(Finance_101); 
	st27.getSt_Classes().add(Accounting_101);
	
	st28.getSt_Classes().add(Biomedical_Engineering_101); 
	st28.getSt_Classes().add(Finance_101); 
	st28.getSt_Classes().add(Accounting_101);
	
	st29.getSt_Classes().add(Finance_101);
	st29.getSt_Classes().add(Biomedical_Engineering_101);  
	st29.getSt_Classes().add(Civil_Engineering_101);
	
	st30.getSt_Classes().add(Biomedical_Engineering_101);  
	st30.getSt_Classes().add(Civil_Engineering_101);	
	st30.getSt_Classes().add(Drawing_101);	
	  
	st31.getSt_Classes().add(Civil_Engineering_101);	
	st31.getSt_Classes().add(Drawing_101);	
	st31.getSt_Classes().add(English_101); 
		
	st32.getSt_Classes().add(Drawing_101);	
	st32.getSt_Classes().add(English_101); 
	st32.getSt_Classes().add(Spanish_101);	
		
	st33.getSt_Classes().add(English_101); 
	st33.getSt_Classes().add(Spanish_101);	
	st33.getSt_Classes().add(French_101);	
	 
	st34.getSt_Classes().add(Spanish_101);	
	st34.getSt_Classes().add(French_101);	
	st34.getSt_Classes().add(Chinese_101); 	
		
	st35.getSt_Classes().add(French_101);	
	st35.getSt_Classes().add(Chinese_101);
	st35.getSt_Classes().add(Japanese_101);
	
	st36.getSt_Classes().add(Chinese_101);
	st36.getSt_Classes().add(Japanese_101);
	st36.getSt_Classes().add(Hindi_101);
	
	st37.getSt_Classes().add(Biology_101); 
	st37.getSt_Classes().add(MicroEconomics_101);	
	st37.getSt_Classes().add(Spanish_101);	
	 
	st38.getSt_Classes().add(Physics_101);	
	st38.getSt_Classes().add(Accounting_101);	
	st38.getSt_Classes().add(Japanese_101); 	
		
	st39.getSt_Classes().add(Chemistry_101);	
	st39.getSt_Classes().add(Art_History_101);
	st39.getSt_Classes().add(Hindi_101);
	
	st40.getSt_Classes().add(Algorithm_101);
	st40.getSt_Classes().add(Biomedical_Engineering_101);
	st40.getSt_Classes().add(Drawing_101);
	
	// registering faculty enrollment to classes	
	f1.getFc_Classes().add(Biology_101);
	f1.getFc_Classes().add(Chemistry_101);	
	f1.getFc_Classes().add(Physics_101);
	f1.getFc_Classes().add(Accounting_101);	
	f1.getFc_Classes().add(Finance_101);
	f1.getFc_Classes().add(Art_History_101);	
	f1.getFc_Classes().add(American_History_101);	
	
	f2.getFc_Classes().add(Data_Science_101);
	f2.getFc_Classes().add(MicroEconomics_101);		
	f2.getFc_Classes().add(MacroEconomics_101);
	f2.getFc_Classes().add(Biomedical_Engineering_101);	
	f2.getFc_Classes().add(Civil_Engineering_101);	
	f2.getFc_Classes().add(Drawing_101);	
	
	f3.getFc_Classes().add(Spanish_101);
	f3.getFc_Classes().add(French_101);		
	f3.getFc_Classes().add(Chinese_101);
	f3.getFc_Classes().add(Japanese_101);	
	f3.getFc_Classes().add(Hindi_101);	
	f3.getFc_Classes().add(English_101);
	f3.getFc_Classes().add(Algorithm_101);
	
	// Saving Classes 
	session.save(Science);
	session.save(Computer_Science);	
	session.save(History);
	session.save(Economics);		
	session.save(Business);
	session.save(Engineering);
	session.save(Art);	
	session.save(English);
	session.save(Foreign_Language);	
	
	// Saving Subjects  
	session.save(Biology_101);
	session.save(Chemistry_101);	
	session.save(Physics_101);
	session.save(Algorithm_101);		
	session.save(Data_Science_101);
	session.save(Art_History_101);	
	session.save(American_History_101);
	session.save(MicroEconomics_101);		
	session.save(MacroEconomics_101);
	session.save(Accounting_101);	
	session.save(Finance_101);
	session.save(Biomedical_Engineering_101);	
	session.save(Civil_Engineering_101);
	session.save(Drawing_101);
	session.save(English_101);	
	session.save(Spanish_101);
	session.save(French_101);		
	session.save(Chinese_101);
	session.save(Japanese_101);	
	session.save(Hindi_101);

	// Saving Students   
	
	session.save(st1); session.save(st2); session.save(st3); session.save(st4);	session.save(st5);
	session.save(st6); session.save(st7); session.save(st8); session.save(st9);	session.save(st10);
	session.save(st11); session.save(st12); session.save(st13); session.save(st14);	session.save(st15);
	session.save(st16); session.save(st17); session.save(st18); session.save(st19);	session.save(st20);
	session.save(st21); session.save(st22); session.save(st23); session.save(st24);	session.save(st25);
	session.save(st26); session.save(st27); session.save(st28); session.save(st29);	session.save(st30);
	session.save(st31); session.save(st32); session.save(st33); session.save(st34);	session.save(st35);
	session.save(st36); session.save(st37); session.save(st38); session.save(st39);	session.save(st40);

	// Saving Faculty 
	
	session.save(f1); session.save(f2); session.save(f3); 
	
	transaction.commit();
	session.close(); }   
	catch (Exception ex) {System.out.println(ex.getMessage());}	

	JDBCcommand jdbccmd = new JDBCcommand();  
	jdbccmd.Student_Classes_rev();
	jdbccmd.Classes_Faculty_rev();
	jdbccmd.Classes_Subject_rev();
	jdbccmd.All_Table();
	
	
	}
	
	
	}
	

