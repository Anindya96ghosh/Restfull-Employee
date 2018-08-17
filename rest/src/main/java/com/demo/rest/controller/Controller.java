package com.demo.rest.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.pojo.Employee;
import com.demo.rest.service.ServiceImpl;

@RestController
public class Controller {

	ServiceImpl serviceImpl=new ServiceImpl();
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addNewEmployee(String empName,double empSalary) {
		Employee emp=new Employee(empName, empSalary);
		serviceImpl.addNewEmployee(emp);
	}

	@RequestMapping(value="/view", method=RequestMethod.GET)
	public Set<Employee> viewAllEmployee() {

		return serviceImpl.viewAllEmployee();
	}
	
//	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
//	public void deleteEmployee(int empId) {
//
//		 serviceImpl.deleteEmployee(empId);
//	}
}
