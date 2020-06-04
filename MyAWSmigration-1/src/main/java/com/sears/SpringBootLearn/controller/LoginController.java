package com.sears.SpringBootLearn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;

@Controller
public class LoginController {

	@RequestMapping("/LoginController")
	public void checkAuthintication(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();

		String username = request.getParameter("name");
		String password = request.getParameter("pswd");

		if (username.equals("abc") && password.equals("abc"))
			response.sendRedirect(request.getContextPath() + "/Nextpage.html");
	     else
			out.println("Incurrect username or password");

	}

}
