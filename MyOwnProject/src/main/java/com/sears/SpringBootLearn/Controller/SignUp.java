package com.sears.SpringBootLearn.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sears.SpringBootLearn.Pojo.PersonDetails;

@Controller
public class SignUp {

	@Autowired
	PersonDetails personDetails;
	
	@RequestMapping("/signUpController")
	public void signUp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("uname");
		String email = request.getParameter("uemail");
		int mobile = Integer.parseInt(request.getParameter("mob"));
		String password = request.getParameter("password");
		
		personDetails.setName(username);
		personDetails.setEmail(email);
		personDetails.setMobile(mobile);
		personDetails.setPassword(password);
		
		out.println(personDetails.getName());
		out.println(personDetails.getEmail());
		out.println(personDetails.getMobile());
		out.println(personDetails.getPassword());
	}

}
