package com.te.HibernateAssignment.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class StudentTable implements Serializable {
	
	@Id
	private int rollno;
	private String name;
	private int phoneno;
	private int dateofbirth;
	
	public StudentTable()
	{
		
	}

}
