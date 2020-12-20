package com.blz.employeepayrollapp.dto;

public class EmployeePayrollDTO {
	
	private String name;
	private long salary;

	public EmployeePayrollDTO(String name,long salary) {
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "Name : "+name+", Salary : "+salary;
	}
}
