package com.twilio.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.demo.Model.Employee;
import com.twilio.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	// CREATE
	
	public Employee createEmployee(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	// READ
	
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}
	
	// DELETE
	
	public void deleteEmployee(Long empId) {
		employeeRepo.deleteById(empId);
	}
	
	// UODATE
	
	public Employee updateEmployee(Long empId, Employee empDetails) {
		Employee emp = employeeRepo.findById(empId).get();
		emp.setFirstName(empDetails.getFirstName());
		emp.setLastName(empDetails.getLastName());
		emp.setEmailId(empDetails.getEmailId());
		
		return employeeRepo.save(emp);
	}

}
