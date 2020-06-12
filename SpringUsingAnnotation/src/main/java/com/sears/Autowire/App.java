package com.sears.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeCoonfiguration.class);
		
		College coll= context.getBean("college", College.class);
		coll.show();
	}
} 	