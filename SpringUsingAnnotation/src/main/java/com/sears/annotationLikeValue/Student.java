package com.sears.annotationLikeValue;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String studentName;
	private String intrestedCource;
	private String hobby;
	
	@Value("${name}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Value("${intrest}")
	public void setIntrestedCource(String intrestedCource) {
		this.intrestedCource = intrestedCource;
	}
	@Value("${hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", intrestedCource=" + intrestedCource + ", hobby=" + hobby
				+ "]";
	}
}
