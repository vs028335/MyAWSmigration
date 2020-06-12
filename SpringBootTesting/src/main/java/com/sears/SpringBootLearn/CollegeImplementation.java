package com.sears.SpringBootLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CollegeImplementation implements College {

	@Autowired
	Teacher teach;

	@Autowired
	Peon peo;

	@Override
	public String teacher() {

		return teach.message();
	}

	@Override
	public String peon() {

		return peo.message();
	}

}
