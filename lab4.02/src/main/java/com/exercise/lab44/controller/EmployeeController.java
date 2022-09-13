package com.exercise.lab44.controller;

import com.exercise.lab44.model.Employee;
import com.exercise.lab44.model.EmployeeUpdateDepartmentDto;
import com.exercise.lab44.model.EmployeeUpdateStatusDto;
import com.exercise.lab44.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //Create a route to add a new doctor.
    @PostMapping("/employees")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    //Create a route to change a doctor’s status.
    @PatchMapping("/employee/{id}/status")
    public Employee updateStatus(@PathVariable String id, @RequestBody EmployeeUpdateStatusDto storedStatus) {
        return employeeService.updateEmployeeStatus(id, storedStatus.getStatus());
    }

    //Create a route to update a doctor’s department.
    @PatchMapping("/employee/{id}/department")
    public Employee updateDepartment(@PathVariable String id, @RequestBody EmployeeUpdateDepartmentDto storedDepartment) {
        return employeeService.updateEmployeeDepartment(id, storedDepartment.getDepartment());
    }








}
