package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Doctor;

import javax.print.Doc;
import java.util.List;

public interface DoctorService {

    Integer insertDoctor(Doctor doctor);

    List<Doctor> getDoctor();
}
