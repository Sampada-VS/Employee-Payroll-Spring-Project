package com.blz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;

public @ToString class EmployeePayrollDTO {
	@Pattern(regexp="^[A-Z][a-z]{2,}$", message="Invalid name")
	public String name;
	@Min(value=300000,message="Salary should be more than 300000")
	@Max(value=500000,message="Salary should be less than 500000")
	public long salary;

	public String profileImg;

	public String gender;

	public List<String> department;

	@JsonFormat(pattern = "dd MMM yyyy")
	public LocalDate startDate;

	public String notes;

}
