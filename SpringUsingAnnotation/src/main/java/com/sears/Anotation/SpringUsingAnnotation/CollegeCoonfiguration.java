package com.sears.Anotation.SpringUsingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sears.Anotation.Principle.Principle;
import com.sears.Anotation.TeacherImplement.MathTeacher;

@Configuration
// @ComponentScan(basePackages="com.sears.Anotation.SpringUsingAnnotation")
public class CollegeCoonfiguration {

	@Bean
	public Teacher mathTeacher()
	{
		return new MathTeacher();
	}
	
	@Bean
	public Principle principleBean()
	{
		return new Principle();
	}
	@Bean
	public College collegeBean() {
		College college= new College();
		college.setPrinciple(principleBean());
		college.setTeacher(mathTeacher());
		return college;
	}
}
