package com.fanshawe.SpringBootwithThymeleafExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fanshawe.SpringBootwithThymeleafExample.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
 
}
