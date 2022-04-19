package com.prokhnov.spring.mvc_hb_aop.service;

import com.prokhnov.spring.mvc_hb_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
