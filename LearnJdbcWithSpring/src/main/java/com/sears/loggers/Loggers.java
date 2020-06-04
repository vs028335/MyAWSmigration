package com.sears.loggers;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Loggers {
	static final Logger logger = Logger.getLogger(Loggers.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
	}
}
