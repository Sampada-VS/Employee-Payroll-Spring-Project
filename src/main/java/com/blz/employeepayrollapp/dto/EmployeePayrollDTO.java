package com.blz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;

public @ToString class EmployeePayrollDTO {
	@Pattern(regexp="^[A-Z][a-z]{2,}$", message="Invalid name")
	public String name;
	@Min(value=300000,message="Salary should be more than 300000")
	@Max(value=500000,message="Salary should be less than 500000")
	public long salary;

	@NotBlank(message = "Profile Image cannot be empty")
	public String profileImg;

	@Pattern(regexp="Male|Female", message="Gender should be Male or Female")
	public String gender;

	@NotNull(message = "Department should not be empty")
	public List<String> department;

	@NotNull(message = "Department should not be empty")
	@PastOrPresent(message = "Start date should be past or today's date")
	@JsonFormat(pattern = "dd MMM yyyy")
	public LocalDate startDate;

	@NotBlank(message = "Notes cannot be empty")
	public String notes;

}
