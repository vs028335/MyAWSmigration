package com.sears.Anotation.SpringUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeCoonfiguration.class);
		
		College coll= context.getBean("collegeBean", College.class);
		coll.show();
	}
} 	