package com.potinga.spring.mvc.hibernateTest.aop.dao;

import com.potinga.spring.mvc.hibernateTest.aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EployeeDaoImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee",
                Employee.class).getResultList();
        return allEmployees;
    }
}
