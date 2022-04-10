package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class WelcomePage {

	
	@RequestMapping(value= "tables", method =RequestMethod.POST )
	public String alltable(@RequestParam("alltables") String alltables, 
	ModelMap map) 
{String page ="home"; 
	 {
		map.addAttribute("alltables", alltables); 
		page = "AllTable"; 
	}
	return page;}
	
	
	@RequestMapping(value= "classesstudents", method =RequestMethod.POST )
	public String cstable(@RequestParam("cstable") String cstable, 
	ModelMap map) 
{String page ="home"; 
	 {
		map.addAttribute("cstable", cstable); 
		page = "classes_student_rev"; 
	}
	return page;}
	
	
	@RequestMapping(value= "classesfaculties", method =RequestMethod.POST )
	public String cftable(@RequestParam("cftable") String cftable, 
	ModelMap map) 
	{String page ="home"; 
	 {
		map.addAttribute("cftable", cftable); 
		page = "classes_faculty_rev"; 
	}
	return page;}
	
	
	@RequestMapping(value= "classessubjects", method =RequestMethod.POST )
	public String csutable(@RequestParam("csutable") String csutable, 
	ModelMap map) 
	{String page ="home"; 
	 {
		map.addAttribute("csutable", csutable); 
		page = "classes_subject_rev"; 
	}
	return page;}

	
	@RequestMapping(value= "addclasses", method =RequestMethod.POST )
	public String addclasses(@RequestParam("addcl") String addcl, 
	ModelMap map) 
{String page ="home";   {map.addAttribute("addcl", addcl); page = "addclasses"; } return page;}
	

	@RequestMapping(value= "addfaculties", method =RequestMethod.POST )
	public String addfaculties(@RequestParam("addfc") String addfc, 
	ModelMap map) 
{String page ="home";   {map.addAttribute("addfc", addfc); page = "addfaculties"; } return page;}
	

	@RequestMapping(value= "addstudents", method =RequestMethod.POST )
	public String addstudents(@RequestParam("addst") String addst, 
	ModelMap map) 
{String page ="home";   {map.addAttribute("addst", addst); page = "addstudents"; } return page;}
	
	
	
	@RequestMapping(value= "addsubjects", method =RequestMethod.POST )
	public String addsubjects(@RequestParam("addfc") String addfc, 
	ModelMap map) 
{String page ="home";   {map.addAttribute("addfc", addfc); page = "addsubjects"; } return page;}
	
    
	 
}



	
	

	 

	
