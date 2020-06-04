package com.Spring.LernSpring.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/Spring/LernSpring/springTest/ApplicationContext.xml");
		TestCall t = (TestCall) context.getBean("tc");
		t.beginApplication();
	}

}
