package com.ivanov.springbootmysqlcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ivanov.springbootmysqlcrud.entity.Department;

public interface DepartmentService {
	
	Department saveDepartment(Department department);
	
	List<Department> fetchDepartmentList();
	
	Department updateDepartment(Department department, Long departmentId);
	
	void deleteDepartmentById(Long departmentId);

}
