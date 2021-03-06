package com.trebnikau.dao;

import com.trebnikau.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> employees = session.createQuery("from Employee", Employee.class).getResultList();
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        Session session = sessionFactory.getCurrentSession();
//        Employee employee = session.get(Employee.class, employeeId);
//        session.delete(employee);
        // or
        Query query = session.createQuery("delete from Employee where id = :employeeId");
        query.setParameter("employeeId", employeeId);
        query.executeUpdate();

    }


}
