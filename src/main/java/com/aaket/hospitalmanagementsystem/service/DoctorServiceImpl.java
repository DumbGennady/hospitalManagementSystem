package com.aaket.hospitalmanagementsystem.service;


import com.aaket.hospitalmanagementsystem.entity.Doctor;
import com.aaket.hospitalmanagementsystem.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{

    DoctorMapper doctorMapper;
    @Autowired
    DoctorServiceImpl(DoctorMapper doctorMapper){
        this.doctorMapper = doctorMapper;
    }

    @Override
    public Integer insertDoctor(Doctor doctor){
        return doctorMapper.insertDoctor(doctor);
    }

    @Override
    public List<Doctor> getDoctor(){
        return doctorMapper.getDoctor();
    }

}
