package com.exercise.lab44.repository;

import com.exercise.lab44.model.Employee;
import com.exercise.lab44.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
