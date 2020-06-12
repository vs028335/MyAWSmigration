package com.sears.Autowire;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	public void mathTeacher() {
		
		System.out.println("Hello Student I am your Math Teacher");
	}

}
