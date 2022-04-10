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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import com.sql.Student;

import net.bytebuddy.utility.nullability.NeverNull;


@Entity 
@Table(name="Classes") 

public class Classes {


private static final String Student_Classes = null;

 @Id	
 @GeneratedValue(strategy=GenerationType.IDENTITY)
private int ClassID;
 

@Column(nullable=false,name="ClassName")
private String ClassName; 

public Classes() { }
public Classes(String ClassName) {super(); this.ClassName = ClassName;}

public Classes(int ClassID, String ClassName) {super(); 
this.ClassID = ClassID; this.ClassName = ClassName;}


public int getClassID() {
	return ClassID;
}

public void setClassID(int classID) {
	this.ClassID = classID;
}

public String getClassName() {
	return ClassName;
}

public void setClassName(String className) {
	this.ClassName = className;
}

}
 



 




