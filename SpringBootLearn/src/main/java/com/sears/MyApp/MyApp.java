package com.sears.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MyApp.class, args);
		
		College college=context.getBean(CollegeImplement.class);
		
		System.out.println(college.teachers());
		System.out.println(college.peon());
	}
}
