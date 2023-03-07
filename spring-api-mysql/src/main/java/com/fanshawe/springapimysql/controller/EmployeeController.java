package com.fanshawe.springapimysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fanshawe.springapimysql.model.Employee;
import com.fanshawe.springapimysql.service.EmployeeService;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/employees", method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
	}
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public List<Employee> readEmployees() {
		return empService.getEmployee();
	}
	
	@RequestMapping(value="employees/{empId}", method=RequestMethod.PUT)
	public Employee readEmployees(@PathVariable(value="empId") Long id, @RequestBody Employee empDetails) {
		return empService.updateEmployee(id, empDetails);
	}
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable(value="empId") Long id) {
		empService.deleteEmployee(id);
	}

}

