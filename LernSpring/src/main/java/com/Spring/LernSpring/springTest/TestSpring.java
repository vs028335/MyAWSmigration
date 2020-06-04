package com.Spring.LernSpring.springTest;

import org.apache.log4j.Logger;

import com.Spring.LernSpring.Loggers.Loggers;

public class TestSpring {
	
	static final Logger logger = Logger.getLogger(TestSpring.class);
	void Show() {
		System.out.println("Hello Vishal i am Show() method ................................");
		logger.debug("The Show method ending..............................");
	}
}
