package com.sears.DaoInterfaceImplement;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sears.DaoInterface.EmployeeDao;

import com.sears.Employee.Employee;

public class DaoInterfaceImplement implements EmployeeDao {

	static final Logger logger = Logger.getLogger(DaoInterfaceImplement.class);
	
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
		logger.debug("This is the end of setDataSource in which jdbc templete invoke dataSource");
	}

	public void createEmployee(Employee employee) {

		String sql = "insert into EmployeeDetails(id,name,email,gender,salary) values(?,?,?,?,?)";
		int status = jdbcTemplate.update(sql, new Object[] { employee.getId(), employee.getName(), employee.getEmail(),
				employee.getGender(), employee.getSalary() });

		if (status > 0)
			System.out.println("Data stored.................");
		else
			System.out.println("Not Stored in the data base.........");
		
		logger.debug("This is the end of Create method...........");
	}

	public Employee getEmployeeById(int employeeId) {

		String sql = "Select * from EmployeeDetails where id=?";

		Employee employee = jdbcTemplate.queryForObject(sql, new EmployeerowMapper(), employeeId);
		
		logger.debug("This is the end of getEmployeeById.........");
		return employee;
	}

	public void deleteEmployeeById(int EmployeeId) {
		// TODO Auto-generated method stub

		String sql = "delete from EmployeeDetails where id=?";
		int delete = jdbcTemplate.update(sql, EmployeeId);

		if (delete > 0)
			System.out.println("Employee Details deleted");
		else
			System.out.println("Not deleted");

		logger.debug("This is the end of deleteEmployeeById........");
	}

	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		String sql = "update EmployeeDetails set email=? where id=?";
		int udte = jdbcTemplate.update(sql, newEmail, employeeId);
		if (udte > 0)
			System.out.println("The table become update......");
		else
			System.out.println("Not update.......");
		
		logger.debug("This is the end of updateEmployeeById........");
	}

	public List<Employee> getAllEmployeeDetails() {
		String sql = "Select * from EmployeeDetails";
		
		logger.debug("This is the end of getAllemployeeDetails........");
		return jdbcTemplate.query(sql, new EmployeerowMapper());
	}
}
