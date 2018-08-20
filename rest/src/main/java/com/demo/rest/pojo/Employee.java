package com.demo.rest.pojo;

public class Employee {

	private String empName;
	private int empID;
	private double empSalary;
	
	
	/*public Employee(String empName, double empSalary) {
		super();
		this.empName = empName;
		this.empID = ++ID;
		this.empSalary = empSalary;
	}*/
	
	
	
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public void setEmpSalary(double empSalary) {
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


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", empSalary=" + empSalary + "]";
	}

	
}
