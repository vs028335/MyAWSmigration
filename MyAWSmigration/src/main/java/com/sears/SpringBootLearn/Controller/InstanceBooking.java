package com.sears.SpringBootLearn.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sears.SpringBootLearn.Pojo.Booking;
import com.sears.SpringBootLearn.servicesIImple.ServiceImpleInstanceBookingDetails;

@Controller
public class InstanceBooking {
	
	@Autowired
	Booking booking;

	@Autowired
	ServiceImpleInstanceBookingDetails serviceImpleInstanceBookingDetails; 
	
	@RequestMapping("/instanceBookingController")
	public void instanceBooking(HttpServletRequest request,HttpServletResponse responce) throws IOException
	{
		PrintWriter out=responce.getWriter();	
		
		String name=request.getParameter("Cname");
		int room_no=Integer.parseInt(request.getParameter("no_ofRoom"));
		int mobile=Integer.parseInt(request.getParameter("mob"));
		
		booking.setName(name);
		booking.setRoom_no(room_no);
		booking.setMobile(mobile);
		
		int status=serviceImpleInstanceBookingDetails.addData(booking);
		
		if(status>0)
			out.println("We Confirmed your Booking");
		else
			out.println("Something is missing");
	}
	
}
