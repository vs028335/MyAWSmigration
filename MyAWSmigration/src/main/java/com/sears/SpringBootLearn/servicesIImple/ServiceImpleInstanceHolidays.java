package com.sears.SpringBootLearn.servicesIImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sears.SpringBootLearn.Pojo.Holiday;
import com.sears.SpringBootLearn.daoImplement.DaoImplementHolidays;
import com.sears.SpringBootLearn.services.ServiceInstanceHolidays;

@Component
public class ServiceImpleInstanceHolidays implements ServiceInstanceHolidays {

	@Autowired
	DaoImplementHolidays daoImplementHolidays;
	
	@Override
	public int holiday(Holiday holiday) {
		return daoImplementHolidays.Addjourney(holiday);
	}
}
