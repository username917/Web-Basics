package com.fanshawe.SpringBootwithThymeleafExample.Service;

import java.util.List;

import com.fanshawe.SpringBootwithThymeleafExample.model.Employee;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}