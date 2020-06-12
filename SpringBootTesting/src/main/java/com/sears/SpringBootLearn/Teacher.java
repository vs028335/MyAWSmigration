package com.sears.SpringBootLearn;

import org.springframework.stereotype.Controller;

@Controller
public class Teacher {

	public String message() {
		return "I am a  Teacher";
	}
}
