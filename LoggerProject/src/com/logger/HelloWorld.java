package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorld {
	static final Logger logger = Logger.getLogger(HelloWorld.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();
		logger.debug("Sample Debug message");
		logger.info("Sample info message");
		logger.warn("Sample Warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
	}
}
