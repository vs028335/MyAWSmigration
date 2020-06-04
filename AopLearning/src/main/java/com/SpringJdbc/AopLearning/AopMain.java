package com.SpringJdbc.AopLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringJdbc.AopLearning.Service.Service;

public class AopMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Service service= (Service) context.getBean("s");
		
		System.out.println(service.getCircle().getName());
    	System.out.println(service.getTriangle().getName());
	}
}
			