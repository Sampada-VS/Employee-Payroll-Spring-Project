package com.blz.employeepayrollapp.services;

import java.util.List;

import com.blz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.blz.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);

	void deleteEmployeePayrollData(int empId);
}
