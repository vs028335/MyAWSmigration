package com.InsertMultipleData.InsertMultipleDataIntoDatabase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.InsertMultipleData.EmployeeInterfaceImplementation.EmployeeInterfaceImplementation;
import com.InsertMultipleData.EmployeePojo.Employee;

public class Application 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	EmployeeInterfaceImplementation emfeImpl=(EmployeeInterfaceImplementation)context.getBean("employeeDao");
    
    	Employee employee1=new Employee(1,"Vishal",22);
    	Employee employee2=new Employee(2,"Anamika",22);
    	Employee employee3=new Employee(3,"Aman",22);
    	
    	List<Employee> employeesList=new ArrayList<Employee>();
    	employeesList.add(employee1);
    	employeesList.add(employee2);
    	employeesList.add(employee3);
    	
    	
    	emfeImpl.insertEmployeeRecord(employeesList);
    }
}
