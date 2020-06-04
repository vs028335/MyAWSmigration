package com.Spring.LernSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/LernSpring/Application.xml");

		Service s = context.getBean(Service.class, "ss");
		System.out.println(s.beginApplication());
	}
}
