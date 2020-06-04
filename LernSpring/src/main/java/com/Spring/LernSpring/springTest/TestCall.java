package com.Spring.LernSpring.springTest;

import org.apache.log4j.Logger;

public class TestCall {

	TestSpring testspring;

	static final Logger logger = Logger.getLogger(TestCall.class);

	public TestSpring getTestspring() {
		return testspring;
	}

	public void setTestspring(TestSpring testspring) {
		this.testspring = testspring;
	}

	void beginApplication() {
		testspring.Show();
		logger.debug("The beginApplication is going to be end.........................");
	}

}
