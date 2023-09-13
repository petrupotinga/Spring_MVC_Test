package com.potinga.spring.mvc.hibernateTest.aop.service;

import com.potinga.spring.mvc.hibernateTest.aop.dao.EmployeeDAO;
import com.potinga.spring.mvc.hibernateTest.aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {

        employeeDAO.saveEmployee(employee);
    }
}
