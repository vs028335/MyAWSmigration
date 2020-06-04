package com.sears.DaoInterfaceImplement;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import com.sears.Employee.Employee;

public class EmployeerowMapper implements RowMapper<Employee> {
	
	static final Logger logger = Logger.getLogger(EmployeerowMapper.class);
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("name"));
		employee.setEmail(rs.getString("email"));
		employee.setGender(rs.getString("gender"));
		employee.setId(rs.getInt("salary"));

		logger.debug("This is the end of mapRow method........");
		return employee;
	}

}
