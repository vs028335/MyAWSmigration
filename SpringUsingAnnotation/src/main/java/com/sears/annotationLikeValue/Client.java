package com.sears.annotationLikeValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sears/annotationLikeValue/beans.xml");
		 Student std= (Student)context.getBean("student");	
		System.out.println(std.toString());
	}

}
