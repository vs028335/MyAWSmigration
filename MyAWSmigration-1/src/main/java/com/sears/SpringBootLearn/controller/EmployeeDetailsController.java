package com.sears.SpringBootLearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sears.SpringBootLearn.Pojo.Employee;

@Controller
public class EmployeeDetailsController {
	
	@Autowired
	Employee employee;

	@RequestMapping("/AddemployeeDetails")
	public void addemployeeDetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		
		System.out.println("The page a successfully");
		
		String name = request.getParameter("name");
		String cname = request.getParameter("Cname");
		String gender = request.getParameter("gender");
		String state = request.getParameter("state");
		String city=request.getParameter("city");
		
		employee.setName(name);
		employee.setCname(cname);
		employee.setGender(gender);
		employee.setState(state);
		employee.setCity(city);
	}
}
