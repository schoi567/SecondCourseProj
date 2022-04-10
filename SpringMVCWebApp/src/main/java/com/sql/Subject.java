package com.sql;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity 
@Table
public class Subject {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int SubjectID;
	
	@OneToMany (targetEntity = com.sql.Classes.class, cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
//	@JoinColumns({@JoinColumn(name = "SubjectID")}) 
	List<Classes> Classes = new ArrayList(); 
	public List<Classes> getClasses() {return Classes;}
	public void setClasses(List<Classes> Classes) {this.Classes = Classes;}
	
	
	@JoinColumn(name = "ClassID")
	
	@Column(nullable=false,name="SubjectName") 
	private String SubjectName;


 
	
	public Subject() { }
	public Subject(String SubjectName) {super(); this.SubjectName = SubjectName;}
	
	public Subject(int SubjectId, String SubjectName) {super(); 
	this.SubjectID= SubjectID; this.SubjectName = SubjectName;}

	
	
	public int getSubjectID() {
		return SubjectID;
	}
	public void setSubjectId(int SubjectID) {
		this.SubjectID = SubjectID;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		this.SubjectName = subjectName;
	}

	
	
	

}


