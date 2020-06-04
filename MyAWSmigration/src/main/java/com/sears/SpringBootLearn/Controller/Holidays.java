package com.sears.SpringBootLearn.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sears.SpringBootLearn.Pojo.Holiday;
import com.sears.SpringBootLearn.servicesIImple.ServiceImpleInstanceHolidays;

@Controller
public class Holidays {

	@Autowired
	Holiday holiday;

	@Autowired
	ServiceImpleInstanceHolidays serviceImpleInstanceHolidays;
	
	@RequestMapping("/Holidays")
	public void holidays(HttpServletRequest request, HttpServletResponse responce) throws IOException {
		
		PrintWriter out = responce.getWriter();
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		holiday.setFrom(from);
		holiday.setTo(to);
		
		int status=serviceImpleInstanceHolidays.holiday(holiday);
		if(status>0) 
			out.println("Holiday place restore...");
		else
			out.println("this place is not our cup of tea");
			
	}
}
