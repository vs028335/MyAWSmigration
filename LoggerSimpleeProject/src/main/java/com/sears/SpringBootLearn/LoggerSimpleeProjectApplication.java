package com.sears.SpringBootLearn;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerSimpleeProjectApplication {

	static final Logger logger = Logger.getLogger(LoggerSimpleeProjectApplication.class);

	public static void main(String[] args) {
	
		BasicConfigurator.configure();
		logger.debug("Sample Debug message");
		logger.info("Sample info message");
		logger.warn("Sample Warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
	}

}
