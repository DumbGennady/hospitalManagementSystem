package com.aaket.hospitalmanagementsystem.service;


import com.aaket.hospitalmanagementsystem.entity.Doctor;
import com.aaket.hospitalmanagementsystem.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl {

    DoctorMapper doctorMapper;
    @Autowired
    DoctorServiceImpl(DoctorMapper doctorMapper){
        this.doctorMapper = doctorMapper;
    }

    public Integer insertDoctor(Doctor doctor){
        return doctorMapper.insertDoctor(doctor);
    }
}
