package com.sears.SpringBootLearn.servicesIImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sears.SpringBootLearn.Pojo.Booking;
import com.sears.SpringBootLearn.daoImplement.DaoImplementInstanceBooking;
import com.sears.SpringBootLearn.services.ServiceInterfaceInstanceBookingRoomDetails;

@Component
public class ServiceImpleInstanceBookingDetails implements ServiceInterfaceInstanceBookingRoomDetails {

	@Autowired
	DaoImplementInstanceBooking daoImplementInstanceBooking; 

	@Override
	public int addData(Booking booking) {
		return daoImplementInstanceBooking.addRoomDetails(booking);
	}

}
