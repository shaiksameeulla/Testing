package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.propertyResource.Database;

@RestController
public class HelloController {
	
	@Autowired
	private Database database;
	
	@RequestMapping("dbname/{jdbcAttributeName}")
	public String getDatabaseDetails(@PathVariable String jdbcAttributeName) {
		return database.getUsername();
	}

}
