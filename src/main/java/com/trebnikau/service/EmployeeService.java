package com.trebnikau.service;

import com.trebnikau.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployee(int employeeID);
}
