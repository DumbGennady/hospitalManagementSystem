package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Appointment;
import com.aaket.hospitalmanagementsystem.entity.Patient;
import com.aaket.hospitalmanagementsystem.mapper.PatientMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

public interface PatientService {

    Integer insertPatinet(Patient patient);

    List<Patient> getPatient(Patient patient);

}
