package com.exercise.lab44.service;

import com.exercise.lab44.model.Patient;

import java.util.Date;
import java.util.List;

public interface PatientService {

    List<Patient> patientList();

    Patient getPatientById(int patientId);

    Patient save(Patient patient);
}
