package com.demo.rest.dao;

import java.util.LinkedHashSet;
import java.util.Set;

import com.demo.rest.pojo.Employee;

public class DaoImpl implements Dao {

	Set<Employee> set=new LinkedHashSet<>();
	@Override
	public void addNewEmployee(Employee emp) {
		set.add(emp);
	}

	@Override
	public Set<Employee> viewAllEmployee() {

		return set;
	}

	@Override
	public void deleteEmployee(int empId) {
		
		for(Employee emp:set)
		{
			if(emp.getEmpID()==empId)
			{
				System.out.println("employee Id "+empId);
				set.remove(emp);
				break;
			}	
		}
		
	}

	public void updateEmployee(Employee emp) {
		
		for(Employee employee:set)
		{
			if(emp.getEmpID()==employee.getEmpID())
			{
				set.remove(employee);
				set.add(emp);
			}	
		}
	}

}
