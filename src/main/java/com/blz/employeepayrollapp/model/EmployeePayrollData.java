package com.blz.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.blz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

@Entity
@Table(name="employee_payroll")
public @Data class EmployeePayrollData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id")
	private int employeeId;
	private String name;
	private long salary;
	private String profileImg;
	private String gender;

	@ElementCollection
	@CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name="id"))
	private List<String> department;
	private LocalDate startDate;
	private String notes;

	public EmployeePayrollData() {
	}

	public EmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		this.updateEmployeePayrollData(empPayrollDTO);
	}

	public void updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO){
		this.name = empPayrollDTO.name;
		this.salary = empPayrollDTO.salary;
		this.profileImg=empPayrollDTO.profileImg;
		this.gender=empPayrollDTO.gender;
		this.department=empPayrollDTO.department;
		this.startDate=empPayrollDTO.startDate;
		this.notes=empPayrollDTO.notes;
	}
}
