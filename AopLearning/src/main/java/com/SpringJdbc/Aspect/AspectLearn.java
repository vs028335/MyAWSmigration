package com.SpringJdbc.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectLearn {

	@Before("execution(public String getName())")
	public void LoggingAdvice()
	{
		System.out.println("Advice run. get method Advice");
	}
}
