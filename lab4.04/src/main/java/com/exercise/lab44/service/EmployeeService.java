package com.exercise.lab44.service;


import com.exercise.lab44.model.Employee;
import com.exercise.lab44.model.EmployeeUpdateDepartmentDto;
import com.exercise.lab44.model.EmployeeUpdateStatusDto;
import com.exercise.lab44.model.Status;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeByEmployeeId(int employeeId);

    Employee save(Employee employee);

    Employee updateEmployeeStatus(String id, EmployeeUpdateStatusDto status);
    Employee updateEmployeeDepartment(String id, EmployeeUpdateDepartmentDto department);

}
