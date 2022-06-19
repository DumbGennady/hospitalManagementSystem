package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Appointment;

import java.sql.Date;
import java.util.List;

public interface AppointmentService {

    Integer insertAppointment(Appointment appointment);

    List<Appointment> getAppointment(Integer patientId, Integer doctorId, Integer AppointmentId, Date date);
}
