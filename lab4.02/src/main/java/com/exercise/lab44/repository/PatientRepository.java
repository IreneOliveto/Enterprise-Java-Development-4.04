package com.exercise.lab44.repository;

import com.exercise.lab44.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository <Patient, Integer> {


}
