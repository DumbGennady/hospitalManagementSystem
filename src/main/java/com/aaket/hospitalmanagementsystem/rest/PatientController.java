package com.aaket.hospitalmanagementsystem.rest;

import com.aaket.hospitalmanagementsystem.entity.Patient;
import com.aaket.hospitalmanagementsystem.service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/patient")
@CrossOrigin("http://localhost:8080/")
public class PatientController {

    PatientServiceImpl patientService;
    @Autowired
    PatientController(PatientServiceImpl patientService){
        this.patientService = patientService;
    }

    @PostMapping("/insert")
    Integer insertPatient(@RequestBody Patient patient){
        return patientService.insertPatinet(patient);
    }

    @PostMapping("/list")
    List<Patient> getPatient(@RequestBody Patient patient){
        return patientService.getPatient(patient);
    }

}
