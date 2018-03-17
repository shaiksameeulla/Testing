package com.example.demo.model;

import java.io.Serializable;

/**
 *  This is Employee Model
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
	

}
