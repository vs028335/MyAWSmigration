package com.InsertMultipleData.EmployeeInterfaceImplementation;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.InsertMultipleData.EmployeeInterface.EmployeeStructure;
import com.InsertMultipleData.EmployeePojo.Employee;

public class EmployeeInterfaceImplementation implements EmployeeStructure {

	JdbcTemplate jdbcTemplate;
	DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

	public void insertEmployeeRecord(List<Employee> employeeList) {
		
		String sql="insert into EmployeeTable values(?,?,?)";
		
		List<Object[]> batchArgsList=new ArrayList<Object[]>();
		
		for(Employee employee:employeeList)
		{
			Object[] objectsArray= {
				employee.getId(),employee.getName(),employee.getAge()				
			};
			
			batchArgsList.add(objectsArray);
		}	
		
		jdbcTemplate.batchUpdate(sql, batchArgsList);
	}

}
