package com.Spring.LernSpring.MobileRamRelation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.LernSpring.Service;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/LernSpring/MobileRamRelation/ApplicationContext.xml");
		Mobile m=(Mobile)context.getBean("mob");

	}

}
