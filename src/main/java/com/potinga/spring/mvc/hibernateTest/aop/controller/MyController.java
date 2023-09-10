package com.potinga.spring.mvc.hibernateTest.aop.controller;

import com.potinga.spring.mvc.hibernateTest.aop.dao.EmployeeDAO;
import com.potinga.spring.mvc.hibernateTest.aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;
    @RequestMapping("/")
    public String showAllEmplouees(Model model){
       List<Employee>allEmployees = employeeDAO.getAllEmployee();
       model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }
}
