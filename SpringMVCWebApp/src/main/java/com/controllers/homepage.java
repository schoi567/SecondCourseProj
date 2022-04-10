package com.controllers;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.control.ControlMain;
import com.dao.JDBCcommand;


@Controller
public class homepage{
	ControlMain CM = new ControlMain();  
	
	@RequestMapping("/")	
	public String showHome() throws SQLException {	
		CM.start();  
	return "home";}
	
	
	@RequestMapping(value= "login", method =RequestMethod.POST )
	public String isValidUser(@RequestParam("username") String username, 
	@RequestParam("password") String password, ModelMap map) 
{String page ="home"; 
	if (username.equalsIgnoreCase("ab") && password.equals("ab")) {
		map.addAttribute("firstname", username); 
		page = "WelcomePage"; 
	}
	
	
	else {
		map.addAttribute("errorMessage", "Invalid login credentials");
	}	return page; } 
		
	 


}
		
		
		


