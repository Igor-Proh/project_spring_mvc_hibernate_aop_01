package com.prokhnov.spring.mvc_hb_aop.dao;

import com.prokhnov.spring.mvc_hb_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
