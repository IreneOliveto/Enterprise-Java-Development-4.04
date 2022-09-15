package com.exercise.lab44.service;


import com.exercise.lab44.model.Employee;
import com.exercise.lab44.model.EmployeeStatus;

import java.util.List;

public interface EmployeeService {
    List<Employee> employeeList();
    Employee getEmployeeByEmployeeId(int employeeId);

    List<Employee> getEmployeeByStatus(EmployeeStatus status);

    List<Employee> getEmployeeByDepartment(String department);

    Employee save(Employee employee);

    Employee updateEmployeeStatus(String id, EmployeeStatus status);
    Employee updateEmployeeDepartment(String id, String department);

}
