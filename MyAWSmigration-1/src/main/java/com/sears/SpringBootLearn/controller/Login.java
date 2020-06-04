package com.sears.SpringBootLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	@RequestMapping("/")
	public String loginPage() {
		return "index.html";
	}
}
