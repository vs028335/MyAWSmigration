package com.sears.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CollegeImplement implements College {

	@Autowired
	Teacher teacher;
	@Autowired
	Peon peon;

	@Override
	public String teachers() {
		return teacher.teacher();
	}

	@Override
	public String peon() {
		return peon.peon();
	}

}
