package com.aaket.hospitalmanagementsystem.mapper;

import com.aaket.hospitalmanagementsystem.entity.Appointment;
import com.aaket.hospitalmanagementsystem.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

@Mapper
public interface PatientMapper {
    Integer insertPatient(@Param("patient")Patient patient);
    List<Patient> getPatient(@Param("patient") Patient patient);
}
