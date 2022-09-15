package com.exercise.lab44.controller;

import com.exercise.lab44.model.Patient;
import com.exercise.lab44.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    //Create a route to add a new patient.
    @PostMapping("/patient")
    public Patient create(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    //Create a route to update patient’s information
    // (the user should be able to update any patient information through this route).
    @PutMapping("/patient")
    public Patient update(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

}
