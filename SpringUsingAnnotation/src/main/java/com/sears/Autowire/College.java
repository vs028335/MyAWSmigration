package com.sears.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("Iter")
	private String collegeName;
	
	
	@Autowired
	private Principle principle;
	@Autowired
	private Teacher teacher;
	
	public void show() {
		System.out.println("I am in Show()............");		
		System.out.println("The college name is :"+collegeName);
		principle.principleInfo();
		teacher.mathTeacher();
	}
}
