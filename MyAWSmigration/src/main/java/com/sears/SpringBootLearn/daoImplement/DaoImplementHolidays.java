package com.sears.SpringBootLearn.daoImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sears.SpringBootLearn.Pojo.Holiday;
import com.sears.SpringBootLearn.daoInterface.DaoInterfaceHolidays;

@Component
public class DaoImplementHolidays implements DaoInterfaceHolidays {

	@Autowired
	JdbcTemplate jdbcTemplete;
	
	@Autowired
	Holiday holiday;
	
	@Override 
	public int Addjourney(Holiday holiday) {
		
		String sql="insert into holiday(idholiday,from,to) values(?,?,?)";
		int status=jdbcTemplete.update(sql, new Object[] {"",holiday.getFrom(),holiday.getTo()});
		return status;
	}

}
