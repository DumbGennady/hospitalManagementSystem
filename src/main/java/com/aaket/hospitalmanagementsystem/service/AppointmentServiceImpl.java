package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Appointment;
import com.aaket.hospitalmanagementsystem.mapper.AppointmentMapper;
import com.aaket.hospitalmanagementsystem.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    AppointmentMapper appointmentMapper;
    @Autowired
    AppointmentServiceImpl (AppointmentMapper appointmentMapper){
        this.appointmentMapper = appointmentMapper;
    }

    @Override
    public Integer insertAppointment(Appointment appointment){
        return appointmentMapper.insertAppointment(appointment);
    }

    @Override
    public List<Appointment> getAppointment(Integer patientId, Integer doctorId,Integer appointmentId, Date date){
        return appointmentMapper.getAppointment(patientId, doctorId, appointmentId, date);
    }
}
