package com.sears.EmployeeServiceInterfaceImple;

import java.util.List;

import com.sears.DaoInterface.EmployeeDao;
import com.sears.Employee.Employee;
import com.sears.EmployeeServiceInterface.EmployeeServiceInterface;

public class EmployeeServiceInterfaceImple implements EmployeeServiceInterface {

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.createEmployee(employee);
	}

	public Employee fetchEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(employeeId);
	}

	public void deleteEmployeeById(int EmployeeId) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployeeById(EmployeeId);
		
	}

	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployeeEmailById(newEmail, employeeId);
	}

	public List<Employee> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployeeDetails();
	}

}
