package com.trebnikau.dao;

import com.trebnikau.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
}
