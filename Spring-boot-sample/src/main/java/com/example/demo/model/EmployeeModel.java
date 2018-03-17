package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author mohammes
 *
 */
public class EmployeeModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4235588409979331384L;
	
	
	private String name;
	
	private String title;
	
	/**
	 * dob
	 */
	private Date dob;
	
	private Integer empId;
	
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	

}
