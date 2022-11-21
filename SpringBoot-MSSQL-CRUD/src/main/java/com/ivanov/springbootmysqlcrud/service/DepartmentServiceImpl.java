package com.ivanov.springbootmysqlcrud.service;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.ivanov.springbootmysqlcrud.entity.Department;
import com.ivanov.springbootmysqlcrud.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	private DepartmentRepository departmentRepo;

	// save operation
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepo.save(department);
	}

	// read operation
	@Override
	public List<Department> fetchDepartmentList() {
		return (List<Department>) departmentRepo.findAll();
		
		
		
		
	}

	//update operation
	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		
		// first, find by the id of the department
		Department depDB = departmentRepo.findById(departmentId).get();
		
		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
		}
		
		if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDB.setDepartmentCode(department.getDepartmentCode());
		}
		
		return departmentRepo.save(depDB);
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		
		departmentRepo.deleteById(departmentId);
		
	}

}
