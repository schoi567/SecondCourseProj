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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table
public class Faculty {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int FacultyID;
	
	@OneToMany (targetEntity = com.sql.Classes.class, cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
//	@JoinColumns({@JoinColumn(name = "FacultyID")}) 
	List<Classes> Fc_Classes = new ArrayList(); 
	public List<Classes> getFc_Classes() {return Fc_Classes;}
	public void setFc_Classes(List<Classes> Fc_Classes) {Fc_Classes = Fc_Classes;}
	
	
	@Column(nullable=false,name="FacultyName") 
	private String FacultyName;
	
	
	
	public int getFacultyID() {
		return FacultyID;
	}
	
	public Faculty() { }
	public Faculty(String FacultyName) {super(); this.FacultyName = FacultyName;}
	
	public void setFacultyID(int facultyID) {
		FacultyID = facultyID;
	}
	public String getFacultyName() {
		return FacultyName;
	}
	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}
	
	
	
	
	
	
}
