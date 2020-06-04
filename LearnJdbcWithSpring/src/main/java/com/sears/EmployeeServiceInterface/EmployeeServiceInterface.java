package com.sears.EmployeeServiceInterface;

import java.util.List;

import com.sears.Employee.Employee;

public interface EmployeeServiceInterface {
	public void addEmployee(Employee employee);
	public Employee fetchEmployeeById(int employeeId);
	public void deleteEmployeeById(int EmployeeId);
	public void updateEmployeeEmailById(String newEmail,int employeeId);
	public List<Employee> getAllEmployeeInfo();

}
