package com.Spring.JDBCUsingSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/JDBCUsingSpring/ApplicationContext.xml");
		ConnectionProvider con= (ConnectionProvider)context.getBean("CoonPro");
		con.getConn();
		System.out.println(con);
	}
}
