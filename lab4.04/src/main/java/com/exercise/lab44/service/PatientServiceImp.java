package com.exercise.lab44.service;

import com.exercise.lab44.model.Patient;
import com.exercise.lab44.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PatientServiceImp implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

}
