package com.demo.rest.pojo;

public class Employee {

	private String empName;
	private int empID;
	private double empSalary;
	private static int ID=100;
	
	public Employee(String empName, double empSalary) {
		super();
		this.empName = empName;
		this.empID = ++ID;
		this.empSalary = empSalary;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public int getEmpID() {
		return empID;
	}
	public double getEmpSalary() {
		return empSalary;
	}

	
}
