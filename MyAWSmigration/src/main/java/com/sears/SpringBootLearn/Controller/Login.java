package com.sears.SpringBootLearn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	@RequestMapping("/home")
	public String loginPage() {
		return "index.html";
	}
}
