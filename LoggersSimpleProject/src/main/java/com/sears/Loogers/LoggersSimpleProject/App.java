package com.sears.Loogers.LoggersSimpleProject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {
	static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();

		logger.debug("Sample Debug message");
		logger.info("Sample info message");
		logger.warn("Sample Warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
	}
}
