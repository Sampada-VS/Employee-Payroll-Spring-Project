package com.blz.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import com.blz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

public @Data class EmployeePayrollData {

	private int employeeId;
	private String name;
	private long salary;
	private String profileImg;
	private String gender;
	private List<String> department;
	private LocalDate startDate;
	private String notes;

	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		this.employeeId = empId;
		this.name = empPayrollDTO.name;
		this.salary = empPayrollDTO.salary;
		this.profileImg=empPayrollDTO.profileImg;
		this.gender=empPayrollDTO.gender;
		this.department=empPayrollDTO.department;
		this.startDate=empPayrollDTO.startDate;
		this.notes=empPayrollDTO.notes;
	}

}
