package com.sql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "Student")
public class Student {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int StudentID;

	@ManyToMany(targetEntity = com.sql.Classes.class, cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
//	@JoinColumns({@JoinColumn(name = "StudentID", nullable = false)}) 
	  List<Classes> st_Classes = new ArrayList();
	public List<Classes> getSt_Classes() {
		return st_Classes;
	}
	public void setSt_Classes(List<Classes> st_Classes) {
		this.st_Classes = st_Classes;
	}
	
	
	@Column(nullable=false,name="StudentName") 
	public String StudentName;


	
	 
	public Student() { }
	public Student(String StudentName) {super(); this.StudentName = StudentName;}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;}
		
	
	
	
	
}
