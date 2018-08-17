package com.demo.rest.dao;

import java.util.Set;

import com.demo.rest.pojo.Employee;

public interface Dao {

	public void addNewEmployee(Employee emp);
	public Set<Employee> viewAllEmployee();
	public void deleteEmployee(int empId);
}
