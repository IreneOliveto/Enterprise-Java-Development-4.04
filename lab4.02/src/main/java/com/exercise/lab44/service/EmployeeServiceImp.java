package com.exercise.lab44.service;

import com.exercise.lab44.model.Employee;
import com.exercise.lab44.model.EmployeeStatus;
import com.exercise.lab44.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> employeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByEmployeeId(int employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public List<Employee> getEmployeeByStatus(EmployeeStatus status) {
        return employeeRepository.getEmployeeByEmployeeStatus(status);
    }

    @Override
    public List<Employee> getEmployeeByDepartment(String department) {
        return employeeRepository.getEmployeeByDepartment(department);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployeeStatus(String id, EmployeeStatus status) {
        Employee storedEmployee = getEmployeeByEmployeeId(Integer.parseInt(id));
        storedEmployee.setEmployeeStatus(status);
        return employeeRepository.save(storedEmployee);
    }

    @Override
    public Employee updateEmployeeDepartment(String id, String department) {
        Employee storedEmployee = getEmployeeByEmployeeId(Integer.parseInt(id));
        storedEmployee.setDepartment(department);
        return employeeRepository.save(storedEmployee);
    }



}
