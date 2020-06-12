package com.sears.Anotation.SpringUsingAnnotation;

import com.sears.Anotation.Principle.Principle;

//@Component
public class College {

	private Principle principle;
	private Teacher teacher;
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrinciple(Principle principle) {
		this.principle = principle;
	}

	public void show() {
		System.out.println("I am in Show()............");
		
		principle.principleInfo();
		teacher.mathTeacher();
	}
}
