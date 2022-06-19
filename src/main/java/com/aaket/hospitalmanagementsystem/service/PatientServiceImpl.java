package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Appointment;
import com.aaket.hospitalmanagementsystem.entity.Patient;
import com.aaket.hospitalmanagementsystem.mapper.PatientMapper;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    PatientMapper patientMapper;
    PatientServiceImpl(PatientMapper patientMapper){
        this.patientMapper = patientMapper;
    }

    @Override
    public Integer insertPatinet(Patient patient){
        return patientMapper.insertPatient(patient);
    }

    @Override
    public List<Patient> getPatient(Patient patient){
        return patientMapper.getPatient(patient);
    }


}
