package com.sears.Client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sears.Employee.Employee;
import com.sears.EmployeeServiceInterfaceImple.EmployeeServiceInterfaceImple;

public class Application {
	
   static  Employee employee;
	

	public static Employee getEmployee() {
	return employee;
}


public static void setEmployee(Employee employee) {
	Application.employee = employee;
}


	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeServiceInterfaceImple empl = (EmployeeServiceInterfaceImple) context.getBean("employeeservice");

		
		  employee.setId(10); 
		  employee.setName("Vishal");
		  employee.setEmail("vs028335@gmail.com"); 
		  employee.setGender("Male");
		  employee.setSalary(23000);
		  
		  empl.addEmployee(employee);
		 

		Employee emp = empl.fetchEmployeeById(2);

		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getEmail() + " " + emp.getGender() + " "
				+ emp.getSalary());
		
		fetchAllEmployeeInfo(empl);
		
		updateEmployeeDetailsById(empl);
		
		deleteEmployeeDetailsById(empl);
		
		
	}


	private static void deleteEmployeeDetailsById(EmployeeServiceInterfaceImple empl) {
		empl.deleteEmployeeById(1);
	}


	private static void updateEmployeeDetailsById(EmployeeServiceInterfaceImple empl) {
		empl.updateEmployeeEmailById("va028335@gmail.com",2);
	}


	private static void fetchAllEmployeeInfo(EmployeeServiceInterfaceImple empl) {
		List<Employee> emp= empl.getAllEmployeeInfo();
		for (Employee employee : emp) {
			
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getEmail() + " " + employee.getGender() + " "
					+ employee.getSalary());
		}
	}

}
