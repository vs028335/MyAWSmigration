package com.sears.SpringBootLearn.daoImplement;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sears.SpringBootLearn.Pojo.Booking;
import com.sears.SpringBootLearn.daoInterface.DaoInterfaceInstanceBooking;

@Component
public class DaoImplementInstanceBooking implements DaoInterfaceInstanceBooking {

	
	@Autowired
	JdbcTemplate jdbcTemplete;
	
	@Autowired
	Booking booking;
	
	HttpServletResponse responce;
	
	@Override
	public int addRoomDetails(Booking booking) {
		
		String sql="insert into instanceBooking(name,room_no,mobile) values(?,?,?)";
		int status=jdbcTemplete.update(sql,new Object[] {booking.getName(),booking.getRoom_no(),booking.getMobile()});
		
		return status;
	}

}
