package com.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*; 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
import com.sql.Subject;


public class ControlMain {
		   	public void start() throws SQLException { 	Setup st = new Setup(); 
		   	st.Startdb(); 	 	} 
}

	   



		

		
		
		



