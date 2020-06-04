package com.sears.DaoInterface;

import java.util.List;
import com.sears.Employee.Employee;


public interface EmployeeDao {
	
	public void createEmployee(Employee employee);
	public Employee getEmployeeById(int employeeId);
	public void deleteEmployeeById(int EmployeeId);
	public void updateEmployeeEmailById(String newEmail,int employeeId);
	public List<Employee> getAllEmployeeDetails();
}
