package com.ivanov.springbootmysqlcrud.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivanov.springbootmysqlcrud.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
