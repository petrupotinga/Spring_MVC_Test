package com.potinga.spring.mvc.hibernateTest.aop.service;

import com.potinga.spring.mvc.hibernateTest.aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);
}
