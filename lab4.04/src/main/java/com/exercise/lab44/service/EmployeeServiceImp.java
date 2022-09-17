package com.exercise.lab44.service;

import com.exercise.lab44.model.Employee;
import com.exercise.lab44.model.EmployeeUpdateDepartmentDto;
import com.exercise.lab44.model.EmployeeUpdateStatusDto;
import com.exercise.lab44.model.Status;
import com.exercise.lab44.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeByEmployeeId(int employeeId) {
        return employeeRepository.findById(employeeId).get();
    }
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployeeStatus(String id, EmployeeUpdateStatusDto storedStatus) {
        Employee storedEmployee = getEmployeeByEmployeeId(Integer.parseInt(id));
        storedEmployee.setStatus(storedStatus.getStatus());
        return employeeRepository.save(storedEmployee);
    }

    @Override
    public Employee updateEmployeeDepartment(String id, EmployeeUpdateDepartmentDto storedDepartment) {
        Employee storedEmployee = getEmployeeByEmployeeId(Integer.parseInt(id));
        storedEmployee.setDepartment(storedDepartment.getDepartment());
        return employeeRepository.save(storedEmployee);
    }



}
