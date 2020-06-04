package com.sears.SpringBootLearn.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sears.SpringBootLearn.Pojo.PersonDetailsSignIn;
import com.sears.SpringBootLearn.servicesIImple.ServicesImpleSignIn;

@Controller
public class SignIn {

	@Autowired
	PersonDetailsSignIn personDetailsSignIn;

	@Autowired
	ServicesImpleSignIn servicesImpleSignIn;

	@RequestMapping("/signInController")
	public void signIn(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String email = request.getParameter("uemail");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if (servicesImpleSignIn.checkEmail(email) > 0)
			response.sendRedirect("index.html");
		else
			response.sendRedirect("signUp.html");
//		
//		personDetailsSignIn.setEmail(email);
//		personDetailsSignIn.setPassword(password);

	}
}
