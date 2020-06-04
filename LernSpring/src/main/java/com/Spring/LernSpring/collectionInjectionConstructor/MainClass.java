package com.Spring.LernSpring.collectionInjectionConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/LernSpring/collectionInjectionConstructor/Application.xml");
		Student s=(Student)context.getBean("sb");
		s.show();
	}

}
