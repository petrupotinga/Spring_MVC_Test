package com.potinga.spring.mvc.hibernateTest.aop.dao;

import com.potinga.spring.mvc.hibernateTest.aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

   public void saveEmployee(Employee employee);
}
