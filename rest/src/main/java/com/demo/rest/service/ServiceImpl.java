package com.demo.rest.service;

import java.util.Set;

import com.demo.rest.dao.DaoImpl;
import com.demo.rest.pojo.Employee;


public class ServiceImpl implements Service {
	DaoImpl dao= new DaoImpl();
	
	@Override
	
	public void addNewEmployee(Employee emp) {
		
		dao.addNewEmployee(emp);
	}

	@Override
	public Set<Employee> viewAllEmployee() {

		return dao.viewAllEmployee();
	}

	@Override
	public void deleteEmployee(int empId) {
		
		dao.deleteEmployee(empId);
		
	}

}
