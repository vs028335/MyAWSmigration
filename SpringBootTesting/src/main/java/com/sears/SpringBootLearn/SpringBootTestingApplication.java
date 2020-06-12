package com.sears.SpringBootLearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTestingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootTestingApplication.class, args);
		
		CollegeImplementation collegeImplementation=context.getBean(CollegeImplementation.class);
		
		System.out.println(collegeImplementation.teacher());
		System.out.println(collegeImplementation.peon());
	}

}
