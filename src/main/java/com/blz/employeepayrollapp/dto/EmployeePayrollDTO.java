package com.blz.employeepayrollapp.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {
	@Pattern(regexp="^[A-Z][a-z]{2,}$", message="Invalid name")
	public String name;
	@Min(value=300000,message="Salary should be more than 300000")
	@Max(value=500000,message="Salary should be less than 500000")
	public long salary;

	public EmployeePayrollDTO(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Name : " + name + ", Salary : " + salary;
	}
}
